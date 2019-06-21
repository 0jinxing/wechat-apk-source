package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzwq extends ContentObserver
{
  zzwq(zzwp paramzzwp, Handler paramHandler)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    AppMethodBeat.i(69760);
    this.zzbnb.zzru();
    zzwp.zza(this.zzbnb);
    AppMethodBeat.o(69760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwq
 * JD-Core Version:    0.6.2
 */