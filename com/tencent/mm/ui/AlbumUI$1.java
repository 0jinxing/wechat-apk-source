package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomViewPager;

final class AlbumUI$1
  implements DoubleTabView.a
{
  AlbumUI$1(AlbumUI paramAlbumUI)
  {
  }

  public final void onTabClick(int paramInt)
  {
    AppMethodBeat.i(29105);
    AlbumUI.a(this.yer).setCurrentItem(paramInt, true);
    AppMethodBeat.o(29105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AlbumUI.1
 * JD-Core Version:    0.6.2
 */