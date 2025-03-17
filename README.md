# Проект ConvertDate

Проект ConvertDate представляет собой веб-приложение для преобразования временных меток в формат даты и времени.

## Установка

1. Клонируйте репозиторий:

    ```
    git clone https://github.com/Maga-nan/convert-date.git
    ```

2. Перейдите в директорию проекта:

    ```
    cd convert-date
    ```

## Использование

1. Запустите приложение:

    ```
    npm start
    ```

2. Откройте браузер и перейдите по адресу [http://localhost:8081](http://localhost:8081).

3. Отправьте GET запрос на `/convertDate?timestamp=YOUR_TIMESTAMP` для преобразования временной метки в формат даты и времени.

Пример запроса: [http://localhost:8081/convertDate?timestamp=1647536483000](http://localhost:8081/convertDate?timestamp=1647536483000)

## API Endpoints

- `GET /convertDate?timestamp=YOUR_TIMESTAMP`: Преобразование временной метки в формат даты и времени.

## Автор

Ваше Имя - Алексей
