package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.a.i;
import com.tencent.mm.ui.base.p;

final class ExdeviceProfileUI$1$1
  implements Runnable
{
  ExdeviceProfileUI$1$1(ExdeviceProfileUI.1 param1, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20020);
    if (ExdeviceProfileUI.d(this.lCw.lCu) != null)
      ExdeviceProfileUI.d(this.lCw.lCu).dismiss();
    ExdeviceProfileUI.a(this.lCw.lCu, this.lCv.lvE);
    ExdeviceProfileUI.f(this.lCw.lCu).setAffectedUserInfo(ExdeviceProfileUI.e(this.lCw.lCu));
    AppMethodBeat.o(20020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.1.1
 * JD-Core Version:    0.6.2
 */