package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.os.Vibrator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.forcenotify.b.c;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ay.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class ForceNotifyShowUI$b
  implements Runnable
{
  ForceNotifyShowUI$b(ForceNotifyShowUI paramForceNotifyShowUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51085);
    Object localObject = c.mtf;
    localObject = this.mtB.dxU();
    j.o(localObject, "context");
    if (!c.isSilentMode((Context)localObject))
      ForceNotifyShowUI.a(this.mtB, ay.a((Context)this.mtB.dxU(), 2131305898, ay.b.xAR, 2, true, null));
    localObject = c.mtf;
    localObject = this.mtB.dxU();
    j.o(localObject, "context");
    if (c.dT((Context)localObject))
    {
      localObject = ForceNotifyShowUI.b(this.mtB);
      if (localObject == null)
        j.dWJ();
      ((Vibrator)localObject).vibrate(new long[] { 1000L, 1000L, 1000L, 1000L }, 0);
    }
    AppMethodBeat.o(51085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.b
 * JD-Core Version:    0.6.2
 */