package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.b;

final class WebViewUI$25
  implements View.OnLongClickListener
{
  WebViewUI$25(WebViewUI paramWebViewUI)
  {
  }

  private boolean daL()
  {
    boolean bool1 = true;
    AppMethodBeat.i(7847);
    Object localObject = null;
    while (true)
    {
      boolean bool2;
      try
      {
        WebView.b localb = this.uxp.pzf.getHitTestResult();
        localObject = localb;
        if ((localObject == null) || (bo.isNullOrNil(localObject.mExtra)))
        {
          ab.e("MicroMsg.WebViewUI", "hittestresult getExtra is null");
          AppMethodBeat.o(7847);
          bool2 = false;
          return bool2;
        }
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.WebViewUI", "getHitTestResult exp %s", new Object[] { localException1.getMessage() });
        continue;
      }
      try
      {
        bool2 = this.uxp.icy.dq(localObject.mExtra);
        if (!bool2);
      }
      catch (Exception localException2)
      {
        try
        {
          this.uxp.icy.dB(localObject.mExtra, this.uxp.hashCode());
          while (true)
          {
            if (bool2)
              break label187;
            WebViewUI.b(this.uxp, localObject.mExtra);
            bool2 = bool1;
            AppMethodBeat.o(7847);
            break;
            localException2 = localException2;
            bool2 = true;
            ab.w("MicroMsg.WebViewUI", "postBinded, handleEvents, ex = " + localException2.getMessage());
          }
        }
        catch (Exception localException3)
        {
          label187: 
          while (true);
        }
      }
    }
  }

  public final boolean onLongClick(View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(7846);
    if (this.uxp.getIntent().getBooleanExtra("show_long_click_popup_menu", true))
    {
      bool = daL();
      AppMethodBeat.o(7846);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(7846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.25
 * JD-Core Version:    0.6.2
 */