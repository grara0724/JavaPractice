

public class UseBook2 {
	public static void main(String[] args) {

		Book2[] book = { new Book2("TCP/IP入門", "吉田茂", 2200), new Book2("XMLのすべて", "高橋茉奈", 1800),
				new Book2("話せる英文法", "落合一馬", 1500) };

		book[1].showBook();

		for (Book2 b : book) { //拡張for文 for(配列から取り出した要素の型　取りだした要素の変数名 : 配列変数名(今回の場合だとbookという配列を順番に取り出してbという変数に順番に第十))
			b.showBook(); //b.=book(1),book(2),book(3)
		}

	}
}