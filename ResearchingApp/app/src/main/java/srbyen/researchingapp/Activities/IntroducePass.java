package srbyen.researchingapp.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import srbyen.researchingapp.R;

public class IntroducePass extends Activity{

    private Button mEnterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introd_pass);

        mEnterButton = (Button)findViewById(R.id.enter_button);
        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroducePass.this, AdminPrivileges.class);
                startActivity(intent);
            }

        });
    }
}
