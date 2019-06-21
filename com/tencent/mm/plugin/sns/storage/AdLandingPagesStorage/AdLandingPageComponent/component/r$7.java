package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.mm.sdk.platformtools.ab;

final class r$7
  implements View.OnClickListener
{
  r$7(r paramr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37210);
    ab.i("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "play btn onclick isPlaying[%b]", new Object[] { Boolean.valueOf(this.rbn.raL.isPlaying()) });
    if (this.rbn.raL.isPlaying())
    {
      this.rbn.cpN();
      this.rbn.rbd = 4;
      if (this.rbn.qVK)
      {
        paramView = this.rbn;
        paramView.rbg += 1;
      }
      AppMethodBeat.o(37210);
      return;
    }
    if (this.rbn.raV)
      this.rbn.coY();
    while (true)
    {
      r.b(this.rbn);
      this.rbn.rbd = 3;
      break;
      this.rbn.cpe();
      this.rbn.cpd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.7
 * JD-Core Version:    0.6.2
 */