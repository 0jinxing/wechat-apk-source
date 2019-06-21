package com.tencent.mm.plugin.appbrand.h;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.e;
import com.tencent.mm.d.a.f;
import com.tencent.mm.d.a.l.10;
import com.tencent.mm.d.a.l.2;
import com.tencent.mm.d.a.l.3;
import com.tencent.mm.d.a.l.4;
import com.tencent.mm.d.a.l.8;
import com.tencent.mm.d.a.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URL;
import java.nio.ByteBuffer;

abstract class d
  implements g, k, l, n, p, r, s
{
  public void Ce(String paramString)
  {
    com.tencent.mm.d.a.l locall = aGR();
    locall.chO.k(new l.3(locall, paramString));
  }

  public void a(g paramg, String paramString)
  {
    if ((paramg instanceof d))
    {
      com.tencent.mm.d.a.l locall = aGR();
      paramg = ((d)paramg).aGR();
      locall.chO.k(new l.2(locall, paramString, paramg));
      return;
    }
    if (paramg == null);
    for (paramg = null; ; paramg = paramg.getClass().getName())
    {
      ab.e("MicroMsg.AppBrandJ2V8Context", "shareObject with unsupported implementation %s", new Object[] { paramg });
      break;
    }
  }

  public void a(String paramString1, String paramString2, ValueCallback<String> paramValueCallback)
  {
    paramValueCallback = aGR();
    paramValueCallback.chO.k(new l.4(paramValueCallback, paramString1, paramString2));
  }

  public void a(URL paramURL, String paramString, final ValueCallback<String> paramValueCallback)
  {
    if (paramURL == null)
    {
      evaluateJavascript(paramString, paramValueCallback);
      return;
    }
    if (paramValueCallback == null);
    for (paramValueCallback = null; ; paramValueCallback = new l.b()
    {
      public final void ds(String paramAnonymousString)
      {
        AppMethodBeat.i(113935);
        paramValueCallback.onReceiveValue(paramAnonymousString);
        AppMethodBeat.o(113935);
      }
    })
    {
      aGR().a(paramURL.toString(), paramString, paramValueCallback);
      break;
    }
  }

  public void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    com.tencent.mm.d.a.l locall;
    if (paramValueCallback == null)
    {
      paramValueCallback = null;
      locall = aGR();
      if (paramURL != null)
        break label62;
    }
    label62: for (paramURL = null; ; paramURL = paramURL.toString())
    {
      locall.chO.k(new l.8(locall, paramURL, paramValueCallback, paramString3, paramString1, paramString2));
      return;
      paramValueCallback = new d.3(this, paramValueCallback);
      break;
    }
  }

  protected abstract c aGQ();

  protected abstract com.tencent.mm.d.a.l aGR();

  public long aGW()
  {
    return aGR().CB().getPtr();
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    com.tencent.mm.d.a.l locall = aGR();
    if (!TextUtils.isEmpty(paramString))
      locall.chO.k(new l.10(locall, paramObject, paramString, JavascriptInterface.class));
  }

  public <T extends j> T af(Class<T> paramClass)
  {
    if (paramClass.isInstance(this));
    for (paramClass = this; ; paramClass = null)
      return paramClass;
  }

  public void destroy()
  {
    aGR().destroy();
  }

  public void evaluateJavascript(String paramString, final ValueCallback<String> paramValueCallback)
  {
    if (paramValueCallback == null);
    for (paramValueCallback = null; ; paramValueCallback = new l.b()
    {
      public final void ds(String paramAnonymousString)
      {
        AppMethodBeat.i(113934);
        paramValueCallback.onReceiveValue(paramAnonymousString);
        AppMethodBeat.o(113934);
      }
    })
    {
      aGR().a(paramString, paramValueCallback);
      return;
    }
  }

  public void f(Runnable paramRunnable)
  {
    aGQ().f(paramRunnable, 0L);
  }

  public long getIsolatePtr()
  {
    return aGQ().getIsolatePtr();
  }

  public ByteBuffer getNativeBuffer(int paramInt)
  {
    return aGR().chr.gq(paramInt);
  }

  public int getNativeBufferId()
  {
    return aGR().chr.Cv();
  }

  public void oQ(int paramInt)
  {
    aGR().chP.destroy(paramInt);
  }

  public ByteBuffer oR(int paramInt)
  {
    return aGR().chP.gp(paramInt);
  }

  public int oS(int paramInt)
  {
    return aGR().chP.gn(paramInt);
  }

  public void pause()
  {
    aGQ().pause();
  }

  public void resume()
  {
    aGQ().resume();
  }

  public void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    aGR().chr.a(paramInt, paramByteBuffer);
  }

  public void setThreadPriority(int paramInt)
  {
    aGQ().setThreadPriority(paramInt);
  }

  public boolean yE()
  {
    return aGQ().Cs();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.d
 * JD-Core Version:    0.6.2
 */