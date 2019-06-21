package com.tencent.mm.plugin.story.ui.album;

import a.f.a.b;
import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryFavoritePanel$d$a
  implements View.OnClickListener
{
  StoryFavoritePanel$d$a(StoryFavoritePanel.d paramd, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110198);
    b localb = this.sgZ.sgY.getMOnAddItemClickListener();
    if (localb != null)
    {
      paramView = StoryFavoritePanel.c(this.sgZ.sgY).get(this.exi);
      j.o(paramView, "mDatas[position]");
      localb.am(paramView);
      AppMethodBeat.o(110198);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110198);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.d.a
 * JD-Core Version:    0.6.2
 */