package com.tencent.mm.plugin.scanner.ui;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ak;

final class BaseScanUI$12 extends n.a
{
  BaseScanUI$12(BaseScanUI paramBaseScanUI)
  {
    AppMethodBeat.i(80923);
    AppMethodBeat.o(80923);
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(138468);
    if (!BaseScanUI.b(this.qbV))
      AppMethodBeat.o(138468);
    while (true)
    {
      return;
      new ak(Looper.getMainLooper()).post(new BaseScanUI.12.1(this, paramInt));
      AppMethodBeat.o(138468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.12
 * JD-Core Version:    0.6.2
 */