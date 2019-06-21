package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

public final class zzfk
  implements NodeApi.GetLocalNodeResult
{
  private final Node zzel;
  private final Status zzp;

  public zzfk(Status paramStatus, Node paramNode)
  {
    this.zzp = paramStatus;
    this.zzel = paramNode;
  }

  public final Node getNode()
  {
    return this.zzel;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzfk
 * JD-Core Version:    0.6.2
 */