package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Dialog;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.d;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.g;
import com.tencent.xweb.l;
import com.tencent.xweb.l.a;
import java.util.LinkedList;
import java.util.List;

public class WebViewUI$g extends l
{
  private Dialog dialog;
  public volatile boolean eBB;
  private final List<String> uxC;

  protected WebViewUI$g(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7912);
    this.eBB = false;
    this.uxC = new LinkedList();
    this.dialog = null;
    AppMethodBeat.o(7912);
  }

  public final void a(WebView paramWebView, int paramInt)
  {
    AppMethodBeat.i(7913);
    if (paramInt < 100)
    {
      WebViewUI.b(this.uxp, false);
      AppMethodBeat.o(7913);
    }
    while (true)
    {
      return;
      if (paramInt >= 100)
        WebViewUI.b(this.uxp, true);
      AppMethodBeat.o(7913);
    }
  }

  public final boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, l.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(7920);
    if ((parama.getMode() == 0) || (parama.getMode() == 1))
      if ((parama.getAcceptTypes() == null) || (parama.getAcceptTypes().length <= 0))
      {
        ab.i("MicroMsg.WebViewUI", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        AppMethodBeat.o(7920);
        bool = true;
      }
    while (true)
    {
      return bool;
      String str1 = parama.getAcceptTypes()[0];
      String str2 = "*";
      paramWebView = str2;
      if (parama.isCaptureEnabled())
      {
        if (!"image/*".equalsIgnoreCase(str1))
          break label131;
        paramWebView = "camera";
      }
      while (true)
      {
        WebViewUI.u(this.uxp).a(this.uxp, this.uxp.icz, null, paramValueCallback, str1, paramWebView);
        AppMethodBeat.o(7920);
        bool = true;
        break;
        label131: paramWebView = str2;
        if ("video/*".equalsIgnoreCase(str1))
          paramWebView = "camcorder";
      }
      AppMethodBeat.o(7920);
    }
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.h paramh)
  {
    AppMethodBeat.i(7923);
    ab.d("MicroMsg.WebViewUI", "onJsAlert");
    PBool localPBool = new PBool();
    localPBool.value = false;
    boolean bool;
    if ((this.uxp.isFinishing()) || (this.uxp.uiu))
    {
      ab.d("MicroMsg.WebViewUI", "onJsAlert finish");
      paramh.cancel();
      bool = true;
      AppMethodBeat.o(7923);
    }
    while (true)
    {
      return bool;
      WebViewUI.v(this.uxp);
      if (WebViewUI.w(this.uxp) > 2);
      for (c localc = com.tencent.mm.ui.base.h.a(this.uxp, paramString2, "", this.uxp.getString(2131305700), this.uxp.getString(2131296994), new WebViewUI.g.10(this, paramString1, paramh), new WebViewUI.g.11(this, localPBool, paramh), 2131690208); ; localc = com.tencent.mm.ui.base.h.a(this.uxp, paramString2, "", this.uxp.getString(2131296994), new WebViewUI.g.2(this, localPBool, paramh)))
      {
        if (localc == null)
          break label228;
        localc.setOnDismissListener(new WebViewUI.g.3(this, localPBool, paramh));
        localc.setCanceledOnTouchOutside(false);
        localc.qZ(false);
        bool = true;
        AppMethodBeat.o(7923);
        break;
      }
      label228: bool = super.a(paramWebView, paramString1, paramString2, paramh);
      AppMethodBeat.o(7923);
    }
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, g paramg)
  {
    AppMethodBeat.i(7922);
    boolean bool = super.a(paramWebView, paramString1, paramString2, paramString3, paramg);
    AppMethodBeat.o(7922);
    return bool;
  }

  public final void aDI()
  {
    AppMethodBeat.i(7925);
    super.aDI();
    ab.i("MicroMsg.WebViewUI", "WebChromeClient onExitFullscreen");
    AppMethodBeat.o(7925);
  }

  public final void aJY()
  {
    AppMethodBeat.i(7924);
    super.aJY();
    ab.i("MicroMsg.WebViewUI", "WebChromeClient onEnterFullscreen");
    AppMethodBeat.o(7924);
  }

  public final boolean b(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.h paramh)
  {
    AppMethodBeat.i(7921);
    ab.d("MicroMsg.WebViewUI", "onJsConfirm");
    PBool localPBool = new PBool();
    localPBool.value = false;
    boolean bool;
    if ((this.uxp.isFinishing()) || (this.uxp.uiu))
    {
      ab.d("MicroMsg.WebViewUI", "onJsConfirm finish");
      paramh.cancel();
      bool = true;
      AppMethodBeat.o(7921);
    }
    while (true)
    {
      return bool;
      WebViewUI.v(this.uxp);
      if (WebViewUI.w(this.uxp) > 2);
      for (this.dialog = com.tencent.mm.ui.base.h.a(this.uxp, paramString2, "", this.uxp.getString(2131305700), this.uxp.getString(2131296994), new WebViewUI.g.5(this, paramString1, paramh), new WebViewUI.g.6(this, localPBool, paramh), 2131689792); ; this.dialog = com.tencent.mm.ui.base.h.a(this.uxp.mController.ylL, false, paramString2, "", this.uxp.getString(2131296994), this.uxp.getString(2131296868), new WebViewUI.g.7(this, localPBool, paramh), new WebViewUI.g.8(this, paramh)))
      {
        if (this.dialog == null)
          break label266;
        this.dialog.setOnDismissListener(new WebViewUI.g.9(this, localPBool, paramh));
        this.dialog.setCancelable(false);
        this.dialog.setCanceledOnTouchOutside(false);
        bool = true;
        AppMethodBeat.o(7921);
        break;
      }
      label266: bool = super.b(paramWebView, paramString1, paramString2, paramh);
      AppMethodBeat.o(7921);
    }
  }

  public final void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(7914);
    ab.i("MicroMsg.WebViewUI", "onReceivedTitle, title = %s, loadurl = %s", new Object[] { paramString, this.uxp.uxf });
    super.d(paramWebView, paramString);
    if (this.uxp.uuW)
    {
      ab.i("MicroMsg.WebViewUI", "fixed title, ignore received title: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(7914);
    }
    while (true)
    {
      return;
      if (paramString == null)
      {
        ab.e("MicroMsg.WebViewUI", "null title");
        AppMethodBeat.o(7914);
      }
      else if (!this.uxp.rpm)
      {
        AppMethodBeat.o(7914);
      }
      else
      {
        if ((!bo.nullAsNil(this.uxp.uxf).equals(paramString)) && (!com.tencent.mm.plugin.webview.modelcache.q.Ed(paramString)))
          this.uxp.setMMTitle(paramString);
        AppMethodBeat.o(7914);
      }
    }
  }

  public final View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(7917);
    if (WebViewUI.t(this.uxp) == null)
    {
      WebViewUI.a(this.uxp, new ProgressBar(this.uxp));
      WebViewUI.t(this.uxp).setIndeterminate(true);
    }
    ProgressBar localProgressBar = WebViewUI.t(this.uxp);
    AppMethodBeat.o(7917);
    return localProgressBar;
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AppMethodBeat.i(7918);
    ab.i("MicroMsg.WebViewUI", "onGeolocationPermissionsShowPrompt, origin = %s", new Object[] { paramString });
    if (!b.o(this.uxp, "android.permission.ACCESS_COARSE_LOCATION"))
      b.b(this.uxp, "android.permission.ACCESS_COARSE_LOCATION", 64);
    com.tencent.mm.ui.base.h.a(this.uxp, false, this.uxp.getString(2131305707, new Object[] { paramString }), this.uxp.getString(2131305708), this.uxp.getString(2131296994), this.uxp.getString(2131296868), new WebViewUI.g.1(this, paramCallback, paramString), new WebViewUI.g.4(this, paramCallback, paramString));
    AppMethodBeat.o(7918);
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(7916);
    ab.i("MicroMsg.WebViewUI", "onHideCustomView, sdk int = " + Build.VERSION.SDK_INT);
    this.uxp.mController.ylL.getWindow().clearFlags(128);
    if (WebViewUI.q(this.uxp) == null)
      AppMethodBeat.o(7916);
    while (true)
    {
      return;
      try
      {
        this.uxp.nP(false);
        if (!this.uxp.pzf.isXWalkKernel())
        {
          this.uxp.pzf.setVisibility(0);
          this.uxp.setTitleVisibility(0);
        }
        while (true)
        {
          if (this.uxp.uvd != null)
            this.uxp.uvd.removeView(WebViewUI.q(this.uxp));
          WebViewUI.a(this.uxp, null);
          if (WebViewUI.s(this.uxp) != null)
            WebViewUI.s(this.uxp).onCustomViewHidden();
          AppMethodBeat.o(7916);
          break;
          this.uxp.fullScreenNoTitleBar(false);
          this.uxp.setStatusBarColor(this.uxp.getResources().getColor(2131690513));
          if (this.uxp.uwT != null)
          {
            ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.uxp.uwT.getLayoutParams();
            int i = WebViewUI.r(this.uxp);
            if (i != localMarginLayoutParams.topMargin)
            {
              localMarginLayoutParams.topMargin = i;
              this.uxp.uwT.setLayoutParams(localMarginLayoutParams);
            }
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewUI", "onHideCustomView error " + localException.getMessage());
        AppMethodBeat.o(7916);
      }
    }
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(7915);
    ab.i("MicroMsg.WebViewUI", "onShowCustomView, sdk int = " + Build.VERSION.SDK_INT);
    try
    {
      this.uxp.mController.ylL.getWindow().addFlags(128);
      if (WebViewUI.q(this.uxp) != null)
      {
        paramCustomViewCallback.onCustomViewHidden();
        AppMethodBeat.o(7915);
      }
      while (true)
      {
        return;
        this.uxp.nP(false);
        WebViewUI.a(this.uxp, paramView);
        WebViewUI.a(this.uxp, paramCustomViewCallback);
        if (this.uxp.pzf.isXWalkKernel())
          break;
        this.uxp.pzf.setVisibility(8);
        this.uxp.uvd.addView(paramView);
        this.uxp.setTitleVisibility(4);
        AppMethodBeat.o(7915);
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "onShowCustomView error " + paramView.getMessage());
        AppMethodBeat.o(7915);
        continue;
        this.uxp.uvd.addView(paramView, 0);
        this.uxp.fullScreenNoTitleBar(true);
        this.uxp.setStatusBarColor(0);
        if (this.uxp.uwT != null)
        {
          paramView = (ViewGroup.MarginLayoutParams)this.uxp.uwT.getLayoutParams();
          paramView.topMargin = 0;
          this.uxp.uwT.setLayoutParams(paramView);
        }
        AppMethodBeat.o(7915);
      }
    }
  }

  public final void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(7919);
    WebViewUI.u(this.uxp).a(this.uxp, this.uxp.icz, paramValueCallback, null, paramString1, paramString2);
    AppMethodBeat.o(7919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g
 * JD-Core Version:    0.6.2
 */