package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.appbrand.task.g;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ab;

public final class AppBrandInToolsUI extends AppBrandUI
{
  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132964);
    super.onCreate(paramBundle);
    AppMethodBeat.o(132964);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(132965);
    super.onDestroy();
    try
    {
      KVCommCrossProcessReceiver.cgo();
      e.a(g.iFf, null, true, null);
      AppMethodBeat.o(132965);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandInToolsUI", localException, "sendKV", new Object[0]);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI
 * JD-Core Version:    0.6.2
 */