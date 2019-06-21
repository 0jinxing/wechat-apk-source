package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c$1
  implements Runnable
{
  b$c$1(b.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37018);
    if (this.qYY.qYT == 1)
    {
      b.c localc = this.qYY;
      ab.d("AdLandingCarouselComp", "onDraggin first visible " + localc.qYP.qYM.iQ() + ", last visible " + localc.qYP.qYM.iS());
      b.a(localc.qYP);
      this.qYY.iJP.postDelayed(this.qYY.qYX, 100L);
    }
    AppMethodBeat.o(37018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b.c.1
 * JD-Core Version:    0.6.2
 */