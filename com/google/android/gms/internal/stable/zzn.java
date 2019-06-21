package com.google.android.gms.internal.stable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzn extends WeakReference<Throwable>
{
  private final int zzahl;

  public zzn(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, paramReferenceQueue);
    AppMethodBeat.i(90498);
    if (paramThrowable == null)
    {
      paramThrowable = new NullPointerException("The referent cannot be null");
      AppMethodBeat.o(90498);
      throw paramThrowable;
    }
    this.zzahl = System.identityHashCode(paramThrowable);
    AppMethodBeat.o(90498);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(90499);
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
    {
      AppMethodBeat.o(90499);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(90499);
      }
      else
      {
        paramObject = (zzn)paramObject;
        if ((this.zzahl == paramObject.zzahl) && (get() == paramObject.get()))
        {
          AppMethodBeat.o(90499);
        }
        else
        {
          AppMethodBeat.o(90499);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.zzahl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzn
 * JD-Core Version:    0.6.2
 */