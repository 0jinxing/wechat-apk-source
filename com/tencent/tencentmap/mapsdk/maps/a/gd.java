package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.tencent.map.lib.a;
import com.tencent.map.lib.f;
import com.tencent.map.lib.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class gd
  implements ge
{
  protected gg a;
  private Context b;
  private f c;
  private gm d;
  private gp e;
  private gy f;
  private float g;
  private Handler h;
  private int i;

  public gd(gg paramgg, Context paramContext)
  {
    AppMethodBeat.i(98989);
    this.g = 0.5F;
    this.h = new Handler();
    this.i = 0;
    this.a = null;
    this.a = paramgg;
    this.b = paramContext;
    k();
    AppMethodBeat.o(98989);
  }

  private float a(float paramFloat)
  {
    AppMethodBeat.i(99011);
    int j = (int)paramFloat;
    paramFloat = (float)Math.pow(2.0D, paramFloat - j);
    float f1 = 1 << j - 3;
    AppMethodBeat.o(99011);
    return f1 * 3.051758E-005F * paramFloat;
  }

  private void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(99010);
    this.d.a().a(paramFloat1, paramFloat2, 0, paramBoolean);
    AppMethodBeat.o(99010);
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(98994);
    float f1;
    float f2;
    if ((this.d != null) && (this.h != null))
    {
      f1 = this.d.a().l();
      f2 = a(paramFloat3);
      if (Math.abs(f1 - f2) <= 0.0001D)
        break label104;
    }
    label104: for (boolean bool = true; ; bool = false)
    {
      this.i = 0;
      f1 = (paramFloat2 - this.g) / 10.0F;
      this.h.post(new gd.1(this, f1, paramFloat1, paramFloat2, paramFloat3, bool, f2));
      AppMethodBeat.o(98994);
      return;
    }
  }

  public void a(a parama, hf paramhf)
  {
    AppMethodBeat.i(98993);
    if (this.d.a(this.b.getApplicationContext(), parama, paramhf))
      this.d.a().k();
    AppMethodBeat.o(98993);
  }

  public void a(gf paramgf)
  {
    AppMethodBeat.i(98991);
    this.e.a(paramgf);
    AppMethodBeat.o(98991);
  }

  public void a(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99007);
    this.d.a(paramInt1, paramInt2);
    AppMethodBeat.o(99007);
  }

  public void a(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(99006);
    this.d.a(paramGL10);
    AppMethodBeat.o(99006);
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98997);
    if (this.f != null)
    {
      this.f.b();
      this.f.a(paramArrayOfByte);
    }
    AppMethodBeat.o(98997);
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99004);
    boolean bool;
    if (this.e != null)
    {
      bool = this.e.onTouch(null, paramMotionEvent);
      AppMethodBeat.o(99004);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99004);
    }
  }

  public boolean a(GL10 paramGL10)
  {
    AppMethodBeat.i(99008);
    boolean bool = this.d.b(paramGL10);
    AppMethodBeat.o(99008);
    return bool;
  }

  public void a_()
  {
    AppMethodBeat.i(98990);
    if (this.a != null)
      this.a.a_();
    AppMethodBeat.o(98990);
  }

  public f b()
  {
    return this.c;
  }

  public void b(gf paramgf)
  {
    AppMethodBeat.i(98992);
    this.e.b(paramgf);
    AppMethodBeat.o(98992);
  }

  public gm c()
  {
    return this.d;
  }

  public void d()
  {
    AppMethodBeat.i(98996);
    if (this.d != null)
    {
      getEGLContextHash();
      this.d.n();
    }
    AppMethodBeat.o(98996);
  }

  public void e()
  {
    AppMethodBeat.i(98998);
    if (this.f != null)
      this.f.b();
    this.d.l();
    AppMethodBeat.o(98998);
  }

  public void f()
  {
    AppMethodBeat.i(98999);
    if (this.f != null)
      this.f.a();
    this.d.m();
    AppMethodBeat.o(98999);
  }

  public void g()
  {
    AppMethodBeat.i(99000);
    b.a();
    AppMethodBeat.o(99000);
  }

  public int getEGLContextHash()
  {
    AppMethodBeat.i(98995);
    Object localObject = (EGL10)EGLContext.getEGL();
    int j;
    if (localObject != null)
    {
      localObject = ((EGL10)localObject).eglGetCurrentContext();
      if (localObject != null)
      {
        j = localObject.hashCode();
        AppMethodBeat.o(98995);
      }
    }
    while (true)
    {
      return j;
      j = 0;
      AppMethodBeat.o(98995);
    }
  }

  public int getHeight()
  {
    AppMethodBeat.i(99003);
    int j;
    if (this.a != null)
    {
      j = this.a.getHeight();
      AppMethodBeat.o(99003);
    }
    while (true)
    {
      return j;
      j = 2147483647;
      AppMethodBeat.o(99003);
    }
  }

  public ge getVectorMapDelegate()
  {
    return this;
  }

  public int getWidth()
  {
    AppMethodBeat.i(99002);
    int j;
    if (this.a != null)
    {
      j = this.a.getWidth();
      AppMethodBeat.o(99002);
    }
    while (true)
    {
      return j;
      j = 2147483647;
      AppMethodBeat.o(99002);
    }
  }

  public void h()
  {
    AppMethodBeat.i(99005);
    if (this.a != null)
      this.a.a_();
    AppMethodBeat.o(99005);
  }

  public Context i()
  {
    return this.b;
  }

  public void j()
  {
  }

  public void k()
  {
    AppMethodBeat.i(99009);
    if (this.b == null)
      AppMethodBeat.o(99009);
    while (true)
    {
      return;
      this.e = new gp(this);
      if (this.d == null)
        this.d = new gm(this.b, this);
      this.c = new f(this.d);
      this.e.a(this.d);
      WindowManager localWindowManager = (WindowManager)this.b.getSystemService("window");
      int j = localWindowManager.getDefaultDisplay().getWidth();
      int k = localWindowManager.getDefaultDisplay().getHeight();
      this.d.b(j, k);
      this.f = new gy(c());
      this.f.start();
      AppMethodBeat.o(99009);
    }
  }

  public void l()
  {
    AppMethodBeat.i(99012);
    if (this.d != null)
      this.d.q();
    AppMethodBeat.o(99012);
  }

  protected boolean m()
  {
    AppMethodBeat.i(99013);
    Object localObject = i();
    boolean bool1;
    if (localObject == null)
    {
      AppMethodBeat.o(99013);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      localObject = (AccessibilityManager)((Context)localObject).getSystemService("accessibility");
      bool1 = ((AccessibilityManager)localObject).isEnabled();
      if (Build.VERSION.SDK_INT < 14)
      {
        AppMethodBeat.o(99013);
      }
      else
      {
        boolean bool2 = ((AccessibilityManager)localObject).isTouchExplorationEnabled();
        if ((bool1) && (bool2))
        {
          bool1 = true;
          AppMethodBeat.o(99013);
        }
        else
        {
          AppMethodBeat.o(99013);
          bool1 = false;
        }
      }
    }
  }

  public boolean n()
  {
    AppMethodBeat.i(99014);
    boolean bool;
    if ((this.d != null) && (this.d.F()))
    {
      bool = true;
      AppMethodBeat.o(99014);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99014);
    }
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void setZOrderMediaOverlay(boolean paramBoolean)
  {
    AppMethodBeat.i(99001);
    if (this.a != null)
      this.a.setZOrderMediaOverlay(paramBoolean);
    AppMethodBeat.o(99001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gd
 * JD-Core Version:    0.6.2
 */