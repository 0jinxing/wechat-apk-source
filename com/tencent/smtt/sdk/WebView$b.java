package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

class WebView$b extends android.webkit.WebView
{
  public WebView$b(WebView paramWebView, Context paramContext)
  {
    this(paramWebView, paramContext, null);
  }

  public WebView$b(WebView paramWebView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(64843);
    if ((!QbSdk.getIsSysWebViewForcedByOuter()) || (!TbsShareManager.isThirdPartyApp(paramContext)))
      CookieSyncManager.createInstance(WebView.a(paramWebView)).startSync();
    while (true)
    {
      try
      {
        paramWebView = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
        paramWebView.setAccessible(true);
        paramContext = ((Handler)paramWebView.invoke(null, new Object[0])).getLooper().getThread();
        paramWebView = new com/tencent/smtt/sdk/p;
        paramWebView.<init>();
        paramContext.setUncaughtExceptionHandler(paramWebView);
        WebView.mSysWebviewCreated = true;
        AppMethodBeat.o(64843);
        return;
      }
      catch (Exception paramWebView)
      {
      }
      AppMethodBeat.o(64843);
    }
  }

  public void a()
  {
    AppMethodBeat.i(64849);
    super.computeScroll();
    AppMethodBeat.o(64849);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(64847);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(64847);
  }

  @TargetApi(9)
  public void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(64856);
    if (Build.VERSION.SDK_INT >= 9)
      super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(64856);
  }

  @TargetApi(9)
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(64854);
    if (Build.VERSION.SDK_INT >= 9)
    {
      paramBoolean = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      AppMethodBeat.o(64854);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(64854);
    }
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64851);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(64851);
    return bool;
  }

  public boolean b(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64858);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(64858);
    return bool;
  }

  public boolean c(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64860);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(64860);
    return bool;
  }

  public void computeScroll()
  {
    AppMethodBeat.i(64848);
    if (this.a.mWebViewCallbackClient != null)
    {
      this.a.mWebViewCallbackClient.computeScroll(this);
      AppMethodBeat.o(64848);
    }
    while (true)
    {
      return;
      super.computeScroll();
      AppMethodBeat.o(64848);
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(64852);
    try
    {
      super.dispatchDraw(paramCanvas);
      if ((!WebView.f()) && (WebView.g() != null))
      {
        paramCanvas.save();
        paramCanvas.drawPaint(WebView.g());
        paramCanvas.restore();
      }
      AppMethodBeat.o(64852);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
        AppMethodBeat.o(64852);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64857);
    boolean bool;
    if (this.a.mWebViewCallbackClient != null)
    {
      bool = this.a.mWebViewCallbackClient.dispatchTouchEvent(paramMotionEvent, this);
      AppMethodBeat.o(64857);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(64857);
    }
  }

  public WebSettings getSettings()
  {
    AppMethodBeat.i(64845);
    try
    {
      WebSettings localWebSettings = super.getSettings();
      AppMethodBeat.o(64845);
      return localWebSettings;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(64845);
      }
    }
  }

  public void invalidate()
  {
    AppMethodBeat.i(64844);
    super.invalidate();
    if (this.a.mWebViewCallbackClient != null)
      this.a.mWebViewCallbackClient.invalidate();
    AppMethodBeat.o(64844);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64859);
    boolean bool;
    if (this.a.mWebViewCallbackClient != null)
    {
      bool = this.a.mWebViewCallbackClient.onInterceptTouchEvent(paramMotionEvent, this);
      AppMethodBeat.o(64859);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(64859);
    }
  }

  @TargetApi(9)
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(64855);
    if (this.a.mWebViewCallbackClient != null)
    {
      this.a.mWebViewCallbackClient.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2, this);
      AppMethodBeat.o(64855);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 9)
        super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      AppMethodBeat.o(64855);
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(64846);
    if (this.a.mWebViewCallbackClient != null)
    {
      this.a.mWebViewCallbackClient.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, this);
      AppMethodBeat.o(64846);
    }
    while (true)
    {
      return;
      super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      WebView.b(this.a, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(64846);
    }
  }

  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(64850);
    if (!hasFocus())
      requestFocus();
    boolean bool;
    if (this.a.mWebViewCallbackClient != null)
    {
      bool = this.a.mWebViewCallbackClient.onTouchEvent(paramMotionEvent, this);
      AppMethodBeat.o(64850);
    }
    while (true)
    {
      return bool;
      try
      {
        bool = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(64850);
      }
      catch (Exception paramMotionEvent)
      {
        bool = false;
        AppMethodBeat.o(64850);
      }
    }
  }

  @TargetApi(9)
  public boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(64853);
    if (this.a.mWebViewCallbackClient != null)
    {
      paramBoolean = this.a.mWebViewCallbackClient.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean, this);
      AppMethodBeat.o(64853);
    }
    while (true)
    {
      return paramBoolean;
      if (Build.VERSION.SDK_INT >= 9)
      {
        paramBoolean = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
        AppMethodBeat.o(64853);
      }
      else
      {
        paramBoolean = false;
        AppMethodBeat.o(64853);
      }
    }
  }

  public void setOverScrollMode(int paramInt)
  {
    AppMethodBeat.i(64861);
    try
    {
      super.setOverScrollMode(paramInt);
      AppMethodBeat.o(64861);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64861);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebView.b
 * JD-Core Version:    0.6.2
 */