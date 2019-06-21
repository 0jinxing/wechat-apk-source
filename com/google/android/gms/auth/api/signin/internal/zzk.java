package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzk extends zzd
{
  zzk(zzj paramzzj)
  {
  }

  public final void zzd(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    AppMethodBeat.i(50446);
    if (paramGoogleSignInAccount != null)
      zzq.zze(this.zzex.val$context).zzd(this.zzex.zzew, paramGoogleSignInAccount);
    this.zzex.setResult(new GoogleSignInResult(paramGoogleSignInAccount, paramStatus));
    AppMethodBeat.o(50446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzk
 * JD-Core Version:    0.6.2
 */