package com.tencent.mm.plugin.story.ui.a;

import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.story.api.i;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.b.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView;
import com.tencent.mm.plugin.story.ui.view.CommentItemView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;Landroid/view/View;)V", "avatar", "Lcom/tencent/mm/plugin/story/ui/view/CommentAvatarImageView;", "getAvatar", "()Lcom/tencent/mm/plugin/story/ui/view/CommentAvatarImageView;", "content", "Landroid/widget/TextView;", "getContent", "()Landroid/widget/TextView;", "fromUser", "getFromUser", "maskView", "getMaskView", "()Landroid/view/View;", "setMaskView", "(Landroid/view/View;)V", "findMaskView", "onBind", "", "position", "", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "onBindAvatar", "onBindMask", "onBindUsername", "plugin-story_release"})
public abstract class f$a extends RecyclerView.v
{
  private View iVh;
  private final TextView ooM;
  final TextView seQ;
  private final CommentAvatarImageView sfL;

  public f$a(View paramView)
  {
    super(localObject);
    paramView = localObject.findViewById(2131828067);
    a.f.b.j.o(paramView, "itemView.findViewById(R.…tory_comment_item_avatar)");
    this.sfL = ((CommentAvatarImageView)paramView);
    paramView = localObject.findViewById(2131828069);
    a.f.b.j.o(paramView, "itemView.findViewById(R.…ry_comment_item_username)");
    this.seQ = ((TextView)paramView);
    paramView = localObject.findViewById(2131828070);
    a.f.b.j.o(paramView, "itemView.findViewById(R.…ory_comment_item_content)");
    this.ooM = ((TextView)paramView);
    this.iVh = cCh();
  }

  public void a(int paramInt, a parama)
  {
    boolean bool = false;
    a.f.b.j.p(parama, "comment");
    if ((this.apJ instanceof CommentItemView))
      ((CommentItemView)this.apJ).setComment(parama);
    Object localObject1 = this.apJ;
    a.f.b.j.o(localObject1, "itemView");
    ((View)localObject1).setVisibility(4);
    this.apJ.post((Runnable)new f.a.a(this));
    Object localObject2;
    label220: Object localObject3;
    label304: label329: Context localContext;
    if ((this.apJ instanceof CommentItemView))
    {
      if (parama.rVh)
      {
        localObject1 = this.iVh.getBackground();
        a.f.b.j.o(localObject1, "bg");
        localObject2 = ((CommentItemView)this.apJ).getContext();
        a.f.b.j.o(localObject2, "itemView.context");
        ((Drawable)localObject1).setColorFilter((ColorFilter)new PorterDuffColorFilter(((Context)localObject2).getResources().getColor(2131689547), PorterDuff.Mode.SRC_ATOP));
        parama.rVh = false;
      }
    }
    else
    {
      localObject1 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject1, "MMKernel.service(IMessengerStorage::class.java)");
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(parama.cEV);
      localObject2 = this.seQ.getContext();
      if (localObject1 == null)
        break label661;
      localObject1 = ((ad)localObject1).Oj();
      if (localObject1 == null)
        break label661;
      localObject1 = (CharSequence)localObject1;
      localObject2 = com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject2, (CharSequence)localObject1, this.seQ.getTextSize());
      localObject1 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject1, "MMKernel.service(IMessengerStorage::class.java)");
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(parama.toUser);
      localObject3 = this.seQ.getContext();
      if (localObject1 == null)
        break label672;
      localObject1 = ((ad)localObject1).Oj();
      if (localObject1 == null)
        break label672;
      localObject1 = (CharSequence)localObject1;
      localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject3, (CharSequence)localObject1, this.seQ.getTextSize());
      if (parama.rVm == 0)
        break label683;
      paramInt = 1;
      localObject3 = this.seQ;
      if (paramInt == 0)
        break label688;
      localObject2 = new StringBuilder().append(localObject2).append(' ');
      localContext = this.seQ.getContext();
      a.f.b.j.o(localContext, "fromUser.context");
    }
    label661: label672: label683: label688: for (localObject1 = (CharSequence)(localContext.getResources().getString(2131297033) + ' ' + localObject1); ; localObject1 = (CharSequence)localObject2)
    {
      ((TextView)localObject3).setText((CharSequence)localObject1);
      this.ooM.setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(this.ooM.getContext(), (CharSequence)parama.content, this.ooM.getTextSize()));
      a.b.r((ImageView)this.sfL, parama.cEV);
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxU().aaX(parama.cEV);
      if (localObject1 != null)
        bool = ((f)localObject1).cBN();
      this.sfL.setShowStoryHint(bool);
      localObject2 = this.sfL;
      localObject1 = parama.cEV;
      a.f.b.j.p(localObject1, "userName");
      ((CommentAvatarImageView)localObject2).rDe.dk((String)localObject1, 6);
      if (!TextUtils.equals((CharSequence)((CommentAvatarImageView)localObject2).rMJ, (CharSequence)localObject1))
        ((CommentAvatarImageView)localObject2).rMJ = ((String)localObject1);
      this.sfL.setWithHintBg(parama.rVi);
      this.sfL.setOnClickListener((View.OnClickListener)new f.a.b(this, parama));
      return;
      localObject1 = this.iVh.getBackground();
      a.f.b.j.o(localObject1, "bg");
      localObject2 = ((CommentItemView)this.apJ).getContext();
      a.f.b.j.o(localObject2, "itemView.context");
      ((Drawable)localObject1).setColorFilter((ColorFilter)new PorterDuffColorFilter(((Context)localObject2).getResources().getColor(2131690525), PorterDuff.Mode.SRC_ATOP));
      parama.rVh = false;
      break;
      localObject1 = (CharSequence)"";
      break label220;
      localObject1 = (CharSequence)"";
      break label304;
      paramInt = 0;
      break label329;
    }
  }

  public abstract View cCh();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.f.a
 * JD-Core Version:    0.6.2
 */