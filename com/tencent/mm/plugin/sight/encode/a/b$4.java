package com.tencent.mm.plugin.sight.encode.a;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.List;

public final class b$4
  implements Runnable
{
  public b$4(b paramb, String paramString1, List paramList, String paramString2, b.a parama, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70361);
    String str1 = com.tencent.mm.plugin.sight.base.d.WO(this.hPW);
    Object localObject1;
    if (!com.tencent.mm.a.e.ct(str1))
    {
      ab.w("MicroMsg.SightRecorderHelper", "thumb data not found, try to create thumb");
      localObject1 = com.tencent.mm.plugin.sight.base.d.ag(this.hPW, 320, 240);
    }
    try
    {
      com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, 60, Bitmap.CompressFormat.JPEG, str1, true);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)this.qAr.get(0));
      for (i = 1; i < this.qAr.size(); i++)
      {
        ((StringBuilder)localObject1).append(',');
        ((StringBuilder)localObject1).append((String)this.qAr.get(i));
      }
    }
    catch (Exception localException)
    {
      int i;
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SightRecorderHelper", localException, "", new Object[0]);
        ab.e("MicroMsg.SightRecorderHelper", "save bitmap to image error");
      }
      String str2 = localException.toString();
      Object localObject2 = o.all().fni.a("SELECT MAX(masssendid) FROM videoinfo2", null, 2);
      long l1;
      label183: String str3;
      Object localObject3;
      String str4;
      long l2;
      if (localObject2 == null)
      {
        l1 = 0L;
        l1 = 1L + l1;
        i = 0;
        if (i >= this.qAr.size())
          break label809;
        str3 = (String)this.qAr.get(i);
        ab.i("MicroMsg.SightRecorderHelper", "do prepare sight message for %s, massSendId %d, massSendList %s, videoMD5 %s", new Object[] { str3, Long.valueOf(l1), str2, this.qAs });
        localObject2 = t.ug(str3);
        o.all();
        localObject3 = t.ui((String)localObject2);
        o.all();
        str4 = t.uh((String)localObject2);
        l2 = com.tencent.mm.a.e.y(str1, (String)localObject3);
        ab.i("MicroMsg.SightRecorderHelper", "prepare to send sight to %s, sightThumbSize %d bytes", new Object[] { str3, Long.valueOf(l2) });
        if (l2 > 0L)
          break label388;
        ab.e("MicroMsg.SightRecorderHelper", "copy remux thumb path from %s to %s error, index %d", new Object[] { str1, localObject3, Integer.valueOf(i) });
        b.a(this.qAo, i);
      }
      while (true)
      {
        i++;
        break label183;
        l1 = 0L;
        if (((Cursor)localObject2).moveToFirst())
          l1 = ((Cursor)localObject2).getLong(0);
        ((Cursor)localObject2).close();
        break;
        label388: l2 = com.tencent.mm.a.e.y(this.hPW, str4);
        ab.i("MicroMsg.SightRecorderHelper", "prepare to send sight to %s, sightFileSize %d bytes", new Object[] { str3, Long.valueOf(l2) });
        if (l2 <= 0L)
        {
          ab.e("MicroMsg.SightRecorderHelper", "copy remux video path from %s to %s error, index %d", new Object[] { this.hPW, str4, Integer.valueOf(i) });
          b.a(this.qAo, i);
        }
        else
        {
          int j = this.qAp;
          str4 = this.qAs;
          localObject3 = new s();
          ((s)localObject3).fileName = ((String)localObject2);
          ((s)localObject3).fXd = j;
          ((s)localObject3).cIS = str3;
          ((s)localObject3).fWW = ((String)g.RP().Ry().get(2, ""));
          ((s)localObject3).createTime = bo.anT();
          ((s)localObject3).fXb = bo.anT();
          ((s)localObject3).fXj = null;
          ((s)localObject3).fUG = null;
          ((s)localObject3).fXh = 0;
          ((s)localObject3).fXk = 3;
          o.all();
          j = t.uj(t.uh((String)localObject2));
          if (j <= 0)
          {
            ab.e("MicroMsg.VideoLogic", "initMassSendSight::get Video size failed:".concat(String.valueOf(localObject2)));
          }
          else
          {
            ((s)localObject3).frO = j;
            o.all();
            str3 = t.ui((String)localObject2);
            j = t.uj(str3);
            if (j <= 0)
            {
              ab.e("MicroMsg.VideoLogic", "get Thumb size failed :" + str3 + " size:" + j);
            }
            else
            {
              ((s)localObject3).fXa = j;
              ab.i("MicroMsg.VideoLogic", "initMassSendSight file:" + (String)localObject2 + " thumbsize:" + ((s)localObject3).fXa + " videosize:" + ((s)localObject3).frO);
              ((s)localObject3).status = 200;
              ab.i("MicroMsg.VideoLogic", "massSendId %d, videoMD5 %s, massSendList %s", new Object[] { Long.valueOf(l1), str4, str2 });
              ((s)localObject3).fXl = str2;
              ((s)localObject3).fVs = l1;
              ((s)localObject3).cMW = str4;
              o.all().b((s)localObject3);
            }
          }
        }
      }
      label809: u.fV(l1);
      com.tencent.mm.a.e.deleteFile(this.hPW);
      com.tencent.mm.a.e.deleteFile(str1);
      AppMethodBeat.o(70361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.a.b.4
 * JD-Core Version:    0.6.2
 */