package Lesson2;

public class ArrEx {

    public static void main(String[] args) {
        String[][] arr = new String[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.toString(i * j);
            }
        }
        try {
            int sum = sumArray4x4(arr);
            System.out.println("Sum = " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Incorrect array dimension ");
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Incorrect data at [%d][%d]", e.i, e.j));
        }
    }

    static int sumArray4x4(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] inner : arr) {
            if (inner.length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    static class MyArraySizeException extends RuntimeException {
    }

    static class MyArrayDataException extends RuntimeException {

        int i, j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;
        }

    }

}
