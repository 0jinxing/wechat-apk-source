package com.tencent.mm.plugin.story.ui.album;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$StoryAlbumItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter;Landroid/view/View;)V", "countTv", "Landroid/widget/TextView;", "getCountTv", "()Landroid/widget/TextView;", "setCountTv", "(Landroid/widget/TextView;)V", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "setImg", "(Landroid/widget/ImageView;)V", "multipleTip", "getMultipleTip", "setMultipleTip", "onBind", "", "position", "", "plugin-story_release"})
public final class d$b extends RecyclerView.v
{
  TextView nDX;
  ImageView sgq;
  ImageView sgr;

  public d$b(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110161);
    paramView = localObject.findViewById(2131828003);
    j.o(paramView, "view.findViewById(R.id.album_story_item_media_img)");
    this.sgq = ((ImageView)paramView);
    paramView = localObject.findViewById(2131828004);
    j.o(paramView, "view.findViewById(R.id.a…_story_item_multiple_tip)");
    this.sgr = ((ImageView)paramView);
    paramView = localObject.findViewById(2131828005);
    j.o(paramView, "view.findViewById(R.id.album_story_item_count_tv)");
    this.nDX = ((TextView)paramView);
    AppMethodBeat.o(110161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.d.b
 * JD-Core Version:    0.6.2
 */