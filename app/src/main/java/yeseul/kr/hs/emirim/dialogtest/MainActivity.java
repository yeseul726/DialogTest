package yeseul.kr.hs.emirim.dialogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //핸들러클래스는 규격이 있음 (조건이 들어있는 인터페이스를 상속받는다.)
    //OnClickListener는 View와 Dialog에 있음
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this); //괄호 안에는 핸들러의 객체가 들어가야 함 (현재 클래스가 핸들러클래스이기 때문에 this 사용)
    }

    @Override
    public void onClick(View v) {

    }
}
