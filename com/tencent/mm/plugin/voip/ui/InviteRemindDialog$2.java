package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InviteRemindDialog$2
  implements View.OnClickListener
{
  InviteRemindDialog$2(InviteRemindDialog paramInviteRemindDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4771);
    this.sVP.finish();
    AppMethodBeat.o(4771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.InviteRemindDialog.2
 * JD-Core Version:    0.6.2
 */