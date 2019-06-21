package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ht;
import com.tencent.tencentmap.mapsdk.maps.a.jk.a;
import com.tencent.tencentmap.mapsdk.maps.a.lh;
import com.tencent.tencentmap.mapsdk.maps.a.lh.a;
import java.util.List;

public class at
  implements jk.a, lh.a
{
  private by a = null;
  private de b;
  private de c;
  private de d;

  public at(by paramby)
  {
    this.a = paramby;
  }

  public final de a(df paramdf, at paramat)
  {
    AppMethodBeat.i(100659);
    if (this.a != null)
    {
      paramdf = this.a.a(paramdf, paramat);
      AppMethodBeat.o(100659);
    }
    while (true)
    {
      return paramdf;
      paramdf = null;
      AppMethodBeat.o(100659);
    }
  }

  public void a()
  {
    if (this.a != null)
      this.a = null;
  }

  public void a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100688);
    if (this.d == null)
    {
      df localdf = new df();
      localdf.a(0.5F, 0.5F);
      localdf.a("AUTH_MARKER");
      localdf.a(cn.a(paramBitmap));
      this.d = a(localdf, this);
      this.d.a(paramInt1 / 2, paramInt2 / 2);
      AppMethodBeat.o(100688);
    }
    while (true)
    {
      return;
      this.d.a(cn.a(paramBitmap));
      this.d.a(paramInt1 / 2, paramInt2 / 2);
      AppMethodBeat.o(100688);
    }
  }

  public void a(View paramView, Rect paramRect, boolean paramBoolean)
  {
    AppMethodBeat.i(100684);
    if ((paramView == null) || (paramRect == null))
      AppMethodBeat.o(100684);
    while (true)
    {
      return;
      Bitmap localBitmap = ht.a(paramView);
      if (localBitmap == null)
      {
        AppMethodBeat.o(100684);
      }
      else
      {
        if (this.b == null)
        {
          paramView = new df().a(0.0F, 0.0F).b(false);
          paramView.a("AUTH_MARKER");
          paramView.e(true);
          this.b = a(paramView, this);
        }
        this.b.a(paramRect.left, paramRect.top);
        this.b.a(cn.a(localBitmap));
        this.b.b(paramBoolean);
        AppMethodBeat.o(100684);
      }
    }
  }

  public final void a(aj.b paramb)
  {
    AppMethodBeat.i(100683);
    if (this.a != null)
      this.a.a(paramb);
    AppMethodBeat.o(100683);
  }

  public final void a(aj.m paramm)
  {
    AppMethodBeat.i(100682);
    if (this.a != null)
      this.a.a(paramm);
    AppMethodBeat.o(100682);
  }

  public void a(lh paramlh)
  {
    AppMethodBeat.i(100686);
    if (this.c != null)
      this.c.b(false);
    if ((paramlh != null) && (this.b != null) && (!paramlh.j()))
      this.b.b(false);
    AppMethodBeat.o(100686);
  }

  public final void a(String paramString)
  {
    AppMethodBeat.i(100660);
    if (this.a != null)
      this.a.a(paramString);
    AppMethodBeat.o(100660);
  }

  public final void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100674);
    if (this.a != null)
      this.a.a(paramString, paramFloat);
    AppMethodBeat.o(100674);
  }

  public final void a(String paramString, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100661);
    if (this.a != null)
      this.a.a(paramString, paramFloat1, paramFloat2);
    AppMethodBeat.o(100661);
  }

  public void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100669);
    if (this.a == null)
      AppMethodBeat.o(100669);
    while (true)
    {
      return;
      this.a.a(paramString, paramInt);
      AppMethodBeat.o(100669);
    }
  }

  public void a(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100679);
    if (this.a != null)
      this.a.a(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(100679);
  }

  public final void a(String paramString, cm paramcm)
  {
    AppMethodBeat.i(100663);
    if (this.a != null)
      this.a.a(paramString, paramcm);
    AppMethodBeat.o(100663);
  }

  public final void a(String paramString, db paramdb)
  {
    AppMethodBeat.i(100664);
    if (this.a != null)
      this.a.a(paramString, paramdb);
    AppMethodBeat.o(100664);
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(100665);
    if (this.a != null)
      this.a.a(paramString1, paramString2);
    AppMethodBeat.o(100665);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100662);
    if (this.a != null)
      this.a.a(paramString, paramBoolean);
    AppMethodBeat.o(100662);
  }

  public final db b(String paramString)
  {
    AppMethodBeat.i(100666);
    if (this.a != null)
    {
      paramString = this.a.f(paramString);
      AppMethodBeat.o(100666);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(100666);
    }
  }

  public final void b()
  {
    AppMethodBeat.i(100673);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(100673);
  }

  public void b(View paramView, Rect paramRect, boolean paramBoolean)
  {
    AppMethodBeat.i(100685);
    if ((paramView == null) || (paramRect == null))
      AppMethodBeat.o(100685);
    while (true)
    {
      return;
      paramView = ht.a(paramView);
      if (paramView == null)
      {
        AppMethodBeat.o(100685);
      }
      else
      {
        if (this.c == null)
        {
          df localdf = new df().a(0.0F, 0.0F).b(false);
          localdf.a("AUTH_MARKER");
          localdf.e(true);
          this.c = a(localdf, this);
        }
        this.c.a(paramRect.left, paramRect.top);
        this.c.a(cn.a(paramView));
        this.c.b(paramBoolean);
        AppMethodBeat.o(100685);
      }
    }
  }

  public void b(lh paramlh)
  {
    AppMethodBeat.i(100687);
    if (this.c != null)
      this.c.b(true);
    if (this.b != null)
      this.b.b(true);
    AppMethodBeat.o(100687);
  }

  public void b(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100676);
    if (this.a != null)
      this.a.b(paramString, paramFloat);
    AppMethodBeat.o(100676);
  }

  public final void b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(100667);
    if (this.a != null)
      this.a.b(paramString1, paramString2);
    AppMethodBeat.o(100667);
  }

  public final void b(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100668);
    if (this.a != null)
      this.a.b(paramString, paramBoolean);
    AppMethodBeat.o(100668);
  }

  public final void c(String paramString)
  {
    AppMethodBeat.i(100670);
    if (this.a != null)
      this.a.b(paramString);
    AppMethodBeat.o(100670);
  }

  public void c(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100680);
    if (this.a != null)
      this.a.c(paramString, paramFloat);
    AppMethodBeat.o(100680);
  }

  public void c(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100677);
    if (this.a != null)
      this.a.c(paramString, paramBoolean);
    AppMethodBeat.o(100677);
  }

  public final void d(String paramString)
  {
    AppMethodBeat.i(100671);
    if (this.a != null)
      this.a.c(paramString);
    AppMethodBeat.o(100671);
  }

  public final boolean e(String paramString)
  {
    AppMethodBeat.i(100672);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.d(paramString);
      AppMethodBeat.o(100672);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100672);
    }
  }

  public final float f(String paramString)
  {
    AppMethodBeat.i(100675);
    float f;
    if (this.a != null)
    {
      f = this.a.e(paramString);
      AppMethodBeat.o(100675);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(100675);
    }
  }

  public boolean g(String paramString)
  {
    AppMethodBeat.i(100678);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.g(paramString);
      AppMethodBeat.o(100678);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100678);
    }
  }

  public List<j> h(String paramString)
  {
    AppMethodBeat.i(100681);
    if (this.a != null)
    {
      paramString = this.a.h(paramString);
      AppMethodBeat.o(100681);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(100681);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.at
 * JD-Core Version:    0.6.2
 */