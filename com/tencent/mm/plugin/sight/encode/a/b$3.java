package com.tencent.mm.plugin.sight.encode.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class b$3
  implements Runnable
{
  public b$3(b paramb, String paramString1, b.a parama, String paramString2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70360);
    ab.i("MicroMsg.SightRecorderHelper", "do prepare sight message for %s", new Object[] { this.cgl });
    Object localObject1 = t.ug(this.cgl);
    if (-1L == u.a((String)localObject1, this.cgl, null, 62))
    {
      ab.e("MicroMsg.SightRecorderHelper", "prepare sight error, filename %s", new Object[] { localObject1 });
      b.a(this.qAo, -1);
      AppMethodBeat.o(70360);
    }
    while (true)
    {
      return;
      String str = com.tencent.mm.plugin.sight.base.d.WO(this.hPW);
      Object localObject2;
      if (!e.ct(str))
      {
        ab.w("MicroMsg.SightRecorderHelper", "thumb data not found, try to create thumb");
        localObject2 = com.tencent.mm.plugin.sight.base.d.ag(this.hPW, 320, 240);
      }
      try
      {
        com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, 60, Bitmap.CompressFormat.JPEG, str, true);
        o.all();
        e.y(str, t.ui((String)localObject1));
        o.all();
        localObject2 = t.uh((String)localObject1);
        long l = e.y(this.hPW, (String)localObject2);
        ab.i("MicroMsg.SightRecorderHelper", "prepare to send sight to %s, sightFileSize %d bytes", new Object[] { this.cgl, Long.valueOf(l) });
        if (l <= 0L)
        {
          ab.e("MicroMsg.SightRecorderHelper", "copy remux video path from %s to %s error", new Object[] { this.hPW, localObject2 });
          b.a(this.qAo, -1);
          u.um((String)localObject1);
          AppMethodBeat.o(70360);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SightRecorderHelper", localException, "", new Object[0]);
          ab.e("MicroMsg.SightRecorderHelper", "save bitmap to image error");
        }
        u.n((String)localObject1, this.qAp, 62);
        u.uo((String)localObject1);
        localObject1 = this.qAo;
        if (localObject1 != null)
          al.d(new b.2((b.a)localObject1));
        e.deleteFile(this.hPW);
        e.deleteFile(str);
        AppMethodBeat.o(70360);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.a.b.3
 * JD-Core Version:    0.6.2
 */