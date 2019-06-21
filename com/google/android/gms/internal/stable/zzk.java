package com.google.android.gms.internal.stable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzk
{
  private static final zzl zzahg;
  private static final int zzahh;

  static
  {
    AppMethodBeat.i(90495);
    Object localObject1 = null;
    try
    {
      Integer localInteger = zzdw();
      if (localInteger != null)
      {
        localObject1 = localInteger;
        if (localInteger.intValue() >= 19)
        {
          localObject1 = localInteger;
          localObject2 = new com/google/android/gms/internal/stable/zzp;
          localObject1 = localInteger;
          ((zzp)localObject2).<init>();
        }
      }
      for (localObject1 = localInteger; ; localObject1 = localInteger)
      {
        zzahg = (zzl)localObject2;
        if (localObject1 != null)
          break label182;
        i = 1;
        zzahh = i;
        AppMethodBeat.o(90495);
        return;
        localObject1 = localInteger;
        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"))
          break;
        i = 1;
        if (i == 0)
          break label167;
        localObject1 = localInteger;
        localObject2 = new zzo();
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject2 = System.err;
        String str = zzk.zza.class.getName();
        ((PrintStream)localObject2).println(String.valueOf(str).length() + 132 + "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy " + str + "will be used. The error is: ");
        localThrowable.printStackTrace(System.err);
        localObject2 = new zzk.zza();
        continue;
        int i = 0;
        continue;
        label167: localObject1 = localThrowable;
        localObject2 = new zzk.zza();
        localObject1 = localThrowable;
        continue;
        label182: i = localObject1.intValue();
      }
    }
  }

  public static void zza(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(90493);
    zzahg.zza(paramThrowable1, paramThrowable2);
    AppMethodBeat.o(90493);
  }

  private static Integer zzdw()
  {
    AppMethodBeat.i(90494);
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      AppMethodBeat.o(90494);
      return localInteger;
    }
    catch (Exception localException)
    {
      while (true)
      {
        System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
        localException.printStackTrace(System.err);
        AppMethodBeat.o(90494);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzk
 * JD-Core Version:    0.6.2
 */