fun updateExisting() {
    val service = WallService
    val post1 = Post(
        1,
        12345689,
        12345689,
        111111,
        Expand All
                @@ -34,7 +34,7 @@ class MainKtTest {
            1
            )
            val post2 = Post(
                2,
                12345665,
                12345665,
                111111,
                Expand All
                        @@ -60,7 +60,7 @@ class MainKtTest {
                    1
                    )
                    val post3 = Post(
                        3,
                        12345670,
                        12345555,
                        111111,
                        Expand Down
                                Expand Up
                                @@ -111,7 +111,8 @@ class MainKtTest {
                            Donut(true, 99999999,"Update", true, "Update"),
                            1
                            )
                            service.add(post1)
                            service.add(post2)
                            val result = service.update(update)
                            assertTrue(result)
                        }
                                Expand All
                        @@ -122,7 +123,7 @@ class MainKtTest {
                            val service = WallService
                            // заполняем несколькими постами
                            val post1 = Post(
                                1,
                                12345689,
                                12345689,
                                111111,
                                Expand All
                                        @@ -148,7 +149,7 @@ class MainKtTest {
                                    1
                                    )
                                    val post2 = Post(
                                        2,
                                        12345665,
                                        12345665,
                                        111111,
                                        Expand Down
                                                Expand Up
                                                @@ -200,7 +201,7 @@ class MainKtTest {
                                            1
                                            )
                                            val update = Post(
                                                256,
                                                99999999,
                                                99999999,
                                                99999999,
                                                Expand All
                                                        @@ -226,10 +227,9 @@ class MainKtTest {
                                                    1
                                                    )

                                                    service.add(post1)
                                                    service.add(post2)
                                                    val result = service.update(update)
                                                    assertFalse(result)
                                                }