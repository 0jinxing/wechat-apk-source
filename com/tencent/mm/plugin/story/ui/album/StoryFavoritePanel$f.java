package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel$StoryFavoriteNormalHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryFavoritePanel;Landroid/view/View;)V", "dateTv", "Landroid/widget/TextView;", "getDateTv", "()Landroid/widget/TextView;", "setDateTv", "(Landroid/widget/TextView;)V", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "setImg", "(Landroid/widget/ImageView;)V", "mask", "getMask", "setMask", "plugin-story_release"})
public final class StoryFavoritePanel$f extends RecyclerView.v
{
  TextView gnf;
  ImageView mom;
  ImageView sgq;

  public StoryFavoritePanel$f(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110205);
    paramView = localObject.findViewById(2131827987);
    j.o(paramView, "itemView.findViewById(R.…lbum_fav_item_normal_img)");
    this.sgq = ((ImageView)paramView);
    paramView = localObject.findViewById(2131827989);
    j.o(paramView, "itemView.findViewById(R.…album_fav_item_normal_tv)");
    this.gnf = ((TextView)paramView);
    paramView = localObject.findViewById(2131827988);
    j.o(paramView, "itemView.findViewById(R.…bum_fav_item_normal_mask)");
    this.mom = ((ImageView)paramView);
    AppMethodBeat.o(110205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.StoryFavoritePanel.f
 * JD-Core Version:    0.6.2
 */