package com.tencent.mm.plugin.story.ui;

import a.f.a.m;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.b.a;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI$CommentUnreadAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI$CommentUnreadAdapter$CommentUnreadViewHolder;", "Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI;", "(Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI;)V", "comments", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "Lkotlin/collections/ArrayList;", "onItemClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "item", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "storyComments", "", "CommentUnreadViewHolder", "plugin-story_release"})
public final class StoryCommentsUI$a extends RecyclerView.a<StoryCommentsUI.a.a>
{
  final ArrayList<a> seM;
  m<? super Integer, ? super a, y> seN;

  public StoryCommentsUI$a()
  {
    AppMethodBeat.i(110028);
    this.seM = new ArrayList();
    AppMethodBeat.o(110028);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110025);
    int i = this.seM.size();
    AppMethodBeat.o(110025);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCommentsUI.a
 * JD-Core Version:    0.6.2
 */