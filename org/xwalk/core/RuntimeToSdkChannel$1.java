package org.xwalk.core;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RuntimeToSdkChannel$1
  implements ValueCallback
{
  public final void onReceiveValue(Object paramObject)
  {
    AppMethodBeat.i(85522);
    if ((paramObject == null) || (!(paramObject instanceof Object[])))
      AppMethodBeat.o(85522);
    while (true)
    {
      return;
      paramObject = (Object[])paramObject;
      if (paramObject.length < 3)
      {
        AppMethodBeat.o(85522);
      }
      else if (!(paramObject[0] instanceof String))
      {
        AppMethodBeat.o(85522);
      }
      else
      {
        paramObject[2] = RuntimeToSdkChannel.onRuntimeCalled((String)paramObject[0], paramObject[1]);
        AppMethodBeat.o(85522);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.RuntimeToSdkChannel.1
 * JD-Core Version:    0.6.2
 */