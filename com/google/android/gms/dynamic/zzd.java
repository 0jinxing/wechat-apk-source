package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd
  implements DeferredLifecycleHelper.zza
{
  zzd(DeferredLifecycleHelper paramDeferredLifecycleHelper, FrameLayout paramFrameLayout, LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
  }

  public final int getState()
  {
    return 2;
  }

  public final void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    AppMethodBeat.i(61638);
    this.zzabj.removeAllViews();
    this.zzabj.addView(DeferredLifecycleHelper.zzb(this.zzabg).onCreateView(this.zzabk, this.val$container, this.zzabi));
    AppMethodBeat.o(61638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzd
 * JD-Core Version:    0.6.2
 */