package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.r;

final class aa$7
  implements r
{
  aa$7(aa paramaa)
  {
  }

  public final boolean A(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(132454);
    boolean bool = this.iuq.Q(paramMotionEvent);
    AppMethodBeat.o(132454);
    return bool;
  }

  public final boolean B(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(132459);
    boolean bool = this.iuq.R(paramMotionEvent);
    AppMethodBeat.o(132459);
    return bool;
  }

  public final boolean C(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(132460);
    boolean bool = this.iuq.S(paramMotionEvent);
    AppMethodBeat.o(132460);
    return bool;
  }

  public final void aGs()
  {
    AppMethodBeat.i(132456);
    this.iuq.dKK();
    AppMethodBeat.o(132456);
  }

  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(132455);
    paramBoolean = this.iuq.c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(132455);
    return paramBoolean;
  }

  @TargetApi(9)
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(132457);
    this.iuq.e(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(132457);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(132458);
    if (aa.c(this.iuq) != null)
      aa.c(this.iuq).onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    aa.a(this.iuq);
    this.iuq.M(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(132458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aa.7
 * JD-Core Version:    0.6.2
 */