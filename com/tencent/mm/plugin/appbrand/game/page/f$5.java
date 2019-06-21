package com.tencent.mm.plugin.appbrand.game.page;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$5
  implements WAGamePageViewContainerLayout.a
{
  f$5(f paramf)
  {
  }

  public final void a(WAGamePageViewContainerLayout.b paramb1, WAGamePageViewContainerLayout.b paramb2)
  {
    AppMethodBeat.i(130244);
    ab.v("AppBrandGame.WAGamePageView", "hy: after change. old direction:%s, new direction: %s", new Object[] { paramb1, paramb2 });
    if (f.d(this.hsW) == null)
    {
      ab.e("AppBrandGame.WAGamePageView", "hy: screenshot is null");
      AppMethodBeat.o(130244);
    }
    while (true)
    {
      return;
      if (((f.a(paramb1)) && (f.a(paramb2))) || ((f.b(paramb1)) && (f.b(paramb2))))
      {
        AppMethodBeat.o(130244);
      }
      else
      {
        if (f.a(paramb2))
        {
          Matrix localMatrix = new Matrix();
          if (((paramb2 == WAGamePageViewContainerLayout.b.htb) && (paramb1 == WAGamePageViewContainerLayout.b.htc)) || ((paramb2 == WAGamePageViewContainerLayout.b.htd) && (paramb1 == WAGamePageViewContainerLayout.b.hte)))
            localMatrix.postRotate(90.0F);
          while (true)
          {
            f.e(this.hsW).setVisibility(0);
            f.e(this.hsW).setImageBitmap(Bitmap.createBitmap(f.d(this.hsW), 0, 0, f.d(this.hsW).getWidth(), f.d(this.hsW).getHeight(), localMatrix, true));
            f.f(this.hsW);
            AppMethodBeat.o(130244);
            break;
            localMatrix.postRotate(270.0F);
          }
        }
        f.g(this.hsW);
        f.a(this.hsW).setOnConfigurationChangedListener(null);
        AppMethodBeat.o(130244);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.5
 * JD-Core Version:    0.6.2
 */