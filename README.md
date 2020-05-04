# Web Driver Basic
## Opis
Projekt wykorzystując cucumber-java, cucumber-junit oraz selenium pozwala na zapoznanie się z podstawami automatyzacji testów funkcjonalnych.
Dzięki wykorzystaniu podejścia BDD określone scenariusze są wykonywane automatycznie, zgodnie z tym, jak zostały zaimplementowane poszczególne kroki.
## Instalacja
- Java: https://www.oracle.com/java/technologies/javase-downloads.html
- Intellij: https://www.jetbrains.com/idea/

## Pobranie programu
W folderze z Twoimi projektami w terminalu (Intellij) bądź konsoli wykonaj
>`git clone https://github.com/krzysztofmichalaksda/`

Lub
>Kliknij zielony przycisk powyżej Clon or Download i wybierz Donwload ZIP - wtedy na Twój komputer zostanie pobrana paczka *.zip z kodem programu, który należy wypakować i otowrzyć w Intellij.

## Uruchomienie testów
### Z poziomu Intellij - Cucumber
1. Otwórz do podglądu wybrany plik `*.feature` z folderu `src/test/feature/`
2. Kliknij prawym przyciskiem na wybranym
3. Z listy rozwijanej wybierz "Run 'Scenario: ..."
> Na dole ekranu powinno otworzyć się okno 4: Run wraz z podglądem wykonywania się testu.
### Z poziomu Intellij - TestRunner
1. `TestRunner.java` zlokalizowany jest folderze `src/java/`
2. Z głównego manu wybierz `Build > Build Project`
3. Następnie ponownie z głównego menu wybierz `Run > Run...` i wybrać z list `TestRunner`
### Z poziomu konsoli - Maven Test
1. Otwórz konsolę w lokalizacji naszego projektu
2. Wykonaj `mvn test`
> Ważne, aby mvn był rozpoznawany w waszym systemie. Jeśli nie jest, należy dodać ścieżkę `{TwojaLokalizacjaMaven}\maven\lib\maven3\bin` do PATH (w analogiczny sposób jak to wykonaliście dla Java).
