package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzp extends zzq
{
  zzp(zzo paramzzo)
  {
  }

  public final void zzd(boolean paramBoolean)
  {
    AppMethodBeat.i(77142);
    zzo localzzo = this.zzai;
    if (paramBoolean);
    for (Status localStatus = Status.RESULT_SUCCESS; ; localStatus = zzk.zzf())
    {
      localzzo.setResult(new zzt(localStatus));
      AppMethodBeat.o(77142);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzp
 * JD-Core Version:    0.6.2
 */