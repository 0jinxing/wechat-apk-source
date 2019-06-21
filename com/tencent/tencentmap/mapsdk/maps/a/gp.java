package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.map.lib.util.MathUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class gp
  implements View.OnTouchListener
{
  private static final float a;
  private boolean b;
  private boolean c;
  private int d;
  private PointF e;
  private PointF f;
  private PointF g;
  private PointF h;
  private PointF i;
  private PointF j;
  private PointF k;
  private long l;
  private GestureDetector m;
  private gq n;
  private fn o;
  private WeakReference<gd> p;

  static
  {
    AppMethodBeat.i(99424);
    a = (float)Math.cos(0.001745329278001762D);
    AppMethodBeat.o(99424);
  }

  public gp(gd paramgd)
  {
    AppMethodBeat.i(99414);
    this.e = new PointF();
    this.f = new PointF();
    this.g = new PointF();
    this.h = new PointF();
    this.i = new PointF();
    this.j = new PointF();
    this.k = new PointF();
    this.l = 0L;
    this.p = new WeakReference(paramgd);
    if (paramgd.i() != null);
    for (this.m = new GestureDetector(paramgd.i(), new gp.a(this, null)); ; this.m = new GestureDetector(new gp.a(this, null)))
    {
      this.n = new gq();
      AppMethodBeat.o(99414);
      return;
    }
  }

  private void a()
  {
    AppMethodBeat.i(99418);
    float f1 = this.e.x - this.g.x;
    float f2 = this.e.y - this.g.y;
    float f3 = this.f.x - this.h.x;
    float f4 = this.f.y - this.h.y;
    double d1;
    if ((this.d == 0) || (this.d == 1))
      if (this.d == 0)
      {
        d1 = 24.0D;
        if (((Math.abs(f1) <= d1) && (Math.abs(f2) <= d1) && (Math.abs(f3) <= d1) && (Math.abs(f4) <= d1)) || (f2 * f4 <= 0.0F) || (Math.abs(f2) <= Math.abs(f1) * 1.2D) || (Math.abs(f4) <= Math.abs(f3) * 1.2D))
          break label281;
        this.d = 1;
        this.g.set(this.e.x, this.e.y);
        this.h.set(this.f.x, this.f.y);
        gq localgq = this.n;
        if (Math.abs(f2) <= Math.abs(f4))
          break label275;
        label254: localgq.a(f2);
        AppMethodBeat.o(99418);
      }
    while (true)
    {
      return;
      d1 = 8.0D;
      break;
      label275: f2 = f4;
      break label254;
      label281: double d2 = this.h.x - this.g.x;
      double d3 = this.h.y - this.g.y;
      double d4 = this.f.x - this.e.x;
      double d5 = this.f.y - this.e.y;
      double d6 = Math.sqrt(d2 * d2 + d3 * d3);
      double d7 = Math.sqrt(d4 * d4 + d5 * d5);
      double d8;
      if (((this.d == 0) || (this.d == 2)) && (d6 * d7 > 0.0D) && (Math.abs((d2 * d4 + d3 * d5) / (d6 * d7)) < a))
      {
        d8 = 180.0D * Math.acos((d2 * d4 + d3 * d5) / (d6 * d7)) / 3.141592653589793D;
        d1 = d8;
        if (d2 * d5 - d3 * d4 < 0.0D)
          d1 = -d8;
        label505: int i1;
        label538: int i2;
        if (this.d == 0)
        {
          d8 = 5.0D;
          if (Math.abs(d1) <= d8)
            break label778;
          this.d = 2;
          if (!b())
            break label674;
          if (this.o != null)
            break label636;
          i1 = 0;
          if (this.o != null)
            break label655;
          i2 = 0;
          label548: this.k.set(i1, i2);
          this.n.a(this.k, this.k, (float)d1);
        }
        while (true)
        {
          this.g.set(this.e.x, this.e.y);
          this.h.set(this.f.x, this.f.y);
          AppMethodBeat.o(99418);
          break;
          d8 = 1.0D;
          break label505;
          label636: i1 = this.o.g().width() / 2;
          break label538;
          label655: i2 = this.o.g().height() / 2;
          break label548;
          label674: this.i.set((this.g.x + this.h.x) / 2.0F, (this.g.y + this.h.y) / 2.0F);
          this.j.set((this.e.x + this.f.x) / 2.0F, (this.e.y + this.f.y) / 2.0F);
          this.n.a(this.i, this.j, (float)d1);
        }
      }
      label778: if (((this.d == 0) || (this.d == 3)) && (d6 > 0.0D))
      {
        d8 = d7 / d6;
        if (this.d == 0);
        for (d1 = 0.05D; ; d1 = 0.025D)
        {
          if (Math.abs(d8 - 1.0D) <= d1)
            break label997;
          this.d = 3;
          this.i.set((this.g.x + this.h.x) / 2.0F, (this.g.y + this.h.y) / 2.0F);
          this.j.set((this.e.x + this.f.x) / 2.0F, (this.e.y + this.f.y) / 2.0F);
          this.n.a(this.i, this.j, d6, d7);
          this.g.set(this.e.x, this.e.y);
          this.h.set(this.f.x, this.f.y);
          AppMethodBeat.o(99418);
          break;
        }
      }
      label997: if ((this.d == 0) || (this.d == 4))
      {
        if (this.d == 0);
        for (d1 = 80.0D; ; d1 = 8.0D)
        {
          if ((Math.abs(f1) <= d1) && (Math.abs(f2) <= d1) && (Math.abs(f3) <= d1) && (Math.abs(f4) <= d1))
            break label1155;
          this.d = 4;
          f1 = (f1 + f3) / 2.0F;
          f2 = (f2 + f4) / 2.0F;
          this.n.d(f1, f2);
          this.g.set(this.e.x, this.e.y);
          this.h.set(this.f.x, this.f.y);
          AppMethodBeat.o(99418);
          break;
        }
      }
      label1155: AppMethodBeat.o(99418);
    }
  }

  private void a(PointF paramPointF1, PointF paramPointF2, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99422);
    try
    {
      float f1 = paramMotionEvent.getX(0);
      float f2 = paramMotionEvent.getX(1);
      float f3 = paramMotionEvent.getY(0);
      float f4 = paramMotionEvent.getY(1);
      paramPointF1.set(f1, f3);
      paramPointF2.set(f2, f4);
      AppMethodBeat.o(99422);
      return;
    }
    catch (Exception paramPointF1)
    {
      while (true)
        AppMethodBeat.o(99422);
    }
  }

  private boolean a(float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    boolean bool = false;
    AppMethodBeat.i(99420);
    int i1;
    int i2;
    label30: float f2;
    if (this.o == null)
    {
      i1 = 0;
      if (this.o != null)
        break label104;
      i2 = 0;
      if (this.o != null)
        break label123;
      f2 = 0.0F;
      label40: if (this.o != null)
        break label144;
      label47: if ((Math.abs(paramFloat1 - i1) >= f2) || (Math.abs(paramFloat2 - i2) >= f1))
        break label164;
      bool = true;
      AppMethodBeat.o(99420);
    }
    while (true)
    {
      return bool;
      i1 = this.o.g().width() / 2;
      break;
      label104: i2 = this.o.g().height() / 2;
      break label30;
      label123: f2 = this.o.g().width() / 3.0F;
      break label40;
      label144: f1 = this.o.g().height() / 3.0F;
      break label47;
      label164: AppMethodBeat.o(99420);
    }
  }

  private boolean b()
  {
    AppMethodBeat.i(99419);
    PointF localPointF = MathUtil.getPoiWith2Line(this.h, this.g, this.f, this.e);
    boolean bool;
    if (localPointF == null)
    {
      bool = false;
      AppMethodBeat.o(99419);
    }
    while (true)
    {
      return bool;
      bool = a(localPointF.x, localPointF.y);
      AppMethodBeat.o(99419);
    }
  }

  private boolean b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99421);
    boolean bool = a(paramFloat1, paramFloat2);
    AppMethodBeat.o(99421);
    return bool;
  }

  private boolean c()
  {
    double d1 = this.g.x - this.h.x;
    double d2 = this.g.y - this.h.y;
    if (d1 * d1 + d2 * d2 > 2500.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void a(fn paramfn)
  {
    this.o = paramfn;
  }

  public void a(gf paramgf)
  {
    AppMethodBeat.i(99415);
    synchronized (this.n)
    {
      this.n.a(paramgf);
      AppMethodBeat.o(99415);
      return;
    }
  }

  public void b(gf paramgf)
  {
    AppMethodBeat.i(99416);
    synchronized (this.n)
    {
      this.n.b(paramgf);
      AppMethodBeat.o(99416);
      return;
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99417);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 4:
    default:
    case 0:
    case 5:
    case 1:
    case 3:
    case 6:
    case 2:
    }
    while (true)
    {
      if (!this.b)
        this.m.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(99417);
      while (true)
      {
        return true;
        this.l = 0L;
        this.b = false;
        this.n.i(paramMotionEvent.getX(), paramMotionEvent.getY());
        break;
        this.l = System.currentTimeMillis();
        this.d = 0;
        this.b = true;
        this.c = false;
        a(this.g, this.h, paramMotionEvent);
        this.n.c();
        AppMethodBeat.o(99417);
        continue;
        long l1 = System.currentTimeMillis() - this.l;
        if ((this.d == 0) && (l1 > 0L) && (l1 < 200L) && (c()))
          this.n.b();
        this.n.j(paramMotionEvent.getX(), paramMotionEvent.getY());
        break;
        if (this.c)
          break;
        this.c = true;
        this.n.d();
        AppMethodBeat.o(99417);
        continue;
        if ((!this.b) || (this.c))
          break label290;
        a(this.e, this.f, paramMotionEvent);
        a();
        AppMethodBeat.o(99417);
      }
      label290: this.n.k(paramMotionEvent.getX(), paramMotionEvent.getY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gp
 * JD-Core Version:    0.6.2
 */