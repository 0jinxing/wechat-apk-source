package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzc extends DialogRedirect
{
  zzc(Intent paramIntent, Fragment paramFragment, int paramInt)
  {
  }

  public final void redirect()
  {
    AppMethodBeat.i(61402);
    if (this.zzsh != null)
      this.val$fragment.startActivityForResult(this.zzsh, this.val$requestCode);
    AppMethodBeat.o(61402);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzc
 * JD-Core Version:    0.6.2
 */