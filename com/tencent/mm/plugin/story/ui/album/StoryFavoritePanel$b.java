package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryAlbumLoadingHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;Landroid/view/View;)V", "isAllView", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setAllView", "(Landroid/widget/ImageView;)V", "loadingView", "Landroid/view/ViewGroup;", "getLoadingView", "()Landroid/view/ViewGroup;", "setLoadingView", "(Landroid/view/ViewGroup;)V", "plugin-story_release"})
public final class StoryFavoritePanel$b extends RecyclerView.v
{
  ViewGroup sgi;
  ImageView sgj;

  public StoryFavoritePanel$b(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(138883);
    paramView = localObject.findViewById(2131822250);
    j.o(paramView, "view.findViewById(R.id.loading_more_state)");
    this.sgi = ((ViewGroup)paramView);
    paramView = localObject.findViewById(2131828002);
    j.o(paramView, "view.findViewById(R.id.album_is_all_view)");
    this.sgj = ((ImageView)paramView);
    AppMethodBeat.o(138883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.b
 * JD-Core Version:    0.6.2
 */