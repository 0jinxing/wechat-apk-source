package com.tencent.mm.plugin.scanner.c;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public final class b
  implements LifecycleObserver, a<String, Integer>
{
  private MMActivity hwd;
  private MutableLiveData<Pair<String, Integer>> qiT;

  public b(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(138721);
    this.qiT = new MutableLiveData();
    paramMMActivity.getLifecycle().addObserver(this);
    this.hwd = paramMMActivity;
    AppMethodBeat.o(138721);
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  public final void onDestroy()
  {
    AppMethodBeat.i(138722);
    this.hwd.getLifecycle().removeObserver(this);
    this.hwd = null;
    AppMethodBeat.o(138722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.c.b
 * JD-Core Version:    0.6.2
 */