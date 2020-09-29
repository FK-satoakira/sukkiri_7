package practice;
public class Main {
    public static void main(String[] args)
    throws Exception {
        System.out.println("計算を開始します。");
        /* : */     // この間に計算処理を行う
        System.out.println("計算完了。結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
            "c:\\windows\\system32\\notepad.exe",   /* メモ帳の実行ファイル */
            "C:\\Users\\rsc07\\Desktop\\programming\\sukkiri_java\\code-sjavap2-2\\code-sjavap2\\lists\\chap07\\list07-02\\test.txt"
        );
        pb.start();     /* 起動！ */
    }
}

//notepad.exeはメモ帳の実行ファイル。要するに多分、第一引数は「メモ帳作れ」ってことだろう。
//第二引数はどこに作るか。既存ならそれが出る。