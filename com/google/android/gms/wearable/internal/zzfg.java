package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzfg
  implements NodeApi
{
  public final PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient)
  {
    AppMethodBeat.i(71315);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzfi(this, paramGoogleApiClient));
    AppMethodBeat.o(71315);
    return paramGoogleApiClient;
  }

  public final PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient)
  {
    AppMethodBeat.i(71314);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzfh(this, paramGoogleApiClient));
    AppMethodBeat.o(71314);
    return paramGoogleApiClient;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzfg
 * JD-Core Version:    0.6.2
 */