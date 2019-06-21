package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class u
{
  private final BroadcastReceiver.PendingResult bwr;
  private final ScheduledFuture<?> bws;
  final Intent intent;
  private boolean zzt;

  u(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult, ScheduledExecutorService paramScheduledExecutorService)
  {
    AppMethodBeat.i(108774);
    this.zzt = false;
    this.intent = paramIntent;
    this.bwr = paramPendingResult;
    this.bws = paramScheduledExecutorService.schedule(new v(this, paramIntent), 9500L, TimeUnit.MILLISECONDS);
    AppMethodBeat.o(108774);
  }

  final void finish()
  {
    try
    {
      AppMethodBeat.i(108775);
      if (!this.zzt)
      {
        this.bwr.finish();
        this.bws.cancel(false);
        this.zzt = true;
      }
      AppMethodBeat.o(108775);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.u
 * JD-Core Version:    0.6.2
 */