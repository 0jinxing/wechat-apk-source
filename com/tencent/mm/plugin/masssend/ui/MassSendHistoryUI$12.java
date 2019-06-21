package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MassSendHistoryUI$12
  implements View.OnClickListener
{
  MassSendHistoryUI$12(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22805);
    paramView = new Intent(this.ooZ, MassSendSelectContactUI.class);
    this.ooZ.startActivity(paramView);
    AppMethodBeat.o(22805);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.12
 * JD-Core Version:    0.6.2
 */