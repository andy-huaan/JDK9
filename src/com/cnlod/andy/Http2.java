package com.cnlod.andy;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

/**
 * Java 9 中有新的方式来处理 HTTP 调用。这个迟到的特性用于代替老旧的 `HttpURLConnection` API，并提供对 WebSocket 和 HTTP/2 的支持。
 * 注意：新的 HttpClient API 在 Java 9 中以所谓的孵化器模块交付。也就是说，这套 API 不能保证 100% 完成。不过你可以在 Java 9 中开始使用这套 API
 */

public class Http2 {
    private static String url = "http://dmg.lodbao.com/g1/food/getBooks?radom=1510283165942&kind=1&pageNo=1&pageSize=30";

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).header("User-Agent","Java").GET().build();

        //除了这个简单的请求/响应模型之外，HttpClient 还提供了新的 API 来处理 HTTP/2 的特性，比如流和服务端推送
        HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandler.asString());
        System.out.println(resp.body());
    }
}
