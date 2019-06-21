package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;

public class MMTextInputUI extends MMActivity
{
  private int ehD;
  private EditText mLL;
  private TextView zGb;
  private int zGc;
  private int zGd;
  private boolean zGe;

  private void goBack()
  {
    AppMethodBeat.i(107728);
    if (getIntent().getBooleanExtra("key_show_confirm", false))
    {
      h.a(this.mController.ylL, getString(2131302108), "", new MMTextInputUI.1(this), null);
      AppMethodBeat.o(107728);
    }
    while (true)
    {
      return;
      aqX();
      setResult(0);
      finish();
      AppMethodBeat.o(107728);
    }
  }

  protected void I(CharSequence paramCharSequence)
  {
  }

  public int getLayoutId()
  {
    return 2130969865;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(107730);
    super.onCreate(paramBundle);
    this.mLL = ((EditText)findViewById(2131823386));
    this.zGb = ((TextView)findViewById(2131823892));
    this.mLL.setHint(bo.bc(getIntent().getStringExtra("key_hint"), ""));
    this.mLL.append(bo.bc(getIntent().getStringExtra("key_value"), ""));
    this.ehD = (getIntent().getIntExtra("key_max_count", -1) << 1);
    this.zGd = 0;
    this.zGc = Math.max(this.ehD - 120, this.ehD * 9 / 10);
    this.zGe = getIntent().getBooleanExtra("key_nullable", false);
    setBackBtn(new MMTextInputUI.2(this));
    a(0, getString(2131296944), new MMTextInputUI.3(this), q.b.ymu);
    enableOptionMenu(this.zGe);
    if ((!this.zGe) || (this.ehD > 0))
      this.mLL.addTextChangedListener(new MMTextInputUI.4(this));
    AppMethodBeat.o(107730);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(107731);
    super.onDestroy();
    AppMethodBeat.o(107731);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107729);
    boolean bool;
    if (4 == paramInt)
    {
      ab.i("MicroMsg.MMTextInputUI", "on back key down");
      goBack();
      bool = true;
      AppMethodBeat.o(107729);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(107729);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(107733);
    super.onPause();
    AppMethodBeat.o(107733);
  }

  public void onResume()
  {
    AppMethodBeat.i(107732);
    super.onResume();
    AppMethodBeat.o(107732);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTextInputUI
 * JD-Core Version:    0.6.2
 */