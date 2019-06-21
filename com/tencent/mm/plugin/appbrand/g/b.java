package com.tencent.mm.plugin.appbrand.g;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;

public final class b
{
  public static void a(InputStream paramInputStream, String paramString)
  {
    AppMethodBeat.i(65354);
    if ((paramInputStream == null) || (!ct(paramString)))
      AppMethodBeat.o(65354);
    while (true)
    {
      return;
      paramString = new android.support.d.a(paramString);
      a.a(new android.support.d.a(paramInputStream), paramString);
      paramString.setAttribute("Orientation", null);
      paramString.setAttribute("ImageWidth", null);
      paramString.setAttribute("ThumbnailImageWidth", null);
      paramString.saveAttributes();
      AppMethodBeat.o(65354);
    }
  }

  public static void bY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65353);
    if ((!ct(paramString1)) || (!ct(paramString2)))
      AppMethodBeat.o(65353);
    while (true)
    {
      return;
      paramString2 = new android.support.d.a(paramString2);
      a.a(new android.support.d.a(paramString1), paramString2);
      paramString2.setAttribute("Orientation", null);
      paramString2.setAttribute("ImageWidth", null);
      paramString2.setAttribute("ThumbnailImageWidth", null);
      paramString2.saveAttributes();
      AppMethodBeat.o(65353);
    }
  }

  private static boolean ct(String paramString)
  {
    AppMethodBeat.i(65355);
    boolean bool;
    if ((!TextUtils.isEmpty(paramString)) && (new File(paramString).exists()))
    {
      bool = true;
      AppMethodBeat.o(65355);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65355);
    }
  }

  public static int j(InputStream paramInputStream)
  {
    int i = 0;
    AppMethodBeat.i(65352);
    if (paramInputStream == null)
      AppMethodBeat.o(65352);
    while (true)
    {
      return i;
      try
      {
        android.support.d.a locala = new android/support/d/a;
        locala.<init>(paramInputStream);
        int j = locala.getAttributeInt("Orientation", 1);
        i = j;
        AppMethodBeat.o(65352);
      }
      catch (Exception paramInputStream)
      {
        AppMethodBeat.o(65352);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.g.b
 * JD-Core Version:    0.6.2
 */