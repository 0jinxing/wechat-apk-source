package com.tencent.liteav.beauty;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.h;
import com.tencent.liteav.basic.e.i.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.b.j;
import com.tencent.liteav.beauty.b.k;
import com.tencent.liteav.beauty.b.l;
import com.tencent.liteav.beauty.b.m;
import com.tencent.liteav.beauty.b.n;
import com.tencent.liteav.beauty.b.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class b extends HandlerThread
{
  private int A;
  private int B;
  private boolean C;
  private float[] D;
  private int E;
  private int F;
  private com.tencent.liteav.basic.e.a G;
  private Bitmap H;
  private k I;
  private n J;
  private com.tencent.liteav.beauty.b.b K;
  private com.tencent.liteav.beauty.b.a.a L;
  private com.tencent.liteav.beauty.b.b.a M;
  private com.tencent.liteav.beauty.b.c N;
  private Bitmap O;
  private Bitmap P;
  private float Q;
  private float R;
  private float S;
  private l T;
  private m U;
  private v V;
  private j W;
  private com.tencent.liteav.beauty.b.i X;
  private g Y;
  private g Z;
  boolean a;
  private byte[] aA;
  private int aB;
  private int aC;
  private int aD;
  private int aE;
  private d aF;
  private WeakReference<com.tencent.liteav.basic.d.a> aG;
  private i.a aH;
  private h aa;
  private g ab;
  private final Queue<Runnable> ac;
  private boolean ad;
  private Object ae;
  private Object af;
  private Handler ag;
  private b.a ah;
  private float ai;
  private int aj;
  private int ak;
  private int al;
  private int am;
  private int an;
  private boolean ao;
  private com.tencent.liteav.beauty.a.a.c ap;
  private com.tencent.liteav.beauty.a.a.a aq;
  private Bitmap ar;
  private List<c.d> as;
  private long at;
  private int au;
  private final int av;
  private final float aw;
  private byte[] ax;
  private int[] ay;
  private boolean az;
  protected int[] b;
  protected int[] c;
  com.tencent.liteav.beauty.b.a d;
  com.tencent.liteav.beauty.b.a e;
  com.tencent.liteav.beauty.b.a f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private Context m;
  private boolean n;
  private c.d o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private float x;
  private int y;
  private int z;

  b(Context paramContext, boolean paramBoolean)
  {
    super("TXCFilterDrawer");
    AppMethodBeat.i(66847);
    this.g = 0;
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = null;
    this.n = true;
    this.o = null;
    this.p = -1;
    this.q = -1;
    this.r = -1;
    this.s = -1;
    this.t = -1;
    this.u = -1;
    this.v = -1;
    this.w = -1;
    this.x = 1.0F;
    this.y = -1;
    this.z = -1;
    this.A = 0;
    this.B = 0;
    this.C = false;
    this.E = 0;
    this.F = 0;
    this.G = null;
    this.H = null;
    this.I = null;
    this.J = null;
    this.K = null;
    this.L = null;
    this.M = null;
    this.N = null;
    this.U = null;
    this.V = null;
    this.W = null;
    this.X = null;
    this.Y = null;
    this.Z = null;
    this.aa = null;
    this.ab = null;
    this.ac = new LinkedList();
    this.a = false;
    this.ae = new Object();
    this.af = new Object();
    this.ai = 0.5F;
    this.aj = 0;
    this.ak = 0;
    this.al = 0;
    this.am = 0;
    this.an = 0;
    this.ao = false;
    this.ap = null;
    this.aq = null;
    this.ar = null;
    this.as = null;
    this.at = 0L;
    this.au = 0;
    this.av = 100;
    this.aw = 1000.0F;
    this.ax = null;
    this.ay = null;
    this.az = false;
    this.aA = null;
    this.b = null;
    this.c = null;
    this.aB = -1;
    this.aC = 0;
    this.aD = 1;
    this.aE = this.aB;
    this.aF = null;
    this.aG = new WeakReference(null);
    this.d = new com.tencent.liteav.beauty.b.a();
    this.e = new com.tencent.liteav.beauty.b.a();
    this.f = new com.tencent.liteav.beauty.b.a();
    this.aH = new b.9(this);
    this.m = paramContext;
    this.ag = new Handler(this.m.getMainLooper());
    this.ad = paramBoolean;
    AppMethodBeat.o(66847);
  }

  private void a(int paramInt1, int paramInt2, float paramFloat1, Bitmap paramBitmap1, float paramFloat2, Bitmap paramBitmap2, float paramFloat3)
  {
    AppMethodBeat.i(66879);
    if (this.T == null)
    {
      TXCLog.i("TXCFilterDrawer", "createComLooKupFilter");
      this.T = new l(paramFloat1, paramBitmap1, paramFloat2, paramBitmap2, paramFloat3);
      if (true == this.T.a())
      {
        this.T.a(true);
        this.T.a(paramInt1, paramInt2);
        AppMethodBeat.o(66879);
      }
    }
    while (true)
    {
      return;
      TXCLog.e("TXCFilterDrawer", "mLookupFilterGroup init failed!");
      AppMethodBeat.o(66879);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66877);
    TXCLog.i("TXCFilterDrawer", "create Beauty Filter!");
    if (paramInt3 == 0)
    {
      if (this.L == null)
        this.L = new com.tencent.liteav.beauty.b.a.a();
      this.K = this.L;
      if (this.K != null)
        break label134;
      TXCLog.e("TXCFilterDrawer", "mBeautyFilter set error!");
      AppMethodBeat.o(66877);
    }
    while (true)
    {
      return;
      if (1 == paramInt3)
      {
        if (this.M == null)
          this.M = new com.tencent.liteav.beauty.b.b.a();
        this.K = this.M;
        break;
      }
      if (2 != paramInt3)
        break;
      if (this.N == null)
        this.N = new com.tencent.liteav.beauty.b.c();
      this.K = this.N;
      break;
      label134: this.K.a(true);
      if (true == this.K.b(paramInt1, paramInt2))
      {
        if (this.ak > 0)
          this.K.c(this.ak);
        if (this.al > 0)
          this.K.d(this.al);
        if (this.an > 0)
          this.K.e(this.an);
        if (this.am > 0)
        {
          this.K.f(this.am);
          AppMethodBeat.o(66877);
        }
      }
      else
      {
        TXCLog.e("TXCFilterDrawer", "mBeautyFilter init failed!");
        AppMethodBeat.o(66877);
      }
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(66854);
    Object localObject1 = this.af;
    paramInt3 = (paramInt6 - paramInt3 + 360) % 360;
    try
    {
      TXCLog.i("TXCFilterDrawer", "real outputAngle ".concat(String.valueOf(paramInt3)));
      if (this.Y == null)
      {
        if ((paramInt1 == paramInt4) && (paramInt2 == paramInt5) && (paramInt3 == 0))
        {
          TXCLog.i("TXCFilterDrawer", "Don't need change output Image, don't create out filter!");
          return;
        }
        g localg = new com/tencent/liteav/basic/e/g;
        localg.<init>();
        this.Y = localg;
        if (true != this.Y.a())
          break label159;
        this.Y.a(true);
      }
      while (true)
      {
        this.Y.a(paramInt4, paramInt5);
        this.Y.a((720 - paramInt3) % 360, null);
        AppMethodBeat.o(66854);
        break;
        label159: TXCLog.e("TXCFilterDrawer", "mOutputZoomFilter init failed!");
      }
    }
    finally
    {
      AppMethodBeat.o(66854);
    }
  }

  private void a(com.tencent.liteav.basic.e.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(66853);
    if (this.Z == null)
    {
      TXCLog.i("TXCFilterDrawer", "Create CropFilter");
      if (4 == paramInt6)
      {
        this.Z = new g("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", true);
        if (true != this.Z.a())
          break label188;
        this.Z.a(true);
      }
    }
    else
    {
      label64: this.Z.a(paramInt3, paramInt4);
      parama = this.Z.a(this.p, this.q, null, parama, paramInt6);
      paramInt6 = (720 - paramInt5) % 360;
      if ((paramInt6 != 90) && (paramInt6 != 270))
        break label199;
    }
    label188: label199: for (paramInt5 = paramInt4; ; paramInt5 = paramInt3)
    {
      if ((paramInt6 == 90) || (paramInt6 == 270))
        paramInt4 = paramInt3;
      this.Z.a(paramInt1, paramInt2, paramInt6, parama, paramInt5 / paramInt4, paramBoolean, false);
      AppMethodBeat.o(66853);
      return;
      this.Z = new g();
      break;
      TXCLog.e("TXCFilterDrawer", "mInputCropFilter init failed!");
      break label64;
    }
  }

  private void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(66881);
    synchronized (this.ac)
    {
      this.ac.add(paramRunnable);
      AppMethodBeat.o(66881);
      return;
    }
  }

  private void a(Queue<Runnable> paramQueue)
  {
    AppMethodBeat.i(66882);
    while (true)
    {
      Runnable localRunnable = null;
      try
      {
        if (!paramQueue.isEmpty())
          localRunnable = (Runnable)paramQueue.poll();
        if (localRunnable != null)
          localRunnable.run();
      }
      finally
      {
        AppMethodBeat.o(66882);
      }
    }
    AppMethodBeat.o(66882);
  }

  private void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(66861);
    if (!paramBoolean)
      if (this.aF != null)
      {
        this.aF.a(paramArrayOfByte, this.y, this.z, this.F, TXCTimeUtil.getTimeTick());
        AppMethodBeat.o(66861);
      }
    while (true)
    {
      return;
      TXCLog.i("TXCFilterDrawer", "First Frame, don't process!");
      AppMethodBeat.o(66861);
      continue;
      int i1 = this.z * 3 / 8;
      if (2 == this.F)
        i1 = this.z;
      if (this.aF != null)
      {
        NativeLoad.getInstance();
        if (true == NativeLoad.nativeGlReadPixsFromQueue(this.y, i1, this.ax))
        {
          this.aF.a(this.ax, this.y, this.z, this.F, TXCTimeUtil.getTimeTick());
          AppMethodBeat.o(66861);
        }
        else
        {
          TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
          this.aF.a(paramArrayOfByte, this.y, this.z, this.F, TXCTimeUtil.getTimeTick());
          AppMethodBeat.o(66861);
        }
      }
      else
      {
        NativeLoad.getInstance();
        if (!NativeLoad.nativeGlReadPixsFromQueue(this.y, i1, this.aA))
          TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
        AppMethodBeat.o(66861);
      }
    }
  }

  private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66868);
    GLES20.glGenFramebuffers(1, paramArrayOfInt1, 0);
    paramArrayOfInt2[0] = com.tencent.liteav.basic.e.i.a(paramInt1, paramInt2, 6408, 6408, paramArrayOfInt2);
    GLES20.glBindFramebuffer(36160, paramArrayOfInt1[0]);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, paramArrayOfInt2[0], 0);
    GLES20.glBindFramebuffer(36160, 0);
    AppMethodBeat.o(66868);
  }

  private int b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66859);
    if (true == this.ad)
      if (this.aF != null)
      {
        NativeLoad.getInstance();
        NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, this.ax);
        this.aF.a(this.ax, this.y, this.z, this.F, TXCTimeUtil.getTimeTick());
      }
    while (true)
    {
      AppMethodBeat.o(66859);
      paramInt1 = 0;
      Object localObject;
      while (true)
      {
        return paramInt1;
        if (this.aA == null)
          break;
        NativeLoad.getInstance();
        NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, this.aA);
        break;
        if (3 != com.tencent.liteav.basic.e.i.a())
          break label315;
        if (0L == this.at)
          this.at = TXCTimeUtil.getTimeTick();
        int i1 = this.au + 1;
        this.au = i1;
        if (i1 >= 100)
        {
          TXCLog.i("TXCFilterDrawer", "Real fps ".concat(String.valueOf(100.0F / ((float)(TXCTimeUtil.getTimeTick() - this.at) / 1000.0F))));
          this.au = 0;
          this.at = TXCTimeUtil.getTimeTick();
        }
        GLES30.glPixelStorei(3333, 1);
        if (Build.VERSION.SDK_INT >= 18)
          GLES30.glReadBuffer(1029);
        GLES30.glBindBuffer(35051, this.ay[0]);
        NativeLoad.getInstance();
        NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, null);
        localObject = null;
        if (Build.VERSION.SDK_INT < 18)
          break label279;
        ByteBuffer localByteBuffer = (ByteBuffer)GLES30.glMapBufferRange(35051, 0, paramInt1 * paramInt2 * 4, 1);
        localObject = localByteBuffer;
        if (localByteBuffer != null)
          break label279;
        TXCLog.e("TXCFilterDrawer", "glMapBufferRange is null");
        paramInt1 = -1;
        AppMethodBeat.o(66859);
      }
      label279: NativeLoad.getInstance();
      NativeLoad.nativeGlMapBufferToQueue(paramInt1, paramInt2, localObject);
      if (Build.VERSION.SDK_INT >= 18)
        GLES30.glUnmapBuffer(35051);
      GLES30.glBindBuffer(35051, 0);
      continue;
      label315: NativeLoad.getInstance();
      NativeLoad.nativeGlReadPixsToQueue(paramInt1, paramInt2);
    }
  }

  private void b()
  {
    AppMethodBeat.i(66865);
    TXCLog.i("TXCFilterDrawer", "come into releaseInternal");
    this.az = false;
    if (this.I != null)
    {
      this.I.d();
      this.I = null;
    }
    if (this.J != null)
    {
      this.J.d();
      this.J = null;
    }
    c();
    if (this.T != null)
    {
      this.T.d();
      this.T = null;
    }
    if (this.U != null)
    {
      this.U.a();
      this.U = null;
    }
    if (this.aa != null)
    {
      this.aa.d();
      this.aa = null;
    }
    if (this.Z != null)
    {
      this.Z.d();
      this.Z = null;
    }
    if (this.Y != null)
    {
      this.Y.d();
      this.Y = null;
    }
    if (this.V != null)
    {
      this.V.d();
      this.V = null;
    }
    if (this.W != null)
    {
      this.W.a();
      this.W = null;
    }
    if (this.X != null)
    {
      this.X.d();
      this.X = null;
    }
    if (this.ab != null)
    {
      this.ab.d();
      this.ab = null;
    }
    if (this.b != null)
    {
      GLES20.glDeleteFramebuffers(1, this.b, 0);
      this.b = null;
    }
    if (this.c != null)
    {
      GLES20.glDeleteTextures(1, this.c, 0);
      this.c = null;
    }
    this.o = null;
    TXCLog.i("TXCFilterDrawer", "come out releaseInternal");
    AppMethodBeat.o(66865);
  }

  private void b(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66863);
    if (this.I == null)
    {
      TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter is null!");
      AppMethodBeat.o(66863);
    }
    while (true)
    {
      return;
      this.I.a(paramArrayOfByte);
      AppMethodBeat.o(66863);
    }
  }

  private void c()
  {
    AppMethodBeat.i(66878);
    if (this.L != null)
    {
      this.L.d();
      this.L = null;
    }
    if (this.M != null)
    {
      this.M.d();
      this.M = null;
    }
    if (this.N != null)
    {
      this.N.d();
      this.N = null;
    }
    this.K = null;
    AppMethodBeat.o(66878);
  }

  private void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66880);
    if (this.ab == null)
    {
      TXCLog.i("TXCFilterDrawer", "createRecoverScaleFilter");
      this.ab = new g();
      if (true != this.ab.a())
        break label74;
      this.ab.a(true);
    }
    while (true)
    {
      if (this.ab != null)
        this.ab.a(paramInt1, paramInt2);
      AppMethodBeat.o(66880);
      return;
      label74: TXCLog.e("TXCFilterDrawer", "mRecoverScaleFilter init failed!");
    }
  }

  private boolean c(c.b paramb)
  {
    AppMethodBeat.i(66866);
    TXCLog.i("TXCFilterDrawer", "come into initInternal");
    b();
    this.ad = paramb.j;
    this.p = paramb.d;
    this.q = paramb.e;
    this.G = paramb.m;
    this.r = paramb.g;
    this.s = paramb.f;
    this.A = paramb.h;
    this.C = paramb.i;
    this.y = paramb.b;
    this.z = paramb.c;
    this.B = paramb.a;
    this.t = paramb.g;
    this.u = paramb.f;
    if ((this.A == 90) || (this.A == 270))
    {
      this.t = paramb.f;
      this.u = paramb.g;
    }
    this.F = paramb.l;
    this.E = paramb.k;
    this.ax = new byte[this.y * this.z * 4];
    TXCLog.i("TXCFilterDrawer", "processWidth mPituScaleRatio is " + this.x);
    int i1;
    if (this.x != 1.0F)
    {
      if (this.t >= this.u)
        break label607;
      i1 = this.t;
      if (i1 > 368)
        this.x = (432.0F / i1);
      if (this.x > 1.0F)
        this.x = 1.0F;
    }
    this.v = ((int)(this.t * this.x));
    this.w = ((int)(this.u * this.x));
    a(this.v, this.w, this.aj);
    if ((this.o != null) && (this.o.a != null) && (this.V == null))
    {
      TXCLog.i("TXCFilterDrawer", "reset water mark!");
      a(this.o.a, this.o.b, this.o.c, this.o.d);
    }
    if (((this.O != null) || (this.P != null)) && (this.T == null))
      a(this.v, this.w, this.Q, this.O, this.R, this.P, this.S);
    a(this.G, this.r, this.s, this.v, this.w, this.C, this.A, this.E);
    a(this.t, this.u, this.A, this.y, this.z, this.B);
    if (this.b == null)
    {
      this.b = new int[1];
      label512: if (this.c != null)
        break label627;
      this.c = new int[1];
      label526: a(this.b, this.c, this.y, this.z);
      if (3 == com.tencent.liteav.basic.e.i.a())
      {
        if (this.ay != null)
          break label639;
        this.ay = new int[1];
      }
    }
    while (true)
    {
      TXCLog.i("TXCFilterDrawer", "opengl es 3.0, use PBO");
      com.tencent.liteav.basic.e.i.a(this.r, this.s, this.ay);
      TXCLog.i("TXCFilterDrawer", "come out initInternal");
      AppMethodBeat.o(66866);
      return true;
      label607: i1 = this.u;
      break;
      GLES20.glDeleteFramebuffers(1, this.b, 0);
      break label512;
      label627: GLES20.glDeleteTextures(1, this.c, 0);
      break label526;
      label639: TXCLog.i("TXCFilterDrawer", "m_pbo0 is not null, delete Buffers, and recreate");
      GLES30.glDeleteBuffers(1, this.ay, 0);
    }
  }

  private boolean d(c.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(66869);
    if (((1 == paramb.k) || (3 == paramb.k) || (2 == paramb.k)) && (this.I == null))
    {
      this.I = new k(paramb.k);
      this.I.a(true);
      if (!this.I.a())
      {
        TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter init failed!!, break init");
        AppMethodBeat.o(66869);
      }
    }
    while (true)
    {
      return bool;
      this.I.a(paramb.d, paramb.e);
      if (((1 == paramb.l) || (3 == paramb.l) || (2 == paramb.l)) && (this.J == null))
      {
        this.J = new n(paramb.l);
        if (!this.J.a())
        {
          TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter init failed!!, break init");
          AppMethodBeat.o(66869);
        }
        else
        {
          this.J.a(paramb.b, paramb.c);
        }
      }
      else
      {
        AppMethodBeat.o(66869);
        bool = true;
      }
    }
  }

  private int m(int paramInt)
  {
    AppMethodBeat.i(66858);
    if (this.F == 0)
    {
      if (this.aF != null)
        this.aF.a(paramInt, this.y, this.z, TXCTimeUtil.getTimeTick());
      AppMethodBeat.o(66858);
    }
    while (true)
    {
      return paramInt;
      if ((1 == this.F) || (3 == this.F) || (2 == this.F))
      {
        GLES20.glViewport(0, 0, this.y, this.z);
        if (this.J == null)
        {
          TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter is null!");
          AppMethodBeat.o(66858);
        }
        else
        {
          GLES20.glBindFramebuffer(36160, this.b[0]);
          this.J.a(paramInt);
          if (2 == this.F)
            b(this.y, this.z);
          while (true)
          {
            GLES20.glBindFramebuffer(36160, 0);
            AppMethodBeat.o(66858);
            break;
            b(this.y, this.z * 3 / 8);
          }
        }
      }
      else
      {
        TXCLog.e("TXCFilterDrawer", "Don't support format!");
        paramInt = -1;
        AppMethodBeat.o(66858);
      }
    }
  }

  private int n(int paramInt)
  {
    AppMethodBeat.i(66862);
    GLES20.glViewport(0, 0, this.p, this.q);
    paramInt = a(this.I.q(), paramInt);
    AppMethodBeat.o(66862);
    return paramInt;
  }

  public int a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66849);
    a(this.ac);
    int i1;
    if (this.x != 1.0F)
    {
      i1 = 1;
      GLES20.glViewport(0, 0, this.v, this.w);
      int i2 = paramInt1;
      if (this.Z != null)
      {
        if (4 == paramInt2)
          this.Z.a(this.D);
        i2 = this.Z.b(paramInt1);
      }
      paramInt2 = i2;
      if (this.K != null)
        if ((this.ak <= 0) && (this.al <= 0))
        {
          paramInt2 = i2;
          if (this.an <= 0);
        }
        else
        {
          paramInt2 = this.K.b(i2);
        }
      paramInt1 = paramInt2;
      if (this.T != null)
        paramInt1 = this.T.b(paramInt2);
      GLES20.glViewport(0, 0, this.t, this.u);
      paramInt2 = paramInt1;
      if (this.W != null)
      {
        paramInt2 = this.W.a(paramInt1);
        i1 = 0;
      }
      if (this.X == null)
        break label354;
      paramInt1 = this.X.b(paramInt2);
      i1 = 0;
    }
    while (true)
    {
      if (i1 != 0)
      {
        c(this.t, this.u);
        if (this.ab != null)
          GLES20.glViewport(0, 0, this.t, this.u);
      }
      for (paramInt2 = this.ab.b(paramInt1); ; paramInt2 = paramInt1)
      {
        paramInt1 = paramInt2;
        if (this.aF != null)
        {
          i1 = this.aF.a(paramInt2, this.t, this.u);
          paramInt1 = paramInt2;
          if (i1 > 0)
            paramInt1 = i1;
        }
        GLES20.glViewport(0, 0, this.t, this.u);
        paramInt2 = paramInt1;
        if (this.V != null)
          paramInt2 = this.V.b(paramInt1);
        paramInt1 = paramInt2;
        if (this.Y != null)
        {
          GLES20.glViewport(0, 0, this.y, this.z);
          paramInt1 = this.Y.b(paramInt2);
        }
        m(paramInt1);
        AppMethodBeat.o(66849);
        return paramInt1;
        i1 = 0;
        break;
      }
      label354: paramInt1 = paramInt2;
    }
  }

  public int a(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(66850);
    a(paramArrayOfByte);
    if (!this.ad)
    {
      paramArrayOfByte = (byte[])paramArrayOfByte.clone();
      this.ah.obtainMessage(2, paramArrayOfByte).sendToTarget();
      if (!this.az)
      {
        TXCLog.i("TXCFilterDrawer", "First Frame, clear queue");
        NativeLoad.getInstance();
        NativeLoad.nativeClearQueue();
      }
      this.ah.obtainMessage(3, paramInt, 0).sendToTarget();
      a(paramArrayOfByte, this.az);
      this.az = true;
    }
    for (paramInt = -1; ; paramInt = n(paramInt))
    {
      AppMethodBeat.o(66850);
      return paramInt;
      b(paramArrayOfByte);
    }
  }

  public void a()
  {
    AppMethodBeat.i(66864);
    if (!this.ad)
    {
      if (this.ah == null)
        break label59;
      this.ah.obtainMessage(1).sendToTarget();
    }
    while (true)
    {
      try
      {
        this.d.b();
        AppMethodBeat.o(66864);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        AppMethodBeat.o(66864);
        continue;
      }
      b();
      label59: AppMethodBeat.o(66864);
    }
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(66851);
    this.ai = paramFloat;
    a(new b.1(this, paramFloat));
    AppMethodBeat.o(66851);
  }

  public void a(float paramFloat1, Bitmap paramBitmap1, float paramFloat2, Bitmap paramBitmap2, float paramFloat3)
  {
    AppMethodBeat.i(66876);
    if ((this.O != paramBitmap1) || (this.P != paramBitmap2))
    {
      this.O = paramBitmap1;
      this.P = paramBitmap2;
      this.Q = paramFloat1;
      this.R = paramFloat2;
      this.S = paramFloat3;
      a(new b.4(this, paramFloat1, paramBitmap1, paramFloat2, paramBitmap2, paramFloat3));
      AppMethodBeat.o(66876);
    }
    while (true)
    {
      return;
      if ((this.T != null) && ((this.Q != paramFloat1) || (this.R != paramFloat2) || (this.S != paramFloat3)))
      {
        this.Q = paramFloat1;
        this.R = paramFloat2;
        this.S = paramFloat3;
        a(new b.5(this, paramFloat1, paramFloat2, paramFloat3));
      }
      AppMethodBeat.o(66876);
    }
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66860);
    a(new b.8(this, paramInt));
    AppMethodBeat.o(66860);
  }

  public void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(66875);
    a(1.0F, paramBitmap, this.ai, null, 0.0F);
    AppMethodBeat.o(66875);
  }

  public void a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(66855);
    if (this.o == null)
      this.o = new c.d();
    if ((this.o.a != null) && (paramBitmap != null) && (true == this.o.a.equals(paramBitmap)) && (paramFloat1 == this.o.b) && (paramFloat2 == this.o.c) && (paramFloat3 == this.o.d))
      AppMethodBeat.o(66855);
    while (true)
    {
      return;
      this.o.a = paramBitmap;
      this.o.b = paramFloat1;
      this.o.c = paramFloat2;
      this.o.d = paramFloat3;
      a(new b.7(this, paramBitmap, paramFloat1, paramFloat2, paramFloat3));
      AppMethodBeat.o(66855);
    }
  }

  void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(66857);
    TXCLog.i("TXCFilterDrawer", "set notify");
    this.aG = new WeakReference(parama);
    AppMethodBeat.o(66857);
  }

  void a(d paramd)
  {
    AppMethodBeat.i(66856);
    TXCLog.i("TXCFilterDrawer", "set listener");
    this.aF = paramd;
    AppMethodBeat.o(66856);
  }

  public void a(String paramString)
  {
  }

  public void a(String paramString, boolean paramBoolean)
  {
  }

  public void a(boolean paramBoolean)
  {
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.aA = paramArrayOfByte;
  }

  public void a(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(66852);
    a(new b.6(this, paramArrayOfFloat));
    AppMethodBeat.o(66852);
  }

  public boolean a(c.b paramb)
  {
    try
    {
      AppMethodBeat.i(66848);
      boolean bool = true;
      if (!paramb.j)
      {
        if (this.ah == null)
        {
          start();
          b.a locala = new com/tencent/liteav/beauty/b$a;
          locala.<init>(this, getLooper(), this.m);
          this.ah = locala;
        }
        this.ah.obtainMessage(0, paramb).sendToTarget();
        this.ah.b();
      }
      while (true)
      {
        AppMethodBeat.o(66848);
        return bool;
        bool = c(paramb);
      }
    }
    finally
    {
    }
    throw paramb;
  }

  public void b(final int paramInt)
  {
    AppMethodBeat.i(66870);
    this.ak = paramInt;
    a(new Runnable()
    {
      public void run()
      {
        AppMethodBeat.i(67088);
        if (paramInt > 0)
          a.a().b();
        if ((b.e(b.this) != null) && (paramInt >= 0))
          b.e(b.this).c(paramInt);
        AppMethodBeat.o(67088);
      }
    });
    AppMethodBeat.o(66870);
  }

  public boolean b(c.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(66867);
    if (!this.ad)
    {
      if (this.ah == null)
      {
        TXCLog.e("TXCFilterDrawer", "mThreadHandler is null!");
        AppMethodBeat.o(66867);
        return bool;
      }
      this.ah.obtainMessage(5, 0, 0, paramb).sendToTarget();
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(66867);
      break;
      d(paramb);
    }
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(66871);
    if ((this.aj == paramInt) || (paramInt > 2) || (paramInt < 0))
      AppMethodBeat.o(66871);
    while (true)
    {
      return;
      this.aj = paramInt;
      a(new b.11(this, paramInt));
      AppMethodBeat.o(66871);
    }
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66872);
    this.al = paramInt;
    a(new b.12(this, paramInt));
    AppMethodBeat.o(66872);
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(66873);
    this.am = paramInt;
    a(new b.2(this, paramInt));
    AppMethodBeat.o(66873);
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(66874);
    this.an = paramInt;
    a(new b.3(this, paramInt));
    AppMethodBeat.o(66874);
  }

  public void g(int paramInt)
  {
  }

  public void h(int paramInt)
  {
  }

  public void i(int paramInt)
  {
  }

  public void j(int paramInt)
  {
  }

  public void k(int paramInt)
  {
  }

  public void l(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b
 * JD-Core Version:    0.6.2
 */