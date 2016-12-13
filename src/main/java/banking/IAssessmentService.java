package banking;

import java.net.ConnectException;

public interface IAssessmentService {
    long getCredit(String socialSecurityNumber) throws ConnectException;

    class AssessmentService implements IAssessmentService {

        public long getCredit(String socialSecurityNumber) throws ConnectException {
            long value = (long) (Math.random() * 10000L);
            try {
                Thread.sleep(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Math.random() > 0.66) {
                throw new ConnectException();
            }
            return value;
        }

    }

}
