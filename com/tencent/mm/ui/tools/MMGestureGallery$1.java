package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.f;

final class MMGestureGallery$1
  implements View.OnTouchListener
{
  MMGestureGallery$1(MMGestureGallery paramMMGestureGallery)
  {
  }

  private void dJM()
  {
    AppMethodBeat.i(107658);
    dJN();
    MMGestureGallery.e(this.zFK).j(2, 500L, 0L);
    AppMethodBeat.o(107658);
  }

  private void dJN()
  {
    AppMethodBeat.i(107659);
    MMGestureGallery.e(this.zFK).removeMessages(2);
    AppMethodBeat.o(107659);
  }

  private void qP(boolean paramBoolean)
  {
    AppMethodBeat.i(107661);
    MMGestureGallery.K(this.zFK).D(350L, paramBoolean);
    AppMethodBeat.o(107661);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107660);
    if (MMGestureGallery.f(this.zFK) == null)
      MMGestureGallery.a(this.zFK, VelocityTracker.obtain());
    MMGestureGallery.f(this.zFK).addMovement(paramMotionEvent);
    View localView = this.zFK.getSelectedView();
    paramView = localView;
    boolean bool;
    if ((localView instanceof ViewGroup))
    {
      if (paramMotionEvent.getAction() == 0)
      {
        MMGestureGallery.a(this.zFK, f.c(paramMotionEvent, 0));
        MMGestureGallery.b(this.zFK, f.d(paramMotionEvent, 0));
      }
      paramView = localView.findViewById(2131820629);
      if ((paramView != null) && (paramView.getVisibility() == 0) && (!(paramView instanceof MultiTouchImageView)))
      {
        if (paramMotionEvent.getAction() == 0)
          dJM();
        if (paramMotionEvent.getAction() == 1)
          dJN();
      }
      paramView = localView.findViewById(2131820630);
      if (((paramView == null) || (paramView.getVisibility() == 8)) && (MMGestureGallery.g(this.zFK)) && (MMGestureGallery.h(this.zFK) != null) && (paramMotionEvent.getAction() == 1) && (Math.abs(MMGestureGallery.i(this.zFK) - f.c(paramMotionEvent, 0)) < 10.0F) && (Math.abs(MMGestureGallery.j(this.zFK) - f.d(paramMotionEvent, 0)) < 10.0F) && (!MMGestureGallery.k(this.zFK)))
        qP(true);
      if (paramMotionEvent.getAction() == 1)
        MMGestureGallery.l(this.zFK);
      if (paramView != null)
      {
        localView = paramView.findViewById(2131820629);
        paramView = localView;
        if (localView != null);
      }
      else
      {
        AppMethodBeat.o(107660);
        bool = false;
        return bool;
      }
    }
    label493: float f3;
    if ((paramView instanceof MultiTouchImageView))
    {
      MMGestureGallery.a(this.zFK, (MultiTouchImageView)paramView);
      ab.d("dktest", "MMGestureGallery onTouch event.getAction():" + paramMotionEvent.getAction());
      if (paramMotionEvent.getAction() == 0)
      {
        dJM();
        MMGestureGallery.a(this.zFK).dzB();
        MMGestureGallery.c(this.zFK, paramMotionEvent.getX());
        MMGestureGallery.d(this.zFK, paramMotionEvent.getY());
        MMGestureGallery.e(this.zFK, 0.0F);
        MMGestureGallery.f(this.zFK, MMGestureGallery.a(this.zFK).getScale());
        ab.d("dktest", "originalScale :" + MMGestureGallery.m(this.zFK));
        MMGestureGallery.a(this.zFK, false);
        MMGestureGallery.n(this.zFK);
        if (MMGestureGallery.o(this.zFK) == 1)
        {
          MMGestureGallery.a(this.zFK, System.currentTimeMillis());
          MMGestureGallery.a(this.zFK, f.c(paramMotionEvent, 0));
          MMGestureGallery.b(this.zFK, f.d(paramMotionEvent, 0));
        }
      }
      else
      {
        if ((paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 262))
        {
          dJN();
          MMGestureGallery.e(this.zFK, 0.0F);
          MMGestureGallery.f(this.zFK, MMGestureGallery.a(this.zFK).getScale());
          MMGestureGallery.a(this.zFK, true);
          float f1;
          if (MMGestureGallery.m(this.zFK) < MMGestureGallery.a(this.zFK).getScaleRate())
          {
            f1 = f.c(paramMotionEvent, 0);
            f2 = f.c(paramMotionEvent, 1);
            f3 = f.d(paramMotionEvent, 0);
            f4 = f.d(paramMotionEvent, 1);
            MMGestureGallery.a(this.zFK).ah(f1 - f2 + f.c(paramMotionEvent, 1), f3 - f4 + f.d(paramMotionEvent, 1));
          }
          if (MMGestureGallery.m(this.zFK) > MMGestureGallery.a(this.zFK).getDoubleTabScale() * 2.0F)
          {
            f3 = f.c(paramMotionEvent, 0);
            f2 = f.c(paramMotionEvent, 1);
            f1 = f.d(paramMotionEvent, 0);
            f4 = f.d(paramMotionEvent, 1);
            MMGestureGallery.a(this.zFK).setMaxZoomLimit(MMGestureGallery.a(this.zFK).getDoubleTabScale() * 2.0F);
            MMGestureGallery.a(this.zFK).k(MMGestureGallery.a(this.zFK).getDoubleTabScale() * 2.0F, f3 - f2 + f.c(paramMotionEvent, 1), f1 - f4 + f.d(paramMotionEvent, 1));
          }
        }
        if (paramMotionEvent.getAction() == 1)
        {
          dJN();
          MMGestureGallery.r(this.zFK);
          MMGestureGallery.s(this.zFK);
          MMGestureGallery.l(this.zFK);
          if (((!MMGestureGallery.t(this.zFK)) && (!MMGestureGallery.u(this.zFK)) && (!MMGestureGallery.v(this.zFK)) && (!MMGestureGallery.w(this.zFK))) || ((!MMGestureGallery.x(this.zFK)) && (!MMGestureGallery.y(this.zFK))))
            break label1367;
          MMGestureGallery.a(this.zFK, new MMGestureGallery.h(this.zFK));
          MMGestureGallery.z(this.zFK);
          MMGestureGallery.A(this.zFK);
          MMGestureGallery.B(this.zFK);
          MMGestureGallery.C(this.zFK);
          MMGestureGallery.D(this.zFK);
          MMGestureGallery.E(this.zFK);
          MMGestureGallery.F(this.zFK);
          label920: MMGestureGallery.e(this.zFK, 0.0F);
          MMGestureGallery.f(this.zFK, MMGestureGallery.a(this.zFK).getScale());
          if (MMGestureGallery.o(this.zFK) == 1)
          {
            MMGestureGallery.c(this.zFK, System.currentTimeMillis());
            if (MMGestureGallery.q(this.zFK) - MMGestureGallery.L(this.zFK) >= 350L)
              break label1666;
            if ((Math.abs(MMGestureGallery.i(this.zFK) - f.c(paramMotionEvent, 0)) < 10.0F) && (Math.abs(MMGestureGallery.j(this.zFK) - f.d(paramMotionEvent, 0)) < 10.0F))
              qP(false);
          }
        }
      }
      while (true)
      {
        if ((paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 261))
        {
          MMGestureGallery.e(this.zFK, 0.0F);
          MMGestureGallery.f(this.zFK, MMGestureGallery.a(this.zFK).getScale());
          MMGestureGallery.a(this.zFK, true);
        }
        if (paramMotionEvent.getAction() != 2)
          break label1771;
        if (f.O(paramMotionEvent) != 2)
          break label1843;
        dJN();
        if ((!MMGestureGallery.M(this.zFK)) && (!MMGestureGallery.v(this.zFK)) && (!MMGestureGallery.w(this.zFK)))
          break label1687;
        AppMethodBeat.o(107660);
        bool = true;
        break;
        if (MMGestureGallery.o(this.zFK) != 2)
          break label493;
        MMGestureGallery.b(this.zFK, System.currentTimeMillis());
        if (MMGestureGallery.p(this.zFK) - MMGestureGallery.q(this.zFK) < 350L)
        {
          if ((Math.abs(MMGestureGallery.i(this.zFK) - f.c(paramMotionEvent, 0)) < 35.0F) && (Math.abs(MMGestureGallery.j(this.zFK) - f.d(paramMotionEvent, 0)) < 35.0F))
          {
            MMGestureGallery.a(this.zFK, 0);
            ab.d("MicroMsg.MMGestureGallery", "double click!");
            if (MMGestureGallery.a(this.zFK).getScale() <= MMGestureGallery.a(this.zFK).getScaleRate())
            {
              MMGestureGallery.a(this.zFK).ai(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
              break label493;
            }
            MMGestureGallery.a(this.zFK).ah(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
            MMGestureGallery.a(this.zFK).dAp();
            break label493;
          }
          MMGestureGallery.a(this.zFK, 1);
          break label493;
        }
        MMGestureGallery.a(this.zFK, 1);
        break label493;
        label1367: if ((MMGestureGallery.v(this.zFK)) || (MMGestureGallery.t(this.zFK)))
        {
          MMGestureGallery.C(this.zFK);
          MMGestureGallery.A(this.zFK);
          MMGestureGallery.a(this.zFK, new MMGestureGallery.i(this.zFK));
          MMGestureGallery.z(this.zFK);
        }
        if ((MMGestureGallery.w(this.zFK)) || (MMGestureGallery.u(this.zFK)))
        {
          MMGestureGallery.D(this.zFK);
          MMGestureGallery.B(this.zFK);
          MMGestureGallery.a(this.zFK, new MMGestureGallery.j(this.zFK));
          MMGestureGallery.z(this.zFK);
        }
        if (MMGestureGallery.x(this.zFK))
        {
          MMGestureGallery.E(this.zFK);
          MMGestureGallery.a(this.zFK, new MMGestureGallery.k(this.zFK));
          MMGestureGallery.z(this.zFK);
        }
        if (MMGestureGallery.y(this.zFK))
        {
          MMGestureGallery.F(this.zFK);
          MMGestureGallery.a(this.zFK, new MMGestureGallery.g(this.zFK));
          MMGestureGallery.z(this.zFK);
        }
        if (MMGestureGallery.G(this.zFK))
        {
          if (MMGestureGallery.H(this.zFK) != null)
            MMGestureGallery.H(this.zFK).aa(0.0F, 0.0F);
          MMGestureGallery.b(this.zFK, false);
        }
        if ((!MMGestureGallery.I(this.zFK)) || (MMGestureGallery.J(this.zFK)))
          break label920;
        MMGestureGallery.K(this.zFK).D(0L, true);
        MMGestureGallery.b(this.zFK, false);
        break label920;
        label1666: MMGestureGallery.a(this.zFK, 0);
        ab.d("MicroMsg.MMGestureGallery", "single long click over!");
      }
      label1687: MMGestureGallery.a(this.zFK, true);
      MMGestureGallery.a(this.zFK, 0);
      f4 = f.c(paramMotionEvent, 0) - f.c(paramMotionEvent, 1);
      f2 = f.d(paramMotionEvent, 0) - f.d(paramMotionEvent, 1);
      f3 = (float)Math.sqrt(f4 * f4 + f2 * f2);
      if (MMGestureGallery.N(this.zFK) != 0.0F)
        break label1782;
      MMGestureGallery.e(this.zFK, f3);
    }
    while (true)
    {
      label1771: AppMethodBeat.o(107660);
      bool = false;
      break;
      label1782: f3 /= MMGestureGallery.N(this.zFK);
      if (MMGestureGallery.O(this.zFK))
        MMGestureGallery.a(this.zFK).k(f3 * MMGestureGallery.m(this.zFK), f4 + f.c(paramMotionEvent, 1), f.d(paramMotionEvent, 1) + f2);
    }
    label1843: paramView = MMGestureGallery.f(this.zFK);
    paramView.computeCurrentVelocity(1000);
    int i = (int)paramView.getXVelocity();
    int j = (int)paramView.getYVelocity();
    float f2 = paramMotionEvent.getX() - MMGestureGallery.P(this.zFK);
    float f4 = paramMotionEvent.getY() - MMGestureGallery.Q(this.zFK);
    if ((MMGestureGallery.H(this.zFK) != null) && (!MMGestureGallery.J(this.zFK)) && (!MMGestureGallery.O(this.zFK)) && (MMGestureGallery.m(this.zFK) <= MMGestureGallery.a(this.zFK).getScaleRate()))
    {
      MMGestureGallery.H(this.zFK).ab(f2, f4);
      if (((Math.abs(f2) > 250.0F) || (Math.abs(j) <= Math.abs(i)) || (j <= 0) || (MMGestureGallery.k(this.zFK))) && (!MMGestureGallery.I(this.zFK)))
        break label2151;
      MMGestureGallery.H(this.zFK).aa(f2, f4);
      MMGestureGallery.b(this.zFK, true);
      label2042: if (f4 <= 200.0F)
        break label2163;
      MMGestureGallery.c(this.zFK, false);
    }
    while (true)
    {
      if (MMGestureGallery.f(this.zFK) != null)
      {
        MMGestureGallery.f(this.zFK).recycle();
        MMGestureGallery.a(this.zFK, null);
      }
      if ((Math.abs(MMGestureGallery.i(this.zFK) - f.c(paramMotionEvent, 0)) <= 35.0F) && (Math.abs(MMGestureGallery.j(this.zFK) - f.d(paramMotionEvent, 0)) <= 35.0F))
        break;
      dJN();
      MMGestureGallery.a(this.zFK, 0);
      break;
      label2151: MMGestureGallery.b(this.zFK, false);
      break label2042;
      label2163: MMGestureGallery.c(this.zFK, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.1
 * JD-Core Version:    0.6.2
 */