package com.tencent.mm.plugin.story.ui.album;

import a.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.e.c;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.o.a;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumLoadingHolder;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumViewHolder;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;Landroid/view/View;)V", "isAllView", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "setAllView", "(Landroid/widget/ImageView;)V", "loadingView", "Landroid/view/ViewGroup;", "getLoadingView", "()Landroid/view/ViewGroup;", "setLoadingView", "(Landroid/view/ViewGroup;)V", "onBind", "", "position", "", "plugin-story_release"})
public final class a$c extends a.e
{
  private ViewGroup sgi;
  private ImageView sgj;

  public a$c(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110144);
    paramView = localObject.findViewById(2131822250);
    a.f.b.j.o(paramView, "view.findViewById(R.id.loading_more_state)");
    this.sgi = ((ViewGroup)paramView);
    paramView = localObject.findViewById(2131828002);
    a.f.b.j.o(paramView, "view.findViewById(R.id.album_is_all_view)");
    this.sgj = ((ImageView)paramView);
    AppMethodBeat.o(110144);
  }

  public final void Fh(int paramInt)
  {
    AppMethodBeat.i(110143);
    if (a.d(this.sgg))
    {
      this.sgi.setVisibility(8);
      this.sgj.setVisibility(0);
      AppMethodBeat.o(110143);
    }
    while (true)
    {
      return;
      a.e(this.sgg);
      Object localObject = com.tencent.mm.plugin.story.model.j.rST;
      if (j.a.cyd().qMA <= 0)
      {
        localObject = c.rRS;
        SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences(ah.doA(), 0);
        String str = c.cxs();
        localObject = com.tencent.mm.plugin.story.h.a.sdm;
        localSharedPreferences.getInt(str, com.tencent.mm.plugin.story.h.a.cAR());
      }
      this.sgi.setVisibility(0);
      this.sgj.setVisibility(8);
      AppMethodBeat.o(110143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.a.c
 * JD-Core Version:    0.6.2
 */