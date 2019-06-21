package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.c;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.storage.q;

public final class f$2
  implements e.a
{
  public f$2(f paramf, b paramb, p paramp, q paramq, int paramInt)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14258);
    this.jPD.a(this.jPE, this.jEl, this.jPF, true);
    this.jPC.jPm.jNp.m(this.jEl.field_msgId, this.jPF);
    AppMethodBeat.o(14258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.f.2
 * JD-Core Version:    0.6.2
 */