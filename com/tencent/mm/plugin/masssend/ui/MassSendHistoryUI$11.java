package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MassSendHistoryUI$11
  implements View.OnClickListener
{
  MassSendHistoryUI$11(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22804);
    paramView = new Intent(this.ooZ, MassSendSelectContactUI.class);
    this.ooZ.startActivity(paramView);
    AppMethodBeat.o(22804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.11
 * JD-Core Version:    0.6.2
 */