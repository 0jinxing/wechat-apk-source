package com.tencent.smtt.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import java.net.URL;

public final class JsContext
{
  private final JsVirtualMachine a;
  private final IX5JsContext b;
  private JsContext.ExceptionHandler c;
  private String d;

  public JsContext(Context paramContext)
  {
    this(new JsVirtualMachine(paramContext));
    AppMethodBeat.i(63913);
    AppMethodBeat.o(63913);
  }

  public JsContext(JsVirtualMachine paramJsVirtualMachine)
  {
    AppMethodBeat.i(63914);
    if (paramJsVirtualMachine == null)
    {
      paramJsVirtualMachine = new IllegalArgumentException("The virtualMachine value can not be null");
      AppMethodBeat.o(63914);
      throw paramJsVirtualMachine;
    }
    this.a = paramJsVirtualMachine;
    this.b = this.a.a();
    try
    {
      this.b.setPerContextData(this);
      AppMethodBeat.o(63914);
      return;
    }
    catch (AbstractMethodError paramJsVirtualMachine)
    {
      while (true)
        AppMethodBeat.o(63914);
    }
  }

  public static JsContext current()
  {
    AppMethodBeat.i(63926);
    JsContext localJsContext = (JsContext)X5JsCore.a();
    AppMethodBeat.o(63926);
    return localJsContext;
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(63915);
    this.b.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(63915);
  }

  public final void destroy()
  {
    AppMethodBeat.i(63916);
    this.b.destroy();
    AppMethodBeat.o(63916);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(63917);
    evaluateJavascript(paramString, paramValueCallback, null);
    AppMethodBeat.o(63917);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(63918);
    this.b.evaluateJavascript(paramString, paramValueCallback, paramURL);
    AppMethodBeat.o(63918);
  }

  public final JsValue evaluateScript(String paramString)
  {
    AppMethodBeat.i(63919);
    paramString = evaluateScript(paramString, null);
    AppMethodBeat.o(63919);
    return paramString;
  }

  public final JsValue evaluateScript(String paramString, URL paramURL)
  {
    AppMethodBeat.i(63920);
    paramString = this.b.evaluateScript(paramString, paramURL);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(63920);
    }
    while (true)
    {
      return paramString;
      paramString = new JsValue(this, paramString);
      AppMethodBeat.o(63920);
    }
  }

  public final void evaluateScriptAsync(String paramString, ValueCallback<JsValue> paramValueCallback, URL paramURL)
  {
    AppMethodBeat.i(63921);
    if (paramValueCallback == null);
    for (paramValueCallback = null; ; paramValueCallback = new c(this, paramValueCallback))
    {
      this.b.evaluateScriptAsync(paramString, paramValueCallback, paramURL);
      AppMethodBeat.o(63921);
      return;
    }
  }

  public final JsContext.ExceptionHandler exceptionHandler()
  {
    return this.c;
  }

  public final String name()
  {
    return this.d;
  }

  public final void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(63922);
    this.b.removeJavascriptInterface(paramString);
    AppMethodBeat.o(63922);
  }

  public final void setExceptionHandler(JsContext.ExceptionHandler paramExceptionHandler)
  {
    AppMethodBeat.i(63923);
    this.c = paramExceptionHandler;
    if (paramExceptionHandler == null)
    {
      this.b.setExceptionHandler(null);
      AppMethodBeat.o(63923);
    }
    while (true)
    {
      return;
      this.b.setExceptionHandler(new d(this));
      AppMethodBeat.o(63923);
    }
  }

  public final void setName(String paramString)
  {
    AppMethodBeat.i(63924);
    this.d = paramString;
    this.b.setName(paramString);
    AppMethodBeat.o(63924);
  }

  public final void stealValueFromOtherCtx(String paramString1, JsContext paramJsContext, String paramString2)
  {
    AppMethodBeat.i(63925);
    this.b.stealValueFromOtherCtx(paramString1, paramJsContext.b, paramString2);
    AppMethodBeat.o(63925);
  }

  public final JsVirtualMachine virtualMachine()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.JsContext
 * JD-Core Version:    0.6.2
 */