package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;

class eh$10
  implements aj.a
{
  eh$10(eh parameh, CancelableCallback paramCancelableCallback)
  {
  }

  public void a()
  {
    AppMethodBeat.i(101476);
    if (this.a != null)
      this.a.onFinish();
    AppMethodBeat.o(101476);
  }

  public void b()
  {
    AppMethodBeat.i(101477);
    this.a.onCancel();
    AppMethodBeat.o(101477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.10
 * JD-Core Version:    0.6.2
 */