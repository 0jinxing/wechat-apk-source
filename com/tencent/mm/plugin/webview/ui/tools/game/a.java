package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.p;
import java.io.File;

public final class a
{
  ViewGroup SW;
  MMWebView fow;
  Context mContext;
  String mUH;
  GameWebPerformanceInfo mUN;
  c mUY;
  long mUZ;
  g mVc;
  GameWebViewUI uDb;
  private h uDc;
  com.tencent.mm.plugin.webview.ui.tools.jsapi.d uDd;
  com.tencent.mm.plugin.wepkg.c uDe;
  b uDf;
  private a.a uDg;
  f uDh;
  private boolean uDi;
  m uDj;
  com.tencent.mm.plugin.webview.stub.d uzS;

  public a(GameWebViewUI paramGameWebViewUI, ViewGroup paramViewGroup, String paramString)
  {
    AppMethodBeat.i(8673);
    this.mUY = new a.1(this);
    this.uDj = new a.4(this);
    this.mUN = GameWebPerformanceInfo.kV(paramString);
    this.mUN.url = paramString;
    this.mUN.eBJ = ((paramGameWebViewUI.hashCode() & 0x7FFFFFFF) + "_" + (paramString.hashCode() & 0x7FFFFFFF));
    long l = System.currentTimeMillis();
    this.mUN.startTime = paramGameWebViewUI.getIntent().getLongExtra("start_time", l);
    this.mUN.eBU = paramGameWebViewUI.getIntent().getLongExtra("start_activity_time", l);
    this.mUN.eBZ = l;
    this.mUN.eCb = l;
    this.mVc = g.agg(paramString);
    this.mVc.startTime = System.currentTimeMillis();
    this.mContext = paramGameWebViewUI;
    this.uDb = paramGameWebViewUI;
    this.SW = paramViewGroup;
    paramViewGroup = MMWebViewWithJsApi.a.fw(this.mContext);
    paramViewGroup.setBackgroundResource(17170445);
    paramViewGroup.setBackgroundColor(0);
    paramViewGroup.setVisibility(4);
    this.uDf = new b(paramViewGroup);
    paramViewGroup.setWebViewClient(this.uDf);
    this.uDg = new a.a(this, (MMWebViewWithJsApi)paramViewGroup);
    paramViewGroup.setWebChromeClient(this.uDg);
    ab.i("MicroMsg.GameFloatWebView", "createFloatWebView, webview: %d, floatWebViewClient: %d", new Object[] { Integer.valueOf(paramViewGroup.hashCode()), Integer.valueOf(this.uDf.hashCode()) });
    if (paramViewGroup.getIsX5Kernel())
      paramViewGroup.setWebViewClientExtension(new a.c(this, (byte)0));
    paramViewGroup.getSettings().setJavaScriptEnabled(true);
    paramViewGroup.getSettings().dUh();
    paramViewGroup.getSettings().setBuiltInZoomControls(false);
    paramViewGroup.getSettings().setUseWideViewPort(true);
    paramViewGroup.getSettings().setLoadWithOverviewMode(true);
    paramViewGroup.getSettings().dUc();
    paramViewGroup.getSettings().dUb();
    paramViewGroup.getSettings().setGeolocationEnabled(true);
    paramViewGroup.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    paramViewGroup.getSettings().dUj();
    paramViewGroup.getSettings().dUf();
    paramViewGroup.getSettings().setAppCachePath(this.mContext.getDir("webviewcache", 0).getAbsolutePath());
    paramViewGroup.getSettings().dUe();
    paramViewGroup.getSettings().dUg();
    paramViewGroup.getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.eSi + "databases/");
    com.tencent.xweb.b.dTR().dTS();
    com.tencent.xweb.b.dTR().f(paramViewGroup);
    this.fow = paramViewGroup;
    this.uDc = new h(paramGameWebViewUI.getIntent());
    this.uDe = new com.tencent.mm.plugin.wepkg.c();
    this.uDe.uVC = new a.2(this);
    this.mUN.eCc = System.currentTimeMillis();
    this.mVc.uDL = System.currentTimeMillis();
    AppMethodBeat.o(8673);
  }

  final int dF(String paramString, int paramInt)
  {
    AppMethodBeat.i(8674);
    int i = paramInt;
    if (paramInt == 0)
    {
      if ((paramString == null) || (paramString.length() <= 0))
        break label137;
      if (this.uzS != null)
        break label59;
      i = 1;
    }
    while (true)
    {
      ab.i("MicroMsg.GameFloatWebView", "KGetA8KeyScene = %s", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(8674);
      return i;
      try
      {
        label59: if (this.uzS.nI(paramString))
        {
          i = 8;
          continue;
        }
        boolean bool = this.uzS.mZ(paramString);
        if (bool)
        {
          i = 7;
          continue;
        }
        i = 1;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.GameFloatWebView", "getScene fail, ex = " + paramString.getMessage());
        i = 1;
      }
      continue;
      label137: i = 0;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(8675);
    if (!this.uDi)
    {
      ab.i("MicroMsg.GameFloatWebView", "onDestroy");
      this.uDi = true;
      c.a(this.mUY.uDp.uDq);
      this.uDe.ot(true);
      if (this.fow != null)
      {
        this.fow.setWebViewClient(null);
        this.fow.setWebChromeClient(null);
      }
      GameWebPerformanceInfo localGameWebPerformanceInfo = this.mUN;
      localGameWebPerformanceInfo.eCj += System.currentTimeMillis() - this.mUZ;
      this.mUN.eCk = System.currentTimeMillis();
      com.tencent.mm.game.report.api.c.eBG.a(this.mUN);
      GameWebPerformanceInfo.kW(this.mUH);
      e.agf(this.mUH);
      g.agi(this.mUH);
    }
    AppMethodBeat.o(8675);
  }

  final class b extends b
  {
    public b(MMWebView arg2)
    {
      super();
    }

    public final void NT(String paramString)
    {
      AppMethodBeat.i(8662);
      if (a.this.uDe.dgi())
      {
        this.fow.loadUrl(paramString);
        AppMethodBeat.o(8662);
      }
      while (true)
      {
        return;
        super.NT(paramString);
        AppMethodBeat.o(8662);
      }
    }

    public final o a(WebView paramWebView, n paramn)
    {
      AppMethodBeat.i(8667);
      if ((paramn == null) || (paramn.getUrl() == null))
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(8667);
      }
      while (true)
      {
        return paramWebView;
        o localo = a.this.uDe.ahA(paramn.getUrl().toString());
        if (localo != null)
        {
          AppMethodBeat.o(8667);
          paramWebView = localo;
        }
        else
        {
          paramWebView = super.a(paramWebView, paramn);
          AppMethodBeat.o(8667);
        }
      }
    }

    public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
    {
      AppMethodBeat.i(8668);
      if ((paramn == null) || (paramn.getUrl() == null))
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(8668);
      }
      while (true)
      {
        return paramWebView;
        o localo = a.this.uDe.ahA(paramn.getUrl().toString());
        if (localo != null)
        {
          AppMethodBeat.o(8668);
          paramWebView = localo;
        }
        else
        {
          paramWebView = super.a(paramWebView, paramn, paramBundle);
          AppMethodBeat.o(8668);
        }
      }
    }

    public final void a(com.tencent.mm.plugin.webview.stub.d paramd, k paramk)
    {
      a.this.uzS = paramd;
    }

    public final void a(com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
    {
      AppMethodBeat.i(8659);
      ab.i("MicroMsg.GameFloatWebView", "jsapi ready");
      a.this.uDd = paramd;
      AppMethodBeat.o(8659);
    }

    public final void a(f paramf)
    {
      AppMethodBeat.i(8660);
      ab.i("MicroMsg.GameFloatWebView", "jsloader ready");
      a.this.uDh = paramf;
      AppMethodBeat.o(8660);
    }

    public final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(8657);
      long l = System.currentTimeMillis();
      ab.i("MicroMsg.GameFloatWebView", "onPageStarted opt, url = %s, now = %d", new Object[] { paramString, Long.valueOf(l) });
      if (a.this.mUN.eCf == 0L)
        a.this.mUN.eCf = l;
      if (a.this.mVc.uDM == 0L)
        a.this.mVc.uDM = l;
      a.this.mUY.uDp.dbY();
      a.this.uDe.j(paramWebView, paramString);
      AppMethodBeat.o(8657);
    }

    public final m aGt()
    {
      return a.this.uDj;
    }

    public final boolean afI(String paramString)
    {
      AppMethodBeat.i(8661);
      boolean bool = a.this.uDe.ahB(paramString);
      AppMethodBeat.o(8661);
      return bool;
    }

    public final boolean agc(String paramString)
    {
      AppMethodBeat.i(8663);
      boolean bool = super.agc(paramString);
      AppMethodBeat.o(8663);
      return bool;
    }

    public final void agd(String paramString)
    {
      AppMethodBeat.i(8664);
      try
      {
        ab.i("MicroMsg.GameFloatWebView", "onURLFilteredOut url:%s", new Object[] { paramString });
        a.this.SW.removeView(this.fow);
        AppMethodBeat.o(8664);
        return;
      }
      catch (Exception paramString)
      {
        while (true)
          AppMethodBeat.o(8664);
      }
    }

    public final boolean am(Bundle paramBundle)
    {
      AppMethodBeat.i(8671);
      long l = System.currentTimeMillis();
      if (a.this.mUN.eCi == 0L)
        a.this.mUN.eCi = l;
      if (a.this.mVc.uDP == 0L)
        a.this.mVc.uDP = l;
      boolean bool = super.am(paramBundle);
      AppMethodBeat.o(8671);
      return bool;
    }

    public final void bI(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(8670);
      long l = System.currentTimeMillis();
      if (a.this.mUN.eCh == 0L)
        a.this.mUN.eCh = l;
      if (a.this.mVc.uDO == 0L)
        a.this.mVc.uDO = l;
      super.bI(paramString, paramBoolean);
      AppMethodBeat.o(8670);
    }

    public final o c(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(8666);
      o localo = a.this.uDe.ahA(paramString);
      if (localo != null)
      {
        AppMethodBeat.o(8666);
        paramWebView = localo;
      }
      while (true)
      {
        return paramWebView;
        paramWebView = super.c(paramWebView, paramString);
        AppMethodBeat.o(8666);
      }
    }

    public final void dbT()
    {
      AppMethodBeat.i(8665);
      if (Build.VERSION.SDK_INT >= 11)
      {
        this.fow.removeJavascriptInterface("MicroMsg");
        this.fow.removeJavascriptInterface("JsApi");
      }
      try
      {
        this.fow.setWebChromeClient(null);
        this.fow.setWebViewClient(null);
        this.fow.setOnTouchListener(null);
        this.fow.setOnLongClickListener(null);
        this.fow.setVisibility(8);
        this.fow.removeAllViews();
        this.fow.clearView();
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            this.fow.destroy();
            AppMethodBeat.o(8665);
            return;
            localException1 = localException1;
            ab.e("MicroMsg.GameFloatWebView", "onDestroy, set web infos to null,  ex = %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.w("MicroMsg.GameFloatWebView", "onDestroy, viewWV destroy, ex = %s", new Object[] { localException2.getMessage() });
            AppMethodBeat.o(8665);
          }
        }
      }
    }

    public final void dbU()
    {
      AppMethodBeat.i(8669);
      a.this.mUN.eCe = System.currentTimeMillis();
      super.dbU();
      AppMethodBeat.o(8669);
    }

    public final void e(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(8658);
      long l = System.currentTimeMillis();
      ab.i("MicroMsg.GameFloatWebView", "onPageFinished opt, url = %s, now = %d", new Object[] { paramString, Long.valueOf(l) });
      if (a.this.mUN.eCg == 0L)
        a.this.mUN.eCg = l;
      if (a.this.mVc.uDN == 0L)
        a.this.mVc.uDN = l;
      if (a.this.mUN.eCa == 0L)
      {
        a.this.mUN.eCa = l;
        a.this.mUZ = l;
      }
      this.fow.setVisibility(0);
      a.this.uDe.k(paramWebView, paramString);
      a.this.mUY.uDp.dbZ();
      AppMethodBeat.o(8658);
    }

    public final String getSource()
    {
      return h.cMm;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a
 * JD-Core Version:    0.6.2
 */