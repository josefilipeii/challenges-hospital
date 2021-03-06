package com.edgelab.behave.drug;

import com.edgelab.domain.DrugsEnum;
import com.edgelab.domain.Patient;
import com.edgelab.domain.StatusEnum;

import java.util.Optional;

public class Aspirin implements Drug {


    private static final Aspirin INSTANCE = new Aspirin();

    private Aspirin() {
    }

    public static Aspirin getInstance() {
        return INSTANCE;
    }

    public Optional<StatusEnum> newStatus(final Patient patient) {
        if (StatusEnum.F == patient.getStatus()) {
            return Optional.of(StatusEnum.H);
        }
        return Optional.empty();

    }

    public DrugsEnum code() {
        return DrugsEnum.As;
    }


}
