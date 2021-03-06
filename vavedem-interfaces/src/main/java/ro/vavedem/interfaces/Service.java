package ro.vavedem.interfaces;



import ro.vavedem.exceptions.VaVedemApiException;

import javax.transaction.NotSupportedException;
import java.util.List;

public interface Service<T> {

    T findOne(Long id) throws VaVedemApiException;

    List<T> findAll() throws VaVedemApiException;

    T save(T model) throws VaVedemApiException;

    void delete(T model) throws NotSupportedException;

    List<T> findByNume(String nume) throws NotSupportedException;
}
