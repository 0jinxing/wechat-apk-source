package com.tencent.mm.plugin.story.ui.album;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryFavoritePanel$d$b
  implements View.OnClickListener
{
  StoryFavoritePanel$d$b(StoryFavoritePanel.d paramd, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110199);
    m localm = this.sgZ.sgY.getMOnFavItemClickListener();
    if (localm != null)
    {
      paramView = StoryFavoritePanel.c(this.sgZ.sgY).get(this.exi);
      j.o(paramView, "mDatas[position]");
      localm.m(paramView, Integer.valueOf(this.exi));
      AppMethodBeat.o(110199);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.d.b
 * JD-Core Version:    0.6.2
 */