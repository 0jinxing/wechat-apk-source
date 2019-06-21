package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.x5.a.a.a.a.b;

public class e extends b
{
  private b uiH;

  public e()
  {
    AppMethodBeat.i(6095);
    this.uiH = new b();
    AppMethodBeat.o(6095);
  }

  public final void a(b paramb)
  {
    if (paramb != null)
      this.uiH = paramb;
  }

  public void computeScroll(View paramView)
  {
    AppMethodBeat.i(6103);
    this.uiH.computeScroll(paramView);
    AppMethodBeat.o(6103);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(6099);
    boolean bool = this.uiH.dispatchTouchEvent(paramMotionEvent, paramView);
    AppMethodBeat.o(6099);
    return bool;
  }

  public void invalidate()
  {
    AppMethodBeat.i(6105);
    this.uiH.invalidate();
    AppMethodBeat.o(6105);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(6098);
    boolean bool = this.uiH.onInterceptTouchEvent(paramMotionEvent, paramView);
    AppMethodBeat.o(6098);
    return bool;
  }

  public Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(6096);
    paramString = this.uiH.onMiscCallBack(paramString, paramBundle);
    AppMethodBeat.o(6096);
    return paramString;
  }

  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    AppMethodBeat.i(6102);
    this.uiH.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2, paramView);
    AppMethodBeat.o(6102);
  }

  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(6101);
    this.uiH.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(6101);
  }

  public boolean onShowLongClickPopupMenu()
  {
    AppMethodBeat.i(6104);
    boolean bool = this.uiH.onShowLongClickPopupMenu();
    AppMethodBeat.o(6104);
    return bool;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(6097);
    boolean bool = this.uiH.onTouchEvent(paramMotionEvent, paramView);
    AppMethodBeat.o(6097);
    return bool;
  }

  public boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(6100);
    paramBoolean = this.uiH.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean, paramView);
    AppMethodBeat.o(6100);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.e
 * JD-Core Version:    0.6.2
 */