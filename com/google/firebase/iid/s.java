package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.Nullable;

@VisibleForTesting
final class s extends BroadcastReceiver
{

  @Nullable
  r bwj;

  public s(r paramr)
  {
    this.bwj = paramr;
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(108772);
    if (this.bwj == null)
      AppMethodBeat.o(108772);
    while (true)
    {
      return;
      if (!this.bwj.zzaj())
      {
        AppMethodBeat.o(108772);
      }
      else
      {
        FirebaseInstanceId.uH();
        FirebaseInstanceId.c(this.bwj, 0L);
        this.bwj.getContext().unregisterReceiver(this);
        this.bwj = null;
        AppMethodBeat.o(108772);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.s
 * JD-Core Version:    0.6.2
 */