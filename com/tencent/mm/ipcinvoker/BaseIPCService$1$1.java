package com.tencent.mm.ipcinvoker;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.b;

final class BaseIPCService$1$1
  implements Runnable
{
  BaseIPCService$1$1(BaseIPCService.1 param1, a parama, Parcelable paramParcelable, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113997);
    this.eFC.a(this.eFD, new BaseIPCService.a(this.eFE));
    AppMethodBeat.o(113997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.BaseIPCService.1.1
 * JD-Core Version:    0.6.2
 */