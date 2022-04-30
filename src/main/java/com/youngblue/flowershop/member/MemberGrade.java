package com.youngblue.flowershop.member;

public enum MemberGrade {

    FAMILY("패밀리", true),
    BRONZE("브론즈", true),
    SILVER("실버", true),
    GOLD("골드", true),
    DIAMOND("다이아몬드", true),
    PLATINUM("플래티넘", true);

    private String description;
    private boolean use;

    MemberGrade(String description, boolean use) {
        this.description = description;
        this.use = use;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUse() {
        return use;
    }
}
