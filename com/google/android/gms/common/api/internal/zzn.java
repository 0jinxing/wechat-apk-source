package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzn extends GooglePlayServicesUpdatedReceiver.Callback
{
  zzn(zzm paramzzm, Dialog paramDialog)
  {
  }

  public final void zzv()
  {
    AppMethodBeat.i(60941);
    this.zzey.zzew.zzt();
    if (this.zzex.isShowing())
      this.zzex.dismiss();
    AppMethodBeat.o(60941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzn
 * JD-Core Version:    0.6.2
 */