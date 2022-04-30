package com.youngblue.flowershop.authority;

import lombok.Getter;

public enum Authorities {

    GUEST("비회원", true),
    USER("유저", true),
    ADMIN("어드민", true);

    private String description;
    private boolean use;

    Authorities(String description, boolean use) {
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
