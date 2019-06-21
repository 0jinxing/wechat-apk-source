package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI$CommentUnreadAdapter$CommentUnreadViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI$CommentUnreadAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "content", "Landroid/widget/TextView;", "getContent", "()Landroid/widget/TextView;", "fromUser", "getFromUser", "quote", "getQuote", "storyPreview", "getStoryPreview", "onBind", "", "position", "", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "plugin-story_release"})
public final class StoryCommentsUI$a$a extends RecyclerView.v
{
  final ImageView gvq;
  final TextView ooM;
  private final ImageView seP;
  final TextView seQ;
  private final TextView seR;

  public StoryCommentsUI$a$a(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110024);
    paramView = localObject.findViewById(2131828067);
    j.o(paramView, "itemView.findViewById(R.…tory_comment_item_avatar)");
    this.gvq = ((ImageView)paramView);
    paramView = localObject.findViewById(2131828073);
    j.o(paramView, "itemView.findViewById(R.…ory_comment_item_preview)");
    this.seP = ((ImageView)paramView);
    paramView = localObject.findViewById(2131828069);
    j.o(paramView, "itemView.findViewById(R.…ry_comment_item_username)");
    this.seQ = ((TextView)paramView);
    paramView = localObject.findViewById(2131828070);
    j.o(paramView, "itemView.findViewById(R.…ory_comment_item_content)");
    this.ooM = ((TextView)paramView);
    paramView = localObject.findViewById(2131828074);
    j.o(paramView, "itemView.findViewById(R.…mment_item_quote_content)");
    this.seR = ((TextView)paramView);
    localObject.setOnClickListener((View.OnClickListener)new StoryCommentsUI.a.a.1(this));
    AppMethodBeat.o(110024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCommentsUI.a.a
 * JD-Core Version:    0.6.2
 */