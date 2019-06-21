package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandProcessProxyUI$1 extends ResultReceiver
{
  AppBrandProcessProxyUI$1(Handler paramHandler, AppBrandProxyUIProcessTask.b paramb)
  {
    super(paramHandler);
  }

  protected final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73124);
    if (paramBundle == null)
    {
      this.hva.c(null);
      AppMethodBeat.o(73124);
    }
    while (true)
    {
      return;
      paramBundle.setClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
      paramBundle = (AppBrandProxyUIProcessTask.ProcessResult)paramBundle.getParcelable("key_result_parcel");
      this.hva.c(paramBundle);
      AppMethodBeat.o(73124);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.1
 * JD-Core Version:    0.6.2
 */