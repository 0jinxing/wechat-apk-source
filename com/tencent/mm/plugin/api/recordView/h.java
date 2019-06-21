package com.tencent.mm.plugin.api.recordView;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class h
{
  private final String TAG;
  boolean eCM;
  HandlerThread eXa;
  ak eXb;
  int[] fab;
  EGLSurface faf;
  EGLContext fag;
  int fcf;
  int gLw;
  int gLx;
  i gMv;
  i.a gMw;
  int gMx;
  int gMy;
  EGLDisplay gMz;

  public h()
  {
    AppMethodBeat.i(76389);
    this.TAG = "MicroMsg.YUVDateRenderToRBGBufferThread";
    this.eXa = d.anM("YUVDateRenderToRBGBufferThread");
    this.gMw = null;
    this.eCM = false;
    this.fab = new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344 };
    this.gMz = null;
    this.faf = null;
    this.fag = null;
    AppMethodBeat.o(76389);
  }

  static boolean wH(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(76394);
    int i = EGL14.eglGetError();
    if (i != 12288)
    {
      ab.c("MicroMsg.YUVDateRenderToRBGBufferThread", paramString + ": EGL error: 0x" + Integer.toHexString(i), new Object[0]);
      bool = true;
      AppMethodBeat.o(76394);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(76394);
    }
  }

  public final void a(final EGLContext paramEGLContext)
  {
    AppMethodBeat.i(76390);
    ab.d("MicroMsg.YUVDateRenderToRBGBufferThread", "start context : " + paramEGLContext + "  hasStart : " + this.eCM);
    if ((this.eCM) || (paramEGLContext == null))
      AppMethodBeat.o(76390);
    while (true)
    {
      return;
      this.eCM = true;
      this.eXa.start();
      this.eXb = new ak(this.eXa.getLooper());
      queue(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(76386);
          Object localObject = h.this;
          EGLContext localEGLContext = paramEGLContext;
          int i = h.this.gLw;
          int j = h.this.gLx;
          ((h)localObject).gMz = EGL14.eglGetDisplay(0);
          if (((h)localObject).gMz == EGL14.EGL_NO_DISPLAY)
          {
            localObject = new RuntimeException("unable to get EGL14 display");
            AppMethodBeat.o(76386);
            throw ((Throwable)localObject);
          }
          int[] arrayOfInt = new int[2];
          if (!EGL14.eglInitialize(((h)localObject).gMz, arrayOfInt, 0, arrayOfInt, 1))
          {
            ((h)localObject).gMz = null;
            localObject = new RuntimeException("eglInitialize failed");
            AppMethodBeat.o(76386);
            throw ((Throwable)localObject);
          }
          EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
          arrayOfInt = new int[1];
          EGL14.eglChooseConfig(((h)localObject).gMz, ((h)localObject).fab, 0, arrayOfEGLConfig, 0, 1, arrayOfInt, 0);
          if (arrayOfEGLConfig[0] == null)
          {
            localObject = new RuntimeException("chooseConfig failed");
            AppMethodBeat.o(76386);
            throw ((Throwable)localObject);
          }
          ((h)localObject).fag = EGL14.eglCreateContext(((h)localObject).gMz, arrayOfEGLConfig[0], localEGLContext, new int[] { 12440, 2, 12344 }, 0);
          if (((h)localObject).fag == EGL14.EGL_NO_CONTEXT)
          {
            localObject = new RuntimeException("EGL error " + EGL14.eglGetError());
            AppMethodBeat.o(76386);
            throw ((Throwable)localObject);
          }
          h.wH("eglCreateContext");
          ((h)localObject).faf = null;
          try
          {
            ((h)localObject).faf = EGL14.eglCreatePbufferSurface(((h)localObject).gMz, arrayOfEGLConfig[0], new int[] { 12375, i, 12374, j, 12344 }, 0);
            h.wH("eglCreatePbufferSurface");
            if (((((h)localObject).faf == null) || (((h)localObject).faf == EGL14.EGL_NO_SURFACE)) && (EGL14.eglGetError() == 12299))
              ab.e("MicroMsg.YUVDateRenderToRBGBufferThread", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
            if (!EGL14.eglMakeCurrent(((h)localObject).gMz, ((h)localObject).faf, ((h)localObject).faf, ((h)localObject).fag))
              ab.w("MicroMsg.YUVDateRenderToRBGBufferThread", "eglMakeCurrent:" + EGL14.eglGetError());
            localObject = h.this;
            int k = h.this.gLw;
            i = h.this.gLx;
            int m = h.this.gMx;
            j = h.this.gMy;
            ((h)localObject).gMv = new i(k, i, m, j);
            ((h)localObject).gMv.onSurfaceCreated(null, null);
            ((h)localObject).gMv.onSurfaceChanged(null, m, j);
            if (((h)localObject).gMw != null)
              ((h)localObject).gMv.buffer = ((h)localObject).gMw.getBuffer();
            AppMethodBeat.o(76386);
            return;
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            while (true)
              ab.e("MicroMsg.YUVDateRenderToRBGBufferThread", "eglCreateWindowSurface", new Object[] { localIllegalArgumentException });
          }
        }
      });
      AppMethodBeat.o(76390);
    }
  }

  public final void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(76391);
    ab.i("MicroMsg.YUVDateRenderToRBGBufferThread", "setFrameInfo, width: %s, height: %s, rotate: %s ,targetWidth:%d ,targetHeight:%d , this: %s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), this });
    if ((paramInt1 != this.gLw) || (paramInt2 != this.gLx) || (paramInt3 != this.fcf))
    {
      this.gLw = paramInt1;
      this.gLx = paramInt2;
      this.fcf = paramInt3;
    }
    this.gMx = paramInt4;
    this.gMy = paramInt5;
    AppMethodBeat.o(76391);
  }

  final void queue(Runnable paramRunnable)
  {
    AppMethodBeat.i(76392);
    if (this.eXa.isAlive())
      this.eXb.post(paramRunnable);
    AppMethodBeat.o(76392);
  }

  public final void release()
  {
    AppMethodBeat.i(76393);
    queue(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(76388);
        Object localObject = h.this.gMv;
        if (((i)localObject).eZj != 0)
          GLES20.glDeleteTextures(1, new int[] { ((i)localObject).eZj }, 0);
        if (((i)localObject).eZk != 0)
          GLES20.glDeleteFramebuffers(1, new int[] { ((i)localObject).eZk }, 0);
        localObject = h.this.gMz;
        EGLSurface localEGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent((EGLDisplay)localObject, localEGLSurface, localEGLSurface, EGL14.EGL_NO_CONTEXT);
        if ((h.this.faf != null) && (h.this.fag != null) && (h.this.gMz != null))
        {
          EGL14.eglDestroySurface(h.this.gMz, h.this.faf);
          EGL14.eglDestroyContext(h.this.gMz, h.this.fag);
          EGL14.eglReleaseThread();
          EGL14.eglTerminate(h.this.gMz);
          h.this.fag = null;
          h.this.gMz = null;
          h.this.faf = null;
        }
        h.this.eXb.removeCallbacksAndMessages(null);
        h.this.eXa.quitSafely();
        AppMethodBeat.o(76388);
      }
    });
    AppMethodBeat.o(76393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.h
 * JD-Core Version:    0.6.2
 */