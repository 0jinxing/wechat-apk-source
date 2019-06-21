package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzf
  implements BaseGmsClient.BaseConnectionCallbacks
{
  zzf(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
  }

  public final void onConnected(Bundle paramBundle)
  {
    AppMethodBeat.i(61404);
    this.zztd.onConnected(paramBundle);
    AppMethodBeat.o(61404);
  }

  public final void onConnectionSuspended(int paramInt)
  {
    AppMethodBeat.i(61405);
    this.zztd.onConnectionSuspended(paramInt);
    AppMethodBeat.o(61405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzf
 * JD-Core Version:    0.6.2
 */