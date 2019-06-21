package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$GalleryAvatarViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter;Landroid/view/View;)V", "avatarIv", "Landroid/widget/ImageView;", "getAvatarIv", "()Landroid/widget/ImageView;", "nickNameTv", "Landroid/widget/TextView;", "getNickNameTv", "()Landroid/widget/TextView;", "plugin-story_release"})
public final class b$a extends RecyclerView.v
{
  final ImageView eks;
  final TextView gtO;

  public b$a(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110092);
    paramView = localObject.findViewById(2131821183);
    j.o(paramView, "itemView.findViewById(R.id.avatar_iv)");
    this.eks = ((ImageView)paramView);
    paramView = localObject.findViewById(2131823149);
    j.o(paramView, "itemView.findViewById(R.id.nickname_tv)");
    this.gtO = ((TextView)paramView);
    b.f(this.gtO);
    AppMethodBeat.o(110092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.b.a
 * JD-Core Version:    0.6.2
 */