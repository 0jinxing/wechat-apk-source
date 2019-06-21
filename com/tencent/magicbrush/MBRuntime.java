package com.tencent.magicbrush;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.support.annotation.Keep;
import com.tencent.magicbrush.a.c.c;
import com.tencent.magicbrush.handler.JsTouchEventHandler.a;
import com.tencent.magicbrush.handler.MBCanvasHandler;
import com.tencent.magicbrush.handler.MBJsThreadHandler;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import com.tencent.magicbrush.handler.glfont.h;
import com.tencent.magicbrush.handler.image.IMBImageHandler;
import com.tencent.magicbrush.handler.image.IMBImageHandler.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentLinkedQueue;

@Keep
public class MBRuntime
{
  private static final String TAG = "MicroMsg.MagicBrush.MBRuntime";
  private int __filed_touchJava;
  private com.tencent.magicbrush.c.a mAnimationFrameHandler;
  private final MBCanvasHandler mCanvasHandler;
  private MBRuntime.IMBEventListener mClientEventListener;
  private IMBFontHandler mFontHandler;
  private IMBImageHandler mImageHandler;
  private volatile MBJsThreadHandler mJsThreadHandler;
  private ConcurrentLinkedQueue<MBRuntime.IMBEventListener> mListenerQueue;
  public volatile long mNativeInst;
  private MBRuntime.MBParams mParams;
  private volatile int mScreenCanvasId;
  private volatile int mSystemDisplayHeight;
  private volatile int mSystemDisplayWidth;
  private boolean mainThreadWaitingFlag;
  private a mbInspector;
  private com.tencent.magicbrush.c.b mbView;

  static
  {
    AppMethodBeat.i(115838);
    com.tencent.magicbrush.a.b.yB();
    AppMethodBeat.o(115838);
  }

  public MBRuntime(MBRuntime.MBParams paramMBParams)
  {
    AppMethodBeat.i(115804);
    this.mainThreadWaitingFlag = false;
    this.mImageHandler = null;
    this.mFontHandler = null;
    this.mListenerQueue = null;
    this.mClientEventListener = null;
    this.mSystemDisplayWidth = 0;
    this.mSystemDisplayHeight = 0;
    this.mScreenCanvasId = -1;
    this.mbInspector = new a(this);
    this.__filed_touchJava = 0;
    this.mParams = paramMBParams;
    if ((this.mParams.device_pixel_ratio_ <= 0.0D) || (this.mParams.screen_width_ <= 0) || (this.mParams.screen_height_ <= 0))
    {
      paramMBParams = new IllegalArgumentException("MBRuntime can only accept positive screen.");
      AppMethodBeat.o(115804);
      throw paramMBParams;
    }
    if ((this.mParams.gc_factor < 0.0F) || (this.mParams.gc_factor > 1.0F))
    {
      paramMBParams = new IllegalArgumentException("MBRuntime gc_factor can only accept [0, 1].");
      AppMethodBeat.o(115804);
      throw paramMBParams;
    }
    this.mNativeInst = nativeCreate(this.mParams);
    this.mClientEventListener = new MBRuntime.b(this, (byte)0);
    nativeSetEventListener(this.mNativeInst, this.mClientEventListener);
    this.mCanvasHandler = new MBCanvasHandler(this, this.mNativeInst);
    AppMethodBeat.o(115804);
  }

  @Keep
  private Bitmap captureScreen(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115828);
    paramBitmap = getCanvasHandler().a(paramBitmap, true);
    AppMethodBeat.o(115828);
    return paramBitmap;
  }

  private native void nativeBindTo(long paramLong1, long paramLong2, long paramLong3);

  private native long nativeCreate(MBRuntime.MBParams paramMBParams);

  private native void nativeDebug(long paramLong, int paramInt);

  private native void nativeDestroy(long paramLong);

  private native int[] nativeGetCanvasSize(long paramLong, int paramInt);

  private native int nativeGetGLThreadTid(long paramLong);

  private native int nativeGetJsThreadTid(long paramLong);

  private native void nativeInit(long paramLong);

  private native void nativeNotifyAnimationFrame(long paramLong, double paramDouble);

  private native void nativeNotifyImageDecoded(long paramLong, String paramString, Object paramObject);

  private native void nativeNotifyTouchEvent(long paramLong1, long paramLong2);

  private native void nativeNotifyWindowAvailable(long paramLong, SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2);

  private native void nativeNotifyWindowChanged(long paramLong, SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2);

  private native void nativeNotifyWindowDestroyed(long paramLong);

  private native void nativePause(long paramLong);

  private native void nativeResume(long paramLong);

  private native void nativeSetEventListener(long paramLong, MBRuntime.IMBEventListener paramIMBEventListener);

  private native void nativeSetFontHandler(long paramLong, IMBFontHandler paramIMBFontHandler);

  private native void nativeSetImageHandler(long paramLong, IMBImageHandler paramIMBImageHandler);

  private native void nativeSetJsThreadHandler(long paramLong1, long paramLong2);

  private native void nativeSetUserPreferredFps(long paramLong, double paramDouble);

  private void resetJavaClientRes()
  {
    AppMethodBeat.i(115817);
    if (this.mListenerQueue != null)
    {
      this.mListenerQueue.clear();
      this.mListenerQueue = null;
    }
    this.mClientEventListener = null;
    this.mImageHandler = null;
    this.mFontHandler = null;
    AppMethodBeat.o(115817);
  }

  @Keep
  private void touchJava()
  {
    this.__filed_touchJava += 1;
  }

  public void bindTo(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(115806);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.bindTo", new Object[0]);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115806);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115806);
      }
      else
      {
        localMBJsThreadHandler.i(new MBRuntime.1(this, paramLong1, paramLong2));
        AppMethodBeat.o(115806);
      }
    }
  }

  public void debug(int paramInt)
  {
    AppMethodBeat.i(115809);
    nativeDebug(this.mNativeInst, paramInt);
    AppMethodBeat.o(115809);
  }

  public void destroy()
  {
    AppMethodBeat.i(115814);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy", new Object[0]);
    if (this.mNativeInst == 0L)
    {
      c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip outside", new Object[0]);
      AppMethodBeat.o(115814);
    }
    while (true)
    {
      return;
      long l1 = System.currentTimeMillis();
      try
      {
        if (this.mNativeInst == 0L)
        {
          c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip inside, lock [%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          AppMethodBeat.o(115814);
          continue;
        }
        long l2 = System.currentTimeMillis();
        if (this.mParams.enable_request_animation_frame)
          this.mAnimationFrameHandler.destroy();
        nativeDestroy(this.mNativeInst);
        this.mJsThreadHandler = null;
        resetJavaClientRes();
        this.mNativeInst = 0L;
        this.mbView = null;
        c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy cost [%d]ms, monitoring lock cost [%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Long.valueOf(l2 - l1) });
        AppMethodBeat.o(115814);
      }
      finally
      {
        AppMethodBeat.o(115814);
      }
    }
  }

  public MBCanvasHandler getCanvasHandler()
  {
    return this.mCanvasHandler;
  }

  public int[] getCanvasSize(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(115824);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115824);
    while (true)
    {
      return localObject;
      int[] arrayOfInt = nativeGetCanvasSize(this.mNativeInst, paramInt);
      if ((arrayOfInt != null) && (arrayOfInt.length != 2))
      {
        AppMethodBeat.o(115824);
      }
      else
      {
        AppMethodBeat.o(115824);
        localObject = arrayOfInt;
      }
    }
  }

  public a.a getCurrentFps()
  {
    AppMethodBeat.i(115820);
    a.a locala = getInspector().getCurrentFps();
    AppMethodBeat.o(115820);
    return locala;
  }

  public IMBFontHandler getFontHandler()
  {
    return this.mFontHandler;
  }

  public int getGLThreadTid()
  {
    int i = 0;
    AppMethodBeat.i(115816);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115816);
    while (true)
    {
      return i;
      try
      {
        if (this.mNativeInst == 0L)
        {
          AppMethodBeat.o(115816);
          continue;
        }
        i = nativeGetGLThreadTid(this.mNativeInst);
        AppMethodBeat.o(115816);
      }
      finally
      {
        AppMethodBeat.o(115816);
      }
    }
  }

  public IMBImageHandler getImageHandler()
  {
    return this.mImageHandler;
  }

  public a getInspector()
  {
    return this.mbInspector;
  }

  public MBJsThreadHandler getJsThreadHandler()
  {
    return this.mJsThreadHandler;
  }

  public int getJsThreadTid()
  {
    int i = 0;
    AppMethodBeat.i(115815);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115815);
    while (true)
    {
      return i;
      try
      {
        if (this.mNativeInst == 0L)
        {
          AppMethodBeat.o(115815);
          continue;
        }
        i = nativeGetJsThreadTid(this.mNativeInst);
        AppMethodBeat.o(115815);
      }
      finally
      {
        AppMethodBeat.o(115815);
      }
    }
  }

  public com.tencent.magicbrush.c.b getMBRuntimeView()
  {
    return this.mbView;
  }

  public MBRuntime.MBParams getParams()
  {
    return this.mParams;
  }

  public int getScreenCanvasId()
  {
    return this.mScreenCanvasId;
  }

  public int getSystemDisplayHeight()
  {
    return this.mSystemDisplayHeight;
  }

  public int getSystemDisplayWidth()
  {
    return this.mSystemDisplayWidth;
  }

  public void init()
  {
    AppMethodBeat.i(115805);
    if (this.mParams.enable_request_animation_frame)
      this.mAnimationFrameHandler = new com.tencent.magicbrush.c.a(this, this.mJsThreadHandler);
    if (this.mFontHandler == null)
    {
      this.mFontHandler = new h();
      nativeSetFontHandler(this.mNativeInst, this.mFontHandler);
    }
    if (this.mImageHandler == null)
    {
      this.mImageHandler = new com.tencent.magicbrush.handler.image.a(this, this.mJsThreadHandler);
      nativeSetImageHandler(this.mNativeInst, this.mImageHandler);
    }
    IllegalStateException localIllegalStateException;
    if (this.mJsThreadHandler == null)
    {
      localIllegalStateException = new IllegalStateException("[MBRuntime] JsThreadHandler not registered.");
      AppMethodBeat.o(115805);
      throw localIllegalStateException;
    }
    if (this.mImageHandler == null)
    {
      localIllegalStateException = new IllegalStateException("[MBRuntime] ImageHandler not registered.");
      AppMethodBeat.o(115805);
      throw localIllegalStateException;
    }
    if (this.mFontHandler == null)
    {
      localIllegalStateException = new IllegalStateException("[MBRuntime] FontHandler not registered.");
      AppMethodBeat.o(115805);
      throw localIllegalStateException;
    }
    if (this.mNativeInst == 0L)
    {
      c.c.i("MicroMsg.MagicBrush.MBRuntime", "init. mNativeInst == 0", new Object[0]);
      AppMethodBeat.o(115805);
    }
    while (true)
    {
      return;
      nativeInit(this.mNativeInst);
      AppMethodBeat.o(115805);
    }
  }

  public boolean isDestroyed()
  {
    try
    {
      long l = this.mNativeInst;
      if (l == 0L)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public boolean isDestroyedUnlock()
  {
    if (this.mNativeInst == 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isMainThreadWaiting()
  {
    return this.mainThreadWaitingFlag;
  }

  native float[] nativeGetCurrentFps(long paramLong);

  native float nativeGetCurrentFpsVariance(long paramLong);

  native int nativeGetDrawCalls(long paramLong);

  native int nativeGetFrameCounter(long paramLong);

  native int nativeGetTriangles(long paramLong);

  native int nativeGetVertexes(long paramLong);

  public native void nativeSetEnableInspectFpsVariance(long paramLong, boolean paramBoolean);

  public void notifyAnimationFrame(double paramDouble)
  {
    AppMethodBeat.i(115810);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115810);
    while (true)
    {
      return;
      nativeNotifyAnimationFrame(this.mNativeInst, paramDouble);
      AppMethodBeat.o(115810);
    }
  }

  public void notifyImageDecoded(String paramString, Object paramObject, IMBImageHandler.a parama)
  {
    AppMethodBeat.i(115823);
    if (this.mNativeInst == 0L)
    {
      parama.ag(paramObject);
      AppMethodBeat.o(115823);
    }
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        parama.ag(paramObject);
        AppMethodBeat.o(115823);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.9(this, parama, paramString, paramObject));
        AppMethodBeat.o(115823);
      }
    }
  }

  public void notifyTouchEvent(final long paramLong, final JsTouchEventHandler.a parama)
  {
    AppMethodBeat.i(115822);
    if (this.mNativeInst == 0L)
    {
      parama.aA(paramLong);
      AppMethodBeat.o(115822);
    }
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        parama.aA(paramLong);
        AppMethodBeat.o(115822);
      }
      else
      {
        localMBJsThreadHandler.f(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(115794);
            if (MBRuntime.this.mNativeInst == 0L)
            {
              parama.aA(paramLong);
              AppMethodBeat.o(115794);
            }
            while (true)
            {
              return;
              MBRuntime.access$1000(MBRuntime.this, MBRuntime.this.mNativeInst, paramLong);
              AppMethodBeat.o(115794);
            }
          }
        });
        AppMethodBeat.o(115822);
      }
    }
  }

  public void notifyWindowAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115811);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowAvailable ", new Object[0]);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115811);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115811);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.4(this, paramSurfaceTexture, paramInt1, paramInt2));
        AppMethodBeat.o(115811);
      }
    }
  }

  public void notifyWindowChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115812);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged ", new Object[0]);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115812);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115812);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.5(this, paramSurfaceTexture, paramInt1, paramInt2));
        AppMethodBeat.o(115812);
      }
    }
  }

  public void notifyWindowDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(115813);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowDestroyed ", new Object[0]);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115813);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115813);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.6(this, paramSurfaceTexture));
        AppMethodBeat.o(115813);
      }
    }
  }

  public void pause()
  {
    AppMethodBeat.i(115808);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.pause ", new Object[0]);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115808);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115808);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.3(this));
        AppMethodBeat.o(115808);
      }
    }
  }

  public void registerEventListener(MBRuntime.IMBEventListener paramIMBEventListener)
  {
    AppMethodBeat.i(115825);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.registerEventListener ", new Object[0]);
    if (this.mListenerQueue == null)
      this.mListenerQueue = new ConcurrentLinkedQueue();
    this.mListenerQueue.add(paramIMBEventListener);
    AppMethodBeat.o(115825);
  }

  public void resume()
  {
    AppMethodBeat.i(115807);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.resume ", new Object[0]);
    Object localObject;
    if (this.mbView == null)
    {
      localObject = new IllegalStateException("MBRuntime can not resume, before a MBRuntimeView attached.");
      AppMethodBeat.o(115807);
      throw ((Throwable)localObject);
    }
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115807);
    while (true)
    {
      return;
      localObject = this.mJsThreadHandler;
      if (localObject == null)
      {
        AppMethodBeat.o(115807);
      }
      else
      {
        ((com.tencent.magicbrush.handler.a)localObject).f(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(115788);
            if (MBRuntime.this.mNativeInst == 0L)
              AppMethodBeat.o(115788);
            while (true)
            {
              return;
              MBRuntime.access$200(MBRuntime.this, MBRuntime.this.mNativeInst);
              if (MBRuntime.this.mParams.enable_request_animation_frame)
                MBRuntime.this.mAnimationFrameHandler.resume();
              AppMethodBeat.o(115788);
            }
          }
        });
        AppMethodBeat.o(115807);
      }
    }
  }

  public void setFontHandler(IMBFontHandler paramIMBFontHandler)
  {
    AppMethodBeat.i(115819);
    this.mFontHandler = paramIMBFontHandler;
    nativeSetFontHandler(this.mNativeInst, paramIMBFontHandler);
    AppMethodBeat.o(115819);
  }

  public void setImageHandler(IMBImageHandler paramIMBImageHandler)
  {
    AppMethodBeat.i(115818);
    this.mImageHandler = paramIMBImageHandler;
    nativeSetImageHandler(this.mNativeInst, paramIMBImageHandler);
    AppMethodBeat.o(115818);
  }

  public void setJsThreadHandler(com.tencent.magicbrush.handler.a parama)
  {
    AppMethodBeat.i(115827);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.setJsThreadHandler ", new Object[0]);
    if (this.mJsThreadHandler != null)
    {
      c.c.e("MicroMsg.MagicBrush.MBRuntime", "Why you setJsThreadHandler twice, unexpected behaviour.", new Object[0]);
      AppMethodBeat.o(115827);
    }
    while (true)
    {
      return;
      long l = this.mNativeInst;
      this.mJsThreadHandler = new MBJsThreadHandler(parama);
      AppMethodBeat.o(115827);
    }
  }

  public void setMBRuntimeView(com.tencent.magicbrush.c.b paramb)
  {
    this.mbView = paramb;
  }

  public void setUserPreferredFps(double paramDouble)
  {
    AppMethodBeat.i(115821);
    if (this.mNativeInst == 0L)
      AppMethodBeat.o(115821);
    while (true)
    {
      return;
      MBJsThreadHandler localMBJsThreadHandler = this.mJsThreadHandler;
      if (localMBJsThreadHandler == null)
      {
        AppMethodBeat.o(115821);
      }
      else
      {
        localMBJsThreadHandler.f(new MBRuntime.7(this, paramDouble));
        AppMethodBeat.o(115821);
      }
    }
  }

  public void unregisterEventListener(MBRuntime.IMBEventListener paramIMBEventListener)
  {
    AppMethodBeat.i(115826);
    c.c.i("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.unregisterEventListener ", new Object[0]);
    if (this.mListenerQueue == null)
    {
      paramIMBEventListener = new IllegalStateException("[MBRuntime:unregisterEventListener] You may make a mistake.");
      AppMethodBeat.o(115826);
      throw paramIMBEventListener;
    }
    this.mListenerQueue.remove(paramIMBEventListener);
    AppMethodBeat.o(115826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime
 * JD-Core Version:    0.6.2
 */