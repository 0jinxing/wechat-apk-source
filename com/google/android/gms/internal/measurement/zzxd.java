package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzxd
{
  private static final zzxe zzbnx;
  private static final int zzbny;

  static
  {
    AppMethodBeat.i(3538);
    Object localObject1 = null;
    try
    {
      localObject2 = zzsd();
      Object localObject3;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((Integer)localObject2).intValue() >= 19)
        {
          localObject1 = localObject2;
          localObject3 = new com/google/android/gms/internal/measurement/zzxi;
          localObject1 = localObject2;
          ((zzxi)localObject3).<init>();
        }
      }
      for (localObject1 = localObject2; ; localObject1 = localObject2)
      {
        zzbnx = (zzxe)localObject3;
        if (localObject1 != null)
          break label184;
        i = 1;
        zzbny = i;
        AppMethodBeat.o(3538);
        return;
        localObject1 = localObject2;
        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"))
          break;
        i = 1;
        if (i == 0)
          break label169;
        localObject1 = localObject2;
        localObject3 = new zzxh();
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject2 = System.err;
        String str = zzxd.zza.class.getName();
        ((PrintStream)localObject2).println(String.valueOf(str).length() + 132 + "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy " + str + "will be used. The error is: ");
        localThrowable.printStackTrace(System.err);
        zzxd.zza localzza = new zzxd.zza();
        continue;
        int i = 0;
        continue;
        label169: localObject1 = localObject2;
        localzza = new zzxd.zza();
        localObject1 = localObject2;
        continue;
        label184: i = localObject1.intValue();
      }
    }
  }

  public static void zza(Throwable paramThrowable, PrintStream paramPrintStream)
  {
    AppMethodBeat.i(3536);
    zzbnx.zza(paramThrowable, paramPrintStream);
    AppMethodBeat.o(3536);
  }

  private static Integer zzsd()
  {
    AppMethodBeat.i(3537);
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      AppMethodBeat.o(3537);
      return localInteger;
    }
    catch (Exception localException)
    {
      while (true)
      {
        System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
        localException.printStackTrace(System.err);
        AppMethodBeat.o(3537);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzxd
 * JD-Core Version:    0.6.2
 */