package com.tencent.mm.plugin.appbrand.page;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.r;
import com.tencent.xweb.x5.a.a.a.a.b;

final class aa$8 extends b
{
  aa$8(aa paramaa)
  {
  }

  public final void computeScroll(View paramView)
  {
    AppMethodBeat.i(132467);
    aa.d(this.iuq).aGs();
    AppMethodBeat.o(132467);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(132463);
    boolean bool = aa.d(this.iuq).B(paramMotionEvent);
    AppMethodBeat.o(132463);
    return bool;
  }

  public final void hasDiscardCurrentPage(boolean paramBoolean)
  {
    AppMethodBeat.i(132471);
    aa.a(this.iuq, paramBoolean);
    AppMethodBeat.o(132471);
  }

  public final void invalidate()
  {
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(132462);
    boolean bool = aa.d(this.iuq).C(paramMotionEvent);
    AppMethodBeat.o(132462);
    return bool;
  }

  public final Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(132469);
    if ((bo.isNullOrNil(paramString)) || (paramBundle == null))
      AppMethodBeat.o(132469);
    while (true)
    {
      return null;
      ab.i("MicroMsg.AppBrandWebView", "method = %s", new Object[] { paramString });
      AppMethodBeat.o(132469);
    }
  }

  public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    AppMethodBeat.i(132466);
    aa.d(this.iuq).d(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(132466);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(132465);
    aa.d(this.iuq).onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(132465);
  }

  public final boolean onShowLongClickPopupMenu()
  {
    AppMethodBeat.i(132468);
    boolean bool;
    if (WebView.getUsingTbsCoreVersion(this.iuq.getContext()) >= 43011)
    {
      bool = false;
      AppMethodBeat.o(132468);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(132468);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(132461);
    boolean bool = aa.d(this.iuq).A(paramMotionEvent);
    AppMethodBeat.o(132461);
    return bool;
  }

  public final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(132464);
    paramBoolean = aa.d(this.iuq).b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(132464);
    return paramBoolean;
  }

  public final boolean shouldDiscardCurrentPage()
  {
    boolean bool1 = false;
    AppMethodBeat.i(132470);
    boolean bool2;
    if (aa.e(this.iuq) == null)
    {
      AppMethodBeat.o(132470);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      boolean bool3 = aa.e(this.iuq).xU();
      if ((bool3) && (!aa.f(this.iuq)));
      for (bool2 = true; ; bool2 = false)
      {
        ab.i("MicroMsg.AppBrandWebView", "shouldTrimCurrentPage: %b", new Object[] { Boolean.valueOf(bool2) });
        if ((!bool3) || (aa.f(this.iuq)))
          break label102;
        AppMethodBeat.o(132470);
        bool2 = true;
        break;
      }
      label102: AppMethodBeat.o(132470);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aa.8
 * JD-Core Version:    0.6.2
 */