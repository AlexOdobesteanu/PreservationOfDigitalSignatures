package com.serviceltp.web.responseTypes;

public enum PreservationStorageModel {
    WITH_STORAGE("WithStorage"),
    WITH_TEMPORARY_STORAGE("WithTemporaryStorage"),
    WITHOUT_STORAGE("WithoutStorage");

    private final String value;

    PreservationStorageModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Optional: You can provide a method to convert a string to the corresponding enum constant
    public static PreservationStorageModel fromValue(String value) {
        for (PreservationStorageModel model : values()) {
            if (model.value.equalsIgnoreCase(value)) {
                return model;
            }
        }
        throw new IllegalArgumentException("Invalid PreservationStorageModel value: " + value);
    }
}
