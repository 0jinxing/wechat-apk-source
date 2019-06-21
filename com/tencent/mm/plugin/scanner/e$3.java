package com.tencent.mm.plugin.scanner;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.pu.a;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.b.a.r;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.plugin.scanner.a.q;
import com.tencent.mm.plugin.scanner.util.p;
import com.tencent.mm.plugin.scanner.util.p.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.util.HashMap;

final class e$3 extends c<pu>
{
  e$3(e parame)
  {
    AppMethodBeat.i(138453);
    this.xxI = pu.class.getName().hashCode();
    AppMethodBeat.o(138453);
  }

  private boolean a(pu parampu)
  {
    AppMethodBeat.i(138454);
    if ((parampu.cLZ.scene == 1) && (!bo.isNullOrNil(parampu.cLZ.filePath)));
    while (true)
    {
      try
      {
        ab.i("MicroMsg.scanner.SubCoreScanner", "request to translate img %s, sessionId %d", new Object[] { parampu.cLZ.filePath, Integer.valueOf(parampu.cLZ.ctE) });
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ag.ck(parampu.cLZ.filePath + com.tencent.mm.vfs.e.ata(parampu.cLZ.filePath));
        localObject1 = e.cgy().cgD().Wf((String)localObject1);
        if (localObject1 != null)
        {
          ab.i("MicroMsg.scanner.SubCoreScanner", "already has translation result");
          localObject2 = ((eb)localObject1).field_resultFile;
          localObject3 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject3).<init>();
          if (d.decodeFile((String)localObject2, (BitmapFactory.Options)localObject3) != null)
          {
            localObject3 = new com/tencent/mm/g/a/pv;
            ((pv)localObject3).<init>();
            ((pv)localObject3).cMa.ctE = parampu.cLZ.ctE;
            ((pv)localObject3).cMa.ctn = true;
            ((pv)localObject3).cMa.cMb = ((String)localObject2);
            ((pv)localObject3).cMa.cMc = ((eb)localObject1).field_fromLang;
            ((pv)localObject3).cMa.cMd = ((eb)localObject1).field_toLang;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
            e.a(this.pYX).remove(Integer.valueOf(parampu.cLZ.ctE));
            AppMethodBeat.o(138454);
            bool = true;
            return bool;
          }
          ab.w("MicroMsg.scanner.SubCoreScanner", "can not find old translation result!");
        }
        Object localObject3 = new com/tencent/mm/g/b/a/r;
        ((r)localObject3).<init>();
        ((r)localObject3).cWV = 4L;
        e.b(this.pYX).put(Integer.valueOf(parampu.cLZ.ctE), localObject3);
        Object localObject4 = new com/tencent/mm/plugin/scanner/a/q;
        ((q)localObject4).<init>();
        ((q)localObject4).fWz = parampu.cLZ.filePath;
        ((q)localObject4).qal = parampu.cLZ.filePath;
        int i = Exif.fromFile(parampu.cLZ.filePath).getOrientationInDegree();
        ab.i("MicroMsg.scanner.SubCoreScanner", "original img degree %s", new Object[] { Integer.valueOf(i) });
        Object localObject2 = parampu.cLZ.filePath;
        String str = p.Wr(parampu.cLZ.filePath);
        localObject1 = localObject2;
        if (i != 0)
        {
          localObject1 = parampu.cLZ.filePath;
          Object localObject5 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject5).<init>();
          localObject5 = d.decodeFile((String)localObject1, (BitmapFactory.Options)localObject5);
          localObject1 = localObject2;
          if (localObject5 != null)
          {
            localObject2 = d.b((Bitmap)localObject5, i);
            e.cgy();
            localObject1 = e.Wc("jpg");
            d.a((Bitmap)localObject2, 80, Bitmap.CompressFormat.JPEG, (String)localObject1, false);
            ((q)localObject4).qal = ((String)localObject1);
          }
        }
        e.a(this.pYX).put(Integer.valueOf(parampu.cLZ.ctE), localObject4);
        long l = System.currentTimeMillis();
        e.c(this.pYX).put(Integer.valueOf(parampu.cLZ.ctE), Long.valueOf(l));
        localObject4 = e.cgy().pYM;
        int j = com.tencent.mm.i.a.MediaType_IMAGE;
        localObject2 = new com/tencent/mm/plugin/scanner/e$3$1;
        ((e.3.1)localObject2).<init>(this, str, (r)localObject3, l, parampu, (String)localObject1, i);
        ((p)localObject4).a(str, (String)localObject1, j, (p.a)localObject2);
        AppMethodBeat.o(138454);
        bool = true;
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.scanner.SubCoreScanner", localException, "", new Object[0]);
        e.a(this.pYX, parampu.cLZ.ctE);
      }
      AppMethodBeat.o(138454);
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.e.3
 * JD-Core Version:    0.6.2
 */