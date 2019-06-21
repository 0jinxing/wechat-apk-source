package com.tencent.mm.plugin.story.ui.album;

import a.l;
import android.support.v7.widget.GridLayoutManager.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$init$1", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "plugin-story_release"})
public final class StoryFavoritePanel$g extends GridLayoutManager.b
{
  public final int bU(int paramInt)
  {
    AppMethodBeat.i(138884);
    if (StoryFavoritePanel.d(this.sgY).getItemViewType(paramInt) == StoryFavoritePanel.b(this.sgY))
    {
      paramInt = StoryFavoritePanel.e(this.sgY);
      AppMethodBeat.o(138884);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(138884);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.g
 * JD-Core Version:    0.6.2
 */