package com.tencent.xweb.xwalk;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.j;

public final class f$g
  implements j
{
  ValueCallback<Boolean> ARW;

  public f$g(ValueCallback<Boolean> paramValueCallback)
  {
    this.ARW = paramValueCallback;
  }

  public final void cancel()
  {
    AppMethodBeat.i(85228);
    this.ARW.onReceiveValue(Boolean.FALSE);
    AppMethodBeat.o(85228);
  }

  public final void proceed()
  {
    AppMethodBeat.i(85227);
    this.ARW.onReceiveValue(Boolean.TRUE);
    AppMethodBeat.o(85227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f.g
 * JD-Core Version:    0.6.2
 */