package com.tencent.mm.ui.widget.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.Queue;

public class SnackContainer extends FrameLayout
{
  private final Runnable mHideRunnable;
  private AnimationSet yPM;
  Queue<a> zTX;
  private AnimationSet zTY;

  public SnackContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112996);
    this.zTX = new LinkedList();
    this.mHideRunnable = new SnackContainer.1(this);
    init();
    AppMethodBeat.o(112996);
  }

  SnackContainer(ViewGroup paramViewGroup)
  {
    super(paramViewGroup.getContext());
    AppMethodBeat.i(112997);
    this.zTX = new LinkedList();
    this.mHideRunnable = new SnackContainer.1(this);
    paramViewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
    setVisibility(8);
    setId(2131827595);
    init();
    AppMethodBeat.o(112997);
  }

  private static void b(a parama)
  {
    AppMethodBeat.i(113004);
    if (parama.zUf != null)
    {
      b.rf(false);
      parama.zUf.onHide();
    }
    AppMethodBeat.o(113004);
  }

  private static void c(a parama)
  {
    AppMethodBeat.i(113005);
    if (parama.zUf != null)
    {
      b.rf(true);
      parama.zUf.onShow();
    }
    AppMethodBeat.o(113005);
  }

  private void init()
  {
    AppMethodBeat.i(112998);
    this.yPM = new AnimationSet(false);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 1.0F, 1, 0.0F);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    this.yPM.setInterpolator(new DecelerateInterpolator(1.5F));
    this.yPM.addAnimation(localTranslateAnimation);
    this.yPM.addAnimation(localAlphaAnimation);
    this.zTY = new AnimationSet(false);
    localTranslateAnimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 0.0F, 1, 1.0F);
    localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    this.zTY.addAnimation(localTranslateAnimation);
    this.zTY.addAnimation(localAlphaAnimation);
    this.zTY.setDuration(300L);
    this.zTY.setAnimationListener(new SnackContainer.2(this));
    AppMethodBeat.o(112998);
  }

  final void a(a parama)
  {
    AppMethodBeat.i(113003);
    setVisibility(0);
    c(parama);
    addView(parama.zUb);
    parama.zUc.setText(parama.zUe.nqb);
    if (parama.zUe.zTI != null)
    {
      parama.zUd.setVisibility(0);
      parama.zUd.setText(parama.zUe.zTI);
    }
    while (true)
    {
      this.yPM.setDuration(500L);
      Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034180);
      localAnimation.setDuration(500L);
      startAnimation(this.yPM);
      localAnimation.setStartOffset(200L);
      parama.zUd.startAnimation(localAnimation);
      parama.zUc.startAnimation(localAnimation);
      if (parama.zUe.zTL > 0)
        postDelayed(this.mHideRunnable, parama.zUe.zTL);
      parama.zUb.setOnTouchListener(new SnackContainer.3(this, parama));
      AppMethodBeat.o(113003);
      return;
      parama.zUd.setVisibility(8);
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(113002);
    removeCallbacks(this.mHideRunnable);
    this.mHideRunnable.run();
    AppMethodBeat.o(113002);
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(113000);
    boolean bool = this.zTX.isEmpty();
    AppMethodBeat.o(113000);
    return bool;
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(113001);
    boolean bool;
    if (!this.zTX.isEmpty())
    {
      bool = true;
      AppMethodBeat.o(113001);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113001);
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(112999);
    super.onDetachedFromWindow();
    this.yPM.cancel();
    this.zTY.cancel();
    removeCallbacks(this.mHideRunnable);
    this.zTX.clear();
    AppMethodBeat.o(112999);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(113006);
    super.onVisibilityChanged(paramView, paramInt);
    if (8 == paramInt)
    {
      removeAllViews();
      if (!this.zTX.isEmpty())
        b((a)this.zTX.poll());
      if (isEmpty())
        break label83;
      a((a)this.zTX.peek());
    }
    while (true)
    {
      b.rf(false);
      AppMethodBeat.o(113006);
      return;
      label83: setVisibility(8);
    }
  }

  static final class a
  {
    final View zUb;
    final TextView zUc;
    final TextView zUd;
    final Snack zUe;
    final a.c zUf;

    private a(Snack paramSnack, View paramView, a.c paramc)
    {
      AppMethodBeat.i(112995);
      this.zUb = paramView;
      this.zUd = ((TextView)paramView.findViewById(2131827598));
      this.zUc = ((TextView)paramView.findViewById(2131827597));
      this.zUe = paramSnack;
      this.zUf = paramc;
      AppMethodBeat.o(112995);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.SnackContainer
 * JD-Core Version:    0.6.2
 */