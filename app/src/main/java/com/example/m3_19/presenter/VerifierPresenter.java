package com.example.m3_19.presenter;

import com.example.m3_19.model.Verifier;

public class VerifierPresenter implements IPresenter {
    private Verifier verifier;
    private IViewPresenter view;

    public VerifierPresenter(IViewPresenter view) {
        this.view = view;
        verifier = new Verifier();
    }

    @Override
    public void evaluatePass(String password) {
        int res = verifier.evaluatePass(password);
        switch (res){
            case Verifier.WEAT:
                this.view.showWeak();
                break;
            case Verifier.MEDIUM:
                this.view.showMedium();
                break;
            case Verifier.STRONG:
                this.view.showStrong();
                break;
        }
    }
}
