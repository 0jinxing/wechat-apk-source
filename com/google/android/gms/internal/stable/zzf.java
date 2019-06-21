package com.google.android.gms.internal.stable;

import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzf extends ContentObserver
{
  zzf(Handler paramHandler, zzh paramzzh)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    AppMethodBeat.i(90475);
    this.zzagr.zzagu.set(true);
    AppMethodBeat.o(90475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzf
 * JD-Core Version:    0.6.2
 */