package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;

class eh$11
  implements aj.a
{
  eh$11(eh parameh, CancelableCallback paramCancelableCallback)
  {
  }

  public void a()
  {
    AppMethodBeat.i(101478);
    if (this.a != null)
      this.a.onFinish();
    AppMethodBeat.o(101478);
  }

  public void b()
  {
    AppMethodBeat.i(101479);
    if (this.a != null)
      this.a.onCancel();
    AppMethodBeat.o(101479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.11
 * JD-Core Version:    0.6.2
 */