package com.tencent.xweb.x5;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.X5JsCore;
import java.net.URL;
import java.nio.ByteBuffer;
import org.xwalk.core.Log;

public final class f
  implements com.tencent.xweb.c.f
{
  private X5JsCore AQt;
  private Context mContext;

  public f(Context paramContext)
  {
    AppMethodBeat.i(84808);
    this.mContext = paramContext;
    Log.i("MicroMsg.X5JsRuntime", "create X5V8JsRuntime");
    AppMethodBeat.o(84808);
  }

  public final void a(com.tencent.xweb.f paramf)
  {
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(84816);
    this.AQt.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(84816);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(84813);
    this.AQt.destroy();
    AppMethodBeat.o(84813);
  }

  public final boolean dTW()
  {
    AppMethodBeat.i(84812);
    boolean bool;
    if ((X5JsCore.canUseX5JsCore(this.mContext)) && (QbSdk.getTbsVersion(this.mContext) >= 43600))
    {
      bool = true;
      AppMethodBeat.o(84812);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84812);
    }
  }

  public final boolean dUA()
  {
    AppMethodBeat.i(84820);
    boolean bool = X5JsCore.canX5JsCoreUseNativeBuffer(this.mContext);
    AppMethodBeat.o(84820);
    return bool;
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(84814);
    this.AQt.evaluateJavascript(paramString, new a.d(paramValueCallback));
    AppMethodBeat.o(84814);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(84815);
    this.AQt.evaluateJavascript(paramString, new a.d(paramValueCallback));
    AppMethodBeat.o(84815);
  }

  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(84819);
    ByteBuffer localByteBuffer = this.AQt.getNativeBuffer(paramInt);
    AppMethodBeat.o(84819);
    return localByteBuffer;
  }

  public final int getNativeBufferId()
  {
    AppMethodBeat.i(84817);
    int i = this.AQt.getNativeBufferId();
    AppMethodBeat.o(84817);
    return i;
  }

  public final void init(int paramInt)
  {
    AppMethodBeat.i(84809);
    this.AQt = new X5JsCore(this.mContext);
    AppMethodBeat.o(84809);
  }

  public final void pause()
  {
    AppMethodBeat.i(84810);
    this.AQt.pause();
    AppMethodBeat.o(84810);
  }

  public final void resume()
  {
    AppMethodBeat.i(84811);
    this.AQt.resume();
    AppMethodBeat.o(84811);
  }

  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(84818);
    this.AQt.setNativeBuffer(paramInt, paramByteBuffer);
    AppMethodBeat.o(84818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.f
 * JD-Core Version:    0.6.2
 */