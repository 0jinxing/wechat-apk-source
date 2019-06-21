package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class BaseScanUI$10
  implements Runnable
{
  BaseScanUI$10(BaseScanUI paramBaseScanUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138466);
    try
    {
      if (BaseScanUI.a(this.qbV) == null)
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "scanCamera == null, in openCamera()");
        AppMethodBeat.o(138466);
        return;
      }
      if (!BaseScanUI.r(this.qbV))
        BaseScanUI.d(this.qbV, true);
      if (BaseScanUI.a(this.qbV).isOpen())
        ab.d("MicroMsg.scanner.BaseScanUI", "camera already open");
      while (true)
      {
        al.n(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(138465);
            BaseScanUI.y(BaseScanUI.10.this.qbV);
            AppMethodBeat.o(138465);
          }
        }
        , 50L);
        BaseScanUI.a(this.qbV).e(BaseScanUI.z(this.qbV));
        BaseScanUI.i(this.qbV).kn(this.qbV.chh());
        BaseScanUI.i(this.qbV).f(BaseScanUI.a(this.qbV).lUF);
        if ((BaseScanUI.a(this.qbV) != null) && (BaseScanUI.a(this.qbV).lUE))
          this.qbV.jL(0L);
        AppMethodBeat.o(138466);
        break;
        synchronized (BaseScanUI.s(this.qbV))
        {
          BaseScanUI.a(this.qbV).open();
          ab.d("MicroMsg.scanner.BaseScanUI", "scanCamera.open done");
          BaseScanUI.t(this.qbV);
          BaseScanUI.d(this.qbV, false);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "Exception in scanCamera.open(), [%s]", new Object[] { localException.toString() });
        ab.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
        BaseScanUI.u(this.qbV);
        if (BaseScanUI.v(this.qbV) >= 5)
        {
          BaseScanUI.w(this.qbV);
          AppMethodBeat.o(138466);
        }
        else
        {
          al.n(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(138464);
              BaseScanUI.x(BaseScanUI.10.this.qbV);
              AppMethodBeat.o(138464);
            }
          }
          , 300L);
          AppMethodBeat.o(138466);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.10
 * JD-Core Version:    0.6.2
 */