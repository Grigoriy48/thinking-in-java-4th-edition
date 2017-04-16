/*
Совмещение имен во время вызова метода
Во многих языках метод f создал бы свою Email внутри своей области действия
*/
class Email{
	float count;
}

public class Task3{
	static void change(Email e){
		e.count = 0.6f;
	}
	public static void main(String[] args){
		Email mail = new Email();
		mail.count = 0.5f;
		System.out.println("count = " + mail.count);
		change(mail);
		System.out.println("count = " + mail.count);
	}
}