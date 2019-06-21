package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class z$8
  implements View.OnClickListener
{
  z$8(z paramz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37309);
    paramView = this.rbO;
    paramView.rbh += 1;
    if (this.rbO.raV)
    {
      this.rbO.cpe();
      this.rbO.cpd();
    }
    while (true)
    {
      this.rbO.raS = true;
      AppMethodBeat.o(37309);
      return;
      this.rbO.coY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z.8
 * JD-Core Version:    0.6.2
 */