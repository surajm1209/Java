package com.java.Oops;

class Programmer2 {		
    String getName(){
        return "Suraj Mishra";
    }
}

class JavaProgram extends Programmer2{
    String getProgrammingLanguage(){
        return "Java";
    }
}

class PythonProgram extends Programmer2{
    String getProgrammingLanguage(){
        return "Python";
    }
}

class DotnetProgram extends Programmer2{
    String getProgrammingLanguage(){
        return ".NET";
    }
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		JavaProgram jp = new JavaProgram();
		System.out.println(" I am "+jp.getName()+" and I can write programe in "+ jp.getProgrammingLanguage());

		PythonProgram pp = new PythonProgram();
		System.out.println(" I am "+pp.getName()+" and I can write programe in "+ pp.getProgrammingLanguage());

		DotnetProgram dp = new DotnetProgram();
		System.out.println(" I am "+dp.getName()+" and I can write programe in "+ dp.getProgrammingLanguage());

	}

}
