package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import android.opengl.GLDebugHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

final class GLSurfaceView$i extends Thread
{
  private boolean iZN;
  private GLSurfaceView.h iZO;
  private ArrayList<Runnable> mEventQueue;
  boolean mExited;
  Runnable mFinishDrawingRunnable;
  boolean mFinishedCreatingEglSurface;
  private WeakReference<GLSurfaceView> mGLSurfaceViewWeakRef;
  boolean mHasSurface;
  boolean mHaveEglContext;
  boolean mHaveEglSurface;
  int mHeight;
  boolean mPaused;
  boolean mRenderComplete;
  private int mRenderMode;
  private boolean mRequestPaused;
  boolean mRequestRender;
  private boolean mShouldExit;
  private boolean mShouldReleaseEglContext;
  boolean mSizeChanged;
  private boolean mSurfaceIsBad;
  boolean mWaitingForSurface;
  boolean mWantRenderNotification;
  int mWidth;

  GLSurfaceView$i(WeakReference<GLSurfaceView> paramWeakReference)
  {
    AppMethodBeat.i(133985);
    this.iZN = true;
    this.mEventQueue = new ArrayList();
    this.mSizeChanged = true;
    this.mFinishDrawingRunnable = null;
    this.mWidth = 0;
    this.mHeight = 0;
    this.mRequestRender = true;
    this.mRenderMode = 1;
    this.mWantRenderNotification = false;
    this.mGLSurfaceViewWeakRef = paramWeakReference;
    AppMethodBeat.o(133985);
  }

  private void d(GL10 paramGL10)
  {
    AppMethodBeat.i(133987);
    if (this.mHaveEglSurface)
    {
      if ((this.iZN) && (paramGL10 != null))
      {
        ab.c("CustomGLSurfaceView", "alvinluo stopEglsurface", new Object[0]);
        this.iZN = false;
        ab.i("CustomGLSurfaceView", "alvinluo saveBitmap");
        ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(8192000);
        localByteBuffer.position(0);
        paramGL10.glReadPixels(0, 0, 1024, 2000, 6408, 5121, localByteBuffer);
        paramGL10 = DynamicBackgroundGLSurfaceView.b.iZv;
        DynamicBackgroundGLSurfaceView.b.a.a(localByteBuffer, "/sdcard/test.png");
      }
      this.mHaveEglSurface = false;
      paramGL10 = this.iZO;
      ab.w("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
      paramGL10.destroySurfaceImp();
    }
    AppMethodBeat.o(133987);
  }

  private void guardedRun()
  {
    AppMethodBeat.i(133989);
    this.iZO = new GLSurfaceView.h(this.mGLSurfaceViewWeakRef);
    this.mHaveEglContext = false;
    this.mHaveEglSurface = false;
    this.mWantRenderNotification = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    Object localObject1 = null;
    ??? = null;
    Object localObject16 = null;
    Object localObject17;
    int i6;
    int i7;
    label89: label349: int i8;
    label183: int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    label861: Object localObject19;
    try
    {
      while (true)
      {
        localObject17 = GLSurfaceView.aPT();
        i6 = i;
        i = i3;
        i7 = i2;
        try
        {
          if (this.mShouldExit)
            synchronized (GLSurfaceView.aPT())
            {
              d(null);
              stopEglContextLocked();
              AppMethodBeat.o(133989);
              return;
            }
          Object localObject3;
          if (!this.mEventQueue.isEmpty())
          {
            ??? = (Runnable)this.mEventQueue.remove(0);
            ??? = localObject2;
            localObject3 = ???;
            i3 = i;
            i = i6;
            i6 = k;
            k = j;
            j = i7;
            if (localObject3 != null)
            {
              ((Runnable)localObject3).run();
              ??? = null;
              i2 = j;
              j = k;
              localObject3 = ???;
              ??? = ???;
              k = i6;
            }
          }
          else
          {
            boolean bool = false;
            if (this.mPaused != this.mRequestPaused)
            {
              bool = this.mRequestPaused;
              this.mPaused = this.mRequestPaused;
              GLSurfaceView.aPT().notifyAll();
              ??? = new java/lang/StringBuilder;
              ((StringBuilder)???).<init>("mPaused is now ");
              ab.i("GLThread", this.mPaused + " tid=" + getId());
            }
            if (this.mShouldReleaseEglContext)
            {
              ??? = new java/lang/StringBuilder;
              ((StringBuilder)???).<init>("releasing EGL context because asked to tid=");
              ab.i("GLThread", getId());
              d((GL10)localObject16);
              stopEglContextLocked();
              this.mShouldReleaseEglContext = false;
              i2 = 1;
              i8 = m;
              if (m != 0)
              {
                d((GL10)localObject16);
                stopEglContextLocked();
                i8 = 0;
              }
              if ((bool) && (this.mHaveEglSurface))
              {
                ??? = new java/lang/StringBuilder;
                ((StringBuilder)???).<init>("releasing EGL surface because paused tid=");
                ab.i("GLThread", getId());
                d((GL10)localObject16);
              }
              if ((bool) && (this.mHaveEglContext))
              {
                ??? = (GLSurfaceView)this.mGLSurfaceViewWeakRef.get();
                if (??? != null)
                  break label919;
              }
              label919: for (bool = false; ; bool = GLSurfaceView.g((GLSurfaceView)???))
              {
                if (!bool)
                {
                  stopEglContextLocked();
                  ??? = new java/lang/StringBuilder;
                  ((StringBuilder)???).<init>("releasing EGL context because paused tid=");
                  ab.i("GLThread", getId());
                }
                if ((!this.mHasSurface) && (!this.mWaitingForSurface))
                {
                  ??? = new java/lang/StringBuilder;
                  ((StringBuilder)???).<init>("noticed surfaceView surface lost tid=");
                  ab.i("GLThread", getId());
                  if (this.mHaveEglSurface)
                    d((GL10)localObject16);
                  this.mWaitingForSurface = true;
                  this.mSurfaceIsBad = false;
                  GLSurfaceView.aPT().notifyAll();
                }
                if ((this.mHasSurface) && (this.mWaitingForSurface))
                {
                  ??? = new java/lang/StringBuilder;
                  ((StringBuilder)???).<init>("noticed surfaceView surface acquired tid=");
                  ab.i("GLThread", getId());
                  this.mWaitingForSurface = false;
                  GLSurfaceView.aPT().notifyAll();
                }
                i9 = i7;
                if (i7 != 0)
                {
                  ??? = new java/lang/StringBuilder;
                  ((StringBuilder)???).<init>("sending render notification tid=");
                  ab.i("GLThread", getId());
                  this.mWantRenderNotification = false;
                  i9 = 0;
                  this.mRenderComplete = true;
                  GLSurfaceView.aPT().notifyAll();
                }
                if (this.mFinishDrawingRunnable != null)
                {
                  localObject3 = this.mFinishDrawingRunnable;
                  this.mFinishDrawingRunnable = null;
                }
                if (!readyToDraw())
                  break label1333;
                m = i2;
                i = i6;
                if (!this.mHaveEglContext)
                {
                  if (i2 == 0)
                    break label929;
                  m = 0;
                  i = i6;
                }
                i3 = j;
                i2 = n;
                i6 = k;
                if (this.mHaveEglContext)
                {
                  i3 = j;
                  i2 = n;
                  i6 = k;
                  if (!this.mHaveEglSurface)
                  {
                    this.mHaveEglSurface = true;
                    i3 = 1;
                    i6 = 1;
                    i2 = 1;
                  }
                }
                i10 = i3;
                ??? = localObject3;
                i7 = m;
                i11 = i2;
                i12 = i6;
                i13 = i;
                if (!this.mHaveEglSurface)
                  break label1396;
                if (!this.mSizeChanged)
                  break label2630;
                i2 = 1;
                j = this.mWidth;
                n = this.mHeight;
                this.mWantRenderNotification = true;
                ??? = new java/lang/StringBuilder;
                ((StringBuilder)???).<init>("noticing that we want render notification tid=");
                ab.i("GLThread", getId());
                k = 1;
                this.mSizeChanged = false;
                this.mRequestRender = false;
                GLSurfaceView.aPT().notifyAll();
                if (!this.mWantRenderNotification)
                  break label2593;
                i1 = 1;
                ??? = ???;
                i4 = j;
                j = i9;
                ??? = localObject3;
                localObject3 = ???;
                i5 = n;
                i3 = m;
                n = i2;
                m = i8;
                break;
              }
              try
              {
                label929: ??? = this.iZO;
                localObject19 = new java/lang/StringBuilder;
                ((StringBuilder)localObject19).<init>("start() tid=");
                ab.w("EglHelper", Thread.currentThread().getId());
                ((GLSurfaceView.h)???).mEgl = ((EGL10)EGLContext.getEGL());
                ((GLSurfaceView.h)???).mEglDisplay = ((GLSurfaceView.h)???).mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (((GLSurfaceView.h)???).mEglDisplay == EGL10.EGL_NO_DISPLAY)
                {
                  ??? = new java/lang/RuntimeException;
                  ((RuntimeException)???).<init>("eglGetDisplay failed");
                  AppMethodBeat.o(133989);
                  throw ((Throwable)???);
                }
              }
              catch (RuntimeException localRuntimeException)
              {
                GLSurfaceView.aPT().notifyAll();
                AppMethodBeat.o(133989);
                throw localRuntimeException;
              }
            }
          }
        }
        finally
        {
          AppMethodBeat.o(133989);
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      synchronized (GLSurfaceView.aPT())
      {
        while (true)
        {
          d(null);
          stopEglContextLocked();
          AppMethodBeat.o(133989);
          throw localObject4;
          localObject19 = new int[2];
          if (!((GLSurfaceView.h)???).mEgl.eglInitialize(((GLSurfaceView.h)???).mEglDisplay, (int[])localObject19))
          {
            ??? = new java/lang/RuntimeException;
            ((RuntimeException)???).<init>("eglInitialize failed");
            AppMethodBeat.o(133989);
            throw ((Throwable)???);
          }
          localObject19 = (GLSurfaceView)((GLSurfaceView.h)???).mGLSurfaceViewWeakRef.get();
          if (localObject19 == null)
            ((GLSurfaceView.h)???).mEglConfig = null;
          for (((GLSurfaceView.h)???).mEglContext = null; ; ((GLSurfaceView.h)???).mEglContext = GLSurfaceView.c((GLSurfaceView)localObject19).createContext(((GLSurfaceView.h)???).mEgl, ((GLSurfaceView.h)???).mEglDisplay, ((GLSurfaceView.h)???).mEglConfig))
          {
            if ((((GLSurfaceView.h)???).mEglContext == null) || (((GLSurfaceView.h)???).mEglContext == EGL10.EGL_NO_CONTEXT))
            {
              ((GLSurfaceView.h)???).mEglContext = null;
              GLSurfaceView.h.throwEglException("createContext", ((GLSurfaceView.h)???).mEgl.eglGetError());
            }
            localObject19 = new java/lang/StringBuilder;
            ((StringBuilder)localObject19).<init>("createContext ");
            ab.w("EglHelper", ((GLSurfaceView.h)???).mEglContext + " tid=" + Thread.currentThread().getId());
            ((GLSurfaceView.h)???).mEglSurface = null;
            this.mHaveEglContext = true;
            i = 1;
            GLSurfaceView.aPT().notifyAll();
            m = i2;
            break;
            ((GLSurfaceView.h)???).mEglConfig = GLSurfaceView.b((GLSurfaceView)localObject19).chooseConfig(((GLSurfaceView.h)???).mEgl, ((GLSurfaceView.h)???).mEglDisplay);
          }
          label1333: i10 = j;
          ??? = localObject4;
          i7 = i2;
          i11 = n;
          i12 = k;
          i13 = i6;
          if (localObject4 != null)
          {
            ab.w("CustomGLSurfaceView", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
            localObject4.run();
            ??? = null;
            i13 = i6;
            i12 = k;
            i11 = n;
            i7 = i2;
            i10 = j;
          }
          label1396: Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>("waiting tid=");
          ab.i("GLThread", getId() + " mHaveEglContext: " + this.mHaveEglContext + " mHaveEglSurface: " + this.mHaveEglSurface + " mFinishedCreatingEglSurface: " + this.mFinishedCreatingEglSurface + " mPaused: " + this.mPaused + " mHasSurface: " + this.mHasSurface + " mSurfaceIsBad: " + this.mSurfaceIsBad + " mWaitingForSurface: " + this.mWaitingForSurface + " mWidth: " + this.mWidth + " mHeight: " + this.mHeight + " mRequestRender: " + this.mRequestRender + " mRenderMode: " + this.mRenderMode);
          GLSurfaceView.aPT().wait();
          i = i7;
          i7 = i9;
          j = i10;
          localObject5 = ???;
          n = i11;
          m = i8;
          k = i12;
          i6 = i13;
          break label89;
          if (k == 0)
            break label2587;
          ab.w("GLThread", "egl createSurface");
          ??? = this.iZO;
          localObject17 = new java/lang/StringBuilder;
          ((StringBuilder)localObject17).<init>("createSurface()  tid=");
          ab.w("EglHelper", Thread.currentThread().getId());
          if (((GLSurfaceView.h)???).mEgl == null)
          {
            ??? = new java/lang/RuntimeException;
            ((RuntimeException)???).<init>("egl not initialized");
            AppMethodBeat.o(133989);
            throw ((Throwable)???);
          }
          if (((GLSurfaceView.h)???).mEglDisplay == null)
          {
            ??? = new java/lang/RuntimeException;
            ((RuntimeException)???).<init>("eglDisplay not initialized");
            AppMethodBeat.o(133989);
            throw ((Throwable)???);
          }
          if (((GLSurfaceView.h)???).mEglConfig == null)
          {
            ??? = new java/lang/RuntimeException;
            ((RuntimeException)???).<init>("mEglConfig not initialized");
            AppMethodBeat.o(133989);
            throw ((Throwable)???);
          }
          ((GLSurfaceView.h)???).destroySurfaceImp();
          localObject17 = (GLSurfaceView)((GLSurfaceView.h)???).mGLSurfaceViewWeakRef.get();
          if (localObject17 != null)
          {
            ((GLSurfaceView.h)???).mEglSurface = GLSurfaceView.d((GLSurfaceView)localObject17).createWindowSurface(((GLSurfaceView.h)???).mEgl, ((GLSurfaceView.h)???).mEglDisplay, ((GLSurfaceView.h)???).mEglConfig, ((GLSurfaceView)localObject17).getHolder());
            label1802: if ((((GLSurfaceView.h)???).mEglSurface != null) && (((GLSurfaceView.h)???).mEglSurface != EGL10.EGL_NO_SURFACE))
              break label2368;
            if (((GLSurfaceView.h)???).mEgl.eglGetError() == 12299)
              ab.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            i2 = 0;
            label1848: if (i2 == 0)
              break label2445;
            synchronized (GLSurfaceView.aPT())
            {
              this.mFinishedCreatingEglSurface = true;
              GLSurfaceView.aPT().notifyAll();
              i2 = 0;
              k = i6;
              if (i6 != 0)
              {
                localObject16 = this.iZO;
                ??? = ((GLSurfaceView.h)localObject16).mEglContext.getGL();
                localObject17 = (GLSurfaceView)((GLSurfaceView.h)localObject16).mGLSurfaceViewWeakRef.get();
                localObject16 = ???;
                if (localObject17 == null)
                  break label2584;
                if (GLSurfaceView.e((GLSurfaceView)localObject17) != null)
                  ??? = GLSurfaceView.e((GLSurfaceView)localObject17).aPU();
                localObject16 = ???;
                if ((GLSurfaceView.f((GLSurfaceView)localObject17) & 0x3) == 0)
                  break label2584;
                i6 = 0;
                if ((GLSurfaceView.f((GLSurfaceView)localObject17) & 0x1) != 0)
                  i6 = 1;
                if ((GLSurfaceView.f((GLSurfaceView)localObject17) & 0x2) == 0)
                  break label2578;
                localObject16 = new com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$l;
                ((GLSurfaceView.l)localObject16).<init>();
                localObject16 = GLDebugHelper.wrap((GL)???, i6, (Writer)localObject16);
                localObject16 = (GL10)localObject16;
                k = 0;
              }
              i6 = i;
              if (i != 0)
              {
                ab.w("GLThread", "onSurfaceCreated");
                ??? = (GLSurfaceView)this.mGLSurfaceViewWeakRef.get();
                if (??? != null)
                  GLSurfaceView.h((GLSurfaceView)???);
                i6 = 0;
              }
              i = n;
              if (n != 0)
              {
                ??? = new java/lang/StringBuilder;
                ((StringBuilder)???).<init>("onSurfaceChanged(");
                ab.w("GLThread", i4 + ", " + i5 + ")");
                ??? = (GLSurfaceView)this.mGLSurfaceViewWeakRef.get();
                if (??? != null)
                  GLSurfaceView.h((GLSurfaceView)???);
                i = 0;
              }
              ??? = new java/lang/StringBuilder;
              ((StringBuilder)???).<init>("onDrawFrame tid=");
              ab.w("GLThread", getId());
              localObject17 = (GLSurfaceView)this.mGLSurfaceViewWeakRef.get();
              ??? = ???;
              if (localObject17 != null)
              {
                GLSurfaceView.h((GLSurfaceView)localObject17);
                ??? = ???;
                if (??? != null)
                {
                  ((Runnable)???).run();
                  ??? = null;
                }
              }
              ??? = this.iZO;
              if (!((GLSurfaceView.h)???).mEgl.eglSwapBuffers(((GLSurfaceView.h)???).mEglDisplay, ((GLSurfaceView.h)???).mEglSurface))
              {
                n = ((GLSurfaceView.h)???).mEgl.eglGetError();
                label2250: i8 = m;
                switch (n)
                {
                default:
                  GLSurfaceView.h.logEglErrorAsWarning("GLThread", "eglSwapBuffers", n);
                case 12288:
                case 12302:
                }
              }
            }
          }
          synchronized (GLSurfaceView.aPT())
          {
            while (true)
            {
              this.mSurfaceIsBad = true;
              GLSurfaceView.aPT().notifyAll();
              i8 = m;
              if (i1 == 0)
                break label2649;
              m = 1;
              i1 = 0;
              ??? = localObject5;
              j = i2;
              i2 = m;
              localObject5 = ???;
              n = i;
              m = i8;
              i = i6;
              break;
              ((GLSurfaceView.h)???).mEglSurface = null;
              break label1802;
              label2368: if (!((GLSurfaceView.h)???).mEgl.eglMakeCurrent(((GLSurfaceView.h)???).mEglDisplay, ((GLSurfaceView.h)???).mEglSurface, ((GLSurfaceView.h)???).mEglSurface, ((GLSurfaceView.h)???).mEglContext))
              {
                GLSurfaceView.h.logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", ((GLSurfaceView.h)???).mEgl.eglGetError());
                i2 = 0;
                break label1848;
              }
              i2 = 1;
              break label1848;
              localObject12 = finally;
              AppMethodBeat.o(133989);
              throw localObject12;
              synchronized (GLSurfaceView.aPT())
              {
                label2445: this.mFinishedCreatingEglSurface = true;
                this.mSurfaceIsBad = true;
                GLSurfaceView.aPT().notifyAll();
                ??? = localObject5;
                i2 = j;
                j = k;
                localObject5 = localObject12;
                Object localObject13 = ???;
                k = i6;
              }
            }
            n = 12288;
            break label2250;
            localObject15 = new java/lang/StringBuilder;
            ((StringBuilder)localObject15).<init>("egl context lost tid=");
            ab.i("GLThread", getId());
            i8 = 1;
          }
        }
      }
      label2578: localObject16 = null;
      continue;
      label2584: continue;
      label2587: i2 = k;
      continue;
      label2593: ??? = localObject15;
      i4 = j;
      j = i9;
      Object localObject15 = localObject7;
      Object localObject8 = ???;
      i5 = n;
      i3 = m;
      n = i2;
      m = i8;
      break label183;
      label2630: n = i5;
      j = i4;
      k = i3;
      break label861;
      i2 = i;
      break label349;
      label2649: m = j;
    }
  }

  private void stopEglContextLocked()
  {
    AppMethodBeat.i(133988);
    if (this.mHaveEglContext)
    {
      GLSurfaceView.h localh = this.iZO;
      ab.w("EglHelper", "finish() tid=" + Thread.currentThread().getId());
      if (localh.mEglContext != null)
      {
        GLSurfaceView localGLSurfaceView = (GLSurfaceView)localh.mGLSurfaceViewWeakRef.get();
        if (localGLSurfaceView != null)
          GLSurfaceView.c(localGLSurfaceView).destroyContext(localh.mEgl, localh.mEglDisplay, localh.mEglContext);
        localh.mEglContext = null;
      }
      if (localh.mEglDisplay != null)
      {
        localh.mEgl.eglTerminate(localh.mEglDisplay);
        localh.mEglDisplay = null;
      }
      this.mHaveEglContext = false;
      GLSurfaceView.aPT().notifyAll();
    }
    AppMethodBeat.o(133988);
  }

  public final int getRenderMode()
  {
    AppMethodBeat.i(133991);
    synchronized (GLSurfaceView.aPT())
    {
      int i = this.mRenderMode;
      AppMethodBeat.o(133991);
      return i;
    }
  }

  final boolean readyToDraw()
  {
    boolean bool1 = true;
    if ((!this.mPaused) && (this.mHasSurface) && (!this.mSurfaceIsBad) && (this.mWidth > 0) && (this.mHeight > 0))
    {
      bool2 = bool1;
      if (!this.mRequestRender)
        if (this.mRenderMode != 1)
          break label58;
    }
    label58: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final void requestExitAndWait()
  {
    AppMethodBeat.i(133992);
    synchronized (GLSurfaceView.aPT())
    {
      this.mShouldExit = true;
      GLSurfaceView.aPT().notifyAll();
      while (true)
      {
        boolean bool = this.mExited;
        if (!bool)
          try
          {
            GLSurfaceView.aPT().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
      }
    }
    AppMethodBeat.o(133992);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc_w 488
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: new 140	java/lang/StringBuilder
    //   10: dup
    //   11: ldc_w 490
    //   14: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_0
    //   18: invokevirtual 221	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i:getId	()J
    //   21: invokevirtual 157	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   24: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokevirtual 493	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i:setName	(Ljava/lang/String;)V
    //   30: ldc 212
    //   32: new 140	java/lang/StringBuilder
    //   35: dup
    //   36: ldc_w 495
    //   39: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: invokevirtual 221	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i:getId	()J
    //   46: invokevirtual 157	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   49: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: aload_0
    //   56: invokespecial 497	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i:guardedRun	()V
    //   59: invokestatic 181	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView:aPT	()Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j;
    //   62: aload_0
    //   63: invokevirtual 502	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j:b	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i;)V
    //   66: ldc_w 488
    //   69: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: return
    //   73: astore_1
    //   74: invokestatic 181	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView:aPT	()Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j;
    //   77: aload_0
    //   78: invokevirtual 502	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j:b	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i;)V
    //   81: ldc_w 488
    //   84: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: goto -15 -> 72
    //   90: astore_1
    //   91: invokestatic 181	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView:aPT	()Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j;
    //   94: aload_0
    //   95: invokevirtual 502	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$j:b	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GLSurfaceView$i;)V
    //   98: ldc_w 488
    //   101: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: aload_1
    //   105: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   55	59	73	java/lang/InterruptedException
    //   55	59	90	finally
  }

  public final void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(133990);
    if ((paramInt < 0) || (paramInt > 1))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("renderMode");
      AppMethodBeat.o(133990);
      throw localIllegalArgumentException;
    }
    synchronized (GLSurfaceView.aPT())
    {
      this.mRenderMode = paramInt;
      GLSurfaceView.aPT().notifyAll();
      AppMethodBeat.o(133990);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GLSurfaceView.i
 * JD-Core Version:    0.6.2
 */