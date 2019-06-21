package com.tencent.mm.z.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.b.b.a;
import com.tencent.mm.z.b.d;

final class c$1
  implements b.a
{
  c$1(c paramc, int paramInt)
  {
  }

  public final void au(Object paramObject)
  {
    AppMethodBeat.i(115302);
    e locale = this.eIm.eIh.eIn;
    int i = this.eIl;
    if (paramObject == null);
    for (paramObject = ""; ; paramObject = paramObject.toString())
    {
      Object localObject = paramObject;
      if (bo.isNullOrNil(paramObject))
        localObject = "{}";
      locale.eIt.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(i), localObject }), null);
      AppMethodBeat.o(115302);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.c.1
 * JD-Core Version:    0.6.2
 */