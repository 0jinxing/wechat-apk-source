package com.tencent.liteav.basic.e;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGLContext;

public class e
  implements f.a, l
{
  public int a;
  private volatile HandlerThread b;
  private volatile f c;
  private m d;
  private int[] e;
  private SurfaceTexture f;
  private boolean g;
  private long h;
  private long i;
  private float[] j;

  public e()
  {
    AppMethodBeat.i(66238);
    this.b = null;
    this.c = null;
    this.e = null;
    this.f = null;
    this.g = false;
    this.a = 25;
    this.h = 0L;
    this.i = 0L;
    this.j = new float[16];
    AppMethodBeat.o(66238);
  }

  private void a(int paramInt, long paramLong)
  {
    AppMethodBeat.i(66249);
    try
    {
      if (this.c != null)
        this.c.sendEmptyMessageDelayed(paramInt, paramLong);
      return;
    }
    finally
    {
      AppMethodBeat.o(66249);
    }
  }

  private void a(int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(66251);
    try
    {
      if (this.c != null)
      {
        Message localMessage = new android/os/Message;
        localMessage.<init>();
        localMessage.what = paramInt;
        localMessage.obj = paramRunnable;
        this.c.sendMessage(localMessage);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(66251);
    }
    throw paramRunnable;
  }

  private void b()
  {
    AppMethodBeat.i(66247);
    f();
    try
    {
      Object localObject1 = new android/os/HandlerThread;
      ((HandlerThread)localObject1).<init>("TXGLSurfaceTextureThread");
      this.b = ((HandlerThread)localObject1);
      this.b.start();
      localObject1 = new com/tencent/liteav/basic/e/f;
      ((f)localObject1).<init>(this.b.getLooper());
      this.c = ((f)localObject1);
      this.c.a(this);
      this.c.a = 1280;
      this.c.b = 720;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("create gl thread ");
      TXCLog.w("TXGLSurfaceTextureThread", this.b.getName());
      b(100);
      AppMethodBeat.o(66247);
      return;
    }
    finally
    {
      AppMethodBeat.o(66247);
    }
  }

  private void b(int paramInt)
  {
    AppMethodBeat.i(66250);
    try
    {
      if (this.c != null)
        this.c.sendEmptyMessage(paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(66250);
    }
  }

  private void f()
  {
    AppMethodBeat.i(66248);
    try
    {
      if (this.c != null)
      {
        f.a(this.c, this.b);
        TXCLog.w("TXGLSurfaceTextureThread", "destroy gl thread");
      }
      this.c = null;
      this.b = null;
      return;
    }
    finally
    {
      AppMethodBeat.o(66248);
    }
  }

  private void g()
  {
    AppMethodBeat.i(66252);
    TXCLog.w("TXGLSurfaceTextureThread", "destroy surface texture ");
    m localm = this.d;
    if (localm != null)
      localm.b(this.f);
    if (this.f != null)
    {
      this.f.setOnFrameAvailableListener(null);
      this.f.release();
      this.g = false;
      this.f = null;
    }
    if (this.e != null)
    {
      GLES20.glDeleteTextures(1, this.e, 0);
      this.e = null;
    }
    AppMethodBeat.o(66252);
  }

  private void h()
  {
    AppMethodBeat.i(66253);
    TXCLog.w("TXGLSurfaceTextureThread", "init surface texture ");
    this.e = new int[1];
    this.e[0] = i.b();
    if (this.e[0] <= 0)
    {
      this.e = null;
      AppMethodBeat.o(66253);
    }
    while (true)
    {
      return;
      this.f = new SurfaceTexture(this.e[0]);
      this.f.setDefaultBufferSize(1280, 720);
      this.f.setOnFrameAvailableListener(new e.2(this));
      m localm = this.d;
      if (localm != null)
        localm.a(this.f);
      AppMethodBeat.o(66253);
    }
  }

  private boolean i()
  {
    boolean bool = false;
    AppMethodBeat.i(66254);
    if (!this.g)
    {
      this.h = 0L;
      this.i = System.nanoTime();
      AppMethodBeat.o(66254);
    }
    long l;
    while (true)
    {
      return bool;
      l = System.nanoTime();
      if (l >= this.i + this.h * 1000L * 1000L * 1000L / this.a)
        break;
      AppMethodBeat.o(66254);
    }
    if (this.i == 0L)
      this.i = l;
    while (true)
    {
      this.h += 1L;
      bool = true;
      AppMethodBeat.o(66254);
      break;
      if (l > this.i + 1000000000L)
      {
        this.h = 0L;
        this.i = l;
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(66240);
    f();
    AppMethodBeat.o(66240);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66239);
    this.a = paramInt;
    b();
    AppMethodBeat.o(66239);
  }

  public void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(66242);
    try
    {
      if (this.c != null)
        this.c.post(paramRunnable);
      return;
    }
    finally
    {
      AppMethodBeat.o(66242);
    }
    throw paramRunnable;
  }

  // ERROR //
  public void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 224
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	com/tencent/liteav/basic/e/e:c	Lcom/tencent/liteav/basic/e/f;
    //   11: ifnull +11 -> 22
    //   14: aload_0
    //   15: getfield 41	com/tencent/liteav/basic/e/e:c	Lcom/tencent/liteav/basic/e/f;
    //   18: aconst_null
    //   19: invokevirtual 228	com/tencent/liteav/basic/e/f:removeCallbacksAndMessages	(Ljava/lang/Object;)V
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield 47	com/tencent/liteav/basic/e/e:g	Z
    //   27: aload_0
    //   28: getfield 45	com/tencent/liteav/basic/e/e:f	Landroid/graphics/SurfaceTexture;
    //   31: ifnull +12 -> 43
    //   34: aload_0
    //   35: getfield 43	com/tencent/liteav/basic/e/e:e	[I
    //   38: astore_2
    //   39: aload_2
    //   40: ifnonnull +11 -> 51
    //   43: aload_0
    //   44: monitorexit
    //   45: ldc 224
    //   47: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: return
    //   51: aload_0
    //   52: getfield 45	com/tencent/liteav/basic/e/e:f	Landroid/graphics/SurfaceTexture;
    //   55: invokevirtual 231	android/graphics/SurfaceTexture:updateTexImage	()V
    //   58: aload_0
    //   59: getfield 45	com/tencent/liteav/basic/e/e:f	Landroid/graphics/SurfaceTexture;
    //   62: astore_3
    //   63: new 233	com/tencent/liteav/basic/e/e$1
    //   66: astore_2
    //   67: aload_2
    //   68: aload_0
    //   69: invokespecial 234	com/tencent/liteav/basic/e/e$1:<init>	(Lcom/tencent/liteav/basic/e/e;)V
    //   72: aload_3
    //   73: aload_2
    //   74: invokevirtual 167	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   77: aload_0
    //   78: monitorexit
    //   79: ldc 224
    //   81: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: goto -34 -> 50
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: ldc 224
    //   92: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: aload_2
    //   96: athrow
    //   97: astore_2
    //   98: goto -40 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   7	22	87	finally
    //   22	39	87	finally
    //   43	45	87	finally
    //   51	58	87	finally
    //   58	79	87	finally
    //   88	90	87	finally
    //   7	22	97	java/lang/Exception
    //   22	39	97	java/lang/Exception
    //   51	58	97	java/lang/Exception
  }

  public void c()
  {
    AppMethodBeat.i(66244);
    h();
    AppMethodBeat.o(66244);
  }

  public void d()
  {
    AppMethodBeat.i(66245);
    a(102, 5L);
    if (!i())
      AppMethodBeat.o(66245);
    while (true)
    {
      return;
      if ((this.f == null) || (this.e == null))
      {
        AppMethodBeat.o(66245);
        continue;
      }
      try
      {
        this.f.updateTexImage();
        this.f.getTransformMatrix(this.j);
        m localm = this.d;
        if (localm != null)
          localm.a(this.e[0], this.j);
        AppMethodBeat.o(66245);
      }
      catch (Exception localException)
      {
        while (true)
          TXCLog.e("TXGLSurfaceTextureThread", "onMsgRend Exception " + localException.getMessage());
      }
    }
  }

  public void e()
  {
    AppMethodBeat.i(66246);
    g();
    AppMethodBeat.o(66246);
  }

  public EGLContext getGLContext()
  {
    AppMethodBeat.i(66241);
    try
    {
      if (this.c != null);
      for (EGLContext localEGLContext = this.c.a(); ; localEGLContext = null)
        return localEGLContext;
    }
    finally
    {
      AppMethodBeat.o(66241);
    }
  }

  public SurfaceTexture getSurfaceTexture()
  {
    return this.f;
  }

  public void setSurfaceTextureListener(m paramm)
  {
    this.d = paramm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.e
 * JD-Core Version:    0.6.2
 */