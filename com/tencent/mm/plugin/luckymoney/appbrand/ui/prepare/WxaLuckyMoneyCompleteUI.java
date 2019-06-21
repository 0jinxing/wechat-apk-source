package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.ui.MMActivity;

public class WxaLuckyMoneyCompleteUI extends WxaLuckyMoneyBaseUI
  implements b
{
  private Button nsJ;

  public final void Qf(String paramString)
  {
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public final void bKV()
  {
  }

  public final int getLayoutId()
  {
    return 2130971243;
  }

  public final void initView()
  {
    AppMethodBeat.i(42051);
    this.nsJ = ((Button)findViewById(2131829234));
    this.nsJ.setOnClickListener(new WxaLuckyMoneyCompleteUI.1(this));
    AppMethodBeat.o(42051);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42052);
    setResult(0, null);
    finish();
    AppMethodBeat.o(42052);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42050);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(42050);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI
 * JD-Core Version:    0.6.2
 */