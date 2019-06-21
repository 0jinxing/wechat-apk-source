package com.tencent.xweb.x5;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.JsContext;
import com.tencent.smtt.sdk.JsVirtualMachine;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.xwalk.core.Log;

public final class h
  implements com.tencent.xweb.c.f
{
  private JsContext AQB;
  private h.a AQC;
  com.tencent.xweb.f AQD;
  private Context mContext;

  public h(Context paramContext)
  {
    AppMethodBeat.i(84842);
    this.mContext = paramContext;
    Log.i("MicroMsg.X5V8JsRuntime", "create X5V8JsRuntime");
    AppMethodBeat.o(84842);
  }

  public final void a(com.tencent.xweb.f paramf)
  {
    this.AQD = paramf;
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(84849);
    this.AQB.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(84849);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(84846);
    this.AQB.destroy();
    this.AQC.ciD.clear();
    AppMethodBeat.o(84846);
  }

  public final boolean dTW()
  {
    return true;
  }

  public final boolean dUA()
  {
    return true;
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(84847);
    this.AQB.evaluateJavascript(paramString, new a.d(paramValueCallback));
    AppMethodBeat.o(84847);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(84848);
    Log.i("MicroMsg.X5V8JsRuntime", String.format("evaluateJavascriptWithURL(%s)", new Object[] { paramURL }));
    this.AQB.evaluateJavascript(paramString, new a.d(paramValueCallback), paramURL);
    AppMethodBeat.o(84848);
  }

  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(84852);
    Object localObject = this.AQC.getNativeBuffer(paramInt);
    if ((localObject != null) && (localObject.length > 0))
    {
      localObject = ByteBuffer.wrap((byte[])localObject);
      AppMethodBeat.o(84852);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(84852);
    }
  }

  public final int getNativeBufferId()
  {
    AppMethodBeat.i(84850);
    int i = this.AQC.getNativeBufferId();
    AppMethodBeat.o(84850);
    return i;
  }

  public final void init(int paramInt)
  {
    AppMethodBeat.i(84843);
    this.AQB = new JsContext(this.mContext);
    this.AQC = new h.a();
    this.AQB.addJavascriptInterface(this.AQC, "nativeBufferCompat");
    this.AQB.evaluateJavascript("function getNativeBufferId() {   if (nativeBufferCompat) {       return nativeBufferCompat.getNativeBufferId();   }   return -1;}function setNativeBuffer(id, bytes) {   if (nativeBufferCompat) {       return nativeBufferCompat.setNativeBuffer(id, bytes);   }}function getNativeBuffer(id) {   if (nativeBufferCompat) {       return nativeBufferCompat.getNativeBuffer(id);   }}", new a.d(new h.1(this)));
    this.AQB.setExceptionHandler(new h.2(this));
    AppMethodBeat.o(84843);
  }

  public final void pause()
  {
    AppMethodBeat.i(84844);
    this.AQB.virtualMachine().onPause();
    AppMethodBeat.o(84844);
  }

  public final void resume()
  {
    AppMethodBeat.i(84845);
    this.AQB.virtualMachine().onResume();
    AppMethodBeat.o(84845);
  }

  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(84851);
    h.a locala = this.AQC;
    if (paramByteBuffer == null)
      paramByteBuffer = new byte[0];
    while (true)
    {
      locala.setNativeBuffer(paramInt, paramByteBuffer);
      AppMethodBeat.o(84851);
      return;
      if (!paramByteBuffer.isDirect())
      {
        paramByteBuffer = paramByteBuffer.array();
      }
      else
      {
        int i = paramByteBuffer.position();
        paramByteBuffer.position(0);
        byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
        paramByteBuffer.get(arrayOfByte);
        paramByteBuffer.position(i);
        paramByteBuffer = arrayOfByte;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.h
 * JD-Core Version:    0.6.2
 */