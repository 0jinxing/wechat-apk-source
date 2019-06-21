package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$8
  implements View.OnClickListener
{
  r$8(r paramr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37211);
    paramView = this.rbn;
    paramView.rbh += 1;
    if (this.rbn.raV)
    {
      this.rbn.cpe();
      this.rbn.cpd();
    }
    while (true)
    {
      this.rbn.raS = true;
      AppMethodBeat.o(37211);
      return;
      this.rbn.coY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.8
 * JD-Core Version:    0.6.2
 */