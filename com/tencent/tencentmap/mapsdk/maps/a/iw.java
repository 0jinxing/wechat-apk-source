package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ak;

public class iw extends View
  implements gg
{
  private Context a;
  private iz b;
  private Object c;
  private int d;
  private int e;
  private ak f;
  private iy g;
  private boolean h;
  private boolean i;

  public iw(Context paramContext, ak paramak)
  {
    super(paramContext);
    AppMethodBeat.i(99883);
    this.h = true;
    this.i = false;
    Object localObject;
    if ((paramak != null) && (paramContext != null))
    {
      localObject = paramak.d();
      if (localObject == null)
        AppMethodBeat.o(99883);
    }
    while (true)
    {
      return;
      this.a = paramContext.getApplicationContext();
      this.c = localObject;
      this.d = paramak.e();
      this.e = paramak.f();
      if ((this.e <= 0) || (this.d <= 0))
      {
        this.d = 0;
        this.e = 0;
      }
      this.f = paramak;
      this.b = new iz(this, this.a, this.f);
      AppMethodBeat.o(99883);
    }
  }

  private void b()
  {
    AppMethodBeat.i(99890);
    if ((this.b != null) && (this.h == true))
    {
      this.b.a(null, null);
      this.b.a(null, this.d, this.e);
      this.b.a(this.d, this.e);
      this.h = false;
    }
    AppMethodBeat.o(99890);
  }

  private void c()
  {
    AppMethodBeat.i(99891);
    if (this.g == null)
      this.g = new iy(this.c, this.b);
    if (!this.i)
    {
      this.g.start();
      this.i = true;
    }
    AppMethodBeat.o(99891);
  }

  public void a_()
  {
    AppMethodBeat.i(99884);
    if (this.g != null);
    while (true)
    {
      synchronized (this.g)
      {
        this.g.notify();
        AppMethodBeat.o(99884);
        return;
      }
      AppMethodBeat.o(99884);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99885);
    if (this.b != null)
      this.b.e();
    if (this.g != null)
      this.g.b();
    b();
    c();
    AppMethodBeat.o(99885);
  }

  public void f()
  {
    AppMethodBeat.i(99886);
    if (this.b != null)
      this.b.f();
    if (this.g != null)
      this.g.a();
    AppMethodBeat.o(99886);
  }

  public void g()
  {
    AppMethodBeat.i(99887);
    if (this.b != null)
      this.b.g();
    if (this.g != null)
      this.g.c();
    AppMethodBeat.o(99887);
  }

  public ge getVectorMapDelegate()
  {
    return this.b;
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99889);
    if (this.b != null)
    {
      this.d = paramInt1;
      this.e = paramInt2;
      this.b.a(null, paramInt1, paramInt2);
      this.b.a(paramInt1, paramInt2);
      this.b.h();
      this.h = true;
    }
    AppMethodBeat.o(99889);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99888);
    boolean bool;
    if (this.b != null)
    {
      bool = this.b.a(paramMotionEvent);
      AppMethodBeat.o(99888);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99888);
    }
  }

  public void setZOrderMediaOverlay(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iw
 * JD-Core Version:    0.6.2
 */