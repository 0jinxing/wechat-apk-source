package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import com.tencent.liteav.basic.d.a;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.i;
import com.tencent.liteav.basic.e.j;
import com.tencent.liteav.basic.e.k;
import com.tencent.liteav.basic.e.l;
import com.tencent.liteav.basic.e.m;
import com.tencent.liteav.basic.e.n;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class TXCGLSurfaceView extends TXCGLSurfaceViewBase
  implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, l
{
  private boolean A;
  private n B;
  private int C;
  private int D;
  private int E;
  private m F;
  private final Queue<Runnable> G;
  WeakReference<a> a;
  private SurfaceTexture g;
  private EGLContext h;
  private g i;
  private boolean j;
  private int[] k;
  private float[] l;
  private int m;
  private boolean n;
  private float o;
  private float p;
  private int q;
  private long r;
  private long s;
  private int t;
  private boolean u;
  private boolean v;
  private Object w;
  private Handler x;
  private int y;
  private int z;

  public TXCGLSurfaceView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(67183);
    this.j = false;
    this.l = new float[16];
    this.m = 0;
    this.n = false;
    this.o = 1.0F;
    this.p = 1.0F;
    this.q = 20;
    this.r = 0L;
    this.s = 0L;
    this.t = 12288;
    this.u = true;
    this.v = false;
    this.w = new Object();
    this.y = 0;
    this.z = 0;
    this.A = true;
    this.B = null;
    this.C = 0;
    this.G = new LinkedList();
    setEGLContextClientVersion(2);
    a(8, 8, 8, 8, 16, 0);
    setRenderer(this);
    AppMethodBeat.o(67183);
  }

  public TXCGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(67184);
    this.j = false;
    this.l = new float[16];
    this.m = 0;
    this.n = false;
    this.o = 1.0F;
    this.p = 1.0F;
    this.q = 20;
    this.r = 0L;
    this.s = 0L;
    this.t = 12288;
    this.u = true;
    this.v = false;
    this.w = new Object();
    this.y = 0;
    this.z = 0;
    this.A = true;
    this.B = null;
    this.C = 0;
    this.G = new LinkedList();
    setEGLContextClientVersion(2);
    a(8, 8, 8, 8, 16, 0);
    setRenderer(this);
    AppMethodBeat.o(67184);
  }

  private boolean a(Queue<Runnable> paramQueue)
  {
    AppMethodBeat.i(67197);
    while (true)
    {
      try
      {
        if (paramQueue.isEmpty())
        {
          AppMethodBeat.o(67197);
          bool = false;
          return bool;
        }
        Runnable localRunnable = (Runnable)paramQueue.poll();
        if (localRunnable == null)
        {
          AppMethodBeat.o(67197);
          bool = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(67197);
      }
      localObject.run();
      boolean bool = true;
      AppMethodBeat.o(67197);
    }
  }

  private int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt2 / paramInt1;
    float f2 = paramInt4 / paramInt3;
    if (f1 > f2)
    {
      paramInt3 = (int)(paramInt1 * f2);
      paramInt4 = (paramInt2 - paramInt3) / 2;
      int i1 = 0;
      paramInt2 = paramInt3;
      paramInt3 = paramInt1;
      paramInt1 = i1;
    }
    while (true)
    {
      return new int[] { paramInt3, paramInt2, paramInt1, paramInt4 };
      paramInt3 = (int)(paramInt2 / f2);
      paramInt1 = (paramInt1 - paramInt3) / 2;
      paramInt4 = 0;
    }
  }

  private void f()
  {
    AppMethodBeat.i(67200);
    int i1;
    int i2;
    label55: int i3;
    if (this.A)
      if ((this.y != 0) && (this.z != 0))
      {
        if (getWidth() > getHeight())
          break label164;
        i1 = 1;
        if (this.z < this.y)
          break label169;
        i2 = this.z;
        if (this.z < this.y)
          break label177;
        i3 = this.y;
        label71: if (i1 == 0)
          break label185;
        i1 = i3;
        i3 = i2;
        i2 = i1;
      }
    label164: label169: label177: label185: 
    while (true)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(i2 * i3 * 4);
      Bitmap localBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
      localByteBuffer.position(0);
      GLES20.glReadPixels(this.D, this.E, i2, i3, 6408, 5121, localByteBuffer);
      new Thread(new TXCGLSurfaceView.4(this, localByteBuffer, localBitmap, i2, i3)).start();
      this.A = false;
      AppMethodBeat.o(67200);
      return;
      i1 = 0;
      break;
      i2 = this.y;
      break label55;
      i3 = this.z;
      break label71;
    }
  }

  private void g()
  {
    AppMethodBeat.i(67203);
    try
    {
      Thread.sleep(15L);
      AppMethodBeat.o(67203);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67203);
    }
  }

  public void a()
  {
    AppMethodBeat.i(67192);
    b(false);
    AppMethodBeat.o(67192);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(67191);
    this.q = paramInt;
    this.j = false;
    this.B = null;
    this.A = false;
    b(true);
    AppMethodBeat.o(67191);
  }

  public void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(67190);
    if (this.i == null)
    {
      AppMethodBeat.o(67190);
      return;
    }
    while (true)
    {
      int i1;
      int i2;
      float f1;
      float f2;
      boolean bool;
      try
      {
        if (this.c)
        {
          AppMethodBeat.o(67190);
          break;
        }
        i1 = getWidth();
        i2 = getHeight();
        if (this.C == 0)
        {
          this.D = 0;
          this.E = 0;
          i3 = i1;
          i4 = i2;
          this.y = i3;
          this.z = i4;
          GLES20.glViewport(this.D, this.E, i3, i4);
          if (i4 == 0)
            break label402;
          f1 = i3 / i4;
          if (paramInt4 == 0)
            break label408;
          f2 = paramInt3 / paramInt4;
          if ((this.n != paramBoolean) || (this.m != paramInt2) || (this.o != f1) || (this.p != f2))
          {
            this.n = paramBoolean;
            this.m = paramInt2;
            this.o = f1;
            this.p = f2;
            i1 = (720 - this.m) % 360;
            if ((i1 != 90) && (i1 != 270))
              break label414;
            paramInt2 = 1;
            if (paramInt2 == 0)
              break label419;
            i2 = i4;
            if (paramInt2 == 0)
              break label426;
            i4 = i3;
            g localg = this.i;
            float[] arrayOfFloat = k.a(j.a, false, true);
            f1 = i2 / i4;
            if (paramInt2 == 0)
              break label429;
            paramBoolean = false;
            if (paramInt2 == 0)
              break label437;
            bool = this.n;
            localg.a(paramInt3, paramInt4, i1, arrayOfFloat, f1, paramBoolean, bool);
            if (paramInt2 == 0)
              break label443;
            this.i.g();
          }
          GLES20.glBindFramebuffer(36160, 0);
          this.i.a(paramInt1);
          AppMethodBeat.o(67190);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(67190);
      }
      int i4 = i2;
      int i3 = i1;
      if (this.C == 1)
      {
        int[] arrayOfInt = a(i1, i2, paramInt3, paramInt4);
        i3 = arrayOfInt[0];
        i4 = arrayOfInt[1];
        this.D = arrayOfInt[2];
        this.E = arrayOfInt[3];
        continue;
        label402: f1 = 1.0F;
        continue;
        label408: f2 = 1.0F;
        continue;
        label414: paramInt2 = 0;
        continue;
        label419: i2 = i3;
        continue;
        label426: continue;
        label429: paramBoolean = this.n;
        continue;
        label437: bool = false;
        continue;
        label443: this.i.h();
      }
    }
  }

  public void a(n paramn)
  {
    this.B = paramn;
    this.A = true;
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(67193);
    synchronized (this.G)
    {
      this.G.add(paramRunnable);
      AppMethodBeat.o(67193);
      return;
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(67202);
    this.u = true;
    if (paramBoolean)
    {
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GLES20.glClear(16384);
      this.t = d();
    }
    try
    {
      if (this.v)
      {
        this.v = false;
        if (this.g != null)
          this.g.updateTexImage();
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(67202);
    }
  }

  protected void b()
  {
    AppMethodBeat.i(67187);
    if (this.F != null)
      this.F.b(null);
    AppMethodBeat.o(67187);
  }

  public void b(Runnable paramRunnable)
  {
    AppMethodBeat.i(67196);
    synchronized (this.G)
    {
      this.G.add(paramRunnable);
      AppMethodBeat.o(67196);
      return;
    }
  }

  protected int c()
  {
    AppMethodBeat.i(67194);
    if (this.t != 12288)
      TXCLog.e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.t);
    int i1 = this.t;
    AppMethodBeat.o(67194);
    return i1;
  }

  public EGLContext getGLContext()
  {
    return this.h;
  }

  public SurfaceTexture getSurfaceTexture()
  {
    return this.g;
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(67195);
    super.onDetachedFromWindow();
    if ((Build.VERSION.SDK_INT >= 21) && (this.x != null))
      this.x.getLooper().quitSafely();
    AppMethodBeat.o(67195);
  }

  // ERROR //
  public void onDrawFrame(GL10 paramGL10)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 351
    //   5: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: aload_0
    //   10: getfield 112	com/tencent/liteav/renderer/TXCGLSurfaceView:G	Ljava/util/Queue;
    //   13: invokespecial 353	com/tencent/liteav/renderer/TXCGLSurfaceView:a	(Ljava/util/Queue;)Z
    //   16: pop
    //   17: invokestatic 359	java/lang/System:currentTimeMillis	()J
    //   20: lstore_3
    //   21: aload_0
    //   22: getfield 84	com/tencent/liteav/renderer/TXCGLSurfaceView:s	J
    //   25: lconst_0
    //   26: lcmp
    //   27: ifne +8 -> 35
    //   30: aload_0
    //   31: lload_3
    //   32: putfield 84	com/tencent/liteav/renderer/TXCGLSurfaceView:s	J
    //   35: lload_3
    //   36: aload_0
    //   37: getfield 84	com/tencent/liteav/renderer/TXCGLSurfaceView:s	J
    //   40: lsub
    //   41: aload_0
    //   42: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceView:r	J
    //   45: ldc2_w 360
    //   48: lmul
    //   49: aload_0
    //   50: getfield 80	com/tencent/liteav/renderer/TXCGLSurfaceView:q	I
    //   53: i2l
    //   54: ldiv
    //   55: lcmp
    //   56: ifge +10 -> 66
    //   59: aload_0
    //   60: invokespecial 362	com/tencent/liteav/renderer/TXCGLSurfaceView:g	()V
    //   63: goto -46 -> 17
    //   66: aload_0
    //   67: aload_0
    //   68: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceView:r	J
    //   71: lconst_1
    //   72: ladd
    //   73: putfield 82	com/tencent/liteav/renderer/TXCGLSurfaceView:r	J
    //   76: lload_3
    //   77: aload_0
    //   78: getfield 84	com/tencent/liteav/renderer/TXCGLSurfaceView:s	J
    //   81: lsub
    //   82: ldc2_w 363
    //   85: lcmp
    //   86: ifle +15 -> 101
    //   89: aload_0
    //   90: lconst_1
    //   91: putfield 82	com/tencent/liteav/renderer/TXCGLSurfaceView:r	J
    //   94: aload_0
    //   95: invokestatic 359	java/lang/System:currentTimeMillis	()J
    //   98: putfield 84	com/tencent/liteav/renderer/TXCGLSurfaceView:s	J
    //   101: aload_0
    //   102: getfield 88	com/tencent/liteav/renderer/TXCGLSurfaceView:u	Z
    //   105: ifeq +10 -> 115
    //   108: ldc_w 351
    //   111: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: return
    //   115: aload_0
    //   116: monitorenter
    //   117: aload_0
    //   118: getfield 90	com/tencent/liteav/renderer/TXCGLSurfaceView:v	Z
    //   121: ifne +14 -> 135
    //   124: aload_0
    //   125: monitorexit
    //   126: ldc_w 351
    //   129: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -18 -> 114
    //   135: aload_0
    //   136: getfield 282	com/tencent/liteav/renderer/TXCGLSurfaceView:g	Landroid/graphics/SurfaceTexture;
    //   139: ifnull +21 -> 160
    //   142: aload_0
    //   143: getfield 282	com/tencent/liteav/renderer/TXCGLSurfaceView:g	Landroid/graphics/SurfaceTexture;
    //   146: invokevirtual 287	android/graphics/SurfaceTexture:updateTexImage	()V
    //   149: aload_0
    //   150: getfield 282	com/tencent/liteav/renderer/TXCGLSurfaceView:g	Landroid/graphics/SurfaceTexture;
    //   153: aload_0
    //   154: getfield 70	com/tencent/liteav/renderer/TXCGLSurfaceView:l	[F
    //   157: invokevirtual 368	android/graphics/SurfaceTexture:getTransformMatrix	([F)V
    //   160: aload_0
    //   161: iconst_0
    //   162: putfield 90	com/tencent/liteav/renderer/TXCGLSurfaceView:v	Z
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_0
    //   168: getfield 290	com/tencent/liteav/renderer/TXCGLSurfaceView:F	Lcom/tencent/liteav/basic/e/m;
    //   171: ifnull +23 -> 194
    //   174: aload_0
    //   175: getfield 290	com/tencent/liteav/renderer/TXCGLSurfaceView:F	Lcom/tencent/liteav/basic/e/m;
    //   178: aload_0
    //   179: getfield 370	com/tencent/liteav/renderer/TXCGLSurfaceView:k	[I
    //   182: iconst_0
    //   183: iaload
    //   184: aload_0
    //   185: getfield 70	com/tencent/liteav/renderer/TXCGLSurfaceView:l	[F
    //   188: invokeinterface 373 3 0
    //   193: pop
    //   194: aload_0
    //   195: invokespecial 375	com/tencent/liteav/renderer/TXCGLSurfaceView:f	()V
    //   198: aload_0
    //   199: monitorenter
    //   200: aload_0
    //   201: getfield 230	com/tencent/liteav/renderer/TXCGLSurfaceView:c	Z
    //   204: ifne +5 -> 209
    //   207: iconst_1
    //   208: istore_2
    //   209: aload_0
    //   210: monitorexit
    //   211: iload_2
    //   212: ifeq +11 -> 223
    //   215: aload_0
    //   216: aload_0
    //   217: invokevirtual 280	com/tencent/liteav/renderer/TXCGLSurfaceView:d	()I
    //   220: putfield 86	com/tencent/liteav/renderer/TXCGLSurfaceView:t	I
    //   223: ldc_w 351
    //   226: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: goto -115 -> 114
    //   232: astore_1
    //   233: aload_0
    //   234: monitorexit
    //   235: ldc_w 351
    //   238: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   241: aload_1
    //   242: athrow
    //   243: astore_1
    //   244: ldc_w 351
    //   247: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -136 -> 114
    //   253: astore_1
    //   254: aload_0
    //   255: monitorexit
    //   256: ldc_w 351
    //   259: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: aload_1
    //   263: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   117	126	232	finally
    //   135	160	232	finally
    //   160	167	232	finally
    //   233	235	232	finally
    //   115	117	243	java/lang/Exception
    //   167	194	243	java/lang/Exception
    //   194	200	243	java/lang/Exception
    //   215	223	243	java/lang/Exception
    //   235	243	243	java/lang/Exception
    //   256	264	243	java/lang/Exception
    //   200	207	253	finally
    //   209	211	253	finally
    //   254	256	253	finally
  }

  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67201);
    if (!this.j)
    {
      b.a(this.a, 1007, "首帧画面采集完成");
      this.j = true;
    }
    this.u = false;
    try
    {
      this.v = true;
      return;
    }
    finally
    {
      AppMethodBeat.o(67201);
    }
    throw paramSurfaceTexture;
  }

  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
  }

  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(67198);
    this.h = ((EGL10)EGLContext.getEGL()).eglGetCurrentContext();
    this.k = new int[1];
    this.k[0] = i.b();
    if (this.k[0] <= 0)
    {
      this.k = null;
      TXCLog.e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
      AppMethodBeat.o(67198);
    }
    while (true)
    {
      return;
      this.g = new SurfaceTexture(this.k[0]);
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.x != null)
          this.x.getLooper().quitSafely();
        paramGL10 = new HandlerThread("VideoCaptureThread");
        paramGL10.start();
        this.x = new Handler(paramGL10.getLooper());
        this.g.setOnFrameAvailableListener(this, this.x);
      }
      while (true)
      {
        this.i = new g();
        if (this.i.a())
          break label192;
        AppMethodBeat.o(67198);
        break;
        this.g.setOnFrameAvailableListener(this);
      }
      label192: this.i.a(k.e, k.a(j.a, false, false));
      if (this.F != null)
        this.F.a(this.g);
      AppMethodBeat.o(67198);
    }
  }

  public void setFPS(int paramInt)
  {
    AppMethodBeat.i(67185);
    b(new TXCGLSurfaceView.1(this, paramInt));
    AppMethodBeat.o(67185);
  }

  public void setNotifyListener(a parama)
  {
    AppMethodBeat.i(67189);
    this.a = new WeakReference(parama);
    AppMethodBeat.o(67189);
  }

  public void setRendMode(int paramInt)
  {
    AppMethodBeat.i(67186);
    b(new TXCGLSurfaceView.2(this, paramInt));
    AppMethodBeat.o(67186);
  }

  protected void setRunInBackground(boolean paramBoolean)
  {
    AppMethodBeat.i(67188);
    if (paramBoolean);
    while (true)
    {
      try
      {
        TXCLog.d("TXCGLSurfaceView", "background capture enter background");
        this.c = true;
        return;
      }
      finally
      {
        AppMethodBeat.o(67188);
      }
      b(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(67221);
          try
          {
            TXCLog.d("TXCGLSurfaceView", "background capture exit background");
            TXCGLSurfaceView.this.c = false;
            return;
          }
          finally
          {
            AppMethodBeat.o(67221);
          }
        }
      });
      AppMethodBeat.o(67188);
    }
  }

  public void setSurfaceTextureListener(m paramm)
  {
    this.F = paramm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceView
 * JD-Core Version:    0.6.2
 */