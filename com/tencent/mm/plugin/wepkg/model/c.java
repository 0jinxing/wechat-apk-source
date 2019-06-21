package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static final String uWL;

  static
  {
    AppMethodBeat.i(63519);
    String str1 = e.eSj;
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    uWL = str2 + "wepkg/";
    AppMethodBeat.o(63519);
  }

  public static String ahQ(String paramString)
  {
    AppMethodBeat.i(63517);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(63517);
    }
    while (true)
    {
      return paramString;
      paramString = uWL + paramString + "/";
      AppMethodBeat.o(63517);
    }
  }

  public static String hx(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63518);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = "";
      AppMethodBeat.o(63518);
    }
    while (true)
    {
      return paramString1;
      paramString1 = ahQ(paramString1) + paramString2;
      AppMethodBeat.o(63518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.c
 * JD-Core Version:    0.6.2
 */