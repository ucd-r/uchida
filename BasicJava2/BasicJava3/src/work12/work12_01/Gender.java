package work12.work12_01;

public enum Gender {
	  /** 男性 */ MALE("男性"),
	  /** 女性 */ FEMALE("女性"),
	  /** 不明 */ UNKNOWN("不明");
	  private final String displayName;
	  Gender(String displayName) {
	    this.displayName = displayName;
	  }
	  public static Gender getValue (String value) {
	    switch (value) {
	      case "男性":  return MALE;
	      case "女性":  return FEMALE;
	      default:      return UNKNOWN;
	    }
	  }
	  public String displayName() {
	    return displayName;
	  }
	  @Override
	  public String toString() {
	    return displayName;
	  }
	}

