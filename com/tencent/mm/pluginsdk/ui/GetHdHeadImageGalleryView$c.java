package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.tools.MMGestureGallery.f;

final class GetHdHeadImageGalleryView$c
  implements MMGestureGallery.f
{
  private GetHdHeadImageGalleryView$c(GetHdHeadImageGalleryView paramGetHdHeadImageGalleryView)
  {
  }

  public final void bcX()
  {
    AppMethodBeat.i(79685);
    if (GetHdHeadImageGalleryView.a(this.vhx) != null)
      GetHdHeadImageGalleryView.a(this.vhx).dismiss();
    AppMethodBeat.o(79685);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView.c
 * JD-Core Version:    0.6.2
 */