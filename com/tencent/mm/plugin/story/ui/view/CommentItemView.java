package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animEndHeight", "animEndWidth", "animStartSize", "appeared", "", "avatarView", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "setAvatarView", "(Landroid/widget/ImageView;)V", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "getComment", "()Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "setComment", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "contentLayout", "Landroid/view/ViewGroup;", "getContentLayout", "()Landroid/view/ViewGroup;", "setContentLayout", "(Landroid/view/ViewGroup;)V", "maskView", "Landroid/view/View;", "getMaskView", "()Landroid/view/View;", "setMaskView", "(Landroid/view/View;)V", "normalAnimator", "Landroid/animation/ValueAnimator;", "getNormalAnimator", "()Landroid/animation/ValueAnimator;", "setNormalAnimator", "(Landroid/animation/ValueAnimator;)V", "normalBgAnimator", "getNormalBgAnimator", "setNormalBgAnimator", "backgroundAnimation", "", "contentAnimation", "enterListAnimation", "order", "isAppearAnimEnd", "normalAnimation", "duration", "", "transStart", "transEnd", "onAppear", "Lkotlin/Function0;", "onAnimateEnd", "onFinishInflate", "shakeAnimation", "stopAnimation", "ArgbEvaluator", "Companion", "TwoLineInterpolator", "plugin-story_release"})
public final class CommentItemView extends LinearLayout
{
  public static final CommentItemView.b siy;
  public ImageView goC;
  public View iVh;
  ValueAnimator siq;
  private ValueAnimator sir;
  public ViewGroup sis;
  com.tencent.mm.plugin.story.model.b.a sit;
  private boolean siu;
  int siv;
  int siw;
  int six;

  static
  {
    AppMethodBeat.i(110356);
    siy = new CommentItemView.b((byte)0);
    AppMethodBeat.o(110356);
  }

  public CommentItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110355);
    AppMethodBeat.o(110355);
  }

  public CommentItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110354);
    this.sit = new com.tencent.mm.plugin.story.model.b.a();
    this.siv = com.tencent.mm.bz.a.fromDPToPix(paramContext, 48);
    AppMethodBeat.o(110354);
  }

  public final ImageView getAvatarView()
  {
    AppMethodBeat.i(110348);
    ImageView localImageView = this.goC;
    if (localImageView == null)
      j.avw("avatarView");
    AppMethodBeat.o(110348);
    return localImageView;
  }

  public final com.tencent.mm.plugin.story.model.b.a getComment()
  {
    return this.sit;
  }

  public final ViewGroup getContentLayout()
  {
    AppMethodBeat.i(110350);
    ViewGroup localViewGroup = this.sis;
    if (localViewGroup == null)
      j.avw("contentLayout");
    AppMethodBeat.o(110350);
    return localViewGroup;
  }

  public final View getMaskView()
  {
    AppMethodBeat.i(110346);
    View localView = this.iVh;
    if (localView == null)
      j.avw("maskView");
    AppMethodBeat.o(110346);
    return localView;
  }

  public final ValueAnimator getNormalAnimator()
  {
    return this.siq;
  }

  public final ValueAnimator getNormalBgAnimator()
  {
    return this.sir;
  }

  protected final void onFinishInflate()
  {
    AppMethodBeat.i(110353);
    super.onFinishInflate();
    View localView1 = findViewById(2131828072);
    View localView2 = localView1;
    if (localView1 == null)
      localView2 = findViewById(2131828066);
    if (localView2 == null);
    for (this.iVh = ((View)this); ; this.iVh = localView2)
    {
      localView2 = findViewById(2131828067);
      j.o(localView2, "findViewById(R.id.story_comment_item_avatar)");
      this.goC = ((ImageView)localView2);
      localView2 = findViewById(2131828068);
      j.o(localView2, "findViewById(R.id.story_…ment_item_content_layout)");
      this.sis = ((ViewGroup)localView2);
      AppMethodBeat.o(110353);
      return;
    }
  }

  public final void setAvatarView(ImageView paramImageView)
  {
    AppMethodBeat.i(110349);
    j.p(paramImageView, "<set-?>");
    this.goC = paramImageView;
    AppMethodBeat.o(110349);
  }

  public final void setComment(com.tencent.mm.plugin.story.model.b.a parama)
  {
    AppMethodBeat.i(110352);
    j.p(parama, "<set-?>");
    this.sit = parama;
    AppMethodBeat.o(110352);
  }

  public final void setContentLayout(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(110351);
    j.p(paramViewGroup, "<set-?>");
    this.sis = paramViewGroup;
    AppMethodBeat.o(110351);
  }

  public final void setMaskView(View paramView)
  {
    AppMethodBeat.i(110347);
    j.p(paramView, "<set-?>");
    this.iVh = paramView;
    AppMethodBeat.o(110347);
  }

  public final void setNormalAnimator(ValueAnimator paramValueAnimator)
  {
    this.siq = paramValueAnimator;
  }

  public final void setNormalBgAnimator(ValueAnimator paramValueAnimator)
  {
    this.sir = paramValueAnimator;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentItemView$TwoLineInterpolator;", "Landroid/view/animation/Interpolator;", "divide", "Landroid/graphics/PointF;", "(Landroid/graphics/PointF;)V", "getDivide", "()Landroid/graphics/PointF;", "smooth", "", "smoothEnd", "smoothStart", "getInterpolation", "input", "plugin-story_release"})
  public static final class c
    implements Interpolator
  {
    private final PointF siA;
    private final PointF siB;
    private final PointF siC;
    private final float siz;

    public c(PointF paramPointF)
    {
      AppMethodBeat.i(110343);
      this.siC = paramPointF;
      this.siz = 0.2F;
      this.siA = new PointF(this.siC.x * (1.0F - this.siz), this.siC.y * (1.0F - this.siz));
      this.siB = new PointF(this.siC.x + (1.0F - this.siC.x) * this.siz, this.siC.y + (1.0F - this.siC.y) * this.siz);
      AppMethodBeat.o(110343);
    }

    public final float getInterpolation(float paramFloat)
    {
      if (paramFloat < this.siA.x)
        paramFloat = this.siC.y * paramFloat / this.siC.x;
      while (true)
      {
        return paramFloat;
        if (paramFloat < this.siB.x)
          paramFloat = this.siA.y + (paramFloat - this.siA.x) / (this.siB.x - this.siA.x) * (this.siB.y - this.siA.y);
        else
          paramFloat = this.siC.y + (paramFloat - this.siC.x) / (1.0F - this.siC.x) * (1.0F - this.siC.y);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentItemView
 * JD-Core Version:    0.6.2
 */