package com.tencent.map.lib;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.element.c;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.map.lib.listener.a;
import com.tencent.map.lib.mapstructure.CircleInfo;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fl;
import com.tencent.tencentmap.mapsdk.maps.a.fq;
import com.tencent.tencentmap.mapsdk.maps.a.fr;
import com.tencent.tencentmap.mapsdk.maps.a.ft;
import com.tencent.tencentmap.mapsdk.maps.a.fv;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.fx;
import com.tencent.tencentmap.mapsdk.maps.a.gh;
import com.tencent.tencentmap.mapsdk.maps.a.gj;
import com.tencent.tencentmap.mapsdk.maps.a.gk;
import com.tencent.tencentmap.mapsdk.maps.a.gk.a;
import com.tencent.tencentmap.mapsdk.maps.a.gl;
import com.tencent.tencentmap.mapsdk.maps.a.gm;
import com.tencent.tencentmap.mapsdk.maps.a.gs;
import com.tencent.tencentmap.mapsdk.maps.a.gt;
import com.tencent.tencentmap.mapsdk.maps.a.gv;
import java.util.ArrayList;
import java.util.List;

public class f
{
  private boolean a;
  private gm b;
  private int c;
  private int d;
  private GeoPoint e;
  private int f;

  public f(gm paramgm)
  {
    AppMethodBeat.i(97903);
    this.a = false;
    this.c = 20;
    this.d = 3;
    this.e = new GeoPoint();
    this.f = 0;
    this.b = paramgm;
    AppMethodBeat.o(97903);
  }

  public gs A()
  {
    AppMethodBeat.i(97982);
    gs localgs = this.b.e();
    AppMethodBeat.o(97982);
    return localgs;
  }

  public int B()
  {
    AppMethodBeat.i(97983);
    int i = this.b.a(3, true);
    AppMethodBeat.o(97983);
    return i;
  }

  public int C()
  {
    AppMethodBeat.i(97984);
    int i = this.b.a(2, true);
    AppMethodBeat.o(97984);
    return i;
  }

  public MapLanguage D()
  {
    AppMethodBeat.i(97998);
    MapLanguage localMapLanguage = this.b.y();
    AppMethodBeat.o(97998);
    return localMapLanguage;
  }

  public boolean E()
  {
    AppMethodBeat.i(98005);
    boolean bool = this.b.B();
    AppMethodBeat.o(98005);
    return bool;
  }

  public void F()
  {
    AppMethodBeat.i(98006);
    this.b.C();
    AppMethodBeat.o(98006);
  }

  public String G()
  {
    AppMethodBeat.i(98008);
    String str = null;
    if (this.b != null)
      str = this.b.E();
    AppMethodBeat.o(98008);
    return str;
  }

  public boolean H()
  {
    return this.a;
  }

  public ArrayList<MapPoi> I()
  {
    AppMethodBeat.i(98010);
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      AppMethodBeat.o(98010);
    }
    while (true)
    {
      return localObject;
      localObject = this.b.G();
      AppMethodBeat.o(98010);
    }
  }

  public String J()
  {
    AppMethodBeat.i(98011);
    String str;
    if (this.b == null)
    {
      str = null;
      AppMethodBeat.o(98011);
    }
    while (true)
    {
      return str;
      str = this.b.H();
      AppMethodBeat.o(98011);
    }
  }

  public String K()
  {
    AppMethodBeat.i(98012);
    String str;
    if (this.b == null)
    {
      str = null;
      AppMethodBeat.o(98012);
    }
    while (true)
    {
      return str;
      str = this.b.I();
      AppMethodBeat.o(98012);
    }
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(97961);
    paramInt1 = this.b.a().a(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(97961);
    return paramInt1;
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat)
  {
    AppMethodBeat.i(97950);
    paramInt1 = this.b.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramFloat);
    AppMethodBeat.o(97950);
    return paramInt1;
  }

  public int a(CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(97947);
    int i = this.b.a(paramCircleInfo);
    AppMethodBeat.o(97947);
    return i;
  }

  public int a(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(97944);
    int i = this.b.a(paramPolygon2D);
    AppMethodBeat.o(97944);
    return i;
  }

  public String a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97909);
    paramGeoPoint = this.b.a(paramGeoPoint);
    AppMethodBeat.o(97909);
    return paramGeoPoint;
  }

  public void a()
  {
    AppMethodBeat.i(97904);
    this.b.w();
    AppMethodBeat.o(97904);
  }

  public void a(double paramDouble)
  {
    AppMethodBeat.i(97927);
    this.b.a().j(paramDouble);
    AppMethodBeat.o(97927);
  }

  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, Runnable paramRunnable)
  {
    AppMethodBeat.i(97979);
    this.b.a().a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramRunnable);
    AppMethodBeat.o(97979);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(97919);
    this.b.a().c(paramFloat);
    AppMethodBeat.o(97919);
  }

  public void a(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(97977);
    this.b.a().a(paramFloat1, paramFloat2, paramBoolean);
    AppMethodBeat.o(97977);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(97907);
    this.b.a().b(paramInt);
    AppMethodBeat.o(97907);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97918);
    this.b.a().a(paramInt1, paramInt2);
    AppMethodBeat.o(97918);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(97988);
    this.b.a(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(97988);
  }

  public void a(int paramInt, CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(97948);
    this.b.a(paramInt, paramCircleInfo);
    AppMethodBeat.o(97948);
  }

  public void a(e parame)
  {
    AppMethodBeat.i(97963);
    this.b.a().a(parame);
    AppMethodBeat.o(97963);
  }

  public void a(j paramj)
  {
    AppMethodBeat.i(97911);
    this.b.c().a(paramj);
    this.b.q();
    AppMethodBeat.o(97911);
  }

  public void a(JNICallback.b paramb)
  {
    AppMethodBeat.i(97991);
    this.b.a(paramb);
    AppMethodBeat.o(97991);
  }

  public void a(JNICallback.c paramc)
  {
    AppMethodBeat.i(97992);
    this.b.a(paramc);
    AppMethodBeat.o(97992);
  }

  public void a(JNICallback.d paramd)
  {
    AppMethodBeat.i(97989);
    this.b.a(paramd);
    AppMethodBeat.o(97989);
  }

  public void a(JNICallback.e parame)
  {
    AppMethodBeat.i(97973);
    this.b.a(parame);
    AppMethodBeat.o(97973);
  }

  public void a(JNICallback.j paramj)
  {
    AppMethodBeat.i(97990);
    this.b.a(paramj);
    AppMethodBeat.o(97990);
  }

  public void a(JNICallback.k paramk)
  {
    AppMethodBeat.i(97993);
    this.b.a(paramk);
    AppMethodBeat.o(97993);
  }

  public void a(a parama)
  {
    AppMethodBeat.i(97940);
    this.b.c().a(parama);
    AppMethodBeat.o(97940);
  }

  public void a(fq paramfq)
  {
    AppMethodBeat.i(97913);
    this.b.a().a(paramfq);
    AppMethodBeat.o(97913);
  }

  public void a(fr paramfr)
  {
    AppMethodBeat.i(97937);
    this.b.a().a(paramfr);
    AppMethodBeat.o(97937);
  }

  public void a(ft paramft)
  {
    AppMethodBeat.i(97938);
    this.b.a().a(paramft);
    AppMethodBeat.o(97938);
  }

  public void a(fv paramfv)
  {
    AppMethodBeat.i(97915);
    this.b.a().a(paramfv);
    AppMethodBeat.o(97915);
  }

  public void a(fx paramfx)
  {
    AppMethodBeat.i(97959);
    this.b.a().c(paramfx);
    AppMethodBeat.o(97959);
  }

  public void a(gk.a parama)
  {
    AppMethodBeat.i(97974);
    this.b.a().a(parama);
    AppMethodBeat.o(97974);
  }

  public void a(gt paramgt)
  {
    AppMethodBeat.i(97980);
    this.b.a().a(paramgt);
    AppMethodBeat.o(97980);
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(97928);
    this.b.a().a(paramRunnable);
    AppMethodBeat.o(97928);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(97997);
    this.b.b(paramString);
    AppMethodBeat.o(97997);
  }

  public void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98009);
    if (this.b != null)
      this.b.a(paramString1, paramString2);
    AppMethodBeat.o(98009);
  }

  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    AppMethodBeat.i(97953);
    this.b.a(paramList, paramList1);
    AppMethodBeat.o(97953);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(97922);
    this.b.a(paramBoolean);
    AppMethodBeat.o(97922);
  }

  public void a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(97970);
    this.b.a(paramArrayOfString);
    AppMethodBeat.o(97970);
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(97941);
    boolean bool = this.b.c().a(paramFloat1, paramFloat2);
    AppMethodBeat.o(97941);
    return bool;
  }

  public boolean a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97934);
    gv localgv = this.b.o();
    boolean bool;
    if (localgv == null)
    {
      bool = false;
      AppMethodBeat.o(97934);
    }
    while (true)
    {
      return bool;
      bool = localgv.a(paramString, paramArrayOfByte);
      AppMethodBeat.o(97934);
    }
  }

  public int b()
  {
    return this.d;
  }

  public TappedElement b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(98000);
    TappedElement localTappedElement = this.b.a(paramFloat1, paramFloat2);
    AppMethodBeat.o(98000);
    return localTappedElement;
  }

  public void b(double paramDouble)
  {
    AppMethodBeat.i(97978);
    this.b.a().h(paramDouble);
    AppMethodBeat.o(97978);
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(97920);
    this.b.a().b(paramFloat);
    AppMethodBeat.o(97920);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(97910);
    this.b.a().a(paramInt);
    AppMethodBeat.o(97910);
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97951);
    this.b.c(paramInt1, paramInt2);
    AppMethodBeat.o(97951);
  }

  public void b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97917);
    this.b.a().a(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    AppMethodBeat.o(97917);
  }

  public void b(j paramj)
  {
    AppMethodBeat.i(97912);
    this.b.c().b(paramj);
    this.b.q();
    AppMethodBeat.o(97912);
  }

  public void b(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(97945);
    this.b.b(paramPolygon2D);
    AppMethodBeat.o(97945);
  }

  public void b(fq paramfq)
  {
    AppMethodBeat.i(97914);
    this.b.a().b(paramfq);
    AppMethodBeat.o(97914);
  }

  public void b(ft paramft)
  {
    AppMethodBeat.i(97939);
    this.b.a().b(paramft);
    AppMethodBeat.o(97939);
  }

  public void b(fv paramfv)
  {
    AppMethodBeat.i(97916);
    this.b.a().b(paramfv);
    AppMethodBeat.o(97916);
  }

  public void b(Runnable paramRunnable)
  {
    AppMethodBeat.i(97929);
    this.b.a().b(paramRunnable);
    AppMethodBeat.o(97929);
  }

  public void b(String paramString)
  {
    AppMethodBeat.i(97999);
    this.b.a(paramString);
    AppMethodBeat.o(97999);
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(97955);
    if (this.b != null)
      this.b.d(paramBoolean);
    AppMethodBeat.o(97955);
  }

  public boolean b(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97935);
    gv localgv = this.b.o();
    boolean bool;
    if (localgv == null)
    {
      bool = false;
      AppMethodBeat.o(97935);
    }
    while (true)
    {
      return bool;
      bool = localgv.b(paramString, paramArrayOfByte);
      AppMethodBeat.o(97935);
    }
  }

  public int c()
  {
    return this.c;
  }

  public String c(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97968);
    paramGeoPoint = this.b.b(paramGeoPoint);
    AppMethodBeat.o(97968);
    return paramGeoPoint;
  }

  public void c(float paramFloat)
  {
    AppMethodBeat.i(97976);
    this.b.a().a(paramFloat);
    AppMethodBeat.o(97976);
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(97946);
    this.b.c(paramInt);
    AppMethodBeat.o(97946);
  }

  public void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97975);
    this.b.a().b(paramInt1, paramInt2);
    AppMethodBeat.o(97975);
  }

  public void c(String paramString)
  {
    AppMethodBeat.i(98003);
    this.b.c(paramString);
    AppMethodBeat.o(98003);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(97956);
    if (this.b != null)
      this.b.e(paramBoolean);
    AppMethodBeat.o(97956);
  }

  public int d()
  {
    AppMethodBeat.i(97905);
    int i = this.b.e().n();
    AppMethodBeat.o(97905);
    return i;
  }

  public c d(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97969);
    paramGeoPoint = this.b.i().b(paramGeoPoint);
    AppMethodBeat.o(97969);
    return paramGeoPoint;
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(97949);
    this.b.a(paramInt);
    AppMethodBeat.o(97949);
  }

  public void d(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97994);
    this.b.d(paramInt1, paramInt2);
    AppMethodBeat.o(97994);
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(97964);
    this.b.f(paramBoolean);
    AppMethodBeat.o(97964);
  }

  public int e()
  {
    AppMethodBeat.i(97906);
    int i = this.b.a().u();
    AppMethodBeat.o(97906);
    return i;
  }

  public int e(boolean paramBoolean)
  {
    AppMethodBeat.i(97985);
    int i = this.b.a(1, paramBoolean);
    AppMethodBeat.o(97985);
    return i;
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(97952);
    this.b.b(paramInt);
    AppMethodBeat.o(97952);
  }

  public void e(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97996);
    this.b.e(paramInt1, paramInt2);
    AppMethodBeat.o(97996);
  }

  public GeoPoint f()
  {
    AppMethodBeat.i(97908);
    GeoPoint localGeoPoint = this.b.a().n();
    AppMethodBeat.o(97908);
    return localGeoPoint;
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(97965);
    this.b.d(paramInt);
    AppMethodBeat.o(97965);
  }

  public void f(boolean paramBoolean)
  {
    AppMethodBeat.i(97995);
    this.b.g(paramBoolean);
    AppMethodBeat.o(97995);
  }

  public void g(int paramInt)
  {
    AppMethodBeat.i(97971);
    this.c = paramInt;
    this.b.i().d(paramInt);
    this.b.e().c(paramInt);
    AppMethodBeat.o(97971);
  }

  public void g(boolean paramBoolean)
  {
    AppMethodBeat.i(98001);
    this.b.i(paramBoolean);
    AppMethodBeat.o(98001);
  }

  public boolean g()
  {
    AppMethodBeat.i(97921);
    boolean bool = this.b.u();
    AppMethodBeat.o(97921);
    return bool;
  }

  public int h()
  {
    AppMethodBeat.i(97923);
    int i = this.b.a().m();
    AppMethodBeat.o(97923);
    return i;
  }

  public void h(int paramInt)
  {
    AppMethodBeat.i(97972);
    this.d = paramInt;
    this.b.i().e(paramInt);
    AppMethodBeat.o(97972);
  }

  public void h(boolean paramBoolean)
  {
    AppMethodBeat.i(98002);
    this.b.j(paramBoolean);
    AppMethodBeat.o(98002);
  }

  public float i()
  {
    AppMethodBeat.i(97924);
    float f1 = this.b.a().l();
    AppMethodBeat.o(97924);
    return f1;
  }

  public void i(int paramInt)
  {
    AppMethodBeat.i(97986);
    this.b.e(paramInt);
    AppMethodBeat.o(97986);
  }

  public void i(boolean paramBoolean)
  {
    AppMethodBeat.i(98004);
    this.b.h(paramBoolean);
    AppMethodBeat.o(98004);
  }

  public float j()
  {
    AppMethodBeat.i(97925);
    float f1 = h();
    double d1 = k();
    f1 = (float)(f1 + Math.log(d1) / Math.log(2.0D));
    AppMethodBeat.o(97925);
    return f1;
  }

  public void j(int paramInt)
  {
    AppMethodBeat.i(97987);
    this.b.f(paramInt);
    AppMethodBeat.o(97987);
  }

  public void j(boolean paramBoolean)
  {
    AppMethodBeat.i(98007);
    if (this.b != null)
      this.b.k(paramBoolean);
    AppMethodBeat.o(98007);
  }

  public float k()
  {
    AppMethodBeat.i(97926);
    float f1 = this.b.a().q();
    AppMethodBeat.o(97926);
    return f1;
  }

  public void k(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void l()
  {
    AppMethodBeat.i(97930);
    this.b.a().s();
    AppMethodBeat.o(97930);
  }

  public void m()
  {
    AppMethodBeat.i(97931);
    this.b.s();
    AppMethodBeat.o(97931);
  }

  public void n()
  {
    AppMethodBeat.i(97932);
    this.b.t();
    AppMethodBeat.o(97932);
  }

  public void o()
  {
    AppMethodBeat.i(97933);
    this.b.r();
    AppMethodBeat.o(97933);
  }

  public void p()
  {
    AppMethodBeat.i(97936);
    gv localgv = this.b.o();
    if (localgv == null)
      AppMethodBeat.o(97936);
    while (true)
    {
      return;
      localgv.c();
      AppMethodBeat.o(97936);
    }
  }

  public float q()
  {
    AppMethodBeat.i(97942);
    float f1 = this.b.a().o();
    AppMethodBeat.o(97942);
    return f1;
  }

  public float r()
  {
    AppMethodBeat.i(97943);
    float f1 = this.b.a().p();
    AppMethodBeat.o(97943);
    return f1;
  }

  public void s()
  {
    AppMethodBeat.i(97954);
    this.b.v();
    AppMethodBeat.o(97954);
  }

  public fw t()
  {
    AppMethodBeat.i(97957);
    fw localfw = this.b.d();
    AppMethodBeat.o(97957);
    return localfw;
  }

  @Deprecated
  public fw u()
  {
    AppMethodBeat.i(97958);
    fl localfl = new fl(this.b);
    AppMethodBeat.o(97958);
    return localfl;
  }

  public void v()
  {
    AppMethodBeat.i(97960);
    this.b.a().A();
    AppMethodBeat.o(97960);
  }

  public Rect w()
  {
    AppMethodBeat.i(97962);
    Rect localRect = this.b.a().b();
    AppMethodBeat.o(97962);
    return localRect;
  }

  public int x()
  {
    AppMethodBeat.i(97966);
    int i = this.b.i().o();
    AppMethodBeat.o(97966);
    return i;
  }

  public String[] y()
  {
    AppMethodBeat.i(97967);
    String[] arrayOfString = this.b.x();
    AppMethodBeat.o(97967);
    return arrayOfString;
  }

  public gj z()
  {
    AppMethodBeat.i(97981);
    gj localgj = this.b.z();
    AppMethodBeat.o(97981);
    return localgj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.f
 * JD-Core Version:    0.6.2
 */