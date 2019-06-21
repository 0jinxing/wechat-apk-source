package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class r$9
  implements View.OnClickListener
{
  r$9(r paramr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37213);
    r.b(this.rbn);
    this.rbn.raW = false;
    this.rbn.raT = true;
    this.rbn.rbd = 3;
    this.rbn.cpd();
    this.rbn.la(true);
    al.n(new r.9.1(this), 10000L);
    AppMethodBeat.o(37213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.9
 * JD-Core Version:    0.6.2
 */