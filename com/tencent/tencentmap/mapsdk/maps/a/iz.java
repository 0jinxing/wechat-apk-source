package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.basemap.data.b;
import com.tencent.map.lib.e;
import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.f;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aj.a;
import com.tencent.tencentmap.mapsdk.a.aj.c;
import com.tencent.tencentmap.mapsdk.a.aj.d;
import com.tencent.tencentmap.mapsdk.a.aj.e;
import com.tencent.tencentmap.mapsdk.a.aj.f;
import com.tencent.tencentmap.mapsdk.a.aj.g;
import com.tencent.tencentmap.mapsdk.a.aj.h;
import com.tencent.tencentmap.mapsdk.a.aj.i;
import com.tencent.tencentmap.mapsdk.a.aj.j;
import com.tencent.tencentmap.mapsdk.a.aj.k;
import com.tencent.tencentmap.mapsdk.a.aj.l;
import com.tencent.tencentmap.mapsdk.a.ak;
import com.tencent.tencentmap.mapsdk.a.ar.b;
import com.tencent.tencentmap.mapsdk.a.as;
import com.tencent.tencentmap.mapsdk.a.aw.a;
import com.tencent.tencentmap.mapsdk.a.bj;
import com.tencent.tencentmap.mapsdk.a.bo;
import com.tencent.tencentmap.mapsdk.a.cb;
import com.tencent.tencentmap.mapsdk.a.ch;
import com.tencent.tencentmap.mapsdk.a.cl;
import com.tencent.tencentmap.mapsdk.a.cp;
import com.tencent.tencentmap.mapsdk.a.cp.a;
import com.tencent.tencentmap.mapsdk.a.cw;
import com.tencent.tencentmap.mapsdk.a.cz;
import com.tencent.tencentmap.mapsdk.a.db;
import com.tencent.tencentmap.mapsdk.a.dd;
import com.tencent.tencentmap.mapsdk.a.de;
import com.tencent.tencentmap.mapsdk.a.dn;
import com.tencent.tencentmap.mapsdk.a.dp;
import com.tencent.tencentmap.mapsdk.a.dq;
import com.tencent.tencentmap.mapsdk.a.ds;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.t;
import com.tencent.tencentmap.mapsdk.a.v;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class iz extends gd
  implements aj.c, ip
{
  public float A;
  public float B;
  protected boolean C;
  protected boolean D;
  protected boolean E;
  protected boolean F;
  protected boolean G;
  protected boolean H;
  public Handler I;
  public volatile boolean J;
  public volatile boolean K;
  protected int L;
  public db M;
  public db N;
  public int O;
  public int P;
  public int Q;
  public int R;
  public int S;
  public int T;
  public int U;
  public boolean V;
  public hw W;
  private String X;
  private boolean Y;
  private List<hz> Z;
  private int aA;
  private int aB;
  private GeoPoint aC;
  private lq aD;
  private boolean aE;
  private float aF;
  private float aG;
  private boolean aH;
  private volatile boolean aI;
  private boolean aJ;
  private int aK;
  private int aL;
  private int aM;
  private boolean aN;
  private int aO;
  private int aP;
  private float aQ;
  private AtomicBoolean aR;
  private boolean aS;
  private boolean aT;
  private final gf aU;
  private com.tencent.map.lib.basemap.data.a aV;
  private boolean aW;
  private boolean aX;
  private jc aY;
  private ak aZ;
  private List<hz> aa;
  private List<hz> ab;
  private List<hz> ac;
  private bo ad;
  private ls ae;
  private jr af;
  private List<hz> ag;
  private lh ah;
  private ch ai;
  private li.a aj;
  private Map<Class<? extends hz>, cb> ak;
  private List<as> al;
  private aj.e am;
  private final gt an;
  private e ao;
  private final ft ap;
  private ar.b aq;
  private fv ar;
  private Handler as;
  private bj at;
  private com.tencent.map.lib.a au;
  private Comparator<hz> av;
  private Bitmap.Config aw;
  private boolean ax;
  private int ay;
  private int az;
  public byte[] b;
  private List<hx> ba;
  private List<MapPoi> bb;
  public hw c;
  public if d;
  public if e;
  public if f;
  public if g;
  protected volatile cw h;
  public int i;
  protected lf j;
  protected dp k;
  public cl l;
  public aj.h m;
  public aw.a n;
  public List<aj.c> o;
  public aj.j p;
  public volatile aj.i q;
  protected aj.f r;
  public aj.l s;
  public aj.g t;
  public aj.k u;
  protected final Handler v;
  public aj.a w;
  public aj.d x;
  public float y;
  public float z;

  public iz(gg paramgg, Context paramContext, ak paramak)
  {
    super(paramgg, paramContext);
    AppMethodBeat.i(99916);
    this.b = new byte[0];
    this.X = "";
    this.c = null;
    this.Y = false;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.i = 22;
    this.Z = new ArrayList();
    this.aa = new ArrayList();
    this.ab = new ArrayList();
    this.ac = new ArrayList();
    this.ae = null;
    this.ag = new ArrayList();
    this.ai = null;
    this.k = null;
    this.l = null;
    this.aj = null;
    this.ak = new HashMap();
    this.al = null;
    this.m = null;
    this.n = null;
    this.o = new CopyOnWriteArrayList();
    this.p = null;
    this.q = null;
    this.am = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.ao = new iq(this);
    this.w = null;
    this.x = null;
    this.aq = null;
    this.ar = new it(this);
    this.av = new iz.1(this);
    this.aw = Bitmap.Config.RGB_565;
    this.ax = true;
    this.ay = -2147483648;
    this.az = -2147483648;
    this.aA = -2147483648;
    this.aB = -2147483648;
    this.y = 0.5F;
    this.z = 0.5F;
    this.A = 0.5F;
    this.B = 0.5F;
    this.aC = null;
    this.aD = null;
    this.aE = false;
    this.aF = 100.0F;
    this.aG = 100.0F;
    this.aH = true;
    this.aI = false;
    this.aJ = false;
    this.aK = 10;
    this.aL = 0;
    this.aM = 0;
    this.aN = false;
    this.C = true;
    this.D = true;
    this.E = true;
    this.F = true;
    this.G = true;
    this.H = true;
    this.aO = 19;
    this.aP = 3;
    this.aQ = 0.0F;
    this.aR = new AtomicBoolean(false);
    this.I = null;
    this.aS = true;
    this.aT = true;
    this.J = false;
    this.K = false;
    this.L = 0;
    this.M = null;
    this.N = null;
    this.O = 0;
    this.P = 0;
    this.Q = 0;
    this.R = 0;
    this.S = 0;
    this.T = 0;
    this.U = 0;
    this.V = false;
    this.W = null;
    this.aW = false;
    this.aX = true;
    this.ba = new ArrayList();
    this.bb = new ArrayList();
    this.aZ = paramak;
    this.v = new in(this);
    this.ap = new is(this);
    this.ao = new iq(this);
    this.aU = new iv(this);
    this.ar = new it(this);
    this.an = new ir(this);
    this.aD = new lq();
    lq.a(paramContext);
    jp.a(paramContext);
    this.aO = b().c();
    this.aP = b().b();
    ll.a(paramContext);
    this.at = new lt();
    a(this.aU);
    b().a(this.an);
    b().a(this.ar);
    b().a(this.ao);
    b().a(this.ap);
    b().a(this);
    if (this.I == null)
      this.I = new Handler();
    paramgg = (WindowManager)i().getSystemService("window");
    this.T = paramgg.getDefaultDisplay().getWidth();
    this.U = paramgg.getDefaultDisplay().getHeight();
    this.ai = new ch(this);
    this.ae = new ls(this);
    if (paramak != null)
    {
      this.aE = paramak.c();
      this.V = paramak.i();
    }
    AppMethodBeat.o(99916);
  }

  private boolean U()
  {
    AppMethodBeat.i(99942);
    boolean bool = lq.d();
    AppMethodBeat.o(99942);
    return bool;
  }

  private void V()
  {
    AppMethodBeat.i(99970);
    while (true)
    {
      synchronized (this.b)
      {
        if (this.Z == null)
        {
          AppMethodBeat.o(99970);
          return;
        }
        Iterator localIterator = this.Z.iterator();
        if (localIterator.hasNext())
        {
          hz localhz = (hz)localIterator.next();
          if (localhz != null)
            localhz.d();
          localIterator.remove();
        }
      }
      this.aa.clear();
      this.ab.clear();
      this.ac.clear();
      AppMethodBeat.o(99970);
    }
  }

  private b[] W()
  {
    AppMethodBeat.i(99980);
    b localb1 = fp.a(b().t().a(new DoublePoint(0.0D, 0.0D)));
    b localb2 = fp.a(b().t().a(new DoublePoint(getWidth(), getHeight())));
    AppMethodBeat.o(99980);
    return new b[] { localb1, localb2 };
  }

  private void X()
  {
    AppMethodBeat.i(99981);
    if (m())
    {
      if (!(this.a instanceof View))
        break label107;
      if (this.aY == null)
      {
        this.aY = new jc((View)this.a, this);
        this.aY.b();
      }
      s.a((View)this.a, this.aY);
      AppMethodBeat.o(99981);
    }
    while (true)
    {
      return;
      if (this.aY != null)
      {
        s.a((View)this.a, null);
        this.aY.c();
        this.aY = null;
      }
      label107: AppMethodBeat.o(99981);
    }
  }

  private Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    AppMethodBeat.i(99969);
    if ((paramBitmap1 == null) || (paramBitmap1.isRecycled()) || (paramBitmap2 == null) || (paramBitmap2.isRecycled()))
      AppMethodBeat.o(99969);
    Bitmap localBitmap;
    for (paramBitmap1 = null; ; paramBitmap1 = localBitmap)
    {
      return paramBitmap1;
      localBitmap = Bitmap.createBitmap(paramBitmap1.getWidth(), paramBitmap1.getHeight(), paramBitmap1.getConfig());
      Canvas localCanvas = new Canvas(localBitmap);
      localCanvas.drawBitmap(paramBitmap1, new Matrix(), null);
      localCanvas.drawBitmap(paramBitmap2, this.ah.c().left, this.ah.c().top, null);
      AppMethodBeat.o(99969);
    }
  }

  private void a(ak paramak)
  {
    AppMethodBeat.i(99967);
    Context localContext = i().getApplicationContext();
    ds.a().a(localContext);
    r localr = r.a(localContext);
    v.a(localr.b());
    v.a(localr.c());
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramak != null)
    {
      localObject2 = localObject1;
      if (!StringUtil.isEmpty(paramak.h()))
        localObject2 = paramak.h();
    }
    v.a(localr.b((String)localObject2));
    v.a(localr.c((String)localObject2));
    v.a(localr.d());
    if (paramak != null)
    {
      if (paramak.a() == null)
        break label177;
      t.a(paramak.a());
    }
    while (true)
    {
      jn.a(localContext, (String)localObject2);
      this.au = new jg(this, (String)localObject2);
      a(this.au, il.a());
      b().b(hs.a());
      b().c(hs.d());
      AppMethodBeat.o(99967);
      return;
      label177: if (paramak.b() != null)
        t.b(paramak.b());
    }
  }

  private boolean a(db paramdb, b[] paramArrayOfb)
  {
    boolean bool = false;
    AppMethodBeat.i(99979);
    if (paramdb == null)
      AppMethodBeat.o(99979);
    while (true)
    {
      return bool;
      paramdb = fp.a(ic.a(paramdb));
      if ((paramdb.b() >= paramArrayOfb[0].b()) && (paramdb.b() <= paramArrayOfb[1].b()) && (paramdb.a() <= paramArrayOfb[0].a()) && (paramdb.a() >= paramArrayOfb[1].a()))
      {
        AppMethodBeat.o(99979);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(99979);
      }
    }
  }

  private boolean a(hz paramhz, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99919);
    boolean bool;
    if ((paramhz == null) || (!paramhz.a()) || (!paramhz.r()))
    {
      AppMethodBeat.o(99919);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!paramhz.a(paramFloat1, paramFloat2))
      {
        AppMethodBeat.o(99919);
        bool = false;
      }
      else
      {
        cb localcb = (cb)this.ak.get(paramhz.getClass());
        if (localcb != null)
        {
          bool = localcb.a(paramhz, true, b().t().a(new DoublePoint(paramFloat1, paramFloat2)));
          AppMethodBeat.o(99919);
        }
        else
        {
          AppMethodBeat.o(99919);
          bool = false;
        }
      }
    }
  }

  private void b(GL10 paramGL10)
  {
    AppMethodBeat.i(99918);
    while (true)
    {
      synchronized (this.b)
      {
        int i1 = this.Z.size();
        int i2 = 0;
        Object localObject1 = null;
        if (i2 < i1)
        {
          int i3 = i1;
          if (this.Z.size() > i1)
            i3 = this.Z.size();
          if (i2 >= this.Z.size())
            break label239;
          localhz = (hz)this.Z.get(i2);
          if (localhz != null)
          {
            if (TextUtils.equals(localhz.A(), this.X))
            {
              localObject2 = localhz;
              if (!localhz.a())
              {
                localObject2 = localhz;
                if (!this.aN)
                {
                  localhz.b();
                  localObject2 = localObject1;
                }
              }
              i2++;
              localObject1 = localObject2;
              i1 = i3;
              continue;
            }
            if ((localhz instanceof ia))
            {
              ((ia)localhz).a(b().z(), b().t(), paramGL10);
              localObject2 = localObject1;
              continue;
            }
            localhz.a(paramGL10);
          }
          Object localObject2 = localObject1;
          continue;
        }
        if (localObject1 != null)
          localObject1.a(paramGL10);
        AppMethodBeat.o(99918);
        return;
      }
      label239: hz localhz = null;
    }
  }

  private void c(GL10 paramGL10)
  {
    AppMethodBeat.i(99968);
    if (paramGL10 == null)
      AppMethodBeat.o(99968);
    while (true)
    {
      return;
      int i1 = this.T;
      int i2 = this.U;
      int[] arrayOfInt = new int[i1 * i2];
      Object localObject = new int[i1 * i2];
      IntBuffer localIntBuffer = IntBuffer.wrap(arrayOfInt);
      localIntBuffer.position(0);
      paramGL10.glReadPixels(0, 0, i1, i2, 6408, 5121, localIntBuffer);
      for (int i3 = 0; i3 < i2; i3++)
        for (int i4 = 0; i4 < i1; i4++)
        {
          int i5 = arrayOfInt[(i3 * i1 + i4)];
          localObject[((i2 - i3 - 1) * i1 + i4)] = (i5 & 0xFF00FF00 | i5 << 16 & 0xFF0000 | i5 >> 16 & 0xFF);
        }
      try
      {
        paramGL10 = Bitmap.createBitmap((int[])localObject, i1, i2, this.aw);
        localObject = paramGL10;
        if (this.a != null)
        {
          localObject = paramGL10;
          if (!(this.a instanceof iw))
          {
            localObject = paramGL10;
            if (this.ah.j())
              localObject = a(paramGL10, this.ah.i());
          }
        }
        this.as.sendMessage(this.as.obtainMessage(0, localObject));
        this.as = null;
        AppMethodBeat.o(99968);
      }
      catch (OutOfMemoryError paramGL10)
      {
        while (true)
          paramGL10 = null;
      }
    }
  }

  public void A()
  {
    AppMethodBeat.i(99946);
    if (this.I != null)
      this.I.removeCallbacksAndMessages(null);
    if (this.v != null)
      this.v.removeCallbacksAndMessages(null);
    if (this.as != null)
      this.as.removeCallbacksAndMessages(null);
    if (this.al != null)
    {
      this.al.clear();
      this.al = null;
    }
    V();
    if (this.ak != null)
      this.ak.clear();
    AppMethodBeat.o(99946);
  }

  public void B()
  {
    AppMethodBeat.i(99953);
    int i1 = b().h();
    this.aS = true;
    this.aT = true;
    if (i1 <= this.aP)
      this.aT = false;
    while (true)
    {
      if (this.aj != null)
      {
        li localli = new li();
        localli.a = 0;
        localli.b = this.aS;
        localli.c = this.aT;
        this.aj.a(localli);
      }
      AppMethodBeat.o(99953);
      return;
      if (i1 >= this.aO)
        this.aS = false;
    }
  }

  public void C()
  {
    AppMethodBeat.i(99954);
    if (this.aj != null)
    {
      li localli = new li();
      localli.a = 0;
      localli.b = this.aS;
      localli.c = this.aT;
      this.aj.a(localli);
    }
    AppMethodBeat.o(99954);
  }

  public lf D()
  {
    return this.j;
  }

  public ch E()
  {
    return this.ai;
  }

  public GeoPoint F()
  {
    AppMethodBeat.i(99957);
    if (this.aC == null)
    {
      if (this.ay == -2147483648)
        this.ay = (this.T / 2);
      if (this.az == -2147483648)
        this.az = (this.U / 2);
      localObject = new DoublePoint(this.ay, this.az);
      this.aC = b().t().a((DoublePoint)localObject);
    }
    Object localObject = this.aC;
    AppMethodBeat.o(99957);
    return localObject;
  }

  public int G()
  {
    return this.aA;
  }

  public int H()
  {
    return this.aB;
  }

  public int I()
  {
    return this.ay;
  }

  public int J()
  {
    return this.az;
  }

  public lh K()
  {
    return this.ah;
  }

  public void L()
  {
    AppMethodBeat.i(99960);
    if (this.af == null)
    {
      this.af = new jr(new jq(this));
      a(this.af);
      new jt(i().getApplicationContext(), this.af).a();
    }
    AppMethodBeat.o(99960);
  }

  public void M()
  {
    AppMethodBeat.i(99961);
    if (this.af != null)
    {
      this.af.e();
      this.af = null;
    }
    AppMethodBeat.o(99961);
  }

  public boolean N()
  {
    if (this.af != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean O()
  {
    return this.aW;
  }

  public ak P()
  {
    return this.aZ;
  }

  public com.tencent.map.lib.basemap.data.a Q()
  {
    AppMethodBeat.i(99971);
    b[] arrayOfb = R();
    Object localObject = fp.a(b().f());
    float f1 = b().h();
    if (this.aV == null)
      this.aV = new com.tencent.map.lib.basemap.data.a((b)localObject, arrayOfb, f1);
    while (true)
    {
      localObject = this.aV;
      AppMethodBeat.o(99971);
      return localObject;
      this.aV.a((b)localObject, arrayOfb, f1);
    }
  }

  public b[] R()
  {
    AppMethodBeat.i(99972);
    b[] arrayOfb = new b[8];
    float f1 = this.T;
    float f2 = this.U;
    if ((f1 <= 2.0F) || (f2 <= 2.0F))
    {
      arrayOfb = null;
      AppMethodBeat.o(99972);
    }
    while (true)
    {
      return arrayOfb;
      DoublePoint localDoublePoint1 = new DoublePoint(0.0D, 0.0D);
      DoublePoint localDoublePoint2 = new DoublePoint(f1 / 2.0F, 0.0D);
      DoublePoint localDoublePoint3 = new DoublePoint(f1, 0.0D);
      DoublePoint localDoublePoint4 = new DoublePoint(f1, f2 / 2.0F);
      DoublePoint localDoublePoint5 = new DoublePoint(f1, f2);
      DoublePoint localDoublePoint6 = new DoublePoint(f1 / 2.0F, f2);
      DoublePoint localDoublePoint7 = new DoublePoint(0.0D, f2);
      DoublePoint localDoublePoint8 = new DoublePoint(0.0D, f2 / 2.0F);
      for (int i1 = 0; i1 < 8; i1++)
        arrayOfb[i1] = fp.a(b().t().a(new DoublePoint[] { localDoublePoint1, localDoublePoint2, localDoublePoint3, localDoublePoint4, localDoublePoint5, localDoublePoint6, localDoublePoint7, localDoublePoint8 }[i1]));
      AppMethodBeat.o(99972);
    }
  }

  public List<hx> S()
  {
    AppMethodBeat.i(99977);
    this.ba.clear();
    Object localObject1 = W();
    Iterator localIterator = this.aa.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (hz)localIterator.next();
      if ((localObject2 instanceof hx))
      {
        localObject2 = (hx)localObject2;
        if (a(((hx)localObject2).y.e(), (b[])localObject1))
          this.ba.add(localObject2);
      }
    }
    localObject1 = this.ba;
    AppMethodBeat.o(99977);
    return localObject1;
  }

  public List<MapPoi> T()
  {
    AppMethodBeat.i(99978);
    this.bb.clear();
    this.bb = b().I();
    List localList = this.bb;
    AppMethodBeat.o(99978);
    return localList;
  }

  public cb a(Class<? extends hz> paramClass)
  {
    AppMethodBeat.i(99932);
    paramClass = (cb)this.ak.get(paramClass);
    AppMethodBeat.o(99932);
    return paramClass;
  }

  public de a(String paramString)
  {
    AppMethodBeat.i(99926);
    if (StringUtil.isEmpty(paramString))
    {
      AppMethodBeat.o(99926);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.b)
      {
        Iterator localIterator = this.Z.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            hz localhz = (hz)localIterator.next();
            if ((localhz.A().equals(paramString)) && ((localhz instanceof hx)))
            {
              paramString = ((hx)localhz).y;
              AppMethodBeat.o(99926);
              break;
            }
          }
        AppMethodBeat.o(99926);
        paramString = null;
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(99920);
    b().l();
    if (this.x != null)
      this.x.a();
    AppMethodBeat.o(99920);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(99955);
    if (this.aQ == paramFloat)
      AppMethodBeat.o(99955);
    while (true)
    {
      return;
      this.aQ = paramFloat;
      if (this.aj != null)
      {
        li localli = new li();
        localli.a = 1;
        localli.d = b().h();
        localli.e = b().t().a(new Point(0, this.U / 2), new Point(this.T, this.U / 2));
        this.aj.a(localli);
      }
      AppMethodBeat.o(99955);
    }
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(99950);
    this.aM = paramInt;
    b().e(this.aL + 52, paramInt + 52);
    h();
    AppMethodBeat.o(99950);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99917);
    if (this.al != null)
    {
      int i1 = this.al.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ??? = (as)this.al.get(i2);
        if (??? != null)
          ((as)???).a(paramInt1, paramInt2);
      }
    }
    if (this.b != null)
    {
      synchronized (this.b)
      {
        if (this.Z != null)
        {
          Iterator localIterator = this.Z.iterator();
          if (localIterator.hasNext())
            ((hz)localIterator.next()).z();
        }
      }
      AppMethodBeat.o(99917);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(99917);
    }
  }

  public void a(Context paramContext, ak paramak)
  {
    AppMethodBeat.i(99922);
    a(paramak);
    dq.a(paramContext);
    if (!b().g())
      b().a(0);
    while (true)
    {
      if (this.aE)
        L();
      AppMethodBeat.o(99922);
      return;
      b().a(5);
    }
  }

  public void a(Handler paramHandler, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(99923);
    this.as = paramHandler;
    this.aw = paramConfig;
    b().a();
    AppMethodBeat.o(99923);
  }

  public void a(aj.c paramc)
  {
    AppMethodBeat.i(99962);
    if ((this.o != null) && (paramc != null))
      this.o.add(paramc);
    if (paramc == null);
    for (boolean bool = true; ; bool = false)
    {
      i(bool);
      AppMethodBeat.o(99962);
      return;
    }
  }

  public void a(aj.f paramf)
  {
    this.r = paramf;
  }

  public void a(aj.k paramk)
  {
    this.u = paramk;
  }

  public void a(ar.b paramb)
  {
    this.aq = paramb;
  }

  public void a(as paramas)
  {
    AppMethodBeat.i(99935);
    if (paramas == null)
      AppMethodBeat.o(99935);
    while (true)
    {
      return;
      if (this.al == null)
        this.al = new ArrayList();
      if (this.al.contains(paramas) == true)
      {
        AppMethodBeat.o(99935);
      }
      else
      {
        this.al.add(paramas);
        AppMethodBeat.o(99935);
      }
    }
  }

  public void a(bo parambo)
  {
    if (parambo == null);
    while (true)
    {
      return;
      synchronized (this.b)
      {
        this.ad = parambo;
      }
    }
  }

  public void a(dn paramdn)
  {
    AppMethodBeat.i(99948);
    if (this.k == null)
      this.k = new dp();
    this.k.a(paramdn);
    AppMethodBeat.o(99948);
  }

  public void a(hx paramhx)
  {
    AppMethodBeat.i(99982);
    if ((paramhx != null) && ((paramhx instanceof hx)) && (this.aY != null))
      this.aY.a(paramhx);
    AppMethodBeat.o(99982);
  }

  public void a(lf paramlf)
  {
    this.j = paramlf;
  }

  public void a(lh paramlh)
  {
    AppMethodBeat.i(99959);
    this.ah = paramlh;
    a(new iz.2(this, paramlh));
    AppMethodBeat.o(99959);
  }

  public void a(li.a parama)
  {
    this.aj = parama;
  }

  public void a(Class<? extends hz> paramClass, cb paramcb)
  {
    AppMethodBeat.i(99931);
    this.ak.put(paramClass, paramcb);
    AppMethodBeat.o(99931);
  }

  public void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(99937);
    if ((paramString == null) || (paramString.equals("")))
    {
      AppMethodBeat.o(99937);
      return;
    }
    while (true)
    {
      int i5;
      synchronized (this.b)
      {
        int i1 = this.Z.size();
        int i2 = 0;
        int i3 = -1;
        i4 = i1;
        if (i2 < i1)
        {
          hz localhz = (hz)this.Z.get(i2);
          i5 = i4;
          if (localhz == null)
            break label231;
          if (localhz.D() > paramFloat)
            i4 = i2;
          i5 = i4;
          if (!TextUtils.equals(localhz.A(), paramString))
            break label231;
          i3 = i2;
          i2++;
          continue;
        }
        if ((i3 == -1) || (i3 == i4))
        {
          AppMethodBeat.o(99937);
          break;
        }
        i2 = i4;
        if (i4 >= i3)
          i2 = i4 - 1;
        paramString = (hz)this.Z.remove(i3);
        if (paramString == null)
        {
          AppMethodBeat.o(99937);
          break;
        }
        this.Z.add(i2, paramString);
        AppMethodBeat.o(99937);
      }
      label231: int i4 = i5;
    }
  }

  public void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(99924);
    a(paramString, paramBoolean, false);
    AppMethodBeat.o(99924);
  }

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    byte[] arrayOfByte = this.b;
    if (!paramBoolean2);
    try
    {
      this.X = paramString;
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public void a(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99964);
    super.a(paramGL10, paramInt1, paramInt2);
    this.T = paramInt1;
    this.U = paramInt2;
    d((int)(this.T * this.y), (int)(this.U * this.z));
    e((int)(this.T * this.A), (int)(this.U * this.B));
    if (this.aq != null)
      this.aq.a();
    AppMethodBeat.o(99964);
  }

  public void a(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(99963);
    super.a(paramGL10, paramEGLConfig);
    AppMethodBeat.o(99963);
  }

  public void a(boolean paramBoolean)
  {
    this.Y = paramBoolean;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99934);
    Object localObject;
    boolean bool;
    if (this.n != null)
    {
      localObject = c(paramFloat1, paramFloat2);
      if ((localObject != null) && (((String)localObject).trim().length() != 0))
      {
        this.n.a((String)localObject);
        bool = true;
        AppMethodBeat.o(99934);
      }
    }
    while (true)
    {
      return bool;
      if ((this.p != null) && (this.H))
      {
        localObject = new DoublePoint(paramFloat1, paramFloat2);
        localObject = ic.a(b().t().a((DoublePoint)localObject));
        this.p.a((db)localObject);
      }
      bool = false;
      AppMethodBeat.o(99934);
    }
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99943);
    if (this.n != null)
      this.n.a(paramMotionEvent);
    boolean bool = super.a(paramMotionEvent);
    AppMethodBeat.o(99943);
    return bool;
  }

  public boolean a(hz paramhz)
  {
    boolean bool = true;
    AppMethodBeat.i(99927);
    if (paramhz == null)
    {
      AppMethodBeat.o(99927);
      bool = false;
      return bool;
    }
    label266: 
    while (true)
    {
      synchronized (this.b)
      {
        int i1 = this.Z.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = i1;
        if (i2 < i1)
        {
          hz localhz = (hz)this.Z.get(i2);
          if ((localhz == null) || (i3 != 0) || (localhz.D() < paramhz.D()))
            break label266;
          i3 = 1;
          i4 = i2;
          i2++;
          continue;
        }
        this.Z.add(i4, paramhz);
        if ((paramhz != null) && (paramhz.B() != null))
        {
          if (this.h != null)
            paramhz.a(this.h);
          this.ag.add(paramhz);
        }
        if ((paramhz instanceof hx))
        {
          this.aa.add(paramhz);
          Collections.sort(this.aa, this.av);
          AppMethodBeat.o(99927);
          break;
        }
        if ((paramhz instanceof ib))
        {
          this.ab.add(paramhz);
          Collections.sort(this.ab, this.av);
        }
      }
      this.ac.add(paramhz);
      Collections.sort(this.ac, this.av);
    }
  }

  public boolean a(GL10 paramGL10)
  {
    AppMethodBeat.i(99966);
    b(paramGL10);
    boolean bool = super.a(paramGL10);
    if ((this.as != null) && (b() != null) && (b().H()) && (o() != null) && (o().c()) && (n()))
    {
      if (!this.aX)
        break label96;
      this.aX = false;
      this.ah.k();
      l();
    }
    while (true)
    {
      AppMethodBeat.o(99966);
      return bool;
      label96: c(paramGL10);
      this.ah.l();
      this.aX = true;
    }
  }

  public cb b(Class<? extends hz> paramClass)
  {
    AppMethodBeat.i(99933);
    paramClass = (cb)this.ak.remove(paramClass);
    AppMethodBeat.o(99933);
    return paramClass;
  }

  public hz b(String paramString)
  {
    AppMethodBeat.i(99938);
    synchronized (this.b)
    {
      int i1 = this.Z.size();
      int i2 = 0;
      Object localObject = null;
      while (i2 < i1)
      {
        hz localhz = (hz)this.Z.get(i2);
        localObject = localhz;
        if (localhz != null)
        {
          localObject = localhz;
          if (TextUtils.equals(localhz.A(), paramString))
            break;
          localObject = null;
        }
        i2++;
      }
      AppMethodBeat.o(99938);
      return localObject;
    }
  }

  public hz b(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(99928);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(99928);
      paramString = null;
      return paramString;
    }
    while (true)
    {
      synchronized (this.b)
      {
        Iterator localIterator = this.Z.iterator();
        if (localIterator.hasNext())
        {
          hz localhz = (hz)localIterator.next();
          if ((localhz == null) || (!TextUtils.equals(localhz.A(), paramString)))
            continue;
          localIterator.remove();
          paramString = localhz;
          if (paramBoolean)
          {
            localhz.d();
            paramString = localhz;
          }
          if (paramString != null)
          {
            this.aa.remove(paramString);
            this.ab.remove(paramString);
            this.ac.remove(paramString);
          }
          AppMethodBeat.o(99928);
        }
      }
      paramString = null;
    }
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99951);
    this.aL = paramInt1;
    this.aM = paramInt2;
    b().e(paramInt1 + 52, paramInt2 + 52);
    h();
    AppMethodBeat.o(99951);
  }

  public void b(dn paramdn)
  {
    AppMethodBeat.i(99949);
    if (this.k == null)
      AppMethodBeat.o(99949);
    while (true)
    {
      return;
      this.k.b(paramdn);
      AppMethodBeat.o(99949);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99936);
    while (true)
    {
      Object localObject6;
      int i1;
      synchronized (this.b)
      {
        Object localObject1 = (hx)b(this.X);
        boolean bool2;
        if (localObject1 != null)
        {
          localObject6 = ((hx)localObject1).z;
          if ((this.X.equals("")) || (localObject1 == null) || (localObject6 == null) || (!((hw)localObject6).j()))
            break label779;
          bool1 = ((hw)localObject6).a(paramFloat1, paramFloat2);
          if (!bool1)
            break label770;
          localObject1 = ((hx)localObject1).y;
          bool2 = bool1;
          if (bool1)
            break label756;
          i1 = this.aa.size() - 1;
          bool2 = bool1;
          if (i1 < 0)
            break label756;
          hx localhx = (hx)this.aa.get(i1);
          localObject9 = localhx.z;
          if ((localhx.A().equals(this.X)) || (localObject9 == null) || (!((hw)localObject9).j()))
            break label767;
          bool1 = ((hw)localObject9).a(paramFloat1, paramFloat2);
          if (bool1)
          {
            localObject6 = localhx.y;
            localObject1 = localObject9;
            bool2 = bool1;
            localObject9 = localObject1;
            if (!bool2)
              continue;
            if ((this.t != null) && (localObject6 != null) && (localObject9 != null) && (((de)localObject6).l()))
            {
              this.t.a((de)localObject6);
              this.t.a(((hw)localObject9).l, ((hw)localObject9).m, ((hw)localObject9).G, ((hw)localObject9).H);
            }
            AppMethodBeat.o(99936);
            bool1 = true;
            return bool1;
          }
        }
        else
        {
          localObject6 = null;
          continue;
        }
        i1--;
        continue;
        i1 = this.aa.size() - 1;
        bool1 = false;
        if (i1 >= 0)
        {
          bool2 = a((hz)this.aa.get(i1), paramFloat1, paramFloat2);
          bool1 = bool2;
          if (!bool2)
          {
            i1--;
            bool1 = bool2;
            continue;
          }
        }
        if (bool1)
        {
          AppMethodBeat.o(99936);
          continue;
        }
        i1 = this.ab.size() - 1;
        if (i1 >= 0)
        {
          bool2 = a((hz)this.ab.get(i1), paramFloat1, paramFloat2);
          bool1 = bool2;
          if (!bool2)
          {
            i1--;
            bool1 = bool2;
            continue;
          }
        }
        if (bool1)
        {
          AppMethodBeat.o(99936);
          continue;
        }
        i1 = this.ac.size() - 1;
        if (i1 >= 0)
        {
          bool2 = a((hz)this.ac.get(i1), paramFloat1, paramFloat2);
          bool1 = bool2;
          if (!bool2)
          {
            i1--;
            bool1 = bool2;
            continue;
          }
        }
        if (bool1)
        {
          AppMethodBeat.o(99936);
          continue;
        }
        if (this.Y)
        {
          localObject1 = this.b;
          i1 = 0;
        }
      }
      try
      {
        while (i1 < this.aa.size())
        {
          localObject6 = (hx)this.aa.get(i1);
          if (((hx)localObject6).z != null)
            ((hx)localObject6).z.d(false);
          i1++;
          continue;
          localObject2 = finally;
          throw localObject2;
        }
        if (e(paramFloat1, paramFloat2))
        {
          AppMethodBeat.o(99936);
          bool1 = true;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(99936);
      }
      if ((this.m != null) && (this.H))
      {
        Object localObject3 = new DoublePoint(paramFloat1, paramFloat2);
        localObject3 = ic.a(b().t().a((DoublePoint)localObject3));
        this.m.a((db)localObject3);
      }
      synchronized (this.b)
      {
        t();
        h();
        AppMethodBeat.o(99936);
        bool1 = false;
      }
      label756: Object localObject9 = ???;
      ??? = localObject4;
      continue;
      label767: continue;
      label770: ??? = null;
      Object localObject5 = null;
      continue;
      label779: ??? = null;
      localObject5 = null;
      boolean bool1 = false;
    }
  }

  protected boolean b(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99983);
    boolean bool;
    if (this.aY != null)
    {
      bool = this.aY.dispatchHoverEvent(paramMotionEvent);
      AppMethodBeat.o(99983);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99983);
    }
  }

  public String c(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99940);
    while (true)
    {
      synchronized (this.b)
      {
        int i1 = this.Z.size() - 1;
        if (i1 >= 0)
        {
          Object localObject1 = (hz)this.Z.get(i1);
          if ((localObject1 != null) && (((hz)localObject1).a()) && ((localObject1 instanceof hx)) && (((hz)localObject1).a(paramFloat1, paramFloat2)))
          {
            localObject1 = ((hz)localObject1).A();
            AppMethodBeat.o(99940);
            return localObject1;
          }
          i1--;
        }
      }
      Object localObject3 = null;
    }
  }

  public void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99956);
    if ((paramInt1 == 0) || (paramInt2 == 0))
      AppMethodBeat.o(99956);
    while (true)
    {
      return;
      if (this.aC == null)
      {
        GeoPoint localGeoPoint = b().f();
        this.aC = new GeoPoint(localGeoPoint.getLatitudeE6(), localGeoPoint.getLongitudeE6());
      }
      this.aC.setLatitudeE6(paramInt1);
      this.aC.setLongitudeE6(paramInt2);
      AppMethodBeat.o(99956);
    }
  }

  public void c(Class<? extends hz> paramClass)
  {
    AppMethodBeat.i(99947);
    if (paramClass == null)
      AppMethodBeat.o(99947);
    while (true)
    {
      return;
      synchronized (this.b)
      {
        Iterator localIterator = this.Z.iterator();
        while (localIterator.hasNext())
        {
          hz localhz = (hz)localIterator.next();
          if ((localhz != null) && (paramClass.isInstance(localhz)) && (!localhz.y()))
          {
            localhz.d();
            localIterator.remove();
            this.aa.remove(localhz);
            this.ab.remove(localhz);
            this.ac.remove(localhz);
          }
        }
      }
      b().a();
      AppMethodBeat.o(99947);
    }
  }

  public void c(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }

  public void d(int paramInt1, int paramInt2)
  {
    this.ay = paramInt1;
    this.az = paramInt2;
  }

  public void d(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99952);
    boolean bool;
    if (!this.H)
    {
      bool = false;
      AppMethodBeat.o(99952);
    }
    while (true)
    {
      return bool;
      bool = b().a(paramFloat1, paramFloat2);
      AppMethodBeat.o(99952);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99944);
    super.e();
    this.L = 0;
    this.K = false;
    X();
    if (this.ai != null)
      this.ai.b();
    AppMethodBeat.o(99944);
  }

  public void e(int paramInt1, int paramInt2)
  {
    this.aA = paramInt1;
    this.aB = paramInt2;
  }

  public void e(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99958);
    Object localObject1 = b().b(paramFloat1, paramFloat2);
    if (localObject1 != null)
      switch (((TappedElement)localObject1).type)
      {
      default:
        AppMethodBeat.o(99958);
      case 0:
      case 1:
      case 8:
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(99958);
      continue;
      Object localObject2;
      if (this.u != null)
      {
        if (((TappedElement)localObject1).itemType != 1)
          break label220;
        localObject2 = new cz();
        ((cz)localObject2).b = ((TappedElement)localObject1).buildingName;
        ((cz)localObject2).a = ((TappedElement)localObject1).buildingId;
        ((cz)localObject2).c = ((TappedElement)localObject1).floorName;
      }
      while (true)
      {
        ((dd)localObject2).d = ((TappedElement)localObject1).name;
        localObject1 = d.a(((TappedElement)localObject1).pixelX, ((TappedElement)localObject1).pixelY);
        if (localObject1 != null)
          ((dd)localObject2).e = new db(((GeoPoint)localObject1).getLatitudeE6() / 1000000.0D, ((GeoPoint)localObject1).getLongitudeE6() / 1000000.0D);
        this.u.a((dd)localObject2);
        AppMethodBeat.o(99958);
        bool = true;
        break;
        label220: localObject2 = new dd();
      }
      AppMethodBeat.o(99958);
    }
  }

  public void f(boolean paramBoolean)
  {
    this.G = paramBoolean;
  }

  public void g()
  {
    AppMethodBeat.i(99945);
    super.g();
    b().a(null);
    dq.a();
    if (this.o != null)
      this.o.clear();
    if (this.aY != null)
      this.aY.d();
    if (this.ae != null)
      this.ae.b();
    this.aJ = true;
    AppMethodBeat.o(99945);
  }

  public void g(boolean paramBoolean)
  {
    this.H = paramBoolean;
  }

  public void h(boolean paramBoolean)
  {
    AppMethodBeat.i(99939);
    this.aH = paramBoolean;
    b().f(paramBoolean);
    b().a();
    AppMethodBeat.o(99939);
  }

  public void i(boolean paramBoolean)
  {
    AppMethodBeat.i(99941);
    if ((!paramBoolean) || (U()))
    {
      b().a(this.an);
      AppMethodBeat.o(99941);
    }
    while (true)
    {
      return;
      b().a(null);
      AppMethodBeat.o(99941);
    }
  }

  public void j()
  {
    AppMethodBeat.i(99965);
    super.j();
    AppMethodBeat.o(99965);
  }

  public void j(boolean paramBoolean)
  {
    this.aW = paramBoolean;
  }

  public ls o()
  {
    return this.ae;
  }

  public void onCameraChange(cp paramcp)
  {
    AppMethodBeat.i(99975);
    if (this.o != null)
    {
      Iterator localIterator = this.o.iterator();
      while (localIterator.hasNext())
      {
        aj.c localc = (ip)localIterator.next();
        if (localc != null)
          localc.onCameraChange(paramcp);
      }
    }
    AppMethodBeat.o(99975);
  }

  public void onCameraChangeFinished(cp paramcp)
  {
    AppMethodBeat.i(99976);
    if (this.o != null)
    {
      Iterator localIterator = this.o.iterator();
      while (localIterator.hasNext())
      {
        aj.c localc = (ip)localIterator.next();
        if (localc != null)
          localc.onCameraChangeFinished(paramcp);
      }
    }
    AppMethodBeat.o(99976);
  }

  public boolean onIndoorBuildingDeactivated()
  {
    AppMethodBeat.i(99974);
    this.h = null;
    Iterator localIterator = this.ag.iterator();
    while (localIterator.hasNext())
      ((hz)localIterator.next()).C();
    AppMethodBeat.o(99974);
    return false;
  }

  public boolean onIndoorBuildingFocused()
  {
    return false;
  }

  public boolean onIndoorLevelActivated(cw paramcw)
  {
    AppMethodBeat.i(99973);
    this.h = paramcw;
    Iterator localIterator = this.ag.iterator();
    while (localIterator.hasNext())
      ((hz)localIterator.next()).a(paramcw);
    AppMethodBeat.o(99973);
    return false;
  }

  public cp p()
  {
    AppMethodBeat.i(99921);
    Object localObject1 = b();
    Object localObject2 = ((f)localObject1).f();
    if ((localObject2 == null) || (((this.o == null) || (this.o.size() <= 0)) && (this.aU == null)))
    {
      localObject1 = null;
      AppMethodBeat.o(99921);
    }
    while (true)
    {
      return localObject1;
      localObject2 = ic.a((GeoPoint)localObject2);
      float f1 = ((f)localObject1).q();
      float f2 = f1;
      if (f1 < 0.0F)
        f2 = f1 % 360.0F + 360.0F;
      f1 = ((f)localObject1).r();
      float f3 = ((f)localObject1).h();
      double d1 = ((f)localObject1).k();
      f3 = (float)(f3 + Math.log(d1) / Math.log(2.0D));
      localObject1 = cp.a().a(f3).a((db)localObject2).c(f2).b(f1).a();
      AppMethodBeat.o(99921);
    }
  }

  public GeoPoint q()
  {
    AppMethodBeat.i(99925);
    synchronized (this.b)
    {
      if ((this.X == null) || (this.X.trim().length() == 0))
        AppMethodBeat.o(99925);
      for (Object localObject1 = null; ; localObject1 = null)
      {
        return localObject1;
        localObject1 = b(this.X);
        if (localObject1 != null)
          break;
        AppMethodBeat.o(99925);
      }
      localObject1 = ((hx)localObject1).g();
      AppMethodBeat.o(99925);
    }
  }

  public String r()
  {
    synchronized (this.b)
    {
      String str = this.X;
      return str;
    }
  }

  public void s()
  {
    AppMethodBeat.i(99929);
    synchronized (this.b)
    {
      if (this.ad != null)
      {
        this.ad.e();
        this.ad = null;
      }
      AppMethodBeat.o(99929);
      return;
    }
  }

  public void t()
  {
    AppMethodBeat.i(99930);
    synchronized (this.b)
    {
      if (this.ad != null)
        this.ad.f();
      AppMethodBeat.o(99930);
      return;
    }
  }

  public boolean u()
  {
    synchronized (this.b)
    {
      if (this.ad != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public boolean v()
  {
    return this.aH;
  }

  public boolean w()
  {
    return this.D;
  }

  public boolean x()
  {
    return this.E;
  }

  public boolean y()
  {
    return this.F;
  }

  public boolean z()
  {
    return this.G;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iz
 * JD-Core Version:    0.6.2
 */