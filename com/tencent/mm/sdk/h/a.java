package com.tencent.mm.sdk.h;

import android.content.Context;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a
{
  private static Boolean xER = null;

  public static boolean dqu()
  {
    AppMethodBeat.i(65367);
    String str;
    if (xER == null)
    {
      str = Build.BRAND;
      ab.i("MicroMsg.Vendor.Huawei", "Build.BRAND = %s", new Object[] { str });
      if (!"HONOR".equalsIgnoreCase(str))
        break label59;
      xER = Boolean.TRUE;
    }
    while (true)
    {
      boolean bool = xER.booleanValue();
      AppMethodBeat.o(65367);
      return bool;
      label59: if ("HUAWEI".equalsIgnoreCase(str))
        xER = Boolean.TRUE;
      else
        xER = Boolean.FALSE;
    }
  }

  public static boolean gZ(Context paramContext)
  {
    AppMethodBeat.i(65366);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65366);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramContext = paramContext.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
        bool = ((Boolean)paramContext.getMethod("hasNotchInScreen", new Class[0]).invoke(paramContext, new Object[0])).booleanValue();
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(65366);
      }
      catch (ClassNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Huawei", paramContext, "hasCutOut, ClassNotFoundException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65366);
        bool = false;
      }
      catch (NoSuchMethodException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Huawei", paramContext, "hasCutOut, NoSuchMethodException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65366);
        bool = false;
      }
      catch (IllegalAccessException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Huawei", paramContext, "hasCutOut, IllegalAccessException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65366);
        bool = false;
      }
      catch (InvocationTargetException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Huawei", paramContext, "hasCutOut, InvocationTargetException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65366);
        bool = false;
      }
      finally
      {
        ab.d("MicroMsg.Vendor.Huawei", "huawei hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65366);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.h.a
 * JD-Core Version:    0.6.2
 */