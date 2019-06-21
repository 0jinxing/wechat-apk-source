package com.tencent.mm.plugin.game.luggage.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.tencent.luggage.d.k;
import com.tencent.luggage.webview.a.a;
import com.tencent.luggage.webview.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import java.util.Map;

public class d extends com.tencent.mm.plugin.webview.luggage.d.a
{
  private static final Object lock;
  String mTH;
  private String mTitle;
  private c mUE;
  private boolean mUF;
  Map<String, String> mUG;
  private String mUH;
  private boolean mUI;
  private boolean mUJ;
  private boolean mUK;
  private boolean mUL;
  private boolean mUM;
  private GameWebPerformanceInfo mUN;
  private ViewGroup mUO;
  private boolean mUP;
  private Object mUQ;
  private Runnable mUR;

  static
  {
    AppMethodBeat.i(135962);
    lock = new Object();
    AppMethodBeat.o(135962);
  }

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(135946);
    this.mUF = false;
    this.mUI = false;
    this.mUJ = false;
    this.mUK = false;
    this.mUL = false;
    this.mUM = false;
    this.mUP = false;
    this.mUQ = new Object();
    this.mUR = new d.1(this);
    this.mUE = new c();
    this.mUE.uVC = new d.2(this);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "create, hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(135946);
  }

  private void bDA()
  {
    AppMethodBeat.i(135952);
    if ((this.mUK) && (this.mUL))
      postDelayed(this.mUR, 3000L);
    AppMethodBeat.o(135952);
  }

  public final boolean NQ(String paramString)
  {
    AppMethodBeat.i(135959);
    com.tencent.luggage.g.d.d("MicroMsg.GameWebCoreImpl", "isWebCacheUrl, hasLoadWePkg: %b", new Object[] { Boolean.valueOf(this.mUF) });
    if (!this.mUF)
    {
      this.mUE.bO(paramString, true);
      this.mUF = true;
    }
    boolean bool = this.mUE.ahB(paramString);
    AppMethodBeat.o(135959);
    return bool;
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(135949);
    super.a(parama);
    runOnUiThread(new d.3(this));
    AppMethodBeat.o(135949);
  }

  protected void b(WebView arg1, String paramString)
  {
    AppMethodBeat.i(135954);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPageFinished, blockImg: %b", new Object[] { Boolean.valueOf(this.mUJ) });
    if (this.mUN.eCg == 0L)
    {
      this.mUN.eCg = System.currentTimeMillis();
      com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPageFinished, url: %s, time: %d", new Object[] { paramString, Long.valueOf(this.mUN.eCg) });
    }
    if (g.agh(paramString).uDN == 0L)
      g.agh(paramString).uDN = System.currentTimeMillis();
    synchronized (lock)
    {
      getSettings().setBlockNetworkImage(this.mUJ);
      this.mUI = true;
      if (this.mUN.eCd == 0L)
        this.mUN.eCd = System.currentTimeMillis();
      AppMethodBeat.o(135954);
      return;
    }
  }

  protected void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(135953);
    this.mUK = true;
    bDA();
    if (this.mUN.eCf == 0L)
    {
      this.mUN.eCf = System.currentTimeMillis();
      com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPageStarted, url: %s, time: %d", new Object[] { paramString, Long.valueOf(this.mUN.eCf) });
    }
    if (g.agh(paramString).uDM == 0L)
      g.agh(paramString).uDM = System.currentTimeMillis();
    AppMethodBeat.o(135953);
  }

  public void destroy()
  {
    AppMethodBeat.i(135956);
    this.mUE.ot(this.mUM);
    super.destroy();
    AppMethodBeat.o(135956);
  }

  public String getTitle()
  {
    return this.mTitle;
  }

  public c getWePkgPlugin()
  {
    return this.mUE;
  }

  protected final void init()
  {
    AppMethodBeat.i(135951);
    getSettings().setBlockNetworkImage(true);
    setWebViewClientProxy(new d.b(this));
    setWebChromeClientProxy(new d.a(this));
    AppMethodBeat.o(135951);
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(135957);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time : %d, hashCode: %d", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode()) });
    this.mUH = paramString;
    if (this.mUN == null)
    {
      this.mUN = GameWebPerformanceInfo.kU(paramString);
      this.mUN.eCe = System.currentTimeMillis();
    }
    com.tencent.luggage.g.d.d("MicroMsg.GameWebCoreImpl", "loadUrl, hasLoadWePkg: %b", new Object[] { Boolean.valueOf(this.mUF) });
    if (!this.mUF)
    {
      this.mUE.bO(paramString, true);
      this.mUF = true;
    }
    super.loadUrl(paramString);
    AppMethodBeat.o(135957);
  }

  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(135958);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time: %d， HEADER", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    this.mUH = paramString;
    if (this.mUN == null)
    {
      this.mUN = GameWebPerformanceInfo.kU(paramString);
      this.mUN.eCe = System.currentTimeMillis();
    }
    com.tencent.luggage.g.d.d("MicroMsg.GameWebCoreImpl", "loadUrl, hasLoadWePkg: %b", new Object[] { Boolean.valueOf(this.mUF) });
    if (!this.mUF)
    {
      this.mUE.bO(paramString, true);
      this.mUF = true;
    }
    super.loadUrl(paramString, paramMap);
    AppMethodBeat.o(135958);
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(135947);
    super.onAttachedToWindow();
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onAttachedToWindow, hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    this.mUL = true;
    bDA();
    AppMethodBeat.o(135947);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(135948);
    super.onDetachedFromWindow();
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onDetachedFromWindow, hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    removeCallbacks(this.mUR);
    AppMethodBeat.o(135948);
  }

  public void setBlockNetworkImage(boolean paramBoolean)
  {
    AppMethodBeat.i(135955);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage, blockImg: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mUJ = paramBoolean;
    if (this.mUI);
    while (true)
    {
      synchronized (lock)
      {
        getSettings().setBlockNetworkImage(paramBoolean);
        AppMethodBeat.o(135955);
        return;
      }
      AppMethodBeat.o(135955);
    }
  }

  public void setShouldCleanPkgWhenDestroy(boolean paramBoolean)
  {
    this.mUM = paramBoolean;
  }

  public void xo()
  {
    AppMethodBeat.i(135950);
    super.xo();
    getWebCore().bPD.a(new com.tencent.mm.plugin.game.luggage.a(this));
    AppMethodBeat.o(135950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d
 * JD-Core Version:    0.6.2
 */