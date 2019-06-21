package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;

public abstract class bc
{
  private static bc a = null;

  public static bc a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null))
      {
        bc.a locala = new com/tencent/tencentmap/mapsdk/maps/a/bc$a;
        locala.<init>(paramContext);
        a = locala;
      }
      paramContext = a;
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public abstract byte[] a(String paramString, byte[] paramArrayOfByte, az paramaz);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bc
 * JD-Core Version:    0.6.2
 */