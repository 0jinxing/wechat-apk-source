package com.google.android.gms.internal.firebase_messaging;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzk extends WeakReference<Throwable>
{
  private final int zzj;

  public zzk(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, paramReferenceQueue);
    AppMethodBeat.i(108683);
    if (paramThrowable == null)
    {
      paramThrowable = new NullPointerException("The referent cannot be null");
      AppMethodBeat.o(108683);
      throw paramThrowable;
    }
    this.zzj = System.identityHashCode(paramThrowable);
    AppMethodBeat.o(108683);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(108684);
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
    {
      AppMethodBeat.o(108684);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(108684);
      }
      else
      {
        paramObject = (zzk)paramObject;
        if ((this.zzj == paramObject.zzj) && (get() == paramObject.get()))
        {
          AppMethodBeat.o(108684);
        }
        else
        {
          AppMethodBeat.o(108684);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.zzj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzk
 * JD-Core Version:    0.6.2
 */