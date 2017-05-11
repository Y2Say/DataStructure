package quene;

public class ArrayQuene {
	public static Squene merged(Squene q1, Squene q2) {
		Squene newQuene = new Squene();
		while (!q1.isEmpty() && !q2.isEmpty()) {
			newQuene.enquene(q1.dequene());
			newQuene.enquene(q2.dequene());
		}
		while (!q1.isEmpty()) {
			newQuene.enquene(q1.dequene());
		}
		while (!q2.isEmpty()) {
			newQuene.enquene(q2.dequene());
		}
		return newQuene;
	}
}
