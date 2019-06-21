package com.tencent.mm.plugin.account.bind.ui;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindMobileVerifyUI$6
  implements Runnable
{
  BindMobileVerifyUI$6(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13534);
    BindMobileVerifyUI.e(this.gst);
    BindMobileVerifyUI.a(this.gst, Integer.valueOf(BindMobileVerifyUI.e(this.gst).intValue() - 1));
    if (BindMobileVerifyUI.e(this.gst).intValue() > 0)
    {
      BindMobileVerifyUI.c(this.gst).setText(this.gst.getResources().getQuantityString(2131361811, BindMobileVerifyUI.e(this.gst).intValue(), new Object[] { BindMobileVerifyUI.e(this.gst) }));
      AppMethodBeat.o(13534);
    }
    while (true)
    {
      return;
      BindMobileVerifyUI.c(this.gst).setText(this.gst.getResources().getQuantityString(2131361811, 0, new Object[] { Integer.valueOf(0) }));
      BindMobileVerifyUI.f(this.gst);
      AppMethodBeat.o(13534);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.6
 * JD-Core Version:    0.6.2
 */