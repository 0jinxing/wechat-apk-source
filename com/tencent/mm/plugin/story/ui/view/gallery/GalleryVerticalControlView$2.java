package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class GalleryVerticalControlView$2
  implements View.OnClickListener
{
  GalleryVerticalControlView$2(GalleryVerticalControlView paramGalleryVerticalControlView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110751);
    paramView = this.soL.getOnMenu();
    if (paramView != null)
    {
      paramView.invoke();
      AppMethodBeat.o(110751);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110751);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView.2
 * JD-Core Version:    0.6.2
 */