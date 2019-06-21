package com.tencent.mm.plugin.appbrand.page;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ConcurrentModificationException;

final class u$23
  implements View.OnLayoutChangeListener
{
  u$23(u paramu)
  {
  }

  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(87182);
    if (TextUtils.isEmpty(this.ita.getURL()))
      AppMethodBeat.o(87182);
    while (true)
    {
      return;
      if (!u.h(this.ita))
      {
        try
        {
          this.ita.aBk().removeOnLayoutChangeListener(this);
          AppMethodBeat.o(87182);
        }
        catch (ConcurrentModificationException paramView)
        {
          this.ita.f(new u.23.1(this, this));
          AppMethodBeat.o(87182);
        }
      }
      else
      {
        d.i("MicroMsg.AppBrandPageView", "pageArea onLayoutChange appId[%s], url[%s]", new Object[] { this.ita.getAppId(), this.ita.getURL() });
        if (this.ita.xT() == null)
        {
          AppMethodBeat.o(87182);
        }
        else
        {
          this.ita.isU.aJW();
          AppMethodBeat.o(87182);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.23
 * JD-Core Version:    0.6.2
 */