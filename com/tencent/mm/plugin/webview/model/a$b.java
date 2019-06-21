package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.c;
import com.tencent.mm.m.g;

public final class a$b
{
  public static Bundle cXt()
  {
    AppMethodBeat.i(6564);
    String str = g.Nv().O("WebViewConfig", "mediaEnableAutoPlayHostPaths");
    Bundle localBundle = new Bundle();
    localBundle.putString("enable_auto_play_host_paths", str);
    AppMethodBeat.o(6564);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.a.b
 * JD-Core Version:    0.6.2
 */