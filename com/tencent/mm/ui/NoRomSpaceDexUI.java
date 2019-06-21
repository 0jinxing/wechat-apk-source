package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;

public class NoRomSpaceDexUI extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29832);
    super.onCreate(paramBundle);
    aa.initLanguage(ah.getContext());
    setContentView(2130970306);
    String str = getString(2131298269);
    paramBundle = new o(this);
    paramBundle.setTitle(2131298270);
    paramBundle.ykW.setVisibility(0);
    paramBundle.ykU.setVisibility(0);
    paramBundle.ykU.setText(str);
    str = getString(2131298267);
    DialogInterface.OnClickListener local1 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(29831);
        Process.killProcess(Process.myPid());
        AppMethodBeat.o(29831);
      }
    };
    if (paramBundle.tJz != null)
    {
      paramBundle.tJz.setVisibility(0);
      paramBundle.tJz.setText(str);
      paramBundle.tJz.setOnClickListener(new o.1(paramBundle, local1));
    }
    paramBundle.setCancelable(false);
    paramBundle.dxP();
    paramBundle.show();
    AppMethodBeat.o(29832);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NoRomSpaceDexUI
 * JD-Core Version:    0.6.2
 */