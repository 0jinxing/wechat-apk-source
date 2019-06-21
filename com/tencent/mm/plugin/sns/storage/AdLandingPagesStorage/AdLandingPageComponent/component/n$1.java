package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomScrollView.a;
import java.util.Iterator;
import java.util.List;

final class n$1
  implements CustomScrollView.a
{
  n$1(n paramn)
  {
  }

  public final void a(ScrollView paramScrollView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37152);
    paramScrollView = this.ran.bnR.iterator();
    while (paramScrollView.hasNext())
    {
      h localh = (h)paramScrollView.next();
      if (localh.cpx())
      {
        localh.cpa();
        localh.cpc();
      }
      else
      {
        localh.cpb();
      }
    }
    AppMethodBeat.o(37152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n.1
 * JD-Core Version:    0.6.2
 */