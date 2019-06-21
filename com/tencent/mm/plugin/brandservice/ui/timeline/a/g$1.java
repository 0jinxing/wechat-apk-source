package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.f;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView;
import com.tencent.mm.storage.q;

final class g$1
  implements DialogInterface.OnClickListener
{
  g$1(g paramg, q paramq)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(14264);
    bf.fm(this.jPI.field_msgId);
    this.jPJ.jPm.jNy.d(this.jPI, 3);
    this.jPJ.jPm.jNo.d(this.jPI);
    AppMethodBeat.o(14264);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.g.1
 * JD-Core Version:    0.6.2
 */