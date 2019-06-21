package com.tencent.mm.plugin.appbrand.game.c;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.magicbrush.a.c.c;
import com.tencent.magicbrush.handler.image.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.d.d.a;
import com.tencent.mm.plugin.appbrand.game.f.a.4;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

final class b$a
  implements com.github.henryye.nativeiv.a.a, a.a
{
  private final int hrp;
  private final int hrq;
  private com.github.henryye.nativeiv.a hrr;
  private boolean hrs;

  public b$a(boolean paramBoolean)
  {
    AppMethodBeat.i(130129);
    this.hrp = 2048;
    this.hrq = 2048;
    this.hrr = new com.github.henryye.nativeiv.a();
    com.github.henryye.nativeiv.a locala = this.hrr;
    BitmapType localBitmapType = BitmapType.Native;
    com.github.henryye.nativeiv.comm.a locala1 = new com.github.henryye.nativeiv.comm.a();
    locala.aLP.put(localBitmapType, locala1);
    this.hrs = paramBoolean;
    AppMethodBeat.o(130129);
  }

  private void a(String paramString1, d.a parama, String paramString2)
  {
    AppMethodBeat.i(130134);
    if (this.hrs)
      com.tencent.mm.plugin.appbrand.game.d.d.aAI().b(parama, paramString1 + ": " + paramString2);
    AppMethodBeat.o(130134);
  }

  public final IBitmap a(String paramString, InputStream paramInputStream)
  {
    AppMethodBeat.i(130131);
    if (paramInputStream == null)
    {
      a(paramString, d.a.hrR, ah.getContext().getString(2131297106));
      com.tencent.mm.plugin.appbrand.report.c.pI(7);
      paramString = null;
      AppMethodBeat.o(130131);
    }
    while (true)
    {
      return paramString;
      com.github.henryye.nativeiv.b localb = new com.github.henryye.nativeiv.b(this.hrr);
      localb.aLV = this;
      if (localb.aLU != null)
        localb.aLU.recycle();
      if (paramInputStream != null);
      for (Object localObject1 = com.github.henryye.nativeiv.b.c.g(paramInputStream); ; localObject1 = null)
      {
        if (localObject1 != null)
          break label123;
        a(paramString, d.a.hrR, ah.getContext().getString(2131297107));
        com.tencent.mm.plugin.appbrand.report.c.pI(5);
        paramString = null;
        AppMethodBeat.o(130131);
        break;
      }
      label123: if (((com.github.henryye.nativeiv.bitmap.d)localObject1).aMl == com.github.henryye.nativeiv.bitmap.c.aMj)
      {
        a(paramString, d.a.hrR, ah.getContext().getString(2131297102));
        com.tencent.mm.plugin.appbrand.report.c.pI(0);
        paramString = null;
        AppMethodBeat.o(130131);
        continue;
      }
      if ((((com.github.henryye.nativeiv.bitmap.d)localObject1).aMm > 2048L) || (((com.github.henryye.nativeiv.bitmap.d)localObject1).aMn > 2048L))
      {
        a(paramString, d.a.hrR, String.format(ah.getContext().getString(2131297108), new Object[] { Integer.valueOf(2048), Integer.valueOf(2048), Long.valueOf(((com.github.henryye.nativeiv.bitmap.d)localObject1).aMm), Long.valueOf(((com.github.henryye.nativeiv.bitmap.d)localObject1).aMn) }));
        com.tencent.mm.plugin.appbrand.report.c.pI(3);
        paramString = null;
        AppMethodBeat.o(130131);
        continue;
      }
      label302: Bitmap.Config localConfig;
      com.github.henryye.nativeiv.bitmap.c localc;
      int i;
      Object localObject3;
      Object localObject4;
      label394: label400: int j;
      if ((paramString != null) && ((paramString.startsWith("http://")) || (paramString.startsWith("https://"))))
      {
        ab.i("MicroMsg.MBImageHandlerRegistry", "hy: decode path:%s", new Object[] { paramString });
        localConfig = Bitmap.Config.ARGB_8888;
        localc = ((com.github.henryye.nativeiv.bitmap.d)localObject1).aMl;
        if (paramInputStream != null)
        {
          if (localb.aLT == null)
            break label522;
          localObject1 = localb.aLW;
          i = localb.hashCode();
          localObject3 = localb.aLT;
          localObject4 = (Map)((com.github.henryye.nativeiv.a)localObject1).aLQ.get(i);
          if ((localObject4 == null) || (((Map)localObject4).get(localObject3) == null))
            break label476;
          localObject1 = ((com.github.henryye.nativeiv.bitmap.b)((Map)localObject4).get(localObject3)).pz();
          localb.aLU = ((IBitmap)localObject1);
          j = 0;
        }
      }
      try
      {
        localb.aLU.decodeInputStream(paramInputStream, localConfig, localc);
        localObject1 = localb.aLU.provide();
        if (localObject1 != null);
        for (i = 1; ; i = 0)
        {
          if (j == 0)
            break label707;
          com.tencent.magicbrush.c.b(paramInputStream);
          paramString = localb.aLU;
          AppMethodBeat.o(130131);
          break;
          ab.i("MicroMsg.MBImageHandlerRegistry", "hy: decode path:%.100s", new Object[] { paramString });
          break label302;
          label476: if (((com.github.henryye.nativeiv.a)localObject1).aLP.get(localObject3) != null)
          {
            localObject1 = ((com.github.henryye.nativeiv.bitmap.b)((com.github.henryye.nativeiv.a)localObject1).aLP.get(localObject3)).pz();
            break label394;
          }
          localObject1 = null;
          break label394;
          label522: localObject3 = localb.aLW;
          i = localb.hashCode();
          localObject1 = (Map)((com.github.henryye.nativeiv.a)localObject3).aLQ.get(i);
          if (localObject1 == null)
            break label987;
          localObject1 = com.github.henryye.nativeiv.a.a(localc, (Map)localObject1);
          localObject4 = localObject1;
          if (localObject1 == null)
            localObject4 = com.github.henryye.nativeiv.a.a(localc, ((com.github.henryye.nativeiv.a)localObject3).aLP);
          localb.aLU = ((IBitmap)localObject4);
          break label400;
        }
      }
      catch (IOException localIOException1)
      {
        while (true)
        {
          c.c.a("Ni.BitmapWrapper", localIOException1, "hy: decodeInputStream", new Object[0]);
          localb.aLV.i(paramString, 1);
          j = 1;
          i = 0;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        while (true)
        {
          c.c.a("Ni.BitmapWrapper", localOutOfMemoryError1, "hy: decodeInputStream", new Object[0]);
          localb.aLV.i(paramString, 2);
          j = 1;
          i = 0;
        }
      }
      catch (Throwable localThrowable1)
      {
        while (true)
        {
          c.c.a("Ni.BitmapWrapper", localThrowable1, "hy: decode image exception", new Object[0]);
          localb.aLV.i(paramString, 3);
          i = 0;
          continue;
          try
          {
            label707: j = paramInputStream.available();
            l = j;
            if ((i == 0) && (localb.aLU.getType() == BitmapType.Native))
            {
              c.c.i("Ni.BitmapWrapper", "hy: decode switch to legacy mode!", new Object[0]);
              localb.aLU = ((com.github.henryye.nativeiv.bitmap.b)localb.aLW.aLP.get(BitmapType.Legacy)).pz();
            }
          }
          catch (IOException localIOException2)
          {
            try
            {
              localb.aLU.decodeInputStream(paramInputStream, localConfig, localc);
              localb.aLV.d(l, localb.aLU.getDecodeTime());
              if (localb.aLU.getType() == BitmapType.Legacy)
                localb.aLV.i(paramString, 4);
              if (localb.aLU.provide() == null)
              {
                localb.aLU.recycle();
                localb.aLU = null;
              }
              com.tencent.magicbrush.c.b(paramInputStream);
              continue;
              localIOException2 = localIOException2;
              c.c.a("Ni.BitmapWrapper", localIOException2, "", new Object[0]);
              long l = 0L;
            }
            catch (IOException localIOException3)
            {
              while (true)
              {
                c.c.a("Ni.BitmapWrapper", localIOException3, "hy: IOException when use legacy", new Object[0]);
                localb.aLV.i(paramString, 1);
              }
            }
            catch (OutOfMemoryError localOutOfMemoryError2)
            {
              while (true)
              {
                c.c.a("Ni.BitmapWrapper", localOutOfMemoryError2, "hy: decodeInputStream", new Object[0]);
                localb.aLV.i(paramString, 2);
              }
            }
            catch (Throwable localThrowable2)
            {
              while (true)
              {
                c.c.a("Ni.BitmapWrapper", localThrowable2, "hy: decode image exception", new Object[0]);
                localb.aLV.i(paramString, 3);
              }
            }
          }
          label987: Object localObject2 = null;
        }
      }
    }
  }

  public final void d(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(130133);
    com.tencent.mm.plugin.appbrand.game.f.a locala = com.tencent.mm.plugin.appbrand.game.f.a.aBG();
    ab.i("MicroMsg.MBNiReporter", "hy: size:%d,cost:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    com.tencent.mm.ce.a.post(new a.4(locala, paramLong1));
    locala.hug.add(Long.valueOf(paramLong2));
    if (paramLong2 >= 1000L)
      com.tencent.mm.plugin.appbrand.report.c.pI(11);
    AppMethodBeat.o(130133);
  }

  public final void destroy()
  {
    AppMethodBeat.i(130130);
    com.github.henryye.nativeiv.a locala = this.hrr;
    for (int i = 0; i < locala.aLQ.size(); i++)
    {
      int j = locala.aLQ.keyAt(i);
      com.github.henryye.nativeiv.a.b((Map)locala.aLQ.get(j));
    }
    com.github.henryye.nativeiv.a.b(locala.aLP);
    AppMethodBeat.o(130130);
  }

  public final void i(String paramString, int paramInt)
  {
    AppMethodBeat.i(130132);
    if (paramInt == 1)
    {
      ab.e("MicroMsg.MBImageHandlerRegistry", "IOEXCEPTION path:%s", new Object[] { paramString });
      a(paramString, d.a.hrR, ah.getContext().getString(2131297103));
      com.tencent.mm.plugin.appbrand.report.c.pI(4);
      AppMethodBeat.o(130132);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        ab.e("MicroMsg.MBImageHandlerRegistry", "OUTOFMEMORY path:%s", new Object[] { paramString });
        a(paramString, d.a.hrR, ah.getContext().getString(2131297104));
        com.tencent.mm.plugin.appbrand.report.c.pI(1);
        AppMethodBeat.o(130132);
      }
      else if (paramInt == 3)
      {
        ab.e("MicroMsg.MBImageHandlerRegistry", "NATIVE_DECODE_ERROR path:%s", new Object[] { paramString });
        a(paramString, d.a.hrR, ah.getContext().getString(2131297099));
        com.tencent.mm.plugin.appbrand.report.c.pI(5);
        AppMethodBeat.o(130132);
      }
      else
      {
        if (paramInt == 4)
        {
          ab.i("MicroMsg.MBImageHandlerRegistry", "USE_LEGACY path:%s", new Object[] { paramString });
          com.tencent.mm.plugin.appbrand.report.c.pI(8);
        }
        AppMethodBeat.o(130132);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.b.a
 * JD-Core Version:    0.6.2
 */