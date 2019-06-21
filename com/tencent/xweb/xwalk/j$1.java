package com.tencent.xweb.xwalk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.ValueCallback;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.s;
import com.tencent.xweb.util.f;
import org.xwalk.core.CustomViewCallback;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkGeolocationPermissionsCallback;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkUIClient.ConsoleMessageType;
import org.xwalk.core.XWalkUIClient.InitiateBy;
import org.xwalk.core.XWalkUIClient.JavascriptMessageType;
import org.xwalk.core.XWalkUIClient.LoadStatus;
import org.xwalk.core.XWalkView;

final class j$1 extends l
{
  String ASr = null;

  j$1(j paramj, XWalkView paramXWalkView)
  {
    super(paramXWalkView);
  }

  public final View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(85253);
    Log.i("XWWebView", "getVideoLoadingProgressView");
    View localView = LayoutInflater.from(this.ASs.APS.getContext()).inflate(2130970993, null);
    AppMethodBeat.o(85253);
    return localView;
  }

  public final boolean isSearchable()
  {
    AppMethodBeat.i(85256);
    Object localObject = j.d(this.ASs).onMiscCallBack("supportSmartPickWord", new Bundle());
    boolean bool;
    if ((localObject instanceof Boolean))
    {
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(85256);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85256);
    }
  }

  public final void onClearCurrentPage()
  {
    AppMethodBeat.i(85276);
    if (j.d(this.ASs) != null)
      j.d(this.ASs).hasDiscardCurrentPage(true);
    AppMethodBeat.o(85276);
  }

  public final boolean onConsoleMessage(XWalkView paramXWalkView, String paramString1, int paramInt, String paramString2, XWalkUIClient.ConsoleMessageType paramConsoleMessageType)
  {
    AppMethodBeat.i(85262);
    if ((XWalkUIClient.ConsoleMessageType.ERROR == paramConsoleMessageType) && (j.e(this.ASs) != null) && (paramString1.split(":").length == 2))
    {
      j.e(this.ASs);
      f.dVa();
    }
    com.tencent.xweb.l locall = this.ASs.iup;
    paramXWalkView = ConsoleMessage.MessageLevel.DEBUG;
    switch (f.1.ARS[paramConsoleMessageType.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      boolean bool = locall.onConsoleMessage(new ConsoleMessage(paramString1, paramString2, paramInt, paramXWalkView));
      AppMethodBeat.o(85262);
      return bool;
      paramXWalkView = ConsoleMessage.MessageLevel.DEBUG;
      continue;
      paramXWalkView = ConsoleMessage.MessageLevel.ERROR;
      continue;
      paramXWalkView = ConsoleMessage.MessageLevel.LOG;
      continue;
      paramXWalkView = ConsoleMessage.MessageLevel.TIP;
      continue;
      paramXWalkView = ConsoleMessage.MessageLevel.WARNING;
    }
  }

  public final boolean onCreateWindowRequested(XWalkView paramXWalkView, XWalkUIClient.InitiateBy paramInitiateBy, ValueCallback<XWalkView> paramValueCallback)
  {
    AppMethodBeat.i(85264);
    boolean bool = super.onCreateWindowRequested(paramXWalkView, paramInitiateBy, paramValueCallback);
    AppMethodBeat.o(85264);
    return bool;
  }

  public final void onDidChangeThemeColor(XWalkView paramXWalkView, int paramInt)
  {
  }

  public final void onFullscreenToggled(XWalkView paramXWalkView, boolean paramBoolean)
  {
    AppMethodBeat.i(85270);
    super.onFullscreenToggled(paramXWalkView, paramBoolean);
    AppMethodBeat.o(85270);
  }

  public final void onGeolocationPermissionsHidePrompt()
  {
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, XWalkGeolocationPermissionsCallback paramXWalkGeolocationPermissionsCallback)
  {
    AppMethodBeat.i(85261);
    this.ASs.iup.onGeolocationPermissionsShowPrompt(paramString, new f.b(paramXWalkGeolocationPermissionsCallback));
    AppMethodBeat.o(85261);
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(85252);
    Log.i("XWWebView", "onHideCustomView");
    this.ASs.iup.aDI();
    this.ASs.ASj.setVisibility(0);
    if (j.c(this.ASs) != null)
      j.c(this.ASs).onHideCustomView();
    AppMethodBeat.o(85252);
  }

  public final void onIconAvailable(XWalkView paramXWalkView, String paramString, Message paramMessage)
  {
    AppMethodBeat.i(85265);
    super.onIconAvailable(paramXWalkView, paramString, paramMessage);
    AppMethodBeat.o(85265);
  }

  public final void onJavascriptCloseWindow(XWalkView paramXWalkView)
  {
    AppMethodBeat.i(85268);
    super.onJavascriptCloseWindow(paramXWalkView);
    AppMethodBeat.o(85268);
  }

  public final boolean onJavascriptModalDialog(XWalkView paramXWalkView, XWalkUIClient.JavascriptMessageType paramJavascriptMessageType, String paramString1, String paramString2, String paramString3, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    AppMethodBeat.i(85269);
    boolean bool = super.onJavascriptModalDialog(paramXWalkView, paramJavascriptMessageType, paramString1, paramString2, paramString3, paramXWalkJavascriptResult);
    AppMethodBeat.o(85269);
    return bool;
  }

  public final boolean onJsAlert(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    AppMethodBeat.i(85258);
    Log.i("XWWebView", "onJsAlert");
    boolean bool = this.ASs.iup.a(this.ASs.APS, paramString1, paramString2, new f.c(paramXWalkJavascriptResult));
    AppMethodBeat.o(85258);
    return bool;
  }

  public final boolean onJsConfirm(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    AppMethodBeat.i(85259);
    Log.i("XWWebView", "onJsConfirm");
    boolean bool = this.ASs.iup.b(this.ASs.APS, paramString1, paramString2, new f.c(paramXWalkJavascriptResult));
    AppMethodBeat.o(85259);
    return bool;
  }

  public final boolean onJsPrompt(XWalkView paramXWalkView, String paramString1, String paramString2, String paramString3, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    AppMethodBeat.i(85260);
    Log.i("XWWebView", "onJsPrompt");
    boolean bool = this.ASs.iup.a(this.ASs.APS, paramString1, paramString2, paramString3, new f.d(paramXWalkJavascriptResult));
    AppMethodBeat.o(85260);
    return bool;
  }

  public final void onPageLoadStarted(XWalkView paramXWalkView, String paramString)
  {
    AppMethodBeat.i(85248);
    Log.i("XWWebView", "onPageLoadStarted: url = ".concat(String.valueOf(paramString)));
    this.ASs.iuo.b(this.ASs.APS, paramString, this.ASs.ARZ.getFavicon());
    com.tencent.xweb.c.j.dUB().dUx();
    this.ASr = null;
    if ((j.a(this.ASs) != null) && (paramString != null) && (!paramString.equals(j.a(this.ASs))) && (f.avq(paramString) != f.avq(j.a(this.ASs))))
    {
      if ((f.avq(j.a(this.ASs)) == 1) && (f.avq(paramString) == 2))
        j.a(this.ASs, 1);
    }
    else
    {
      j.a(this.ASs, paramString);
      this.ASs.APY = System.currentTimeMillis();
      paramXWalkView = paramString;
      if (paramString == null)
        paramXWalkView = "";
      f.eV(paramXWalkView, j.b(this.ASs));
      if (j.c(this.ASs) != null)
      {
        paramXWalkView = j.c(this.ASs);
        if (this.ASs.APS.getFullscreenVideoKind() != WebView.a.AMY)
          break label261;
      }
    }
    label261: for (boolean bool = true; ; bool = false)
    {
      paramXWalkView.am(true, bool);
      AppMethodBeat.o(85248);
      return;
      if ((f.avq(j.a(this.ASs)) != 2) || (f.avq(paramString) != 1))
        break;
      j.a(this.ASs, 2);
      break;
    }
  }

  public final void onPageLoadStopped(XWalkView paramXWalkView, String paramString, XWalkUIClient.LoadStatus paramLoadStatus)
  {
    AppMethodBeat.i(85249);
    if ((this.ASr != null) && (this.ASr.equals(paramString)))
    {
      Log.i("XWWebView", "abandoned onPageFinished: url = " + paramString + " status = " + paramLoadStatus);
      AppMethodBeat.o(85249);
      return;
    }
    if (j.c(this.ASs) != null)
    {
      paramXWalkView = j.c(this.ASs);
      if (this.ASs.APS.getFullscreenVideoKind() != WebView.a.AMY)
        break label218;
    }
    label218: for (boolean bool = true; ; bool = false)
    {
      paramXWalkView.am(false, bool);
      this.ASr = paramString;
      Log.i("XWWebView", "onPageFinished: url = " + paramString + " status = " + paramLoadStatus);
      this.ASs.iuo.b(this.ASs.APS, paramString);
      if (paramLoadStatus != XWalkUIClient.LoadStatus.FAILED)
        com.tencent.xweb.c.j.dUB().dUy();
      f.q(paramString, System.currentTimeMillis() - this.ASs.APY, j.b(this.ASs));
      this.ASs.APY = System.currentTimeMillis();
      AppMethodBeat.o(85249);
      break;
    }
  }

  public final void onReceivedIcon(XWalkView paramXWalkView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(85266);
    super.onReceivedIcon(paramXWalkView, paramString, paramBitmap);
    AppMethodBeat.o(85266);
  }

  public final void onReceivedTitle(XWalkView paramXWalkView, String paramString)
  {
    AppMethodBeat.i(85250);
    Log.i("XWWebView", "onReceivedTitle: ".concat(String.valueOf(paramString)));
    super.onReceivedTitle(paramXWalkView, paramString);
    this.ASs.iup.d(null, paramString);
    if (j.c(this.ASs) != null)
    {
      paramXWalkView = j.c(this.ASs);
      if (this.ASs.APS.getFullscreenVideoKind() != WebView.a.AMY)
        break label90;
    }
    label90: for (boolean bool = true; ; bool = false)
    {
      paramXWalkView.am(true, bool);
      AppMethodBeat.o(85250);
      return;
    }
  }

  public final void onRequestFocus(XWalkView paramXWalkView)
  {
    AppMethodBeat.i(85267);
    super.onRequestFocus(paramXWalkView);
    AppMethodBeat.o(85267);
  }

  public final void onScaleChanged(XWalkView paramXWalkView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(85271);
    this.ASs.iuo.a(this.ASs.APS, paramFloat1, paramFloat2);
    AppMethodBeat.o(85271);
  }

  public final boolean onSearchWord(XWalkView paramXWalkView, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(85257);
    boolean bool;
    if (isSearchable())
    {
      paramXWalkView = new Bundle();
      paramXWalkView.putString("query", paramString1);
      j.d(this.ASs).onMiscCallBack("jumpToSos", paramXWalkView);
      this.ASs.ARZ.getUrl();
      this.ASs.ARZ.getRefererUrl();
      this.ASs.ARZ.getTitle();
      bool = true;
      AppMethodBeat.o(85257);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85257);
    }
  }

  public final boolean onSelectInfoChanged(XWalkView paramXWalkView, long paramLong, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(85254);
    boolean bool;
    if (!isSearchable())
    {
      AppMethodBeat.o(85254);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = new Bundle();
      ((Bundle)localObject).putString("PickedWord", paramString1);
      ((Bundle)localObject).putString("PrefixText", paramString2);
      ((Bundle)localObject).putString("SuffixText", paramString3);
      localObject = j.d(this.ASs).onMiscCallBack("smartPickWord", (Bundle)localObject);
      if ((localObject instanceof Bundle))
      {
        localObject = (Bundle)localObject;
        if ((localObject != null) && (((Bundle)localObject).getString("PickedWord") != null))
        {
          int i = ((Bundle)localObject).getInt("PrefixOffset");
          int j = ((Bundle)localObject).getInt("SuffixOffset");
          paramString1 = j.b.b(paramString1, ((Bundle)localObject).getString("PickedWord"), i, j, paramString2, paramString3);
          Log.d("XWWebView", "onSelectInfoChanged " + paramString1.toString());
          paramXWalkView.adjustSelectPosition(paramLong, ((Bundle)localObject).getString("PickedWord"), -paramString1.ASx, paramString1.ASz);
        }
        bool = true;
        AppMethodBeat.o(85254);
      }
      else
      {
        AppMethodBeat.o(85254);
        bool = false;
      }
    }
  }

  public final void onShowCustomView(View paramView, int paramInt, CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(85274);
    super.onShowCustomView(paramView, paramInt, paramCustomViewCallback);
    AppMethodBeat.o(85274);
  }

  public final void onShowCustomView(View paramView, CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(85251);
    Log.i("XWWebView", "onShowCustomView:".concat(String.valueOf(paramView)));
    this.ASs.iup.aJY();
    f.dUS();
    this.ASs.ASj.setVisibility(4);
    if (j.c(this.ASs) != null)
      j.c(this.ASs).onShowCustomView(paramView, new f.a(paramCustomViewCallback));
    AppMethodBeat.o(85251);
  }

  public final void onShowSos()
  {
    AppMethodBeat.i(85255);
    j.d(this.ASs).onMiscCallBack("onShowSos", new Bundle());
    AppMethodBeat.o(85255);
  }

  public final void onUnhandledKeyEvent(XWalkView paramXWalkView, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(85273);
    super.onUnhandledKeyEvent(paramXWalkView, paramKeyEvent);
    AppMethodBeat.o(85273);
  }

  public final void openFileChooser(XWalkView paramXWalkView, ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85263);
    Log.i("XWWebView", "openFileChooser with three param");
    this.ASs.iup.openFileChooser(paramValueCallback, paramString1, paramString2);
    AppMethodBeat.o(85263);
  }

  public final boolean shouldDiscardCurrentPage()
  {
    AppMethodBeat.i(85275);
    boolean bool;
    if (j.d(this.ASs) != null)
    {
      bool = j.d(this.ASs).shouldDiscardCurrentPage();
      AppMethodBeat.o(85275);
    }
    while (true)
    {
      return bool;
      bool = super.shouldDiscardCurrentPage();
      AppMethodBeat.o(85275);
    }
  }

  public final boolean shouldOverrideKeyEvent(XWalkView paramXWalkView, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(85272);
    boolean bool = super.shouldOverrideKeyEvent(paramXWalkView, paramKeyEvent);
    AppMethodBeat.o(85272);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.1
 * JD-Core Version:    0.6.2
 */