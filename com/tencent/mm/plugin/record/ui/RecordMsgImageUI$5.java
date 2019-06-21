package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;

final class RecordMsgImageUI$5
  implements MMGestureGallery.c
{
  RecordMsgImageUI$5(RecordMsgImageUI paramRecordMsgImageUI)
  {
  }

  public final void bvE()
  {
    AppMethodBeat.i(24299);
    v.b localb = v.Zp().y("basescanui@datacenter", true);
    localb.j("key_basescanui_screen_x", Integer.valueOf(RecordMsgImageUI.d(this.pKQ).getXDown()));
    localb.j("key_basescanui_screen_y", Integer.valueOf(RecordMsgImageUI.d(this.pKQ).getYDown()));
    RecordMsgImageUI.e(this.pKQ);
    AppMethodBeat.o(24299);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.5
 * JD-Core Version:    0.6.2
 */