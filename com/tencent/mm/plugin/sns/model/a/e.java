package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends f
{
  public e(c.a parama, a parama1)
  {
    super(parama, parama1);
  }

  public final boolean cor()
  {
    AppMethodBeat.i(36750);
    long l1 = -1L;
    int i;
    String str1;
    label50: BitmapFactory.Options localOptions;
    Object localObject;
    label123: long l2;
    if ((!bo.isNullOrNil(this.qOa.qFR)) && (!bo.isNullOrNil(this.qOa.qFS)))
    {
      i = 1;
      if (i == 0)
        break label618;
      str1 = this.qOa.qFS;
      String str2 = this.qOa.getPath() + this.qOa.cop();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str2, localOptions);
      if (localOptions.outMimeType == null)
        break label630;
      localObject = localOptions.outMimeType.toLowerCase();
      l2 = com.tencent.mm.vfs.e.asZ(str2);
      if ((!this.qOB) && (!((String)localObject).contains("webp")))
        break label637;
      i = 0;
    }
    while (true)
    {
      label149: label176: boolean bool;
      label194: long l3;
      switch (i)
      {
      default:
        localObject = new StringBuilder("donwload big pic isWebp ");
        if (i == 0)
        {
          bool = true;
          ab.i("MicroMsg.SnsDownloadImage", bool);
          l3 = com.tencent.mm.vfs.e.asZ(this.qOa.getPath() + str1);
          h.pYm.e(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l3), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
          if (this.qOa.qNV == 3)
            break label1442;
        }
        break;
      case 0:
      case 1:
      case 2:
      }
      label1442: for (i = 1; ; i = 0)
      {
        int j = i;
        if (this.qOa.qFJ != null)
        {
          j = i;
          if (this.qOa.qFJ.qFQ != 4)
          {
            j = i;
            if (this.qOa.qFJ.qFQ != 5)
              j = 0;
          }
        }
        if (j != 0)
        {
          localObject = i.e(this.cNr);
          if (com.tencent.mm.vfs.e.ct(this.qOa.getPath() + (String)localObject))
            com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + (String)localObject);
          l1 = bo.yz();
          s.a(this.qOa.getPath(), str1, (String)localObject, af.cnO());
          l1 = bo.az(l1);
          com.tencent.mm.vfs.e.asZ(this.qOa.getPath() + (String)localObject);
          h.pYm.e(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l3), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
          localObject = i.f(this.cNr);
          if (!com.tencent.mm.vfs.e.ct(this.qOa.getPath() + (String)localObject))
            s.b(this.qOa.getPath(), str1, (String)localObject, af.cnN());
        }
        AppMethodBeat.o(36750);
        return true;
        i = 0;
        break;
        label618: str1 = i.l(this.cNr);
        break label50;
        label630: localObject = "";
        break label123;
        label637: if ((!this.qOC) && (!((String)localObject).contains("vcodec")))
          break label1447;
        i = 1;
        break label149;
        h.pYm.a(22L, 64L, 1L, true);
        com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + str1);
        l1 = bo.yz();
        s.e(this.qOa.getPath(), this.qOa.getPath() + this.qOa.cop(), str1, false);
        l3 = bo.az(l1);
        com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + this.qOa.cop());
        l1 = bo.az(l1);
        c.a(this.qOa.getPath() + str1, this.qOa.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l2, l3);
        break label176;
        ab.i("MicroMsg.SnsDownloadImage", "found vcodec:%s, reencoded.", new Object[] { this.qOa.getPath() + this.qOa.cop() });
        com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + str1);
        l1 = bo.yz();
        s.e(this.qOa.getPath(), this.qOa.getPath() + this.qOa.cop(), str1, false);
        l3 = bo.az(l1);
        com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + this.qOa.cop());
        l1 = bo.az(l1);
        c.a(this.qOa.getPath() + str1, this.qOa.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l2, l3);
        break label176;
        l3 = -1L;
        if (i.Xp(this.qOa.getPath() + this.qOa.cop()))
        {
          ab.w("MicroMsg.SnsDownloadImage", "the " + this.qOa.cHr + " is too max ! " + this.qOa.url);
          com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + str1);
          l1 = bo.yz();
          s.aj(this.qOa.getPath(), this.qOa.getPath() + this.qOa.cop(), str1);
          l3 = bo.az(l1);
          com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + this.qOa.cop());
        }
        for (l1 = bo.az(l1); ; l1 = 0L)
        {
          j = -1;
          if ((((String)localObject).contains("jpg")) || (((String)localObject).contains("jpeg")))
          {
            int k = MMNativeJpeg.queryQuality(this.qOa.getPath() + str1);
            j = k;
            if (k == 0)
              j = -1;
          }
          c.a(this.qOa.getPath() + str1, this.qOa.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, j, l2, l3);
          break;
          com.tencent.mm.vfs.e.h(this.qOa.getPath(), this.qOa.cop(), str1);
        }
        bool = false;
        break label194;
      }
      label1447: i = 2;
    }
  }

  protected final int cos()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.e
 * JD-Core Version:    0.6.2
 */