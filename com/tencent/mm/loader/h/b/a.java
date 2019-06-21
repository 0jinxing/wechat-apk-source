package com.tencent.mm.loader.h.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vfs.e;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class a
  implements Closeable
{
  InputStream azC = null;
  byte[] eSb = null;
  d eSc;
  c eSd;
  Object eSe;

  private a(d paramd, c paramc, Object paramObject)
  {
    this.eSc = paramd;
    this.eSd = paramc;
    this.eSe = paramObject;
  }

  public static a L(byte[] paramArrayOfByte)
  {
    return new a(new a.d(paramArrayOfByte), new b(paramArrayOfByte), null);
  }

  private static <T extends d,  extends c> a a(T paramT, Object paramObject)
  {
    return new a(paramT, (c)paramT, paramObject);
  }

  public static a a(InputStream paramInputStream1, InputStream paramInputStream2)
  {
    return new a(new a.e(paramInputStream1), new c(paramInputStream2), null);
  }

  public static a i(String paramString, Object paramObject)
  {
    return a(new a(paramString), paramObject);
  }

  public static a lT(String paramString)
  {
    return i(paramString, null);
  }

  public static a lU(String paramString)
  {
    return a(ah.getContext().getAssets().open(paramString), ah.getContext().getAssets().open(paramString));
  }

  public final InputStream Uj()
  {
    InputStream localInputStream;
    if (this.azC != null)
      localInputStream = this.azC;
    while (true)
    {
      return localInputStream;
      if (this.eSc != null)
      {
        this.azC = this.eSc.Uj();
        localInputStream = this.azC;
      }
      else
      {
        localInputStream = null;
      }
    }
  }

  public final void close()
  {
    if (this.eSc != null)
      this.eSc.close();
    if (this.eSd != null)
      this.eSd.close();
  }

  static final class a
    implements c, d
  {
    InputStream azv = null;
    String mFilePath;

    public a(String paramString)
    {
      this.mFilePath = paramString;
    }

    public final InputStream Uj()
    {
      try
      {
        this.azv = e.openRead(this.mFilePath);
        InputStream localInputStream = this.azv;
        return localInputStream;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        while (true)
          Object localObject = null;
      }
    }

    public final void close()
    {
      a.s(this.azv);
    }
  }

  static final class b
    implements c
  {
    byte[] mBuf;

    public b(byte[] paramArrayOfByte)
    {
      this.mBuf = paramArrayOfByte;
    }

    public final void close()
    {
    }
  }

  static final class c
    implements c
  {
    InputStream eSf;

    public c(InputStream paramInputStream)
    {
      this.eSf = paramInputStream;
    }

    public final void close()
    {
      a.s(this.eSf);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.b.a
 * JD-Core Version:    0.6.2
 */