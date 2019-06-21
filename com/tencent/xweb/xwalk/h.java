package com.tencent.xweb.xwalk;

import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URL;
import java.nio.ByteBuffer;
import org.xwalk.core.XWalkV8;

public final class h
  implements com.tencent.xweb.c.f
{
  XWalkV8 ASa;
  HandlerThread ASb;
  private Handler ASc;

  public h()
  {
    AppMethodBeat.i(85241);
    this.ASb = new HandlerThread("j2v8");
    this.ASb.start();
    this.ASc = new Handler(this.ASb.getLooper());
    AppMethodBeat.o(85241);
  }

  public final void a(com.tencent.xweb.f paramf)
  {
  }

  public final void addJavascriptInterface(final Object paramObject, final String paramString)
  {
    AppMethodBeat.i(85246);
    this.ASc.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(85240);
        if (h.this.ASa == null)
          AppMethodBeat.o(85240);
        while (true)
        {
          return;
          h.this.ASa.addJavascriptInterface(paramObject, paramString);
          AppMethodBeat.o(85240);
        }
      }
    });
    AppMethodBeat.o(85246);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(85243);
    this.ASc.post(new h.2(this));
    AppMethodBeat.o(85243);
  }

  public final boolean dTW()
  {
    return false;
  }

  public final boolean dUA()
  {
    return false;
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(85244);
    this.ASc.post(new h.3(this, paramString, paramValueCallback));
    AppMethodBeat.o(85244);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(85245);
    evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(85245);
  }

  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    return null;
  }

  public final int getNativeBufferId()
  {
    return 0;
  }

  public final void init(int paramInt)
  {
    AppMethodBeat.i(85242);
    this.ASc.post(new h.1(this, paramInt));
    AppMethodBeat.o(85242);
  }

  public final void pause()
  {
  }

  public final void resume()
  {
  }

  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.h
 * JD-Core Version:    0.6.2
 */