package api;

public class explorandoStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("ACO");
		sb.append(",").append("Maria");
		sb.append(",").append("Gabriela");
		
		// É mutável
//		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1,3));
		System.out.println(sb.toString());
	}

}
