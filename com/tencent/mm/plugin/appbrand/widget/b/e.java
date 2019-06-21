package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.luggage.g.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class e extends RelativeLayout
  implements k
{
  final Set<e.a> jbT;
  private final i jbU;
  private final LinkedList<j> jbV;
  private final Runnable jbW;
  private j jbX;
  private j jbY;
  private final View.OnClickListener mOnClickListener;
  private int mRotation;

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(77409);
    this.mRotation = 0;
    this.jbT = new HashSet();
    this.jbU = new i(this);
    this.jbV = new LinkedList();
    this.mOnClickListener = new e.1(this);
    this.jbW = new e.2(this);
    setVisibility(4);
    setBackgroundColor(0);
    setOnClickListener(this.mOnClickListener);
    paramContext = (WindowManager)getContext().getSystemService("window");
    if (paramContext != null)
      this.mRotation = paramContext.getDefaultDisplay().getRotation();
    AppMethodBeat.o(77409);
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(77417);
    this.jbT.add(parama);
    AppMethodBeat.o(77417);
  }

  public final void b(e.a parama)
  {
    AppMethodBeat.i(77418);
    this.jbT.remove(parama);
    AppMethodBeat.o(77418);
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(77410);
    if (!al.isMainThread())
    {
      al.d(new e.3(this, paramj));
      AppMethodBeat.o(77410);
      return;
    }
    f.az(getContext());
    Object localObject = this.jbU;
    int i;
    label61: View localView;
    if ((((i)localObject).jcQ != null) && (((i)localObject).jcQ.isRunning()))
    {
      i = 1;
      if (i != 0)
      {
        localObject = this.jbU;
        if (((i)localObject).jcQ != null)
          ((i)localObject).jcQ.cancel();
      }
      localView = paramj.getContentView();
      if (localView.getParent() != this)
      {
        if ((localView != null) && (localView.getParent() != null))
          break label255;
        label114: if (paramj.getPosition() != 2)
          break label271;
        localObject = new RelativeLayout.LayoutParams(-1, -2);
        ((RelativeLayout.LayoutParams)localObject).addRule(12);
        ((RelativeLayout.LayoutParams)localObject).addRule(14);
        label147: addView(localView, (ViewGroup.LayoutParams)localObject);
        if (this.jbY != paramj)
        {
          localView.clearAnimation();
          if (paramj.getPosition() != 2)
            break label292;
          localView.startAnimation(AnimationUtils.loadAnimation(getContext(), 2131034189));
        }
      }
    }
    while (true)
    {
      this.jbY = paramj;
      localView.setOnClickListener(this.mOnClickListener);
      this.jbV.add(paramj);
      paramj.a(this);
      setVisibility(0);
      this.jbU.c(Color.argb(127, 0, 0, 0), null);
      AppMethodBeat.o(77410);
      break;
      i = 0;
      break label61;
      label255: ((ViewGroup)localView.getParent()).removeView(localView);
      break label114;
      label271: localObject = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject).addRule(13);
      break label147;
      label292: localView.startAnimation(AnimationUtils.loadAnimation(getContext(), 2131034138));
    }
  }

  public final void c(j paramj)
  {
    AppMethodBeat.i(77411);
    if (paramj.getContentView().getParent() != this)
      AppMethodBeat.o(77411);
    while (true)
    {
      return;
      if (this.jbX != paramj)
        break;
      AppMethodBeat.o(77411);
    }
    this.jbX = paramj;
    View localView = paramj.getContentView();
    localView.animate().cancel();
    localView.clearAnimation();
    Object localObject1;
    AnimatorSet localAnimatorSet;
    ObjectAnimator localObjectAnimator;
    if (paramj.getPosition() == 2)
    {
      localObject1 = new AccelerateInterpolator();
      localAnimatorSet = new AnimatorSet();
      localObjectAnimator = ObjectAnimator.ofFloat(localView, "translationY", new float[] { 0.0F, localView.getHeight() }).setDuration(200L);
      localObjectAnimator.setInterpolator((TimeInterpolator)localObject1);
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator });
    }
    while (true)
    {
      localAnimatorSet.addListener(new e.4(this, localView, paramj));
      localAnimatorSet.start();
      if (this.jbV.size() <= 1)
        this.jbU.c(0, this.jbW);
      AppMethodBeat.o(77411);
      break;
      Object localObject2 = AnimationUtils.loadInterpolator(localView.getContext(), 2131034153);
      Interpolator localInterpolator = AnimationUtils.loadInterpolator(localView.getContext(), 2131034152);
      localAnimatorSet = new AnimatorSet();
      localObject1 = ObjectAnimator.ofFloat(localView, "scaleX", new float[] { 1.0F, 0.9F }).setDuration(220L);
      ((Animator)localObject1).setInterpolator((TimeInterpolator)localObject2);
      localObjectAnimator = ObjectAnimator.ofFloat(localView, "scaleY", new float[] { 1.0F, 0.9F }).setDuration(220L);
      localObjectAnimator.setInterpolator((TimeInterpolator)localObject2);
      localObject2 = ObjectAnimator.ofFloat(localView, "alpha", new float[] { 1.0F, 0.0F }).setDuration(150L);
      ((Animator)localObject2).setInterpolator(localInterpolator);
      localAnimatorSet.playTogether(new Animator[] { localObject1, localObjectAnimator, localObject2 });
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(77413);
    boolean bool;
    if (getChildCount() == 0)
    {
      bool = false;
      AppMethodBeat.o(77413);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(77413);
    }
  }

  public final j getCurrentDialog()
  {
    AppMethodBeat.i(77412);
    j localj = (j)this.jbV.peekLast();
    AppMethodBeat.o(77412);
    return localj;
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(77415);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = (WindowManager)getContext().getSystemService("window");
    if (paramConfiguration != null)
    {
      int i = paramConfiguration.getDefaultDisplay().getRotation();
      if (this.mRotation != i)
      {
        this.mRotation = i;
        paramConfiguration = this.jbV.iterator();
        while (paramConfiguration.hasNext())
          ((j)paramConfiguration.next()).pF(this.mRotation);
      }
    }
    AppMethodBeat.o(77415);
  }

  public final int size()
  {
    AppMethodBeat.i(77416);
    int i = this.jbV.size();
    AppMethodBeat.o(77416);
    return i;
  }

  public final boolean wY()
  {
    AppMethodBeat.i(77414);
    j localj = (j)this.jbV.peekLast();
    boolean bool;
    if (localj == null)
    {
      setVisibility(8);
      bool = false;
      AppMethodBeat.o(77414);
    }
    while (true)
    {
      return bool;
      if (localj.isCancelable())
      {
        localj.onCancel();
        c(localj);
      }
      bool = true;
      AppMethodBeat.o(77414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.e
 * JD-Core Version:    0.6.2
 */