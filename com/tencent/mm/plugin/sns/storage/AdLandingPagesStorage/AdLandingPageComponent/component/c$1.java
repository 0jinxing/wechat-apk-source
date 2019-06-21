package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d;
import com.tencent.mm.pluginsdk.ui.e.c.a;
import java.util.List;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37034);
    paramView = this.qZd;
    paramView.clickCount += 1;
    if (c.a.vrD == null)
      AppMethodBeat.o(37034);
    while (true)
    {
      return;
      if (c.a(this.qZd).qWc.size() > 1)
      {
        c.a.vrD.a(this.qZd.context, c.a(this.qZd).qWc, new c.1.1(this));
        AppMethodBeat.o(37034);
      }
      else
      {
        if (c.a(this.qZd).qWc.size() > 0)
          AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)this.qZd.context, (String)c.a(this.qZd).qWc.get(0));
        AppMethodBeat.o(37034);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c.1
 * JD-Core Version:    0.6.2
 */