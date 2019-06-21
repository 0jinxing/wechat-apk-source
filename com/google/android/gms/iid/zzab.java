package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzab extends zzz<Bundle>
{
  zzab(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, 1, paramBundle);
  }

  final void zzh(Bundle paramBundle)
  {
    AppMethodBeat.i(57528);
    Object localObject = paramBundle.getBundle("data");
    paramBundle = (Bundle)localObject;
    if (localObject == null)
      paramBundle = Bundle.EMPTY;
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str = String.valueOf(this);
      localObject = String.valueOf(paramBundle);
      new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(localObject).length()).append("Finishing ").append(str).append(" with ").append((String)localObject);
    }
    this.zzcl.setResult(paramBundle);
    AppMethodBeat.o(57528);
  }

  final boolean zzu()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzab
 * JD-Core Version:    0.6.2
 */