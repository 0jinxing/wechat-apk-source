package com.tencent.mm.plugin.story.ui.a;

import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.a;
import com.tencent.mm.loader.a.b;
import com.tencent.mm.loader.e;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.ui.view.StoryCommentView;
import com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView;
import com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;)V", "bindItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "commentView", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "postTipView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "storyItemView", "thumbView", "Landroid/widget/ImageView;", "onBind", "", "item", "position", "", "reBindBitmap", "plugin-story_release"})
public final class i extends RecyclerView.v
{
  private final ImageView mmB;
  final StoryGalleryItemView sfR;
  final StoryCommentView sfS;
  final StoryGalleryPostTip sfT;
  g sfU;

  public i(StoryGalleryItemView paramStoryGalleryItemView)
  {
    super((View)paramStoryGalleryItemView);
    AppMethodBeat.i(110138);
    this.sfR = paramStoryGalleryItemView;
    this.sfS = paramStoryGalleryItemView.getCommentView();
    this.mmB = paramStoryGalleryItemView.getThumbView();
    this.sfT = paramStoryGalleryItemView.getPostTipView();
    AppMethodBeat.o(110138);
  }

  public final void cCi()
  {
    AppMethodBeat.i(110137);
    Object localObject1 = this.sfU;
    if (localObject1 == null)
      AppMethodBeat.o(110137);
    while (true)
    {
      return;
      Object localObject2 = az.dtm().Mp(((g)localObject1).rVZ.fDG);
      if (((g)localObject1).rVZ.cze())
      {
        if (((g)localObject1).rVZ.rWl == null)
        {
          localObject2 = e.eOD;
          e.Tb().lR("").d(this.mmB);
          AppMethodBeat.o(110137);
        }
        else
        {
          localObject1 = ((g)localObject1).rVZ.rWl;
          if (localObject1 != null)
          {
            ab.i(h.Ow(), "load fake localFile:" + ((cee)localObject1).thumbPath + ", position:" + getPosition() + ", videoPath:" + ((cee)localObject1).videoPath);
            localObject2 = e.eOD;
            localObject2 = e.Tb();
            localObject1 = ((cee)localObject1).thumbPath;
            a.f.b.j.o(localObject1, "it.thumbPath");
            ((a)localObject2).lR((String)localObject1).d(this.mmB);
            AppMethodBeat.o(110137);
          }
          else
          {
            AppMethodBeat.o(110137);
          }
        }
      }
      else
      {
        Object localObject3 = com.tencent.mm.plugin.story.model.j.rST;
        localObject3 = j.a.cyc();
        cek localcek = ((g)localObject1).rVZ.rWj;
        localObject1 = ((g)localObject1).userName;
        a.f.b.j.o(localObject2, "fromScene");
        ((com.tencent.mm.loader.d)localObject3).aO(new com.tencent.mm.plugin.story.model.c.d(localcek, (String)localObject1, (az)localObject2)).d(this.mmB);
        AppMethodBeat.o(110137);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.i
 * JD-Core Version:    0.6.2
 */