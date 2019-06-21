package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class i
{
  private static Boolean a = Boolean.FALSE;

  public static void a(String paramString)
  {
    AppMethodBeat.i(101228);
    a(null, paramString, 'e');
    AppMethodBeat.o(101228);
  }

  public static void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101227);
    a(paramString1, paramString2, 'v');
    AppMethodBeat.o(101227);
  }

  private static void a(String paramString1, String paramString2, char paramChar)
  {
    AppMethodBeat.i(101229);
    if (!a.booleanValue())
      AppMethodBeat.o(101229);
    while (true)
    {
      return;
      TextUtils.isEmpty(paramString1);
      AppMethodBeat.o(101229);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.i
 * JD-Core Version:    0.6.2
 */