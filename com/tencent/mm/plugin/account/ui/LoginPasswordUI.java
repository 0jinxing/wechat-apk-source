package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;

public class LoginPasswordUI extends LoginHistoryUI
{
  private static String TAG = "LoginPasswordUI";

  protected final void aqU()
  {
    AppMethodBeat.i(125005);
    super.aqU();
    if ((isFinishing()) || (getWindow() == null))
    {
      ab.e(TAG, "LoginHistoryUI is finishing");
      AppMethodBeat.o(125005);
    }
    while (true)
    {
      return;
      this.gBT.guf = this.gBJ.getText().toString();
      if (this.gBT.account.equals(""))
      {
        h.g(this, 2131304239, 2131301017);
        AppMethodBeat.o(125005);
      }
      else if (this.gBT.guf.equals(""))
      {
        h.g(this, 2131304235, 2131301017);
        AppMethodBeat.o(125005);
      }
      else
      {
        aqX();
        aqV();
        q localq = new q(this.gBT.account, this.gBT.guf, this.gzO, 0);
        g.Rg().a(localq, 0);
        getString(2131297061);
        this.ehJ = h.b(this, getString(2131301031), true, new LoginPasswordUI.6(this, localq));
        AppMethodBeat.o(125005);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125004);
    super.onCreate(paramBundle);
    if (this.gCl)
    {
      AppMethodBeat.o(125004);
      return;
    }
    this.gwX = 2;
    this.gCh.setVisibility(0);
    this.gBK.setVisibility(0);
    this.gBJ.setTypeface(Typeface.DEFAULT);
    this.gBJ.setTransformationMethod(new PasswordTransformationMethod());
    this.gBJ.setOnEditorActionListener(new LoginPasswordUI.1(this));
    this.gBJ.setOnKeyListener(new LoginPasswordUI.2(this));
    this.gBJ.addTextChangedListener(new LoginPasswordUI.3(this));
    if (this.gBJ.getText().toString().length() > 0)
      this.gBK.setEnabled(true);
    while (true)
    {
      this.gBK.setOnClickListener(new LoginPasswordUI.4(this));
      this.gzO = getIntent().getStringExtra("auth_ticket");
      if (!bo.isNullOrNil(this.gzO))
      {
        this.gBI.setText(bo.nullAsNil(f.ara()));
        this.gBJ.setText(bo.nullAsNil(f.arb()));
        new ak().postDelayed(new LoginPasswordUI.5(this), 500L);
      }
      AppMethodBeat.o(125004);
      break;
      this.gBK.setEnabled(false);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginPasswordUI
 * JD-Core Version:    0.6.2
 */