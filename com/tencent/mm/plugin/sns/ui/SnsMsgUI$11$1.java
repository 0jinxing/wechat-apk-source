package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.k;

final class SnsMsgUI$11$1
  implements DialogInterface.OnClickListener
{
  SnsMsgUI$11$1(SnsMsgUI.11 param11)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39076);
    SnsMsgUI.c(this.rue.rub).setVisibility(8);
    SnsMsgUI.d(this.rue.rub).setVisibility(0);
    af.cnK().fni.hY("SnsComment", "delete from SnsComment");
    this.rue.rub.enableOptionMenu(false);
    AppMethodBeat.o(39076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.11.1
 * JD-Core Version:    0.6.2
 */