package com.tencent.mm.plugin.appbrand.game.page;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.plugin.appbrand.page.ad;
import com.tencent.mm.plugin.appbrand.page.ae;
import com.tencent.mm.plugin.appbrand.page.af;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.c;
import java.net.URL;

public final class a
  implements aj
{
  private ViewGroup hsF;
  private ViewGroup hsG;

  public final void H(Runnable paramRunnable)
  {
  }

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
  }

  public final void aAM()
  {
  }

  public final boolean aAN()
  {
    return false;
  }

  public final boolean aAO()
  {
    return false;
  }

  public final boolean aAP()
  {
    return false;
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
  }

  public final <T extends j> T af(Class<T> paramClass)
  {
    return null;
  }

  public final void bU(String paramString1, String paramString2)
  {
  }

  public final void cE(Context paramContext)
  {
    AppMethodBeat.i(130216);
    if (this.hsF == null)
      this.hsF = new FrameLayout(paramContext);
    if (this.hsG == null)
      this.hsG = new FrameLayout(paramContext);
    AppMethodBeat.o(130216);
  }

  public final void destroy()
  {
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
  }

  public final boolean g(Canvas paramCanvas)
  {
    return false;
  }

  public final int getContentHeight()
  {
    return 0;
  }

  public final View getContentView()
  {
    return this.hsG;
  }

  public final int getHeight()
  {
    return 0;
  }

  public final String getUserAgentString()
  {
    return "MiniGame";
  }

  public final int getWebScrollX()
  {
    return 0;
  }

  public final int getWebScrollY()
  {
    return 0;
  }

  public final int getWidth()
  {
    return 0;
  }

  public final View getWrapperView()
  {
    return this.hsF;
  }

  public final void setFullscreenImpl(c paramc)
  {
  }

  public final void setJsExceptionHandler(h paramh)
  {
  }

  public final void setOnScrollChangedListener(af paramaf)
  {
  }

  public final void setOnTrimListener(ae paramae)
  {
  }

  public final void setTitle(String paramString)
  {
  }

  public final void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
  }

  public final void setWebViewLayoutListener(ad paramad)
  {
  }

  public final void wU()
  {
  }

  public final void wW()
  {
  }

  public final void z(int paramInt, long paramLong)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.a
 * JD-Core Version:    0.6.2
 */