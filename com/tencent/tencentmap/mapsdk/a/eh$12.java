package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;

class eh$12
  implements aj.a
{
  eh$12(eh parameh, CancelableCallback paramCancelableCallback)
  {
  }

  public void a()
  {
    AppMethodBeat.i(101480);
    if (this.a != null)
      this.a.onFinish();
    AppMethodBeat.o(101480);
  }

  public void b()
  {
    AppMethodBeat.i(101481);
    if (this.a != null)
      this.a.onCancel();
    AppMethodBeat.o(101481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.12
 * JD-Core Version:    0.6.2
 */