package com.tencent.mm.plugin.scanner;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.b.a.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.a.p;
import com.tencent.mm.plugin.scanner.a.q;
import com.tencent.mm.plugin.scanner.util.n.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.util.HashMap;

final class e$1
  implements n.b
{
  e$1(e parame)
  {
  }

  public final void b(int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(80774);
    if (e.a(this.pYX).containsKey(Integer.valueOf(paramInt)))
    {
      if ((e.b(this.pYX).containsKey(Integer.valueOf(paramInt))) && (e.c(this.pYX).containsKey(Integer.valueOf(paramInt))))
      {
        ((r)e.b(this.pYX).get(Integer.valueOf(paramInt))).cXa = (System.currentTimeMillis() - ((Long)e.c(this.pYX).get(Integer.valueOf(paramInt))).longValue());
        ((r)e.b(this.pYX).get(Integer.valueOf(paramInt))).ajK();
        e.b(this.pYX).remove(Integer.valueOf(paramInt));
        e.c(this.pYX).remove(Integer.valueOf(paramInt));
        ab.i("MicroMsg.scanner.SubCoreScanner", "translationReports size %d, translationUpload size %d", new Object[] { Integer.valueOf(e.b(this.pYX).size()), Integer.valueOf(e.c(this.pYX).size()) });
      }
      if (!g.RK())
        AppMethodBeat.o(80774);
    }
    while (true)
    {
      return;
      e.cgy();
      String str = e.Wb("jpg");
      try
      {
        d.a(paramBitmap, 80, Bitmap.CompressFormat.JPEG, str, false);
        p localp = new com/tencent/mm/plugin/scanner/a/p;
        localp.<init>();
        paramBitmap = (q)e.a(this.pYX).get(Integer.valueOf(paramInt));
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localp.field_originMD5 = ag.ck(paramBitmap.fWz + com.tencent.mm.vfs.e.ata(paramBitmap.fWz));
        localp.field_resultFile = str;
        localp.field_fromLang = paramBitmap.cMc;
        localp.field_toLang = paramBitmap.cMd;
        ab.i("MicroMsg.scanner.SubCoreScanner", "translate %d success, insert translate result %s", new Object[] { Integer.valueOf(paramInt), str });
        e.cgy().cgD().b(localp);
        localObject = new com/tencent/mm/g/a/pv;
        ((pv)localObject).<init>();
        ((pv)localObject).cMa.ctE = paramInt;
        ((pv)localObject).cMa.ctn = true;
        ((pv)localObject).cMa.cMb = str;
        ((pv)localObject).cMa.cMc = paramBitmap.cMc;
        ((pv)localObject).cMa.cMd = paramBitmap.cMd;
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        e.a(this.pYX).remove(Integer.valueOf(paramInt));
        AppMethodBeat.o(80774);
      }
      catch (IOException paramBitmap)
      {
        ab.printErrStackTrace("MicroMsg.scanner.SubCoreScanner", paramBitmap, "save translate result file error", new Object[0]);
        e.a(this.pYX, paramInt);
      }
      AppMethodBeat.o(80774);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.e.1
 * JD-Core Version:    0.6.2
 */