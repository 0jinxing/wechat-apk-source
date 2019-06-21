package com.tencent.mm.plugin.webview.ui.tools.bag;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class o
  implements InvocationHandler
{
  private boolean mEnable;
  private n uzP;
  private h uzQ;

  private o()
  {
    AppMethodBeat.i(8271);
    this.uzQ = new o.1(this);
    AppMethodBeat.o(8271);
  }

  private o(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(8272);
    this.uzQ = new o.1(this);
    this.mEnable = paramBoolean;
    if (paramBoolean)
      this.uzP = new n(paramg);
    AppMethodBeat.o(8272);
  }

  public static h a(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(8270);
    paramg = new o(paramg, paramBoolean);
    paramg = (h)Proxy.newProxyInstance(o.class.getClassLoader(), new Class[] { h.class }, paramg);
    AppMethodBeat.o(8270);
    return paramg;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(8273);
    if (!this.mEnable);
    while (true)
    {
      try
      {
        paramObject = paramMethod.invoke(this.uzQ, paramArrayOfObject);
        AppMethodBeat.o(8273);
        return paramObject;
      }
      catch (InvocationTargetException paramObject)
      {
        ab.i("MicroMsg.WebViewUIBagHelperProxy", "not enable mEmptyHelper invoke e:%s", new Object[] { paramObject });
        paramObject = paramObject.getCause();
        AppMethodBeat.o(8273);
        throw paramObject;
      }
      try
      {
        paramObject = paramMethod.invoke(this.uzP, paramArrayOfObject);
        AppMethodBeat.o(8273);
      }
      catch (InvocationTargetException paramObject)
      {
        ab.i("MicroMsg.WebViewUIBagHelperProxy", "mWebViewUIBagHelper invoke e:%s", new Object[] { paramObject });
        paramObject = paramObject.getCause();
        AppMethodBeat.o(8273);
      }
    }
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.o
 * JD-Core Version:    0.6.2
 */