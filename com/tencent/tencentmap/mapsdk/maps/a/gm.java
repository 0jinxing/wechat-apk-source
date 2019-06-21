package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.a;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.d;
import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.map.lib.listener.MapLanguageChangeListener;
import com.tencent.map.lib.mapstructure.BlockRouteCityData;
import com.tencent.map.lib.mapstructure.CircleInfo;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.mapstructure.MaskLayer;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import javax.microedition.khronos.opengles.GL10;

public class gm
  implements fn, fu
{
  private String A;
  private boolean B;
  private boolean C;
  private int D;
  private int E;
  private Rect F;
  private float G;
  private float H;
  private boolean I;
  private int J;
  private int K;
  private boolean L;
  private gh a;
  private com.tencent.map.lib.gl.b b;
  private gk c;
  private ha d;
  private gl e;
  private gj f;
  private WeakReference<ge> g;
  private fp h;
  private Rect i;
  private boolean j;
  private boolean k;
  private Context l;
  private gv m;
  private gm.d n;
  private gs o;
  private LinkedBlockingQueue<a> p;
  private gx q;
  private a r;
  private volatile boolean s;
  private com.tencent.map.lib.util.c<Integer, Integer> t;
  private boolean u;
  private com.tencent.map.lib.b v;
  private boolean w;
  private gm.b x;
  private gm.c y;
  private gc z;

  public gm(Context paramContext, ge paramge)
  {
    AppMethodBeat.i(99307);
    this.s = false;
    this.u = true;
    this.w = true;
    this.B = true;
    this.C = false;
    this.D = 0;
    this.E = 0;
    this.G = 0.5F;
    this.H = 0.5F;
    this.I = true;
    this.J = 18;
    this.K = 14;
    this.L = false;
    this.l = paramContext;
    this.g = new WeakReference(paramge);
    this.a = new gh(paramContext, this);
    this.o = new gs(this);
    this.i = new Rect();
    this.e = new gl(this);
    this.h = new fp(this.o, this);
    this.c = new gk(this);
    this.a.a(this.c);
    this.n = new gm.d(this, null);
    this.p = new LinkedBlockingQueue();
    AppMethodBeat.o(99307);
  }

  private void J()
  {
    AppMethodBeat.i(99344);
    if (this.a != null)
      this.a.k();
    AppMethodBeat.o(99344);
  }

  private void K()
  {
    AppMethodBeat.i(99345);
    if (this.a != null)
      this.a.l();
    AppMethodBeat.o(99345);
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(99318);
    this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.D = paramInt3;
    this.E = paramInt4;
    if (paramBoolean)
      a(this.G, this.H, this.I);
    AppMethodBeat.o(99318);
  }

  private void c(GL10 paramGL10)
  {
    AppMethodBeat.i(99321);
    if (this.p.size() == 0)
      AppMethodBeat.o(99321);
    while (true)
    {
      return;
      int i1 = 1;
      while (i1 != 0)
      {
        a locala = (a)this.p.poll();
        if (locala != null)
          try
          {
            locala.a(paramGL10);
          }
          catch (Exception localException)
          {
          }
        else
          i1 = 0;
      }
      AppMethodBeat.o(99321);
    }
  }

  private void l(boolean paramBoolean)
  {
    AppMethodBeat.i(99349);
    if (this.a != null)
      this.a.b(paramBoolean);
    AppMethodBeat.o(99349);
  }

  public String A()
  {
    return this.A;
  }

  public boolean B()
  {
    AppMethodBeat.i(99375);
    boolean bool;
    if (this.z == null)
    {
      bool = false;
      AppMethodBeat.o(99375);
    }
    while (true)
    {
      return bool;
      bool = this.z.a();
      AppMethodBeat.o(99375);
    }
  }

  public void C()
  {
    AppMethodBeat.i(99376);
    if ((this.z == null) || (!this.z.a()))
      AppMethodBeat.o(99376);
    while (true)
    {
      return;
      this.z.b();
      AppMethodBeat.o(99376);
    }
  }

  public gx D()
  {
    return this.q;
  }

  public String E()
  {
    AppMethodBeat.i(99380);
    String str = null;
    if (this.a != null)
      str = this.a.C();
    AppMethodBeat.o(99380);
    return str;
  }

  protected boolean F()
  {
    AppMethodBeat.i(99381);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.g();
      AppMethodBeat.o(99381);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99381);
    }
  }

  public ArrayList<MapPoi> G()
  {
    AppMethodBeat.i(99383);
    Object localObject;
    if (this.a == null)
    {
      localObject = null;
      AppMethodBeat.o(99383);
    }
    while (true)
    {
      return localObject;
      localObject = this.a.E();
      AppMethodBeat.o(99383);
    }
  }

  public String H()
  {
    AppMethodBeat.i(99384);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(99384);
    }
    while (true)
    {
      return str;
      str = this.a.D();
      AppMethodBeat.o(99384);
    }
  }

  public String I()
  {
    AppMethodBeat.i(99385);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(99385);
    }
    while (true)
    {
      return str;
      str = this.a.F();
      AppMethodBeat.o(99385);
    }
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat)
  {
    int i1 = 255;
    AppMethodBeat.i(99332);
    if (this.a == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(99332);
      return paramInt1;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      if (paramInt1 > 255);
      for (int i2 = 255; ; i2 = paramInt1)
      {
        if (paramInt2 < 0);
        for (paramInt1 = 0; ; paramInt1 = paramInt2)
        {
          if (paramInt1 > 255);
          for (paramInt2 = 255; ; paramInt2 = paramInt1)
          {
            if (paramInt3 < 0);
            for (paramInt1 = 0; ; paramInt1 = paramInt3)
            {
              if (paramInt1 > 255);
              for (paramInt3 = 255; ; paramInt3 = paramInt1)
              {
                if (paramInt4 < 0);
                for (paramInt1 = 0; ; paramInt1 = paramInt4)
                {
                  if (paramInt1 > 255)
                    paramInt1 = i1;
                  while (true)
                  {
                    MaskLayer localMaskLayer = new MaskLayer();
                    localMaskLayer.color = new int[] { i2, paramInt2, paramInt3, 255 - paramInt1 };
                    if (this.i != null)
                    {
                      localMaskLayer.width = this.i.width();
                      localMaskLayer.height = this.i.height();
                    }
                    localMaskLayer.zIndex = paramFloat;
                    localMaskLayer.layer = paramInt5;
                    paramInt1 = this.a.a(localMaskLayer);
                    this.e.a(paramInt1, paramInt5);
                    AppMethodBeat.o(99332);
                    break;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public int a(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99356);
    if (this.a != null)
    {
      paramInt = this.a.d(paramInt, paramBoolean);
      AppMethodBeat.o(99356);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(99356);
    }
  }

  public int a(CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(99329);
    int i1;
    if ((this.a == null) || (paramCircleInfo == null))
    {
      i1 = -1;
      AppMethodBeat.o(99329);
    }
    while (true)
    {
      return i1;
      i1 = this.a.a(paramCircleInfo);
      AppMethodBeat.o(99329);
    }
  }

  public int a(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(99327);
    int i1;
    if ((this.a == null) || (paramPolygon2D == null))
    {
      i1 = -1;
      AppMethodBeat.o(99327);
    }
    while (true)
    {
      return i1;
      paramPolygon2D.borderWidth *= SystemUtil.getDensity(this.l);
      i1 = this.a.a(paramPolygon2D);
      if (this.t == null)
        this.t = new com.tencent.map.lib.util.c();
      this.t.a(Integer.valueOf(i1), Integer.valueOf(paramPolygon2D.borldLineId));
      AppMethodBeat.o(99327);
    }
  }

  public TappedElement a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99372);
    TappedElement localTappedElement;
    if (this.a != null)
    {
      localTappedElement = this.a.a(paramFloat1, paramFloat2);
      AppMethodBeat.o(99372);
    }
    while (true)
    {
      return localTappedElement;
      localTappedElement = null;
      AppMethodBeat.o(99372);
    }
  }

  public gk a()
  {
    return this.c;
  }

  public String a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99341);
    if ((this.r != null) && (this.v != null))
    {
      String str = this.v.a(paramGeoPoint);
      if (str != null)
      {
        AppMethodBeat.o(99341);
        paramGeoPoint = str;
      }
    }
    while (true)
    {
      return paramGeoPoint;
      if (this.a == null)
      {
        paramGeoPoint = "";
        AppMethodBeat.o(99341);
      }
      else
      {
        paramGeoPoint = this.a.a(paramGeoPoint);
        AppMethodBeat.o(99341);
      }
    }
  }

  public List<Integer> a(Rect paramRect, int paramInt)
  {
    AppMethodBeat.i(99338);
    paramRect = this.a.a(paramRect, paramInt);
    AppMethodBeat.o(99338);
    return paramRect;
  }

  public void a(double paramDouble)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(99348);
    int i1;
    if (this.c.p() > 1.0E-010D)
    {
      i1 = 1;
      if (!this.L)
        break label99;
      if ((!this.w) || (i1 == 0))
        break label93;
      bool2 = bool1;
      label51: l(bool2);
    }
    while (true)
    {
      if ((!hb.a()) && (this.c.t()))
        this.a.n();
      AppMethodBeat.o(99348);
      return;
      i1 = 0;
      break;
      label93: bool2 = false;
      break label51;
      label99: if ((this.w) || (i1 != 0))
        bool2 = true;
      l(bool2);
    }
  }

  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(99319);
    this.G = paramFloat1;
    this.H = paramFloat2;
    double d1 = paramFloat1;
    double d2 = paramFloat2;
    double d3 = d2;
    double d4 = d1;
    if (this.i != null)
    {
      double d5 = d2;
      if (this.E > 0)
        d5 = 0.5D - (0.5D - d2) * this.i.height() / this.E;
      d3 = d5;
      d4 = d1;
      if (this.D > 0)
      {
        d4 = 0.5D - (0.5D - d1) * this.i.width() / this.D;
        d3 = d5;
      }
    }
    this.a.b((float)d4, (float)d3, paramBoolean);
    AppMethodBeat.o(99319);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(99331);
    if ((this.a == null) || (paramInt == -1))
      AppMethodBeat.o(99331);
    while (true)
    {
      return;
      this.a.a(paramInt);
      AppMethodBeat.o(99331);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99316);
    if (this.a == null)
      AppMethodBeat.o(99316);
    while (true)
    {
      return;
      this.s = true;
      this.i.set(0, 0, paramInt1, paramInt2);
      a(0, 0, paramInt1, paramInt2, false);
      this.c.v();
      AppMethodBeat.o(99316);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99357);
    if (this.a == null)
      AppMethodBeat.o(99357);
    while (true)
    {
      return;
      this.a.a(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(99357);
    }
  }

  public void a(int paramInt, CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(99330);
    if ((this.a == null) || (paramCircleInfo == null))
      AppMethodBeat.o(99330);
    while (true)
    {
      return;
      this.a.a(paramInt, paramCircleInfo);
      AppMethodBeat.o(99330);
    }
  }

  public void a(Rect paramRect)
  {
    AppMethodBeat.i(99317);
    if ((this.i == null) || (paramRect == null))
      AppMethodBeat.o(99317);
    while (true)
    {
      return;
      this.F = paramRect;
      int i1 = this.i.width();
      int i2 = this.i.height();
      a(paramRect.left, paramRect.bottom, i1 - paramRect.right - paramRect.left, i2 - paramRect.bottom - paramRect.top, true);
      AppMethodBeat.o(99317);
    }
  }

  public void a(JNICallback.b paramb)
  {
    AppMethodBeat.i(99362);
    if (this.a != null)
      this.a.a(paramb);
    AppMethodBeat.o(99362);
  }

  public void a(JNICallback.c paramc)
  {
    AppMethodBeat.i(99363);
    if (this.a != null)
      this.a.a(paramc);
    AppMethodBeat.o(99363);
  }

  public void a(JNICallback.d paramd)
  {
    AppMethodBeat.i(99360);
    if (this.a != null)
      this.a.a(paramd);
    AppMethodBeat.o(99360);
  }

  public void a(JNICallback.e parame)
  {
    AppMethodBeat.i(99355);
    if (this.a != null)
      this.a.a(parame);
    AppMethodBeat.o(99355);
  }

  public void a(JNICallback.j paramj)
  {
    AppMethodBeat.i(99361);
    if (this.a != null)
      this.a.a(paramj);
    AppMethodBeat.o(99361);
  }

  public void a(JNICallback.k paramk)
  {
    AppMethodBeat.i(99364);
    if (this.a != null)
      this.a.a(paramk);
    AppMethodBeat.o(99364);
  }

  public void a(MapLanguageChangeListener paramMapLanguageChangeListener)
  {
    AppMethodBeat.i(99370);
    if (this.x == null)
      this.x = new gm.b(this);
    this.x.a(paramMapLanguageChangeListener);
    AppMethodBeat.o(99370);
  }

  public void a(a parama)
  {
    AppMethodBeat.i(99313);
    try
    {
      this.p.put(parama);
      AppMethodBeat.o(99313);
      return;
    }
    catch (InterruptedException parama)
    {
      while (true)
        AppMethodBeat.o(99313);
    }
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(99342);
    if (this.a != null)
      this.a.f(paramString);
    AppMethodBeat.o(99342);
  }

  public void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99382);
    if (this.a == null)
      AppMethodBeat.o(99382);
    while (true)
    {
      return;
      this.a.a(paramString1, paramString2);
      AppMethodBeat.o(99382);
    }
  }

  public void a(List<BlockRouteCityData> paramList)
  {
    AppMethodBeat.i(99339);
    this.a.a(paramList);
    AppMethodBeat.o(99339);
  }

  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    AppMethodBeat.i(99336);
    if (this.y == null)
      this.y = new gm.c(this);
    this.y.a(paramList, paramList1);
    AppMethodBeat.o(99336);
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99315);
    if (this.a == null)
      AppMethodBeat.o(99315);
    while (true)
    {
      return;
      if (this.b != null)
        this.b.a();
      AppMethodBeat.o(99315);
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99326);
    if (this.d != null)
    {
      this.k = paramBoolean;
      if (paramBoolean)
      {
        J();
        this.d.b();
        AppMethodBeat.o(99326);
      }
    }
    while (true)
    {
      return;
      K();
      this.d.e();
      AppMethodBeat.o(99326);
    }
  }

  public void a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(99354);
    if (this.a != null)
      this.a.a(paramArrayOfString);
    AppMethodBeat.o(99354);
  }

  public boolean a(Context paramContext, a parama, hf paramhf)
  {
    AppMethodBeat.i(99308);
    this.r = parama;
    if (this.r.d() != null)
      d.a = this.r.d().a();
    d.c("initEngine");
    Object localObject = parama.a();
    this.q = ((gx)localObject);
    this.a.a(parama.b());
    this.b = new com.tencent.map.lib.gl.b(100);
    this.v = parama.c();
    this.m = new gv(paramContext, this, (gx)localObject, this.v);
    parama = ((gx)localObject).c();
    String str = ((gx)localObject).a();
    localObject = ((gx)localObject).b();
    try
    {
      this.m.a();
      boolean bool = this.a.a(paramContext, this.m, parama, str, (String)localObject, 2.0F);
      this.m.b();
      this.f = new gj(this, this.b, this.a);
      if (this.d == null)
        this.d = new ha(this, paramhf);
      if (this.z == null)
        this.z = new ga(this, this.r.b());
      this.a.n();
      this.a.e(true);
      this.a.d(20);
      this.a.e(3);
      l(false);
      this.c.a(this);
      AppMethodBeat.o(99308);
      return bool;
    }
    finally
    {
      this.m.b();
      AppMethodBeat.o(99308);
    }
    throw paramContext;
  }

  public String b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99353);
    if (this.a != null)
    {
      paramGeoPoint = this.a.c(paramGeoPoint);
      AppMethodBeat.o(99353);
    }
    while (true)
    {
      return paramGeoPoint;
      paramGeoPoint = null;
      AppMethodBeat.o(99353);
    }
  }

  public WeakReference<ge> b()
  {
    return this.g;
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(99334);
    if (this.a == null)
      AppMethodBeat.o(99334);
    while (true)
    {
      return;
      this.a.b(paramInt);
      AppMethodBeat.o(99334);
    }
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99320);
    if (this.i != null)
      this.i.set(0, 0, paramInt1, paramInt2);
    AppMethodBeat.o(99320);
  }

  public void b(MapLanguageChangeListener paramMapLanguageChangeListener)
  {
    AppMethodBeat.i(99371);
    if (this.x == null)
      this.x = new gm.b(this);
    this.x.b(paramMapLanguageChangeListener);
    AppMethodBeat.o(99371);
  }

  public void b(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(99328);
    if ((this.a == null) || (paramPolygon2D == null))
      AppMethodBeat.o(99328);
    while (true)
    {
      return;
      paramPolygon2D.borderWidth *= SystemUtil.getDensity(this.l);
      this.a.b(paramPolygon2D);
      AppMethodBeat.o(99328);
    }
  }

  public void b(String paramString)
  {
    AppMethodBeat.i(99368);
    if (this.a != null)
      this.a.e(paramString);
    AppMethodBeat.o(99368);
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(99340);
    this.a.f(paramBoolean);
    AppMethodBeat.o(99340);
  }

  public boolean b(GL10 paramGL10)
  {
    boolean bool = false;
    AppMethodBeat.i(99322);
    if (this.a == null)
    {
      AppMethodBeat.o(99322);
      return bool;
    }
    label71: gm.e locale;
    synchronized (this.a)
    {
      this.c.C();
      c(paramGL10);
      this.a.u();
      if ((this.a.v()) || (this.s))
      {
        bool = true;
        if (bool)
        {
          locale = this.n.a(paramGL10);
          if (locale != null)
            break label247;
          this.e.a(this.f, this.h);
        }
      }
    }
    while (true)
    {
      synchronized (this.a)
      {
        this.a.c();
        this.s = false;
        if ((!this.n.a()) && (locale != null))
        {
          if (locale.c())
            break label303;
          if ((this.a.g()) || (gm.e.a(locale) >= 100))
          {
            gm.e.a(locale, 0);
            this.n.b(paramGL10, this.f, this.h);
          }
        }
        else
        {
          if (this.f != null)
            this.f.c();
          if (this.f != null)
            this.f.a();
          AppMethodBeat.o(99322);
          break;
          paramGL10 = finally;
          AppMethodBeat.o(99322);
          throw paramGL10;
          bool = false;
          break label71;
          label247: if ((this.n == null) || (!this.a.g()))
            continue;
          this.n.a(paramGL10, this.f, this.h);
        }
      }
      gm.e.b(locale);
      continue;
      label303: gm.e.a(locale, 0);
    }
  }

  public gl c()
  {
    return this.e;
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(99335);
    if ((this.a != null) && (this.t != null))
      if ((Integer)this.t.a(Integer.valueOf(paramInt)) == null)
        break label71;
    label71: for (int i1 = ((Integer)this.t.a(Integer.valueOf(paramInt))).intValue(); ; i1 = 0)
    {
      this.a.a(paramInt, i1);
      AppMethodBeat.o(99335);
      return;
    }
  }

  public void c(int paramInt1, int paramInt2)
  {
    int i1 = 255;
    AppMethodBeat.i(99333);
    if (this.a == null)
    {
      AppMethodBeat.o(99333);
      return;
    }
    if (paramInt2 < 0)
      paramInt2 = 0;
    while (true)
    {
      if (paramInt2 > 255)
        paramInt2 = i1;
      while (true)
      {
        i1 = 255 - paramInt2;
        paramInt2 = i1;
        if (i1 == 0)
          paramInt2 = 1;
        this.a.b(paramInt1, paramInt2);
        AppMethodBeat.o(99333);
        break;
      }
    }
  }

  public void c(String paramString)
  {
    this.A = paramString;
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(99343);
    if (this.C == paramBoolean)
      AppMethodBeat.o(99343);
    while (true)
    {
      return;
      this.C = paramBoolean;
      if (this.a != null)
        this.a.a(paramBoolean);
      AppMethodBeat.o(99343);
    }
  }

  public fw d()
  {
    return this.h;
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(99351);
    if (this.a != null)
      this.a.c(paramInt);
    AppMethodBeat.o(99351);
  }

  public void d(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99365);
    if (this.a != null)
      this.a.d(paramInt1, paramInt2);
    AppMethodBeat.o(99365);
  }

  public void d(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(99347);
    this.w = paramBoolean;
    if (this.L)
      if ((paramBoolean) && (this.c.t()))
      {
        paramBoolean = bool1;
        l(paramBoolean);
        AppMethodBeat.o(99347);
      }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      if (!paramBoolean)
      {
        paramBoolean = bool2;
        if (!this.c.t());
      }
      else
      {
        paramBoolean = true;
      }
      l(paramBoolean);
      AppMethodBeat.o(99347);
    }
  }

  public gs e()
  {
    return this.o;
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(99358);
    if (this.a != null)
    {
      this.a.f(paramInt);
      this.s = true;
    }
    AppMethodBeat.o(99358);
  }

  public void e(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99367);
    if (this.a != null)
      this.a.c(paramInt1, paramInt2);
    AppMethodBeat.o(99367);
  }

  public void e(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }

  public gh f()
  {
    return this.a;
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(99359);
    if (this.a != null)
      this.a.g(paramInt);
    AppMethodBeat.o(99359);
  }

  public void f(boolean paramBoolean)
  {
    AppMethodBeat.i(99350);
    if (this.a != null)
      this.a.d(paramBoolean);
    AppMethodBeat.o(99350);
  }

  public Rect g()
  {
    return this.i;
  }

  public void g(boolean paramBoolean)
  {
    AppMethodBeat.i(99366);
    this.c.a(paramBoolean);
    AppMethodBeat.o(99366);
  }

  public float h()
  {
    AppMethodBeat.i(99314);
    float f1;
    if (this.l == null)
    {
      f1 = 1.0F;
      AppMethodBeat.o(99314);
    }
    while (true)
    {
      return f1;
      f1 = SystemUtil.getDensity(this.l);
      AppMethodBeat.o(99314);
    }
  }

  public void h(boolean paramBoolean)
  {
    AppMethodBeat.i(99374);
    if (this.r == null)
      AppMethodBeat.o(99374);
    while (true)
    {
      return;
      if (this.z == null)
        this.z = new ga(this, this.r.b());
      this.z.a(paramBoolean);
      AppMethodBeat.o(99374);
    }
  }

  public gh i()
  {
    return this.a;
  }

  public void i(boolean paramBoolean)
  {
    AppMethodBeat.i(99377);
    if (this.a != null)
      this.a.g(paramBoolean);
    AppMethodBeat.o(99377);
  }

  public void j(boolean paramBoolean)
  {
    AppMethodBeat.i(99378);
    if (this.a != null)
      this.a.h(paramBoolean);
    AppMethodBeat.o(99378);
  }

  public boolean j()
  {
    AppMethodBeat.i(99309);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(99309);
    }
    while (true)
    {
      return bool;
      bool = this.a.b();
      AppMethodBeat.o(99309);
    }
  }

  public Context k()
  {
    return this.l;
  }

  public void k(boolean paramBoolean)
  {
    AppMethodBeat.i(99379);
    if (this.c != null)
      this.c.c(paramBoolean);
    AppMethodBeat.o(99379);
  }

  public void l()
  {
    AppMethodBeat.i(99310);
    if (this.a == null)
    {
      AppMethodBeat.o(99310);
      return;
    }
    this.s = true;
    this.B = true;
    if (this.u)
    {
      this.c.c();
      this.u = false;
    }
    while (true)
    {
      if ((this.g != null) && (this.g.get() != null))
        ((ge)this.g.get()).a_();
      if (this.j)
        this.a.i();
      if ((this.k) && (this.d != null))
        this.d.d();
      if (this.z != null)
        this.z.c();
      AppMethodBeat.o(99310);
      break;
      this.c.d();
    }
  }

  public void m()
  {
    AppMethodBeat.i(99311);
    if (this.a == null)
      AppMethodBeat.o(99311);
    while (true)
    {
      return;
      this.s = false;
      this.B = false;
      if (this.z != null)
        this.z.d();
      this.c.e();
      this.a.j();
      if ((this.k) && (this.d != null))
        this.d.c();
      AppMethodBeat.o(99311);
    }
  }

  public void n()
  {
    AppMethodBeat.i(99312);
    this.c.b(this);
    if (this.y != null)
      this.y.a();
    this.c.f();
    this.u = true;
    if (this.z != null)
      this.z.e();
    if (this.d != null)
      this.d.f();
    if (this.a != null)
      this.a.a();
    this.l = null;
    AppMethodBeat.o(99312);
  }

  public gv o()
  {
    return this.m;
  }

  public Rect p()
  {
    return this.F;
  }

  public void q()
  {
    this.s = true;
  }

  public int r()
  {
    AppMethodBeat.i(99323);
    int i1;
    if (this.a != null)
    {
      i1 = this.a.d();
      AppMethodBeat.o(99323);
    }
    while (true)
    {
      return i1;
      i1 = -1;
      AppMethodBeat.o(99323);
    }
  }

  public void s()
  {
    AppMethodBeat.i(99324);
    if (this.a != null)
      this.a.e();
    AppMethodBeat.o(99324);
  }

  public void t()
  {
    AppMethodBeat.i(99325);
    if (this.a != null)
      this.a.f();
    AppMethodBeat.o(99325);
  }

  public String toString()
  {
    AppMethodBeat.i(99373);
    String str;
    if (this.o != null)
    {
      str = this.o.toString();
      AppMethodBeat.o(99373);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(99373);
    }
  }

  public boolean u()
  {
    return this.k;
  }

  public void v()
  {
    AppMethodBeat.i(99337);
    if (this.y == null)
      this.y = new gm.c(this);
    this.y.b();
    AppMethodBeat.o(99337);
  }

  public void w()
  {
    AppMethodBeat.i(99346);
    this.c.z();
    this.s = true;
    AppMethodBeat.o(99346);
  }

  public String[] x()
  {
    AppMethodBeat.i(99352);
    String[] arrayOfString;
    if (this.a != null)
    {
      arrayOfString = this.a.p();
      AppMethodBeat.o(99352);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = null;
      AppMethodBeat.o(99352);
    }
  }

  public MapLanguage y()
  {
    AppMethodBeat.i(99369);
    if (this.x == null)
      this.x = new gm.b(this);
    MapLanguage localMapLanguage = this.x.a();
    AppMethodBeat.o(99369);
    return localMapLanguage;
  }

  public gj z()
  {
    return this.f;
  }

  public static abstract interface a
  {
    public abstract void a(GL10 paramGL10);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gm
 * JD-Core Version:    0.6.2
 */