package com.google.android.gms.internal.stable;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzp extends zzl
{
  public final void zza(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(90502);
    paramThrowable1.addSuppressed(paramThrowable2);
    AppMethodBeat.o(90502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzp
 * JD-Core Version:    0.6.2
 */