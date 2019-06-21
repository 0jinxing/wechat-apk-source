package com.tencent.mm.plugin.appbrand.h;

import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import java.net.URL;
import java.util.LinkedList;

public final class w extends WebView
  implements i, o
{
  private boolean ifl;
  private final LinkedList<Pair<String, ValueCallback<String>>> ifm;
  private boolean ifn;
  private volatile boolean mDestroyed;
  private ak mHandler;

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117474);
    evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(117474);
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117475);
    evaluateJavascript(paramString3, paramValueCallback);
    AppMethodBeat.o(117475);
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(117472);
    if ((paramObject != null) && (!bo.isNullOrNil(paramString)))
      super.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(117472);
  }

  public final <T extends j> T af(Class<T> paramClass)
  {
    AppMethodBeat.i(117477);
    if (paramClass.isInstance(this))
    {
      AppMethodBeat.o(117477);
      paramClass = this;
    }
    while (true)
    {
      return paramClass;
      paramClass = null;
      AppMethodBeat.o(117477);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(117476);
    this.mDestroyed = true;
    super.destroy();
    AppMethodBeat.o(117476);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(117473);
    if (!this.ifl)
    {
      this.ifl = true;
      loadDataWithBaseURL("https://servicewechat.com/js-engine", "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
    }
    while (true)
    {
      synchronized (this.ifm)
      {
        if (!this.ifn)
        {
          LinkedList localLinkedList2 = this.ifm;
          Pair localPair = new android/util/Pair;
          localPair.<init>(paramString, paramValueCallback);
          localLinkedList2.add(localPair);
          AppMethodBeat.o(117473);
          return;
        }
        if (this.mDestroyed)
          break label143;
        paramString = new w.1(this, paramString, paramValueCallback);
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
          paramString.run();
          AppMethodBeat.o(117473);
        }
      }
      this.mHandler.post(paramString);
      label143: AppMethodBeat.o(117473);
    }
  }

  public final void setJsExceptionHandler(h paramh)
  {
  }

  public final void setJsRuntimeTitle(String paramString)
  {
    AppMethodBeat.i(117478);
    evaluateJavascript("document.title=\"" + paramString + "\"", null);
    AppMethodBeat.o(117478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.w
 * JD-Core Version:    0.6.2
 */