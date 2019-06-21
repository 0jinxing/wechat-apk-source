package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbh
  implements BackgroundDetector.BackgroundStateChangeListener
{
  zzbh(GoogleApiManager paramGoogleApiManager)
  {
  }

  public final void onBackgroundStateChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(60836);
    GoogleApiManager.zza(this.zzjy).sendMessage(GoogleApiManager.zza(this.zzjy).obtainMessage(1, Boolean.valueOf(paramBoolean)));
    AppMethodBeat.o(60836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbh
 * JD-Core Version:    0.6.2
 */