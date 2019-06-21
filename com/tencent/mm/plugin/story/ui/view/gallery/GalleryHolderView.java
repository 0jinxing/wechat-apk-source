package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.v;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ah;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initMargin", "getInitMargin", "()I", "setInitMargin", "(I)V", "lastScrollAlpha", "", "mActionIv", "Landroid/widget/ImageView;", "mActionView", "Landroid/widget/LinearLayout;", "mBubbleIv", "mIsFirstPullDown", "", "mTitleTv", "Landroid/widget/TextView;", "smallHead", "animClosing", "", "animOpening", "checkSmallHead", "closed", "goStoryCaptureUI", "onClosing", "offset", "onListInnerScroll", "onOpening", "opened", "Companion", "plugin-story_release"})
public final class GalleryHolderView extends RelativeLayout
{
  static final String TAG = "MicroMsg.GalleryHolderView";
  public static final GalleryHolderView.a snO;
  TextView iDT;
  LinearLayout snI;
  private ImageView snJ;
  private ImageView snK;
  private boolean snL;
  int snM;
  float snN;

  static
  {
    AppMethodBeat.i(110718);
    snO = new GalleryHolderView.a((byte)0);
    TAG = "MicroMsg.GalleryHolderView";
    AppMethodBeat.o(110718);
  }

  public GalleryHolderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110717);
    AppMethodBeat.o(110717);
  }

  public GalleryHolderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110716);
    View.inflate(paramContext, 2130970887, (ViewGroup)this);
    paramAttributeSet = findViewById(2131828153);
    j.o(paramAttributeSet, "findViewById(R.id.story_…ery_holder_action_layout)");
    this.snI = ((LinearLayout)paramAttributeSet);
    paramAttributeSet = findViewById(2131828154);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_holder_action_iv)");
    this.snJ = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828151);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_holder_bubble)");
    this.snK = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828152);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_holder_title_tv)");
    this.iDT = ((TextView)paramAttributeSet);
    this.snI.setVisibility(4);
    this.snJ.setImageDrawable(ah.e(paramContext.getResources().getDrawable(2131231403), paramContext.getResources().getColor(2131690544)));
    this.snI.setOnClickListener((View.OnClickListener)new GalleryHolderView.1(this));
    setBackgroundColor(paramContext.getResources().getColor(2131690541));
    paramContext = g.RP();
    j.o(paramContext, "MMKernel.storage()");
    paramContext = paramContext.Ry().get(ac.a.xWO, Boolean.TRUE);
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type kotlin.Boolean");
      AppMethodBeat.o(110716);
      throw paramContext;
    }
    this.snL = ((Boolean)paramContext).booleanValue();
    if (this.snL)
    {
      this.iDT.setTextColor(getResources().getColor(2131690518));
      paramContext = this.iDT;
      paramAttributeSet = l.spJ;
      paramAttributeSet = getResources().getString(2131303940);
      j.o(paramAttributeSet, "resources.getString(R.st…ory_gallery_holder_title)");
      paramContext.setText((CharSequence)l.a.l((CharSequence)paramAttributeSet, getResources().getColor(2131690518)));
    }
    while (true)
    {
      this.snN = 1.0F;
      AppMethodBeat.o(110716);
      return;
      this.iDT.setTextColor(getResources().getColor(2131690542));
      this.iDT.setText((CharSequence)getResources().getString(2131306020));
    }
  }

  public final void cCE()
  {
    AppMethodBeat.i(110714);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(this.iDT, "alpha", new float[] { this.iDT.getAlpha(), 0.0F }), (Animator)ObjectAnimator.ofFloat(this.snI, "alpha", new float[] { this.snI.getAlpha(), 1.0F }) });
    localAnimatorSet.setDuration(100L);
    localAnimatorSet.start();
    AppMethodBeat.o(110714);
  }

  public final void cCF()
  {
    AppMethodBeat.i(110715);
    this.snI.setVisibility(0);
    this.iDT.setVisibility(4);
    if (this.snL)
    {
      this.snL = false;
      e locale = g.RP();
      j.o(locale, "MMKernel.storage()");
      locale.Ry().set(ac.a.xWO, Boolean.FALSE);
    }
    this.iDT.setTextColor(getResources().getColor(2131690542));
    this.iDT.setText((CharSequence)getResources().getString(2131306020));
    AppMethodBeat.o(110715);
  }

  public final int getInitMargin()
  {
    return this.snM;
  }

  public final void setInitMargin(int paramInt)
  {
    this.snM = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView
 * JD-Core Version:    0.6.2
 */