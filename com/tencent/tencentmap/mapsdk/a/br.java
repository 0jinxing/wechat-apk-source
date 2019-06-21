package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class br
{
  private bw a;
  private aj.p b;
  private Handler c;

  public br(bw parambw)
  {
    AppMethodBeat.i(100885);
    this.a = null;
    this.b = null;
    this.c = new br.1(this, Looper.getMainLooper());
    this.a = parambw;
    c(false);
    AppMethodBeat.o(100885);
  }

  private void a(Handler paramHandler, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(100905);
    if (this.a == null)
      AppMethodBeat.o(100905);
    while (true)
    {
      return;
      this.a.a(paramHandler, paramConfig);
      AppMethodBeat.o(100905);
    }
  }

  private boolean a(String paramString)
  {
    AppMethodBeat.i(100924);
    boolean bool;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      bool = true;
      AppMethodBeat.o(100924);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100924);
    }
  }

  public final int a(ad paramad)
  {
    AppMethodBeat.i(100889);
    int i;
    if (this.a == null)
    {
      i = -2147483648;
      AppMethodBeat.o(100889);
    }
    while (true)
    {
      return i;
      i = this.a.a(paramad);
      AppMethodBeat.o(100889);
    }
  }

  public final int a(ad paramad, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100890);
    int i;
    if (this.a == null)
    {
      i = -2147483648;
      AppMethodBeat.o(100890);
    }
    while (true)
    {
      return i;
      i = this.a.a(paramad, paramLong, parama);
      AppMethodBeat.o(100890);
    }
  }

  public String a(db paramdb)
  {
    AppMethodBeat.i(100919);
    if (this.a != null)
    {
      paramdb = this.a.b(paramdb);
      AppMethodBeat.o(100919);
    }
    while (true)
    {
      return paramdb;
      paramdb = null;
      AppMethodBeat.o(100919);
    }
  }

  public void a()
  {
    if (this.a != null)
      this.a = null;
  }

  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(100909);
    if (this.a == null)
      AppMethodBeat.o(100909);
    while (true)
    {
      return;
      this.a.a(paramFloat1, paramFloat2, paramBoolean);
      AppMethodBeat.o(100909);
    }
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(100892);
    if (this.a == null)
      AppMethodBeat.o(100892);
    while (true)
    {
      return;
      this.a.a(paramInt);
      AppMethodBeat.o(100892);
    }
  }

  public final void a(aj.c paramc)
  {
    AppMethodBeat.i(100898);
    if (this.a == null)
      AppMethodBeat.o(100898);
    while (true)
    {
      return;
      this.a.a(paramc);
      AppMethodBeat.o(100898);
    }
  }

  public final void a(aj.f paramf)
  {
    AppMethodBeat.i(100914);
    if (this.a == null)
      AppMethodBeat.o(100914);
    while (true)
    {
      return;
      this.a.a(paramf);
      AppMethodBeat.o(100914);
    }
  }

  public final void a(aj.g paramg)
  {
    AppMethodBeat.i(100913);
    if (this.a == null)
      AppMethodBeat.o(100913);
    while (true)
    {
      return;
      this.a.a(paramg);
      AppMethodBeat.o(100913);
    }
  }

  public final void a(aj.h paramh)
  {
    AppMethodBeat.i(100896);
    if (this.a == null)
      AppMethodBeat.o(100896);
    while (true)
    {
      return;
      this.a.a(paramh);
      AppMethodBeat.o(100896);
    }
  }

  public void a(aj.i parami)
  {
    AppMethodBeat.i(100911);
    if (this.a != null)
      this.a.a(parami);
    AppMethodBeat.o(100911);
  }

  public final void a(aj.j paramj)
  {
    AppMethodBeat.i(100897);
    if (this.a == null)
      AppMethodBeat.o(100897);
    while (true)
    {
      return;
      this.a.a(paramj);
      AppMethodBeat.o(100897);
    }
  }

  public final void a(aj.k paramk)
  {
    AppMethodBeat.i(100920);
    if (this.a == null)
      AppMethodBeat.o(100920);
    while (true)
    {
      return;
      this.a.a(paramk);
      AppMethodBeat.o(100920);
    }
  }

  public final void a(aj.l paraml)
  {
    AppMethodBeat.i(100912);
    if (this.a == null)
      AppMethodBeat.o(100912);
    while (true)
    {
      return;
      this.a.a(paraml);
      AppMethodBeat.o(100912);
    }
  }

  public void a(aj.p paramp, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(100906);
    if ((this.a == null) || (paramp == null))
      AppMethodBeat.o(100906);
    while (true)
    {
      return;
      this.b = paramp;
      a(this.c, paramConfig);
      AppMethodBeat.o(100906);
    }
  }

  public void a(da paramda)
  {
    AppMethodBeat.i(100927);
    if (this.a != null)
      this.a.a(paramda);
    AppMethodBeat.o(100927);
  }

  public final void a(dn paramdn)
  {
    AppMethodBeat.i(100907);
    if (this.a == null)
      AppMethodBeat.o(100907);
    while (true)
    {
      return;
      this.a.a(paramdn);
      AppMethodBeat.o(100907);
    }
  }

  public void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(100923);
    if ((a(paramString1)) || (a(paramString2)))
      AppMethodBeat.o(100923);
    while (true)
    {
      return;
      this.a.a(paramString1, paramString2);
      AppMethodBeat.o(100923);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100893);
    if (this.a == null)
      AppMethodBeat.o(100893);
    while (true)
    {
      return;
      this.a.a(paramBoolean);
      AppMethodBeat.o(100893);
    }
  }

  public cp b()
  {
    AppMethodBeat.i(100886);
    cp localcp;
    if (this.a == null)
    {
      localcp = null;
      AppMethodBeat.o(100886);
    }
    while (true)
    {
      return localcp;
      localcp = this.a.g();
      AppMethodBeat.o(100886);
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(100916);
    if (this.a != null)
      this.a.b(paramInt);
    AppMethodBeat.o(100916);
  }

  public final void b(dn paramdn)
  {
    AppMethodBeat.i(100908);
    if (this.a == null)
      AppMethodBeat.o(100908);
    while (true)
    {
      return;
      this.a.b(paramdn);
      AppMethodBeat.o(100908);
    }
  }

  public final void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100894);
    if (this.a == null)
      AppMethodBeat.o(100894);
    while (true)
    {
      return;
      this.a.b(paramBoolean);
      AppMethodBeat.o(100894);
    }
  }

  public final float c()
  {
    AppMethodBeat.i(100887);
    float f;
    if (this.a == null)
    {
      f = -1.0F;
      AppMethodBeat.o(100887);
    }
    while (true)
    {
      return f;
      f = this.a.h();
      AppMethodBeat.o(100887);
    }
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(100915);
    if (this.a != null)
      this.a.d(paramBoolean);
    AppMethodBeat.o(100915);
  }

  public final float d()
  {
    AppMethodBeat.i(100888);
    float f;
    if (this.a == null)
    {
      f = -1.0F;
      AppMethodBeat.o(100888);
    }
    while (true)
    {
      return f;
      f = this.a.i();
      AppMethodBeat.o(100888);
    }
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(100921);
    if (this.a == null)
      AppMethodBeat.o(100921);
    while (true)
    {
      return;
      this.a.e(paramBoolean);
      AppMethodBeat.o(100921);
    }
  }

  public final void e()
  {
    AppMethodBeat.i(100891);
    if (this.a == null)
      AppMethodBeat.o(100891);
    while (true)
    {
      return;
      this.a.j();
      AppMethodBeat.o(100891);
    }
  }

  public void e(boolean paramBoolean)
  {
    AppMethodBeat.i(100925);
    if (this.a == null)
      AppMethodBeat.o(100925);
    while (true)
    {
      return;
      this.a.f(paramBoolean);
      AppMethodBeat.o(100925);
    }
  }

  public final boolean f()
  {
    AppMethodBeat.i(100895);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(100895);
    }
    while (true)
    {
      return bool;
      bool = this.a.k();
      AppMethodBeat.o(100895);
    }
  }

  public void g()
  {
    AppMethodBeat.i(100899);
    if (this.a == null)
      AppMethodBeat.o(100899);
    while (true)
    {
      return;
      this.a.n();
      AppMethodBeat.o(100899);
    }
  }

  public void h()
  {
    AppMethodBeat.i(100900);
    if (this.a == null)
      AppMethodBeat.o(100900);
    while (true)
    {
      return;
      this.a.o();
      AppMethodBeat.o(100900);
    }
  }

  public void i()
  {
    AppMethodBeat.i(100901);
    if (this.a == null)
      AppMethodBeat.o(100901);
    while (true)
    {
      return;
      this.a.t();
      AppMethodBeat.o(100901);
    }
  }

  public void j()
  {
    AppMethodBeat.i(100902);
    if (this.a == null)
      AppMethodBeat.o(100902);
    while (true)
    {
      return;
      this.a.u();
      AppMethodBeat.o(100902);
    }
  }

  public void k()
  {
    AppMethodBeat.i(100903);
    if (this.a == null)
      AppMethodBeat.o(100903);
    while (true)
    {
      return;
      this.a.p();
      AppMethodBeat.o(100903);
    }
  }

  public void l()
  {
    AppMethodBeat.i(100904);
    if (this.a == null)
      AppMethodBeat.o(100904);
    while (true)
    {
      return;
      this.a.q();
      AppMethodBeat.o(100904);
    }
  }

  public String m()
  {
    AppMethodBeat.i(100910);
    String str;
    if (this.a == null)
    {
      str = "";
      AppMethodBeat.o(100910);
    }
    while (true)
    {
      return str;
      str = this.a.r();
      AppMethodBeat.o(100910);
    }
  }

  public int n()
  {
    AppMethodBeat.i(100917);
    int i;
    if (this.a != null)
    {
      i = this.a.v();
      AppMethodBeat.o(100917);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(100917);
    }
  }

  public String[] o()
  {
    AppMethodBeat.i(100918);
    String[] arrayOfString;
    if (this.a != null)
    {
      arrayOfString = this.a.w();
      AppMethodBeat.o(100918);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = null;
      AppMethodBeat.o(100918);
    }
  }

  public boolean p()
  {
    AppMethodBeat.i(100922);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(100922);
    }
    while (true)
    {
      return bool;
      bool = this.a.x();
      AppMethodBeat.o(100922);
    }
  }

  public boolean q()
  {
    AppMethodBeat.i(100926);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.y();
      AppMethodBeat.o(100926);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100926);
    }
  }

  public String r()
  {
    AppMethodBeat.i(100928);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(100928);
    }
    while (true)
    {
      return str;
      str = this.a.z();
      AppMethodBeat.o(100928);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.br
 * JD-Core Version:    0.6.2
 */