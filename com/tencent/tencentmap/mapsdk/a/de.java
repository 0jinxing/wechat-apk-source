package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class de
  implements cv
{
  private int a;
  private boolean b;
  private df c;
  private String d;
  private boolean e;
  private at f;
  private boolean g;
  private int h;
  private boolean i;
  private aj.m j;
  private Object k;

  public de(df paramdf, at paramat, String paramString)
  {
    AppMethodBeat.i(100998);
    this.a = -1;
    this.b = false;
    this.c = null;
    this.d = "";
    this.e = false;
    this.f = null;
    this.g = false;
    this.h = 0;
    this.i = false;
    this.d = paramString;
    this.c = paramdf;
    this.f = paramat;
    this.i = paramdf.q();
    this.h = paramdf.p();
    this.k = this.c.u();
    AppMethodBeat.o(100998);
  }

  public final int a(Context paramContext)
  {
    int m = 0;
    AppMethodBeat.i(101025);
    cm localcm = this.c.e();
    if (localcm == null)
      AppMethodBeat.o(101025);
    while (true)
    {
      return m;
      paramContext = localcm.a().a(paramContext);
      if (paramContext == null)
      {
        AppMethodBeat.o(101025);
      }
      else
      {
        m = paramContext.getWidth();
        AppMethodBeat.o(101025);
      }
    }
  }

  public final List<j> a()
  {
    AppMethodBeat.i(101030);
    List localList = this.f.h(this.d);
    AppMethodBeat.o(101030);
    return localList;
  }

  public final void a(float paramFloat)
  {
    AppMethodBeat.i(101016);
    if (this.f == null)
      AppMethodBeat.o(101016);
    while (true)
    {
      return;
      this.f.a(this.d, paramFloat);
      this.c.a(paramFloat);
      AppMethodBeat.o(101016);
    }
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101013);
    if (this.f == null)
      AppMethodBeat.o(101013);
    while (true)
    {
      return;
      this.f.a(this.d, paramFloat1, paramFloat2);
      this.c.a(paramFloat1, paramFloat2);
      AppMethodBeat.o(101013);
    }
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(101034);
    if ((paramInt < di.a) || (paramInt > di.c))
      AppMethodBeat.o(101034);
    while (true)
    {
      return;
      this.f.a(this.d, paramInt);
      this.c.a(paramInt);
      AppMethodBeat.o(101034);
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(101022);
    this.f.a(this.d, paramInt1, paramInt2);
    this.f.a(this.d, false);
    this.c.a(false);
    AppMethodBeat.o(101022);
  }

  public final void a(cm paramcm)
  {
    AppMethodBeat.i(101015);
    if (this.f == null)
      AppMethodBeat.o(101015);
    while (true)
    {
      return;
      this.f.a(this.d, paramcm);
      this.c.a(paramcm);
      AppMethodBeat.o(101015);
    }
  }

  public final void a(db paramdb)
  {
    AppMethodBeat.i(101000);
    if ((this.f == null) || (paramdb == null))
      AppMethodBeat.o(101000);
    while (true)
    {
      return;
      this.f.a(this.d, paramdb);
      this.c.a(paramdb);
      AppMethodBeat.o(101000);
    }
  }

  public final void a(Object paramObject)
  {
    this.k = paramObject;
  }

  public final void a(String paramString)
  {
    AppMethodBeat.i(101003);
    if (this.f == null)
      AppMethodBeat.o(101003);
    while (true)
    {
      return;
      this.c.a(paramString);
      this.f.b(this.d, paramString);
      AppMethodBeat.o(101003);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(101008);
    if (this.f == null)
    {
      AppMethodBeat.o(101008);
      return;
    }
    this.f.a(this.d, paramBoolean);
    at localat = this.f;
    String str = this.d;
    if ((!paramBoolean) && (o()));
    for (boolean bool = true; ; bool = false)
    {
      localat.c(str, bool);
      this.c.a(paramBoolean);
      AppMethodBeat.o(101008);
      break;
    }
  }

  public final int b(Context paramContext)
  {
    int m = 0;
    AppMethodBeat.i(101026);
    cm localcm = this.c.e();
    if (localcm == null)
      AppMethodBeat.o(101026);
    while (true)
    {
      return m;
      paramContext = localcm.a().a(paramContext);
      if (paramContext == null)
      {
        AppMethodBeat.o(101026);
      }
      else
      {
        m = paramContext.getHeight();
        AppMethodBeat.o(101026);
      }
    }
  }

  public final void b()
  {
    AppMethodBeat.i(100999);
    if (this.f == null)
      AppMethodBeat.o(100999);
    while (true)
    {
      return;
      this.f.a(this.d);
      AppMethodBeat.o(100999);
    }
  }

  public final void b(float paramFloat)
  {
    AppMethodBeat.i(101020);
    if (this.f == null)
      AppMethodBeat.o(101020);
    while (true)
    {
      return;
      this.f.b(this.d, paramFloat);
      this.c.b(paramFloat);
      AppMethodBeat.o(101020);
    }
  }

  public final void b(String paramString)
  {
    AppMethodBeat.i(101005);
    if (this.f == null)
      AppMethodBeat.o(101005);
    while (true)
    {
      return;
      this.c.b(paramString);
      this.f.a(this.d, paramString);
      AppMethodBeat.o(101005);
    }
  }

  public final void b(boolean paramBoolean)
  {
    AppMethodBeat.i(101014);
    if (this.f == null)
      AppMethodBeat.o(101014);
    while (true)
    {
      return;
      this.f.b(this.d, paramBoolean);
      this.c.b(paramBoolean);
      AppMethodBeat.o(101014);
    }
  }

  public final String c()
  {
    return this.d;
  }

  public final void c(float paramFloat)
  {
    AppMethodBeat.i(101023);
    this.f.c(this.d, paramFloat);
    this.c.c(paramFloat);
    AppMethodBeat.o(101023);
  }

  public final void c(String paramString)
  {
    AppMethodBeat.i(101031);
    if (this.c != null)
      this.c.c(paramString);
    AppMethodBeat.o(101031);
  }

  public final boolean d()
  {
    AppMethodBeat.i(101001);
    boolean bool = this.c.j();
    AppMethodBeat.o(101001);
    return bool;
  }

  public final db e()
  {
    AppMethodBeat.i(101002);
    db localdb1 = this.f.b(this.d);
    db localdb2 = localdb1;
    if (localdb1 == null)
      localdb2 = this.c.b();
    AppMethodBeat.o(101002);
    return localdb2;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(101019);
    boolean bool;
    if (!(paramObject instanceof de))
    {
      bool = false;
      AppMethodBeat.o(101019);
    }
    while (true)
    {
      return bool;
      paramObject = (de)paramObject;
      bool = this.d.equals(paramObject.d);
      AppMethodBeat.o(101019);
    }
  }

  public final String f()
  {
    AppMethodBeat.i(101004);
    String str = this.c.c();
    AppMethodBeat.o(101004);
    return str;
  }

  public final String g()
  {
    AppMethodBeat.i(101006);
    String str = this.c.d();
    AppMethodBeat.o(101006);
    return str;
  }

  public final float h()
  {
    AppMethodBeat.i(101007);
    float f1 = this.c.k();
    AppMethodBeat.o(101007);
    return f1;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(101029);
    int m = this.d.hashCode();
    AppMethodBeat.o(101029);
    return m;
  }

  public final boolean i()
  {
    AppMethodBeat.i(101009);
    boolean bool = this.c.h();
    AppMethodBeat.o(101009);
    return bool;
  }

  public final void j()
  {
    AppMethodBeat.i(101010);
    if (this.f == null)
      AppMethodBeat.o(101010);
    while (true)
    {
      return;
      this.f.c(this.d);
      AppMethodBeat.o(101010);
    }
  }

  public final void k()
  {
    AppMethodBeat.i(101011);
    if (this.f == null)
      AppMethodBeat.o(101011);
    while (true)
    {
      return;
      this.f.d(this.d);
      AppMethodBeat.o(101011);
    }
  }

  public final boolean l()
  {
    AppMethodBeat.i(101012);
    boolean bool;
    if (this.f == null)
    {
      bool = false;
      AppMethodBeat.o(101012);
    }
    while (true)
    {
      return bool;
      bool = this.f.e(this.d);
      AppMethodBeat.o(101012);
    }
  }

  public final float m()
  {
    AppMethodBeat.i(101017);
    float f1;
    if (this.f == null)
    {
      f1 = 0.0F;
      AppMethodBeat.o(101017);
    }
    while (true)
    {
      return f1;
      f1 = this.f.f(this.d);
      AppMethodBeat.o(101017);
    }
  }

  public final boolean n()
  {
    AppMethodBeat.i(101018);
    boolean bool;
    if (this.f == null)
    {
      bool = false;
      AppMethodBeat.o(101018);
    }
    while (true)
    {
      return bool;
      bool = this.c.i();
      AppMethodBeat.o(101018);
    }
  }

  final boolean o()
  {
    AppMethodBeat.i(101021);
    boolean bool = this.f.g(this.d);
    AppMethodBeat.o(101021);
    return bool;
  }

  public final float p()
  {
    AppMethodBeat.i(101024);
    float f1;
    if (this.c != null)
    {
      f1 = this.c.l();
      AppMethodBeat.o(101024);
    }
    while (true)
    {
      return f1;
      f1 = 0.0F;
      AppMethodBeat.o(101024);
    }
  }

  public final float q()
  {
    AppMethodBeat.i(101027);
    float f1 = this.c.f();
    AppMethodBeat.o(101027);
    return f1;
  }

  public final float r()
  {
    AppMethodBeat.i(101028);
    float f1 = this.c.g();
    AppMethodBeat.o(101028);
    return f1;
  }

  public final aj.m s()
  {
    return this.j;
  }

  public final Object t()
  {
    return this.k;
  }

  public final String u()
  {
    AppMethodBeat.i(101032);
    String str;
    if (this.c != null)
    {
      str = this.c.w();
      AppMethodBeat.o(101032);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101032);
    }
  }

  public final int v()
  {
    AppMethodBeat.i(101033);
    int m = this.c.x();
    AppMethodBeat.o(101033);
    return m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.de
 * JD-Core Version:    0.6.2
 */