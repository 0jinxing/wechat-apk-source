package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class GLSurfaceView extends SurfaceView
  implements SurfaceHolder.Callback2
{
  private static final GLSurfaceView.j iZF;
  private GLSurfaceView.i iZG;
  private GLSurfaceView.m iZH;
  private e iZI;
  private GLSurfaceView.f iZJ;
  private GLSurfaceView.g iZK;
  private GLSurfaceView.k iZL;
  private int mDebugFlags;
  private boolean mDetached;
  private int mEGLContextClientVersion;
  private boolean mPreserveEGLContextOnPause;
  private final WeakReference<GLSurfaceView> mThisWeakRef;

  static
  {
    AppMethodBeat.i(134017);
    iZF = new GLSurfaceView.j((byte)0);
    AppMethodBeat.o(134017);
  }

  public GLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134000);
    this.mThisWeakRef = new WeakReference(this);
    getHolder().addCallback(this);
    AppMethodBeat.o(134000);
  }

  private void checkRenderThreadState()
  {
    AppMethodBeat.i(134016);
    if (this.iZG != null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("setRenderer has already been called for this instance.");
      AppMethodBeat.o(134016);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(134016);
  }

  protected void finalize()
  {
    AppMethodBeat.i(134001);
    try
    {
      if (this.iZG != null)
        this.iZG.requestExitAndWait();
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(134001);
    }
  }

  public int getDebugFlags()
  {
    return this.mDebugFlags;
  }

  public boolean getPreserveEGLContextOnPause()
  {
    return this.mPreserveEGLContextOnPause;
  }

  public int getRenderMode()
  {
    AppMethodBeat.i(134009);
    int i = this.iZG.getRenderMode();
    AppMethodBeat.o(134009);
    return i;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(134014);
    super.onAttachedToWindow();
    ab.d("CustomGLSurfaceView", "onAttachedToWindow reattach =" + this.mDetached);
    if ((this.mDetached) && (this.iZH != null))
      if (this.iZG == null)
        break label108;
    label108: for (int i = this.iZG.getRenderMode(); ; i = 1)
    {
      this.iZG = new GLSurfaceView.i(this.mThisWeakRef);
      if (i != 1)
        this.iZG.setRenderMode(i);
      this.iZG.start();
      this.mDetached = false;
      AppMethodBeat.o(134014);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(134015);
    ab.d("CustomGLSurfaceView", "onDetachedFromWindow");
    if (this.iZG != null)
      this.iZG.requestExitAndWait();
    this.mDetached = true;
    super.onDetachedFromWindow();
    AppMethodBeat.o(134015);
  }

  public void setDebugFlags(int paramInt)
  {
    this.mDebugFlags = paramInt;
  }

  public void setEGLConfigChooser(e parame)
  {
    AppMethodBeat.i(134005);
    checkRenderThreadState();
    this.iZI = parame;
    AppMethodBeat.o(134005);
  }

  public void setEGLConfigChooser(boolean paramBoolean)
  {
    AppMethodBeat.i(134006);
    setEGLConfigChooser(new GLSurfaceView.n(this, paramBoolean));
    AppMethodBeat.o(134006);
  }

  public void setEGLContextClientVersion(int paramInt)
  {
    AppMethodBeat.i(134007);
    checkRenderThreadState();
    this.mEGLContextClientVersion = paramInt;
    AppMethodBeat.o(134007);
  }

  public void setEGLContextFactory(GLSurfaceView.f paramf)
  {
    AppMethodBeat.i(134003);
    checkRenderThreadState();
    this.iZJ = paramf;
    AppMethodBeat.o(134003);
  }

  public void setEGLWindowSurfaceFactory(GLSurfaceView.g paramg)
  {
    AppMethodBeat.i(134004);
    checkRenderThreadState();
    this.iZK = paramg;
    AppMethodBeat.o(134004);
  }

  public void setGLWrapper(GLSurfaceView.k paramk)
  {
    this.iZL = paramk;
  }

  public void setPreserveEGLContextOnPause(boolean paramBoolean)
  {
    this.mPreserveEGLContextOnPause = paramBoolean;
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(134008);
    this.iZG.setRenderMode(paramInt);
    AppMethodBeat.o(134008);
  }

  public void setRenderer(GLSurfaceView.m paramm)
  {
    AppMethodBeat.i(134002);
    checkRenderThreadState();
    if (this.iZI == null)
      this.iZI = new GLSurfaceView.n(this, true);
    if (this.iZJ == null)
      this.iZJ = new GLSurfaceView.c(this, (byte)0);
    if (this.iZK == null)
      this.iZK = new GLSurfaceView.d((byte)0);
    this.iZH = paramm;
    this.iZG = new GLSurfaceView.i(this.mThisWeakRef);
    this.iZG.start();
    AppMethodBeat.o(134002);
  }

  public void surfaceChanged(SurfaceHolder arg1, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(134012);
    GLSurfaceView.i locali = this.iZG;
    while (true)
    {
      synchronized (iZF)
      {
        locali.mWidth = paramInt2;
        locali.mHeight = paramInt3;
        locali.mSizeChanged = true;
        locali.mRequestRender = true;
        locali.mRenderComplete = false;
        if (Thread.currentThread() == locali)
        {
          AppMethodBeat.o(134012);
          return;
        }
        iZF.notifyAll();
        if ((locali.mExited) || (locali.mPaused) || (locali.mRenderComplete))
          break label193;
        if ((locali.mHaveEglContext) && (locali.mHaveEglSurface) && (locali.readyToDraw()))
        {
          paramInt1 = 1;
          if (paramInt1 == 0)
            break label193;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("onWindowResize waiting for render complete from tid=");
          ab.i("Main thread", locali.getId());
          try
          {
            iZF.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
      paramInt1 = 0;
      continue;
      label193: AppMethodBeat.o(134012);
    }
  }

  public void surfaceCreated(SurfaceHolder arg1)
  {
    AppMethodBeat.i(134010);
    GLSurfaceView.i locali = this.iZG;
    synchronized (iZF)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("surfaceCreated tid=");
      ab.i("GLThread", locali.getId());
      locali.mHasSurface = true;
      locali.mFinishedCreatingEglSurface = false;
      iZF.notifyAll();
      while (true)
        if ((locali.mWaitingForSurface) && (!locali.mFinishedCreatingEglSurface))
        {
          boolean bool = locali.mExited;
          if (!bool)
            try
            {
              iZF.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(134010);
  }

  public void surfaceDestroyed(SurfaceHolder arg1)
  {
    AppMethodBeat.i(134011);
    GLSurfaceView.i locali = this.iZG;
    synchronized (iZF)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("surfaceDestroyed tid=");
      ab.i("GLThread", locali.getId());
      locali.mHasSurface = false;
      iZF.notifyAll();
      while (true)
        if (!locali.mWaitingForSurface)
        {
          boolean bool = locali.mExited;
          if (!bool)
            try
            {
              iZF.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(134011);
  }

  @Deprecated
  public void surfaceRedrawNeeded(SurfaceHolder paramSurfaceHolder)
  {
  }

  public void surfaceRedrawNeededAsync(SurfaceHolder arg1, Runnable paramRunnable)
  {
    AppMethodBeat.i(134013);
    GLSurfaceView.i locali;
    if (this.iZG != null)
      locali = this.iZG;
    while (true)
    {
      synchronized (iZF)
      {
        if (Thread.currentThread() == locali)
        {
          AppMethodBeat.o(134013);
          return;
        }
        locali.mWantRenderNotification = true;
        locali.mRequestRender = true;
        locali.mRenderComplete = false;
        locali.mFinishDrawingRunnable = paramRunnable;
        iZF.notifyAll();
        AppMethodBeat.o(134013);
      }
      AppMethodBeat.o(134013);
    }
  }

  public static abstract interface e
  {
    public abstract EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GLSurfaceView
 * JD-Core Version:    0.6.2
 */