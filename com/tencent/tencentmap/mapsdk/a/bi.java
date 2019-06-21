package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import com.tencent.tencentmap.mapsdk.maps.a.jk.a;
import com.tencent.tencentmap.mapsdk.maps.a.ld;
import com.tencent.tencentmap.mapsdk.maps.a.le;
import com.tencent.tencentmap.mapsdk.maps.a.le.a;
import com.tencent.tencentmap.mapsdk.maps.a.le.b;
import com.tencent.tencentmap.mapsdk.maps.a.lf;
import com.tencent.tencentmap.mapsdk.maps.a.lh;
import com.tencent.tencentmap.mapsdk.maps.a.lh.a;
import com.tencent.tencentmap.mapsdk.maps.a.li;
import com.tencent.tencentmap.mapsdk.maps.a.li.a;
import com.tencent.tencentmap.mapsdk.maps.a.lj;
import com.tencent.tencentmap.mapsdk.maps.a.lq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bi extends cf
  implements as, li.a
{
  public Handler a;
  private ac b;
  private ak c;
  private iz d;
  private lj e;
  private lh f;
  private lf g;
  private ld h;
  private jk.a i;
  private int j;
  private List<le> k;
  private boolean l;

  public bi(ac paramac, gg paramgg)
  {
    AppMethodBeat.i(100809);
    this.b = null;
    this.k = new ArrayList();
    this.l = false;
    this.a = new Handler(Looper.getMainLooper())
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(100807);
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.obj != null))
        {
          paramAnonymousMessage = (li)paramAnonymousMessage.obj;
          if (paramAnonymousMessage.a == 0)
          {
            if (bi.a(bi.this) == null)
              break label243;
            bi.a(bi.this).a(paramAnonymousMessage.b, paramAnonymousMessage.c);
            AppMethodBeat.o(100807);
          }
        }
        while (true)
        {
          return;
          if (paramAnonymousMessage.a == 1)
          {
            if (bi.b(bi.this) != null)
            {
              bi.b(bi.this).a(paramAnonymousMessage.d, paramAnonymousMessage.e);
              bi.b(bi.this).g();
              AppMethodBeat.o(100807);
            }
          }
          else if ((paramAnonymousMessage.a == 3) && (ic.e == 1))
          {
            if (TextUtils.equals("wechat", "wechat"))
            {
              AppMethodBeat.o(100807);
            }
            else if (bi.c(bi.this) == null)
            {
              AppMethodBeat.o(100807);
            }
            else
            {
              if (bi.d(bi.this) == null)
              {
                bi.a(bi.this, new ld(bi.c(bi.this).getContext().getApplicationContext()));
                bi.d(bi.this).a(bi.e(bi.this));
              }
              bi.d(bi.this).a(bi.c(bi.this));
            }
          }
          else
            label243: AppMethodBeat.o(100807);
        }
      }
    };
    this.b = paramac;
    if (paramgg == null)
      AppMethodBeat.o(100809);
    while (true)
    {
      return;
      this.d = ((iz)paramgg.getVectorMapDelegate());
      this.c = this.d.P();
      if ((paramgg instanceof View))
      {
        paramgg = (View)paramgg;
        if (this.b.indexOfChild(paramgg) < 0)
        {
          paramac = new FrameLayout.LayoutParams(-1, -1);
          this.b.addView(paramgg, 0, paramac);
          this.b.requestLayout();
        }
      }
      int m = 4;
      int n = 20;
      if (this.d.b() != null)
      {
        m = this.d.b().b();
        n = this.d.b().c();
      }
      this.f = new lh(this.b.getContext().getApplicationContext(), m, n);
      this.d.a(this.f);
      this.g = new lf(this.b.getContext(), this.b);
      this.d.a(this.g);
      this.e = new lj(this.b.getContext(), this.d);
      this.k.add(this.f);
      this.k.add(this.e);
      this.d.a(this);
      this.d.a(this);
      b(0, 0);
      AppMethodBeat.o(100809);
    }
  }

  public void a()
  {
    AppMethodBeat.i(100810);
    if ((this.b == null) || (this.d == null))
      AppMethodBeat.o(100810);
    while (true)
    {
      return;
      if (this.a != null)
        this.a.removeCallbacksAndMessages(null);
      this.b.removeAllViews();
      this.d.a(null);
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
        ((le)localIterator.next()).a();
      this.e = null;
      this.e = null;
      this.k.clear();
      this.k = null;
      this.d = null;
      this.b = null;
      AppMethodBeat.o(100810);
    }
  }

  void a(float paramFloat)
  {
    AppMethodBeat.i(100835);
    if (this.f != null)
      this.f.a(paramFloat);
    AppMethodBeat.o(100835);
  }

  void a(int paramInt)
  {
    AppMethodBeat.i(100827);
    if (this.f != null)
    {
      this.f.a(le.b.a(paramInt));
      f();
    }
    AppMethodBeat.o(100827);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100823);
    this.j = paramInt2;
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      le localle = (le)localIterator.next();
      localle.a(paramInt1, paramInt2);
      localle.a(this.b);
    }
    AppMethodBeat.o(100823);
  }

  void a(int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(100828);
    if (this.f != null)
    {
      le.b localb = le.b.a(paramInt);
      this.f.a(localb);
      switch (2.a[localb.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      this.f.d();
      f();
      AppMethodBeat.o(100828);
      return;
      this.f.a(le.a.d, paramArrayOfInt[0]);
      this.f.a(le.a.a, paramArrayOfInt[1]);
      continue;
      this.f.a(le.a.c, paramArrayOfInt[0]);
      this.f.a(le.a.a, paramArrayOfInt[1]);
      continue;
      this.f.a(le.a.c, paramArrayOfInt[0]);
      this.f.a(le.a.b, paramArrayOfInt[1]);
      continue;
      this.f.a(le.a.d, paramArrayOfInt[0]);
      this.f.a(le.a.b, paramArrayOfInt[1]);
    }
  }

  public void a(bi.a parama)
  {
    AppMethodBeat.i(100811);
    if (this.e != null)
      this.e.a(parama);
    AppMethodBeat.o(100811);
  }

  public void a(jk.a parama, ak paramak)
  {
    AppMethodBeat.i(100837);
    if ((paramak != null) && (paramak.d() != null))
    {
      this.i = parama;
      int m = paramak.e();
      int n = paramak.f();
      this.b.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
      a(m, n);
    }
    AppMethodBeat.o(100837);
  }

  public void a(lh.a parama, ak paramak)
  {
    AppMethodBeat.i(100836);
    if ((paramak != null) && (paramak.d() != null) && (this.f != null) && (paramak != null))
    {
      this.f.a(parama);
      int m = paramak.e();
      int n = paramak.f();
      this.b.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
      a(m, n);
    }
    AppMethodBeat.o(100836);
  }

  public void a(li paramli)
  {
    AppMethodBeat.i(100831);
    if ((paramli != null) && (paramli.a != -1))
    {
      paramli = this.a.obtainMessage(paramli.a, paramli);
      this.a.sendMessage(paramli);
    }
    AppMethodBeat.o(100831);
  }

  void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100812);
    this.e.a(paramBoolean);
    AppMethodBeat.o(100812);
  }

  void b(int paramInt)
  {
    AppMethodBeat.i(100829);
    if (this.f != null)
    {
      this.f.b(le.b.a(paramInt));
      f();
    }
    AppMethodBeat.o(100829);
  }

  void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100832);
    if (this.d != null)
      this.d.b(paramInt1, paramInt2);
    AppMethodBeat.o(100832);
  }

  void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100813);
    this.d.h(paramBoolean);
    AppMethodBeat.o(100813);
  }

  boolean b()
  {
    AppMethodBeat.i(100819);
    boolean bool = this.d.v();
    AppMethodBeat.o(100819);
    return bool;
  }

  void c(boolean paramBoolean)
  {
    AppMethodBeat.i(100814);
    this.d.b(paramBoolean);
    AppMethodBeat.o(100814);
  }

  boolean c()
  {
    AppMethodBeat.i(100820);
    boolean bool = this.d.y();
    AppMethodBeat.o(100820);
    return bool;
  }

  void d(boolean paramBoolean)
  {
    AppMethodBeat.i(100815);
    this.d.d(paramBoolean);
    AppMethodBeat.o(100815);
  }

  boolean d()
  {
    AppMethodBeat.i(100821);
    boolean bool = this.d.z();
    AppMethodBeat.o(100821);
    return bool;
  }

  void e(boolean paramBoolean)
  {
    AppMethodBeat.i(100816);
    this.d.e(paramBoolean);
    AppMethodBeat.o(100816);
  }

  public boolean e()
  {
    AppMethodBeat.i(100822);
    boolean bool;
    if (this.g != null)
    {
      bool = this.g.b();
      AppMethodBeat.o(100822);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100822);
    }
  }

  protected void f()
  {
    AppMethodBeat.i(100824);
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
      ((le)localIterator.next()).a(this.b);
    AppMethodBeat.o(100824);
  }

  void f(boolean paramBoolean)
  {
    AppMethodBeat.i(100817);
    this.d.f(paramBoolean);
    AppMethodBeat.o(100817);
  }

  void g(boolean paramBoolean)
  {
    AppMethodBeat.i(100818);
    this.d.g(paramBoolean);
    c(paramBoolean);
    d(paramBoolean);
    e(paramBoolean);
    f(paramBoolean);
    AppMethodBeat.o(100818);
  }

  boolean g()
  {
    AppMethodBeat.i(100826);
    boolean bool;
    if (this.f != null)
    {
      bool = this.f.f();
      AppMethodBeat.o(100826);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100826);
    }
  }

  void h(boolean paramBoolean)
  {
    AppMethodBeat.i(100825);
    if (this.f != null)
      this.f.b(paramBoolean);
    AppMethodBeat.o(100825);
  }

  public void i(boolean paramBoolean)
  {
    AppMethodBeat.i(100830);
    if ((this.f == null) || (this.d == null) || (this.d.b() == null))
      AppMethodBeat.o(100830);
    while (true)
    {
      return;
      if (paramBoolean)
        this.f.b();
      this.f.a(lq.g());
      this.f.a(this.d.Q(), this.d.b().e());
      AppMethodBeat.o(100830);
    }
  }

  void j(boolean paramBoolean)
  {
    AppMethodBeat.i(100833);
    if ((this.d != null) && (this.d.b() != null))
      this.d.b().j(paramBoolean);
    AppMethodBeat.o(100833);
  }

  public void k(boolean paramBoolean)
  {
    AppMethodBeat.i(100834);
    this.g.a(paramBoolean);
    AppMethodBeat.o(100834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bi
 * JD-Core Version:    0.6.2
 */