package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public final class s
{
  public d.c oxa;
  SparseArray<WeakReference<d.b>> oxb;
  private ak oxc;

  public s()
  {
    AppMethodBeat.i(76689);
    this.oxa = d.c.ovE;
    this.oxb = new SparseArray();
    this.oxc = new s.1(this, Looper.getMainLooper());
    AppMethodBeat.o(76689);
  }

  public final void a(d.c paramc)
  {
    AppMethodBeat.i(76690);
    ab.i("MicroMsg.SightMediaStatusHandler", "status change to %s", new Object[] { paramc.toString() });
    this.oxa = paramc;
    this.oxc.sendMessage(this.oxc.obtainMessage(257, paramc));
    AppMethodBeat.o(76690);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.s
 * JD-Core Version:    0.6.2
 */