package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.mm.sdk.platformtools.ab;

final class z$7
  implements View.OnClickListener
{
  z$7(z paramz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37308);
    ab.i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "play btn onclick isPlaying[%b]", new Object[] { Boolean.valueOf(this.rbO.raL.isPlaying()) });
    if (this.rbO.raL.isPlaying())
    {
      this.rbO.cpN();
      this.rbO.rbd = 4;
      if (this.rbO.qVK)
      {
        paramView = this.rbO;
        paramView.rbg += 1;
      }
      AppMethodBeat.o(37308);
      return;
    }
    if (this.rbO.raV)
      this.rbO.coY();
    while (true)
    {
      z.b(this.rbO);
      this.rbO.rbd = 3;
      break;
      this.rbO.cpe();
      this.rbO.cpd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z.7
 * JD-Core Version:    0.6.2
 */