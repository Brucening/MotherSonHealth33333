package com.it.xzr.mothersonhealth.util;

import android.os.Handler;
import android.os.Message;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/5/23 0023.
 */

public class HttpRequest {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private OkHttpClient client = new OkHttpClient();

    private static HttpRequest httpRequest = new HttpRequest();

    private HttpRequest() {
    }

    public static HttpRequest getInstance() {
        return httpRequest;
    }

    public void getRequest(String url, final Handler handler) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    Message message = handler.obtainMessage();
                    message.obj = response.body().string();
                    handler.sendMessage(message);
                }
            }
        });
    }

    public void postRequest(String url, String json, final Handler handler) {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Message message = handler.obtainMessage();
                message.obj = e.toString();
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    Message message = handler.obtainMessage();
                    message.obj = response.body().string();
                    handler.sendMessage(message);
                }
            }
        });
    }

}
