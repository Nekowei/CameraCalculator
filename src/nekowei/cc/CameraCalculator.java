package nekowei.cc;

public class CameraCalculator {

	public static double cmos_width = 23.7;
	public static double focus_length = 50;
	
	public static double caculate(double focus_length) {
		return caculate(focus_length, cmos_width);
	}
	
	public static double caculate(double focus_length, double cmos_width) {
		return Math.atan(cmos_width / (focus_length * 2)) / Math.PI * 180 * 2;
	}
	
	public static void main(String[] args) {
		double result = Math.atan(cmos_width / (focus_length * 2)) / Math.PI * 180 * 2;
		System.out.println(result);
		System.out.println(Math.atan(1) / Math.PI * 180);
		
	}
}
