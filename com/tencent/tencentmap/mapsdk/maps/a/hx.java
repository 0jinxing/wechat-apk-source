package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.element.m;
import com.tencent.map.lib.f;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ac;
import com.tencent.tencentmap.mapsdk.a.aj.b;
import com.tencent.tencentmap.mapsdk.a.aj.l;
import com.tencent.tencentmap.mapsdk.a.bl;
import com.tencent.tencentmap.mapsdk.a.cl;
import com.tencent.tencentmap.mapsdk.a.cm;
import com.tencent.tencentmap.mapsdk.a.de;
import com.tencent.tencentmap.mapsdk.a.df;
import javax.microedition.khronos.opengles.GL10;

public class hx extends hz
{
  private boolean A;
  private boolean B;
  private int C;
  private int D;
  private boolean E;
  private GeoPoint F;
  private iz G;
  private l H;
  private cl R;
  private if S;
  private aj.l T;
  private View U;
  private View V;
  private ViewGroup W;
  private LinearLayout X;
  private boolean Y;
  private final int Z;
  protected Object a;
  private final int aa;
  private Runnable ab;
  private Runnable ac;
  private if.b ad;
  protected Bitmap b;
  boolean c;
  protected byte[] d;
  float e;
  float f;
  boolean g;
  protected float h;
  protected boolean i;
  protected float j;
  protected float k;
  protected float l;
  protected df m;
  protected String n;
  String o;
  protected GeoPoint p;
  protected GeoPoint q;
  protected GeoPoint r;
  protected float s;
  protected float t;
  protected float u;
  public boolean v;
  public boolean w;
  public boolean x;
  public de y;
  public hw z;

  public hx(iz paramiz)
  {
    AppMethodBeat.i(99645);
    this.a = null;
    this.b = null;
    this.c = false;
    this.d = new byte[0];
    this.e = 0.5F;
    this.f = 0.5F;
    this.g = false;
    this.h = 0.0F;
    this.i = false;
    this.j = 0.0F;
    this.k = 0.0F;
    this.l = -1.0F;
    this.m = null;
    this.n = null;
    this.o = null;
    this.A = false;
    this.p = null;
    this.q = null;
    this.r = null;
    this.s = 1.0F;
    this.t = 1.0F;
    this.u = 1.0F;
    this.v = false;
    this.w = false;
    this.x = true;
    this.B = false;
    this.C = 0;
    this.D = 0;
    this.E = false;
    this.F = null;
    this.G = null;
    this.y = null;
    this.R = null;
    this.S = null;
    this.U = null;
    this.V = null;
    this.W = null;
    this.X = null;
    this.Y = false;
    this.Z = 1;
    this.aa = 2;
    this.ab = new hx.1(this);
    this.ac = new hx.2(this);
    this.ad = new hx.3(this);
    this.G = paramiz;
    AppMethodBeat.o(99645);
  }

  private View a(View paramView)
  {
    AppMethodBeat.i(99678);
    if (this.G == null)
    {
      paramView = null;
      AppMethodBeat.o(99678);
    }
    while (true)
    {
      return paramView;
      if (this.W == null)
      {
        this.W = a(this.G.i());
        this.X = new LinearLayout(this.G.i());
        this.X.setGravity(17);
        this.X.setOrientation(1);
        this.X.setPadding(10, 10, 10, 30);
        this.W.addView(this.X, new LinearLayout.LayoutParams(-2, -2));
      }
      if (this.X != null)
      {
        this.X.removeAllViews();
        this.X.addView(paramView);
      }
      paramView = this.W;
      AppMethodBeat.o(99678);
    }
  }

  private LinearLayout a(Context paramContext)
  {
    AppMethodBeat.i(99680);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    Bitmap localBitmap = ic.b(paramContext, "marker_infowindow.9.png");
    if (localBitmap != null)
    {
      byte[] arrayOfByte = localBitmap.getNinePatchChunk();
      localLinearLayout.setBackgroundDrawable(new NinePatchDrawable(paramContext.getResources(), localBitmap, arrayOfByte, new Rect(), null));
    }
    AppMethodBeat.o(99680);
    return localLinearLayout;
  }

  private void a(ViewGroup paramViewGroup, Context paramContext)
  {
    AppMethodBeat.i(99681);
    if ((paramViewGroup == null) || (paramContext == null))
      AppMethodBeat.o(99681);
    while (true)
    {
      return;
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setGravity(17);
      localLinearLayout.setOrientation(1);
      localLinearLayout.setPadding(10, 10, 10, 30);
      TextView localTextView = new TextView(paramContext);
      localTextView.setGravity(3);
      localTextView.setId(1);
      localTextView.setTextColor(-16777216);
      localTextView.setText("Title");
      localLinearLayout.addView(localTextView, new LinearLayout.LayoutParams(-2, -2));
      paramContext = new TextView(paramContext);
      paramContext.setGravity(3);
      paramContext.setId(2);
      paramContext.setTextColor(-16777216);
      paramContext.setText("Snippet");
      localLinearLayout.addView(paramContext, new LinearLayout.LayoutParams(-2, -2));
      paramViewGroup.addView(localLinearLayout);
      AppMethodBeat.o(99681);
    }
  }

  private void a(de paramde)
  {
    AppMethodBeat.i(99676);
    if (this.U == null)
      this.U = c(paramde);
    while (true)
    {
      this.V = this.U;
      AppMethodBeat.o(99676);
      return;
      b(paramde);
    }
  }

  private void a(String paramString)
  {
    synchronized (this.d)
    {
      this.n = paramString;
      return;
    }
  }

  private void b(de paramde)
  {
    AppMethodBeat.i(99677);
    if ((this.U == null) || (paramde == null))
    {
      AppMethodBeat.o(99677);
      return;
    }
    TextView localTextView = (TextView)this.U.findViewById(1);
    Object localObject;
    if (localTextView != null)
    {
      localObject = paramde.f();
      if (StringUtil.isEmpty((String)localObject))
        localTextView.setVisibility(8);
    }
    else
    {
      label58: localObject = (TextView)this.U.findViewById(2);
      if (localObject != null)
      {
        paramde = paramde.g();
        if (!StringUtil.isEmpty(paramde))
          break label153;
        ((TextView)localObject).setVisibility(8);
      }
    }
    while (true)
    {
      if (((localTextView != null) && (localTextView.getVisibility() == 8) && (localObject != null) && (((TextView)localObject).getVisibility() == 8)) || ((localTextView == null) && (localObject == null)))
        this.U = null;
      AppMethodBeat.o(99677);
      break;
      localTextView.setVisibility(0);
      localTextView.setText((CharSequence)localObject);
      break label58;
      label153: ((TextView)localObject).setVisibility(0);
      ((TextView)localObject).setText(paramde);
    }
  }

  private void b(df paramdf)
  {
    AppMethodBeat.i(99675);
    if ((this.G == null) || (paramdf == null) || (this.H != null))
      AppMethodBeat.o(99675);
    while (true)
    {
      return;
      m localm = new m();
      localm.a(ic.a(paramdf.b())).a(paramdf.k()).a(paramdf.f(), paramdf.g());
      Object localObject = Math.random();
      try
      {
        String str = paramdf.e().a().a();
        localObject = str;
        label101: localm.a((String)localObject, new Bitmap[] { paramdf.e().a(this.G.i()) }).a((int)paramdf.o()).b(paramdf.n()).b((int)paramdf.l()).d(this.B).c(paramdf.a()).e(paramdf.r()).a(paramdf.v()).c(paramdf.x());
        this.H = new l(localm);
        AppMethodBeat.o(99675);
      }
      catch (NullPointerException localNullPointerException)
      {
        break label101;
      }
    }
  }

  private View c(de paramde)
  {
    AppMethodBeat.i(99679);
    if (this.G == null)
    {
      AppMethodBeat.o(99679);
      paramde = null;
    }
    while (true)
    {
      return paramde;
      LinearLayout localLinearLayout = a(this.G.i());
      a(localLinearLayout, this.G.i());
      localLinearLayout.setVisibility(8);
      TextView localTextView = (TextView)localLinearLayout.findViewById(1);
      Object localObject;
      if (localTextView != null)
      {
        localObject = paramde.f();
        if (StringUtil.isEmpty((String)localObject))
          localTextView.setVisibility(8);
      }
      else
      {
        label86: localObject = (TextView)localLinearLayout.findViewById(2);
        if (localObject != null)
        {
          paramde = paramde.g();
          if (!StringUtil.isEmpty(paramde))
            break label182;
          ((TextView)localObject).setVisibility(8);
        }
      }
      while (true)
      {
        if (((localTextView == null) || (localTextView.getVisibility() != 8) || (localObject == null) || (((TextView)localObject).getVisibility() != 8)) && ((localTextView != null) || (localObject != null)))
          break label197;
        AppMethodBeat.o(99679);
        paramde = null;
        break;
        localTextView.setVisibility(0);
        localTextView.setText((CharSequence)localObject);
        break label86;
        label182: ((TextView)localObject).setVisibility(0);
        ((TextView)localObject).setText(paramde);
      }
      label197: AppMethodBeat.o(99679);
      paramde = localLinearLayout;
    }
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(99651);
    this.h = paramFloat;
    if (this.H != null)
      this.H.b((int)this.h);
    AppMethodBeat.o(99651);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99671);
    this.C = paramInt1;
    this.D = paramInt2;
    if (this.H != null)
    {
      c(true);
      GeoPoint localGeoPoint = new GeoPoint(this.D, this.C);
      this.H.a(localGeoPoint);
    }
    AppMethodBeat.o(99671);
  }

  protected void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99653);
    synchronized (this.d)
    {
      this.b = paramBitmap;
      if (this.n == null)
        this.n = paramBitmap.toString();
      if (this.H != null)
        this.H.a(this.n, new Bitmap[] { this.b });
      AppMethodBeat.o(99653);
      return;
    }
  }

  public void a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99648);
    if (paramGeoPoint == null)
    {
      AppMethodBeat.o(99648);
      return;
    }
    if (this.p == null)
      this.p = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    while (true)
    {
      this.A = true;
      if (this.H != null)
        this.H.a(this.p);
      AppMethodBeat.o(99648);
      break;
      this.p.setLatitudeE6(paramGeoPoint.getLatitudeE6());
      this.p.setLongitudeE6(paramGeoPoint.getLongitudeE6());
    }
  }

  public void a(ac paramac, aj.b paramb)
  {
    AppMethodBeat.i(99684);
    View localView = paramb.a(this.y);
    if (localView == null)
    {
      paramb = paramb.b(this.y);
      if (paramb == null)
      {
        a(this.y);
        this.V = this.U;
        AppMethodBeat.o(99684);
      }
      while (true)
      {
        return;
        paramb = a(paramb);
        if (this.V != null)
        {
          if (!this.V.equals(paramb))
          {
            if (paramac.indexOfChild(this.V) >= 0)
              paramac.removeView(this.V);
            this.V = paramb;
            AppMethodBeat.o(99684);
          }
        }
        else
        {
          this.V = paramb;
          AppMethodBeat.o(99684);
        }
      }
    }
    if (this.V != null)
      if (!this.V.equals(localView))
        if (paramac.indexOfChild(this.V) >= 0)
          paramac.removeView(this.V);
    for (this.V = localView; ; this.V = localView)
    {
      if ((this.V != null) && (this.V.getLayoutParams() == null))
      {
        paramac = new FrameLayout.LayoutParams(-2, -2);
        this.V.setLayoutParams(paramac);
      }
      AppMethodBeat.o(99684);
      break;
    }
  }

  public void a(cm paramcm)
  {
    AppMethodBeat.i(99647);
    if ((this.G == null) || (paramcm == null))
      AppMethodBeat.o(99647);
    while (true)
    {
      return;
      bl localbl = paramcm.a();
      if ((localbl != null) && (this.G != null))
      {
        paramcm = localbl.a(this.G.i());
        a(localbl.a());
        b(paramcm);
      }
      AppMethodBeat.o(99647);
    }
  }

  public void a(df paramdf)
  {
    AppMethodBeat.i(99646);
    if (paramdf == null)
      AppMethodBeat.o(99646);
    while (true)
    {
      return;
      this.m = paramdf;
      a(ic.a(paramdf.b()));
      b(paramdf.f(), paramdf.g());
      a(paramdf.i());
      a(paramdf.o());
      a(paramdf.e());
      b(paramdf.k());
      c(paramdf.l());
      a_(paramdf.x());
      this.J = paramdf.m();
      this.a = paramdf.u();
      b(paramdf);
      AppMethodBeat.o(99646);
    }
  }

  public void a(if paramif)
  {
    AppMethodBeat.i(99662);
    this.S = paramif;
    if (this.S != null)
      this.S.a(this.ad);
    AppMethodBeat.o(99662);
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99656);
    if (this.G == null)
      AppMethodBeat.o(99656);
    while (true)
    {
      return;
      if (!a())
      {
        b();
        AppMethodBeat.o(99656);
      }
      else
      {
        f();
        b(paramGL10);
        if (this.G.b() != null)
        {
          paramGL10 = this.G.b().z();
          if ((paramGL10 != null) && (this.H != null))
            this.H.b(paramGL10, this.G.b().t());
        }
        w();
        AppMethodBeat.o(99656);
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99659);
    this.O = paramBoolean;
    if (this.H != null)
      this.H.a(paramBoolean);
    if ((this.G != null) && (this.G.b() != null))
      this.G.b().a();
    AppMethodBeat.o(99659);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(99683);
    if (this.G == null)
      AppMethodBeat.o(99683);
    while (true)
    {
      return;
      this.g = false;
      Bitmap localBitmap = ht.a(this.V);
      if (localBitmap == null)
      {
        AppMethodBeat.o(99683);
        continue;
      }
      synchronized (this.G.b)
      {
        if (this.z == null)
        {
          hw localhw = new com/tencent/tencentmap/mapsdk/maps/a/hw;
          localhw.<init>(this.G);
          this.z = localhw;
          if (paramBoolean2)
          {
            this.z.d(true);
            this.G.W = this.z;
          }
          this.z.c(true);
        }
        if (!paramBoolean1)
        {
          this.z.d(true);
          this.G.W = this.z;
        }
        this.z.b(localBitmap);
        this.z.b(d(false), d(true));
        this.z.a(q());
        if (this.G.f != null)
          this.z.a(this.G.q());
        if (this.G.b() != null)
          this.G.b().a();
        AppMethodBeat.o(99683);
      }
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(99658);
    boolean bool;
    if (B() != null)
      if ((this.O) && (this.I))
      {
        bool = true;
        AppMethodBeat.o(99658);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99658);
      continue;
      bool = this.O;
      AppMethodBeat.o(99658);
    }
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99657);
    if ((this.G == null) || (!this.x))
      AppMethodBeat.o(99657);
    while (true)
    {
      return bool;
      if (this.H != null)
      {
        bool = this.H.a(this.G.b().t(), paramFloat1, paramFloat2);
        if ((bool) && (this.T != null))
          this.T.a(this.y);
        AppMethodBeat.o(99657);
      }
      else
      {
        AppMethodBeat.o(99657);
      }
    }
  }

  public void a_(int paramInt)
  {
    AppMethodBeat.i(99649);
    super.a_(paramInt);
    if (this.H != null)
      this.H.a(paramInt);
    if (this.z != null)
      this.H.a(paramInt);
    AppMethodBeat.o(99649);
  }

  public void b()
  {
    AppMethodBeat.i(99660);
    if (this.H != null)
      this.H.g();
    AppMethodBeat.o(99660);
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(99668);
    this.s = paramFloat;
    if (this.H != null)
      this.H.a(paramFloat);
    AppMethodBeat.o(99668);
  }

  public void b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99652);
    float f1;
    if (paramFloat1 > 1.0F)
    {
      f1 = 1.0F;
      if (paramFloat2 <= 1.0F)
        break label124;
      paramFloat1 = 1.0F;
      label22: if ((f1 == this.e) && (paramFloat1 == this.f))
        break label137;
    }
    label137: for (boolean bool = true; ; bool = false)
    {
      this.g = bool;
      this.e = f1;
      this.f = paramFloat1;
      if (this.H != null)
        this.H.a(this.e, this.f);
      if ((this.z != null) && (this.z.j()))
        a(false, false);
      AppMethodBeat.o(99652);
      return;
      f1 = paramFloat1;
      if (paramFloat1 >= 0.0F)
        break;
      f1 = 0.0F;
      break;
      label124: paramFloat1 = paramFloat2;
      if (paramFloat2 >= 0.0F)
        break label22;
      paramFloat1 = 0.0F;
      break label22;
    }
  }

  public void b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99654);
    if (paramBitmap == null)
      AppMethodBeat.o(99654);
    while (true)
    {
      return;
      a(paramBitmap);
      i();
      AppMethodBeat.o(99654);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  protected boolean b(GL10 paramGL10)
  {
    boolean bool = false;
    AppMethodBeat.i(99667);
    if (this.G == null)
      AppMethodBeat.o(99667);
    while (true)
    {
      return bool;
      if (this.S != null)
      {
        this.S.d();
        this.E = this.S.c();
        if ((this.E == true) && (this.G.b() != null))
          this.G.b().a();
        AppMethodBeat.o(99667);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(99667);
      }
    }
  }

  public void c()
  {
  }

  public void c(float paramFloat)
  {
    AppMethodBeat.i(99669);
    this.N = paramFloat;
    if (this.H != null)
      this.H.c((int)paramFloat);
    AppMethodBeat.o(99669);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(99670);
    this.B = paramBoolean;
    if (this.H != null)
      this.H.b(paramBoolean);
    AppMethodBeat.o(99670);
  }

  public int d(boolean paramBoolean)
  {
    AppMethodBeat.i(99673);
    int i1;
    if ((this.b != null) && (this.H != null))
    {
      i1 = this.b.getHeight();
      if (!paramBoolean)
      {
        i1 = (int)(i1 * this.H.c());
        AppMethodBeat.o(99673);
      }
    }
    while (true)
    {
      return i1;
      i1 = (int)(i1 * (1.0F - this.H.c()));
      AppMethodBeat.o(99673);
      continue;
      i1 = 0;
      AppMethodBeat.o(99673);
    }
  }

  public void d()
  {
    AppMethodBeat.i(99661);
    this.p = null;
    if (this.H != null)
      this.H.g();
    if (this.z != null)
      this.z.i();
    AppMethodBeat.o(99661);
  }

  public df e()
  {
    return this.m;
  }

  protected void f()
  {
    AppMethodBeat.i(99650);
    if ((this.G == null) || (!this.w))
      AppMethodBeat.o(99650);
    while (true)
    {
      return;
      a(this.G.F());
      AppMethodBeat.o(99650);
    }
  }

  public GeoPoint g()
  {
    return this.p;
  }

  public boolean h()
  {
    return this.g;
  }

  public void i()
  {
    AppMethodBeat.i(99655);
    synchronized (this.d)
    {
      if ((this.b != null) && (!this.b.isRecycled()))
        this.c = true;
      AppMethodBeat.o(99655);
      return;
    }
  }

  public boolean j()
  {
    AppMethodBeat.i(99663);
    boolean bool;
    if ((this.G == null) || (this.S == null))
    {
      bool = false;
      AppMethodBeat.o(99663);
    }
    while (true)
    {
      return bool;
      GeoPoint localGeoPoint1 = this.p;
      GeoPoint localGeoPoint2 = localGeoPoint1;
      if (this.B)
      {
        localGeoPoint2 = localGeoPoint1;
        if (this.G.b() != null)
        {
          localGeoPoint2 = this.G.b().t().a(new DoublePoint(this.C, this.D));
          this.F = new GeoPoint(localGeoPoint2);
        }
      }
      bool = this.S.a(localGeoPoint2, this.r);
      AppMethodBeat.o(99663);
    }
  }

  public Rect k()
  {
    AppMethodBeat.i(99664);
    Rect localRect;
    if ((this.H != null) && (this.G != null) && (this.G.b() != null))
    {
      localRect = this.H.a(this.G.b().t());
      AppMethodBeat.o(99664);
    }
    while (true)
    {
      return localRect;
      localRect = new Rect();
      AppMethodBeat.o(99664);
    }
  }

  public Rect l()
  {
    AppMethodBeat.i(99665);
    Rect localRect;
    if ((this.H != null) && (this.G != null) && (this.G.b() != null))
    {
      localRect = this.H.b(this.G.b().t());
      AppMethodBeat.o(99665);
    }
    while (true)
    {
      return localRect;
      localRect = new Rect();
      AppMethodBeat.o(99665);
    }
  }

  public String m()
  {
    AppMethodBeat.i(99666);
    Object localObject = e();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(99666);
    }
    while (true)
    {
      return localObject;
      localObject = ((df)localObject).w();
      AppMethodBeat.o(99666);
    }
  }

  public float n()
  {
    return this.h;
  }

  public boolean o()
  {
    return this.B;
  }

  public Point p()
  {
    AppMethodBeat.i(99672);
    Point localPoint = new Point(this.C, this.D);
    AppMethodBeat.o(99672);
    return localPoint;
  }

  public int q()
  {
    AppMethodBeat.i(99674);
    int i1;
    if ((this.b != null) && (this.H != null))
    {
      i1 = this.b.getWidth();
      i1 = (int)(i1 * this.H.b() - i1 * 0.5F);
      AppMethodBeat.o(99674);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(99674);
    }
  }

  public boolean r()
  {
    return true;
  }

  public boolean s()
  {
    return this.E;
  }

  public l t()
  {
    return this.H;
  }

  public void u()
  {
    AppMethodBeat.i(99682);
    if (this.G == null)
      AppMethodBeat.o(99682);
    while (true)
    {
      return;
      this.G.a("", true);
      this.G.b().a();
      synchronized (this.G.b)
      {
        if (this.z == null)
        {
          AppMethodBeat.o(99682);
          continue;
        }
        this.z.d(false);
        AppMethodBeat.o(99682);
      }
    }
  }

  public void v()
  {
    AppMethodBeat.i(99685);
    a(this.y);
    AppMethodBeat.o(99685);
  }

  public void w()
  {
    AppMethodBeat.i(99686);
    hw localhw = this.z;
    if ((localhw != null) && (localhw.j()))
      if (!o())
        break label95;
    label95: for (boolean bool = true; ; bool = false)
    {
      localhw.b(bool);
      localhw.b(g());
      localhw.a(e());
      if ((o()) && (!s()))
      {
        Point localPoint = p();
        localhw.a(localPoint.x, localPoint.y);
      }
      localhw.a(null);
      AppMethodBeat.o(99686);
      return;
    }
  }

  public boolean x()
  {
    AppMethodBeat.i(99687);
    Rect localRect = l();
    int i1 = this.G.getWidth();
    int i2 = this.G.getHeight();
    boolean bool;
    if ((localRect.left >= 0) && (localRect.top >= 0) && (localRect.right <= i1) && (localRect.bottom <= i2))
    {
      bool = true;
      AppMethodBeat.o(99687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99687);
    }
  }

  public boolean y()
  {
    AppMethodBeat.i(99688);
    boolean bool;
    if ((this.a != null) && ("AUTH_MARKER".equals(this.a.toString())))
    {
      bool = true;
      AppMethodBeat.o(99688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hx
 * JD-Core Version:    0.6.2
 */