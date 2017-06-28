package com.it.xzr.mothersonhealth.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.util.HttpRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class LoginActivity extends BaseActivity {
    private EditText account, password;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        account = (EditText) findViewById(R.id.et_activity_login_account);
        password = (EditText) findViewById(R.id.et_activity_login_password);
        submit = (Button) findViewById(R.id.btn_activity_login_submit);
        submit.setOnClickListener(this);

        findViewById(R.id.aaaaa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public String convertToJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName", account.getText().toString());
        jsonObject.addProperty("password", password.getText().toString());
        return jsonObject.toString();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_activity_login_submit:
                if (!TextUtils.isEmpty(account.getText().toString()) && !TextUtils.isEmpty(password.getText().toString())) {
                    HttpRequest httpRequest = HttpRequest.getInstance();
                    httpRequest.postRequest("http://192.168.1.127:8080/Mrapi/login", convertToJson(), new Handler() {
                        @Override
                        public void handleMessage(Message msg) {
                            super.handleMessage(msg);
                            try {
                                JSONObject jsonObject = new JSONObject((String) msg.obj);
                                if (jsonObject.getInt("code") == 1) {
                                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                    finish();
                                }
                                Log.d("LoginActivity", (String) msg.obj);
                                System.out.println((String) msg.obj);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                break;
        }
    }
}
