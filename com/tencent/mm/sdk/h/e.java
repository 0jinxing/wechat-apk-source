package com.tencent.mm.sdk.h;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e
{
  public static boolean hb(Context paramContext)
  {
    AppMethodBeat.i(65377);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65377);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramContext = paramContext.getClassLoader().loadClass("android.util.FtFeature");
        bool = ((Boolean)paramContext.getMethod("isFeatureSupport", new Class[] { Integer.TYPE }).invoke(paramContext, new Object[] { Integer.valueOf(32) })).booleanValue();
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(65377);
      }
      catch (ClassNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Vivo", paramContext, "hasCutOut, ClassNotFoundException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65377);
        bool = false;
      }
      catch (NoSuchMethodException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Vivo", paramContext, "hasCutOut, NoSuchMethodException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65377);
        bool = false;
      }
      catch (IllegalAccessException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Vivo", paramContext, "hasCutOut, IllegalAccessException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65377);
        bool = false;
      }
      catch (InvocationTargetException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.Vendor.Vivo", paramContext, "hasCutOut, InvocationTargetException!!", new Object[0]);
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65377);
        bool = false;
      }
      finally
      {
        ab.d("MicroMsg.Vendor.Vivo", "vivo hasCutOut: %s", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(65377);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.h.e
 * JD-Core Version:    0.6.2
 */