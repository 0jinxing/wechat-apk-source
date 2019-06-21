package com.tencent.mm.plugin.soter.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.i;

public class SoterTestUI extends MMActivity
{
  private Button rOA = null;
  private Button rOB = null;
  private Button rOC = null;
  private Button rOD = null;
  private Button rOE = null;
  private Button rOF = null;
  private Button rOG = null;
  private Button rOH = null;
  private TextView rOI = null;
  private Button rOz = null;

  public final int getLayoutId()
  {
    return 2130970842;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(59392);
    super.onCreate(paramBundle);
    this.rOz = ((Button)findViewById(2131827974));
    this.rOA = ((Button)findViewById(2131827975));
    this.rOB = ((Button)findViewById(2131827976));
    this.rOC = ((Button)findViewById(2131827977));
    this.rOD = ((Button)findViewById(2131827978));
    this.rOE = ((Button)findViewById(2131827979));
    this.rOF = ((Button)findViewById(2131827980));
    this.rOG = ((Button)findViewById(2131827981));
    this.rOH = ((Button)findViewById(2131827982));
    this.rOI = ((TextView)findViewById(2131827973));
    this.rOz.setOnClickListener(new SoterTestUI.1(this));
    this.rOA.setOnClickListener(new SoterTestUI.2(this));
    this.rOB.setOnClickListener(new SoterTestUI.3(this));
    this.rOC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(59382);
        paramAnonymousView = a.dQS();
        if (paramAnonymousView == null)
        {
          SoterTestUI.a(SoterTestUI.this).setText("not passed: no certificate");
          AppMethodBeat.o(59382);
        }
        while (true)
        {
          return;
          SoterTestUI.a(SoterTestUI.this).setText("model available: " + paramAnonymousView.toString());
          AppMethodBeat.o(59382);
        }
      }
    });
    this.rOD.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(59383);
        paramAnonymousView = a.atZ("sample_auth_key_name");
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess());
        for (paramAnonymousView = "pass"; ; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          AppMethodBeat.o(59383);
          return;
        }
      }
    });
    this.rOE.setOnClickListener(new SoterTestUI.6(this));
    this.rOF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(59385);
        paramAnonymousView = a.auc("sample_auth_key_name");
        if (paramAnonymousView == null)
        {
          SoterTestUI.a(SoterTestUI.this).setText("not passed: no certificate");
          AppMethodBeat.o(59385);
        }
        while (true)
        {
          return;
          SoterTestUI.a(SoterTestUI.this).setText("model available: " + paramAnonymousView.toString());
          AppMethodBeat.o(59385);
        }
      }
    });
    this.rOG.setOnClickListener(new SoterTestUI.8(this));
    AppMethodBeat.o(59392);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterTestUI
 * JD-Core Version:    0.6.2
 */