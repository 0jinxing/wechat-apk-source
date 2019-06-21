package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventQueue$5
  implements GraphRequest.Callback
{
  AppEventQueue$5(AccessTokenAppIdPair paramAccessTokenAppIdPair, GraphRequest paramGraphRequest, SessionEventsState paramSessionEventsState, FlushStatistics paramFlushStatistics)
  {
  }

  public final void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(71888);
    AppEventQueue.access$400(this.val$accessTokenAppId, this.val$postRequest, paramGraphResponse, this.val$appEvents, this.val$flushState);
    AppMethodBeat.o(71888);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.5
 * JD-Core Version:    0.6.2
 */