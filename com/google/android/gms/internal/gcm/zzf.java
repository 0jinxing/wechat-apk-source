package com.google.android.gms.internal.gcm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzf
{
  private static final zzg zzdc;
  private static final int zzdd;

  static
  {
    AppMethodBeat.i(57625);
    Object localObject1 = null;
    try
    {
      Integer localInteger = zzy();
      if (localInteger != null)
      {
        localObject1 = localInteger;
        if (localInteger.intValue() >= 19)
        {
          localObject1 = localInteger;
          localObject2 = new com/google/android/gms/internal/gcm/zzk;
          localObject1 = localInteger;
          ((zzk)localObject2).<init>();
        }
      }
      for (localObject1 = localInteger; ; localObject1 = localInteger)
      {
        zzdc = (zzg)localObject2;
        if (localObject1 != null)
          break label181;
        i = 1;
        zzdd = i;
        AppMethodBeat.o(57625);
        return;
        localObject1 = localInteger;
        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"))
          break;
        i = 1;
        if (i == 0)
          break label166;
        localObject1 = localInteger;
        localObject2 = new zzj();
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        PrintStream localPrintStream = System.err;
        Object localObject2 = zzf.zzd.class.getName();
        localPrintStream.println(String.valueOf(localObject2).length() + 132 + "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy " + (String)localObject2 + "will be used. The error is: ");
        localThrowable.printStackTrace(System.err);
        localObject2 = new zzf.zzd();
        continue;
        int i = 0;
        continue;
        label166: localObject1 = localThrowable;
        localObject2 = new zzf.zzd();
        localObject1 = localThrowable;
        continue;
        label181: i = localObject1.intValue();
      }
    }
  }

  public static void zzd(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(57623);
    zzdc.zzd(paramThrowable1, paramThrowable2);
    AppMethodBeat.o(57623);
  }

  private static Integer zzy()
  {
    AppMethodBeat.i(57624);
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      AppMethodBeat.o(57624);
      return localInteger;
    }
    catch (Exception localException)
    {
      while (true)
      {
        System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
        localException.printStackTrace(System.err);
        AppMethodBeat.o(57624);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gcm.zzf
 * JD-Core Version:    0.6.2
 */