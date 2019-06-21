package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzxg extends WeakReference<Throwable>
{
  private final int zzboc;

  public zzxg(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, null);
    AppMethodBeat.i(3541);
    if (paramThrowable == null)
    {
      paramThrowable = new NullPointerException("The referent cannot be null");
      AppMethodBeat.o(3541);
      throw paramThrowable;
    }
    this.zzboc = System.identityHashCode(paramThrowable);
    AppMethodBeat.o(3541);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(3542);
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
    {
      AppMethodBeat.o(3542);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(3542);
      }
      else
      {
        paramObject = (zzxg)paramObject;
        if ((this.zzboc == paramObject.zzboc) && (get() == paramObject.get()))
        {
          AppMethodBeat.o(3542);
        }
        else
        {
          AppMethodBeat.o(3542);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.zzboc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzxg
 * JD-Core Version:    0.6.2
 */