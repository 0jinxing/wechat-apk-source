package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.r;
import com.tencent.xweb.x5.a.a.a.a.b;

final class a$4 extends b
{
  a$4(a parama)
  {
  }

  public final void computeScroll(View paramView)
  {
    AppMethodBeat.i(131646);
    a.c(this.icu).aGs();
    AppMethodBeat.o(131646);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(131642);
    boolean bool = a.c(this.icu).B(paramMotionEvent);
    AppMethodBeat.o(131642);
    return bool;
  }

  public final void invalidate()
  {
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(131641);
    boolean bool = a.c(this.icu).C(paramMotionEvent);
    AppMethodBeat.o(131641);
    return bool;
  }

  public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    AppMethodBeat.i(131645);
    a.c(this.icu).d(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(131645);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(131644);
    a.c(this.icu).onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(131644);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(131640);
    boolean bool = a.c(this.icu).A(paramMotionEvent);
    AppMethodBeat.o(131640);
    return bool;
  }

  public final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(131643);
    paramBoolean = a.c(this.icu).b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(131643);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.a.4
 * JD-Core Version:    0.6.2
 */