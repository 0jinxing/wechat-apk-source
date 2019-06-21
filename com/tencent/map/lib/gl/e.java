package com.tencent.map.lib.gl;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

public class e extends SurfaceView
  implements SurfaceHolder.Callback
{
  private static final j a;
  private final WeakReference<e> b;
  private e.i c;
  private e.m d;
  private boolean e;
  private e.e f;
  private e.f g;
  private e.g h;
  private e.k i;
  private int j;
  private int k;
  private boolean l;

  static
  {
    AppMethodBeat.i(98123);
    a = new j(null);
    AppMethodBeat.o(98123);
  }

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(98102);
    this.b = new WeakReference(this);
    a();
    AppMethodBeat.o(98102);
  }

  private void a()
  {
    AppMethodBeat.i(98104);
    getHolder().addCallback(this);
    AppMethodBeat.o(98104);
  }

  private void d()
  {
    AppMethodBeat.i(98122);
    if (this.c != null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("setRenderer has already been called for this instance.");
      AppMethodBeat.o(98122);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(98122);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(98110);
    setEGLConfigChooser(new e.b(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6));
    AppMethodBeat.o(98110);
  }

  public void b()
  {
    AppMethodBeat.i(98114);
    this.c.c();
    AppMethodBeat.o(98114);
  }

  public void e()
  {
    AppMethodBeat.i(98119);
    this.c.g();
    AppMethodBeat.o(98119);
  }

  public void f()
  {
    AppMethodBeat.i(98118);
    this.c.f();
    AppMethodBeat.o(98118);
  }

  protected void finalize()
  {
    AppMethodBeat.i(98103);
    try
    {
      if (this.c != null)
        this.c.h();
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(98103);
    }
  }

  public int getDebugFlags()
  {
    return this.j;
  }

  public boolean getPreserveEGLContextOnPause()
  {
    return this.l;
  }

  public int getRenderMode()
  {
    AppMethodBeat.i(98113);
    int m = this.c.b();
    AppMethodBeat.o(98113);
    return m;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(98120);
    super.onAttachedToWindow();
    if ((this.e) && (this.d != null))
      if (this.c == null)
        break label84;
    label84: for (int m = this.c.b(); ; m = 1)
    {
      this.c = new e.i(this.b);
      if (m != 1)
        this.c.a(m);
      this.c.start();
      this.e = false;
      AppMethodBeat.o(98120);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(98121);
    if (this.c != null)
      this.c.h();
    this.e = true;
    super.onDetachedFromWindow();
    AppMethodBeat.o(98121);
  }

  public void setDebugFlags(int paramInt)
  {
    this.j = paramInt;
  }

  public void setEGLConfigChooser(e.e parame)
  {
    AppMethodBeat.i(98108);
    d();
    this.f = parame;
    AppMethodBeat.o(98108);
  }

  public void setEGLConfigChooser(boolean paramBoolean)
  {
    AppMethodBeat.i(98109);
    setEGLConfigChooser(new e.n(this, paramBoolean));
    AppMethodBeat.o(98109);
  }

  public void setEGLContextClientVersion(int paramInt)
  {
    AppMethodBeat.i(98111);
    d();
    this.k = paramInt;
    AppMethodBeat.o(98111);
  }

  public void setEGLContextFactory(e.f paramf)
  {
    AppMethodBeat.i(98106);
    d();
    this.g = paramf;
    AppMethodBeat.o(98106);
  }

  public void setEGLWindowSurfaceFactory(e.g paramg)
  {
    AppMethodBeat.i(98107);
    d();
    this.h = paramg;
    AppMethodBeat.o(98107);
  }

  public void setGLWrapper(e.k paramk)
  {
    this.i = paramk;
  }

  public void setPreserveEGLContextOnPause(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(98112);
    this.c.a(paramInt);
    AppMethodBeat.o(98112);
  }

  public void setRenderer(e.m paramm)
  {
    AppMethodBeat.i(98105);
    d();
    if (this.f == null)
      this.f = new e.n(this, true);
    if (this.g == null)
      this.g = new e.c(this, null);
    if (this.h == null)
      this.h = new e.d(null);
    this.d = paramm;
    this.c = new e.i(this.b);
    this.c.start();
    AppMethodBeat.o(98105);
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(98117);
    this.c.a(paramInt2, paramInt3);
    AppMethodBeat.o(98117);
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(98115);
    this.c.d();
    AppMethodBeat.o(98115);
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(98116);
    this.c.e();
    AppMethodBeat.o(98116);
  }

  abstract class a
    implements e.e
  {
    protected int[] a;

    public a(int[] arg2)
    {
      int[] arrayOfInt;
      this.a = a(arrayOfInt);
    }

    private int[] a(int[] paramArrayOfInt)
    {
      if (e.a(e.this) != 2);
      while (true)
      {
        return paramArrayOfInt;
        int i = paramArrayOfInt.length;
        int[] arrayOfInt = new int[i + 2];
        System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i - 1);
        arrayOfInt[(i - 1)] = 12352;
        arrayOfInt[i] = 4;
        arrayOfInt[(i + 1)] = 12344;
        paramArrayOfInt = arrayOfInt;
      }
    }

    public EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
    {
      int[] arrayOfInt = new int[1];
      if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.a, null, 0, arrayOfInt))
        throw new IllegalArgumentException("eglChooseConfig failed");
      int i = arrayOfInt[0];
      if (i <= 0)
        throw new IllegalArgumentException("No configs match configSpec");
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
      if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.a, arrayOfEGLConfig, i, arrayOfInt))
        throw new IllegalArgumentException("eglChooseConfig#2 failed");
      paramEGL10 = a(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
      if (paramEGL10 == null)
        throw new IllegalArgumentException("No config chosen");
      return paramEGL10;
    }

    abstract EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig);
  }

  static class j
  {
    private static String a = "GLThreadManager";
    private boolean b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private e.i g;

    private void c()
    {
      if (!this.b)
      {
        this.c = 131072;
        if (this.c >= 131072)
          this.e = true;
        this.b = true;
      }
    }

    public void a(e.i parami)
    {
      try
      {
        AppMethodBeat.i(98091);
        e.i.a(parami, true);
        if (this.g == parami)
          this.g = null;
        notifyAll();
        AppMethodBeat.o(98091);
        return;
      }
      finally
      {
      }
      throw parami;
    }

    public void a(GL10 paramGL10)
    {
      boolean bool1 = true;
      try
      {
        AppMethodBeat.i(98095);
        if (!this.d)
        {
          c();
          paramGL10 = paramGL10.glGetString(7937);
          if (this.c < 131072)
          {
            if (paramGL10.startsWith("Q3Dimension MSM7500 "))
              break label86;
            bool2 = true;
            this.e = bool2;
            notifyAll();
          }
          if (this.e)
            break label91;
        }
        label86: label91: for (boolean bool2 = bool1; ; bool2 = false)
        {
          this.f = bool2;
          this.d = true;
          AppMethodBeat.o(98095);
          return;
          bool2 = false;
          break;
        }
      }
      finally
      {
      }
      throw paramGL10;
    }

    public boolean a()
    {
      try
      {
        boolean bool = this.f;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    public boolean b()
    {
      try
      {
        AppMethodBeat.i(98094);
        c();
        boolean bool;
        if (!this.e)
        {
          bool = true;
          AppMethodBeat.o(98094);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(98094);
        }
      }
      finally
      {
      }
    }

    public boolean b(e.i parami)
    {
      boolean bool = true;
      AppMethodBeat.i(98092);
      if ((this.g == parami) || (this.g == null))
      {
        this.g = parami;
        notifyAll();
        AppMethodBeat.o(98092);
      }
      while (true)
      {
        return bool;
        c();
        if (this.e)
        {
          AppMethodBeat.o(98092);
        }
        else
        {
          if (this.g != null)
            this.g.i();
          bool = false;
          AppMethodBeat.o(98092);
        }
      }
    }

    public void c(e.i parami)
    {
      AppMethodBeat.i(98093);
      if (this.g == parami)
        this.g = null;
      notifyAll();
      AppMethodBeat.o(98093);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e
 * JD-Core Version:    0.6.2
 */