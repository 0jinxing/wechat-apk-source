package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$VertifyTimer;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog;JJ)V", "onFinish", "", "onTick", "millisUntilFinished", "plugin-appbrand-integration_release"})
public final class m$c extends CountDownTimer
{
  public m$c(long paramLong1, long paramLong2)
  {
    super(???, localObject);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(134897);
    m.c(this.izd);
    AppMethodBeat.o(134897);
  }

  public final void onTick(long paramLong)
  {
    AppMethodBeat.i(134896);
    TextView localTextView = m.b(this.izd);
    if (localTextView != null)
    {
      localTextView.setText((CharSequence)this.izd.context.getString(2131296647, new Object[] { paramLong / 1000L }));
      AppMethodBeat.o(134896);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.c
 * JD-Core Version:    0.6.2
 */