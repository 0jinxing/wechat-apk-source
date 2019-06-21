package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.f;

final class AppBrandDesktopDragView$3
  implements f
{
  AppBrandDesktopDragView$3(AppBrandDesktopDragView paramAppBrandDesktopDragView)
  {
  }

  public final float aNa()
  {
    AppMethodBeat.i(133747);
    float f = AppBrandDesktopDragView.a(this.iWO);
    AppMethodBeat.o(133747);
    return f;
  }

  public final float aNb()
  {
    AppMethodBeat.i(133748);
    float f = AppBrandDesktopDragView.b(this.iWO);
    AppMethodBeat.o(133748);
    return f;
  }

  public final Object bz(Object paramObject)
  {
    AppMethodBeat.i(133745);
    if ((paramObject instanceof AppBrandDesktopView.c))
    {
      AppBrandDesktopView.c localc = (AppBrandDesktopView.c)paramObject;
      paramObject = new AppBrandDesktopView.c(1);
      paramObject.iXW = localc.iXW;
      AppMethodBeat.o(133745);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(133745);
    }
  }

  public final View cv(View paramView)
  {
    AppMethodBeat.i(133746);
    paramView = paramView.findViewById(2131821502);
    AppMethodBeat.o(133746);
    return paramView;
  }

  public final void f(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof AppBrandDesktopView.c))
      ((AppBrandDesktopView.c)paramObject).position = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.3
 * JD-Core Version:    0.6.2
 */