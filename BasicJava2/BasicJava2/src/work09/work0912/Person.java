package work09.work0912;

public class Person {

	private String firstName, familyName;

	public Person(String firstName,String familyName) {
		this.familyName = familyName;
		this.firstName = firstName;
	}

	/*	@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((familyName == null) ? 0 : familyName.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Person)) {
				return false;
			}
			Person other = (Person) obj;
			if (familyName == null) {
				if (other.familyName != null) {
					return false;
				}
			} else if (!familyName.equals(other.familyName)) {
				return false;
			}
			if (firstName == null) {
				if (other.firstName != null) {
					return false;
				}
			} else if (!firstName.equals(other.firstName)) {
				return false;
			}
			return true;
		}*/




}
