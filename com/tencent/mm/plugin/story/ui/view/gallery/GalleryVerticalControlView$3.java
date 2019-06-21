package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class GalleryVerticalControlView$3
  implements View.OnClickListener
{
  GalleryVerticalControlView$3(GalleryVerticalControlView paramGalleryVerticalControlView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138936);
    paramView = this.soL.getOnAllFav();
    if (paramView != null)
    {
      paramView.invoke();
      AppMethodBeat.o(138936);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138936);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView.3
 * JD-Core Version:    0.6.2
 */