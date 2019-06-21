package com.tencent.mm.plugin.scanner;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.pu.a;
import com.tencent.mm.g.b.a.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.p.a;
import com.tencent.mm.plugin.scanner.util.p.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class e$3$1
  implements p.a
{
  e$3$1(e.3 param3, String paramString1, r paramr, long paramLong, pu parampu, String paramString2, int paramInt)
  {
  }

  public final void a(String paramString, p.b paramb)
  {
    AppMethodBeat.i(138452);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.pYY)))
    {
      this.pYZ.cWY = (System.currentTimeMillis() - this.pZa);
      ab.i("MicroMsg.scanner.SubCoreScanner", "upload img cost %d", new Object[] { Long.valueOf(this.pYZ.cWY) });
      switch (paramb.errCode)
      {
      default:
      case 0:
      case -21009:
      case -21000:
      }
    }
    while (true)
    {
      if (this.pZd != 0)
      {
        ab.i("delete tmp path %s", this.pZc);
        com.tencent.mm.vfs.e.deleteFile(this.pZc);
      }
      AppMethodBeat.o(138452);
      return;
      if (!bo.Q(new String[] { paramb.fileId, paramb.aeskey }))
      {
        ab.i("MicroMsg.scanner.SubCoreScanner", "upload img success, fileId %s", new Object[] { paramb.fileId });
        paramString = new com.tencent.mm.plugin.scanner.a.e(this.pZb.cLZ.ctE, com.tencent.mm.a.e.cs(this.pZc), paramb.fileId, paramb.aeskey);
        g.Rg().a(paramString, 0);
      }
      else
      {
        this.pYZ.cWX = 3L;
        this.pYZ.cXa = (System.currentTimeMillis() - this.pZa);
        this.pYZ.ajK();
        e.b(this.pZe.pYX).remove(Integer.valueOf(this.pZb.cLZ.ctE));
        e.c(this.pZe.pYX).remove(Integer.valueOf(this.pZb.cLZ.ctE));
        ab.i("MicroMsg.scanner.SubCoreScanner", "translationReports size %d, translationUpload size %d", new Object[] { Integer.valueOf(e.b(this.pZe.pYX).size()), Integer.valueOf(e.c(this.pZe.pYX).size()) });
        e.a(this.pZe.pYX, this.pZb.cLZ.ctE);
        continue;
        this.pYZ.cWX = 3L;
        this.pYZ.cXa = (System.currentTimeMillis() - this.pZa);
        this.pYZ.ajK();
        e.b(this.pZe.pYX).remove(Integer.valueOf(this.pZb.cLZ.ctE));
        e.c(this.pZe.pYX).remove(Integer.valueOf(this.pZb.cLZ.ctE));
        ab.i("MicroMsg.scanner.SubCoreScanner", "translationReports size %d, translationUpload size %d", new Object[] { Integer.valueOf(e.b(this.pZe.pYX).size()), Integer.valueOf(e.c(this.pZe.pYX).size()) });
        e.a(this.pZe.pYX, this.pZb.cLZ.ctE);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.e.3.1
 * JD-Core Version:    0.6.2
 */