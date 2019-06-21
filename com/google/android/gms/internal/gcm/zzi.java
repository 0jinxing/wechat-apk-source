package com.google.android.gms.internal.gcm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzi extends WeakReference<Throwable>
{
  private final int zzdh;

  public zzi(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, paramReferenceQueue);
    AppMethodBeat.i(57628);
    if (paramThrowable == null)
    {
      paramThrowable = new NullPointerException("The referent cannot be null");
      AppMethodBeat.o(57628);
      throw paramThrowable;
    }
    this.zzdh = System.identityHashCode(paramThrowable);
    AppMethodBeat.o(57628);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(57629);
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
    {
      AppMethodBeat.o(57629);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(57629);
      }
      else
      {
        paramObject = (zzi)paramObject;
        if ((this.zzdh == paramObject.zzdh) && (get() == paramObject.get()))
        {
          AppMethodBeat.o(57629);
        }
        else
        {
          AppMethodBeat.o(57629);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.zzdh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gcm.zzi
 * JD-Core Version:    0.6.2
 */