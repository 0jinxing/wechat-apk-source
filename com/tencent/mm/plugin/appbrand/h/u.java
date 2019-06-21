package com.tencent.mm.plugin.appbrand.h;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.c.f;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class u
  implements i, k, r
{
  private com.tencent.xweb.i ife;
  private volatile boolean iff;
  private volatile boolean ifg;
  private volatile CountDownLatch ifh;
  private Handler mHandler;

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117460);
    if (this.iff)
      AppMethodBeat.o(117460);
    while (true)
    {
      return;
      paramURL = new u.2(this, paramURL, paramString, paramValueCallback);
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
      {
        paramURL.run();
        AppMethodBeat.o(117460);
      }
      else
      {
        this.mHandler.post(paramURL);
        AppMethodBeat.o(117460);
      }
    }
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117461);
    a(paramURL, paramString3, paramValueCallback);
    AppMethodBeat.o(117461);
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(117458);
    this.ife.AMb.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(117458);
  }

  public final <T extends j> T af(Class<T> paramClass)
  {
    AppMethodBeat.i(117464);
    if (paramClass.isInstance(this))
      if ((paramClass == k.class) && (!this.ife.AMb.dUA()))
      {
        AppMethodBeat.o(117464);
        paramClass = null;
      }
    while (true)
    {
      return paramClass;
      AppMethodBeat.o(117464);
      paramClass = this;
      continue;
      AppMethodBeat.o(117464);
      paramClass = null;
    }
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final int callFromJsThread()
  {
    AppMethodBeat.i(117470);
    ab.d("MicroMsg.AppBrandMessBasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.ifg) });
    if (this.ifg)
    {
      ab.i("MicroMsg.AppBrandMessBasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      this.ifg = false;
      this.ifh = new CountDownLatch(1);
    }
    try
    {
      this.ifh.await();
      AppMethodBeat.o(117470);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.e("MicroMsg.AppBrandMessBasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(117463);
    if (!this.iff)
    {
      com.tencent.xweb.i locali = this.ife;
      if (!locali.iff)
        locali.AMb.cleanup();
      locali.iff = true;
    }
    this.iff = true;
    AppMethodBeat.o(117463);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117459);
    if (this.iff)
      AppMethodBeat.o(117459);
    while (true)
    {
      return;
      paramString = new u.1(this, paramString, paramValueCallback);
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
      {
        paramString.run();
        AppMethodBeat.o(117459);
      }
      else
      {
        this.mHandler.post(paramString);
        AppMethodBeat.o(117459);
      }
    }
  }

  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(117469);
    ByteBuffer localByteBuffer = this.ife.AMb.getNativeBuffer(paramInt);
    AppMethodBeat.o(117469);
    return localByteBuffer;
  }

  public final int getNativeBufferId()
  {
    AppMethodBeat.i(117467);
    int i = this.ife.AMb.getNativeBufferId();
    AppMethodBeat.o(117467);
    return i;
  }

  public final void pause()
  {
    AppMethodBeat.i(117465);
    if (this.ife.dTW())
    {
      this.ife.AMb.pause();
      AppMethodBeat.o(117465);
    }
    while (true)
    {
      return;
      this.ifg = true;
      evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new u.4(this));
      AppMethodBeat.o(117465);
    }
  }

  public final void resume()
  {
    AppMethodBeat.i(117466);
    if (this.ife.dTW())
    {
      this.ife.AMb.resume();
      AppMethodBeat.o(117466);
    }
    while (true)
    {
      return;
      this.ifg = false;
      if (this.ifh != null)
      {
        this.ifh.countDown();
        this.ifh = null;
      }
      AppMethodBeat.o(117466);
    }
  }

  public final void setJsExceptionHandler(h paramh)
  {
    AppMethodBeat.i(117462);
    com.tencent.xweb.i locali = this.ife;
    paramh = new u.3(this, paramh);
    locali.AMb.a(paramh);
    AppMethodBeat.o(117462);
  }

  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(117468);
    this.ife.AMb.setNativeBuffer(paramInt, paramByteBuffer);
    AppMethodBeat.o(117468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.u
 * JD-Core Version:    0.6.2
 */