package com.tencent.map.geolocation;

import android.content.Context;
import c.t.m.c.q;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TencentLocationUtils
{
  private TencentLocationUtils()
  {
    AppMethodBeat.i(136478);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(136478);
    throw localUnsupportedOperationException;
  }

  public static boolean contains(TencentLocation paramTencentLocation1, double paramDouble, TencentLocation paramTencentLocation2)
  {
    AppMethodBeat.i(136481);
    if ((paramTencentLocation1 == null) || (paramTencentLocation2 == null))
    {
      paramTencentLocation1 = new NullPointerException();
      AppMethodBeat.o(136481);
      throw paramTencentLocation1;
    }
    boolean bool;
    if (distanceBetween(paramTencentLocation1, paramTencentLocation2) <= paramDouble)
    {
      bool = true;
      AppMethodBeat.o(136481);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136481);
    }
  }

  public static double distanceBetween(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    AppMethodBeat.i(136480);
    paramDouble1 = q.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
    AppMethodBeat.o(136480);
    return paramDouble1;
  }

  public static double distanceBetween(TencentLocation paramTencentLocation1, TencentLocation paramTencentLocation2)
  {
    AppMethodBeat.i(136479);
    if ((paramTencentLocation1 == null) || (paramTencentLocation2 == null))
    {
      paramTencentLocation1 = new NullPointerException();
      AppMethodBeat.o(136479);
      throw paramTencentLocation1;
    }
    double d = q.a(paramTencentLocation1.getLatitude(), paramTencentLocation1.getLongitude(), paramTencentLocation2.getLatitude(), paramTencentLocation2.getLongitude());
    AppMethodBeat.o(136479);
    return d;
  }

  public static boolean isFromGps(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136483);
    boolean bool;
    if (paramTencentLocation == null)
    {
      bool = false;
      AppMethodBeat.o(136483);
    }
    while (true)
    {
      return bool;
      bool = "gps".equals(paramTencentLocation.getProvider());
      AppMethodBeat.o(136483);
    }
  }

  public static boolean isFromNetwork(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136484);
    boolean bool;
    if (paramTencentLocation == null)
    {
      bool = false;
      AppMethodBeat.o(136484);
    }
    while (true)
    {
      return bool;
      bool = "network".equals(paramTencentLocation.getProvider());
      AppMethodBeat.o(136484);
    }
  }

  public static boolean isSupportGps(Context paramContext)
  {
    AppMethodBeat.i(136485);
    if (paramContext == null)
    {
      paramContext = new NullPointerException();
      AppMethodBeat.o(136485);
      throw paramContext;
    }
    boolean bool;
    if ((q.g(paramContext) & 0x10) == 0)
    {
      bool = true;
      AppMethodBeat.o(136485);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136485);
    }
  }

  public static boolean wgs84ToGcj02(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(136482);
    if ((paramArrayOfDouble1 != null) && (paramArrayOfDouble2 != null));
    try
    {
      if (paramArrayOfDouble1.length == 2)
      {
        int i = paramArrayOfDouble2.length;
        if (i == 2);
      }
      else
      {
        AppMethodBeat.o(136482);
      }
      while (true)
      {
        return bool1;
        boolean bool2 = TencentExtraKeys.wgs84ToGcj02(paramArrayOfDouble1, paramArrayOfDouble2);
        bool1 = bool2;
        AppMethodBeat.o(136482);
      }
    }
    catch (Exception paramArrayOfDouble1)
    {
      while (true)
        AppMethodBeat.o(136482);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.map.geolocation.TencentLocationUtils
 * JD-Core Version:    0.6.2
 */