package com.tencent.magicbrush.handler.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Base64;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

public final class a
  implements IMBImageHandler
{
  private MBRuntime bSv;
  private List<a.d> bUb;
  private a.d bUc;
  private boolean bUd;
  private ConcurrentLinkedQueue<String> bUe;
  public a.a bUf;

  public a(MBRuntime paramMBRuntime, com.tencent.magicbrush.handler.a parama)
  {
    AppMethodBeat.i(115971);
    this.bUd = false;
    this.bUe = null;
    this.bUf = null;
    if (parama == null)
    {
      paramMBRuntime = new IllegalArgumentException("DefaultImageHandlerImpl accept null parameter");
      AppMethodBeat.o(115971);
      throw paramMBRuntime;
    }
    this.bSv = paramMBRuntime;
    this.bUb = new LinkedList();
    a(new a.c(this), false);
    a(new a.b(this), false);
    AppMethodBeat.o(115971);
  }

  private static int Z(float paramFloat)
  {
    float f;
    if (paramFloat >= 0.0F)
    {
      f = paramFloat;
      if (paramFloat <= 1.0F);
    }
    else
    {
      f = 0.92F;
    }
    return (int)(100.0F * f);
  }

  private static Bitmap.CompressFormat fU(int paramInt)
  {
    Bitmap.CompressFormat localCompressFormat;
    switch (paramInt)
    {
    default:
      localCompressFormat = Bitmap.CompressFormat.PNG;
    case 1:
    case 2:
    }
    while (true)
    {
      return localCompressFormat;
      localCompressFormat = Bitmap.CompressFormat.WEBP;
      continue;
      localCompressFormat = Bitmap.CompressFormat.JPEG;
    }
  }

  public final void a(a.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(115979);
    if (!paramBoolean)
    {
      this.bUb.add(paramd);
      AppMethodBeat.o(115979);
    }
    while (true)
    {
      return;
      this.bUc = paramd;
      AppMethodBeat.o(115979);
    }
  }

  public final String encodeToBase64(Bitmap paramBitmap, int paramInt, float paramFloat)
  {
    Object localObject = null;
    AppMethodBeat.i(115974);
    if ((paramBitmap == null) || (paramBitmap.getWidth() == 0) || (paramBitmap.getHeight() == 0) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(115974);
      paramBitmap = localObject;
    }
    while (true)
    {
      return paramBitmap;
      Bitmap.CompressFormat localCompressFormat = fU(paramInt);
      paramInt = Z(paramFloat);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      boolean bool = paramBitmap.compress(localCompressFormat, paramInt, localByteArrayOutputStream);
      try
      {
        localByteArrayOutputStream.close();
        if ((!bool) || (localByteArrayOutputStream.size() <= 0))
        {
          c.c.e("MagicBrush.DefaultImageHandlerImpl", "base64_encode Bitmap compress error.", new Object[0]);
          AppMethodBeat.o(115974);
          paramBitmap = localObject;
        }
      }
      catch (IOException paramBitmap)
      {
        while (true)
        {
          c.c.e("MagicBrush.DefaultImageHandlerImpl", "base64_encode IOException e %s", new Object[] { paramBitmap.toString() });
          bool = false;
        }
        paramBitmap = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 2);
        AppMethodBeat.o(115974);
      }
    }
  }

  public final byte[] encodeToBuffer(Bitmap paramBitmap, int paramInt, float paramFloat)
  {
    Object localObject = null;
    AppMethodBeat.i(115975);
    if ((paramBitmap == null) || (paramBitmap.getWidth() == 0) || (paramBitmap.getHeight() == 0) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(115975);
      paramBitmap = localObject;
    }
    while (true)
    {
      return paramBitmap;
      Bitmap.CompressFormat localCompressFormat = fU(paramInt);
      paramInt = Z(paramFloat);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      boolean bool = paramBitmap.compress(localCompressFormat, paramInt, localByteArrayOutputStream);
      try
      {
        localByteArrayOutputStream.close();
        if ((!bool) || (localByteArrayOutputStream.size() <= 0))
        {
          c.c.e("MagicBrush.DefaultImageHandlerImpl", "encodeToBuffer Bitmap compress error.", new Object[0]);
          AppMethodBeat.o(115975);
          paramBitmap = localObject;
        }
      }
      catch (IOException paramBitmap)
      {
        while (true)
        {
          c.c.e("MagicBrush.DefaultImageHandlerImpl", "encodeToBuffer IOException e %s", new Object[] { paramBitmap.toString() });
          bool = false;
        }
        paramBitmap = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(115975);
      }
    }
  }

  public final Bitmap getBitmap(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115973);
    Bitmap localBitmap = com.tencent.magicbrush.b.a.yJ().bUr.bK(paramInt1, paramInt2);
    AppMethodBeat.o(115973);
    return localBitmap;
  }

  public final void init()
  {
  }

  public final void loadBitmapAsync(String paramString)
  {
    AppMethodBeat.i(115978);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(115978);
    while (true)
    {
      return;
      paramString = new a.e(this.bSv, this, paramString);
      b.bUm.bUo.execute(paramString);
      AppMethodBeat.o(115978);
    }
  }

  public final IBitmap loadBitmapSync(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(115977);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(115977);
      paramString = (String)localObject1;
      return paramString;
    }
    Object localObject3 = this.bUb.iterator();
    a.d locald;
    do
    {
      if (!((Iterator)localObject3).hasNext())
        break;
      locald = (a.d)((Iterator)localObject3).next();
    }
    while (!locald.ca(paramString));
    while (true)
    {
      if (locald == null)
        locald = this.bUc;
      while (true)
        while (true)
        {
          if (locald == null)
          {
            c.c.e("MagicBrush.DefaultImageHandlerImpl", "No fit decoder found for %s", new Object[] { paramString });
            AppMethodBeat.o(115977);
            paramString = (String)localObject1;
            break;
          }
          try
          {
            while (true)
              try
              {
                if (this.bUd)
                {
                  if (this.bUe == null)
                  {
                    localObject1 = new java/util/concurrent/ConcurrentLinkedQueue;
                    ((ConcurrentLinkedQueue)localObject1).<init>();
                    this.bUe = ((ConcurrentLinkedQueue)localObject1);
                  }
                  this.bUe.add(paramString);
                }
                localObject3 = locald.cb(paramString);
                localObject1 = ((a)locald.bUg).bUf;
                if (localObject1 == null)
                {
                  paramString = null;
                  AppMethodBeat.o(115977);
                  break;
                }
              }
              finally
              {
                AppMethodBeat.o(115977);
              }
          }
          catch (Exception localException)
          {
            while (true)
            {
              c.c.e("MagicBrush.DefaultImageHandlerImpl", "ImageDecoder(%s) decode path[%s] error %s", new Object[] { locald, paramString, localException.toString() });
              paramString = null;
              continue;
              IBitmap localIBitmap = localException.a(paramString, (InputStream)localObject3);
              paramString = localIBitmap;
            }
          }
        }
      locald = null;
    }
  }

  public final void release()
  {
    AppMethodBeat.i(115972);
    try
    {
      if (this.bUf != null)
      {
        this.bUf.destroy();
        this.bUf = null;
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(115972);
    }
  }

  public final void releaseBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115976);
    if (paramBitmap == null)
      AppMethodBeat.o(115976);
    while (true)
    {
      return;
      c.c.i("MagicBrush.DefaultImageHandlerImpl", "recycle because releaseBitmap", new Object[0]);
      paramBitmap.recycle();
      AppMethodBeat.o(115976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.a
 * JD-Core Version:    0.6.2
 */