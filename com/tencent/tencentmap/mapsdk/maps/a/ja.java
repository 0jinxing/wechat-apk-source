package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.view.MotionEvent;
import com.tencent.map.lib.gl.JNICallback.f;
import com.tencent.map.lib.gl.e;
import com.tencent.map.lib.gl.e.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ak;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class ja extends e
  implements JNICallback.f, e.m, gg
{
  private iz a;
  private boolean b;
  private Object c;

  public ja(Context paramContext, ak paramak)
  {
    super(paramContext);
    AppMethodBeat.i(99988);
    if ((paramak != null) && (paramak.d() != null))
      this.c = paramak.d();
    d();
    this.a = new iz(this, getContext().getApplicationContext(), paramak);
    setContentDescription("地图");
    AppMethodBeat.o(99988);
  }

  private void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100002);
    if (this.a != null)
      this.a.a(paramArrayOfByte);
    AppMethodBeat.o(100002);
  }

  private void h()
  {
    AppMethodBeat.i(100000);
    setEGLContextClientVersion(2);
    setPreserveEGLContextOnPause(true);
    a(8, 8, 8, 8, 16, 0);
    setEGLContextFactory(new ja.1(this));
    if (this.c != null)
      setEGLWindowSurfaceFactory(new ja.2(this));
    AppMethodBeat.o(100000);
  }

  private void i()
  {
    AppMethodBeat.i(100001);
    if (this.a != null)
      this.a.d();
    AppMethodBeat.o(100001);
  }

  public void a(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99990);
    if (this.a != null)
      this.a.a(paramGL10, paramInt1, paramInt2);
    AppMethodBeat.o(99990);
  }

  public void a(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(99989);
    if (this.a != null)
      this.a.a(paramGL10, paramEGLConfig);
    AppMethodBeat.o(99989);
  }

  public boolean a(GL10 paramGL10)
  {
    AppMethodBeat.i(99998);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(99998);
    }
    while (true)
    {
      return bool;
      bool = this.a.a(paramGL10);
      AppMethodBeat.o(99998);
    }
  }

  public void a_()
  {
    AppMethodBeat.i(99997);
    if (getVisibility() == 0)
      b();
    AppMethodBeat.o(99997);
  }

  public void d()
  {
    AppMethodBeat.i(100003);
    h();
    setRenderer(this);
    setRenderMode(0);
    this.b = ew.a(this, true);
    AppMethodBeat.o(100003);
  }

  protected boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(100004);
    boolean bool;
    if ((this.a != null) && (this.a.b(paramMotionEvent)))
    {
      bool = true;
      AppMethodBeat.o(100004);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchHoverEvent(paramMotionEvent);
      AppMethodBeat.o(100004);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99996);
    if (this.b)
      super.e();
    if (this.a != null)
      this.a.e();
    AppMethodBeat.o(99996);
  }

  public void f()
  {
    AppMethodBeat.i(99995);
    if (this.b)
      super.f();
    if (this.a != null)
      this.a.f();
    AppMethodBeat.o(99995);
  }

  public void g()
  {
    AppMethodBeat.i(99994);
    if (this.a != null)
      this.a.g();
    AppMethodBeat.o(99994);
  }

  public int getEGLContextHash()
  {
    AppMethodBeat.i(99999);
    int i;
    if (this.a != null)
    {
      i = this.a.getEGLContextHash();
      AppMethodBeat.o(99999);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(99999);
    }
  }

  public iz getVectorMapDelegate()
  {
    return this.a;
  }

  public void j()
  {
    AppMethodBeat.i(99991);
    if (this.a != null)
      this.a.j();
    AppMethodBeat.o(99991);
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99992);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
      this.a.a(paramInt1, paramInt2);
    AppMethodBeat.o(99992);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99993);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.a(paramMotionEvent);
      AppMethodBeat.o(99993);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99993);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ja
 * JD-Core Version:    0.6.2
 */