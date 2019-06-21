package com.tencent.mm.plugin.appbrand.game.c;

import android.graphics.Typeface;
import com.tencent.magicbrush.handler.glfont.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.lang.ref.WeakReference;

public final class a$1
  implements b
{
  public a$1(WeakReference paramWeakReference)
  {
  }

  private static String f(i parami, String paramString)
  {
    AppMethodBeat.i(130123);
    Object localObject = null;
    try
    {
      parami = parami.asE().yg(paramString);
      if (parami != null);
      for (parami = parami.getAbsolutePath(); ; parami = localObject)
      {
        AppMethodBeat.o(130123);
        return parami;
        ab.e("MBFontManagerRegistry", "Read [%s] from filesystem failed, no file", new Object[] { paramString });
      }
    }
    catch (Exception parami)
    {
      while (true)
      {
        ab.e("MBFontManagerRegistry", "Read [%s] from filesystem failed", new Object[] { paramString });
        parami = localObject;
      }
    }
  }

  private static String g(i parami, String paramString)
  {
    AppMethodBeat.i(130124);
    Object localObject = null;
    try
    {
      parami = aw.e(parami, paramString);
      AppMethodBeat.o(130124);
      return parami;
    }
    catch (Exception parami)
    {
      while (true)
      {
        ab.e("MBFontManagerRegistry", "Read [%s] from WxaPkgRuntimeReader failed", new Object[] { paramString });
        parami = localObject;
      }
    }
  }

  public final Typeface bT(String paramString)
  {
    Object localObject = null;
    Typeface localTypeface = null;
    AppMethodBeat.i(130121);
    ab.i("MBFontManagerRegistry", "loadFont at path[%s]", new Object[] { paramString });
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(130121);
      paramString = localTypeface;
    }
    while (true)
    {
      return paramString;
      try
      {
        localTypeface = Typeface.createFromFile(paramString);
        paramString = localTypeface;
        AppMethodBeat.o(130121);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MBFontManagerRegistry", "Create typeface from file failed. fontPath = [%s]", new Object[] { paramString });
          paramString = localObject;
        }
      }
    }
  }

  public final String bU(String paramString)
  {
    AppMethodBeat.i(130122);
    ab.i("MBFontManagerRegistry", "getFontPath at path[%s]", new Object[] { paramString });
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(130122);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      i locali = (i)this.hrn.get();
      if (locali == null)
      {
        ab.e("MBFontManagerRegistry", "hy: runtime released");
        AppMethodBeat.o(130122);
        paramString = null;
      }
      else
      {
        if (paramString.startsWith("wxfile://"));
        for (paramString = f(locali, paramString); ; paramString = g(locali, paramString))
        {
          if (paramString != null)
            break label110;
          AppMethodBeat.o(130122);
          paramString = null;
          break;
        }
        label110: AppMethodBeat.o(130122);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.a.1
 * JD-Core Version:    0.6.2
 */