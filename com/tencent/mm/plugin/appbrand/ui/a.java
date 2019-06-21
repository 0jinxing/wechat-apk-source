package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AccountReleasePromptMMTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "()V", "TAG", "", "checkShouldLogin", "", "handleRequest", "", "request", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "plugin-appbrand-integration_release"})
final class a extends AppBrandProxyUIProcessTask
{
  private final String TAG = "MicroMsg.AccountReleasePromptMMTask";

  private final boolean aMa()
  {
    boolean bool = true;
    AppMethodBeat.i(134977);
    if (com.tencent.mm.kernel.a.QT())
    {
      ab.i(this.TAG, "checkShouldLogin account hold, return true");
      AppMethodBeat.o(134977);
    }
    while (true)
    {
      return bool;
      if ((g.RQ().RJ()) && (g.RN().QY()))
      {
        ab.i(this.TAG, "checkShouldLogin account initialized, return false");
        bool = false;
        AppMethodBeat.o(134977);
      }
      else
      {
        ab.i(this.TAG, "checkShouldLogin fallback return true");
        AppMethodBeat.o(134977);
      }
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(134976);
    if (!aMa())
    {
      a((AppBrandProxyUIProcessTask.ProcessResult)new AccountReleaseProxyUILaunchResult());
      AppMethodBeat.o(134976);
    }
    while (true)
    {
      return;
      h.a((Context)aBQ(), getString(2131296541), getString(2131297061), getString(2131296583), false, (DialogInterface.OnClickListener)new a.a(this));
      new a.b(this).dnU();
      AppMethodBeat.o(134976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.a
 * JD-Core Version:    0.6.2
 */