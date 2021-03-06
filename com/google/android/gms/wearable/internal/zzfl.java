package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class zzfl extends NodeClient
{
  private final NodeApi zzem;

  public zzfl(Activity paramActivity, GoogleApi.Settings paramSettings)
  {
    super(paramActivity, paramSettings);
    AppMethodBeat.i(71321);
    this.zzem = new zzfg();
    AppMethodBeat.o(71321);
  }

  public zzfl(Context paramContext, GoogleApi.Settings paramSettings)
  {
    super(paramContext, paramSettings);
    AppMethodBeat.i(71320);
    this.zzem = new zzfg();
    AppMethodBeat.o(71320);
  }

  public final Task<List<Node>> getConnectedNodes()
  {
    AppMethodBeat.i(71323);
    Task localTask = PendingResultUtil.toTask(this.zzem.getConnectedNodes(asGoogleApiClient()), zzfn.zzbx);
    AppMethodBeat.o(71323);
    return localTask;
  }

  public final Task<Node> getLocalNode()
  {
    AppMethodBeat.i(71322);
    Task localTask = PendingResultUtil.toTask(this.zzem.getLocalNode(asGoogleApiClient()), zzfm.zzbx);
    AppMethodBeat.o(71322);
    return localTask;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzfl
 * JD-Core Version:    0.6.2
 */