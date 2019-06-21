package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class RecordMsgDetailUI$3$1
  implements n.c
{
  RecordMsgDetailUI$3$1(RecordMsgDetailUI.3 param3)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(24236);
    paraml.e(0, this.pKE.pKD.getString(2131299734));
    if (this.pKE.pKD.getIntent().getIntExtra("from_scene", 0) == 0)
      paraml.e(2, this.pKE.pKD.getString(2131301955));
    AppMethodBeat.o(24236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.3.1
 * JD-Core Version:    0.6.2
 */