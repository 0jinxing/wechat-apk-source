package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.f.b.u.c;
import a.l;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CommentsContainer$b
  implements Runnable
{
  CommentsContainer$b(CommentsContainer paramCommentsContainer, CommentItemView paramCommentItemView, com.tencent.mm.plugin.story.model.b.a parama, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110368);
    Object localObject1 = this.siR.getMaskView();
    Object localObject2 = CommentsContainer.siP;
    Object localObject3 = this.siQ.getContext();
    j.o(localObject3, "context");
    localObject2 = this.sfO;
    j.p(localObject3, "context");
    j.p(localObject2, "comment");
    int i = ((Context)localObject3).getResources().getColor(2131689547);
    int j = ((Context)localObject3).getResources().getColor(2131690525);
    if (((com.tencent.mm.plugin.story.model.b.a)localObject2).rVh)
      j = i;
    float f = com.tencent.mm.bz.a.fromDPToPix((Context)localObject3, 24);
    localObject2 = new GradientDrawable();
    ((GradientDrawable)localObject2).setColor(j);
    ((GradientDrawable)localObject2).setCornerRadius(f);
    ((View)localObject1).setBackground((Drawable)localObject2);
    this.siR.setVisibility(0);
    j = this.siR.getMeasuredHeight();
    int k = this.siE;
    i = this.siQ.getPaddingBottom();
    CommentsContainer.a(this.siQ, com.tencent.mm.bz.a.ao(this.siQ.getContext(), k - i) * 9L);
    if (CommentsContainer.a(this.siQ) <= 0L)
      CommentsContainer.a(this.siQ, 4000L);
    localObject2 = this.siR;
    long l = CommentsContainer.a(this.siQ);
    k = this.siQ.getPaddingBottom();
    int m = this.siE;
    i = j / 2;
    Object localObject4 = (a.f.a.a)new CommentsContainer.b.1(this);
    localObject1 = (a.f.a.a)new CommentsContainer.b.2(this);
    ((CommentItemView)localObject2).six = ((CommentItemView)localObject2).getMeasuredWidth();
    ((CommentItemView)localObject2).siw = ((CommentItemView)localObject2).getMeasuredHeight();
    localObject3 = ((CommentItemView)localObject2).sis;
    if (localObject3 == null)
      j.avw("contentLayout");
    ((ViewGroup)localObject3).setVisibility(8);
    localObject3 = ((CommentItemView)localObject2).getLayoutParams();
    ((ViewGroup.LayoutParams)localObject3).height = ((CommentItemView)localObject2).siv;
    ((ViewGroup.LayoutParams)localObject3).width = ((CommentItemView)localObject2).siv;
    ((CommentItemView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    ab.i("MicroMsg.CommentItemView", "LogStory: animation start " + ((CommentItemView)localObject2).siv + ", " + ((CommentItemView)localObject2).six + ' ' + ((CommentItemView)localObject2).siw);
    localObject3 = new u.c();
    ((u.c)localObject3).AVE = localObject4;
    localObject4 = new CommentItemView.c(new PointF(0.05F, 0.1F));
    ((CommentItemView)localObject2).siq = ObjectAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    ValueAnimator localValueAnimator = ((CommentItemView)localObject2).siq;
    if (localValueAnimator != null)
      localValueAnimator.setInterpolator((TimeInterpolator)localObject4);
    localObject4 = ((CommentItemView)localObject2).siq;
    if (localObject4 != null)
      ((ValueAnimator)localObject4).setDuration(l);
    localObject4 = ((CommentItemView)localObject2).siq;
    if (localObject4 != null)
      ((ValueAnimator)localObject4).addUpdateListener((ValueAnimator.AnimatorUpdateListener)new CommentItemView.e((CommentItemView)localObject2, m - i, k, (u.c)localObject3, (a.f.a.a)localObject1));
    localObject1 = ((CommentItemView)localObject2).siq;
    if (localObject1 != null)
      ((ValueAnimator)localObject1).start();
    CommentsContainer.b(this.siQ, (com.tencent.mm.bz.a.ao(this.siQ.getContext(), j) + 96) * 6L);
    if (CommentsContainer.d(this.siQ) == CommentsContainer.e(this.siQ).size() - 1)
    {
      CommentsContainer.b(this.siQ, CommentsContainer.a(this.siQ));
      this.siQ.postDelayed(CommentsContainer.f(this.siQ), CommentsContainer.c(this.siQ));
    }
    this.siQ.postDelayed(CommentsContainer.g(this.siQ), CommentsContainer.c(this.siQ));
    AppMethodBeat.o(110368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentsContainer.b
 * JD-Core Version:    0.6.2
 */