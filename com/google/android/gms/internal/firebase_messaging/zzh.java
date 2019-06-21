package com.google.android.gms.internal.firebase_messaging;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzh
{
  private static final zzi zze;
  private static final int zzf;

  static
  {
    AppMethodBeat.i(108680);
    Object localObject1 = null;
    try
    {
      localObject2 = zza();
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((Integer)localObject2).intValue() >= 19)
        {
          localObject1 = localObject2;
          localObject3 = new com/google/android/gms/internal/firebase_messaging/zzm;
          localObject1 = localObject2;
          ((zzm)localObject3).<init>();
        }
      }
      for (localObject1 = localObject2; ; localObject1 = localObject2)
      {
        zze = (zzi)localObject3;
        if (localObject1 != null)
          break label181;
        i = 1;
        zzf = i;
        AppMethodBeat.o(108680);
        return;
        localObject1 = localObject2;
        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"))
          break;
        i = 1;
        if (i == 0)
          break label166;
        localObject1 = localObject2;
        localObject3 = new zzl();
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject2 = System.err;
        Object localObject3 = zza.class.getName();
        ((PrintStream)localObject2).println(String.valueOf(localObject3).length() + 132 + "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy " + (String)localObject3 + "will be used. The error is: ");
        localThrowable.printStackTrace(System.err);
        localObject3 = new zza();
        continue;
        int i = 0;
        continue;
        label166: localObject1 = localObject2;
        localObject3 = new zza();
        localObject1 = localObject2;
        continue;
        label181: i = localObject1.intValue();
      }
    }
  }

  private static Integer zza()
  {
    AppMethodBeat.i(108679);
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      AppMethodBeat.o(108679);
      return localInteger;
    }
    catch (Exception localException)
    {
      while (true)
      {
        System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
        localException.printStackTrace(System.err);
        AppMethodBeat.o(108679);
        Object localObject = null;
      }
    }
  }

  public static void zza(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(108678);
    zze.zza(paramThrowable1, paramThrowable2);
    AppMethodBeat.o(108678);
  }

  static final class zza extends zzi
  {
    public final void zza(Throwable paramThrowable1, Throwable paramThrowable2)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzh
 * JD-Core Version:    0.6.2
 */