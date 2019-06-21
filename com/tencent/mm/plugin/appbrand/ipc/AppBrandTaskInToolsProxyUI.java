package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandTaskInToolsProxyUI extends AppBrandTaskProxyUI
{
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskInToolsProxyUI
 * JD-Core Version:    0.6.2
 */