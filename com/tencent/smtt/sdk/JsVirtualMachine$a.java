package com.tencent.smtt.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.net.URL;

class JsVirtualMachine$a
  implements IX5JsContext
{
  private WebView a;

  public JsVirtualMachine$a(Context paramContext)
  {
    AppMethodBeat.i(63961);
    this.a = new WebView(paramContext);
    this.a.getSettings().setJavaScriptEnabled(true);
    AppMethodBeat.o(63961);
  }

  public void a()
  {
    AppMethodBeat.i(63962);
    if (this.a == null)
      AppMethodBeat.o(63962);
    while (true)
    {
      return;
      this.a.onPause();
      AppMethodBeat.o(63962);
    }
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(63964);
    if (this.a == null)
      AppMethodBeat.o(63964);
    while (true)
    {
      return;
      this.a.addJavascriptInterface(paramObject, paramString);
      this.a.loadUrl("about:blank");
      AppMethodBeat.o(63964);
    }
  }

  public void b()
  {
    AppMethodBeat.i(63963);
    if (this.a == null)
      AppMethodBeat.o(63963);
    while (true)
    {
      return;
      this.a.onResume();
      AppMethodBeat.o(63963);
    }
  }

  public void destroy()
  {
    AppMethodBeat.i(63965);
    if (this.a == null)
      AppMethodBeat.o(63965);
    while (true)
    {
      return;
      this.a.clearHistory();
      this.a.clearCache(true);
      this.a.loadUrl("about:blank");
      this.a.freeMemory();
      this.a.pauseTimers();
      this.a.destroy();
      this.a = null;
      AppMethodBeat.o(63965);
    }
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(63966);
    if (this.a == null)
    {
      AppMethodBeat.o(63966);
      return;
    }
    paramURL = this.a;
    if (paramValueCallback == null);
    for (paramValueCallback = null; ; paramValueCallback = new e(this, paramValueCallback))
    {
      paramURL.evaluateJavascript(paramString, paramValueCallback);
      AppMethodBeat.o(63966);
      break;
    }
  }

  public IX5JsValue evaluateScript(String paramString, URL paramURL)
  {
    AppMethodBeat.i(63967);
    if (this.a == null)
      AppMethodBeat.o(63967);
    while (true)
    {
      return null;
      this.a.evaluateJavascript(paramString, null);
      AppMethodBeat.o(63967);
    }
  }

  public void evaluateScriptAsync(String paramString, ValueCallback<IX5JsValue> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(63968);
    if (this.a == null)
    {
      AppMethodBeat.o(63968);
      return;
    }
    paramURL = this.a;
    if (paramValueCallback == null);
    for (paramValueCallback = null; ; paramValueCallback = new f(this, paramValueCallback))
    {
      paramURL.evaluateJavascript(paramString, paramValueCallback);
      AppMethodBeat.o(63968);
      break;
    }
  }

  public void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(63969);
    if (this.a == null)
      AppMethodBeat.o(63969);
    while (true)
    {
      return;
      this.a.removeJavascriptInterface(paramString);
      AppMethodBeat.o(63969);
    }
  }

  public void setExceptionHandler(ValueCallback<IX5JsError> paramValueCallback)
  {
  }

  public void setName(String paramString)
  {
  }

  public void setPerContextData(Object paramObject)
  {
  }

  public void stealValueFromOtherCtx(String paramString1, IX5JsContext paramIX5JsContext, String paramString2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.JsVirtualMachine.a
 * JD-Core Version:    0.6.2
 */