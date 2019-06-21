package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.element.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fw;

class bo$a
{
  private co b;
  private l c;
  private Bitmap[] d;

  private String a(bo.b paramb)
  {
    AppMethodBeat.i(100846);
    String str = toString();
    if (paramb == bo.b.a)
    {
      paramb = "b_lt_".concat(String.valueOf(str));
      AppMethodBeat.o(100846);
    }
    while (true)
    {
      return paramb;
      if (paramb == bo.b.b)
      {
        paramb = "b_rt_".concat(String.valueOf(str));
        AppMethodBeat.o(100846);
      }
      else if (paramb == bo.b.c)
      {
        paramb = "b_rb_".concat(String.valueOf(str));
        AppMethodBeat.o(100846);
      }
      else
      {
        paramb = "b_lb_".concat(String.valueOf(str));
        AppMethodBeat.o(100846);
      }
    }
  }

  public l a(fw paramfw, bo.b paramb)
  {
    AppMethodBeat.i(100845);
    de localde = this.b.a();
    Object localObject1 = this.b.f();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = localde.e();
    if (localObject2 == null)
    {
      paramfw = null;
      AppMethodBeat.o(100845);
      return paramfw;
    }
    localObject2 = paramfw.b(bo.a(this.a, (db)localObject2));
    int i;
    int j;
    label98: float f1;
    float f2;
    label114: double d1;
    double d2;
    if (localde != null)
    {
      i = localde.a(bo.a(this.a));
      j = localde.b(bo.a(this.a));
      if (localde == null)
        break label348;
      f1 = localde.q();
      f2 = localde.r();
      if ((f1 >= 0.0F) && (f1 <= 1.0F))
      {
        d1 = f1;
        d2 = i;
        ((DoublePoint)localObject2).x -= (d1 - 0.5D) * d2;
      }
      if ((f2 >= 0.0F) && (f2 <= 1.0F))
      {
        d2 = f2;
        d1 = j;
        ((DoublePoint)localObject2).y -= (d2 - 0.5D) * d1;
      }
      localObject1 = this.d[paramb.ordinal()];
      i = ((Bitmap)localObject1).getWidth() / 2;
      j = ((Bitmap)localObject1).getHeight() / 2 + j / 2;
      if (paramb != bo.b.a)
        break label369;
      d2 = ((DoublePoint)localObject2).x - i;
      d1 = ((DoublePoint)localObject2).y - j;
    }
    while (true)
    {
      localObject2 = new DoublePoint(d2, d1);
      this.c.a(paramfw.a((DoublePoint)localObject2));
      this.c.a(a(paramb), new Bitmap[] { localObject1 });
      paramfw = this.c;
      AppMethodBeat.o(100845);
      break;
      i = this.b.b();
      j = this.b.c();
      break label98;
      label348: f1 = this.b.d();
      f2 = this.b.e();
      break label114;
      label369: if (paramb == bo.b.b)
      {
        d2 = ((DoublePoint)localObject2).x + i;
        d1 = ((DoublePoint)localObject2).y - j;
      }
      else if (paramb == bo.b.c)
      {
        d2 = ((DoublePoint)localObject2).x + i;
        d1 = ((DoublePoint)localObject2).y;
        d1 = j + d1;
      }
      else
      {
        d2 = ((DoublePoint)localObject2).x - i;
        d1 = ((DoublePoint)localObject2).y;
        d1 = j + d1;
      }
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(100843);
    boolean bool = this.b.h();
    AppMethodBeat.o(100843);
    return bool;
  }

  public int b()
  {
    AppMethodBeat.i(100844);
    int i;
    if (this.b == null)
    {
      i = 0;
      AppMethodBeat.o(100844);
    }
    while (true)
    {
      return i;
      i = this.b.g();
      AppMethodBeat.o(100844);
    }
  }

  public l c()
  {
    return this.c;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bo.a
 * JD-Core Version:    0.6.2
 */