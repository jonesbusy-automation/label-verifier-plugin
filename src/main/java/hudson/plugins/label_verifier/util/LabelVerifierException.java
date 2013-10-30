/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hudson.plugins.label_verifier.util;

import hudson.plugins.label_verifier.LabelVerifier;
import hudson.plugins.label_verifier.Messages;
import java.io.IOException;

/**
 * A label verification exception.
 * This class should contain description of validation errors.
 * @author Oleg Nenashev <nenashev@synopsys.com>, Synopsys Inc.
 * @since 1.1
 */
//TODO: Support of logic traces
public class LabelVerifierException extends IOException {

    public LabelVerifierException(String message) {
        super(message);
    }

    public LabelVerifierException(Throwable cause) {
        super(cause);
    }

    public LabelVerifierException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public static void evaluationError (LabelVerifier verifier) 
            throws LabelVerifierException {
        throw new LabelVerifierException
            (Messages.logic_shared_evalFailureMessage(
                verifier.getDescriptor().getDisplayName()));
    }
}
