package android.support.v7.view;

import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  boolean UO;
  x ZG;
  private final y ZH = new y()
  {
    private boolean ZI = false;
    private int ZJ = 0;

    public final void aA(View paramAnonymousView)
    {
      int i = this.ZJ + 1;
      this.ZJ = i;
      if (i == h.this.uC.size())
      {
        if (h.this.ZG != null)
          h.this.ZG.aA(null);
        this.ZJ = 0;
        this.ZI = false;
        h.this.UO = false;
      }
    }

    public final void az(View paramAnonymousView)
    {
      if (this.ZI);
      while (true)
      {
        return;
        this.ZI = true;
        if (h.this.ZG != null)
          h.this.ZG.az(null);
      }
    }
  };
  private long mDuration = -1L;
  private Interpolator mInterpolator;
  final ArrayList<w> uC = new ArrayList();

  public final h a(w paramw)
  {
    if (!this.UO)
      this.uC.add(paramw);
    return this;
  }

  public final h a(w paramw1, w paramw2)
  {
    this.uC.add(paramw1);
    paramw2.m(paramw1.getDuration());
    this.uC.add(paramw2);
    return this;
  }

  public final h b(x paramx)
  {
    if (!this.UO)
      this.ZG = paramx;
    return this;
  }

  public final void cancel()
  {
    if (!this.UO);
    while (true)
    {
      return;
      Iterator localIterator = this.uC.iterator();
      while (localIterator.hasNext())
        ((w)localIterator.next()).cancel();
      this.UO = false;
    }
  }

  public final h d(Interpolator paramInterpolator)
  {
    if (!this.UO)
      this.mInterpolator = paramInterpolator;
    return this;
  }

  public final h gg()
  {
    if (!this.UO)
      this.mDuration = 250L;
    return this;
  }

  public final void start()
  {
    if (this.UO);
    while (true)
    {
      return;
      Iterator localIterator = this.uC.iterator();
      while (localIterator.hasNext())
      {
        w localw = (w)localIterator.next();
        if (this.mDuration >= 0L)
          localw.l(this.mDuration);
        if (this.mInterpolator != null)
          localw.c(this.mInterpolator);
        if (this.ZG != null)
          localw.a(this.ZH);
        localw.start();
      }
      this.UO = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.h
 * JD-Core Version:    0.6.2
 */