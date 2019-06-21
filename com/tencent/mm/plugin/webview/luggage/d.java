package com.tencent.mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.ConsoleMessage;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.i.a;
import com.tencent.luggage.d.n;
import com.tencent.luggage.d.n.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.RunCgiTask;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.a;
import com.tencent.mm.plugin.webview.luggage.permission.c;
import com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.mm.plugin.webview.ui.tools.bag.o;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class d extends n
{
  private static final Pattern uiv;
  private static final Pattern uiw;
  private boolean icm;
  private n.a kOi;
  protected ak mHandler;
  public String mTH;
  protected FrameLayout odV;
  protected com.tencent.mm.plugin.webview.luggage.d.a uhQ;
  protected j uhR;
  protected LinearLayout uhS;
  protected k uhT;
  private WebViewKeyboardLinearLayout uhU;
  private WebViewInputFooter uhV;
  public WebViewSearchContentInputFooter uhW;
  private FrameLayout uhX;
  private MMFalseProgressBar uhY;
  protected MovingImageButton uhZ;
  protected FrameLayout uia;
  private g uib;
  private com.tencent.mm.plugin.webview.ui.tools.d uic;
  protected com.tencent.mm.plugin.webview.ui.tools.bag.h uie;
  private WebChromeClient.CustomViewCallback uif;
  private FrameLayout uig;
  private ProgressBar uih;
  protected LuggageGetA8Key uii;
  public q uij;
  protected c uik;
  protected Map<String, String> uil;
  protected boolean uim;
  protected boolean uio;
  protected int uiq;
  protected String uir;
  protected boolean uis;
  private boolean uit;
  private boolean uiu;
  private LuggageGetA8Key.a uix;

  static
  {
    AppMethodBeat.i(6094);
    uiv = Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    uiw = Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    AppMethodBeat.o(6094);
  }

  public d(com.tencent.luggage.d.g paramg, com.tencent.luggage.d.k paramk, Bundle paramBundle)
  {
    super(paramg, paramk, paramBundle);
    AppMethodBeat.i(6048);
    this.icm = true;
    this.uim = false;
    this.uir = "";
    this.uiu = false;
    this.uix = new d.16(this);
    this.kOi = new d.17(this);
    if (paramk != null)
    {
      this.uis = true;
      this.uii = com.tencent.mm.plugin.webview.luggage.permission.b.IG(paramk.hashCode());
    }
    if (this.uii == null);
    while (true)
    {
      ab.i("MicroMsg.LuggageMMWebPage", "LuggageMMWebPage create, getA8key == null ? %b", new Object[] { Boolean.valueOf(bool) });
      if (this.uii == null)
        this.uii = new LuggageGetA8Key();
      this.mHandler = new ak();
      this.uij = new q(this);
      this.uik = new c(this, this.uii);
      this.bPN.bPC = this.uik;
      this.uib = new g(this);
      this.uie = o.a(new l(this), cWO());
      h.b(this);
      if (this.uhQ != null)
      {
        this.uhQ.setWebViewClient(new d.10(this));
        this.uhQ.setWebChromeClient(new com.tencent.xweb.l()
        {
          public final void d(WebView paramAnonymousWebView, String paramAnonymousString)
          {
            int i = 1;
            AppMethodBeat.i(6022);
            ab.i("MicroMsg.LuggageMMWebPage", "onReceivedTitle, title = %s", new Object[] { paramAnonymousString });
            if (!bo.isNullOrNil(paramAnonymousString))
            {
              j = i;
              if (!URLUtil.isHttpsUrl(paramAnonymousString))
                if (!URLUtil.isHttpUrl(paramAnonymousString))
                  break label71;
            }
            label71: for (int j = i; ; j = 0)
            {
              if (j == 0)
                d.this.cl(paramAnonymousString, 0);
              AppMethodBeat.o(6022);
              return;
            }
          }

          public final View getVideoLoadingProgressView()
          {
            AppMethodBeat.i(6025);
            ab.i("MicroMsg.LuggageMMWebPage", "getVideoLoadingProgressView");
            if (d.i(d.this) == null)
            {
              d.a(d.this, new ProgressBar(d.this.mContext));
              d.i(d.this).setIndeterminate(true);
            }
            ProgressBar localProgressBar = d.i(d.this);
            AppMethodBeat.o(6025);
            return localProgressBar;
          }

          public final boolean onConsoleMessage(ConsoleMessage paramAnonymousConsoleMessage)
          {
            return false;
          }

          public final void onHideCustomView()
          {
            AppMethodBeat.i(6024);
            ab.i("MicroMsg.LuggageMMWebPage", "onHideCustomView, sdk int = " + Build.VERSION.SDK_INT);
            if (d.g(d.this) == null)
              AppMethodBeat.o(6024);
            while (true)
            {
              return;
              try
              {
                d.this.uhR.setVisibility(0);
                if (d.h(d.this) != null)
                  d.h(d.this).onCustomViewHidden();
                d.this.uhT.setVisibility(0);
                if (d.g(d.this) != null)
                  d.this.odV.removeView(d.g(d.this));
                d.g(d.this).removeAllViews();
                d.a(d.this, null);
                AppMethodBeat.o(6024);
              }
              catch (Exception localException)
              {
                ab.e("MicroMsg.LuggageMMWebPage", "onHideCustomView error " + localException.getMessage());
                AppMethodBeat.o(6024);
              }
            }
          }

          public final void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
          {
            AppMethodBeat.i(6023);
            ab.i("MicroMsg.LuggageMMWebPage", "onShowCustomView, sdk int = " + Build.VERSION.SDK_INT);
            try
            {
              if (d.g(d.this) != null)
              {
                paramAnonymousCustomViewCallback.onCustomViewHidden();
                AppMethodBeat.o(6023);
              }
              while (true)
              {
                return;
                d locald = d.this;
                FrameLayout localFrameLayout = new android/widget/FrameLayout;
                localFrameLayout.<init>(d.this.mContext);
                d.a(locald, localFrameLayout);
                d.g(d.this).setBackgroundResource(2131690677);
                d.g(d.this).addView(paramAnonymousView);
                d.a(d.this, paramAnonymousCustomViewCallback);
                d.this.uhR.setVisibility(8);
                d.this.uhT.setVisibility(8);
                d.this.odV.addView(d.g(d.this));
                AppMethodBeat.o(6023);
              }
            }
            catch (Exception paramAnonymousView)
            {
              while (true)
              {
                ab.e("MicroMsg.LuggageMMWebPage", "onShowCustomView error " + paramAnonymousView.getMessage());
                AppMethodBeat.o(6023);
              }
            }
          }
        });
      }
      a(this.kOi);
      paramk = this.bPd;
      paramg = new i.a()
      {
        public final boolean wY()
        {
          boolean bool = true;
          AppMethodBeat.i(6002);
          if (d.this.cWG())
            AppMethodBeat.o(6002);
          while (true)
          {
            return bool;
            if ((d.this.uie != null) && (d.this.uie.Jx(22)))
            {
              AppMethodBeat.o(6002);
            }
            else
            {
              bool = false;
              AppMethodBeat.o(6002);
            }
          }
        }
      };
      paramk.bPw.put(paramg, Boolean.FALSE);
      AppMethodBeat.o(6048);
      return;
      bool = false;
    }
  }

  private void IB(String paramString)
  {
    AppMethodBeat.i(6059);
    this.bPN.a(new d.21(this, paramString));
    AppMethodBeat.o(6059);
  }

  public final void IE(int paramInt)
  {
    AppMethodBeat.i(6066);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.uhV.getLayoutParams();
    if (localMarginLayoutParams.bottomMargin != paramInt)
    {
      localMarginLayoutParams.bottomMargin = paramInt;
      this.uhV.setLayoutParams(localMarginLayoutParams);
    }
    AppMethodBeat.o(6066);
  }

  protected void NN(String paramString)
  {
  }

  protected void NP(String paramString)
  {
    AppMethodBeat.i(6077);
    if (this.uhQ.getX5WebViewExtension() != null)
    {
      this.uhR.setPullDownEnabled(true);
      this.uhR.setCurrentUrl(paramString);
    }
    AppMethodBeat.o(6077);
  }

  protected boolean NQ(String paramString)
  {
    return false;
  }

  protected boolean NS(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(6084);
    if (this.uii.aem(paramString))
    {
      this.uim = true;
      AppMethodBeat.o(6084);
    }
    while (true)
    {
      return bool;
      bool = this.uii.a(paramString, this.uix);
      ab.i("MicroMsg.LuggageMMWebPage", "startGetA8Key, url: %s, ret: %b", new Object[] { paramString, Boolean.valueOf(bool) });
      this.uim = bool;
      AppMethodBeat.o(6084);
    }
  }

  protected void NT(String paramString)
  {
    AppMethodBeat.i(6079);
    ab.i("MicroMsg.LuggageMMWebPage", "loadUrlWithoutCache, url: %s, __Time__: %d", new Object[] { paramString, Long.valueOf(System.currentTimeMillis()) });
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("Pragma", "no-cache");
    localHashMap.put("Cache-Control", "no-cache");
    this.uhQ.loadUrl(paramString, localHashMap);
    AppMethodBeat.o(6079);
  }

  public final void aBj()
  {
    AppMethodBeat.i(6064);
    this.uiq = android.support.v4.content.b.i(this.mContext, 2131689639);
    this.uir = "";
    bDF();
    AppMethodBeat.o(6064);
  }

  protected boolean aYc()
  {
    AppMethodBeat.i(6089);
    if (!this.bPP.getBoolean("disable_minimize", false));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.LuggageMMWebPage", "enableMinimize class:%s enable:%b", new Object[] { getClass(), Boolean.valueOf(bool) });
      AppMethodBeat.o(6089);
      return bool;
    }
  }

  public final void aec(final String paramString)
  {
    AppMethodBeat.i(6073);
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6028);
        int i = com.tencent.mm.plugin.webview.ui.tools.g.bx(paramString, d.this.mContext.getResources().getColor(2131690677));
        d.this.uhR.setBackgroundColor(i);
        d.this.uhR.setX5LogoViewVisibility(8);
        AppMethodBeat.o(6028);
      }
    });
    AppMethodBeat.o(6073);
  }

  protected final boolean aed(String paramString)
  {
    AppMethodBeat.i(6085);
    boolean bool = this.uii.a(paramString, 5, this.uix);
    AppMethodBeat.o(6085);
    return bool;
  }

  protected final void b(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(6087);
    ab.i("MicroMsg.LuggageMMWebPage", "onError, reason = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    switch (paramInt1)
    {
    default:
    case 0:
    case 2:
    case 8:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(6087);
      return;
      if (!NQ(paramString))
        this.uhX.setVisibility(0);
    }
  }

  protected View bDD()
  {
    AppMethodBeat.i(6050);
    this.uhT = new k(this);
    k localk = this.uhT;
    AppMethodBeat.o(6050);
    return localk;
  }

  protected void bDE()
  {
    AppMethodBeat.i(6060);
    if (!this.uio)
    {
      this.uiq = this.bPP.getInt("customize_status_bar_color");
      if (this.uiq == 0)
        break label59;
      this.uir = this.bPP.getString("status_bar_style");
    }
    while (true)
    {
      bDF();
      AppMethodBeat.o(6060);
      return;
      label59: this.uiq = android.support.v4.content.b.i(this.mContext, 2131689639);
    }
  }

  public void bDF()
  {
    AppMethodBeat.i(6061);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      this.mHandler.post(new d.22(this));
      AppMethodBeat.o(6061);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.webview.luggage.c.a.a(this.mContext, this.uiq, this.uir))
      {
        cWE();
        AppMethodBeat.o(6061);
      }
      else
      {
        this.uiq = this.mContext.getResources().getColor(2131689913);
        this.uir = "";
        cWE();
        AppMethodBeat.o(6061);
      }
    }
  }

  protected void bDG()
  {
    AppMethodBeat.i(6076);
    this.uhY.finish();
    this.uhY.setVisibility(8);
    AppMethodBeat.o(6076);
  }

  protected void bDv()
  {
    AppMethodBeat.i(6075);
    this.uhY.setVisibility(0);
    this.uhY.start();
    AppMethodBeat.o(6075);
  }

  protected void bDw()
  {
  }

  protected void bDy()
  {
    AppMethodBeat.i(6051);
    this.uhT.bDy();
    AppMethodBeat.o(6051);
  }

  protected void bE(String paramString)
  {
    AppMethodBeat.i(6080);
    ab.d("MicroMsg.LuggageMMWebPage", "onUrlLoadingStarted, url = ".concat(String.valueOf(paramString)));
    if (NS(paramString))
    {
      int i = this.uii.ael(paramString);
      if ((i == 0) || (i == 2) || (i == 8))
      {
        this.bPN.stopLoading();
        AppMethodBeat.o(6080);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.model.a.c(this.uhQ);
      this.uie.afY(paramString);
      this.uhT.setOptionEnable(false);
      bDv();
      NP(paramString);
      AppMethodBeat.o(6080);
    }
  }

  protected void bF(String paramString)
  {
    AppMethodBeat.i(6081);
    ab.d("MicroMsg.LuggageMMWebPage", "onUrlLoadingFinished, url = ".concat(String.valueOf(paramString)));
    com.tencent.mm.plugin.webview.model.a.c(this.uhQ);
    this.uhT.setOptionEnable(true);
    bDG();
    AppMethodBeat.o(6081);
  }

  public final void cWD()
  {
    AppMethodBeat.i(6052);
    this.uie.a(new t());
    AppMethodBeat.o(6052);
  }

  protected final void cWE()
  {
    AppMethodBeat.i(6062);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      this.mHandler.post(new d.23(this));
      AppMethodBeat.o(6062);
    }
    while (true)
    {
      return;
      this.uhT.bD(this.uiq, this.uir);
      AppMethodBeat.o(6062);
    }
  }

  public final int cWF()
  {
    int i = 0;
    AppMethodBeat.i(6067);
    if (this.uhV != null)
      if (Thread.currentThread().getId() == this.mHandler.getLooper().getThread().getId())
      {
        i = this.uhV.dcZ();
        AppMethodBeat.o(6067);
      }
    while (true)
    {
      return i;
      i = ((Integer)new d.9(this, Integer.valueOf(0)).b(this.mHandler)).intValue();
      AppMethodBeat.o(6067);
      continue;
      AppMethodBeat.o(6067);
    }
  }

  public final boolean cWG()
  {
    AppMethodBeat.i(6070);
    boolean bool;
    if (this.uhT != null)
    {
      bool = this.uhT.cWG();
      AppMethodBeat.o(6070);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6070);
    }
  }

  public final k cWH()
  {
    return this.uhT;
  }

  public final void cWI()
  {
    AppMethodBeat.i(6072);
    this.mHandler.post(new d.13(this));
    AppMethodBeat.o(6072);
  }

  public final void cWJ()
  {
    AppMethodBeat.i(6074);
    this.mHandler.post(new d.15(this));
    AppMethodBeat.o(6074);
  }

  public final boolean cWK()
  {
    return this.uim;
  }

  public final String cWL()
  {
    AppMethodBeat.i(6083);
    String str = this.bPP.getString("rawUrl");
    AppMethodBeat.o(6083);
    return str;
  }

  public final LuggageGetA8Key cWM()
  {
    return this.uii;
  }

  public final c cWN()
  {
    return this.uik;
  }

  public final boolean cWO()
  {
    boolean bool1 = true;
    AppMethodBeat.i(6088);
    boolean bool2 = this.bPP.getBoolean("forceHideShare", false);
    boolean bool3 = this.bPP.getBoolean("showShare", true);
    ab.i("MicroMsg.LuggageMMWebPage", "forceHideShare:%b showShareBtn:%b enableMinimize:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(aYc()) });
    if ((!bool2) && (bool3) && (aYc()))
      AppMethodBeat.o(6088);
    while (true)
    {
      return bool1;
      AppMethodBeat.o(6088);
      bool1 = false;
    }
  }

  public final com.tencent.mm.plugin.webview.ui.tools.bag.h cWP()
  {
    return this.uie;
  }

  public void cl(String paramString, int paramInt)
  {
    AppMethodBeat.i(6065);
    this.mHandler.post(new d.24(this, paramString, paramInt));
    AppMethodBeat.o(6065);
  }

  protected void e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(6086);
    ab.i("MicroMsg.LuggageMMWebPage", "onUrlRedirect, reqUrl = %s, full = %s", new Object[] { paramString1, paramString2 });
    if (bo.isNullOrNil(this.mTH))
      this.mTH = paramString2;
    this.uil = paramMap;
    if ((!NQ(paramString1)) && (!this.uis))
    {
      this.bPN.stopLoading();
      if ((paramMap != null) && (paramMap.size() > 0))
      {
        this.bPN.bPA.loadUrl(paramString2, paramMap);
        AppMethodBeat.o(6086);
      }
    }
    while (true)
    {
      return;
      this.bPN.loadUrl(paramString2);
      AppMethodBeat.o(6086);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(6090);
    int i;
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      i = this.bPe.xh().indexOf(this);
      if (i < 0)
        AppMethodBeat.o(6090);
    }
    while (true)
    {
      return;
      if (!this.bPe.xi().bJ(i))
        ((Activity)this.mContext).finish();
      AppMethodBeat.o(6090);
      continue;
      com.tencent.mm.ipcinvoker.l.q(new d.18(this));
      AppMethodBeat.o(6090);
    }
  }

  public void g(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(6078);
    this.uie.afY(paramString);
    ab.i("MicroMsg.LuggageMMWebPage", "load url, url: %s, fromStash: %b", new Object[] { paramString, Boolean.valueOf(this.uis) });
    if (this.uis)
    {
      ab.i("MicroMsg.LuggageMMWebPage", "stash url");
      this.uhT.setOptionEnable(true);
      if (!bo.isNullOrNil(this.bPP.getString("title")))
        cl(this.bPP.getString("title"), 0);
      this.icm = false;
      if (this.uii == null)
        this.uii = new LuggageGetA8Key();
      NS(paramString);
      AppMethodBeat.o(6078);
    }
    while (true)
    {
      return;
      bDv();
      if (NQ(paramString))
        NT(paramString);
      while (this.icm)
      {
        NS(paramString);
        this.icm = false;
        AppMethodBeat.o(6078);
        break;
      }
      g(paramString, null);
      AppMethodBeat.o(6078);
    }
  }

  public final String getTitle()
  {
    AppMethodBeat.i(6071);
    String str = this.uhT.getTitle();
    AppMethodBeat.o(6071);
    return str;
  }

  public final String getUrl()
  {
    if (this.bPN != null);
    for (String str = this.bPN.mUrl; ; str = null)
      return str;
  }

  public final MMWebView getWebView()
  {
    return this.uhQ;
  }

  protected void hK(boolean paramBoolean)
  {
    AppMethodBeat.i(6058);
    if (paramBoolean)
    {
      this.uhT.setVisibility(8);
      this.uhZ.setVisibility(0);
      com.tencent.mm.plugin.webview.luggage.c.a.c(((Activity)this.mContext).getWindow(), true);
      AppMethodBeat.o(6058);
    }
    while (true)
    {
      return;
      this.uhT.setVisibility(0);
      this.uhZ.setVisibility(8);
      com.tencent.mm.plugin.webview.luggage.c.a.c(((Activity)this.mContext).getWindow(), false);
      AppMethodBeat.o(6058);
    }
  }

  public final boolean isFullScreen()
  {
    AppMethodBeat.i(6069);
    boolean bool = this.bPP.getBoolean("show_full_screen", false);
    AppMethodBeat.o(6069);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(6055);
    if (!this.uiu)
    {
      this.uiu = true;
      ab.i("MicroMsg.LuggageMMWebPage", "onDestroy");
      IB("onDestroy");
      this.uie.dbc();
      this.uib.uiI = null;
      h.c(this);
      if (this.uie.dbd())
      {
        com.tencent.luggage.d.k localk = this.bPN;
        localLuggageGetA8Key = this.uii;
        m.remove(s.ujF);
        s.ujF = m.a(localk, localLuggageGetA8Key);
      }
      LuggageGetA8Key localLuggageGetA8Key = this.uii;
      if (localLuggageGetA8Key.uld != null)
      {
        localLuggageGetA8Key.uld.aBW();
        localLuggageGetA8Key.uld = null;
        ab.i("MicroMsg.LuggageGetA8Key", "destroy runCgiTask set null");
      }
    }
    AppMethodBeat.o(6055);
  }

  public void reload()
  {
    AppMethodBeat.i(6056);
    this.uhQ.reload();
    AppMethodBeat.o(6056);
  }

  public final void setPageOrientation(int paramInt)
  {
    AppMethodBeat.i(6057);
    this.bPP.putInt("screen_orientation", paramInt);
    ((Activity)this.mContext).setRequestedOrientation(paramInt);
    AppMethodBeat.o(6057);
  }

  public final void setStatusBarColor(int paramInt)
  {
    AppMethodBeat.i(6063);
    this.uio = true;
    this.uiq = paramInt;
    bDF();
    AppMethodBeat.o(6063);
  }

  public boolean wD(int paramInt)
  {
    AppMethodBeat.i(6068);
    boolean bool = this.uii.dA(getUrl(), paramInt);
    AppMethodBeat.o(6068);
    return bool;
  }

  public View wR()
  {
    AppMethodBeat.i(6049);
    this.uhQ = ((com.tencent.mm.plugin.webview.luggage.d.a)this.bPN.xr());
    this.uhR = new j(this.mContext, super.wR());
    this.uhQ.setCompetitorView(this.uhR);
    this.uhQ.setSource(this.bPP.getString("KPublisherId"));
    this.odV = new FrameLayout(this.mContext);
    this.uhS = new LinearLayout(this.mContext);
    this.uhS.setBackgroundColor(-1);
    this.odV.addView(this.uhS, new FrameLayout.LayoutParams(-1, -1));
    this.uhS.setOrientation(1);
    this.uhS.addView(bDD());
    Object localObject = v.hu(this.mContext).inflate(2130970011, this.uhS, false);
    this.uhS.addView((View)localObject, new ViewGroup.LayoutParams(-1, -1));
    this.uia = ((FrameLayout)((View)localObject).findViewById(2131821064));
    this.uhY = ((MMFalseProgressBar)((View)localObject).findViewById(2131823605));
    this.uhZ = ((MovingImageButton)((View)localObject).findViewById(2131824562));
    this.uhZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(6021);
        d.this.bDy();
        AppMethodBeat.o(6021);
      }
    });
    this.uhU = ((WebViewKeyboardLinearLayout)((View)localObject).findViewById(2131824559));
    ((FrameLayout)((View)localObject).findViewById(2131825691)).addView(this.uhR, new ViewGroup.LayoutParams(-1, -1));
    this.uhV = ((WebViewInputFooter)((View)localObject).findViewById(2131824560));
    this.uhV.hide();
    this.uhV.setOnTextSendListener(new d.25(this));
    this.uhV.setOnSmileyChosenListener(new WebViewInputFooter.a()
    {
      public final boolean EH(String paramAnonymousString)
      {
        AppMethodBeat.i(6004);
        d.this.bPN.a(new d.2.1(this, paramAnonymousString));
        AppMethodBeat.o(6004);
        return true;
      }
    });
    this.uhV.setOnSmileyPanelVisibilityChangedListener(new WebViewInputFooter.b()
    {
      public final void cWT()
      {
        AppMethodBeat.i(6005);
        d.this.IE(0);
        AppMethodBeat.o(6005);
      }

      public final void cWU()
      {
        AppMethodBeat.i(6006);
        if ((d.c(d.this) != null) && (d.c(d.this).getKeyBoardHeight() > 0))
          d.this.IE(d.c(d.this).getKeyBoardHeight());
        AppMethodBeat.o(6006);
      }
    });
    this.uhW = ((WebViewSearchContentInputFooter)((View)localObject).findViewById(2131824561));
    this.uhW.setActionDelegate(new WebViewSearchContentInputFooter.a()
    {
      public final void a(WebViewSearchContentInputFooter paramAnonymousWebViewSearchContentInputFooter)
      {
        AppMethodBeat.i(6008);
        if (paramAnonymousWebViewSearchContentInputFooter.getVisibility() == 0)
          b(paramAnonymousWebViewSearchContentInputFooter);
        AppMethodBeat.o(6008);
      }

      public final void b(WebViewSearchContentInputFooter paramAnonymousWebViewSearchContentInputFooter)
      {
        AppMethodBeat.i(6011);
        d.this.uhQ.clearMatches();
        paramAnonymousWebViewSearchContentInputFooter.reset();
        d.d(d.this).t(0, 0, true);
        d.this.uhQ.findAllAsync(paramAnonymousWebViewSearchContentInputFooter.getSearchContent());
        AppMethodBeat.o(6011);
      }

      public final boolean c(int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        return false;
      }

      public final void cWV()
      {
        AppMethodBeat.i(6007);
        d.a(d.this, 0);
        d.this.uhQ.clearMatches();
        d.d(d.this).dcX();
        AppMethodBeat.o(6007);
      }

      public final void cWW()
      {
        AppMethodBeat.i(6009);
        d.this.uhQ.findNext(false);
        AppMethodBeat.o(6009);
      }

      public final void cWX()
      {
        AppMethodBeat.i(6010);
        d.this.uhQ.findNext(true);
        AppMethodBeat.o(6010);
      }
    });
    this.uhQ.setFindListener(new d.5(this));
    this.uhX = ((FrameLayout)((View)localObject).findViewById(2131823604));
    if (this.uhX != null)
      this.uhX.setOnClickListener(new d.19(this));
    this.uhU.setOnkbdStateListener(new d.6(this));
    this.uhQ.setOnTouchListener(new d.20(this));
    localObject = this.odV;
    AppMethodBeat.o(6049);
    return localObject;
  }

  public void wU()
  {
    AppMethodBeat.i(6053);
    ab.i("MicroMsg.LuggageMMWebPage", "onForeground");
    setPageOrientation(this.bPP.getInt("screen_orientation", -1));
    hK(isFullScreen());
    bDE();
    IB("onResume");
    this.uhQ.onResume();
    this.uit = true;
    AppMethodBeat.o(6053);
  }

  public void wW()
  {
    AppMethodBeat.i(6054);
    ab.i("MicroMsg.LuggageMMWebPage", "onBackground");
    IB("onPause");
    this.uhT.bDz();
    this.uhQ.onPause();
    this.uit = false;
    AppMethodBeat.o(6054);
  }

  public String xt()
  {
    AppMethodBeat.i(6082);
    String str = com.tencent.luggage.g.i.p(this.mContext, "luggage_mm_adapter.js");
    AppMethodBeat.o(6082);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d
 * JD-Core Version:    0.6.2
 */