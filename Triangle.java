class Triangle{
static void checkTriangle(int x, int y, int z)
{
	if (x == y && y == z )
		System.out.println("Equilateral Triangle");
	else if (x == y || y == z || z == x )
		System.out.println("Isosceles Triangle");
	else
		System.out.println("Scalene Triangle");
}
public static void main(String[] args)
{
	int x = 8, y = 7, z = 9;
	checkTriangle(x, y, z);
}
}