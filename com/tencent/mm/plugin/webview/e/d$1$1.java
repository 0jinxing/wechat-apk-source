package com.tencent.mm.plugin.webview.e;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import org.json.JSONObject;

final class d$1$1
  implements MessageQueue.IdleHandler
{
  d$1$1(d.1 param1, String paramString)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(10142);
    Looper.myQueue().removeIdleHandler(this);
    long l1 = System.currentTimeMillis();
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.upB.substring(1, this.upB.length() - 1).replace("\\\"", "\""));
      JSONObject localJSONObject = ((JSONObject)localObject).optJSONObject("timing");
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        long l2 = localJSONObject.optLong((String)localObject);
        this.uKY.uKX.aI((String)localObject, l2);
      }
    }
    catch (Exception localException)
    {
      ab.w("MicroMsg.WebViewPerformanceHelper", "fetchDocumentTime ex: %s", new Object[] { localException.getMessage() });
      this.uKY.uKX.ddc();
      ab.v("MicroMsg.WebViewPerformanceHelper", "onReceiveValue cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      AppMethodBeat.o(10142);
    }
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.d.1.1
 * JD-Core Version:    0.6.2
 */