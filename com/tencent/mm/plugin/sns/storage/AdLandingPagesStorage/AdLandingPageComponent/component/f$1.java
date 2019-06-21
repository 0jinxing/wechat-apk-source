package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements View.OnClickListener
{
  f$1(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37057);
    paramView = this.qZm;
    paramView.clickCount += 1;
    paramView = new Intent();
    paramView.putExtra("map_view_type", 1);
    paramView.putExtra("kwebmap_slat", this.qZm.qZj.qWe.nJu);
    paramView.putExtra("kwebmap_lng", this.qZm.qZj.qWe.nJv);
    paramView.putExtra("kwebmap_scale", this.qZm.qZj.qWe.cED);
    paramView.putExtra("kPoiName", this.qZm.qZj.qWe.cIK);
    paramView.putExtra("Kwebmap_locaion", this.qZm.qZj.qWe.nJx);
    ab.i("AdLandingBorderedComp", "locatint to slat " + this.qZm.qZj.qWe.nJu + ", slong " + this.qZm.qZj.qWe.nJv + ", " + this.qZm.qZj.qWe.cIK);
    d.b(this.qZm.context, "location", ".ui.RedirectUI", paramView, 2);
    AppMethodBeat.o(37057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f.1
 * JD-Core Version:    0.6.2
 */