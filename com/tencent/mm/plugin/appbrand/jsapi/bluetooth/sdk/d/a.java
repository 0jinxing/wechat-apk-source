package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static a hGh;

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94344);
    if (hGh != null)
    {
      String.format(paramString2, paramArrayOfObject);
      hGh.d(paramString1, paramString2, paramArrayOfObject);
    }
    AppMethodBeat.o(94344);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94341);
    if (hGh != null)
    {
      String.format(paramString2, paramArrayOfObject);
      hGh.e(paramString1, paramString2, paramArrayOfObject);
    }
    AppMethodBeat.o(94341);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94343);
    if (hGh != null)
    {
      String.format(paramString2, paramArrayOfObject);
      hGh.i(paramString1, paramString2, paramArrayOfObject);
    }
    AppMethodBeat.o(94343);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94342);
    if (hGh != null)
    {
      String.format(paramString2, paramArrayOfObject);
      hGh.w(paramString1, paramString2, paramArrayOfObject);
    }
    AppMethodBeat.o(94342);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void i(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void w(String paramString1, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a
 * JD-Core Version:    0.6.2
 */