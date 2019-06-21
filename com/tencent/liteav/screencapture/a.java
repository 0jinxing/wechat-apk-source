package com.tencent.liteav.screencapture;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

public class a
{
  protected Handler a;
  protected volatile HandlerThread b;
  protected volatile a.a c;
  protected volatile WeakReference<c> d;
  protected volatile int e;
  protected int f;
  protected int g;
  protected int h;
  protected boolean i;
  private Object j;
  private boolean k;
  private int l;
  private int m;
  private Context n;
  private b.a o;

  public a(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(66744);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = 0;
    this.f = 720;
    this.g = 1280;
    this.h = 20;
    this.i = false;
    this.j = null;
    this.k = false;
    this.l = this.f;
    this.m = this.g;
    this.n = null;
    this.o = new b.a()
    {
      public void a(int paramAnonymousInt)
      {
        AppMethodBeat.i(66801);
        a.this.b(paramAnonymousInt);
        a.this.b(105, a.a(a.this), a.b(a.this));
        AppMethodBeat.o(66801);
      }
    };
    this.n = paramContext;
    this.a = new Handler(Looper.getMainLooper());
    this.k = paramBoolean;
    if (Build.VERSION.SDK_INT >= 21)
      b.a().a(paramContext);
    AppMethodBeat.o(66744);
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    AppMethodBeat.i(66745);
    int i2;
    if (this.k)
    {
      i2 = ((WindowManager)this.n.getSystemService("window")).getDefaultDisplay().getRotation();
      if ((i2 == 0) || (i2 == 2))
        if (paramInt1 > paramInt2)
        {
          this.f = paramInt2;
          this.g = paramInt1;
          TXCLog.d("ScreenCapture", String.format("start screen capture orientation[%d] input size[%d/%d] output size[%d/%d]", new Object[] { Integer.valueOf(i2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.f), Integer.valueOf(this.g) }));
          this.h = paramInt3;
          if (Build.VERSION.SDK_INT >= 21)
            break label209;
          a(20000004, null);
          AppMethodBeat.o(66745);
        }
    }
    for (paramInt1 = 20000004; ; paramInt1 = i1)
    {
      return paramInt1;
      this.f = paramInt1;
      this.g = paramInt2;
      break;
      if (paramInt1 < paramInt2)
      {
        this.f = paramInt2;
        this.g = paramInt1;
        break;
      }
      this.f = paramInt1;
      this.g = paramInt2;
      break;
      this.f = paramInt1;
      this.g = paramInt2;
      i2 = 0;
      break;
      label209: this.l = this.f;
      this.m = this.g;
      a();
      if (this.k)
        b.a().a(this.o);
      AppMethodBeat.o(66745);
    }
  }

  protected void a()
  {
    AppMethodBeat.i(66751);
    b();
    try
    {
      Object localObject1 = new android/os/HandlerThread;
      ((HandlerThread)localObject1).<init>("ScreenCaptureGLThread");
      this.b = ((HandlerThread)localObject1);
      this.b.start();
      localObject1 = new com/tencent/liteav/screencapture/a$a;
      ((a.a)localObject1).<init>(this, this.b.getLooper(), this);
      this.c = ((a.a)localObject1);
      this.e += 1;
      this.c.a = this.e;
      this.c.e = this.l;
      this.c.f = this.m;
      localObject1 = this.c;
      if (this.h <= 0);
      for (int i1 = 1; ; i1 = this.h)
      {
        ((a.a)localObject1).g = i1;
        a(100);
        AppMethodBeat.o(66751);
        return;
      }
    }
    finally
    {
      AppMethodBeat.o(66751);
    }
  }

  protected void a(int paramInt)
  {
    AppMethodBeat.i(66755);
    try
    {
      if (this.c != null)
        this.c.sendEmptyMessage(paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(66755);
    }
  }

  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    AppMethodBeat.i(66759);
    c localc = c();
    if (localc != null)
      localc.a(paramInt1, paramInt2, paramInt3, paramInt4, paramLong);
    AppMethodBeat.o(66759);
  }

  protected void a(int paramInt, long paramLong)
  {
    AppMethodBeat.i(66754);
    try
    {
      if (this.c != null)
        this.c.sendEmptyMessageDelayed(paramInt, paramLong);
      return;
    }
    finally
    {
      AppMethodBeat.o(66754);
    }
  }

  protected void a(int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(66757);
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
      AppMethodBeat.o(66757);
    }
    throw paramRunnable;
  }

  protected void a(int paramInt, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(66758);
    c localc = c();
    if (localc != null)
      localc.a(paramInt, paramEGLContext);
    AppMethodBeat.o(66758);
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(66749);
    b.a().a(parama);
    AppMethodBeat.o(66749);
  }

  public void a(c paramc)
  {
    AppMethodBeat.i(66748);
    this.d = new WeakReference(paramc);
    AppMethodBeat.o(66748);
  }

  public void a(Object paramObject)
  {
    AppMethodBeat.i(66746);
    b.a().b(this.o);
    this.j = paramObject;
    b();
    AppMethodBeat.o(66746);
  }

  public void a(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(66750);
      if (this.c != null)
        this.c.post(paramRunnable);
      AppMethodBeat.o(66750);
      return;
    }
    finally
    {
    }
    throw paramRunnable;
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(66747);
    try
    {
      if (this.c != null)
      {
        a.a locala = this.c;
        Runnable local2 = new com/tencent/liteav/screencapture/a$2;
        local2.<init>(this, paramBoolean);
        locala.post(local2);
      }
      while (true)
      {
        return;
        this.i = paramBoolean;
      }
    }
    finally
    {
      AppMethodBeat.o(66747);
    }
  }

  protected void b()
  {
    AppMethodBeat.i(66752);
    try
    {
      this.e += 1;
      if (this.c != null)
      {
        HandlerThread localHandlerThread = this.b;
        a.a locala = this.c;
        a.3 local3 = new com/tencent/liteav/screencapture/a$3;
        local3.<init>(this, locala, localHandlerThread);
        a(101, local3);
      }
      this.c = null;
      this.b = null;
      return;
    }
    finally
    {
      AppMethodBeat.o(66752);
    }
  }

  protected void b(int paramInt)
  {
    AppMethodBeat.i(66760);
    if (paramInt == 0)
    {
      if (this.f < this.g)
      {
        i1 = this.f;
        this.l = i1;
        if (this.f >= this.g)
          break label109;
      }
      label109: for (i1 = this.g; ; i1 = this.f)
      {
        this.m = i1;
        TXCLog.d("ScreenCapture", String.format("reset screen capture angle[%d] output size[%d/%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.l), Integer.valueOf(this.m) }));
        AppMethodBeat.o(66760);
        return;
        i1 = this.g;
        break;
      }
    }
    if (this.f < this.g)
    {
      i1 = this.g;
      label133: this.l = i1;
      if (this.f >= this.g)
        break label170;
    }
    label170: for (int i1 = this.f; ; i1 = this.g)
    {
      this.m = i1;
      break;
      i1 = this.f;
      break label133;
    }
  }

  protected void b(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66756);
    try
    {
      if (this.c != null)
      {
        Message localMessage = new android/os/Message;
        localMessage.<init>();
        localMessage.what = paramInt1;
        localMessage.arg1 = paramInt2;
        localMessage.arg2 = paramInt3;
        this.c.sendMessage(localMessage);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(66756);
    }
  }

  protected c c()
  {
    AppMethodBeat.i(66753);
    c localc;
    if (this.d == null)
    {
      localc = null;
      AppMethodBeat.o(66753);
    }
    while (true)
    {
      return localc;
      localc = (c)this.d.get();
      AppMethodBeat.o(66753);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.a
 * JD-Core Version:    0.6.2
 */