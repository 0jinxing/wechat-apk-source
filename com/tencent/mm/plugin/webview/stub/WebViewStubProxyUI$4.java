package com.tencent.mm.plugin.webview.stub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.at.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class WebViewStubProxyUI$4
  implements at.a
{
  WebViewStubProxyUI$4(WebViewStubProxyUI paramWebViewStubProxyUI, p paramp)
  {
  }

  public final void hJ(boolean paramBoolean)
  {
    AppMethodBeat.i(7072);
    if (this.lAN != null)
      this.lAN.dismiss();
    Bundle localBundle1;
    if (paramBoolean)
      if (WebViewStubProxyUI.a(this.uqn) != null)
      {
        localBundle1 = new Bundle();
        localBundle1.putBoolean("add_shortcut_status", true);
      }
    while (true)
    {
      try
      {
        WebViewStubProxyUI.a(this.uqn).g(54, localBundle1);
        h.a(this.uqn, 2131305684, 2131297061, false, new WebViewStubProxyUI.4.1(this));
        AppMethodBeat.o(7072);
        return;
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + localException1.getMessage());
        continue;
      }
      Toast.makeText(this.uqn.mController.ylL, this.uqn.mController.ylL.getString(2131305683), 0).show();
      Bundle localBundle2;
      if (WebViewStubProxyUI.a(this.uqn) != null)
      {
        localBundle2 = new Bundle();
        localBundle2.putBoolean("add_shortcut_status", false);
      }
      try
      {
        WebViewStubProxyUI.a(this.uqn).g(54, localBundle2);
        this.uqn.finish();
        AppMethodBeat.o(7072);
      }
      catch (Exception localException2)
      {
        while (true)
          ab.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + localException2.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.4
 * JD-Core Version:    0.6.2
 */