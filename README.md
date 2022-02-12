# 第4回講座課題　CRUD処理（Read処理のみ）
## 概要
このプロジェクトは登録したゲームのデータをIDで１件、または全件検索するレポジトリです。

## 前提
- Java 11
- Spring Boot 2.6.3
- Docker 20.10.12

## Getting Started
`$ git clone https://github.com/renangton/task4_crud_readonly.git`

`$ cd task4_crud_readonly`

`$ docker-compose up -d`

`$ ./gradlew bootRun`

起動成功時のイメージ

![getstarted](https://user-images.githubusercontent.com/97335620/153619014-0054ad9e-09ac-43fd-9816-72a1ad8732a1.png)

`http://localhost:8080/search`にアクセスすると検索画面が表示される。

**検索画面**

![search](https://user-images.githubusercontent.com/97335620/152984071-326d70b5-4499-47f4-aa76-6abc54749dfa.png)

- 検索条件のIDがnullの場合、全件検索
  - 昇順か降順を選択し、選択に応じて表示する

**昇順結果**

![resultAsc](https://user-images.githubusercontent.com/97335620/152984515-1244b1d0-8a30-4672-9f36-6d02dcdb835d.png)

- 検索条件のIDに値が入っている場合、IDで1件検索
  - レコードが存在しない時、文字列で検索した時は赤字でエラー内容を表示

**１件検索結果**

![result1](https://user-images.githubusercontent.com/97335620/152984825-d66513ef-234f-4c86-8b0a-39ca4b7a943f.png)

**エラー表示**

![notFound](https://user-images.githubusercontent.com/97335620/152984880-c6e31dc8-2d4f-4589-801e-37c2601d173d.png)
![mozi](https://user-images.githubusercontent.com/97335620/152984885-2d9af1d0-f0fa-4d83-b7cb-ef02f22759ab.png)

(`./gradlew bootRun`コマンドで実行している場合) `ctrl + c`で終了する
