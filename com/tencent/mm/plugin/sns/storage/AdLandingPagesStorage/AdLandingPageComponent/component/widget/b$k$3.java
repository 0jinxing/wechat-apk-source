package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$k$3
  implements Runnable
{
  b$k$3(b.k paramk, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37432);
    ab.v("MicroMsg.SightPlayController", "set background drawable null");
    this.gsQ.setBackgroundDrawable(null);
    AppMethodBeat.o(37432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.k.3
 * JD-Core Version:    0.6.2
 */