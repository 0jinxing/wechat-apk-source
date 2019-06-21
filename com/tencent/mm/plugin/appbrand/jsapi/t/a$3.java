package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.r;

final class a$3
  implements r
{
  a$3(a parama)
  {
  }

  public final boolean A(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(131633);
    boolean bool = a.b(this.icu).Q(paramMotionEvent);
    AppMethodBeat.o(131633);
    return bool;
  }

  public final boolean B(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(131638);
    boolean bool = a.b(this.icu).R(paramMotionEvent);
    AppMethodBeat.o(131638);
    return bool;
  }

  public final boolean C(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(131639);
    boolean bool = a.b(this.icu).S(paramMotionEvent);
    AppMethodBeat.o(131639);
    return bool;
  }

  public final void aGs()
  {
    AppMethodBeat.i(131635);
    a.b(this.icu).dKK();
    AppMethodBeat.o(131635);
  }

  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(131634);
    paramBoolean = a.b(this.icu).c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(131634);
    return paramBoolean;
  }

  @TargetApi(9)
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(131636);
    a.b(this.icu).e(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(131636);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(131637);
    a.b(this.icu).M(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(131637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.a.3
 * JD-Core Version:    0.6.2
 */