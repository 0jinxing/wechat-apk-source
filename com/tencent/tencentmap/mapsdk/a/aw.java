package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.hw;
import com.tencent.tencentmap.mapsdk.maps.a.hx;
import com.tencent.tencentmap.mapsdk.maps.a.hz;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import java.util.ArrayList;
import java.util.List;

public class aw extends by
  implements cb
{
  private iz a;
  private at b;
  private ac c;
  private View d;
  private View e;
  private View f;
  private View g;
  private ViewGroup h;
  private LinearLayout i;
  private boolean j;
  private final int k;
  private final int l;
  private an m;
  private aj.m n;
  private aj.b o;
  private Handler p;
  private aw.a q;
  private an.a r;

  public aw(ac paramac, gg paramgg)
  {
    AppMethodBeat.i(100693);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = false;
    this.k = 1;
    this.l = 2;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = new aw.1(this);
    this.q = new aw.2(this);
    this.r = new aw.3(this);
    this.a = ((iz)paramgg.getVectorMapDelegate());
    this.c = paramac;
    if (this.a == null)
      AppMethodBeat.o(100693);
    while (true)
    {
      return;
      this.a.n = this.q;
      if (this.a.a(hx.class) == null)
        this.a.a(hx.class, this);
      AppMethodBeat.o(100693);
    }
  }

  private void a(b paramb)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(100710);
    if (paramb == null)
      AppMethodBeat.o(100710);
    while (true)
    {
      return;
      if (this.a == null)
      {
        AppMethodBeat.o(100710);
      }
      else
      {
        String str = paramb.a;
        hx localhx = paramb.d;
        boolean bool3 = paramb.c;
        if (localhx == null);
        for (paramb = null; ; paramb = localhx.y)
        {
          if (paramb != null)
            break label90;
          this.a.a("", true);
          AppMethodBeat.o(100710);
          break;
        }
        label90: if ((this.a.s != null) && (bool3 == true) && (this.a.s.a(paramb)))
        {
          AppMethodBeat.o(100710);
        }
        else if (!paramb.d())
        {
          AppMethodBeat.o(100710);
        }
        else if ((this.a.W != null) && (!this.a.V))
        {
          if (this.a.W == localhx.z)
          {
            bool1 = this.a.W.j();
            if (localhx.h())
              localhx.a(bool3, true);
            if (bool3)
            {
              paramb = this.a.W;
              if (!bool1);
              for (bool1 = bool2; ; bool1 = false)
              {
                paramb.d(bool1);
                AppMethodBeat.o(100710);
                break;
              }
            }
            this.a.W.d(true);
            AppMethodBeat.o(100710);
          }
          else
          {
            this.a.W.d(false);
          }
        }
        else
        {
          if (localhx.z != null)
          {
            bool2 = localhx.z.j();
            if (bool3)
            {
              paramb = localhx.z;
              if (!bool2)
                bool1 = true;
              paramb.d(bool1);
              if (!bool2)
                this.a.W = localhx.z;
            }
          }
          a(localhx, bool3, bool3);
          this.a.a(str, true);
          AppMethodBeat.o(100710);
        }
      }
    }
  }

  private void a(hx paramhx, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(100711);
    if (this.o == null)
      paramhx.v();
    while (true)
    {
      paramhx.a(paramBoolean1, paramBoolean2);
      AppMethodBeat.o(100711);
      return;
      paramhx.a(this.c, this.o);
    }
  }

  private void i(String paramString)
  {
    AppMethodBeat.i(100705);
    paramString = k(paramString);
    if ((paramString == null) || (!paramString.y.d()))
      AppMethodBeat.o(100705);
    while (true)
    {
      return;
      a(paramString, true, false);
      AppMethodBeat.o(100705);
    }
  }

  private de j(String paramString)
  {
    AppMethodBeat.i(100708);
    if ((paramString == null) || (paramString.equals("")) || (this.a == null))
    {
      AppMethodBeat.o(100708);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100708);
          paramString = null;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100708);
          paramString = null;
          continue;
        }
        paramString = ((hx)paramString).y;
        AppMethodBeat.o(100708);
      }
    }
  }

  private hx k(String paramString)
  {
    AppMethodBeat.i(100723);
    paramString = this.a.b(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(100723);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (!(paramString instanceof hx))
      {
        AppMethodBeat.o(100723);
        paramString = null;
      }
      else
      {
        paramString = (hx)paramString;
        AppMethodBeat.o(100723);
      }
    }
  }

  de a(df paramdf, at paramat)
  {
    AppMethodBeat.i(100695);
    if (this.a == null)
    {
      paramdf = null;
      AppMethodBeat.o(100695);
    }
    while (true)
    {
      return paramdf;
      if (this.b == null)
        this.b = paramat;
      hx localhx = new hx(this.a);
      localhx.a(paramdf);
      this.a.a(localhx);
      if (this.a.a(hx.class) == null)
        this.a.a(hx.class, this);
      this.a.b().a();
      paramdf = new de(paramdf, paramat, localhx.A());
      localhx.y = paramdf;
      this.a.a(localhx);
      AppMethodBeat.o(100695);
    }
  }

  public void a()
  {
    AppMethodBeat.i(100694);
    if (this.a == null)
      AppMethodBeat.o(100694);
    while (true)
    {
      return;
      this.j = true;
      if (this.p != null)
        this.p.removeCallbacksAndMessages(null);
      this.a.b(hx.class);
      this.a = null;
      if (this.n != null)
        this.n = null;
      if (this.o != null)
        this.o = null;
      if (this.d != null)
        this.d = null;
      if (this.h != null)
      {
        this.h.removeAllViews();
        this.h = null;
      }
      if (this.i != null)
        this.i = null;
      if (this.b != null)
        this.b = null;
      if (this.c != null)
        this.c = null;
      if (this.d != null)
      {
        ViewGroup localViewGroup = (ViewGroup)this.d;
        if (localViewGroup != null)
          localViewGroup.removeAllViews();
        this.d.setBackgroundDrawable(null);
        this.d = null;
      }
      AppMethodBeat.o(100694);
    }
  }

  void a(aj.b paramb)
  {
    this.o = paramb;
  }

  void a(aj.m paramm)
  {
    this.n = paramm;
  }

  void a(String paramString)
  {
    AppMethodBeat.i(100696);
    if (this.a == null)
      AppMethodBeat.o(100696);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        hz localhz = this.a.b(paramString, false);
        if ((localhz == null) || (!(localhz instanceof hx)))
        {
          AppMethodBeat.o(100696);
          continue;
        }
        localhz.d();
        if (paramString.equals(this.a.r()))
          this.a.a("", false);
        this.a.b().a();
        AppMethodBeat.o(100696);
      }
    }
  }

  void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100713);
    if (this.a == null)
      AppMethodBeat.o(100713);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100713);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100713);
          continue;
        }
        ((hx)paramString).a(paramFloat);
        this.a.b().a();
        AppMethodBeat.o(100713);
      }
    }
  }

  void a(String paramString, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100697);
    if (this.a == null)
      AppMethodBeat.o(100697);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100697);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100697);
          continue;
        }
        ((hx)paramString).b(paramFloat1, paramFloat2);
        this.a.b().a();
        AppMethodBeat.o(100697);
      }
    }
  }

  void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100722);
    if (this.a == null)
      AppMethodBeat.o(100722);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100722);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100722);
          continue;
        }
        ((hx)paramString).a_(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100722);
      }
    }
  }

  void a(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100719);
    if (this.a == null)
      AppMethodBeat.o(100719);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100719);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100719);
          continue;
        }
        ((hx)paramString).a(paramInt1, paramInt2);
        AppMethodBeat.o(100719);
      }
    }
  }

  void a(String paramString, cm paramcm)
  {
    AppMethodBeat.i(100699);
    if (this.a == null)
      AppMethodBeat.o(100699);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        hx localhx = k(paramString);
        if (localhx != null)
          localhx.a(paramcm);
        i(paramString);
        this.a.b().a();
        AppMethodBeat.o(100699);
      }
    }
  }

  void a(String paramString, db paramdb)
  {
    AppMethodBeat.i(100700);
    if (this.a == null)
      AppMethodBeat.o(100700);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        Object localObject = this.a.b(paramString);
        if (localObject == null)
        {
          AppMethodBeat.o(100700);
          continue;
        }
        if (!(localObject instanceof hx))
        {
          AppMethodBeat.o(100700);
          continue;
        }
        localObject = (hx)localObject;
        ((hx)localObject).a(ic.a(paramdb));
        if ((paramString.equals(this.a.r())) && (((hx)localObject).z != null))
        {
          paramString = ic.a(paramdb);
          ((hx)localObject).z.b(paramString);
        }
        this.a.b().a();
        AppMethodBeat.o(100700);
      }
    }
  }

  void a(String paramString1, String arg2)
  {
    AppMethodBeat.i(100701);
    if (this.a == null)
      AppMethodBeat.o(100701);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        this.a.a("", true, true);
        i(paramString1);
        AppMethodBeat.o(100701);
      }
    }
  }

  void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100698);
    if (this.a == null)
      AppMethodBeat.o(100698);
    while (true)
    {
      return;
      this.a.b().a();
      AppMethodBeat.o(100698);
    }
  }

  public boolean a(hz paramhz, boolean paramBoolean, GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(100709);
    paramGeoPoint = (hx)paramhz;
    paramhz = new b(null);
    paramhz.a = paramGeoPoint.A();
    paramhz.b = paramGeoPoint.g();
    paramhz.d = paramGeoPoint;
    paramhz.c = paramBoolean;
    if (this.p != null)
    {
      this.p.removeCallbacksAndMessages(paramhz);
      paramGeoPoint = this.p.obtainMessage();
      paramGeoPoint.obj = paramhz;
      this.p.sendMessage(paramGeoPoint);
    }
    AppMethodBeat.o(100709);
    return true;
  }

  void b()
  {
    AppMethodBeat.i(100712);
    if (this.a == null)
      AppMethodBeat.o(100712);
    while (true)
    {
      return;
      this.a.c(hx.class);
      this.a.a("", false);
      this.q.a();
      AppMethodBeat.o(100712);
    }
  }

  void b(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100714);
    if (this.a == null)
      AppMethodBeat.o(100714);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100714);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100714);
          continue;
        }
        ((hx)paramString).b(paramFloat);
        this.a.b().a();
        AppMethodBeat.o(100714);
      }
    }
  }

  void b(String paramString1, String arg2)
  {
    AppMethodBeat.i(100702);
    if (this.a == null)
      AppMethodBeat.o(100702);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        i(paramString1);
        AppMethodBeat.o(100702);
      }
    }
  }

  void b(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100703);
    if (this.a == null)
      AppMethodBeat.o(100703);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100703);
          continue;
        }
        paramString.a(paramBoolean);
        this.a.b().a();
        AppMethodBeat.o(100703);
      }
    }
  }

  boolean b(String paramString)
  {
    AppMethodBeat.i(100704);
    boolean bool;
    if (this.a == null)
    {
      AppMethodBeat.o(100704);
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100704);
          bool = false;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100704);
          bool = false;
          continue;
        }
        paramString = (hx)paramString;
        if (!paramString.y.d())
        {
          AppMethodBeat.o(100704);
          bool = false;
          continue;
        }
        a(paramString, false, null);
        this.a.b().a();
        bool = true;
        AppMethodBeat.o(100704);
      }
    }
  }

  void c(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100720);
    if (this.a == null)
      AppMethodBeat.o(100720);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString, false);
        if (paramString == null)
        {
          AppMethodBeat.o(100720);
          continue;
        }
        paramString.c(paramFloat);
        this.a.a(paramString);
        this.a.b().a();
        AppMethodBeat.o(100720);
      }
    }
  }

  void c(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100717);
    if (this.a == null)
      AppMethodBeat.o(100717);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100717);
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100717);
          continue;
        }
        paramString = (hx)paramString;
        paramString.c(paramBoolean);
        if (!paramBoolean)
          paramString.a(paramString.g());
        AppMethodBeat.o(100717);
      }
    }
  }

  boolean c(String paramString)
  {
    AppMethodBeat.i(100706);
    boolean bool;
    if (this.a == null)
    {
      AppMethodBeat.o(100706);
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100706);
          bool = false;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100706);
          bool = false;
          continue;
        }
        ((hx)paramString).u();
        bool = true;
        AppMethodBeat.o(100706);
      }
    }
  }

  boolean d(String paramString)
  {
    AppMethodBeat.i(100707);
    boolean bool;
    if (this.a == null)
    {
      AppMethodBeat.o(100707);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = this.a.b(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(100707);
        bool = false;
      }
      else if (!(paramString instanceof hx))
      {
        AppMethodBeat.o(100707);
        bool = false;
      }
      else
      {
        paramString = (hx)paramString;
        if ((paramString.z != null) && (paramString.z.j()))
        {
          bool = true;
          AppMethodBeat.o(100707);
        }
        else
        {
          AppMethodBeat.o(100707);
          bool = false;
        }
      }
    }
  }

  float e(String paramString)
  {
    AppMethodBeat.i(100715);
    float f1;
    if (this.a == null)
    {
      AppMethodBeat.o(100715);
      f1 = 0.0F;
    }
    while (true)
    {
      return f1;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100715);
          f1 = 0.0F;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100715);
          f1 = 0.0F;
          continue;
        }
        f1 = ((hx)paramString).n();
        AppMethodBeat.o(100715);
      }
    }
  }

  db f(String paramString)
  {
    AppMethodBeat.i(100716);
    if (this.a == null)
    {
      AppMethodBeat.o(100716);
      paramString = null;
      return paramString;
    }
    while (true)
    {
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100716);
          paramString = null;
          break;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100716);
          paramString = null;
          break;
        }
        paramString = ((hx)paramString).g();
        if (paramString != null)
        {
          paramString = ic.a(paramString);
          AppMethodBeat.o(100716);
        }
      }
      paramString = null;
    }
  }

  boolean g(String paramString)
  {
    AppMethodBeat.i(100718);
    boolean bool;
    if (this.a == null)
    {
      AppMethodBeat.o(100718);
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100718);
          bool = false;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100718);
          bool = false;
          continue;
        }
        bool = ((hx)paramString).o();
        AppMethodBeat.o(100718);
      }
    }
  }

  List<j> h(String paramString)
  {
    AppMethodBeat.i(100721);
    if (this.a == null)
    {
      AppMethodBeat.o(100721);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100721);
          paramString = null;
          continue;
        }
        if (!(paramString instanceof hx))
        {
          AppMethodBeat.o(100721);
          paramString = null;
          continue;
        }
        hx localhx = (hx)paramString;
        paramString = new ArrayList(2);
        paramString.add(localhx.t());
        ??? = localhx.z;
        if ((??? != null) && (((hw)???).j()))
          paramString.add(localhx.z.k());
        AppMethodBeat.o(100721);
      }
    }
  }

  static class b
  {
    String a = "";
    GeoPoint b = null;
    boolean c = false;
    hx d = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aw
 * JD-Core Version:    0.6.2
 */