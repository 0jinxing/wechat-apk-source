package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

@Deprecated
public abstract interface NodeApi
{
  public abstract PendingResult<GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient);

  @Deprecated
  public static abstract interface GetConnectedNodesResult extends Result
  {
    public abstract List<Node> getNodes();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.NodeApi
 * JD-Core Version:    0.6.2
 */