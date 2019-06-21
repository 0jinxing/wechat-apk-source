package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.d;
import com.tencent.map.lib.element.e;
import com.tencent.map.lib.f;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.map.lib.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bl;
import com.tencent.tencentmap.mapsdk.a.ck;
import com.tencent.tencentmap.mapsdk.a.cm;
import com.tencent.tencentmap.mapsdk.a.db;
import com.tencent.tencentmap.mapsdk.a.di;
import com.tencent.tencentmap.mapsdk.a.dl;
import com.tencent.tencentmap.mapsdk.a.dm;
import com.tencent.tencentmap.mapsdk.a.dm.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import javax.microedition.khronos.opengles.GL10;

public class ib extends hz
{
  private static final int[] w = { 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 3500, 2000, 1500, 1000, 720, 500, 320, 160, 80 };
  private boolean A;
  private boolean B;
  private int C;
  private GeoPoint D;
  private String E;
  private int F;
  private List<Integer> G;
  private int H;
  private final String R;
  private final float S;
  private if.b T;
  protected byte[] a;
  private d b;
  private dl c;
  private ArrayList<ib.a> d;
  private ArrayList<GeoPoint> e;
  private float f;
  private iz g;
  private boolean h;
  private int[] i;
  private int[] j;
  private int[] k;
  private int l;
  private dm.a m;
  private cm n;
  private int o;
  private if p;
  private float q;
  private ib.a r;
  private float s;
  private int t;
  private boolean u;
  private boolean v;
  private float x;
  private int y;
  private ArrayList<GeoPoint> z;

  public ib(iz paramiz)
  {
    AppMethodBeat.i(99769);
    this.b = null;
    this.c = null;
    this.a = new byte[0];
    this.d = null;
    this.e = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = -7829368;
    this.n = null;
    this.o = 12;
    this.r = null;
    this.s = 1.0F;
    this.t = 0;
    this.u = false;
    this.v = true;
    this.x = 0.0F;
    this.y = 0;
    this.A = false;
    this.B = false;
    this.C = -1;
    this.D = null;
    this.F = -1;
    this.H = 0;
    this.R = (A() + "_arrow_texture_");
    this.T = new ib.1(this);
    this.g = paramiz;
    this.d = new ArrayList();
    this.S = this.g.i().getResources().getDisplayMetrics().density;
    AppMethodBeat.o(99769);
  }

  private float a(ib.a parama1, ib.a parama2, GeoPoint paramGeoPoint, ib.a parama3)
  {
    AppMethodBeat.i(99788);
    int i1 = parama1.getLongitudeE6();
    int i2 = parama1.getLatitudeE6();
    int i3 = parama2.getLongitudeE6();
    int i4 = parama2.getLatitudeE6();
    int i5 = paramGeoPoint.getLongitudeE6();
    int i6 = paramGeoPoint.getLatitudeE6();
    float f1 = (i3 - i1) * (i5 - i1) + (i4 - i2) * (i6 - i2);
    if (f1 <= 0.0F)
    {
      parama3.setLatitudeE6(parama1.getLatitudeE6());
      parama3.setLongitudeE6(parama1.getLongitudeE6());
      parama3.a = parama1.a;
      f1 = (float)Math.hypot(i5 - i1, i6 - i2);
      AppMethodBeat.o(99788);
    }
    while (true)
    {
      return f1;
      double d1 = (i3 - i1) * (i3 - i1) + (i4 - i2) * (i4 - i2);
      if (f1 >= d1)
      {
        parama3.setLatitudeE6(parama2.getLatitudeE6());
        parama3.setLongitudeE6(parama2.getLongitudeE6());
        parama3.a = parama2.a;
        f1 = (float)Math.hypot(i5 - i3, i6 - i4);
        AppMethodBeat.o(99788);
      }
      else
      {
        f1 = (float)(f1 / d1);
        float f2 = i1;
        f2 = (i3 - i1) * f1 + f2;
        float f3 = i2;
        f3 = (i4 - i2) * f1 + f3;
        parama3.setLongitudeE6(Math.round(f2));
        parama3.setLatitudeE6(Math.round(f3));
        parama1.a += (parama2.a - parama1.a) * f1;
        f1 = (float)Math.hypot(i5 - f2, i6 - f3);
        AppMethodBeat.o(99788);
      }
    }
  }

  private int a(Context paramContext, cm paramcm)
  {
    int i1 = 0;
    AppMethodBeat.i(99802);
    if ((paramContext == null) || (paramcm == null))
      AppMethodBeat.o(99802);
    while (true)
    {
      return i1;
      paramcm = paramcm.a(paramContext);
      if (paramcm == null)
      {
        AppMethodBeat.o(99802);
      }
      else
      {
        int i2 = paramcm.getHeight();
        if (i2 <= 0)
        {
          AppMethodBeat.o(99802);
        }
        else
        {
          float f1 = SystemUtil.getDensity(paramContext);
          i1 = (int)(Math.pow(2.0D, 25.0D) / Math.pow(i2, 2.0D) / f1);
          AppMethodBeat.o(99802);
        }
      }
    }
  }

  private dm.a a(dm.a parama)
  {
    if (parama != dm.a.a);
    while (true)
    {
      return parama;
      if ((this.i != null) && (this.i.length > 0))
      {
        int i1 = 0;
        int i2 = this.i.length;
        while (true)
        {
          if (i1 >= i2)
            break label72;
          if ((this.i[i1] < 0) || (this.i[i1] >= this.o))
          {
            parama = dm.a.c;
            break;
          }
          i1++;
        }
        label72: parama = dm.a.b;
      }
      else if ((this.M < 0) || (this.M >= this.o))
      {
        parama = dm.a.c;
      }
      else
      {
        parama = dm.a.b;
      }
    }
  }

  private ib.a a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99801);
    float f1 = 3.4028235E+38F;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = new ib.a();
    Object localObject4 = localObject1;
    int i1;
    if (this.d != null)
    {
      localObject4 = localObject1;
      if (this.d.size() >= 2)
      {
        localObject4 = localObject1;
        if (paramGeoPoint != null)
        {
          localObject1 = (ib.a)this.d.get(0);
          i1 = 1;
          localObject4 = localObject2;
          if (i1 < this.d.size())
          {
            localObject4 = (ib.a)this.d.get(i1);
            float f2 = a((ib.a)localObject1, (ib.a)localObject4, paramGeoPoint, (ib.a)localObject3);
            if (f2 >= f1)
              break label155;
            localObject1 = new ib.a();
            f1 = f2;
            localObject2 = localObject3;
            localObject3 = localObject1;
          }
        }
      }
    }
    label155: 
    while (true)
    {
      i1++;
      localObject1 = localObject4;
      break;
      AppMethodBeat.o(99801);
      return localObject4;
    }
  }

  private ib.a a(ib.a parama1, ib.a parama2, float paramFloat)
  {
    AppMethodBeat.i(99786);
    ib.a locala = new ib.a();
    int i1 = parama2.getLongitudeE6();
    int i2 = parama1.getLongitudeE6();
    int i3 = parama2.getLatitudeE6();
    int i4 = parama1.getLatitudeE6();
    int i5 = parama1.getLatitudeE6();
    locala.setLatitudeE6(Math.round((i3 - i4) * paramFloat) + i5);
    i3 = parama1.getLongitudeE6();
    locala.setLongitudeE6(Math.round((i1 - i2) * paramFloat) + i3);
    parama1.a += (parama2.a - parama1.a) * paramFloat;
    AppMethodBeat.o(99786);
    return locala;
  }

  private void a(ie paramie)
  {
    AppMethodBeat.i(99800);
    this.p = paramie;
    this.p.a(this.T);
    this.p.a(null, null);
    if ((this.g != null) && (this.g.b() != null))
      this.g.b().a();
    AppMethodBeat.o(99800);
  }

  private void a(ih paramih)
  {
    AppMethodBeat.i(99799);
    if ((this.g == null) || (this.g.b() == null))
      AppMethodBeat.o(99799);
    while (true)
    {
      return;
      this.p = paramih;
      this.r = a(ic.a(paramih.g()));
      if (this.r == null)
      {
        paramih = new RuntimeException("Error, start point not found.");
        AppMethodBeat.o(99799);
        throw paramih;
      }
      paramih.a(this.T);
      paramih.a(null, null);
      this.g.b().a();
      AppMethodBeat.o(99799);
    }
  }

  private ArrayList<GeoPoint> c(List<ib.a> paramList)
  {
    AppMethodBeat.i(99785);
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() < 2))
    {
      AppMethodBeat.o(99785);
      return localArrayList;
    }
    float f1 = this.r.a;
    float f2 = this.x;
    float f3 = this.r.a;
    float f4 = this.s;
    float f5 = this.s;
    f4 = f1 - f4 * f1;
    f1 += (f2 - f3) * f5;
    Object localObject = null;
    int i1 = 0;
    label96: ib.a locala1;
    if (i1 < paramList.size())
    {
      locala1 = (ib.a)paramList.get(i1);
      if ((locala1.a > f4) && (locala1.a < f1))
      {
        if ((localObject != null) && (((ib.a)localObject).a < f4))
        {
          f5 = locala1.a;
          f3 = ((ib.a)localObject).a;
          ib.a locala2 = a((ib.a)localObject, locala1, (f4 - ((ib.a)localObject).a) / (f5 - f3));
          locala2.b = ((ib.a)localObject).b;
          localArrayList.add(locala2);
        }
        localArrayList.add(locala1);
      }
    }
    while (true)
    {
      i1++;
      localObject = locala1;
      break label96;
      if (locala1.a > f1)
      {
        if ((localObject != null) && (((ib.a)localObject).a < f1))
        {
          f4 = locala1.a;
          f5 = ((ib.a)localObject).a;
          paramList = a((ib.a)localObject, locala1, (f1 - ((ib.a)localObject).a) / (f4 - f5));
          paramList.b = locala1.b;
          localArrayList.add(paramList);
        }
        AppMethodBeat.o(99785);
        break;
      }
      if ((Float.compare(locala1.a, f4) == 0) || (Float.compare(locala1.a, f1) == 0))
        localArrayList.add(locala1);
    }
  }

  private int[][] d(List<GeoPoint> paramList)
  {
    AppMethodBeat.i(99787);
    int i1;
    if ((this.i == null) || (this.j == null) || (paramList == null) || (this.i.length == 0) || (this.j.length == 0) || (paramList.isEmpty()))
    {
      i1 = this.M;
      if (this.m != dm.a.b)
        break label524;
      i1 = e(i1);
    }
    label524: 
    while (true)
    {
      paramList = new int[2][1];
      paramList[0][0] = i1;
      paramList[1][0] = 0;
      AppMethodBeat.o(99787);
      return paramList;
      if ((this.i != null) && (this.j != null));
      for (int i2 = Math.min(this.i.length, this.j.length); ; i2 = 0)
      {
        int[] arrayOfInt = new int[i2];
        for (i1 = 0; i1 < i2; i1++)
        {
          arrayOfInt[i1] = this.i[i1];
          if (this.m == dm.a.b)
            arrayOfInt[i1] = e(arrayOfInt[i1]);
        }
        TreeMap localTreeMap = new TreeMap();
        Object localObject1 = (ib.a)paramList.get(0);
        i1 = 1;
        if (i1 < i2)
          if (((ib.a)localObject1).b <= this.j[i1])
            localTreeMap.put(Integer.valueOf(0), Integer.valueOf(arrayOfInt[(i1 - 1)]));
        for (int i3 = i1; ; i3 = 0)
        {
          int i4 = i3;
          if (i1 == i2)
          {
            i4 = i3;
            if (localTreeMap.size() == 0)
            {
              localTreeMap.put(Integer.valueOf(0), Integer.valueOf(arrayOfInt[(i2 - 1)]));
              i4 = i2;
            }
          }
          i3 = 1;
          i1 = i4;
          Object localObject2;
          for (i4 = i3; ; i4++)
          {
            if (i4 >= paramList.size())
              break label409;
            localObject2 = (ib.a)paramList.get(i4);
            i3 = i1;
            while (true)
              if ((i3 < i2) && (((ib.a)localObject2).b > this.j[i3]) && (((ib.a)localObject1).b <= this.j[i3]))
              {
                localTreeMap.put(Integer.valueOf(i4 - 1), Integer.valueOf(arrayOfInt[i3]));
                i1++;
                i3++;
                continue;
                i1++;
                break;
              }
            localObject1 = localObject2;
          }
          label409: i1 = localTreeMap.size();
          paramList = new int[2][i1];
          localObject1 = localTreeMap.entrySet().iterator();
          for (i1 = 0; ((Iterator)localObject1).hasNext(); i1++)
          {
            localObject2 = (Map.Entry)((Iterator)localObject1).next();
            paramList[0][i1] = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
            paramList[1][i1] = ((Integer)((Map.Entry)localObject2).getKey()).intValue();
          }
          AppMethodBeat.o(99787);
          break;
        }
      }
    }
  }

  private int e(int paramInt)
  {
    if (paramInt >= this.o)
      paramInt = this.o - 1;
    while (true)
    {
      int i1 = paramInt;
      if (paramInt < 0)
        i1 = 0;
      return i1;
    }
  }

  private void k()
  {
    AppMethodBeat.i(99775);
    if ((this.g == null) || (this.g.b() == null))
      AppMethodBeat.o(99775);
    while (true)
    {
      return;
      if (!a())
      {
        if (this.b != null)
        {
          this.g.b().b(this.b);
          this.b.B();
          this.b = null;
        }
        AppMethodBeat.o(99775);
      }
      else
      {
        if ((this.e != null) && (this.e.size() >= 2))
          break;
        AppMethodBeat.o(99775);
      }
    }
    if (this.b == null)
    {
      this.g.b();
      this.b = new d(m());
      this.g.b().a(this.b);
    }
    while (true)
    {
      this.b.a(this.C, this.D);
      this.g.b().a();
      AppMethodBeat.o(99775);
      break;
      this.b.a(m());
    }
  }

  private void l()
  {
    AppMethodBeat.i(99777);
    if ((this.g != null) && (this.g.b() != null) && (this.b != null))
    {
      this.g.b().b(this.b);
      this.b = null;
    }
    AppMethodBeat.o(99777);
  }

  private e m()
  {
    AppMethodBeat.i(99778);
    if ((this.g == null) || (this.g.b() == null))
    {
      locale = null;
      AppMethodBeat.o(99778);
      return locale;
    }
    e locale = new e();
    if ((this.n != null) && (this.n.a() != null))
      locale.a(this.n.a().a());
    int[][] arrayOfInt = d(this.e);
    locale.c(this.h);
    locale.d(this.F);
    locale.a(this.e);
    locale.a(this.l);
    int i1;
    float f1;
    label160: label167: int[] arrayOfInt1;
    if (this.t == 0)
    {
      i1 = a(this.g.i(), this.n);
      if (i1 > 0)
        if (this.K > i1)
        {
          f1 = i1;
          locale.b(f1);
          if (this.m == dm.a.c)
          {
            locale.b(true);
            if (this.f * 2.0F > this.K)
              this.f = (this.K / 3.0F);
            locale.c(this.f);
          }
          arrayOfInt1 = f();
          if (!this.v)
            break label438;
          locale.a(arrayOfInt[1]);
          if ((this.f <= 0.0F) || (arrayOfInt1 == null) || (arrayOfInt1.length <= 0))
            break label427;
          locale.a(arrayOfInt[0], arrayOfInt1);
        }
    }
    while (true)
    {
      locale.a(this.q);
      locale.b(this.t);
      locale.c((int)this.N);
      locale.e(this.u);
      if ((this.y > 0) && (this.y <= 3))
        locale.a(this.y, this.z);
      locale.f(this.A);
      locale.a(this.B);
      locale.d(this.v);
      locale.b(this.E);
      locale.b(this.G);
      locale.d(this.Q);
      AppMethodBeat.o(99778);
      break;
      f1 = this.K;
      break label160;
      locale.b(this.K);
      break label167;
      locale.b(this.K);
      break label167;
      label427: locale.b(arrayOfInt[0]);
      continue;
      label438: locale.a(new int[] { 0 });
      if ((this.f > 0.0F) && (arrayOfInt1 != null) && (arrayOfInt1.length > 0))
      {
        int i2 = this.M;
        i1 = arrayOfInt1[0];
        locale.a(new int[] { i2 }, new int[] { i1 });
      }
      else
      {
        locale.b(new int[] { this.M });
      }
    }
  }

  public float a(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2)
  {
    AppMethodBeat.i(99784);
    float f1 = 0.0F;
    float f2 = f1;
    if (paramGeoPoint1 != null)
    {
      f2 = f1;
      if (paramGeoPoint2 != null)
      {
        f2 = f1;
        if (paramGeoPoint1 != null)
        {
          int i1 = paramGeoPoint1.getLatitudeE6();
          int i2 = paramGeoPoint2.getLatitudeE6();
          int i3 = paramGeoPoint1.getLongitudeE6();
          int i4 = paramGeoPoint2.getLongitudeE6();
          f2 = (float)(Math.hypot(i1 - i2, i3 - i4) + 0.0D);
        }
      }
    }
    AppMethodBeat.o(99784);
    return f2;
  }

  public void a(float paramFloat)
  {
    this.q = paramFloat;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99794);
    if (this.b == null)
      AppMethodBeat.o(99794);
    while (true)
    {
      return;
      this.b.p();
      this.b.a(paramInt1, paramInt2);
      k();
      AppMethodBeat.o(99794);
    }
  }

  public void a(int paramInt, db paramdb)
  {
    AppMethodBeat.i(99795);
    paramdb = ic.a(paramdb);
    if ((paramInt == -1) || (paramdb == null))
      AppMethodBeat.o(99795);
    while (true)
    {
      return;
      this.C = paramInt;
      this.D = paramdb;
      c();
      AppMethodBeat.o(99795);
    }
  }

  public void a(int paramInt, List<db> paramList)
  {
    AppMethodBeat.i(99770);
    this.y = paramInt;
    if (paramList == null)
      AppMethodBeat.o(99770);
    while (true)
    {
      return;
      int i1 = paramList.size();
      if (i1 <= 0)
      {
        AppMethodBeat.o(99770);
      }
      else
      {
        this.z = new ArrayList();
        for (paramInt = 0; paramInt < i1; paramInt++)
        {
          Object localObject = (db)paramList.get(paramInt);
          if (localObject != null)
          {
            localObject = ic.a((db)localObject);
            if (localObject != null)
              this.z.add(localObject);
          }
        }
        AppMethodBeat.o(99770);
      }
    }
  }

  public void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99771);
    b.b(this.R + this.H);
    Object localObject = new StringBuilder().append(this.R);
    int i1 = this.H + 1;
    this.H = i1;
    localObject = i1;
    b.a((String)localObject, paramBitmap);
    this.E = ((String)localObject);
    AppMethodBeat.o(99771);
  }

  public void a(cm paramcm)
  {
    AppMethodBeat.i(99776);
    if ((this.g == null) || (this.g.b() == null) || (paramcm == null) || (paramcm.a() == null))
      AppMethodBeat.o(99776);
    while (true)
    {
      return;
      this.n = paramcm;
      paramcm = this.n.a(this.g.i());
      b.a(this.n.a().a(), paramcm);
      this.m = dm.a.b;
      AppMethodBeat.o(99776);
    }
  }

  public void a(dl paramdl)
  {
    this.c = paramdl;
  }

  public void a(dm paramdm)
  {
    AppMethodBeat.i(99773);
    if ((this.g == null) || (this.g.b() == null) || (paramdm == null))
    {
      AppMethodBeat.o(99773);
      return;
    }
    if (paramdm.f() == -1.0F)
      d(9.0F);
    while (true)
    {
      c(paramdm.g());
      c(paramdm.i());
      a(paramdm.k());
      a(paramdm.n());
      c(paramdm.l());
      a(paramdm.r());
      e(paramdm.o());
      b(paramdm.x());
      b(paramdm.y());
      this.k = paramdm.z();
      this.J = paramdm.j();
      this.t = paramdm.q();
      this.Q = paramdm.t();
      this.l = paramdm.d();
      if ((paramdm.m()) && (this.Q == di.a))
        this.Q = di.c;
      a(paramdm.e());
      a(paramdm.a(), paramdm.b());
      if (paramdm.u() != null)
        a(paramdm.u().a(this.g.i()));
      b(paramdm.v());
      this.v = paramdm.s();
      ck localck = paramdm.p();
      if (localck != null)
        a(localck.a);
      Object localObject = paramdm.h();
      if ((localObject != null) && (localObject.length == 2))
      {
        localck = localObject[0];
        localObject = localObject[1];
        if ((localck != null) && (localObject != null) && (localck.length == localObject.length))
          a(localck, (int[])localObject);
      }
      this.m = a(paramdm.c());
      k();
      AppMethodBeat.o(99773);
      break;
      d(paramdm.f());
    }
  }

  public void a(if paramif)
  {
    AppMethodBeat.i(99798);
    if (this.p != null)
    {
      this.p.b();
      this.p.a(null);
    }
    if ((paramif instanceof ih))
    {
      a((ih)paramif);
      AppMethodBeat.o(99798);
    }
    while (true)
    {
      return;
      if ((paramif instanceof ie))
      {
        a((ie)paramif);
        AppMethodBeat.o(99798);
      }
      else
      {
        this.p = null;
        AppMethodBeat.o(99798);
      }
    }
  }

  public void a(List<db> paramList)
  {
    AppMethodBeat.i(99772);
    this.x = 0.0F;
    this.d.clear();
    if (paramList == null)
      AppMethodBeat.o(99772);
    int i1;
    while (true)
    {
      return;
      i1 = paramList.size();
      if (i1 > 0)
        break;
      AppMethodBeat.o(99772);
    }
    Object localObject1 = null;
    this.e = new ArrayList();
    int i2 = 0;
    label65: if (i2 < i1)
    {
      Object localObject2 = (db)paramList.get(i2);
      if (localObject2 == null)
        break label190;
      localObject2 = ic.a((db)localObject2);
      if (localObject2 == null)
        break label190;
      localObject2 = new ib.a((GeoPoint)localObject2);
      this.e.add(localObject2);
      if (localObject1 != null)
      {
        this.x += a((GeoPoint)localObject2, (GeoPoint)localObject1);
        ((ib.a)localObject2).a = this.x;
        ((ib.a)localObject1).b += 1;
      }
      this.d.add(localObject2);
      localObject1 = localObject2;
    }
    label190: 
    while (true)
    {
      i2++;
      break label65;
      AppMethodBeat.o(99772);
      break;
    }
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99781);
    if (!a())
      AppMethodBeat.o(99781);
    while (true)
    {
      return;
      b(paramGL10);
      AppMethodBeat.o(99781);
    }
  }

  public void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(99792);
    this.i = paramArrayOfInt1;
    this.j = paramArrayOfInt2;
    this.m = a(dm.a.a);
    AppMethodBeat.o(99792);
  }

  public boolean a()
  {
    AppMethodBeat.i(99789);
    boolean bool;
    if (B() != null)
      if ((this.O) && (this.I))
      {
        bool = true;
        AppMethodBeat.o(99789);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99789);
      continue;
      bool = this.O;
      AppMethodBeat.o(99789);
    }
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99783);
    if ((this.g == null) || (this.g.b() == null) || (!a()))
      AppMethodBeat.o(99783);
    while (true)
    {
      return bool;
      if (this.b != null)
      {
        bool = this.b.a(this.g.b().t(), paramFloat1, paramFloat2);
        AppMethodBeat.o(99783);
      }
      else
      {
        AppMethodBeat.o(99783);
      }
    }
  }

  public void b()
  {
  }

  public void b(float paramFloat)
  {
    this.f = paramFloat;
  }

  public void b(int paramInt)
  {
    this.F = paramInt;
  }

  public void b(List<Integer> paramList)
  {
    this.G = paramList;
  }

  public void b(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }

  protected boolean b(GL10 paramGL10)
  {
    boolean bool = false;
    AppMethodBeat.i(99782);
    if ((this.g == null) || (this.g.b() == null))
      AppMethodBeat.o(99782);
    while (true)
    {
      return bool;
      if ((this.p != null) && (this.p.e()))
      {
        this.p.d();
        if ((this.p instanceof ih))
        {
          this.e = c(this.d);
          if (this.e.size() >= 2)
            k();
        }
        while (true)
        {
          this.g.b().a();
          if (this.p.f())
          {
            this.p.a(null);
            this.p = null;
          }
          bool = true;
          AppMethodBeat.o(99782);
          break;
          if ((this.p instanceof ie))
            k();
        }
      }
      AppMethodBeat.o(99782);
    }
  }

  public void c()
  {
    AppMethodBeat.i(99790);
    k();
    AppMethodBeat.o(99790);
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(99774);
    super.c(paramInt);
    AppMethodBeat.o(99774);
  }

  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public void d()
  {
    AppMethodBeat.i(99791);
    l();
    if (this.d != null)
    {
      this.d.clear();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.clear();
      this.e = null;
    }
    b.b(this.E);
    if ((this.n != null) && (this.n.a() != null))
      b.b(this.n.a().a());
    AppMethodBeat.o(99791);
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(99796);
    this.A = paramBoolean;
    if (this.b != null)
      this.b.a(paramBoolean);
    AppMethodBeat.o(99796);
  }

  public void e(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }

  public int[][] e()
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.i != null)
    {
      if (this.j != null)
        break label22;
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      label22: localObject2 = localObject1;
      if (this.i.length == this.j.length)
      {
        int i1 = this.i.length;
        localObject2 = new int[2][i1];
        localObject2[0] = this.i;
        localObject2[1] = this.j;
      }
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(99779);
    if (paramObject == null)
      AppMethodBeat.o(99779);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ib))
      {
        AppMethodBeat.o(99779);
      }
      else
      {
        paramObject = (ib)paramObject;
        bool = TextUtils.equals(A(), paramObject.A());
        AppMethodBeat.o(99779);
      }
    }
  }

  public int[] f()
  {
    return this.k;
  }

  public void g()
  {
    AppMethodBeat.i(99793);
    if (this.b == null)
      AppMethodBeat.o(99793);
    while (true)
    {
      return;
      this.b.p();
      AppMethodBeat.o(99793);
    }
  }

  public dl h()
  {
    return this.c;
  }

  public int hashCode()
  {
    AppMethodBeat.i(99780);
    int i1 = A().hashCode();
    AppMethodBeat.o(99780);
    return i1;
  }

  public Rect i()
  {
    AppMethodBeat.i(99797);
    Rect localRect = this.b.u();
    AppMethodBeat.o(99797);
    return localRect;
  }

  public d j()
  {
    return this.b;
  }

  public boolean r()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ib
 * JD-Core Version:    0.6.2
 */