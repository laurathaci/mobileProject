package srbyen.researchingapp.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import srbyen.researchingapp.R;

/**
 * Created by Athene on 11/6/2014.
 */
public class ManipulationDataClass extends Activity {

    private Button mEditDataButton;
    private Button mDeleteDataButton;
    private Button mCreateNewQuestionarButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulation_data);

        mEditDataButton = (Button)findViewById(R.id.edit_questionar_button);
        mEditDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(this , )
            }
        });
        mDeleteDataButton=(Button)findViewById(R.id.delete_questionar_button);
        mDeleteDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(this, );
            }
        });
        mCreateNewQuestionarButton=(Button)findViewById(R.id.create_questionar_button);
        mCreateNewQuestionarButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                //Intent intent = new Intent(this, );
            }
        });
    }
}
