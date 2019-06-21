package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd extends DialogRedirect
{
  zzd(Intent paramIntent, LifecycleFragment paramLifecycleFragment, int paramInt)
  {
  }

  public final void redirect()
  {
    AppMethodBeat.i(61403);
    if (this.zzsh != null)
      this.zzsi.startActivityForResult(this.zzsh, this.val$requestCode);
    AppMethodBeat.o(61403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzd
 * JD-Core Version:    0.6.2
 */