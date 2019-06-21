package com.samsung.android.sdk;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SsdkVendorCheck
{
  private static String strBrand = Build.BRAND;
  private static String strManufacturer = Build.MANUFACTURER;

  public static boolean isSamsungDevice()
  {
    boolean bool = false;
    AppMethodBeat.i(123523);
    if ((strBrand == null) || (strManufacturer == null))
      AppMethodBeat.o(123523);
    while (true)
    {
      return bool;
      if ((strBrand.compareToIgnoreCase("Samsung") != 0) && (strManufacturer.compareToIgnoreCase("Samsung") != 0))
      {
        AppMethodBeat.o(123523);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(123523);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.SsdkVendorCheck
 * JD-Core Version:    0.6.2
 */