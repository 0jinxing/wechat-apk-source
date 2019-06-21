package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class ExdeviceProfileUI$26$1
  implements n.c
{
  ExdeviceProfileUI$26$1(ExdeviceProfileUI.26 param26)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(20052);
    if (!bo.isNullOrNil(ExdeviceProfileUI.o(this.lCB.lCu)))
      paraml.e(5, this.lCB.lCu.getString(2131299354));
    paraml.e(3, this.lCB.lCu.getString(2131299350));
    AppMethodBeat.o(20052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.26.1
 * JD-Core Version:    0.6.2
 */