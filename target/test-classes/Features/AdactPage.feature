Feature: Verifying Adactin Details

  Scenario Outline: Verifying adactin login with credentials
    Given User is on the Adadctin page
    When User should enter "<username>" and "<password>"
    When User should click login button
    When Search Hotel"<Location>","<Hotels>","<RoomType>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    When User should click search button
    When Select and Click continue
    When Book Hotel"<First Name>","<Last Name>","<Billing Address>","<CCNum>","<CCType>","<SelectMonth>","<SelectYear>","<CVVNum>"
    When User should click Booknow
    Then User should verify success message

    Examples: 
      | username   | password   | Location    | Hotels         | RoomType     | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address   | CCNum            | CCType | SelectMonth | SelectYear | CVVNum |
      | Albertgill | Albert@123 | Sydney      | Hotel Creek    | Standard     | 2 - Two         | 13/09/2021    | 21/09/2021     | 2 - Two         | 0 - None          | Albert     | Gill      | Pudukkottai       | 5648962547563215 | VISA   | January     |       2022 |    533 |
      | Albertgill | Albert@123 | Melbourne   | Hotel Creek    | Standard     | 3 - Three       | 14/09/2021    | 22/09/2021     | 2 - Two         | 0 - None          | Sive       | Raja      | Pudukkottai       | 2245446547896324 | VISA   | February    |       2022 |    522 |
      | Albertgill | Albert@123 | Brisbane    | Hotel Sunshine | Double       | 4 - Four        | 15/09/2021    | 23/09/2021     | 2 - Two         | 1 - One           | Arul       | Manoj     | Pudukkotai        | 4569874123589634 | American Express   | March       |       2022 |    511 |
      | Albertgill | Albert@123 | Adelaide    | Hotel Sunshine | Double       | 5 - Five        | 16/09/2021    | 24/09/2021     | 3 - Three       | 1 - One           | Arul       | Dinesh    | Australia         | 4896753158964752 | American Express   | April       |       2022 |    544 |
      | Albertgill | Albert@123 | London      | Hotel Hervey   | Double       | 6 - Six         | 17/09/2021    | 25/09/2021     | 3 - Three       | 2 - Two           | Labert     | Arun      | Singapore         | 4569875214569846 | Master Card   | May         |       2022 |    555 |
      | Albertgill | Albert@123 | New York    | Hotel Hervey   | Double       | 7 - Seven       | 18/09/2021    | 26/09/2021     | 3 - Three       | 2 - Two           | Melvin     | Joe       | Trichy            | 2569741385496318 | Master Card   | June        |       2022 |    566 |
      | Albertgill | Albert@123 | Los Angeles | Hotel Cornice  | Super Deluxe | 8 - Eight       | 19/09/2021    | 27/09/2021     | 4 - Four        | 3 - Three         | Tejaswin   | joe       | Pondichery  			| 9756314598763245 | Other   | July        |       2022 |    577 |
      | Albertgill | Albert@123 | Paris       | Hotel Cornice  | Super Deluxe | 9 - Nine        | 20/09/2021    | 28/09/2021     | 4 - Four        | 4 - Four          | Sengole    | Alagu     | Marakanam					| 1349763152864796 | Other   | August      |       2022 |    588 |