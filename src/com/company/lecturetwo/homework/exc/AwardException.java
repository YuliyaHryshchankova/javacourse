package com.company.lecturetwo.homework.exc;

public class AwardException extends Exception {

    /**
     * @param message
     */
    public AwardException(String message) {
        super(message);
    }

    public AwardException() {
    }

    public AwardException(String message, Throwable cause) {
        super(message, cause);
    }

    public AwardException(Throwable cause) {
        super(cause);
    }

    public AwardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}