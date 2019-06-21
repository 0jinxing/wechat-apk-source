package com.tencent.mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public abstract class l
{
  private static j fdH = new j();
  private static m fdI = new m();
  private static int fdJ = -1;

  public static l Xf()
  {
    Object localObject;
    if (fdJ == -1)
    {
      if (Xg())
        fdJ = 1;
    }
    else
      switch (fdJ)
      {
      default:
        localObject = fdI;
      case 1:
      case 2:
      }
    while (true)
    {
      return localObject;
      fdJ = 2;
      break;
      localObject = fdH;
      continue;
      localObject = fdI;
    }
  }

  public static boolean Xg()
  {
    boolean bool = d.iW(19);
    ab.i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(bo.dpH()), Boolean.valueOf(bool) });
    return bool;
  }

  protected static InputStream t(InputStream paramInputStream)
  {
    if (paramInputStream.markSupported());
    while (true)
    {
      return paramInputStream;
      if ((paramInputStream instanceof FileInputStream))
        paramInputStream = new com.tencent.mm.sdk.platformtools.l((FileInputStream)paramInputStream);
      else
        paramInputStream = new BufferedInputStream(paramInputStream);
    }
  }

  protected static void u(InputStream paramInputStream)
  {
    try
    {
      paramInputStream.reset();
      return;
    }
    catch (Exception paramInputStream)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.PlatformBitmapFactory", paramInputStream, "reset stream error: %s", new Object[] { paramInputStream.getMessage() });
    }
  }

  public abstract Bitmap a(String paramString, BitmapFactory.Options paramOptions);

  public abstract Bitmap a(String paramString, Rect paramRect, BitmapFactory.Options paramOptions);

  public abstract void v(Bitmap paramBitmap);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.l
 * JD-Core Version:    0.6.2
 */