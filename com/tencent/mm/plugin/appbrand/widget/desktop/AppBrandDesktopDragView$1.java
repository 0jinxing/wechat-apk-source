package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandDesktopDragView$1
  implements d.a
{
  AppBrandDesktopDragView$1(AppBrandDesktopDragView paramAppBrandDesktopDragView)
  {
  }

  public final float aNa()
  {
    AppMethodBeat.i(133734);
    float f = AppBrandDesktopDragView.a(this.iWO);
    AppMethodBeat.o(133734);
    return f;
  }

  public final float aNb()
  {
    AppMethodBeat.i(133735);
    float f = AppBrandDesktopDragView.b(this.iWO);
    AppMethodBeat.o(133735);
    return f;
  }

  public final void aPj()
  {
    AppMethodBeat.i(133736);
    ab.d("MicroMsg.AppBrandDesktopDragView", "alvinluo onInsert");
    AppBrandDesktopDragView.a(this.iWO, true);
    AppMethodBeat.o(133736);
  }

  public final void aPk()
  {
    AppMethodBeat.i(133737);
    ab.d("MicroMsg.AppBrandDesktopDragView", "alvinluo onCancelInsert");
    AppBrandDesktopDragView.a(this.iWO, false);
    AppMethodBeat.o(133737);
  }

  public final Object bz(Object paramObject)
  {
    AppMethodBeat.i(133732);
    if ((paramObject instanceof AppBrandDesktopView.c))
    {
      AppBrandDesktopView.c localc = (AppBrandDesktopView.c)paramObject;
      paramObject = new AppBrandDesktopView.c(1);
      paramObject.iXW = localc.iXW;
      paramObject.position = localc.position;
      AppMethodBeat.o(133732);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(133732);
    }
  }

  public final View cv(View paramView)
  {
    AppMethodBeat.i(133733);
    paramView = paramView.findViewById(2131821502);
    AppMethodBeat.o(133733);
    return paramView;
  }

  public final void f(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof AppBrandDesktopView.c))
      ((AppBrandDesktopView.c)paramObject).position = paramInt;
  }

  public final boolean x(Object paramObject1, Object paramObject2)
  {
    boolean bool = true;
    AppMethodBeat.i(133738);
    if ((paramObject2 == null) || (paramObject1 == null))
    {
      AppMethodBeat.o(133738);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((paramObject2 instanceof AppBrandDesktopView.c)) && ((paramObject1 instanceof AppBrandDesktopView.c)))
      {
        paramObject2 = (AppBrandDesktopView.c)paramObject2;
        paramObject1 = (AppBrandDesktopView.c)paramObject1;
        if ((paramObject2.iXW != null) && (paramObject1.iXW != null) && (!bo.isNullOrNil(paramObject2.iXW.username)) && (!bo.isNullOrNil(paramObject1.iXW.username)) && (paramObject1.iXW.e(paramObject2.iXW)));
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label124;
          AppMethodBeat.o(133738);
          break;
        }
      }
      label124: AppMethodBeat.o(133738);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.1
 * JD-Core Version:    0.6.2
 */