package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class z$1
  implements ab.f
{
  z$1(z paramz)
  {
  }

  public final void ad(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(68031);
    if (paramInt1 == paramInt2)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareMailQueue", "finished one job, queue.size = %d", new Object[] { Integer.valueOf(this.pvd.puX.size()) });
      if (this.pvd.puZ != null)
        this.pvd.puZ.Vl(paramString);
      if (this.pvd.puX.size() > 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareMailQueue", "continue to send next mail");
        paramString = (aa)this.pvd.puX.remove(0);
        this.pvd.b(paramString);
        this.pvd.puY.a(this, this.pvd.pvc);
        AppMethodBeat.o(68031);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareMailQueue", "finished sent all mails");
      this.pvd.pva = false;
      AppMethodBeat.o(68031);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.z.1
 * JD-Core Version:    0.6.2
 */