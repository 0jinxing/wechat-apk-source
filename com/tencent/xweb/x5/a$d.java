package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$d<T>
  implements com.tencent.smtt.sdk.ValueCallback<T>
{
  android.webkit.ValueCallback<T> AQo;

  public a$d(android.webkit.ValueCallback<T> paramValueCallback)
  {
    this.AQo = paramValueCallback;
  }

  public final void onReceiveValue(T paramT)
  {
    AppMethodBeat.i(84781);
    if (this.AQo != null)
      this.AQo.onReceiveValue(paramT);
    AppMethodBeat.o(84781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a.d
 * JD-Core Version:    0.6.2
 */