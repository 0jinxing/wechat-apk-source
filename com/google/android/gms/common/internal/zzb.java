package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzb extends DialogRedirect
{
  zzb(Intent paramIntent, Activity paramActivity, int paramInt)
  {
  }

  public final void redirect()
  {
    AppMethodBeat.i(61401);
    if (this.zzsh != null)
      this.val$activity.startActivityForResult(this.zzsh, this.val$requestCode);
    AppMethodBeat.o(61401);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzb
 * JD-Core Version:    0.6.2
 */