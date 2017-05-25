package yeseul.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //핸들러클래스는 규격이 있음 (조건이 들어있는 인터페이스를 상속받는다.)
    //OnClickListener는 View와 Dialog에 있음

    Button butDialog;
    String[] itemArr = {"고양이", "강아지", "햄스터"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this); //괄호 안에는 핸들러의 객체가 들어가야 함 (현재 클래스가 핸들러클래스이기 때문에 this 사용)
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this); //괄호 안에 context 객체 넣기

        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.mipmap.icon);
        //dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() { //항목이 클릭되었을 때 처리되게 하려면 여기에 설정해줘야함 (익명클래스로)
            @Override
            public void onClick(DialogInterface dialog, int which) {
                butDialog.setText(itemArr[which]);
            }
        });
        dialog.setPositiveButton("OK", null); //아무 객체도 지정하지 않을 때 null 사용
        dialog.show(); //보이게 설정하기 위해서는 반드시 필요
    }
}
