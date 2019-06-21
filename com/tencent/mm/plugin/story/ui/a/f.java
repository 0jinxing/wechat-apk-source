package com.tencent.mm.plugin.story.ui.a;

import a.f.a.m;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.plugin.story.model.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder;", "()V", "animStartPosition", "", "animateOnBind", "", "bindMaxPosition", "comments", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "Lkotlin/collections/ArrayList;", "hostStory", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "getHostStory", "()Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setHostStory", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;)V", "replyClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "comment", "isReply", "", "getReplyClickListener", "()Lkotlin/jvm/functions/Function2;", "setReplyClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnimateEnable", "enable", "update", "storyComments", "", "BaseStoryCommentViewHolder", "Companion", "StoryBubbleViewHolder", "StoryCommentViewHolder", "plugin-story_release"})
public final class f extends RecyclerView.a<f.a>
{
  private static final int llW = 0;
  private static final int sfJ = 1;
  public static final f.b sfK;
  private final ArrayList<a> seM;
  public boolean sfG;
  public com.tencent.mm.plugin.story.h.j sfH;
  public m<? super a, ? super Boolean, y> sfI;

  static
  {
    AppMethodBeat.i(110130);
    sfK = new f.b((byte)0);
    sfJ = 1;
    AppMethodBeat.o(110130);
  }

  public f()
  {
    AppMethodBeat.i(110129);
    this.seM = new ArrayList();
    AppMethodBeat.o(110129);
  }

  public final void dI(List<a> paramList)
  {
    AppMethodBeat.i(138860);
    a.f.b.j.p(paramList, "storyComments");
    this.seM.clear();
    this.seM.addAll((Collection)paramList);
    AppMethodBeat.o(138860);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110125);
    int i = this.seM.size();
    AppMethodBeat.o(110125);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(110126);
    if (((a)this.seM.get(paramInt)).rVi)
    {
      paramInt = sfJ;
      AppMethodBeat.o(110126);
    }
    while (true)
    {
      return paramInt;
      paramInt = llW;
      AppMethodBeat.o(110126);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryBubbleViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;Landroid/view/View;)V", "findMaskView", "onBind", "", "position", "", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "plugin-story_release"})
  public final class c extends f.a
  {
    public c()
    {
      super(localObject);
      AppMethodBeat.i(138854);
      AppMethodBeat.o(138854);
    }

    public final void a(int paramInt, a parama)
    {
      AppMethodBeat.i(138853);
      a.f.b.j.p(parama, "comment");
      super.a(paramInt, parama);
      if (parama.rVi)
        b.f(this.seQ);
      AppMethodBeat.o(138853);
    }

    public final View cCh()
    {
      AppMethodBeat.i(138852);
      View localView = this.apJ.findViewById(2131828072);
      a.f.b.j.o(localView, "itemView.findViewById(R.…omment_bubble_background)");
      AppMethodBeat.o(138852);
      return localView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.f
 * JD-Core Version:    0.6.2
 */