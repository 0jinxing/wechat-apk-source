package com.tencent.mm.aj;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.network.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

final class m$b
  implements az.a
{
  public byte[] frt = null;
  private final String fwM;
  private final String url;

  public m$b(String paramString1, String paramString2)
  {
    this.fwM = paramString1;
    this.url = paramString2;
  }

  public final boolean acf()
  {
    boolean bool = false;
    AppMethodBeat.i(11426);
    if ((bo.isNullOrNil(this.fwM)) || (bo.isNullOrNil(this.url)))
      AppMethodBeat.o(11426);
    while (true)
    {
      return bool;
      Object localObject1;
      Object localObject2;
      try
      {
        localObject1 = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject1).<init>();
        localObject2 = b.p(this.url, 3000, 5000);
        if (localObject2 == null)
        {
          AppMethodBeat.o(11426);
          continue;
        }
        byte[] arrayOfByte = new byte[1024];
        while (true)
        {
          int i = ((InputStream)localObject2).read(arrayOfByte);
          if (i == -1)
            break;
          ((ByteArrayOutputStream)localObject1).write(arrayOfByte, 0, i);
        }
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bo.l(localException1) });
        ab.e("MicroMsg.BrandLogic", "get url:" + this.url + " failed.");
        this.frt = null;
        AppMethodBeat.o(11426);
      }
      continue;
      ((InputStream)localObject2).close();
      this.frt = ((ByteArrayOutputStream)localObject1).toByteArray();
      ((ByteArrayOutputStream)localObject1).close();
      if (bo.cb(this.frt))
      {
        ab.e("MicroMsg.BrandLogic", "imgBuff null brand:" + this.fwM);
        AppMethodBeat.o(11426);
        continue;
      }
      String str1;
      String str2;
      if (g.RN().QY())
      {
        ao.a.flv.cm(this.frt.length, 0);
        localObject2 = z.afb();
        str1 = this.fwM;
        str2 = this.url;
        localObject1 = this.frt;
      }
      try
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = str1 + str2;
        localObject1 = d.bQ((byte[])localObject1);
        d.a((Bitmap)localObject1, 100, Bitmap.CompressFormat.PNG, m.a.rm((String)localObject3), false);
        ((m.a)localObject2).g(str1, (Bitmap)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("update brand icon for  ");
        ab.i("MicroMsg.BrandLogic", str1 + ", done");
        ((m.a)localObject2).fwJ.remove(str1);
        AppMethodBeat.o(11426);
        bool = true;
      }
      catch (Exception localException2)
      {
        while (true)
          ab.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bo.l(localException2) });
      }
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(11427);
    m.a locala = z.afb();
    int i = 0;
    try
    {
      while (i < locala.fwI.size())
      {
        locala.fwI.get(i);
        i++;
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bo.l(localException) });
      AppMethodBeat.o(11427);
    }
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.m.b
 * JD-Core Version:    0.6.2
 */