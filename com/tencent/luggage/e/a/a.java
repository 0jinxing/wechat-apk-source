package com.tencent.luggage.e.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.FileInputStream;
import java.io.InputStream;

public final class a
{
  public static int bJ(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(65347);
    int j;
    if (!e.ct(paramString))
    {
      ab.e("Luggage.ImageInfoUtils", "getExifOrientation err ");
      AppMethodBeat.o(65347);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(paramString);
        j = b.j(localFileInputStream);
        AppMethodBeat.o(65347);
      }
      catch (Exception localException)
      {
        ab.e("Luggage.ImageInfoUtils", "getExifOrientation, path = %s, e = %s", new Object[] { paramString, localException });
        AppMethodBeat.o(65347);
        j = i;
      }
    }
  }

  public static boolean e(BitmapFactory.Options paramOptions)
  {
    boolean bool = false;
    AppMethodBeat.i(65348);
    if (paramOptions == null)
      AppMethodBeat.o(65348);
    while (true)
    {
      return bool;
      paramOptions = paramOptions.outMimeType;
      if (paramOptions == null)
      {
        AppMethodBeat.o(65348);
      }
      else
      {
        paramOptions = paramOptions.toLowerCase();
        if (paramOptions.indexOf("jpg") >= 0)
        {
          AppMethodBeat.o(65348);
          bool = true;
        }
        else if (paramOptions.indexOf("jpeg") >= 0)
        {
          AppMethodBeat.o(65348);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(65348);
        }
      }
    }
  }

  public static String f(BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(65349);
    paramOptions = paramOptions.outMimeType;
    if (paramOptions == null)
    {
      paramOptions = "unknown";
      AppMethodBeat.o(65349);
    }
    while (true)
    {
      return paramOptions;
      paramOptions = paramOptions.toLowerCase();
      if (paramOptions.indexOf("jpg") >= 0)
      {
        paramOptions = "jpeg";
        AppMethodBeat.o(65349);
      }
      else if (paramOptions.indexOf("jpeg") >= 0)
      {
        paramOptions = "jpeg";
        AppMethodBeat.o(65349);
      }
      else if (paramOptions.indexOf("png") >= 0)
      {
        paramOptions = "png";
        AppMethodBeat.o(65349);
      }
      else if (paramOptions.indexOf("gif") >= 0)
      {
        paramOptions = "gif";
        AppMethodBeat.o(65349);
      }
      else
      {
        paramOptions = "unknown";
        AppMethodBeat.o(65349);
      }
    }
  }

  public static String fO(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "up";
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 0:
    }
    while (true)
    {
      return str;
      str = "up";
      continue;
      str = "up-mirrored";
      continue;
      str = "down";
      continue;
      str = "down-mirrored";
      continue;
      str = "left-mirrored";
      continue;
      str = "right";
      continue;
      str = "right-mirrored";
      continue;
      str = "left";
      continue;
      str = "up";
    }
  }

  public static int j(InputStream paramInputStream)
  {
    int i = 0;
    AppMethodBeat.i(65346);
    try
    {
      j = b.j(paramInputStream);
      AppMethodBeat.o(65346);
      return j;
    }
    catch (Exception paramInputStream)
    {
      while (true)
      {
        ab.e("Luggage.ImageInfoUtils", "getExifOrientation with stream, e = %s", new Object[] { paramInputStream });
        AppMethodBeat.o(65346);
        int j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.e.a.a
 * JD-Core Version:    0.6.2
 */