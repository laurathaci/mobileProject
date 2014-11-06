package srbyen.researchingapp.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import srbyen.researchingapp.R;

/**
 * Created by Athene on 11/6/2014.
 */
public class AdminPrivileges extends Activity {
    private Button mCheckButton;
    private Button mCreateButton;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_privilege);

        mCheckButton=(Button)findViewById(R.id.check_button);
        mCreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPrivileges.this, QuestionarResults.class);
                startActivity(intent);
            }
        });
        mCreateButton=(Button)findViewById(R.id.create_button);
        mCreateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(AdminPrivileges.this, ManipulationDataClass.class);
                startActivity(intent);
            }
        });

    }


}
