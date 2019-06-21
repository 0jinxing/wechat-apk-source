package com.tencent.mm.plugin.expt.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExptDebugUI extends MMActivity
{
  private Button grC;
  private Button gzI;
  private TextView lOS;
  private Button lOT;
  private Button lOU;
  private TextView lOV;
  private TextView lOW;
  private TextView lOX;
  private TextView lOY;
  private TextView lOZ;
  private EditText lPa;
  private Button lPb;
  private int lPc = 0;

  public final int getLayoutId()
  {
    return 2130968625;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(73639);
    super.onCreate(paramBundle);
    setMMTitle("Expt debug ui");
    setBackBtn(new ExptDebugUI.1(this));
    this.lOS = ((TextView)findViewById(2131820998));
    this.grC = ((Button)findViewById(2131820999));
    this.grC.setOnClickListener(new ExptDebugUI.2(this));
    this.lPa = ((EditText)findViewById(2131821008));
    this.lPb = ((Button)findViewById(2131821009));
    this.lPb.setOnClickListener(new ExptDebugUI.3(this));
    this.lOT = ((Button)findViewById(2131821000));
    this.lOT.setOnClickListener(new ExptDebugUI.4(this));
    this.lOU = ((Button)findViewById(2131821001));
    this.lOU.setOnClickListener(new ExptDebugUI.5(this));
    this.gzI = ((Button)findViewById(2131821002));
    this.gzI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(73638);
        paramAnonymousView = com.tencent.mm.plugin.expt.b.a.bqR().uZ(ExptDebugUI.c(ExptDebugUI.this));
        if ((paramAnonymousView != null) && (paramAnonymousView.bro()))
        {
          paramAnonymousView = new LinkedList();
          paramAnonymousView.add(Integer.valueOf(ExptDebugUI.c(ExptDebugUI.this)));
          com.tencent.mm.plugin.expt.b.a.bqR();
          com.tencent.mm.plugin.expt.b.a.a(null, null, paramAnonymousView);
        }
        paramAnonymousView = new ArrayList();
        paramAnonymousView.add(Integer.valueOf(ExptDebugUI.c(ExptDebugUI.this)));
        if (com.tencent.mm.plugin.expt.b.a.bqR().bB(paramAnonymousView) > 0);
        for (boolean bool = true; ; bool = false)
        {
          ExptDebugUI.d(ExptDebugUI.this).setText(" del :" + ExptDebugUI.c(ExptDebugUI.this) + " " + bool);
          AppMethodBeat.o(73638);
          return;
        }
      }
    });
    this.lOV = ((TextView)findViewById(2131821003));
    this.lOW = ((TextView)findViewById(2131821004));
    this.lOX = ((TextView)findViewById(2131821005));
    this.lOY = ((TextView)findViewById(2131821006));
    this.lOZ = ((TextView)findViewById(2131821007));
    AppMethodBeat.o(73639);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI
 * JD-Core Version:    0.6.2
 */