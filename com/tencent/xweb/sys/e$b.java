package com.tencent.xweb.sys;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class e$b
{
  HashMap<String, ValueCallback<String>> AQd;
  int AQe;

  public e$b()
  {
    AppMethodBeat.i(84699);
    this.AQd = new HashMap();
    this.AQe = 0;
    AppMethodBeat.o(84699);
  }

  @JavascriptInterface
  public final void notifyJava(String paramString1, String paramString2)
  {
    AppMethodBeat.i(84700);
    ValueCallback localValueCallback = (ValueCallback)this.AQd.get(paramString1);
    if (localValueCallback != null)
    {
      localValueCallback.onReceiveValue(paramString2);
      this.AQd.remove(paramString1);
    }
    AppMethodBeat.o(84700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.e.b
 * JD-Core Version:    0.6.2
 */