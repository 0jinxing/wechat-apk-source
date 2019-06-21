package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.location.Location;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.jk;
import com.tencent.tencentmap.mapsdk.maps.a.ln;
import com.tencent.tencentmap.mapsdk.maps.a.lq;
import com.tencent.tencentmap.mapsdk.maps.a.ls;

public final class aj
{
  private static int J = 1;
  public static final int a = q.a + 0;
  public static final int b = q.a + 9;
  public static final int c = q.a + 10;

  @Deprecated
  public static final int d = q.a + 11;
  public static final int e = q.a + 13;
  public static final int f = q.a + 12;

  @Deprecated
  public static final int g = b;

  @Deprecated
  public static final int h = e;
  private au A;
  private ci B;
  private bh C;
  private bm D;
  private ax E;
  private boolean F;
  private ap G;
  private am H;
  private ac I;
  private final bi.a K;
  private ar i;
  private jk j;
  private bs k;
  private bq l;
  private bd m;
  private bb n;
  private aw o;
  private av p;
  private cj q;
  private bn r;
  private ay s;
  private bk t;
  private ai u;
  private br v;
  private bp w;
  private bc x;
  private ba y;
  private at z;

  protected aj()
  {
    AppMethodBeat.i(98313);
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = null;
    this.t = null;
    this.u = null;
    this.v = null;
    this.w = null;
    this.x = null;
    this.y = null;
    this.z = null;
    this.A = null;
    this.B = null;
    this.C = null;
    this.F = false;
    this.G = null;
    this.I = null;
    this.K = new aj.1(this);
    this.i = new ar(0, null, null);
    this.G = new ap(this.i, b());
    AppMethodBeat.o(98313);
  }

  protected aj(ac paramac, Context paramContext, ak paramak)
  {
    AppMethodBeat.i(98312);
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = null;
    this.t = null;
    this.u = null;
    this.v = null;
    this.w = null;
    this.x = null;
    this.y = null;
    this.z = null;
    this.A = null;
    this.B = null;
    this.C = null;
    this.F = false;
    this.G = null;
    this.I = null;
    this.K = new aj.1(this);
    ic.b(paramContext);
    ic.a(paramContext);
    this.I = paramac;
    ln.a().a(paramContext);
    lq.a(paramContext);
    this.i = new ar(paramac.getMapViewType(), paramac, paramak);
    this.t = new bk(this.i);
    this.G = new ap(this.i, b());
    this.v = new br(this.i);
    this.o = new aw(this.I, this.t.b());
    this.z = new at(this.o);
    this.m = new bd(this.t.b());
    this.x = new bc(this.m);
    this.n = new bb(this.t.b());
    this.y = new ba(this.n);
    this.l = new bq(this.t.b());
    this.w = new bp(this.l);
    this.C = new bh(this.i.a());
    this.i.a(this.K);
    this.i.a(this.z, paramak);
    this.j = new jk(this.i, paramak);
    this.j.a(this.z, paramak);
    this.j.a();
    ls.a(0, w.a(paramContext));
    AppMethodBeat.o(98312);
  }

  private void A()
  {
    AppMethodBeat.i(98333);
    if (this.q == null)
      this.q = new cj(this.z, this.w, this.v);
    if (this.B == null)
      this.B = new ci(this.q);
    AppMethodBeat.o(98333);
  }

  private void B()
  {
    AppMethodBeat.i(98348);
    if (this.q != null)
    {
      this.q.e();
      this.q = null;
    }
    if (this.o != null)
    {
      this.o.a();
      this.o = null;
    }
    if (this.n != null)
    {
      this.n.a();
      this.n = null;
    }
    if (this.m != null)
    {
      this.m.a();
      this.m = null;
    }
    if (this.l != null)
    {
      this.l.a();
      this.l = null;
    }
    if (this.i != null)
    {
      this.i.d();
      this.i = null;
    }
    if (this.r != null)
    {
      this.r.a();
      this.r = null;
    }
    if (this.p != null)
    {
      this.p.a();
      this.p = null;
    }
    if (this.s != null)
      this.s.a();
    AppMethodBeat.o(98348);
  }

  private void C()
  {
    AppMethodBeat.i(98349);
    if (this.C != null)
    {
      this.C.a();
      this.C = null;
    }
    if (this.B != null)
    {
      this.B.a();
      this.B = null;
    }
    if (this.z != null)
    {
      this.z.a();
      this.z = null;
    }
    if (this.y != null)
    {
      this.y.a();
      this.y = null;
    }
    if (this.x != null)
    {
      this.x.a();
      this.x = null;
    }
    if (this.w != null)
    {
      this.w.a();
      this.w = null;
    }
    if (this.D != null)
    {
      this.D.a();
      this.D = null;
    }
    if (this.A != null)
    {
      this.A.a();
      this.A = null;
    }
    if (this.E != null)
    {
      this.E.a();
      this.E = null;
    }
    if (this.v != null)
    {
      this.v.a();
      this.v = null;
    }
    if (this.u != null)
    {
      this.u.a();
      this.u = null;
    }
    if (this.t != null)
    {
      this.t.a();
      this.t = null;
    }
    AppMethodBeat.o(98349);
  }

  public static int a()
  {
    return J;
  }

  public final cq a(cr paramcr)
  {
    AppMethodBeat.i(98324);
    if ((this.F) || (this.w == null) || (paramcr == null))
    {
      paramcr = null;
      AppMethodBeat.o(98324);
    }
    while (true)
    {
      return paramcr;
      paramcr = this.w.a(paramcr);
      AppMethodBeat.o(98324);
    }
  }

  public final de a(df paramdf)
  {
    AppMethodBeat.i(98325);
    if ((this.F) || (this.z == null) || (paramdf == null))
    {
      paramdf = null;
      AppMethodBeat.o(98325);
    }
    while (true)
    {
      return paramdf;
      paramdf = this.z.a(paramdf, this.z);
      AppMethodBeat.o(98325);
    }
  }

  public final dj a(dk paramdk)
  {
    AppMethodBeat.i(98323);
    if ((this.F) || (this.y == null) || (paramdk == null))
    {
      paramdk = null;
      AppMethodBeat.o(98323);
    }
    while (true)
    {
      return paramdk;
      paramdk = this.y.a(paramdk);
      AppMethodBeat.o(98323);
    }
  }

  public final dl a(dm paramdm)
  {
    AppMethodBeat.i(98322);
    if ((this.F) || (this.x == null) || (paramdm == null))
    {
      paramdm = null;
      AppMethodBeat.o(98322);
    }
    while (true)
    {
      return paramdm;
      paramdm = this.x.a(paramdm);
      AppMethodBeat.o(98322);
    }
  }

  public final String a(db paramdb)
  {
    AppMethodBeat.i(98368);
    if ((this.F) || (this.v == null))
    {
      paramdb = null;
      AppMethodBeat.o(98368);
    }
    while (true)
    {
      return paramdb;
      paramdb = this.v.a(paramdb);
      AppMethodBeat.o(98368);
    }
  }

  public final void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(98355);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98355);
    while (true)
    {
      return;
      this.v.a(paramFloat1, paramFloat2, paramBoolean);
      AppMethodBeat.o(98355);
    }
  }

  @Deprecated
  public final void a(int paramInt)
  {
    AppMethodBeat.i(98327);
    b(paramInt);
    AppMethodBeat.o(98327);
  }

  public final void a(ad paramad)
  {
    AppMethodBeat.i(98317);
    if ((this.F) || (this.v == null) || (this.v.q()))
      AppMethodBeat.o(98317);
    while (true)
    {
      return;
      this.v.a(paramad);
      AppMethodBeat.o(98317);
    }
  }

  public final void a(ad paramad, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(98320);
    if ((this.F) || (this.v == null) || (this.v.q()))
      AppMethodBeat.o(98320);
    while (true)
    {
      return;
      this.v.a(paramad, paramLong, parama);
      AppMethodBeat.o(98320);
    }
  }

  public final void a(ad paramad, aj.a parama)
  {
    AppMethodBeat.i(98319);
    if ((this.F) || (this.v == null) || (this.v.q()))
      AppMethodBeat.o(98319);
    while (true)
    {
      return;
      this.v.a(paramad, 500L, parama);
      AppMethodBeat.o(98319);
    }
  }

  public final void a(aj.b paramb)
  {
    AppMethodBeat.i(98362);
    if ((this.F) || (this.z == null))
      AppMethodBeat.o(98362);
    while (true)
    {
      return;
      this.z.a(paramb);
      AppMethodBeat.o(98362);
    }
  }

  public final void a(aj.c paramc)
  {
    AppMethodBeat.i(98338);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98338);
    while (true)
    {
      return;
      this.v.a(paramc);
      AppMethodBeat.o(98338);
    }
  }

  public final void a(aj.f paramf)
  {
    AppMethodBeat.i(98363);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98363);
    while (true)
    {
      return;
      this.v.a(paramf);
      AppMethodBeat.o(98363);
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(98361);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98361);
    while (true)
    {
      return;
      this.v.a(paramg);
      AppMethodBeat.o(98361);
    }
  }

  public final void a(aj.h paramh)
  {
    AppMethodBeat.i(98339);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98339);
    while (true)
    {
      return;
      this.v.a(paramh);
      AppMethodBeat.o(98339);
    }
  }

  public final void a(aj.i parami)
  {
    AppMethodBeat.i(98341);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98341);
    while (true)
    {
      return;
      this.v.a(parami);
      AppMethodBeat.o(98341);
    }
  }

  public final void a(aj.j paramj)
  {
    AppMethodBeat.i(98340);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98340);
    while (true)
    {
      return;
      this.v.a(paramj);
      AppMethodBeat.o(98340);
    }
  }

  public final void a(aj.k paramk)
  {
    AppMethodBeat.i(98369);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98369);
    while (true)
    {
      return;
      this.v.a(paramk);
      AppMethodBeat.o(98369);
    }
  }

  public final void a(aj.l paraml)
  {
    AppMethodBeat.i(98359);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98359);
    while (true)
    {
      return;
      this.v.a(paraml);
      AppMethodBeat.o(98359);
    }
  }

  public final void a(aj.m paramm)
  {
    AppMethodBeat.i(98360);
    if ((this.F) || (this.z == null))
      AppMethodBeat.o(98360);
    while (true)
    {
      return;
      this.z.a(paramm);
      AppMethodBeat.o(98360);
    }
  }

  public final void a(aj.p paramp)
  {
    AppMethodBeat.i(98351);
    a(paramp, Bitmap.Config.ARGB_8888);
    AppMethodBeat.o(98351);
  }

  public final void a(aj.p paramp, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(98350);
    if (this.v != null)
      this.v.a(paramp, paramConfig);
    AppMethodBeat.o(98350);
  }

  public final void a(da paramda)
  {
    AppMethodBeat.i(98376);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98376);
    while (true)
    {
      return;
      this.v.a(paramda);
      AppMethodBeat.o(98376);
    }
  }

  @Deprecated
  public final void a(dn paramdn)
  {
    AppMethodBeat.i(98352);
    b(paramdn);
    AppMethodBeat.o(98352);
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98372);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98372);
    while (true)
    {
      return;
      this.v.a(paramString1, paramString2);
      AppMethodBeat.o(98372);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(98330);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98330);
    while (true)
    {
      return;
      this.v.a(paramBoolean);
      AppMethodBeat.o(98330);
    }
  }

  final bk b()
  {
    return this.t;
  }

  public final void b(int paramInt)
  {
    AppMethodBeat.i(98328);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98328);
    while (true)
    {
      return;
      this.v.a(paramInt);
      AppMethodBeat.o(98328);
    }
  }

  public final void b(ad paramad)
  {
    AppMethodBeat.i(98318);
    if ((this.F) || (this.v == null) || (this.v.q()))
      AppMethodBeat.o(98318);
    while (true)
    {
      return;
      this.v.a(paramad, 500L, null);
      AppMethodBeat.o(98318);
    }
  }

  public final void b(dn paramdn)
  {
    AppMethodBeat.i(98353);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98353);
    while (true)
    {
      return;
      this.v.a(paramdn);
      AppMethodBeat.o(98353);
    }
  }

  public final void b(boolean paramBoolean)
  {
    AppMethodBeat.i(98331);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98331);
    while (true)
    {
      return;
      this.v.b(paramBoolean);
      AppMethodBeat.o(98331);
    }
  }

  public final ar c()
  {
    return this.i;
  }

  public final void c(int paramInt)
  {
    AppMethodBeat.i(98365);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98365);
    while (true)
    {
      return;
      this.v.b(paramInt);
      AppMethodBeat.o(98365);
    }
  }

  public final void c(dn paramdn)
  {
    AppMethodBeat.i(98354);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98354);
    while (true)
    {
      return;
      this.v.b(paramdn);
      AppMethodBeat.o(98354);
    }
  }

  public final void c(boolean paramBoolean)
  {
    AppMethodBeat.i(98334);
    if (this.F)
      AppMethodBeat.o(98334);
    while (true)
    {
      return;
      A();
      if (!paramBoolean)
      {
        this.B.d();
        AppMethodBeat.o(98334);
      }
      else if (j() == true)
      {
        AppMethodBeat.o(98334);
      }
      else
      {
        this.B.c();
        AppMethodBeat.o(98334);
      }
    }
  }

  public final cp d()
  {
    AppMethodBeat.i(98314);
    cp localcp;
    if ((this.F) || (this.v == null))
    {
      localcp = null;
      AppMethodBeat.o(98314);
    }
    while (true)
    {
      return localcp;
      localcp = this.v.b();
      AppMethodBeat.o(98314);
    }
  }

  protected final void d(boolean paramBoolean)
  {
    AppMethodBeat.i(98357);
    if ((this.F) || (this.i == null))
      AppMethodBeat.o(98357);
    while (true)
    {
      return;
      this.i.c(paramBoolean);
      AppMethodBeat.o(98357);
    }
  }

  public final float e()
  {
    AppMethodBeat.i(98315);
    float f1;
    if ((this.F) || (this.v == null))
    {
      f1 = 0.0F;
      AppMethodBeat.o(98315);
    }
    while (true)
    {
      return f1;
      f1 = this.v.c();
      AppMethodBeat.o(98315);
    }
  }

  public final void e(boolean paramBoolean)
  {
    AppMethodBeat.i(98358);
    if ((this.F) || (this.i == null))
      AppMethodBeat.o(98358);
    while (true)
    {
      return;
      this.i.a(paramBoolean, false);
      AppMethodBeat.o(98358);
    }
  }

  public final float f()
  {
    AppMethodBeat.i(98316);
    float f1;
    if ((this.F) || (this.v == null))
    {
      f1 = 0.0F;
      AppMethodBeat.o(98316);
    }
    while (true)
    {
      return f1;
      f1 = this.v.d();
      AppMethodBeat.o(98316);
    }
  }

  public final void f(boolean paramBoolean)
  {
    AppMethodBeat.i(98364);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98364);
    while (true)
    {
      return;
      this.v.c(paramBoolean);
      AppMethodBeat.o(98364);
    }
  }

  public final void g()
  {
    AppMethodBeat.i(98321);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98321);
    while (true)
    {
      return;
      this.v.e();
      AppMethodBeat.o(98321);
    }
  }

  public final void g(boolean paramBoolean)
  {
    AppMethodBeat.i(98370);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98370);
    while (true)
    {
      return;
      this.v.d(paramBoolean);
      AppMethodBeat.o(98370);
    }
  }

  public final void h()
  {
    AppMethodBeat.i(98326);
    if (this.x != null)
      this.x.b();
    if (this.y != null)
      this.y.b();
    if (this.w != null)
      this.w.b();
    if (this.z != null)
      this.z.b();
    if (this.D != null)
      this.D.b();
    AppMethodBeat.o(98326);
  }

  public final void h(boolean paramBoolean)
  {
    AppMethodBeat.i(98373);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98373);
    while (true)
    {
      return;
      this.v.e(paramBoolean);
      AppMethodBeat.o(98373);
    }
  }

  public final boolean i()
  {
    AppMethodBeat.i(98329);
    boolean bool;
    if ((this.F) || (this.v == null))
    {
      bool = false;
      AppMethodBeat.o(98329);
    }
    while (true)
    {
      return bool;
      bool = this.v.f();
      AppMethodBeat.o(98329);
    }
  }

  public final boolean j()
  {
    AppMethodBeat.i(98332);
    boolean bool;
    if (this.F)
    {
      bool = false;
      AppMethodBeat.o(98332);
    }
    while (true)
    {
      return bool;
      A();
      bool = this.B.e();
      AppMethodBeat.o(98332);
    }
  }

  public final Location k()
  {
    AppMethodBeat.i(98335);
    Location localLocation;
    if (this.F)
    {
      localLocation = null;
      AppMethodBeat.o(98335);
    }
    while (true)
    {
      return localLocation;
      A();
      localLocation = this.B.b();
      AppMethodBeat.o(98335);
    }
  }

  public final am l()
  {
    AppMethodBeat.i(98336);
    am localam;
    if (this.F)
    {
      localam = null;
      AppMethodBeat.o(98336);
    }
    while (true)
    {
      return localam;
      if (this.H == null)
        this.H = new am(this.C);
      localam = this.H;
      AppMethodBeat.o(98336);
    }
  }

  public final ai m()
  {
    AppMethodBeat.i(98337);
    ai localai;
    if ((this.F) || (this.i == null))
    {
      localai = null;
      AppMethodBeat.o(98337);
    }
    while (true)
    {
      return localai;
      if (this.u == null)
        this.u = new ai(this.i);
      localai = this.u;
      AppMethodBeat.o(98337);
    }
  }

  final void n()
  {
    AppMethodBeat.i(98342);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98342);
    while (true)
    {
      return;
      this.v.g();
      AppMethodBeat.o(98342);
    }
  }

  final void o()
  {
    AppMethodBeat.i(98343);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98343);
    while (true)
    {
      return;
      this.v.h();
      AppMethodBeat.o(98343);
    }
  }

  final void p()
  {
    AppMethodBeat.i(98344);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98344);
    while (true)
    {
      return;
      this.v.i();
      AppMethodBeat.o(98344);
    }
  }

  final void q()
  {
    AppMethodBeat.i(98345);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98345);
    while (true)
    {
      return;
      this.v.j();
      AppMethodBeat.o(98345);
    }
  }

  final void r()
  {
    AppMethodBeat.i(98346);
    if ((this.F) || (this.v == null))
      AppMethodBeat.o(98346);
    while (true)
    {
      return;
      this.v.k();
      AppMethodBeat.o(98346);
    }
  }

  final void s()
  {
    AppMethodBeat.i(98347);
    if (this.F)
      AppMethodBeat.o(98347);
    while (true)
    {
      return;
      if (this.v != null)
        this.v.l();
      if (this.j != null)
        this.j.b();
      C();
      B();
      this.F = true;
      AppMethodBeat.o(98347);
    }
  }

  public final String t()
  {
    AppMethodBeat.i(98356);
    String str;
    if ((this.F) || (this.v == null))
    {
      str = "";
      AppMethodBeat.o(98356);
    }
    while (true)
    {
      return str;
      str = this.v.m();
      AppMethodBeat.o(98356);
    }
  }

  public final int u()
  {
    AppMethodBeat.i(98366);
    int i1;
    if ((this.F) || (this.v == null))
    {
      i1 = -1;
      AppMethodBeat.o(98366);
    }
    while (true)
    {
      return i1;
      i1 = this.v.n();
      AppMethodBeat.o(98366);
    }
  }

  public final String[] v()
  {
    AppMethodBeat.i(98367);
    String[] arrayOfString;
    if ((this.F) || (this.v == null))
    {
      arrayOfString = null;
      AppMethodBeat.o(98367);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = this.v.o();
      AppMethodBeat.o(98367);
    }
  }

  public final boolean w()
  {
    AppMethodBeat.i(98371);
    boolean bool;
    if ((this.F) || (this.v == null))
    {
      bool = false;
      AppMethodBeat.o(98371);
    }
    while (true)
    {
      return bool;
      bool = this.v.p();
      AppMethodBeat.o(98371);
    }
  }

  public final int x()
  {
    AppMethodBeat.i(98374);
    int i1;
    if (this.I == null)
    {
      i1 = 0;
      AppMethodBeat.o(98374);
    }
    while (true)
    {
      return i1;
      i1 = this.I.getWidth();
      AppMethodBeat.o(98374);
    }
  }

  public final int y()
  {
    AppMethodBeat.i(98375);
    int i1;
    if (this.I == null)
    {
      i1 = 0;
      AppMethodBeat.o(98375);
    }
    while (true)
    {
      return i1;
      i1 = this.I.getHeight();
      AppMethodBeat.o(98375);
    }
  }

  public final String z()
  {
    AppMethodBeat.i(98377);
    String str;
    if ((this.F) || (this.v == null))
    {
      str = null;
      AppMethodBeat.o(98377);
    }
    while (true)
    {
      return str;
      str = this.v.r();
      AppMethodBeat.o(98377);
    }
  }

  public static abstract interface g
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

    public abstract void a(de paramde);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aj
 * JD-Core Version:    0.6.2
 */