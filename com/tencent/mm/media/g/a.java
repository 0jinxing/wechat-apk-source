package com.tencent.mm.media.g;

import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.b.a;
import com.tencent.mm.media.i.b.b;
import com.tencent.mm.media.i.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/CodecInputSurface;", "", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "(Lcom/tencent/mm/media/render/AbsSurfaceRenderer;)V", "TAG", "", "blendBitmap", "Landroid/graphics/Bitmap;", "blendBitmapProvider", "Lkotlin/Function1;", "", "drawCallback", "", "", "getDrawCallback", "()Lkotlin/jvm/functions/Function1;", "setDrawCallback", "(Lkotlin/jvm/functions/Function1;)V", "drawInOnFrameAvailable", "eglEnvironment", "Lcom/tencent/mm/media/util/GLEnvironmentUtil$EGLEnvironment;", "getEglEnvironment", "()Lcom/tencent/mm/media/util/GLEnvironmentUtil$EGLEnvironment;", "setEglEnvironment", "(Lcom/tencent/mm/media/util/GLEnvironmentUtil$EGLEnvironment;)V", "firstFrame", "isFirstFrameAvailable", "isReleased", "lastFrameTimestamp", "newFrameAvailable", "newFrameLock", "Ljava/lang/Object;", "onDrawFrameOnFrameAvailableFailed", "Lkotlin/Function0;", "renderHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "renderThread", "Landroid/os/HandlerThread;", "kotlin.jvm.PlatformType", "getRenderer", "()Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "setRenderer", "setUpEnvWithShareContext", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "setSurface", "(Landroid/view/Surface;)V", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "getOutputSurface", "initForRemuxer", "callback", "Lkotlin/ParameterName;", "name", "success", "initSurfaceTexture", "initWithSize", "eglContext", "Landroid/opengl/EGLContext;", "width", "", "height", "initWithSurface", "waitNewFrame", "queue", "release", "requestDraw", "data", "", "pts", "inputCallback", "textureId", "bitmap", "waitFistFrameAvailable", "requestDrawInGLThread", "runInGlesThread", "setDrawBlendBitmap", "setDrawBlendBitmapProvider", "setFirstFrameAvailable", "setOnDrawFrameOnFrameAvailableFailed", "setOnFrameAvailable", "setPresentationTime", "nsecs", "setRotate", "degree", "updateDrawSize", "updateTextureSize", "Companion", "plugin-mediaeditor_release"})
public final class a
{
  public static final a.a eXn;
  public final String TAG;
  private volatile boolean aAP;
  public Surface aOO;
  private SurfaceTexture bsb;
  private final HandlerThread eXa;
  private ak eXb;
  b.b eXc;
  public a.f.a.b<? super Boolean, y> eXd;
  private final Object eXe;
  private boolean eXf;
  private volatile boolean eXg;
  public a.f.a.b<? super Long, Bitmap> eXh;
  Bitmap eXi;
  boolean eXj;
  a.f.a.a<y> eXk;
  private boolean eXl;
  com.tencent.mm.media.h.a eXm;
  private long lastFrameTimestamp;

  static
  {
    AppMethodBeat.i(13028);
    eXn = new a.a((byte)0);
    AppMethodBeat.o(13028);
  }

  public a(com.tencent.mm.media.h.a parama)
  {
    AppMethodBeat.i(13027);
    this.eXm = parama;
    this.TAG = "MicroMsg.CodecInputSurface";
    this.eXa = d.anM("CodecInputSurface_renderThread");
    this.eXe = new Object();
    this.eXa.start();
    parama = this.eXa;
    j.o(parama, "renderThread");
    this.eXb = new ak(parama.getLooper());
    this.eXl = true;
    AppMethodBeat.o(13027);
  }

  private final void UZ()
  {
    this.bsb = this.eXm.bsb;
  }

  public final Surface UY()
  {
    AppMethodBeat.i(13020);
    if (this.bsb == null)
      UZ();
    Surface localSurface = new Surface(this.bsb);
    AppMethodBeat.o(13020);
    return localSurface;
  }

  public final void a(long paramLong, Bitmap paramBitmap)
  {
    AppMethodBeat.i(13017);
    b((a.f.a.a)new a.f(this, paramLong, paramBitmap));
    AppMethodBeat.o(13017);
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, a.f.a.b<? super byte[], y> paramb)
  {
    AppMethodBeat.i(13018);
    j.p(paramArrayOfByte, "data");
    j.p(paramb, "inputCallback");
    ab.d(this.TAG, "ByteArray length : " + paramArrayOfByte.length);
    b((a.f.a.a)new a.g(this, paramArrayOfByte, paramLong, paramb));
    AppMethodBeat.o(13018);
  }

  public final void b(a.f.a.a<y> parama)
  {
    AppMethodBeat.i(13024);
    HandlerThread localHandlerThread = this.eXa;
    j.o(localHandlerThread, "renderThread");
    if ((localHandlerThread.isAlive()) && (!this.aAP))
      this.eXb.post((Runnable)new b(parama));
    AppMethodBeat.o(13024);
  }

  public final void cg(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13021);
    this.eXm.ci(paramInt1, paramInt2);
    AppMethodBeat.o(13021);
  }

  public final void ch(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13022);
    this.eXm.ch(paramInt1, paramInt2);
    AppMethodBeat.o(13022);
  }

  public final void ka(int paramInt)
  {
    AppMethodBeat.i(13023);
    this.eXm.ka(paramInt);
    AppMethodBeat.o(13023);
  }

  public final void release()
  {
    AppMethodBeat.i(13025);
    ab.i(this.TAG, hashCode() + " release resources");
    b((a.f.a.a)new a.e(this));
    AppMethodBeat.o(13025);
  }

  public final void s(final int paramInt, final long paramLong)
  {
    AppMethodBeat.i(13019);
    b((a.f.a.a)new h(this, paramInt, paramLong));
    AppMethodBeat.o(13019);
  }

  protected final void setPresentationTime(long paramLong)
  {
    AppMethodBeat.i(13026);
    Object localObject = this.eXc;
    if (localObject != null)
      EGLExt.eglPresentationTimeANDROID(((b.b)localObject).fae, ((b.b)localObject).faf, paramLong);
    localObject = com.tencent.mm.media.i.b.fad;
    b.a.lZ("eglPresentationTimeANDROID");
    AppMethodBeat.o(13026);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class h extends k
    implements a.f.a.a<y>
  {
    h(a parama, int paramInt, long paramLong)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "onFrameAvailable"})
  static final class j
    implements SurfaceTexture.OnFrameAvailableListener
  {
    j(a parama)
    {
    }

    public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
    {
      AppMethodBeat.i(13016);
      Object localObject1 = a.b(this.eXo);
      Object localObject2 = new StringBuilder("onFrameAvailable, thread:").append(Thread.currentThread()).append(", surface timestamp:");
      paramSurfaceTexture = a.f(this.eXo);
      if (paramSurfaceTexture != null)
      {
        paramSurfaceTexture = Long.valueOf(paramSurfaceTexture.getTimestamp());
        ab.i((String)localObject1, paramSurfaceTexture + ", drawInOnFrameAvailable:" + a.g(this.eXo));
        paramSurfaceTexture = a.f(this.eXo);
        if (paramSurfaceTexture == null)
          break label291;
        if ((!a.d(this.eXo)) || (paramSurfaceTexture.getTimestamp() > 0L))
          break label167;
        a.h(this.eXo);
        paramSurfaceTexture = c.faj;
        c.We();
        paramSurfaceTexture = a.i(this.eXo);
        if (paramSurfaceTexture == null)
          break label158;
        paramSurfaceTexture.invoke();
        AppMethodBeat.o(13016);
      }
      while (true)
      {
        return;
        paramSurfaceTexture = null;
        break;
        label158: AppMethodBeat.o(13016);
        continue;
        label167: if (!a.d(this.eXo))
          a.e(this.eXo);
        long l;
        if (a.g(this.eXo))
        {
          if (a.j(this.eXo) == null)
            break label239;
          localObject2 = this.eXo;
          l = paramSurfaceTexture.getTimestamp();
          paramSurfaceTexture = a.j(this.eXo);
        }
        while (true)
        {
          a.a((a)localObject2, l, paramSurfaceTexture);
          AppMethodBeat.o(13016);
          break;
          label239: localObject2 = this.eXo;
          l = paramSurfaceTexture.getTimestamp();
          localObject1 = a.k(this.eXo);
          if (localObject1 != null)
            paramSurfaceTexture = (Bitmap)((a.f.a.b)localObject1).am(Long.valueOf(paramSurfaceTexture.getTimestamp() / 1000L));
          else
            paramSurfaceTexture = null;
        }
        label291: AppMethodBeat.o(13016);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.a
 * JD-Core Version:    0.6.2
 */