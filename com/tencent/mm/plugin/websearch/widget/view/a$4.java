package com.tencent.mm.plugin.websearch.widget.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.d.a;
import java.util.Map;

public final class a$4
  implements d.a
{
  public a$4(a parama, x paramx, int paramInt)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(91476);
    ab.v("FTSSearchActionSheetMgr", "selected pos %d", new Object[] { Integer.valueOf(-1) });
    if (this.udE != null)
      this.udE.go(-1, this.val$id);
    a.b(this.udD).remove(Integer.valueOf(this.val$id));
    AppMethodBeat.o(91476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.a.4
 * JD-Core Version:    0.6.2
 */