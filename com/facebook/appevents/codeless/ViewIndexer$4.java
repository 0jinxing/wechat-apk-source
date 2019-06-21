package com.facebook.appevents.codeless;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ViewIndexer$4
  implements GraphRequest.Callback
{
  public final void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(72078);
    Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$100(), "App index sent to FB!");
    AppMethodBeat.o(72078);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.4
 * JD-Core Version:    0.6.2
 */