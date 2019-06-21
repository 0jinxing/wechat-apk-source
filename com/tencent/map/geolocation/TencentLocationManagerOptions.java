package com.tencent.map.geolocation;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TencentLocationManagerOptions
{
  private static boolean a = true;
  private static String b = "";

  public static String getKey()
  {
    return b;
  }

  public static boolean isLoadLibraryEnabled()
  {
    return a;
  }

  public static boolean setKey(String paramString)
  {
    AppMethodBeat.i(136468);
    boolean bool;
    if ((paramString == null) || (paramString.equals("")))
    {
      bool = false;
      AppMethodBeat.o(136468);
    }
    while (true)
    {
      return bool;
      b = paramString;
      bool = true;
      AppMethodBeat.o(136468);
    }
  }

  public static void setLoadLibraryEnabled(boolean paramBoolean)
  {
    a = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.geolocation.TencentLocationManagerOptions
 * JD-Core Version:    0.6.2
 */