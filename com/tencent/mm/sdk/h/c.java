package com.tencent.mm.sdk.h;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class c
{
  public static boolean dqy()
  {
    AppMethodBeat.i(65375);
    try
    {
      bool = ((Boolean)Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
      AppMethodBeat.o(65375);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        if (Build.DEVICE.equals("mx2"))
        {
          bool = true;
          AppMethodBeat.o(65375);
        }
        else if ((Build.DEVICE.equals("mx")) || (Build.DEVICE.equals("m9")))
        {
          AppMethodBeat.o(65375);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(65375);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.h.c
 * JD-Core Version:    0.6.2
 */