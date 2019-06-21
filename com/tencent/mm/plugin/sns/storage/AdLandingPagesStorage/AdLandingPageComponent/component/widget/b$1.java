package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37410);
    long l = System.currentTimeMillis();
    SightVideoJNI.freeObj(this.val$id);
    ab.d("MicroMsg.SightPlayController", "#0x%x tick: do clear video %d, use %d ms", new Object[] { Integer.valueOf(this.rct.hashCode()), Integer.valueOf(this.val$id), Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(37410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.1
 * JD-Core Version:    0.6.2
 */