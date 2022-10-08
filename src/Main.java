public class Main {
    public static void main(String[] args) {
    // 장재훈 작성
        for(int j = 1; j <=9; j++){
            System.out.println();
            for(int i = 1; i <=9; i++){
                System.out.print(String.format("%d x %d = %d"+"      ", i, j, i * j));
            }
        }

    }
}