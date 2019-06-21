package com.tencent.mm.plugin.ext.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.g.a.oq.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;

final class e$1 extends bj<e.a>
{
  e$1(e parame, e.a parama, d.b paramb)
  {
    super(5000L, parama);
  }

  private e.a brZ()
  {
    AppMethodBeat.i(20418);
    try
    {
      ab.d("MicroMsg.ExtQrCodeHandler", "hy: start scan qrcode");
      if (this.lQZ != null)
      {
        oq localoq = new com/tencent/mm/g/a/oq;
        localoq.<init>();
        localoq.cKZ.width = this.lQZ.aIV;
        localoq.cKZ.height = this.lQZ.aIW;
        localoq.cKZ.cLb = this.lQZ.lQX;
        localoq.cKZ.rotate = this.lQZ.rotate;
        localoq.cKZ.cLa = this.lQZ.cLa;
        oq.a locala = localoq.cKZ;
        e.1.1 local1 = new com/tencent/mm/plugin/ext/c/e$1$1;
        local1.<init>(this);
        locala.cLc = local1;
        a.xxA.m(localoq);
      }
      while (true)
      {
        AppMethodBeat.o(20418);
        return null;
        ab.w("MicroMsg.ExtQrCodeHandler", "hy: qrcode data not retrieved");
        cC(null);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ExtQrCodeHandler", localException, "hy: error when syncTaskScanQrCode", new Object[0]);
        cC(null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.e.1
 * JD-Core Version:    0.6.2
 */