package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.element.c;
import com.tencent.map.lib.element.d;
import com.tencent.map.lib.element.d.a;
import com.tencent.map.lib.gl.JNI;
import com.tencent.map.lib.gl.JNICallback.a;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.gl.JNICallback.h;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.map.lib.mapstructure.BlockRouteCityData;
import com.tencent.map.lib.mapstructure.CircleInfo;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.mapstructure.MaskLayer;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.mapstructure.TrafficRequestItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import javax.microedition.khronos.opengles.GL10;

public class gh
  implements JNICallback.a, JNICallback.e, JNICallback.h, fk, hg
{
  private static boolean i = true;
  private JNI a;
  private long b;
  private gu c;
  private hh d;
  private hg e;
  private JNICallback.e f;
  private gm g;
  private long h;
  private int j;
  private float k;
  private String l;
  private ReentrantReadWriteLock m;

  public gh(Context paramContext, gm paramgm)
  {
    AppMethodBeat.i(99049);
    this.h = 0L;
    this.j = 0;
    this.k = 1.0F;
    this.l = null;
    this.m = new ReentrantReadWriteLock();
    this.a = new JNI();
    this.d = new hh();
    this.d.a(this);
    this.g = paramgm;
    this.k = paramContext.getResources().getDisplayMetrics().density;
    if (i)
      hj.a(paramContext, "txmapengine");
    AppMethodBeat.o(99049);
  }

  private void G()
  {
    AppMethodBeat.i(99161);
    this.m.readLock().lock();
    AppMethodBeat.o(99161);
  }

  private void H()
  {
    AppMethodBeat.i(99162);
    this.m.readLock().unlock();
    AppMethodBeat.o(99162);
  }

  private void I()
  {
    AppMethodBeat.i(99163);
    this.m.writeLock().lock();
    AppMethodBeat.o(99163);
  }

  private void J()
  {
    AppMethodBeat.i(99164);
    this.m.writeLock().unlock();
    AppMethodBeat.o(99164);
  }

  public void A()
  {
    AppMethodBeat.i(99147);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeClearRouteNameSegments(this.b);
          H();
          AppMethodBeat.o(99147);
        }
        finally
        {
          AppMethodBeat.o(99147);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99147);
    }
  }

  public int B()
  {
    AppMethodBeat.i(99152);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (l1 == 0L)
      {
        H();
        n = 0;
        AppMethodBeat.o(99152);
      }
      while (true)
      {
        return n;
        try
        {
          n = this.a.nativeGetLanguage(this.b);
          H();
          AppMethodBeat.o(99152);
        }
        finally
        {
          AppMethodBeat.o(99152);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99152);
    }
  }

  public String C()
  {
    AppMethodBeat.i(99157);
    try
    {
      G();
      String str;
      if (this.b == 0L)
        str = "";
      while (true)
      {
        return str;
        str = this.a.nativeGetDataEngineVersion(this.b);
        H();
        AppMethodBeat.o(99157);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99157);
    }
  }

  public String D()
  {
    AppMethodBeat.i(99159);
    try
    {
      G();
      long l1 = this.b;
      String str;
      if (l1 == 0L)
      {
        H();
        str = null;
        AppMethodBeat.o(99159);
      }
      while (true)
      {
        return str;
        str = this.a.getMapEngineRenderStatus(this.b);
        H();
        AppMethodBeat.o(99159);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99159);
    }
  }

  public ArrayList<MapPoi> E()
  {
    AppMethodBeat.i(99160);
    try
    {
      G();
      long l1 = this.b;
      Object localObject1;
      if (l1 == 0L)
      {
        H();
        localObject1 = null;
        AppMethodBeat.o(99160);
      }
      while (true)
      {
        return localObject1;
        localObject1 = this.a.nativeGetPoisInScreen(this.b);
        H();
        AppMethodBeat.o(99160);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99160);
    }
  }

  public String F()
  {
    String str = this.l;
    this.l = null;
    return str;
  }

  public double a(Rect paramRect1, Rect paramRect2)
  {
    AppMethodBeat.i(99101);
    try
    {
      G();
      long l1 = this.b;
      double d1;
      if (0L == l1)
      {
        H();
        d1 = 1.0D;
        AppMethodBeat.o(99101);
      }
      while (true)
      {
        return d1;
        try
        {
          d1 = this.a.nativeGetTargetScale(this.b, paramRect1, paramRect2);
          H();
          AppMethodBeat.o(99101);
        }
        finally
        {
          AppMethodBeat.o(99101);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99101);
    }
    throw paramRect1;
  }

  public int a(d paramd)
  {
    AppMethodBeat.i(99080);
    while (true)
    {
      long l1;
      int n;
      int i1;
      boolean bool1;
      boolean bool2;
      Object localObject1;
      try
      {
        G();
        l1 = this.b;
        if (l1 == 0L)
        {
          H();
          return n;
        }
        H();
        i1 = paramd.m();
        bool1 = false;
        n = i1;
        if (i1 == 3)
        {
          n = 0;
          bool1 = true;
        }
        bool2 = false;
        localObject1 = paramd.c();
        if (localObject1[0] == 33)
        {
          n = 2;
          localObject1 = new int[0];
          if (paramd.z() == null)
            break label186;
          localObject2 = new int[paramd.z().size()];
          i1 = 0;
          localObject1 = localObject2;
          if (i1 >= paramd.z().size())
            break label186;
          localObject2[i1] = ((Integer)paramd.z().get(i1)).intValue();
          i1++;
        }
      }
      finally
      {
        H();
        AppMethodBeat.o(99080);
      }
      continue;
      label186: Object localObject2 = new int[0];
      if (paramd.f() != null)
      {
        int[] arrayOfInt = new int[paramd.f().length];
        for (i1 = 0; ; i1++)
        {
          localObject2 = arrayOfInt;
          if (i1 >= paramd.f().length)
            break;
          arrayOfInt[i1] = paramd.f()[i1];
        }
      }
      try
      {
        G();
        l1 = this.b;
        if (l1 == 0L)
        {
          H();
          n = -1;
          AppMethodBeat.o(99080);
        }
        else
        {
          try
          {
            n = this.a.nativeCreateLine(this.b, paramd.c(), paramd.b(), (GeoPoint[])paramd.a().toArray(new GeoPoint[0]), paramd.r(), paramd.n(), n, bool1, bool2, paramd.l(), paramd.j(), paramd.v(), paramd.d(), paramd.e(), (int[])localObject2, paramd.g(), (int[])localObject1, paramd.o(), paramd.A());
            H();
            AppMethodBeat.o(99080);
          }
          finally
          {
            AppMethodBeat.o(99080);
          }
        }
      }
      finally
      {
        H();
        AppMethodBeat.o(99080);
      }
    }
  }

  public int a(CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(99063);
    int n;
    if (this.b == 0L)
    {
      n = 0;
      AppMethodBeat.o(99063);
    }
    while (true)
    {
      return n;
      try
      {
        n = this.a.nativeAddCircle(this.b, paramCircleInfo);
        AppMethodBeat.o(99063);
      }
      finally
      {
        AppMethodBeat.o(99063);
      }
    }
    throw paramCircleInfo;
  }

  public int a(MaskLayer paramMaskLayer)
  {
    AppMethodBeat.i(99068);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (l1 == 0L)
      {
        H();
        n = 0;
        AppMethodBeat.o(99068);
      }
      while (true)
      {
        return n;
        n = this.a.nativeAddMaskLayer(this.b, paramMaskLayer);
        H();
        AppMethodBeat.o(99068);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99068);
    }
    throw paramMaskLayer;
  }

  public int a(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(99062);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (l1 == 0L)
      {
        H();
        n = 0;
        AppMethodBeat.o(99062);
      }
      while (true)
      {
        return n;
        try
        {
          n = this.a.nativeAddPolygon(this.b, paramPolygon2D);
          H();
          AppMethodBeat.o(99062);
        }
        finally
        {
          AppMethodBeat.o(99062);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99062);
    }
    throw paramPolygon2D;
  }

  public int a(String paramString, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99096);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1)
      {
        H();
        paramInt1 = 0;
        AppMethodBeat.o(99096);
      }
      while (true)
      {
        return paramInt1;
        try
        {
          paramInt1 = this.a.nativeAddMarker(this.b, paramString, paramDouble1, paramDouble2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramInt1, paramInt2);
          H();
          AppMethodBeat.o(99096);
        }
        finally
        {
          AppMethodBeat.o(99096);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99096);
    }
    throw paramString;
  }

  public int a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(99059);
    try
    {
      G();
      try
      {
        if (this.b == 0L)
        {
          H();
          paramInt = -1;
          AppMethodBeat.o(99059);
        }
        while (true)
        {
          return paramInt;
          paramInt = this.a.nativeRefreshTrafficData(this.b, paramArrayOfByte, paramInt, paramBoolean1, paramBoolean2);
          H();
          AppMethodBeat.o(99059);
        }
      }
      finally
      {
        AppMethodBeat.o(99059);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99059);
    }
    throw paramArrayOfByte;
  }

  public PointF a(byte[] paramArrayOfByte, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99072);
    try
    {
      G();
      if (this.b == 0L)
        paramArrayOfByte = new PointF();
      while (true)
      {
        return paramArrayOfByte;
        try
        {
          float[] arrayOfFloat = new float[2];
          this.a.nativeToScreenLocation(this.b, paramArrayOfByte, paramDouble1, paramDouble2, arrayOfFloat);
          paramArrayOfByte = new android/graphics/PointF;
          paramArrayOfByte.<init>(arrayOfFloat[0], arrayOfFloat[1]);
          H();
          AppMethodBeat.o(99072);
        }
        finally
        {
          AppMethodBeat.o(99072);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99072);
    }
    throw paramArrayOfByte;
  }

  public GeoPoint a(byte[] paramArrayOfByte, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99071);
    try
    {
      G();
      if (this.b == 0L)
        paramArrayOfByte = new GeoPoint();
      while (true)
      {
        return paramArrayOfByte;
        try
        {
          double[] arrayOfDouble = new double[2];
          this.a.nativeFromScreenLocation(this.b, paramArrayOfByte, paramFloat1, paramFloat2, arrayOfDouble);
          int n = (int)(arrayOfDouble[0] * 1000000.0D);
          int i1 = (int)(arrayOfDouble[1] * 1000000.0D);
          paramArrayOfByte = new com/tencent/map/lib/basemap/data/GeoPoint;
          paramArrayOfByte.<init>(i1, n);
          H();
          AppMethodBeat.o(99071);
        }
        finally
        {
          AppMethodBeat.o(99071);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99071);
    }
    throw paramArrayOfByte;
  }

  public TappedElement a(float paramFloat1, float paramFloat2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(99089);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return localObject1;
        try
        {
          Object localObject4 = this.a.nativeOnTap(this.b, paramFloat1, paramFloat2);
          if (localObject4 == null)
          {
            H();
            AppMethodBeat.o(99089);
            continue;
          }
          try
          {
            localObject4 = TappedElement.fromBytes((byte[])localObject4);
            localObject1 = localObject4;
          }
          catch (Exception localException)
          {
          }
        }
        finally
        {
          AppMethodBeat.o(99089);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99089);
    }
  }

  public String a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99078);
    try
    {
      G();
      if (this.b == 0L)
        paramGeoPoint = "";
      while (true)
      {
        return paramGeoPoint;
        byte[] arrayOfByte = this.a.nativeGetCityName(this.b, paramGeoPoint);
        if (arrayOfByte != null)
        {
          try
          {
            paramGeoPoint = new java/lang/String;
            paramGeoPoint.<init>(arrayOfByte, "GBK");
            paramGeoPoint = paramGeoPoint.trim();
          }
          catch (UnsupportedEncodingException paramGeoPoint)
          {
          }
        }
        else
        {
          paramGeoPoint = "";
          H();
          AppMethodBeat.o(99078);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99078);
    }
    throw paramGeoPoint;
  }

  public List<Integer> a(Rect paramRect, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(99148);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1)
      {
        H();
        AppMethodBeat.o(99148);
        paramRect = localObject;
      }
      while (true)
      {
        return paramRect;
        try
        {
          int[] arrayOfInt = new int[100];
          int n = this.a.nativeQueryCityCodeList(this.b, paramRect, paramInt, arrayOfInt, 100);
          if (n > 0)
          {
            paramRect = new java/util/ArrayList;
            paramRect.<init>(n);
            for (paramInt = 0; paramInt < n; paramInt++)
              paramRect.add(Integer.valueOf(arrayOfInt[paramInt]));
            H();
            AppMethodBeat.o(99148);
          }
          else
          {
            H();
            AppMethodBeat.o(99148);
            paramRect = localObject;
          }
        }
        finally
        {
          AppMethodBeat.o(99148);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99148);
    }
    throw paramRect;
  }

  public void a()
  {
    AppMethodBeat.i(99051);
    try
    {
      I();
      this.d.a();
      if (this.d != null)
        this.d.a(null);
      if (this.b != 0L);
      try
      {
        this.a.nativeDestroyEngine(this.b);
        this.b = 0L;
        return;
      }
      finally
      {
        AppMethodBeat.o(99051);
      }
    }
    finally
    {
      J();
      AppMethodBeat.o(99051);
    }
  }

  public void a(double paramDouble)
  {
    AppMethodBeat.i(99116);
    try
    {
      G();
      if (0L != this.b)
      {
        gm localgm = this.g;
        if (localgm != null)
          break label39;
      }
      while (true)
      {
        return;
        label39: this.a.nativeSetScale(this.b, paramDouble, false);
        H();
        AppMethodBeat.o(99116);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99116);
    }
  }

  public void a(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(99115);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99115);
    while (true)
    {
      return;
      this.g.a(new gh.18(this, paramDouble, paramBoolean));
      AppMethodBeat.o(99115);
    }
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(99128);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeSetRotate(this.b, paramFloat, false);
          H();
          AppMethodBeat.o(99128);
        }
        finally
        {
          AppMethodBeat.o(99128);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99128);
    }
  }

  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(99111);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99111);
    while (true)
    {
      return;
      this.g.a(new gh.16(this, paramFloat1, paramFloat2, paramBoolean));
      AppMethodBeat.o(99111);
    }
  }

  public void a(final int paramInt)
  {
    AppMethodBeat.i(99065);
    if ((this.b == 0L) || (paramInt < 0) || (this.g == null))
      AppMethodBeat.o(99065);
    while (true)
    {
      return;
      this.g.a(new gm.a()
      {
        public void a(GL10 paramAnonymousGL10)
        {
          AppMethodBeat.i(99016);
          gh.b(gh.this).nativeDeleteCircle(gh.a(gh.this), paramInt);
          AppMethodBeat.o(99016);
        }
      });
      AppMethodBeat.o(99065);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99067);
    try
    {
      G();
      Object localObject1;
      if ((this.b != 0L) && (paramInt1 >= 0))
      {
        localObject1 = this.g;
        if (localObject1 != null)
          break label43;
      }
      while (true)
      {
        return;
        label43: gm localgm = this.g;
        localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/gh$9;
        ((gh.9)localObject1).<init>(this, paramInt1, paramInt2);
        localgm.a((gm.a)localObject1);
        H();
        AppMethodBeat.o(99067);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99067);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99135);
    if ((this.b == 0L) || (this.g == null))
      AppMethodBeat.o(99135);
    while (true)
    {
      return;
      this.g.a(new gh.26(this, paramInt1, paramInt2, paramInt3));
      AppMethodBeat.o(99135);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99123);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99123);
    while (true)
    {
      return;
      this.g.a(new gh.24(this, paramInt1, paramInt2, paramInt3, paramInt4));
      AppMethodBeat.o(99123);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(99060);
    try
    {
      G();
      if (this.b != 0L);
      try
      {
        this.a.nativeCheckTrafficBlockCache(this.b, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
        return;
      }
      finally
      {
        AppMethodBeat.o(99060);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99060);
    }
  }

  public void a(int paramInt, CircleInfo paramCircleInfo)
  {
    AppMethodBeat.i(99064);
    if (this.b == 0L)
      AppMethodBeat.o(99064);
    while (true)
    {
      return;
      try
      {
        this.a.nativeUpdateCircle(this.b, paramInt, paramCircleInfo);
        AppMethodBeat.o(99064);
      }
      finally
      {
        AppMethodBeat.o(99064);
      }
    }
    throw paramCircleInfo;
  }

  public void a(int paramInt1, String paramString, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99097);
    if (0L == this.b)
      AppMethodBeat.o(99097);
    while (true)
    {
      return;
      this.g.a(new gh.6(this, paramInt1, paramString, paramDouble1, paramDouble2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramInt2, paramInt3));
      AppMethodBeat.o(99097);
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99081);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        if (paramInt == -1)
        {
          H();
          AppMethodBeat.o(99081);
          continue;
        }
        try
        {
          this.a.nativeDeleteLine(this.b, paramInt, paramBoolean);
          H();
          AppMethodBeat.o(99081);
        }
        finally
        {
          AppMethodBeat.o(99081);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99081);
    }
  }

  public void a(Rect paramRect1, Rect paramRect2, boolean paramBoolean)
  {
    AppMethodBeat.i(99102);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99102);
    while (true)
    {
      return;
      this.g.a(new gh.10(this, paramRect1, paramRect2, paramBoolean));
      AppMethodBeat.o(99102);
    }
  }

  public void a(GeoPoint paramGeoPoint, boolean paramBoolean)
  {
    AppMethodBeat.i(99112);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99112);
    while (true)
    {
      return;
      this.g.a(new gh.17(this, paramGeoPoint, paramBoolean));
      AppMethodBeat.o(99112);
    }
  }

  public void a(JNICallback.b paramb)
  {
    AppMethodBeat.i(99142);
    this.a.setHandDrawTileLoadCallback(paramb);
    AppMethodBeat.o(99142);
  }

  public void a(JNICallback.c paramc)
  {
    AppMethodBeat.i(99143);
    this.a.setHandDrawTileWriteCallback(paramc);
    AppMethodBeat.o(99143);
  }

  public void a(JNICallback.d paramd)
  {
    AppMethodBeat.i(99140);
    this.a.setHeatTileLoadCallback(paramd);
    AppMethodBeat.o(99140);
  }

  public void a(JNICallback.e parame)
  {
    this.f = parame;
  }

  public void a(JNICallback.j paramj)
  {
    AppMethodBeat.i(99141);
    this.a.setWorldTileLoadCallback(paramj);
    AppMethodBeat.o(99141);
  }

  public void a(JNICallback.k paramk)
  {
    AppMethodBeat.i(99144);
    this.a.setTileWriteCallback(paramk);
    AppMethodBeat.o(99144);
  }

  public void a(gu paramgu)
  {
    this.c = paramgu;
  }

  public void a(hf paramhf)
  {
    AppMethodBeat.i(99050);
    this.d.a(paramhf);
    AppMethodBeat.o(99050);
  }

  public void a(String paramString)
  {
    this.l = paramString;
  }

  public void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99158);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeSetBuildingToSpecificFloor(this.b, paramString1, paramString2);
        if (this.f != null)
          this.f.z();
        H();
        AppMethodBeat.o(99158);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99158);
    }
    throw paramString1;
  }

  public void a(final String paramString, final byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99092);
    this.g.a(new gm.a()
    {
      public void a(GL10 paramAnonymousGL10)
      {
        AppMethodBeat.i(99038);
        if (gh.a(gh.this) != 0L)
          gh.b(gh.this).nativeWriteMapDataBlock(gh.a(gh.this), paramString, paramArrayOfByte);
        AppMethodBeat.o(99038);
      }
    });
    if (this.e != null)
      this.e.a(paramString, paramArrayOfByte);
    AppMethodBeat.o(99092);
  }

  public void a(List<BlockRouteCityData> paramList)
  {
    AppMethodBeat.i(99150);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        if (paramList != null);
        try
        {
          if (paramList.isEmpty())
          {
            H();
            AppMethodBeat.o(99150);
          }
          else
          {
            int n = paramList.size();
            int[] arrayOfInt1 = new int[n];
            int[] arrayOfInt2 = new int[n];
            for (int i1 = 0; i1 < n; i1++)
            {
              BlockRouteCityData localBlockRouteCityData = (BlockRouteCityData)paramList.get(i1);
              if (localBlockRouteCityData != null)
              {
                arrayOfInt1[i1] = localBlockRouteCityData.cityCode;
                arrayOfInt2[i1] = localBlockRouteCityData.version;
              }
            }
            this.a.nativeLoadBlockRouteCityList(this.b, arrayOfInt1, arrayOfInt2, n);
            H();
            AppMethodBeat.o(99150);
          }
        }
        finally
        {
          AppMethodBeat.o(99150);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99150);
    }
    throw paramList;
  }

  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    AppMethodBeat.i(99146);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        if (paramList != null);
        try
        {
          if ((!paramList.isEmpty()) && (paramList1 != null) && (!paramList1.isEmpty()))
          {
            int n = paramList.size();
            byte[][] arrayOfByte = new byte[n][];
            for (int i1 = 0; i1 < n; i1++)
            {
              MapRouteSectionWithName localMapRouteSectionWithName = (MapRouteSectionWithName)paramList.get(i1);
              if (localMapRouteSectionWithName != null)
                arrayOfByte[i1] = localMapRouteSectionWithName.toBytes();
            }
            i1 = paramList1.size();
            this.a.nativeAddRouteNameSegments(this.b, arrayOfByte, n, (GeoPoint[])paramList1.toArray(new GeoPoint[i1]), i1);
          }
          H();
          AppMethodBeat.o(99146);
        }
        finally
        {
          AppMethodBeat.o(99146);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99146);
    }
    throw paramList;
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99075);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        gm localgm = this.g;
        gm.a local22 = new com/tencent/tencentmap/mapsdk/maps/a/gh$22;
        local22.<init>(this, paramBoolean);
        localgm.a(local22);
        H();
        AppMethodBeat.o(99075);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99075);
    }
  }

  public void a(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(99098);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeDeleteIcons(this.b, paramArrayOfInt, paramInt);
          H();
          AppMethodBeat.o(99098);
        }
        finally
        {
          AppMethodBeat.o(99098);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99098);
    }
    throw paramArrayOfInt;
  }

  public void a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(99109);
    if (this.b == 0L)
      AppMethodBeat.o(99109);
    while (true)
    {
      return;
      this.g.a(new gh.13(this, paramArrayOfString));
      AppMethodBeat.o(99109);
    }
  }

  // ERROR //
  public boolean a(Context paramContext, gv paramgv, String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    // Byte code:
    //   0: ldc_w 584
    //   3: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 588	com/tencent/tencentmap/mapsdk/maps/a/gn:a	()Z
    //   9: istore 7
    //   11: iconst_1
    //   12: newarray int
    //   14: astore 8
    //   16: aload_0
    //   17: invokespecial 376	com/tencent/tencentmap/mapsdk/maps/a/gh:I	()V
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 84	com/tencent/tencentmap/mapsdk/maps/a/gh:a	Lcom/tencent/map/lib/gl/JNI;
    //   25: aload_3
    //   26: aload 4
    //   28: aload 5
    //   30: aload_1
    //   31: invokestatic 594	com/tencent/map/lib/util/SystemUtil:getDensity	(Landroid/content/Context;)F
    //   34: sipush 256
    //   37: aload_1
    //   38: invokestatic 594	com/tencent/map/lib/util/SystemUtil:getDensity	(Landroid/content/Context;)F
    //   41: aload 8
    //   43: iload 7
    //   45: getstatic 600	com/tencent/map/lib/MapLanguage:LAN_CHINESE	Lcom/tencent/map/lib/MapLanguage;
    //   48: invokevirtual 603	com/tencent/map/lib/MapLanguage:ordinal	()I
    //   51: invokevirtual 607	com/tencent/map/lib/gl/JNI:nativeInitEngine	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIF[IZI)J
    //   54: putfield 150	com/tencent/tencentmap/mapsdk/maps/a/gh:b	J
    //   57: aload 8
    //   59: iconst_0
    //   60: iaload
    //   61: ifeq +49 -> 110
    //   64: new 609	java/lang/StringBuilder
    //   67: astore_1
    //   68: aload_1
    //   69: ldc_w 611
    //   72: invokespecial 613	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload_1
    //   76: aload 8
    //   78: iconst_0
    //   79: iaload
    //   80: invokevirtual 617	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   83: invokevirtual 620	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 624	com/tencent/map/lib/d:a	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: lconst_0
    //   91: putfield 150	com/tencent/tencentmap/mapsdk/maps/a/gh:b	J
    //   94: aload_0
    //   95: invokespecial 383	com/tencent/tencentmap/mapsdk/maps/a/gh:J	()V
    //   98: iconst_0
    //   99: istore 7
    //   101: ldc_w 584
    //   104: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: iload 7
    //   109: ireturn
    //   110: aload_0
    //   111: invokespecial 383	com/tencent/tencentmap/mapsdk/maps/a/gh:J	()V
    //   114: aload_0
    //   115: invokespecial 156	com/tencent/tencentmap/mapsdk/maps/a/gh:G	()V
    //   118: aload_0
    //   119: getfield 150	com/tencent/tencentmap/mapsdk/maps/a/gh:b	J
    //   122: lconst_0
    //   123: lcmp
    //   124: ifeq +49 -> 173
    //   127: aload_0
    //   128: getfield 84	com/tencent/tencentmap/mapsdk/maps/a/gh:a	Lcom/tencent/map/lib/gl/JNI;
    //   131: aload_2
    //   132: aload_0
    //   133: aload_0
    //   134: aload_0
    //   135: aload_0
    //   136: getfield 94	com/tencent/tencentmap/mapsdk/maps/a/gh:g	Lcom/tencent/tencentmap/mapsdk/maps/a/gm;
    //   139: invokevirtual 627	com/tencent/tencentmap/mapsdk/maps/a/gm:a	()Lcom/tencent/tencentmap/mapsdk/maps/a/gk;
    //   142: aload_0
    //   143: aload_0
    //   144: getfield 150	com/tencent/tencentmap/mapsdk/maps/a/gh:b	J
    //   147: invokevirtual 631	com/tencent/map/lib/gl/JNI:initCallback	(Lcom/tencent/tencentmap/mapsdk/maps/a/gv;Lcom/tencent/map/lib/gl/JNICallback$a;Lcom/tencent/map/lib/gl/JNICallback$h;Lcom/tencent/map/lib/gl/JNICallback$e;Lcom/tencent/map/lib/gl/JNICallback$g;Lcom/tencent/tencentmap/mapsdk/maps/a/fk;J)V
    //   150: aload_0
    //   151: getfield 84	com/tencent/tencentmap/mapsdk/maps/a/gh:a	Lcom/tencent/map/lib/gl/JNI;
    //   154: aload_0
    //   155: getfield 150	com/tencent/tencentmap/mapsdk/maps/a/gh:b	J
    //   158: ldc_w 632
    //   161: ldc_w 633
    //   164: ldc_w 634
    //   167: ldc_w 635
    //   170: invokevirtual 639	com/tencent/map/lib/gl/JNI:nativeSetTrafficColor	(JIIII)V
    //   173: aload_0
    //   174: invokespecial 158	com/tencent/tencentmap/mapsdk/maps/a/gh:H	()V
    //   177: iconst_1
    //   178: istore 7
    //   180: ldc_w 584
    //   183: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: goto -79 -> 107
    //   189: astore_1
    //   190: aload_0
    //   191: invokespecial 383	com/tencent/tencentmap/mapsdk/maps/a/gh:J	()V
    //   194: ldc_w 584
    //   197: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload_1
    //   201: athrow
    //   202: astore_1
    //   203: aload_0
    //   204: invokespecial 158	com/tencent/tencentmap/mapsdk/maps/a/gh:H	()V
    //   207: ldc_w 584
    //   210: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: aload_1
    //   214: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   16	57	189	finally
    //   64	94	189	finally
    //   114	173	202	finally
  }

  public c b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99107);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1)
      {
        H();
        paramGeoPoint = null;
        AppMethodBeat.o(99107);
      }
      while (true)
      {
        return paramGeoPoint;
        Object localObject = paramGeoPoint;
        if (paramGeoPoint == null)
        {
          localObject = new com/tencent/map/lib/basemap/data/GeoPoint;
          ((GeoPoint)localObject).<init>();
        }
        try
        {
          String str1 = this.a.nativeGetActiveIndoorBuildingGUID(this.b);
          String str2 = this.a.nativeGetCurIndoorName(this.b, (GeoPoint)localObject);
          int n = this.a.nativeGetIndoorCurrentFloorId(this.b);
          localObject = this.a.nativeGetIndoorFloorNames(this.b);
          paramGeoPoint = new com/tencent/map/lib/element/c;
          paramGeoPoint.<init>(str1, str2, (String[])localObject, n);
          H();
          AppMethodBeat.o(99107);
        }
        finally
        {
          AppMethodBeat.o(99107);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99107);
    }
    throw paramGeoPoint;
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(99129);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeSetSkew(this.b, paramFloat, false);
          H();
          AppMethodBeat.o(99129);
        }
        finally
        {
          AppMethodBeat.o(99129);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99129);
    }
  }

  public void b(final float paramFloat1, final float paramFloat2)
  {
    AppMethodBeat.i(99120);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99120);
    while (true)
    {
      return;
      this.g.a(new gm.a()
      {
        public void a(GL10 paramAnonymousGL10)
        {
          AppMethodBeat.i(99028);
          if (gh.a(gh.this) != 0L)
            gh.b(gh.this).nativeZoomIn(gh.a(gh.this), paramFloat1, paramFloat2);
          AppMethodBeat.o(99028);
        }
      });
      AppMethodBeat.o(99120);
    }
  }

  public void b(final float paramFloat1, final float paramFloat2, final boolean paramBoolean)
  {
    AppMethodBeat.i(99122);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99122);
    while (true)
    {
      return;
      this.g.a(new gm.a()
      {
        public void a(GL10 paramAnonymousGL10)
        {
          AppMethodBeat.i(99031);
          if (gh.a(gh.this) == 0L)
            AppMethodBeat.o(99031);
          while (true)
          {
            return;
            if (paramBoolean)
            {
              gh.b(gh.this).nativeSetScreenCenterOffset(gh.a(gh.this), paramFloat1, paramFloat2, true);
              AppMethodBeat.o(99031);
            }
            else
            {
              fw localfw = gh.c(gh.this).d();
              paramAnonymousGL10 = localfw.b(gh.this.q());
              gh.b(gh.this).nativeSetScreenCenterOffset(gh.a(gh.this), paramFloat1, paramFloat2, false);
              DoublePoint localDoublePoint = localfw.b(gh.this.q());
              double d1 = localDoublePoint.x;
              double d2 = paramAnonymousGL10.x;
              double d3 = localDoublePoint.y;
              double d4 = paramAnonymousGL10.y;
              paramAnonymousGL10 = localfw.a(new DoublePoint(d1 - d2 + localDoublePoint.x, d3 - d4 + localDoublePoint.y));
              gh.b(gh.this).nativeSetCenter(gh.a(gh.this), paramAnonymousGL10, false);
              AppMethodBeat.o(99031);
            }
          }
        }
      });
      AppMethodBeat.o(99122);
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(99070);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeRemoveMaskLayer(this.b, paramInt);
        H();
        AppMethodBeat.o(99070);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99070);
    }
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99069);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeUpdateMaskLayer(this.b, paramInt1, paramInt2);
        H();
        AppMethodBeat.o(99069);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99069);
    }
  }

  public void b(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99118);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99118);
    while (true)
    {
      return;
      this.g.a(new gh.19(this, paramInt, paramBoolean));
      AppMethodBeat.o(99118);
    }
  }

  public void b(d paramd)
  {
    AppMethodBeat.i(99082);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99082);
        }
        else
        {
          try
          {
            paramd = paramd.q();
            if (paramd == null)
            {
              H();
              AppMethodBeat.o(99082);
            }
            else
            {
              this.a.nativeSetTurnArrow(this.b, n, paramd.a, paramd.b);
              H();
              AppMethodBeat.o(99082);
            }
          }
          finally
          {
            AppMethodBeat.o(99082);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99082);
    }
    throw paramd;
  }

  public void b(Polygon2D paramPolygon2D)
  {
    AppMethodBeat.i(99066);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        try
        {
          this.a.nativeUpdatePolygon(this.b, paramPolygon2D.polygonId, paramPolygon2D.borldLineId, paramPolygon2D);
          H();
          AppMethodBeat.o(99066);
        }
        finally
        {
          AppMethodBeat.o(99066);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99066);
    }
    throw paramPolygon2D;
  }

  public void b(String paramString)
  {
    AppMethodBeat.i(99079);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        gm localgm = this.g;
        gh.32 local32 = new com/tencent/tencentmap/mapsdk/maps/a/gh$32;
        local32.<init>(this, paramString);
        localgm.a(local32);
        H();
        AppMethodBeat.o(99079);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99079);
    }
    throw paramString;
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(99090);
    try
    {
      G();
      if (0L != this.b);
      try
      {
        this.a.nativeSetBuilding3DEffect(this.b, paramBoolean);
        return;
      }
      finally
      {
        AppMethodBeat.o(99090);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99090);
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(99053);
    try
    {
      G();
      long l1 = this.b;
      boolean bool;
      if (l1 == 0L)
      {
        H();
        bool = false;
        AppMethodBeat.o(99053);
      }
      while (true)
      {
        return bool;
        bool = this.a.nativeGenerateTextures(this.b);
        H();
        AppMethodBeat.o(99053);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99053);
    }
  }

  public String c(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99108);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1)
      {
        H();
        paramGeoPoint = null;
        AppMethodBeat.o(99108);
      }
      while (true)
      {
        return paramGeoPoint;
        try
        {
          paramGeoPoint = this.a.nativeGetCurIndoorName(this.b, paramGeoPoint);
          H();
          AppMethodBeat.o(99108);
        }
        finally
        {
          AppMethodBeat.o(99108);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99108);
    }
    throw paramGeoPoint;
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(99104);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99104);
    while (true)
    {
      return;
      this.g.a(new gh.12(this, paramInt));
      AppMethodBeat.o(99104);
    }
  }

  public void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99100);
    if (0L == this.b)
      AppMethodBeat.o(99100);
    while (true)
    {
      return;
      this.g.a(new gh.8(this, paramInt1, paramInt2));
      AppMethodBeat.o(99100);
    }
  }

  public void c(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99130);
    if (0L == this.b)
      AppMethodBeat.o(99130);
    while (true)
    {
      return;
      this.g.a(new gh.25(this, paramInt, paramBoolean));
      AppMethodBeat.o(99130);
    }
  }

  public void c(d paramd)
  {
    AppMethodBeat.i(99083);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99083);
        }
        else
        {
          paramd = paramd.y();
          gm localgm = this.g;
          gh.33 local33 = new com/tencent/tencentmap/mapsdk/maps/a/gh$33;
          local33.<init>(this, n, paramd);
          localgm.a(local33);
          H();
          AppMethodBeat.o(99083);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99083);
    }
    throw paramd;
  }

  public void c(String paramString)
  {
    AppMethodBeat.i(99093);
    this.j += 1;
    if (this.j >= 30)
    {
      m();
      this.j = 0;
    }
    this.g.a(new gh.4(this, paramString));
    if (this.e != null)
      this.e.c(paramString);
    AppMethodBeat.o(99093);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(99099);
    if (0L == this.b)
      AppMethodBeat.o(99099);
    while (true)
    {
      return;
      this.g.a(new gh.7(this, paramBoolean));
      AppMethodBeat.o(99099);
    }
  }

  public boolean c()
  {
    AppMethodBeat.i(99054);
    try
    {
      G();
      long l1 = this.b;
      boolean bool;
      if (l1 == 0L)
      {
        H();
        bool = false;
        AppMethodBeat.o(99054);
      }
      while (true)
      {
        return bool;
        this.a.nativeDrawFrame(this.b);
        H();
        bool = true;
        AppMethodBeat.o(99054);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99054);
    }
  }

  public int d()
  {
    AppMethodBeat.i(99055);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (l1 == 0L)
      {
        H();
        n = -1;
        AppMethodBeat.o(99055);
      }
      while (true)
      {
        return n;
        n = this.a.nativeClearCache(this.b);
        H();
        AppMethodBeat.o(99055);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99055);
    }
  }

  public int d(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99134);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L)
      {
        H();
        paramInt = -1;
        AppMethodBeat.o(99134);
      }
      while (true)
      {
        return paramInt;
        try
        {
          paramInt = this.a.nativeAddHeatTileOverlay(this.b, paramInt, paramBoolean);
          H();
          AppMethodBeat.o(99134);
        }
        finally
        {
          AppMethodBeat.o(99134);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99134);
    }
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(99126);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeSetMaxScaleLevel(this.b, paramInt);
          H();
          AppMethodBeat.o(99126);
        }
        finally
        {
          AppMethodBeat.o(99126);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99126);
    }
  }

  public void d(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99145);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeBringElementAbove(this.b, paramInt1, paramInt2);
        H();
        AppMethodBeat.o(99145);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99145);
    }
  }

  public void d(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99113);
    try
    {
      G();
      if (0L != this.b)
      {
        gm localgm = this.g;
        if (localgm != null)
          break label39;
      }
      while (true)
      {
        return;
        label39: this.a.nativeSetCenter(this.b, paramGeoPoint, false);
        H();
        AppMethodBeat.o(99113);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99113);
    }
    throw paramGeoPoint;
  }

  public void d(d paramd)
  {
    AppMethodBeat.i(99084);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99084);
        }
        else
        {
          try
          {
            this.a.nativeSetLineDrawArrow(this.b, n, paramd.j());
            H();
            AppMethodBeat.o(99084);
          }
          finally
          {
            AppMethodBeat.o(99084);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99084);
    }
    throw paramd;
  }

  public void d(String paramString)
  {
    AppMethodBeat.i(99094);
    this.d.a(paramString);
    AppMethodBeat.o(99094);
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(99103);
    if ((this.b == 0L) || (this.g == null))
      AppMethodBeat.o(99103);
    while (true)
    {
      return;
      this.g.a(new gh.11(this, paramBoolean));
      AppMethodBeat.o(99103);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99056);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeLockEngine(this.b);
        H();
        AppMethodBeat.o(99056);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99056);
    }
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(99127);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          this.a.nativeSetMinScaleLevel(this.b, paramInt);
          H();
          AppMethodBeat.o(99127);
        }
        finally
        {
          AppMethodBeat.o(99127);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99127);
    }
  }

  public void e(d paramd)
  {
    AppMethodBeat.i(99085);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99085);
        }
        else
        {
          try
          {
            this.a.nativeSetLineDirectionArrowTextureName(this.b, n, paramd.w());
            H();
            AppMethodBeat.o(99085);
          }
          finally
          {
            AppMethodBeat.o(99085);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99085);
    }
    throw paramd;
  }

  public void e(String paramString)
  {
    AppMethodBeat.i(99149);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        try
        {
          this.a.nativeMapLoadKMLFile(this.b, paramString);
          H();
          AppMethodBeat.o(99149);
        }
        finally
        {
          AppMethodBeat.o(99149);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99149);
    }
    throw paramString;
  }

  public void e(boolean paramBoolean)
  {
    AppMethodBeat.i(99110);
    if (0L == this.b)
      AppMethodBeat.o(99110);
    while (true)
    {
      return;
      this.g.a(new gh.15(this, paramBoolean));
      AppMethodBeat.o(99110);
    }
  }

  public void f()
  {
    AppMethodBeat.i(99057);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeUnlockEngine(this.b);
        H();
        AppMethodBeat.o(99057);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99057);
    }
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(99136);
    if ((this.b == 0L) || (this.g == null))
      AppMethodBeat.o(99136);
    while (true)
    {
      return;
      this.g.a(new gh.27(this, paramInt));
      AppMethodBeat.o(99136);
    }
  }

  public void f(d paramd)
  {
    AppMethodBeat.i(99086);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99086);
        }
        else
        {
          try
          {
            this.a.nativeSetDrawCap(this.b, n, paramd.k());
            H();
            AppMethodBeat.o(99086);
          }
          finally
          {
            AppMethodBeat.o(99086);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99086);
    }
    throw paramd;
  }

  public void f(String paramString)
  {
    AppMethodBeat.i(99154);
    if (this.b == 0L)
      AppMethodBeat.o(99154);
    while (true)
    {
      return;
      this.g.a(new gh.29(this, paramString));
      AppMethodBeat.o(99154);
    }
  }

  public void f(boolean paramBoolean)
  {
    AppMethodBeat.i(99151);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1)
        return;
      H();
      AppMethodBeat.o(99151);
    }
    finally
    {
      H();
      AppMethodBeat.o(99151);
    }
  }

  public void g(int paramInt)
  {
    AppMethodBeat.i(99137);
    if ((this.b == 0L) || (this.g == null))
      AppMethodBeat.o(99137);
    while (true)
    {
      return;
      this.g.a(new gh.28(this, paramInt));
      AppMethodBeat.o(99137);
    }
  }

  public void g(d paramd)
  {
    AppMethodBeat.i(99087);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99087);
        }
        else
        {
          try
          {
            GeoPoint localGeoPoint = paramd.h();
            if (localGeoPoint == null)
            {
              H();
              AppMethodBeat.o(99087);
            }
            else
            {
              this.a.nativeLineInsertPoint(this.b, n, localGeoPoint, paramd.i());
              H();
              AppMethodBeat.o(99087);
            }
          }
          finally
          {
            AppMethodBeat.o(99087);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99087);
    }
    throw paramd;
  }

  public void g(boolean paramBoolean)
  {
    AppMethodBeat.i(99155);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeEnablePOI(this.b, paramBoolean);
        H();
        AppMethodBeat.o(99155);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99155);
    }
  }

  public boolean g()
  {
    AppMethodBeat.i(99058);
    try
    {
      G();
      long l1 = this.b;
      boolean bool;
      if (l1 == 0L)
      {
        H();
        bool = true;
        AppMethodBeat.o(99058);
      }
      while (true)
      {
        return bool;
        try
        {
          bool = this.a.nativeIsMapDrawFinished(this.b);
          H();
          AppMethodBeat.o(99058);
        }
        finally
        {
          AppMethodBeat.o(99058);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99058);
    }
  }

  public void h(int paramInt)
  {
    AppMethodBeat.i(99138);
    if (this.g != null)
    {
      gs localgs = this.g.e();
      if (localgs != null)
        localgs.a();
    }
    AppMethodBeat.o(99138);
  }

  public void h(d paramd)
  {
    AppMethodBeat.i(99088);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        int n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99088);
        }
        else
        {
          try
          {
            GeoPoint localGeoPoint = paramd.h();
            if (localGeoPoint == null)
            {
              H();
              AppMethodBeat.o(99088);
            }
            else
            {
              this.a.nativeLineClearPoint(this.b, n, localGeoPoint, paramd.i());
              H();
              AppMethodBeat.o(99088);
            }
          }
          finally
          {
            AppMethodBeat.o(99088);
          }
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99088);
    }
    throw paramd;
  }

  public void h(boolean paramBoolean)
  {
    AppMethodBeat.i(99156);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        this.a.nativeEnableVectorMap(this.b, paramBoolean);
        H();
        AppMethodBeat.o(99156);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99156);
    }
  }

  public TrafficRequestItem[] h()
  {
    TrafficRequestItem[] arrayOfTrafficRequestItem = null;
    AppMethodBeat.i(99061);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return arrayOfTrafficRequestItem;
        try
        {
          int[] arrayOfInt = this.a.nativeFetchLackedTrafficBlocks(this.b);
          if ((arrayOfInt == null) || (arrayOfInt.length == 0))
          {
            H();
            AppMethodBeat.o(99061);
            continue;
          }
          arrayOfTrafficRequestItem = new TrafficRequestItem[arrayOfInt.length / 7];
          for (int n = 0; n < arrayOfInt.length / 7; n++)
          {
            TrafficRequestItem localTrafficRequestItem = new com/tencent/map/lib/mapstructure/TrafficRequestItem;
            localTrafficRequestItem.<init>();
            arrayOfTrafficRequestItem[n] = localTrafficRequestItem;
            arrayOfTrafficRequestItem[n].level = arrayOfInt[(n * 7)];
            arrayOfTrafficRequestItem[n].blockNo = arrayOfInt[(n * 7 + 1)];
            arrayOfTrafficRequestItem[n].left = arrayOfInt[(n * 7 + 2)];
            arrayOfTrafficRequestItem[n].top = arrayOfInt[(n * 7 + 3)];
            arrayOfTrafficRequestItem[n].right = arrayOfInt[(n * 7 + 4)];
            arrayOfTrafficRequestItem[n].bottom = arrayOfInt[(n * 7 + 5)];
            arrayOfTrafficRequestItem[n].timestamp = arrayOfInt[(n * 7 + 6)];
          }
          H();
          AppMethodBeat.o(99061);
        }
        finally
        {
          AppMethodBeat.o(99061);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99061);
    }
  }

  public void i()
  {
    AppMethodBeat.i(99073);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        gm localgm = this.g;
        gh.14 local14 = new com/tencent/tencentmap/mapsdk/maps/a/gh$14;
        local14.<init>(this);
        localgm.a(local14);
        H();
        AppMethodBeat.o(99073);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99073);
    }
  }

  public void i(d paramd)
  {
    AppMethodBeat.i(99153);
    while (true)
    {
      int n;
      try
      {
        G();
        long l1 = this.b;
        if (l1 == 0L)
          return;
        n = paramd.s();
        if (n == -1)
        {
          H();
          AppMethodBeat.o(99153);
          continue;
        }
        float f1 = paramd.x();
        if (f1 < 0.0F)
        {
          H();
          AppMethodBeat.o(99153);
          continue;
        }
        int i1 = paramd.m();
        if ((i1 == 3) || (i1 == 0))
          try
          {
            this.a.nativeSetLineArrowSpacing(this.b, n, paramd.x());
            H();
            AppMethodBeat.o(99153);
            continue;
          }
          finally
          {
            AppMethodBeat.o(99153);
          }
      }
      finally
      {
        H();
        AppMethodBeat.o(99153);
      }
      try
      {
        this.a.nativeSetLineFootPrintSpacing(this.b, n, paramd.x());
      }
      finally
      {
        AppMethodBeat.o(99153);
      }
    }
    throw paramd;
  }

  public void j()
  {
    AppMethodBeat.i(99074);
    try
    {
      G();
      if (this.b != 0L);
      try
      {
        this.a.nativeHideStreetRoad(this.b);
        return;
      }
      finally
      {
        AppMethodBeat.o(99074);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99074);
    }
  }

  public void k()
  {
    AppMethodBeat.i(99076);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        gm localgm = this.g;
        gh.30 local30 = new com/tencent/tencentmap/mapsdk/maps/a/gh$30;
        local30.<init>(this);
        localgm.a(local30);
        H();
        AppMethodBeat.o(99076);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99076);
    }
  }

  public void l()
  {
    AppMethodBeat.i(99077);
    try
    {
      G();
      long l1 = this.b;
      if (l1 == 0L);
      while (true)
      {
        return;
        gm localgm = this.g;
        gh.31 local31 = new com/tencent/tencentmap/mapsdk/maps/a/gh$31;
        local31.<init>(this);
        localgm.a(local31);
        H();
        AppMethodBeat.o(99077);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99077);
    }
  }

  public void m()
  {
    AppMethodBeat.i(99091);
    if (this.b != 0L)
      this.g.a(new gh.2(this));
    AppMethodBeat.o(99091);
  }

  public void n()
  {
    AppMethodBeat.i(99095);
    if (0L == this.b)
      AppMethodBeat.o(99095);
    while (true)
    {
      return;
      this.g.a(new gh.5(this));
      AppMethodBeat.o(99095);
    }
  }

  public int o()
  {
    AppMethodBeat.i(99105);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (0L == l1)
      {
        H();
        n = -1;
        AppMethodBeat.o(99105);
      }
      while (true)
      {
        return n;
        try
        {
          n = this.a.nativeGetIndoorCurrentFloorId(this.b);
          H();
          AppMethodBeat.o(99105);
        }
        finally
        {
          AppMethodBeat.o(99105);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99105);
    }
  }

  public String[] p()
  {
    AppMethodBeat.i(99106);
    try
    {
      G();
      long l1 = this.b;
      String[] arrayOfString;
      if (0L == l1)
      {
        H();
        arrayOfString = null;
        AppMethodBeat.o(99106);
      }
      while (true)
      {
        return arrayOfString;
        try
        {
          arrayOfString = this.a.nativeGetIndoorFloorNames(this.b);
          H();
          AppMethodBeat.o(99106);
        }
        finally
        {
          AppMethodBeat.o(99106);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99106);
    }
  }

  public GeoPoint q()
  {
    AppMethodBeat.i(99114);
    try
    {
      G();
      long l1 = this.b;
      GeoPoint localGeoPoint;
      if (0L == l1)
      {
        H();
        localGeoPoint = null;
        AppMethodBeat.o(99114);
      }
      while (true)
      {
        return localGeoPoint;
        try
        {
          localGeoPoint = new com/tencent/map/lib/basemap/data/GeoPoint;
          localGeoPoint.<init>();
          this.a.nativeGetCenterMapPoint(this.b, localGeoPoint);
          H();
          AppMethodBeat.o(99114);
        }
        finally
        {
          AppMethodBeat.o(99114);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99114);
    }
  }

  public float r()
  {
    AppMethodBeat.i(99117);
    try
    {
      G();
      long l1 = this.b;
      float f1;
      if (0L == l1)
      {
        H();
        f1 = 1.0F;
        AppMethodBeat.o(99117);
      }
      while (true)
      {
        return f1;
        try
        {
          f1 = (float)this.a.nativeGetScale(this.b);
          H();
          AppMethodBeat.o(99117);
        }
        finally
        {
          AppMethodBeat.o(99117);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99117);
    }
  }

  public int s()
  {
    AppMethodBeat.i(99119);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (0L == l1)
      {
        H();
        n = 20;
        AppMethodBeat.o(99119);
      }
      while (true)
      {
        return n;
        try
        {
          n = this.a.nativeGetScaleLevel(this.b);
          H();
          AppMethodBeat.o(99119);
        }
        finally
        {
          AppMethodBeat.o(99119);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99119);
    }
  }

  public void t()
  {
    AppMethodBeat.i(99121);
    if ((0L == this.b) || (this.g == null))
      AppMethodBeat.o(99121);
    while (true)
    {
      return;
      this.g.a(new gm.a()
      {
        public void a(GL10 paramAnonymousGL10)
        {
          AppMethodBeat.i(99029);
          if (gh.a(gh.this) != 0L)
            gh.b(gh.this).nativeZoomOut(gh.a(gh.this));
          AppMethodBeat.o(99029);
        }
      });
      AppMethodBeat.o(99121);
    }
  }

  public void u()
  {
    AppMethodBeat.i(99124);
    try
    {
      G();
      long l1 = this.b;
      if (0L == l1);
      while (true)
      {
        return;
        try
        {
          l1 = System.currentTimeMillis();
          if (this.h == 0L)
            this.a.nativeUpdateFrame(this.b, 0.0D);
          while (true)
          {
            this.h = l1;
            H();
            AppMethodBeat.o(99124);
            break;
            this.a.nativeUpdateFrame(this.b, l1 - this.h);
          }
        }
        finally
        {
          AppMethodBeat.o(99124);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99124);
    }
  }

  public boolean v()
  {
    AppMethodBeat.i(99125);
    try
    {
      G();
      long l1 = this.b;
      boolean bool;
      if (0L == l1)
      {
        H();
        bool = false;
        AppMethodBeat.o(99125);
      }
      while (true)
      {
        return bool;
        try
        {
          bool = this.a.nativeNeedDispaly(this.b);
          H();
          AppMethodBeat.o(99125);
        }
        finally
        {
          AppMethodBeat.o(99125);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99125);
    }
  }

  public float w()
  {
    AppMethodBeat.i(99131);
    try
    {
      G();
      long l1 = this.b;
      float f1;
      if (0L == l1)
      {
        H();
        f1 = 0.0F;
        AppMethodBeat.o(99131);
      }
      while (true)
      {
        return f1;
        f1 = this.a.nativeGetSkew(this.b);
        H();
        AppMethodBeat.o(99131);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99131);
    }
  }

  public float x()
  {
    AppMethodBeat.i(99132);
    try
    {
      G();
      long l1 = this.b;
      float f1;
      if (0L == l1)
      {
        H();
        f1 = 0.0F;
        AppMethodBeat.o(99132);
      }
      while (true)
      {
        return f1;
        f1 = this.a.nativeGetRotate(this.b);
        H();
        AppMethodBeat.o(99132);
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99132);
    }
  }

  public int y()
  {
    AppMethodBeat.i(99133);
    try
    {
      G();
      long l1 = this.b;
      int n;
      if (0L == l1)
      {
        H();
        n = 1;
        AppMethodBeat.o(99133);
      }
      while (true)
      {
        return n;
        try
        {
          n = this.a.nativeGetMapMode(this.b);
          H();
          AppMethodBeat.o(99133);
        }
        finally
        {
          AppMethodBeat.o(99133);
        }
      }
    }
    finally
    {
      H();
      AppMethodBeat.o(99133);
    }
  }

  public void z()
  {
    AppMethodBeat.i(99139);
    if (this.f != null)
      this.f.z();
    AppMethodBeat.o(99139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh
 * JD-Core Version:    0.6.2
 */