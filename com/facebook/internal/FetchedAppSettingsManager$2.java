package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FetchedAppSettingsManager$2
  implements Runnable
{
  FetchedAppSettingsManager$2(FetchedAppSettingsManager.FetchedAppSettingsCallback paramFetchedAppSettingsCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72305);
    this.val$callback.onError();
    AppMethodBeat.o(72305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.2
 * JD-Core Version:    0.6.2
 */