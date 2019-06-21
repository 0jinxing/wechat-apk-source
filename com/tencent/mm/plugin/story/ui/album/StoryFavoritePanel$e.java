package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryFavoriteAddHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "plugin-story_release"})
public final class StoryFavoritePanel$e extends RecyclerView.v
{
  ImageView iNr;

  public StoryFavoritePanel$e(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110204);
    paramView = localObject.findViewById(2131827985);
    j.o(paramView, "itemView.findViewById(R.…y_album_fav_item_add_img)");
    this.iNr = ((ImageView)paramView);
    AppMethodBeat.o(110204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.e
 * JD-Core Version:    0.6.2
 */