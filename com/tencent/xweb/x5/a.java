package com.tencent.xweb.x5;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebViewCallbackClient;
import com.tencent.xweb.o;
import com.tencent.xweb.r;
import org.xwalk.core.Log;

public final class a
{
  public static WebResourceResponse b(o paramo)
  {
    AppMethodBeat.i(84795);
    if (paramo == null)
    {
      paramo = null;
      AppMethodBeat.o(84795);
    }
    while (true)
    {
      return paramo;
      if ((paramo.AMD) && (Build.VERSION.SDK_INT >= 21))
      {
        try
        {
          WebResourceResponse localWebResourceResponse1 = new com/tencent/smtt/export/external/interfaces/WebResourceResponse;
          localWebResourceResponse1.<init>(paramo.mMimeType, paramo.mEncoding, paramo.mStatusCode, paramo.mReasonPhrase, paramo.mResponseHeaders, paramo.mInputStream);
          AppMethodBeat.o(84795);
          paramo = localWebResourceResponse1;
        }
        catch (Exception localException)
        {
          Log.e("SysWebDataTrans", "create webkit WebResourceResponse error :" + localException.getMessage());
        }
      }
      else
      {
        WebResourceResponse localWebResourceResponse2 = new WebResourceResponse(paramo.mMimeType, paramo.mEncoding, paramo.mInputStream);
        if ((paramo.mStatusCode > 100) && (paramo.mReasonPhrase != null) && (!paramo.mReasonPhrase.isEmpty()))
          localWebResourceResponse2.setStatusCodeAndReasonPhrase(paramo.mStatusCode, paramo.mReasonPhrase);
        localWebResourceResponse2.setResponseHeaders(paramo.mResponseHeaders);
        AppMethodBeat.o(84795);
        paramo = localWebResourceResponse2;
      }
    }
  }

  public static final class f
    implements WebViewCallbackClient
  {
    r AQq;

    public f(r paramr)
    {
      this.AQq = paramr;
    }

    public final void computeScroll(View paramView)
    {
      AppMethodBeat.i(84791);
      if (this.AQq != null)
        this.AQq.aGs();
      AppMethodBeat.o(84791);
    }

    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      AppMethodBeat.i(84790);
      boolean bool;
      if (this.AQq != null)
      {
        bool = this.AQq.B(paramMotionEvent);
        AppMethodBeat.o(84790);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(84790);
      }
    }

    public final void invalidate()
    {
    }

    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      AppMethodBeat.i(84793);
      boolean bool;
      if (this.AQq != null)
      {
        bool = this.AQq.C(paramMotionEvent);
        AppMethodBeat.o(84793);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(84793);
      }
    }

    public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
    {
      AppMethodBeat.i(84792);
      if (this.AQq != null)
        this.AQq.d(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      AppMethodBeat.o(84792);
    }

    public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
    {
      AppMethodBeat.i(84794);
      if (this.AQq != null)
        this.AQq.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
      AppMethodBeat.o(84794);
    }

    public final boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      AppMethodBeat.i(84788);
      boolean bool;
      if (this.AQq != null)
      {
        bool = this.AQq.A(paramMotionEvent);
        AppMethodBeat.o(84788);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(84788);
      }
    }

    public final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
    {
      AppMethodBeat.i(84789);
      if (this.AQq != null)
      {
        paramBoolean = this.AQq.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
        AppMethodBeat.o(84789);
      }
      while (true)
      {
        return paramBoolean;
        paramBoolean = false;
        AppMethodBeat.o(84789);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a
 * JD-Core Version:    0.6.2
 */