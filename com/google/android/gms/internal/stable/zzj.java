package com.google.android.gms.internal.stable;

import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzj extends ContentObserver
{
  zzj(Handler paramHandler)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    AppMethodBeat.i(90492);
    zzi.zzdv().set(true);
    AppMethodBeat.o(90492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzj
 * JD-Core Version:    0.6.2
 */