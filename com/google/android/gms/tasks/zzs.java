package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzs
  implements OnTokenCanceledListener
{
  zzs(TaskCompletionSource paramTaskCompletionSource)
  {
  }

  public final void onCanceled()
  {
    AppMethodBeat.i(57411);
    TaskCompletionSource.zza(this.zzagc).zzdp();
    AppMethodBeat.o(57411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzs
 * JD-Core Version:    0.6.2
 */