package android.support.design.widget;

import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.s;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class b<B extends b<B>>
{
  private static final boolean mK;
  static final Handler sHandler;
  final ViewGroup mL;
  final b.e mM;
  private final b.b mN;
  private List<Object<B>> mO;
  private final AccessibilityManager mP;
  final l.a mQ;

  static
  {
    if ((Build.VERSION.SDK_INT >= 16) && (Build.VERSION.SDK_INT <= 19));
    for (boolean bool = true; ; bool = false)
    {
      mK = bool;
      sHandler = new Handler(Looper.getMainLooper(), new b.1());
      return;
    }
  }

  final void bD()
  {
    int i;
    Object localObject;
    if (Build.VERSION.SDK_INT >= 12)
    {
      i = this.mM.getHeight();
      if (mK)
      {
        s.q(this.mM, i);
        localObject = new ValueAnimator();
        ((ValueAnimator)localObject).setIntValues(new int[] { i, 0 });
        ((ValueAnimator)localObject).setInterpolator(a.mg);
        ((ValueAnimator)localObject).setDuration(250L);
        ((ValueAnimator)localObject).addListener(new b.8(this));
        ((ValueAnimator)localObject).addUpdateListener(new b.9(this, i));
        ((ValueAnimator)localObject).start();
      }
    }
    while (true)
    {
      return;
      this.mM.setTranslationY(i);
      break;
      localObject = AnimationUtils.loadAnimation(this.mM.getContext(), 2131034156);
      ((Animation)localObject).setInterpolator(a.mg);
      ((Animation)localObject).setDuration(250L);
      ((Animation)localObject).setAnimationListener(new b.10(this));
      this.mM.startAnimation((Animation)localObject);
    }
  }

  final void bE()
  {
    l locall = l.co();
    l.a locala = this.mQ;
    synchronized (locall.mLock)
    {
      if (locall.d(locala))
        locall.b(locall.rs);
      if (this.mO != null)
      {
        int i = this.mO.size() - 1;
        if (i >= 0)
        {
          this.mO.get(i);
          i--;
        }
      }
    }
  }

  final void bF()
  {
    l locall = l.co();
    l.a locala = this.mQ;
    synchronized (locall.mLock)
    {
      if (locall.d(locala))
      {
        locall.rs = null;
        if ((locall.rt != null) && (locall.rt != null))
        {
          locall.rs = locall.rt;
          locall.rt = null;
          if ((l.a)locall.rs.rv.get() == null)
            locall.rs = null;
        }
      }
      if (this.mO != null)
      {
        int i = this.mO.size() - 1;
        if (i >= 0)
        {
          this.mO.get(i);
          i--;
        }
      }
    }
    if (Build.VERSION.SDK_INT < 11)
      this.mM.setVisibility(8);
    ??? = this.mM.getParent();
    if ((??? instanceof ViewGroup))
      ((ViewGroup)???).removeView(this.mM);
  }

  final boolean bG()
  {
    if (!this.mP.isEnabled());
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.b
 * JD-Core Version:    0.6.2
 */