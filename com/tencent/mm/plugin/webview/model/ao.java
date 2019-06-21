package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class ao
{
  public static ao umH;
  public boolean hasInit;
  public e umI = null;

  static
  {
    AppMethodBeat.i(6745);
    umH = new ao();
    AppMethodBeat.o(6745);
  }

  public static ao cXP()
  {
    return umH;
  }

  public final void setNetWorkState(int paramInt)
  {
    AppMethodBeat.i(6744);
    boolean bool;
    Bundle localBundle;
    if (this.umI == null)
    {
      bool = true;
      ab.i("MicroMsg.WebViewVideoProxy", "set networkd state = %d, callbacker == null ? %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      if (this.umI == null)
        break label107;
      localBundle = new Bundle();
      localBundle.putInt("webview_video_proxy_net_state", paramInt);
    }
    while (true)
    {
      try
      {
        this.umI.g(5005, localBundle);
        AppMethodBeat.o(6744);
        return;
        bool = false;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewVideoProxy", "set network state failed : %s", new Object[] { localException.getMessage() });
      }
      label107: AppMethodBeat.o(6744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ao
 * JD-Core Version:    0.6.2
 */