package com.tencent.mm.plugin.kitchen.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;
import java.util.ArrayList;

final class KvInfoUI$2$1
  implements b.a
{
  KvInfoUI$2$1(KvInfoUI.2 param2, b paramb, ArrayList paramArrayList)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(114441);
    this.jqm.hide();
    int i = this.jqm.dLl();
    paramObject = (String)this.nHl.get(i);
    KvInfoUI.a(this.nHm.nHk, paramObject);
    AppMethodBeat.o(114441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.2.1
 * JD-Core Version:    0.6.2
 */