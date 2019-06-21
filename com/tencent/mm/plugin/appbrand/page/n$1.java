package com.tencent.mm.plugin.appbrand.page;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import me.imid.swipebacklayout.lib.SwipeBackLayout.a;

final class n$1
  implements SwipeBackLayout.a
{
  n$1(n paramn)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    return false;
  }

  public final void h(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(87069);
    n localn;
    if (paramInt != 0)
    {
      n.a(this.irB, true);
      localn = n.a(this.irB).e(this.irB);
      if (Float.compare(1.0F, paramFloat) > 0)
        break label133;
      if (this.irB.irz[0] == 0)
      {
        if (localn != null)
          n.cp(n.b(localn));
        localn = this.irB;
        localn.mSwiping = true;
        localn.post(new n.2(localn));
        this.irB.irz[0] = true;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.AppBrandPage", "scrollPercent %f", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(87069);
      return;
      n.a(this.irB, false);
      break;
      label133: if (localn != null)
        n.a(localn, paramFloat);
    }
  }

  public final void l(MotionEvent paramMotionEvent)
  {
  }

  public final void xv()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.n.1
 * JD-Core Version:    0.6.2
 */