package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public final class d
{
  private static final int uyv = b.uym / 2 * (b.uym / 2);
  private int mScreenHeight;
  private int mScreenWidth;
  private boolean uyA;
  private boolean uyB;
  private float uyC;
  private float uyD;
  private long uyE;
  private boolean uye;
  g uyr;
  private f uys;
  private float uyt;
  private int uyw;
  private int uyx;
  private d.a uyy;
  private FrameLayout.LayoutParams uyz;

  public d(g paramg, f paramf)
  {
    AppMethodBeat.i(8161);
    this.uyw = (b.uyg - b.uym / 2);
    this.uyx = (-b.uym / 2);
    this.uyC = 2.0F;
    this.uyD = 0.15F;
    this.uyr = paramg;
    this.uys = paramf;
    this.uyy = new d.a(this.uyr.getActivity());
    this.uyy.uyG = new a.a()
    {
      public final void onChange(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(8157);
        d.a(d.this, paramAnonymousBoolean);
        d.g(d.this).bottomMargin = d.l(d.this);
        d.g(d.this).rightMargin = d.k(d.this);
        d.h(d.this).setLayoutParams(d.g(d.this));
        AppMethodBeat.o(8157);
      }
    };
    if (a.gd(ah.getContext()) > a.ge(ah.getContext()));
    for (boolean bool = true; ; bool = false)
    {
      nS(bool);
      this.uyz = new FrameLayout.LayoutParams(-2, -2);
      this.uyz.gravity = 85;
      this.uyz.bottomMargin = this.uyw;
      this.uyz.rightMargin = this.uyx;
      this.uyy.setLayoutParams(this.uyz);
      AppMethodBeat.o(8161);
      return;
    }
  }

  private void daZ()
  {
    AppMethodBeat.i(8163);
    if (!this.uyA)
      AppMethodBeat.o(8163);
    while (true)
    {
      return;
      this.uyy.setVisibility(8);
      this.uyA = false;
      AppMethodBeat.o(8163);
    }
  }

  private void dba()
  {
    AppMethodBeat.i(8164);
    if (this.uyr != null)
      b.fs(this.uyr.getActivity());
    if (this.uye)
    {
      this.uyw = (-b.uym / 2);
      this.uyx = (b.uyg - b.uym / 2);
      AppMethodBeat.o(8164);
    }
    while (true)
    {
      return;
      this.uyw = (b.uyg - b.uym / 2);
      this.uyx = (-b.uym / 2);
      AppMethodBeat.o(8164);
    }
  }

  private void nS(boolean paramBoolean)
  {
    AppMethodBeat.i(8165);
    ab.i("MicroMsg.BagIndicatorController", "updateOrientation isLandscape:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uye = paramBoolean;
    this.mScreenWidth = a.gd(ah.getContext());
    this.mScreenHeight = a.ge(ah.getContext());
    dba();
    this.uyC = (1.0F / ((this.mScreenWidth - b.uyl / 2) / this.mScreenWidth - 0.2F));
    ab.d("MicroMsg.BagIndicatorController", "initIndicator mIndicatorScaleGainConstant:%f", new Object[] { Float.valueOf(this.uyC) });
    AppMethodBeat.o(8165);
  }

  public final void start()
  {
    AppMethodBeat.i(8162);
    daZ();
    this.uyE = -1L;
    if (!this.uyr.cXe())
      AppMethodBeat.o(8162);
    while (true)
    {
      return;
      this.uyr.a(new g.a()
      {
        public final boolean ba(boolean paramAnonymousBoolean)
        {
          boolean bool = false;
          AppMethodBeat.i(8155);
          ab.i("MicroMsg.BagIndicatorController", "onViewReleased willSwipeBack:%b %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(d.d(d.this)) });
          d.a(d.this, -1L);
          if (!paramAnonymousBoolean)
          {
            d.j(d.this);
            d.m(d.this);
            AppMethodBeat.o(8155);
            paramAnonymousBoolean = bool;
          }
          while (true)
          {
            return paramAnonymousBoolean;
            if (d.d(d.this))
            {
              ab.v("MicroMsg.BagIndicatorController", "onViewReleased showBag");
              d.j(d.this);
              d.m(d.this);
              d.o(d.this).d(d.n(d.this), 14);
              AppMethodBeat.o(8155);
              paramAnonymousBoolean = true;
            }
            else
            {
              AppMethodBeat.o(8155);
              paramAnonymousBoolean = bool;
            }
          }
        }

        public final void bg(float paramAnonymousFloat)
        {
          AppMethodBeat.i(8153);
          if (d.a(d.this) < 0L)
            d.a(d.this, bo.anU());
          if (d.a(d.this, paramAnonymousFloat))
          {
            if (!d.b(d.this))
              d.c(d.this);
            if (!d.d(d.this))
            {
              float f = d.e(d.this) * paramAnonymousFloat;
              paramAnonymousFloat = f;
              if (f > 1.0F)
                paramAnonymousFloat = 1.0F;
              if (d.f(d.this))
              {
                d.g(d.this).bottomMargin = ((int)((paramAnonymousFloat * 0.5F - 1.0F) * b.uym));
                d.g(d.this).rightMargin = (d.g(d.this).bottomMargin + b.uyg);
                d.h(d.this).setLayoutParams(d.g(d.this));
              }
            }
            else
            {
              d.i(d.this);
              AppMethodBeat.o(8153);
            }
          }
          while (true)
          {
            return;
            d.g(d.this).rightMargin = ((int)((paramAnonymousFloat * 0.5F - 1.0F) * b.uym));
            d.g(d.this).bottomMargin = (d.g(d.this).rightMargin + b.uyg);
            break;
            d.j(d.this);
            AppMethodBeat.o(8153);
          }
        }

        public final void l(MotionEvent paramAnonymousMotionEvent)
        {
          AppMethodBeat.i(8154);
          boolean bool = d.d(d.this);
          d.a(d.this, paramAnonymousMotionEvent);
          if ((d.b(d.this)) && (d.d(d.this) != bool))
          {
            if (d.d(d.this))
            {
              d.g(d.this).rightMargin = d.k(d.this);
              d.g(d.this).bottomMargin = d.l(d.this);
              d.h(d.this).setLayoutParams(d.g(d.this));
              d.b(d.this, paramAnonymousMotionEvent.getRawX());
            }
            paramAnonymousMotionEvent = d.h(d.this);
            bool = d.d(d.this);
            ab.v("MicroMsg.BagIndicatorController.BagIndicator", "onHitChange %b", new Object[] { Boolean.valueOf(bool) });
            if (bool)
            {
              paramAnonymousMotionEvent.iUn.setImageResource(2131232159);
              paramAnonymousMotionEvent.af(1.0F, b.uyn);
              if (paramAnonymousMotionEvent.iVt != null)
                paramAnonymousMotionEvent.iVt.vibrate(10L);
              AppMethodBeat.o(8154);
            }
          }
          while (true)
          {
            return;
            paramAnonymousMotionEvent.iUn.setImageResource(2131232158);
            paramAnonymousMotionEvent.af(b.uyn, 1.0F);
            AppMethodBeat.o(8154);
          }
        }
      });
      this.uyy.setVisibility(8);
      ViewGroup localViewGroup = this.uyr.bSl();
      while (true)
      {
        int j;
        try
        {
          if (this.uyy.getParent() != null)
            break label200;
          int i = localViewGroup.getChildCount();
          j = 0;
          int k = i;
          if (j < localViewGroup.getChildCount())
          {
            if (!(localViewGroup.getChildAt(j) instanceof SwipeBackLayout))
              break label194;
            k = j + 1;
            ab.i("MicroMsg.BagIndicatorController", "start pos %d, count %d", new Object[] { Integer.valueOf(k), Integer.valueOf(localViewGroup.getChildCount()) });
          }
          localViewGroup.addView(this.uyy, k);
          AppMethodBeat.o(8162);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.BagIndicatorController", "start addView exp:%s", new Object[] { localException.getLocalizedMessage() });
          AppMethodBeat.o(8162);
        }
        break;
        label194: j++;
      }
      label200: ab.i("MicroMsg.BagIndicatorController", "start already added");
      AppMethodBeat.o(8162);
    }
  }

  static abstract interface a$a
  {
    public abstract void onChange(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.d
 * JD-Core Version:    0.6.2
 */