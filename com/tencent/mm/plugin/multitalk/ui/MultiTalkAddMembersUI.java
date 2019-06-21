package com.tencent.mm.plugin.multitalk.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.ui.widget.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;

public class MultiTalkAddMembersUI extends MultiTalkSelectContactUI
{
  public final void initView()
  {
    AppMethodBeat.i(54117);
    super.initView();
    this.opo.setBackgroundResource(2131689924);
    MultiSelectContactView localMultiSelectContactView = this.opo;
    int i = b.oIc;
    localMultiSelectContactView.setPadding(i, i, b.oIc, 0);
    AppMethodBeat.o(54117);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkAddMembersUI
 * JD-Core Version:    0.6.2
 */