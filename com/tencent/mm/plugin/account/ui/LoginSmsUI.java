package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;

public class LoginSmsUI extends LoginHistoryUI
{
  private static String TAG = "LoginSmsUI";

  protected final void aqU()
  {
    AppMethodBeat.i(125021);
    super.aqU();
    if ((isFinishing()) || (getWindow() == null))
    {
      ab.e(TAG, "LoginHistoryUI is finishing");
      AppMethodBeat.o(125021);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.gBV))
      {
        this.gBT.account = this.gBV;
        aqX();
        aqV();
        final a locala = new a(this.gBV, 17, this.gCi.getText().toString().trim(), 0, "");
        g.Rg().a(locala, 0);
        getString(2131297061);
        this.ehJ = h.b(this, getString(2131301031), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(125019);
            g.Rg().c(locala);
            AppMethodBeat.o(125019);
          }
        });
      }
      AppMethodBeat.o(125021);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125020);
    super.onCreate(paramBundle);
    if (this.gCl)
    {
      AppMethodBeat.o(125020);
      return;
    }
    this.gwX = 3;
    if ((!bo.ant(this.gCb).booleanValue()) && (bo.ant(this.gBV).booleanValue()))
      this.gBI.setText(ws(this.gBV));
    this.gCi.setVisibility(0);
    this.gCi.setInputType(3);
    this.gCi.setSendSmsBtnClickListener(new LoginSmsUI.1(this));
    this.gCi.addTextChangedListener(new LoginSmsUI.2(this));
    if (this.gCi.getText().toString().length() > 0)
      this.gBK.setEnabled(true);
    while (true)
    {
      this.gBK.setVisibility(0);
      this.gBK.setOnClickListener(new LoginSmsUI.3(this));
      AppMethodBeat.o(125020);
      break;
      this.gBK.setEnabled(false);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125024);
    super.onDestroy();
    this.gCi.reset();
    AppMethodBeat.o(125024);
  }

  public void onResume()
  {
    AppMethodBeat.i(125022);
    super.onResume();
    g.Rg().a(145, this);
    AppMethodBeat.o(125022);
  }

  public void onStop()
  {
    AppMethodBeat.i(125023);
    super.onStop();
    g.Rg().b(145, this);
    AppMethodBeat.o(125023);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginSmsUI
 * JD-Core Version:    0.6.2
 */