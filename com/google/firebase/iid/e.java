package com.google.firebase.iid;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e extends c<Bundle>
{
  e(int paramInt, Bundle paramBundle)
  {
    super(paramInt, 1, paramBundle);
  }

  final void zzb(Bundle paramBundle)
  {
    AppMethodBeat.i(108715);
    Bundle localBundle = paramBundle.getBundle("data");
    paramBundle = localBundle;
    if (localBundle == null)
      paramBundle = Bundle.EMPTY;
    p(paramBundle);
    AppMethodBeat.o(108715);
  }

  final boolean zzw()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.e
 * JD-Core Version:    0.6.2
 */