package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import android.content.Context;
import android.opengl.GLException;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class GameGLSurfaceView extends SurfaceView
  implements SurfaceHolder.Callback2
{
  private static final GameGLSurfaceView.k iZP;
  public GameGLSurfaceView.j iZQ;
  private GameGLSurfaceView.n iZR;
  private GameGLSurfaceView.e iZS;
  private GameGLSurfaceView.f iZT;
  private GameGLSurfaceView.h iZU;
  private GameGLSurfaceView.l iZV;
  private boolean iZW;
  private int mDebugFlags;
  private boolean mDetached;
  private int mEGLContextClientVersion;
  private boolean mPreserveEGLContextOnPause;
  private final WeakReference<GameGLSurfaceView> mThisWeakRef;

  static
  {
    AppMethodBeat.i(134114);
    iZP = new GameGLSurfaceView.k((byte)0);
    AppMethodBeat.o(134114);
  }

  public GameGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134094);
    this.mThisWeakRef = new WeakReference(this);
    this.iZW = false;
    getHolder().addCallback(this);
    AppMethodBeat.o(134094);
  }

  private void checkRenderThreadState()
  {
    AppMethodBeat.i(134113);
    if (this.iZQ != null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("setRenderer has already been called for this instance.");
      AppMethodBeat.o(134113);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(134113);
  }

  public final void aPV()
  {
    AppMethodBeat.i(134101);
    setEGLConfigChooser(new GameGLSurfaceView.b(this));
    AppMethodBeat.o(134101);
  }

  protected void finalize()
  {
    AppMethodBeat.i(134095);
    try
    {
      if (this.iZQ != null)
        this.iZQ.aPZ();
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(134095);
    }
  }

  public int getDebugFlags()
  {
    return this.mDebugFlags;
  }

  public boolean getIsSwapNow()
  {
    return this.iZW;
  }

  public boolean getPreserveEGLContextOnPause()
  {
    return this.mPreserveEGLContextOnPause;
  }

  public int getRenderMode()
  {
    AppMethodBeat.i(134104);
    int i = this.iZQ.getRenderMode();
    AppMethodBeat.o(134104);
    return i;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(134111);
    super.onAttachedToWindow();
    c.c.i("MicroMsg.GameGLSurfaceView", "onAttachedToWindow reattach =" + this.mDetached, new Object[0]);
    if ((this.mDetached) && (this.iZR != null))
      if (this.iZQ == null)
        break label112;
    label112: for (int i = this.iZQ.getRenderMode(); ; i = 1)
    {
      this.iZQ = new GameGLSurfaceView.j(this.mThisWeakRef);
      if (i != 1)
        this.iZQ.setRenderMode(i);
      this.iZQ.start();
      this.mDetached = false;
      AppMethodBeat.o(134111);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(134112);
    c.c.i("MicroMsg.GameGLSurfaceView", "onDetachedFromWindow", new Object[0]);
    if (this.iZQ != null)
      this.iZQ.aPZ();
    this.mDetached = true;
    super.onDetachedFromWindow();
    AppMethodBeat.o(134112);
  }

  public final void onPause()
  {
    AppMethodBeat.i(138702);
    this.iZQ.onPause();
    AppMethodBeat.o(138702);
  }

  public void onResume()
  {
    AppMethodBeat.i(134110);
    c.c.i("MicroMsg.GameGLSurfaceView", "onResume", new Object[0]);
    GameGLSurfaceView.j localj = this.iZQ;
    synchronized (iZP)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("onResume tid=");
      c.c.i("MicroMsg.GLThread", localj.getId(), new Object[0]);
      localj.mRequestPaused = false;
      localj.jag = false;
      localj.mRequestRender = true;
      localj.mRenderComplete = false;
      iZP.notifyAll();
      while (true)
        if ((!localj.mExited) && (localj.mPaused) && (!localj.mRenderComplete))
        {
          c.c.i("MicroMsg.GLThread", "onResume waiting for !mPaused.", new Object[0]);
          try
          {
            iZP.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
    }
    AppMethodBeat.o(134110);
  }

  public void setDebugFlags(int paramInt)
  {
    this.mDebugFlags = paramInt;
  }

  public void setEGLConfigChooser(GameGLSurfaceView.e parame)
  {
    AppMethodBeat.i(134099);
    checkRenderThreadState();
    this.iZS = parame;
    AppMethodBeat.o(134099);
  }

  public void setEGLConfigChooser(boolean paramBoolean)
  {
    AppMethodBeat.i(134100);
    setEGLConfigChooser(new GameGLSurfaceView.o(this));
    AppMethodBeat.o(134100);
  }

  public void setEGLContextClientVersion(int paramInt)
  {
    AppMethodBeat.i(134102);
    checkRenderThreadState();
    this.mEGLContextClientVersion = paramInt;
    AppMethodBeat.o(134102);
  }

  public void setEGLContextFactory(GameGLSurfaceView.f paramf)
  {
    AppMethodBeat.i(134097);
    checkRenderThreadState();
    this.iZT = paramf;
    AppMethodBeat.o(134097);
  }

  public void setEGLWindowSurfaceFactory(GameGLSurfaceView.h paramh)
  {
    AppMethodBeat.i(134098);
    checkRenderThreadState();
    this.iZU = paramh;
    AppMethodBeat.o(134098);
  }

  public void setFps(int paramInt)
  {
  }

  public void setGLWrapper(GameGLSurfaceView.l paraml)
  {
    this.iZV = paraml;
  }

  public void setPreserveEGLContextOnPause(boolean paramBoolean)
  {
    this.mPreserveEGLContextOnPause = paramBoolean;
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(134103);
    this.iZQ.setRenderMode(paramInt);
    AppMethodBeat.o(134103);
  }

  public void setRenderer(GameGLSurfaceView.n paramn)
  {
    AppMethodBeat.i(134096);
    checkRenderThreadState();
    if (this.iZS == null)
      this.iZS = new GameGLSurfaceView.o(this);
    if (this.iZT == null)
      this.iZT = new GameGLSurfaceView.c(this, (byte)0);
    if (this.iZU == null)
      this.iZU = new GameGLSurfaceView.d((byte)0);
    this.iZR = paramn;
    this.iZQ = new GameGLSurfaceView.j(this.mThisWeakRef);
    this.iZQ.start();
    AppMethodBeat.o(134096);
  }

  public void setSwapNow(boolean paramBoolean)
  {
    this.iZW = paramBoolean;
  }

  public void surfaceChanged(SurfaceHolder arg1, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(134107);
    GameGLSurfaceView.j localj = this.iZQ;
    while (true)
    {
      synchronized (iZP)
      {
        if ((localj.mWidth == paramInt2) && (localj.mHeight == paramInt3))
        {
          AppMethodBeat.o(134107);
          return;
        }
        localj.mWidth = paramInt2;
        localj.mHeight = paramInt3;
        localj.mSizeChanged = true;
        localj.mRequestRender = true;
        localj.mRenderComplete = false;
        localj.jaf = true;
        if (Thread.currentThread() == localj)
        {
          AppMethodBeat.o(134107);
          continue;
        }
        iZP.notifyAll();
        if ((localj.mExited) || (localj.mPaused) || (localj.mRenderComplete))
          break label235;
        if ((localj.mHaveEglContext) && (localj.mHaveEglSurface) && (localj.readyToDraw()))
        {
          paramInt1 = 1;
          if (paramInt1 == 0)
            break label235;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("onWindowResize waiting for render complete from tid=");
          c.c.i("MicroMsg.GLThread", localj.getId(), new Object[0]);
          try
          {
            iZP.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
      paramInt1 = 0;
      continue;
      label235: AppMethodBeat.o(134107);
    }
  }

  public void surfaceCreated(SurfaceHolder arg1)
  {
    AppMethodBeat.i(134105);
    c.c.i("MicroMsg.GameGLSurfaceView", "alvinluo GameGLSurfaceView surfaceCreated", new Object[0]);
    GameGLSurfaceView.j localj = this.iZQ;
    synchronized (iZP)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("surfaceCreated tid=");
      c.c.i("MicroMsg.GLThread", localj.getId(), new Object[0]);
      localj.mHasSurface = true;
      localj.mFinishedCreatingEglSurface = false;
      localj.jaf = true;
      iZP.notifyAll();
      while (true)
        if ((localj.mWaitingForSurface) && (!localj.mFinishedCreatingEglSurface))
        {
          boolean bool = localj.mExited;
          if (!bool)
            try
            {
              iZP.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(134105);
  }

  public void surfaceDestroyed(SurfaceHolder arg1)
  {
    AppMethodBeat.i(134106);
    GameGLSurfaceView.j localj = this.iZQ;
    synchronized (iZP)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("surfaceDestroyed tid=");
      c.c.i("MicroMsg.GLThread", localj.getId(), new Object[0]);
      localj.mHasSurface = false;
      localj.jaf = true;
      iZP.notifyAll();
      while (true)
        if (!localj.mWaitingForSurface)
        {
          boolean bool = localj.mExited;
          if (!bool)
            try
            {
              iZP.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(134106);
  }

  public void surfaceRedrawNeeded(SurfaceHolder arg1)
  {
    AppMethodBeat.i(134108);
    GameGLSurfaceView.j localj;
    if (this.iZQ != null)
      localj = this.iZQ;
    while (true)
    {
      synchronized (iZP)
      {
        localj.mRequestRender = true;
        iZP.notifyAll();
        AppMethodBeat.o(134108);
        return;
      }
      AppMethodBeat.o(134108);
    }
  }

  public static final class g
    implements EGL11
  {
    private EGL10 iZY;
    Writer iZZ;
    boolean jaa;
    boolean jab;
    private int jac;

    private void Ew(String paramString)
    {
      AppMethodBeat.i(134050);
      log(paramString + '\n');
      AppMethodBeat.o(134050);
    }

    private void Ex(String paramString)
    {
      AppMethodBeat.i(134061);
      log(" returns " + paramString + ";\n");
      flush();
      AppMethodBeat.o(134061);
    }

    private void a(String paramString, EGLContext paramEGLContext)
    {
      AppMethodBeat.i(134059);
      if (paramEGLContext == EGL10.EGL_NO_CONTEXT)
      {
        cW(paramString, "EGL10.EGL_NO_CONTEXT");
        AppMethodBeat.o(134059);
      }
      while (true)
      {
        return;
        cW(paramString, toString(paramEGLContext));
        AppMethodBeat.o(134059);
      }
    }

    private void a(String paramString, EGLDisplay paramEGLDisplay)
    {
      AppMethodBeat.i(134058);
      if (paramEGLDisplay == EGL10.EGL_DEFAULT_DISPLAY)
      {
        cW(paramString, "EGL10.EGL_DEFAULT_DISPLAY");
        AppMethodBeat.o(134058);
      }
      while (true)
      {
        return;
        if (paramEGLDisplay == EGL_NO_DISPLAY)
        {
          cW(paramString, "EGL10.EGL_NO_DISPLAY");
          AppMethodBeat.o(134058);
        }
        else
        {
          cW(paramString, toString(paramEGLDisplay));
          AppMethodBeat.o(134058);
        }
      }
    }

    private void a(String paramString, EGLSurface paramEGLSurface)
    {
      AppMethodBeat.i(134060);
      if (paramEGLSurface == EGL10.EGL_NO_SURFACE)
      {
        cW(paramString, "EGL10.EGL_NO_SURFACE");
        AppMethodBeat.o(134060);
      }
      while (true)
      {
        return;
        cW(paramString, toString(paramEGLSurface));
        AppMethodBeat.o(134060);
      }
    }

    private void a(String paramString, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134066);
      if (paramArrayOfInt == null)
      {
        cW(paramString, "null");
        AppMethodBeat.o(134066);
      }
      while (true)
      {
        return;
        cW(paramString, c(paramArrayOfInt.length, paramArrayOfInt));
        AppMethodBeat.o(134066);
      }
    }

    private void bL(Object paramObject)
    {
      AppMethodBeat.i(134064);
      Ex(toString(paramObject));
      AppMethodBeat.o(134064);
    }

    private void bz(String paramString, int paramInt)
    {
      AppMethodBeat.i(134056);
      cW(paramString, Integer.toString(paramInt));
      AppMethodBeat.o(134056);
    }

    private static String c(int paramInt, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134068);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("{\n");
      int i = paramArrayOfInt.length;
      int j = 0;
      if (j < paramInt)
      {
        int k = j + 0;
        localStringBuilder.append(" [" + k + "] = ");
        if ((k < 0) || (k >= i))
          localStringBuilder.append("out of bounds");
        while (true)
        {
          localStringBuilder.append('\n');
          j++;
          break;
          localStringBuilder.append(paramArrayOfInt[k]);
        }
      }
      localStringBuilder.append("}");
      paramArrayOfInt = localStringBuilder.toString();
      AppMethodBeat.o(134068);
      return paramArrayOfInt;
    }

    private void cW(String paramString1, String paramString2)
    {
      AppMethodBeat.i(134053);
      int i = this.jac;
      this.jac = (i + 1);
      if (i > 0)
        log(", ");
      if (this.jaa)
        log(paramString1 + "=");
      log(paramString2);
      AppMethodBeat.o(134053);
    }

    private void checkError()
    {
      AppMethodBeat.i(134049);
      int i = this.iZY.eglGetError();
      if (i != 12288)
      {
        Object localObject = "eglError: " + getErrorString(i);
        Ew((String)localObject);
        if (this.jab)
        {
          localObject = new GLException(i, (String)localObject);
          AppMethodBeat.o(134049);
          throw ((Throwable)localObject);
        }
      }
      AppMethodBeat.o(134049);
    }

    private void eW(boolean paramBoolean)
    {
      AppMethodBeat.i(134063);
      Ex(Boolean.toString(paramBoolean));
      AppMethodBeat.o(134063);
    }

    private void end()
    {
      AppMethodBeat.i(134054);
      log(");\n");
      flush();
      AppMethodBeat.o(134054);
    }

    private static String f(int paramInt, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(134069);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("{\n");
      int i = paramArrayOfObject.length;
      int j = 0;
      if (j < paramInt)
      {
        int k = j + 0;
        localStringBuilder.append(" [" + k + "] = ");
        if ((k < 0) || (k >= i))
          localStringBuilder.append("out of bounds");
        while (true)
        {
          localStringBuilder.append('\n');
          j++;
          break;
          localStringBuilder.append(paramArrayOfObject[k]);
        }
      }
      localStringBuilder.append("}");
      paramArrayOfObject = localStringBuilder.toString();
      AppMethodBeat.o(134069);
      return paramArrayOfObject;
    }

    private void flush()
    {
      AppMethodBeat.i(134055);
      try
      {
        this.iZZ.flush();
        AppMethodBeat.o(134055);
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          this.iZZ = null;
          AppMethodBeat.o(134055);
        }
      }
    }

    public static String getErrorString(int paramInt)
    {
      AppMethodBeat.i(134071);
      String str;
      switch (paramInt)
      {
      default:
        str = qq(paramInt);
        AppMethodBeat.o(134071);
      case 12288:
      case 12289:
      case 12290:
      case 12291:
      case 12292:
      case 12293:
      case 12294:
      case 12295:
      case 12296:
      case 12297:
      case 12298:
      case 12299:
      case 12300:
      case 12301:
      case 12302:
      }
      while (true)
      {
        return str;
        str = "EGL_SUCCESS";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_NOT_INITIALIZED";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_ACCESS";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_ALLOC";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_ATTRIBUTE";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_CONFIG";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_CONTEXT";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_CURRENT_SURFACE";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_DISPLAY";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_MATCH";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_NATIVE_PIXMAP";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_NATIVE_WINDOW";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_PARAMETER";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_BAD_SURFACE";
        AppMethodBeat.o(134071);
        continue;
        str = "EGL_CONTEXT_LOST";
        AppMethodBeat.o(134071);
      }
    }

    private void log(String paramString)
    {
      AppMethodBeat.i(134051);
      try
      {
        this.iZZ.write(paramString);
        AppMethodBeat.o(134051);
        return;
      }
      catch (IOException paramString)
      {
        while (true)
          AppMethodBeat.o(134051);
      }
    }

    private void p(String paramString, Object paramObject)
    {
      AppMethodBeat.i(134057);
      cW(paramString, toString(paramObject));
      AppMethodBeat.o(134057);
    }

    private void p(String paramString, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(134067);
      if (paramArrayOfObject == null)
      {
        cW(paramString, "null");
        AppMethodBeat.o(134067);
      }
      while (true)
      {
        return;
        cW(paramString, f(paramArrayOfObject.length, paramArrayOfObject));
        AppMethodBeat.o(134067);
      }
    }

    private void qp(int paramInt)
    {
      AppMethodBeat.i(134062);
      Ex(Integer.toString(paramInt));
      AppMethodBeat.o(134062);
    }

    private static String qq(int paramInt)
    {
      AppMethodBeat.i(134070);
      String str = "0x" + Integer.toHexString(paramInt);
      AppMethodBeat.o(134070);
      return str;
    }

    private static String toString(Object paramObject)
    {
      AppMethodBeat.i(134065);
      if (paramObject == null)
      {
        paramObject = "null";
        AppMethodBeat.o(134065);
      }
      while (true)
      {
        return paramObject;
        paramObject = paramObject.toString();
        AppMethodBeat.o(134065);
      }
    }

    private void yF(String paramString)
    {
      AppMethodBeat.i(134052);
      log(paramString + '(');
      this.jac = 0;
      AppMethodBeat.o(134052);
    }

    public final boolean eglChooseConfig(EGLDisplay paramEGLDisplay, int[] paramArrayOfInt1, EGLConfig[] paramArrayOfEGLConfig, int paramInt, int[] paramArrayOfInt2)
    {
      AppMethodBeat.i(134025);
      yF("eglChooseConfig");
      a("display", paramEGLDisplay);
      a("attrib_list", paramArrayOfInt1);
      bz("config_size", paramInt);
      end();
      boolean bool = this.iZY.eglChooseConfig(paramEGLDisplay, paramArrayOfInt1, paramArrayOfEGLConfig, paramInt, paramArrayOfInt2);
      p("configs", paramArrayOfEGLConfig);
      a("num_config", paramArrayOfInt2);
      eW(bool);
      checkError();
      AppMethodBeat.o(134025);
      return bool;
    }

    public final boolean eglCopyBuffers(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface, Object paramObject)
    {
      AppMethodBeat.i(134026);
      yF("eglCopyBuffers");
      a("display", paramEGLDisplay);
      a("surface", paramEGLSurface);
      p("native_pixmap", paramObject);
      end();
      boolean bool = this.iZY.eglCopyBuffers(paramEGLDisplay, paramEGLSurface, paramObject);
      eW(bool);
      checkError();
      AppMethodBeat.o(134026);
      return bool;
    }

    public final EGLContext eglCreateContext(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, EGLContext paramEGLContext, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134027);
      yF("eglCreateContext");
      a("display", paramEGLDisplay);
      p("config", paramEGLConfig);
      a("share_context", paramEGLContext);
      a("attrib_list", paramArrayOfInt);
      end();
      paramEGLDisplay = this.iZY.eglCreateContext(paramEGLDisplay, paramEGLConfig, paramEGLContext, paramArrayOfInt);
      bL(paramEGLDisplay);
      checkError();
      AppMethodBeat.o(134027);
      return paramEGLDisplay;
    }

    public final EGLSurface eglCreatePbufferSurface(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134028);
      yF("eglCreatePbufferSurface");
      a("display", paramEGLDisplay);
      p("config", paramEGLConfig);
      a("attrib_list", paramArrayOfInt);
      end();
      paramEGLDisplay = this.iZY.eglCreatePbufferSurface(paramEGLDisplay, paramEGLConfig, paramArrayOfInt);
      bL(paramEGLDisplay);
      checkError();
      AppMethodBeat.o(134028);
      return paramEGLDisplay;
    }

    public final EGLSurface eglCreatePixmapSurface(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134029);
      yF("eglCreatePixmapSurface");
      a("display", paramEGLDisplay);
      p("config", paramEGLConfig);
      p("native_pixmap", paramObject);
      a("attrib_list", paramArrayOfInt);
      end();
      paramEGLDisplay = this.iZY.eglCreatePixmapSurface(paramEGLDisplay, paramEGLConfig, paramObject, paramArrayOfInt);
      bL(paramEGLDisplay);
      checkError();
      AppMethodBeat.o(134029);
      return paramEGLDisplay;
    }

    public final EGLSurface eglCreateWindowSurface(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134030);
      yF("eglCreateWindowSurface");
      a("display", paramEGLDisplay);
      p("config", paramEGLConfig);
      p("native_window", paramObject);
      a("attrib_list", paramArrayOfInt);
      end();
      paramEGLDisplay = this.iZY.eglCreateWindowSurface(paramEGLDisplay, paramEGLConfig, paramObject, paramArrayOfInt);
      bL(paramEGLDisplay);
      checkError();
      AppMethodBeat.o(134030);
      return paramEGLDisplay;
    }

    public final boolean eglDestroyContext(EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
    {
      AppMethodBeat.i(134031);
      yF("eglDestroyContext");
      a("display", paramEGLDisplay);
      a("context", paramEGLContext);
      end();
      boolean bool = this.iZY.eglDestroyContext(paramEGLDisplay, paramEGLContext);
      eW(bool);
      checkError();
      AppMethodBeat.o(134031);
      return bool;
    }

    public final boolean eglDestroySurface(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
    {
      AppMethodBeat.i(134032);
      yF("eglDestroySurface");
      a("display", paramEGLDisplay);
      a("surface", paramEGLSurface);
      end();
      boolean bool = this.iZY.eglDestroySurface(paramEGLDisplay, paramEGLSurface);
      eW(bool);
      checkError();
      AppMethodBeat.o(134032);
      return bool;
    }

    public final boolean eglGetConfigAttrib(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134033);
      yF("eglGetConfigAttrib");
      a("display", paramEGLDisplay);
      p("config", paramEGLConfig);
      bz("attribute", paramInt);
      end();
      boolean bool = this.iZY.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, paramArrayOfInt);
      a("value", paramArrayOfInt);
      eW(bool);
      checkError();
      AppMethodBeat.o(134033);
      return false;
    }

    public final boolean eglGetConfigs(EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig, int paramInt, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134034);
      yF("eglGetConfigs");
      a("display", paramEGLDisplay);
      bz("config_size", paramInt);
      end();
      boolean bool = this.iZY.eglGetConfigs(paramEGLDisplay, paramArrayOfEGLConfig, paramInt, paramArrayOfInt);
      p("configs", paramArrayOfEGLConfig);
      a("num_config", paramArrayOfInt);
      eW(bool);
      checkError();
      AppMethodBeat.o(134034);
      return bool;
    }

    public final EGLContext eglGetCurrentContext()
    {
      AppMethodBeat.i(134035);
      yF("eglGetCurrentContext");
      end();
      EGLContext localEGLContext = this.iZY.eglGetCurrentContext();
      bL(localEGLContext);
      checkError();
      AppMethodBeat.o(134035);
      return localEGLContext;
    }

    public final EGLDisplay eglGetCurrentDisplay()
    {
      AppMethodBeat.i(134036);
      yF("eglGetCurrentDisplay");
      end();
      EGLDisplay localEGLDisplay = this.iZY.eglGetCurrentDisplay();
      bL(localEGLDisplay);
      checkError();
      AppMethodBeat.o(134036);
      return localEGLDisplay;
    }

    public final EGLSurface eglGetCurrentSurface(int paramInt)
    {
      AppMethodBeat.i(134037);
      yF("eglGetCurrentSurface");
      bz("readdraw", paramInt);
      end();
      EGLSurface localEGLSurface = this.iZY.eglGetCurrentSurface(paramInt);
      bL(localEGLSurface);
      checkError();
      AppMethodBeat.o(134037);
      return localEGLSurface;
    }

    public final EGLDisplay eglGetDisplay(Object paramObject)
    {
      AppMethodBeat.i(134038);
      yF("eglGetDisplay");
      p("native_display", paramObject);
      end();
      paramObject = this.iZY.eglGetDisplay(paramObject);
      bL(paramObject);
      checkError();
      AppMethodBeat.o(134038);
      return paramObject;
    }

    public final int eglGetError()
    {
      AppMethodBeat.i(134039);
      yF("eglGetError");
      end();
      int i = this.iZY.eglGetError();
      Ex(getErrorString(i));
      AppMethodBeat.o(134039);
      return i;
    }

    public final boolean eglInitialize(EGLDisplay paramEGLDisplay, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134040);
      yF("eglInitialize");
      a("display", paramEGLDisplay);
      end();
      boolean bool = this.iZY.eglInitialize(paramEGLDisplay, paramArrayOfInt);
      eW(bool);
      a("major_minor", paramArrayOfInt);
      checkError();
      AppMethodBeat.o(134040);
      return bool;
    }

    public final boolean eglMakeCurrent(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface1, EGLSurface paramEGLSurface2, EGLContext paramEGLContext)
    {
      AppMethodBeat.i(134041);
      yF("eglMakeCurrent");
      a("display", paramEGLDisplay);
      a("draw", paramEGLSurface1);
      a("read", paramEGLSurface2);
      a("context", paramEGLContext);
      end();
      boolean bool = this.iZY.eglMakeCurrent(paramEGLDisplay, paramEGLSurface1, paramEGLSurface2, paramEGLContext);
      eW(bool);
      checkError();
      AppMethodBeat.o(134041);
      return bool;
    }

    public final boolean eglQueryContext(EGLDisplay paramEGLDisplay, EGLContext paramEGLContext, int paramInt, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134042);
      yF("eglQueryContext");
      a("display", paramEGLDisplay);
      a("context", paramEGLContext);
      bz("attribute", paramInt);
      end();
      boolean bool = this.iZY.eglQueryContext(paramEGLDisplay, paramEGLContext, paramInt, paramArrayOfInt);
      qp(paramArrayOfInt[0]);
      eW(bool);
      checkError();
      AppMethodBeat.o(134042);
      return bool;
    }

    public final String eglQueryString(EGLDisplay paramEGLDisplay, int paramInt)
    {
      AppMethodBeat.i(134043);
      yF("eglQueryString");
      a("display", paramEGLDisplay);
      bz("name", paramInt);
      end();
      paramEGLDisplay = this.iZY.eglQueryString(paramEGLDisplay, paramInt);
      Ex(paramEGLDisplay);
      checkError();
      AppMethodBeat.o(134043);
      return paramEGLDisplay;
    }

    public final boolean eglQuerySurface(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface, int paramInt, int[] paramArrayOfInt)
    {
      AppMethodBeat.i(134044);
      yF("eglQuerySurface");
      a("display", paramEGLDisplay);
      a("surface", paramEGLSurface);
      bz("attribute", paramInt);
      end();
      boolean bool = this.iZY.eglQuerySurface(paramEGLDisplay, paramEGLSurface, paramInt, paramArrayOfInt);
      qp(paramArrayOfInt[0]);
      eW(bool);
      checkError();
      AppMethodBeat.o(134044);
      return bool;
    }

    public final boolean eglSwapBuffers(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
    {
      AppMethodBeat.i(134045);
      yF("eglSwapBuffers");
      a("display", paramEGLDisplay);
      a("surface", paramEGLSurface);
      end();
      boolean bool = this.iZY.eglSwapBuffers(paramEGLDisplay, paramEGLSurface);
      eW(bool);
      checkError();
      AppMethodBeat.o(134045);
      return bool;
    }

    public final boolean eglTerminate(EGLDisplay paramEGLDisplay)
    {
      AppMethodBeat.i(134046);
      yF("eglTerminate");
      a("display", paramEGLDisplay);
      end();
      boolean bool = this.iZY.eglTerminate(paramEGLDisplay);
      eW(bool);
      checkError();
      AppMethodBeat.o(134046);
      return bool;
    }

    public final boolean eglWaitGL()
    {
      AppMethodBeat.i(134047);
      yF("eglWaitGL");
      end();
      boolean bool = this.iZY.eglWaitGL();
      eW(bool);
      checkError();
      AppMethodBeat.o(134047);
      return bool;
    }

    public final boolean eglWaitNative(int paramInt, Object paramObject)
    {
      AppMethodBeat.i(134048);
      yF("eglWaitNative");
      bz("engine", paramInt);
      p("bindTarget", paramObject);
      end();
      boolean bool = this.iZY.eglWaitNative(paramInt, paramObject);
      eW(bool);
      checkError();
      AppMethodBeat.o(134048);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView
 * JD-Core Version:    0.6.2
 */