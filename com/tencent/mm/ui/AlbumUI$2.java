package com.tencent.mm.ui;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class AlbumUI$2
  implements ViewPager.OnPageChangeListener
{
  AlbumUI$2(AlbumUI paramAlbumUI)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(29106);
    AlbumUI.b(this.yer).l(paramInt1, paramFloat);
    AppMethodBeat.o(29106);
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(29107);
    AlbumUI.b(this.yer).setTo(paramInt);
    h localh;
    if (paramInt == 0)
    {
      localh = h.scu;
      h.cAw().cZI = 3L;
    }
    while (true)
    {
      localh = h.scu;
      h.cAx();
      AppMethodBeat.o(29107);
      return;
      localh = h.scu;
      h.cAw().cZI = 2L;
      if (AlbumUI.c(this.yer))
      {
        AlbumUI.b(this.yer).pC(false);
        g.RP().Ry().set(ac.a.xWV, Boolean.FALSE);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AlbumUI.2
 * JD-Core Version:    0.6.2
 */