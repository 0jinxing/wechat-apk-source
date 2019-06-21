package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzzy
{
  private static final zzzi zzbsw;
  private zzyw zzbsx;
  private volatile zzaal zzbsy;
  private volatile zzyw zzbsz;

  static
  {
    AppMethodBeat.i(3602);
    zzbsw = zzzi.zzte();
    AppMethodBeat.o(3602);
  }

  // ERROR //
  private final zzaal zzb(zzaal paramzzaal)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/google/android/gms/internal/measurement/zzzy:zzbsy	Lcom/google/android/gms/internal/measurement/zzaal;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 40	com/google/android/gms/internal/measurement/zzzy:zzbsy	Lcom/google/android/gms/internal/measurement/zzaal;
    //   13: ifnull +10 -> 23
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: getfield 40	com/google/android/gms/internal/measurement/zzzy:zzbsy	Lcom/google/android/gms/internal/measurement/zzaal;
    //   22: areturn
    //   23: aload_0
    //   24: aload_1
    //   25: putfield 40	com/google/android/gms/internal/measurement/zzzy:zzbsy	Lcom/google/android/gms/internal/measurement/zzaal;
    //   28: aload_0
    //   29: getstatic 45	com/google/android/gms/internal/measurement/zzyw:zzbqx	Lcom/google/android/gms/internal/measurement/zzyw;
    //   32: putfield 47	com/google/android/gms/internal/measurement/zzzy:zzbsz	Lcom/google/android/gms/internal/measurement/zzyw;
    //   35: aload_0
    //   36: monitorexit
    //   37: goto -19 -> 18
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_2
    //   46: aload_0
    //   47: aload_1
    //   48: putfield 40	com/google/android/gms/internal/measurement/zzzy:zzbsy	Lcom/google/android/gms/internal/measurement/zzaal;
    //   51: aload_0
    //   52: getstatic 45	com/google/android/gms/internal/measurement/zzyw:zzbqx	Lcom/google/android/gms/internal/measurement/zzyw;
    //   55: putfield 47	com/google/android/gms/internal/measurement/zzzy:zzbsz	Lcom/google/android/gms/internal/measurement/zzyw;
    //   58: goto -23 -> 35
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	40	finally
    //   23	35	40	finally
    //   35	37	40	finally
    //   41	43	40	finally
    //   46	58	40	finally
    //   23	35	45	com/google/android/gms/internal/measurement/zzzt
  }

  private final zzyw zztp()
  {
    AppMethodBeat.i(3601);
    zzyw localzzyw;
    if (this.zzbsz != null)
    {
      localzzyw = this.zzbsz;
      AppMethodBeat.o(3601);
    }
    while (true)
    {
      return localzzyw;
      try
      {
        if (this.zzbsz != null)
        {
          localzzyw = this.zzbsz;
          AppMethodBeat.o(3601);
          continue;
        }
        if (this.zzbsy == null);
        for (this.zzbsz = zzyw.zzbqx; ; this.zzbsz = this.zzbsy.zztp())
        {
          localzzyw = this.zzbsz;
          AppMethodBeat.o(3601);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(3601);
      }
    }
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(3600);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(3600);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzzy))
      {
        bool = false;
        AppMethodBeat.o(3600);
      }
      else
      {
        zzzy localzzzy = (zzzy)paramObject;
        paramObject = this.zzbsy;
        zzaal localzzaal = localzzzy.zzbsy;
        if ((paramObject == null) && (localzzaal == null))
        {
          bool = zztp().equals(localzzzy.zztp());
          AppMethodBeat.o(3600);
        }
        else if ((paramObject != null) && (localzzaal != null))
        {
          bool = paramObject.equals(localzzaal);
          AppMethodBeat.o(3600);
        }
        else if (paramObject != null)
        {
          bool = paramObject.equals(localzzzy.zzb(paramObject.zztz()));
          AppMethodBeat.o(3600);
        }
        else
        {
          bool = zzb(localzzaal.zztz()).equals(localzzaal);
          AppMethodBeat.o(3600);
        }
      }
    }
  }

  public int hashCode()
  {
    return 1;
  }

  public final zzaal zzc(zzaal paramzzaal)
  {
    zzaal localzzaal = this.zzbsy;
    this.zzbsx = null;
    this.zzbsz = null;
    this.zzbsy = paramzzaal;
    return localzzaal;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzzy
 * JD-Core Version:    0.6.2
 */