package com.tencent.mm.plugin.webview.luggage.d;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.r;

final class a$8
  implements r
{
  a$8(a parama)
  {
  }

  public final boolean A(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6527);
    boolean bool = this.ulz.Q(paramMotionEvent);
    AppMethodBeat.o(6527);
    return bool;
  }

  public final boolean B(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6532);
    boolean bool = this.ulz.R(paramMotionEvent);
    AppMethodBeat.o(6532);
    return bool;
  }

  public final boolean C(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6533);
    boolean bool = this.ulz.S(paramMotionEvent);
    AppMethodBeat.o(6533);
    return bool;
  }

  public final void aGs()
  {
    AppMethodBeat.i(6529);
    this.ulz.dKK();
    AppMethodBeat.o(6529);
  }

  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(6528);
    paramBoolean = this.ulz.c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(6528);
    return paramBoolean;
  }

  @TargetApi(9)
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(6530);
    this.ulz.e(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(6530);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(6531);
    this.ulz.M(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(6531);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.a.8
 * JD-Core Version:    0.6.2
 */