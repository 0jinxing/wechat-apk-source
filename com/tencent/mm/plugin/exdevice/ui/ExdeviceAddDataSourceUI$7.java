package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceAddDataSourceUI$7
  implements Runnable
{
  ExdeviceAddDataSourceUI$7(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19781);
    ab.d("MicroMsg.ExdeviceAddDataSourceUI", "stopAllChannelEvent! ");
    sl localsl = new sl();
    a.xxA.m(localsl);
    AppMethodBeat.o(19781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.7
 * JD-Core Version:    0.6.2
 */