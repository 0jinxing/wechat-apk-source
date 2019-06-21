package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

final class CollectMainUI$b
{
  boolean kHw;
  LinkedList<CollectMainUI.a> kHx;

  private CollectMainUI$b(CollectMainUI paramCollectMainUI)
  {
    AppMethodBeat.i(41283);
    this.kHx = new LinkedList();
    AppMethodBeat.o(41283);
  }

  private void a(CollectMainUI.a parama)
  {
    AppMethodBeat.i(41286);
    this.kHw = true;
    CollectMainUI.l(this.kHl);
    CollectMainUI.o(this.kHl).setLayoutParams(new LinearLayout.LayoutParams(CollectMainUI.j(this.kHl).getWidth(), CollectMainUI.j(this.kHl).getHeight()));
    if (this.kHl.kGL)
      CollectMainUI.o(this.kHl).setPadding(0, CollectMainUI.bhB(), 0, 0);
    final AnimationSet localAnimationSet;
    int i;
    while (true)
    {
      CollectMainUI.p(this.kHl).setText(j.b(this.kHl.mController.ylL, parama.eoz, CollectMainUI.p(this.kHl).getTextSize()));
      a.b.b(CollectMainUI.q(this.kHl), parama.username);
      CollectMainUI.r(this.kHl).setText(e.e(parama.kCJ, parama.cuZ));
      CollectMainUI.o(this.kHl).setVisibility(0);
      localAnimationSet = new AnimationSet(false);
      localAnimationSet.addAnimation(new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F));
      i = 0;
      for (int j = 0; j < CollectMainUI.s(this.kHl).size(); j++)
        if (((CollectMainUI.a)CollectMainUI.s(this.kHl).get(j)).cAa.equals(parama.cAa))
          i = j;
      CollectMainUI.o(this.kHl).setPadding(0, CollectMainUI.bhC(), 0, 0);
    }
    localAnimationSet.addAnimation(new TranslateAnimation(0.0F, CollectMainUI.access$1600(), 0.0F, tK(i)));
    localAnimationSet.setDuration(300L);
    localAnimationSet.setInterpolator(new DecelerateInterpolator());
    localAnimationSet.setAnimationListener(new CollectMainUI.b.1(this, parama));
    parama = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    parama.setDuration(300L);
    parama.setInterpolator(new LinearInterpolator());
    parama.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(41281);
        localAnimationSet.setStartOffset(1700L);
        CollectMainUI.o(CollectMainUI.b.this.kHl).startAnimation(localAnimationSet);
        AppMethodBeat.o(41281);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        AppMethodBeat.i(41282);
        CollectMainUI.o(CollectMainUI.b.this.kHl).setVisibility(0);
        AppMethodBeat.o(41282);
      }
    });
    CollectMainUI.o(this.kHl).startAnimation(parama);
    AppMethodBeat.o(41286);
  }

  private int tK(int paramInt)
  {
    AppMethodBeat.i(41284);
    float f1 = 0.0F + CollectMainUI.j(this.kHl).getHeight() / 2;
    float f2 = f1;
    if (CollectMainUI.n(this.kHl).getVisibility() == 0)
      f2 = f1 + CollectMainUI.n(this.kHl).getHeight();
    f1 = CollectMainUI.bhz() * paramInt + CollectMainUI.bhz() / 2;
    int[] arrayOfInt = new int[2];
    CollectMainUI.j(this.kHl).getLocationInWindow(arrayOfInt);
    paramInt = (int)(f2 + f1 + (arrayOfInt[1] - CollectMainUI.bhA()));
    AppMethodBeat.o(41284);
    return paramInt;
  }

  public final void bhF()
  {
    AppMethodBeat.i(41285);
    if (!this.kHw)
    {
      if (this.kHx.isEmpty())
        break label73;
      a((CollectMainUI.a)this.kHx.poll());
      AppMethodBeat.o(41285);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animating, wait. QueueSize=" + this.kHx.size());
      label73: AppMethodBeat.o(41285);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.b
 * JD-Core Version:    0.6.2
 */