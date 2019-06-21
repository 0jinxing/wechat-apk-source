package com.google.firebase.iid;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends c<Void>
{
  public b(int paramInt, Bundle paramBundle)
  {
    super(paramInt, 2, paramBundle);
  }

  final void zzb(Bundle paramBundle)
  {
    AppMethodBeat.i(108714);
    if (paramBundle.getBoolean("ack", false))
    {
      p(null);
      AppMethodBeat.o(108714);
    }
    while (true)
    {
      return;
      a(new d(4, "Invalid response to one way request"));
      AppMethodBeat.o(108714);
    }
  }

  final boolean zzw()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.b
 * JD-Core Version:    0.6.2
 */