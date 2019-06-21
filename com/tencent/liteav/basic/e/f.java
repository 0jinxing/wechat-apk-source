package com.tencent.liteav.basic.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGLContext;

public class f extends Handler
{
  public int a = 720;
  public int b = 1280;
  public Surface c = null;
  public EGLContext d = null;
  protected b e = null;
  private a f = null;

  public f(Looper paramLooper)
  {
    super(paramLooper);
  }

  public static void a(Handler paramHandler, HandlerThread paramHandlerThread)
  {
    AppMethodBeat.i(66228);
    if ((paramHandler == null) || (paramHandlerThread == null))
      AppMethodBeat.o(66228);
    while (true)
    {
      return;
      Message localMessage = new Message();
      localMessage.what = 101;
      localMessage.obj = new f.1(paramHandler, paramHandlerThread);
      paramHandler.sendMessage(localMessage);
      AppMethodBeat.o(66228);
    }
  }

  private void a(Message paramMessage)
  {
    AppMethodBeat.i(66232);
    if (!d())
      e();
    AppMethodBeat.o(66232);
  }

  private void b(Message paramMessage)
  {
    AppMethodBeat.i(66233);
    e();
    AppMethodBeat.o(66233);
  }

  private void c(Message paramMessage)
  {
    AppMethodBeat.i(66234);
    try
    {
      if (this.f != null)
        this.f.d();
      AppMethodBeat.o(66234);
      return;
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        TXCLog.e("TXGLThreadHandler", "onMsgRend Exception " + paramMessage.getMessage());
        AppMethodBeat.o(66234);
      }
    }
  }

  private boolean d()
  {
    boolean bool = false;
    AppMethodBeat.i(66235);
    TXCLog.d("TXGLThreadHandler", String.format("init egl size[%d/%d]", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) }));
    this.e = b.a(null, this.d, this.c, this.a, this.b);
    if (this.e == null)
      AppMethodBeat.o(66235);
    while (true)
    {
      return bool;
      if (this.f != null)
        this.f.c();
      AppMethodBeat.o(66235);
      bool = true;
    }
  }

  private void e()
  {
    AppMethodBeat.i(66236);
    if (this.f != null)
      this.f.e();
    if (this.e != null)
    {
      this.e.b();
      this.e = null;
    }
    this.c = null;
    AppMethodBeat.o(66236);
  }

  public EGLContext a()
  {
    AppMethodBeat.i(66229);
    EGLContext localEGLContext;
    if (this.e != null)
    {
      localEGLContext = this.e.c();
      AppMethodBeat.o(66229);
    }
    while (true)
    {
      return localEGLContext;
      localEGLContext = null;
      AppMethodBeat.o(66229);
    }
  }

  public void a(a parama)
  {
    this.f = parama;
  }

  public Surface b()
  {
    return this.c;
  }

  public void c()
  {
    AppMethodBeat.i(66230);
    if (this.e != null)
      this.e.a();
    AppMethodBeat.o(66230);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(66231);
    if (paramMessage == null)
    {
      AppMethodBeat.o(66231);
      return;
    }
    switch (paramMessage.what)
    {
    default:
    case 100:
    case 102:
    case 101:
    }
    while (true)
    {
      if ((paramMessage != null) && (paramMessage.obj != null))
        ((Runnable)paramMessage.obj).run();
      AppMethodBeat.o(66231);
      break;
      a(paramMessage);
      continue;
      try
      {
        c(paramMessage);
      }
      catch (Exception localException)
      {
      }
      continue;
      b(paramMessage);
    }
  }

  static abstract interface a
  {
    public abstract void c();

    public abstract void d();

    public abstract void e();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.f
 * JD-Core Version:    0.6.2
 */