Feature: Dodawanie nowego adresu
  Scenario Outline: Dodawanie nowego adresu, sprawdzanie poprawności wprowadzanych danych.
    Given Użytkownik znajduje sie na stronie glownej
    When Użytkownik wybiera opcje zaloguj sie
    And Użytkownik wpisuje poprawne dane email i hasło, potwierdza wciskujac przycisk logowania
    And Użytkownik klika w pole Address na stronie MyAccountPage
    And Użytkownik klika w pole New address na stronie NewAddressPage
    And Użytkownik wypełnia formularz danymi "<alias>","<address>","<city>","<zipPost>",country,"<phone>"
    Then Użytkownik zostaje przeniesiony na strone z nowym adresem i sprawdza poprawność danych
    And Uzytkownik kasuje dodany adres
    And Zamykanie przeglądarki
    Examples:
      |alias  |address    |city |zipPost|phone    |
      |Test   | Walowa 23 |Bytom|42-608 |123456789|
