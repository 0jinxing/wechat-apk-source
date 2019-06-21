package com.tencent.mm.plugin.appbrand.game.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.ah;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.al;

public final class b extends FrameLayout
  implements al
{
  public b(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(ah paramah)
  {
  }

  public final void c(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final ViewGroup getContainer()
  {
    return this;
  }

  public final void nT(int paramInt)
  {
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
  }

  public final void onViewAdded(View paramView)
  {
    AppMethodBeat.i(130217);
    super.onViewAdded(paramView);
    if (((paramView instanceof CoverViewContainer)) && (!paramView.hasOnClickListeners()))
      paramView.setOnTouchListener(new b.a((byte)0));
    AppMethodBeat.o(130217);
  }

  public final void setupWebViewTouchInterceptor(aj paramaj)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.b
 * JD-Core Version:    0.6.2
 */