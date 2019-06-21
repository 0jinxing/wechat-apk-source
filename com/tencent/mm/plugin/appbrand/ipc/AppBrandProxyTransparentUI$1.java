package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandProxyTransparentUI$1
  implements AppBrandProxyTransparentUIProcessTask.a
{
  AppBrandProxyTransparentUI$1(AppBrandProxyTransparentUI paramAppBrandProxyTransparentUI, AppBrandProxyTransparentUIProcessTask paramAppBrandProxyTransparentUIProcessTask, String paramString)
  {
  }

  public final void aBT()
  {
    AppMethodBeat.i(73146);
    ab.i("MicroMsg.AppBrandProxyTransparentUI", "onResult");
    Intent localIntent = new Intent();
    localIntent.putExtra("task_object", this.hvl);
    localIntent.putExtra("task_id", this.hvm);
    this.hvn.setResult(-1, localIntent);
    this.hvn.finish();
    AppMethodBeat.o(73146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI.1
 * JD-Core Version:    0.6.2
 */