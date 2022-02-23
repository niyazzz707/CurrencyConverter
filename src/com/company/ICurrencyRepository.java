package com.company;

public interface ICurrencyRepository {
    void usd_rub(float amount);
    void usd_kzt(float amount);
    void usd_eur(float amount);
    void eur_kzt(float amount);
    void eur_rub(float amount);
    void rub_kzt(float amount);

}
