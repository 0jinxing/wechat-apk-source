package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(17)
public final class DummySurface extends Surface
{
  private static boolean brT;
  private static boolean brU;
  public final boolean bdY;
  private final a brV;
  private boolean brW;

  private DummySurface(a parama, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    super(paramSurfaceTexture);
    this.brV = parama;
    this.bdY = paramBoolean;
  }

  public static boolean aj(Context paramContext)
  {
    boolean bool1 = true;
    try
    {
      AppMethodBeat.i(95992);
      int i;
      if (!brU)
      {
        if (v.SDK_INT < 24)
          break label134;
        String str = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if ((str != null) && (str.contains("EGL_EXT_protected_content")))
          break label76;
        i = 0;
        if (i == 0)
          break label134;
      }
      while (true)
      {
        brT = bool1;
        brU = true;
        bool1 = brT;
        AppMethodBeat.o(95992);
        return bool1;
        label76: if ((v.SDK_INT == 24) && ("samsung".equals(v.MANUFACTURER)))
        {
          i = 0;
          break;
        }
        if (v.SDK_INT < 26)
        {
          boolean bool2 = paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
          if (!bool2)
          {
            i = 0;
            break;
          }
        }
        i = 1;
        break;
        label134: bool1 = false;
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static DummySurface h(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(95993);
    if (v.SDK_INT < 17)
    {
      paramContext = new UnsupportedOperationException("Unsupported prior to API level 17");
      AppMethodBeat.o(95993);
      throw paramContext;
    }
    if ((!paramBoolean) || (aj(paramContext)));
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      paramContext = new a().aM(paramBoolean);
      AppMethodBeat.o(95993);
      return paramContext;
    }
  }

  public final void release()
  {
    AppMethodBeat.i(95994);
    super.release();
    synchronized (this.brV)
    {
      if (!this.brW)
      {
        this.brV.handler.sendEmptyMessage(3);
        this.brW = true;
      }
      AppMethodBeat.o(95994);
      return;
    }
  }

  static final class a extends HandlerThread
    implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback
  {
    private final int[] brX;
    private EGLDisplay brY;
    private EGLContext brZ;
    private EGLSurface bsa;
    private SurfaceTexture bsb;
    private Error bsc;
    private RuntimeException bsd;
    private DummySurface bse;
    Handler handler;

    public a()
    {
      super();
      AppMethodBeat.i(95988);
      this.brX = new int[1];
      AppMethodBeat.o(95988);
    }

    public final DummySurface aM(boolean paramBoolean)
    {
      int i = 0;
      AppMethodBeat.i(95989);
      start();
      this.handler = new Handler(getLooper(), this);
      try
      {
        Object localObject1 = this.handler;
        if (paramBoolean);
        for (int j = 1; ; j = 0)
        {
          ((Handler)localObject1).obtainMessage(1, j, 0).sendToTarget();
          j = i;
          while ((this.bse == null) && (this.bsd == null))
          {
            localObject1 = this.bsc;
            if (localObject1 != null)
              break;
            try
            {
              wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              j = 1;
            }
          }
        }
        if (j != 0)
          Thread.currentThread().interrupt();
        if (this.bsd != null)
        {
          RuntimeException localRuntimeException = this.bsd;
          AppMethodBeat.o(95989);
          throw localRuntimeException;
        }
      }
      finally
      {
        AppMethodBeat.o(95989);
      }
      if (this.bsc != null)
      {
        localObject3 = this.bsc;
        AppMethodBeat.o(95989);
        throw ((Throwable)localObject3);
      }
      Object localObject3 = this.bse;
      AppMethodBeat.o(95989);
      return localObject3;
    }

    public final boolean handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(95991);
      switch (paramMessage.what)
      {
      default:
        AppMethodBeat.o(95991);
      case 1:
      case 2:
        while (true)
        {
          label41: return true;
          try
          {
            boolean bool1;
            label52: boolean bool2;
            if (paramMessage.arg1 != 0)
            {
              bool1 = true;
              this.brY = EGL14.eglGetDisplay(0);
              if (this.brY == null)
                break label504;
              bool2 = true;
              label69: a.checkState(bool2, "eglGetDisplay failed");
              paramMessage = new int[2];
              a.checkState(EGL14.eglInitialize(this.brY, paramMessage, 0, paramMessage, 1), "eglInitialize failed");
              Object localObject = new EGLConfig[1];
              paramMessage = new int[1];
              if ((!EGL14.eglChooseConfig(this.brY, new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 }, 0, (EGLConfig[])localObject, 0, 1, paramMessage, 0)) || (paramMessage[0] <= 0) || (localObject[0] == null))
                break label509;
              bool2 = true;
              label244: a.checkState(bool2, "eglChooseConfig failed");
              localObject = localObject[0];
              if (!bool1)
                break label514;
              paramMessage = new int[5];
              Message tmp265_264 = paramMessage;
              tmp265_264[0] = 12440;
              Message tmp271_265 = tmp265_264;
              tmp271_265[1] = 2;
              Message tmp275_271 = tmp271_265;
              tmp275_271[2] = 12992;
              Message tmp281_275 = tmp275_271;
              tmp281_275[3] = 1;
              Message tmp285_281 = tmp281_275;
              tmp285_281[4] = 12344;
              tmp285_281;
              label292: this.brZ = EGL14.eglCreateContext(this.brY, (EGLConfig)localObject, EGL14.EGL_NO_CONTEXT, paramMessage, 0);
              if (this.brZ == null)
                break label539;
              bool2 = true;
              label319: a.checkState(bool2, "eglCreateContext failed");
              if (!bool1)
                break label544;
              paramMessage = new int[7];
              Message tmp335_334 = paramMessage;
              tmp335_334[0] = 12375;
              Message tmp341_335 = tmp335_334;
              tmp341_335[1] = 1;
              Message tmp345_341 = tmp341_335;
              tmp345_341[2] = 12374;
              Message tmp351_345 = tmp345_341;
              tmp351_345[3] = 1;
              Message tmp355_351 = tmp351_345;
              tmp355_351[4] = 12992;
              Message tmp361_355 = tmp355_351;
              tmp361_355[5] = 1;
              Message tmp365_361 = tmp361_355;
              tmp365_361[6] = 12344;
              tmp365_361;
              label373: this.bsa = EGL14.eglCreatePbufferSurface(this.brY, (EGLConfig)localObject, paramMessage, 0);
              if (this.bsa == null)
                break label579;
              bool2 = true;
              label397: a.checkState(bool2, "eglCreatePbufferSurface failed");
              a.checkState(EGL14.eglMakeCurrent(this.brY, this.bsa, this.bsa, this.brZ), "eglMakeCurrent failed");
              GLES20.glGenTextures(1, this.brX, 0);
              paramMessage = new android/graphics/SurfaceTexture;
              paramMessage.<init>(this.brX[0]);
              this.bsb = paramMessage;
              this.bsb.setOnFrameAvailableListener(this);
              paramMessage = new com/google/android/exoplayer2/video/DummySurface;
              paramMessage.<init>(this, this.bsb, bool1, (byte)0);
              this.bse = paramMessage;
            }
            try
            {
              notify();
              AppMethodBeat.o(95991);
              continue;
              bool1 = false;
              break label52;
              label504: bool2 = false;
              break label69;
              label509: bool2 = false;
              break label244;
              label514: paramMessage = new int[3];
              Message tmp519_518 = paramMessage;
              tmp519_518[0] = 12440;
              Message tmp525_519 = tmp519_518;
              tmp525_519[1] = 2;
              Message tmp529_525 = tmp525_519;
              tmp529_525[2] = 12344;
              tmp529_525;
              break label292;
              label539: bool2 = false;
              break label319;
              label544: paramMessage = new int[5];
              Message tmp549_548 = paramMessage;
              tmp549_548[0] = 12375;
              Message tmp555_549 = tmp549_548;
              tmp555_549[1] = 1;
              Message tmp559_555 = tmp555_549;
              tmp559_555[2] = 12374;
              Message tmp565_559 = tmp559_555;
              tmp565_559[3] = 1;
              Message tmp569_565 = tmp565_559;
              tmp569_565[4] = 12344;
              tmp569_565;
              break label373;
              label579: bool2 = false;
              break label397;
            }
            finally
            {
              AppMethodBeat.o(95991);
            }
          }
          catch (RuntimeException paramMessage)
          {
            while (true)
            {
              this.bsd = paramMessage;
              try
              {
                notify();
              }
              finally
              {
                AppMethodBeat.o(95991);
              }
            }
          }
          catch (Error paramMessage)
          {
            while (true)
            {
              this.bsc = paramMessage;
              try
              {
                notify();
              }
              finally
              {
                AppMethodBeat.o(95991);
              }
            }
          }
          finally
          {
            try
            {
              notify();
              throw paramMessage;
            }
            finally
            {
              AppMethodBeat.o(95991);
            }
          }
          this.bsb.updateTexImage();
          AppMethodBeat.o(95991);
        }
      case 3:
      }
      try
      {
        if (this.bsb != null)
        {
          this.bsb.release();
          GLES20.glDeleteTextures(1, this.brX, 0);
        }
      }
      finally
      {
        try
        {
          if (this.bsa != null)
            EGL14.eglDestroySurface(this.brY, this.bsa);
          if (this.brZ != null)
            EGL14.eglDestroyContext(this.brY, this.brZ);
          this.bsa = null;
          this.brZ = null;
          this.brY = null;
          this.bse = null;
          this.bsb = null;
          quit();
          AppMethodBeat.o(95991);
          break label41;
          paramMessage = finally;
          if (this.bsa != null)
            EGL14.eglDestroySurface(this.brY, this.bsa);
          if (this.brZ != null)
            EGL14.eglDestroyContext(this.brY, this.brZ);
          this.bsa = null;
          this.brZ = null;
          this.brY = null;
          this.bse = null;
          this.bsb = null;
          AppMethodBeat.o(95991);
          throw paramMessage;
        }
        catch (Throwable paramMessage)
        {
          while (true)
            quit();
        }
        finally
        {
          quit();
          AppMethodBeat.o(95991);
        }
        throw paramMessage;
      }
    }

    public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
    {
      AppMethodBeat.i(95990);
      this.handler.sendEmptyMessage(2);
      AppMethodBeat.o(95990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.DummySurface
 * JD-Core Version:    0.6.2
 */