package com.tencent.luggage.sdk.launching;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OnWXAppResultXPCWrapper$2
  implements b<R>
{
  OnWXAppResultXPCWrapper$2(OnWXAppResultXPCWrapper paramOnWXAppResultXPCWrapper)
  {
  }

  public final void a(R paramR)
  {
    AppMethodBeat.i(101670);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("parcel", new OnWXAppResultXPCWrapper.SafeParcelableWrapper(paramR));
    OnWXAppResultXPCWrapper.a(this.bRh).send(-1, localBundle);
    AppMethodBeat.o(101670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.2
 * JD-Core Version:    0.6.2
 */