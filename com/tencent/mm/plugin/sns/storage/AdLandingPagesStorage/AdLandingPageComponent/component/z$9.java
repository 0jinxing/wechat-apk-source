package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class z$9
  implements View.OnClickListener
{
  z$9(z paramz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37311);
    z.b(this.rbO);
    this.rbO.raW = false;
    this.rbO.raT = true;
    this.rbO.rbd = 3;
    this.rbO.cpd();
    this.rbO.la(true);
    al.n(new z.9.1(this), 10000L);
    AppMethodBeat.o(37311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z.9
 * JD-Core Version:    0.6.2
 */