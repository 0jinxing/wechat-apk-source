package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class GalleryVerticalControlView$1
  implements View.OnClickListener
{
  GalleryVerticalControlView$1(GalleryVerticalControlView paramGalleryVerticalControlView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110750);
    paramView = this.soL.getOnClose();
    if (paramView != null)
    {
      paramView.invoke();
      AppMethodBeat.o(110750);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110750);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView.1
 * JD-Core Version:    0.6.2
 */