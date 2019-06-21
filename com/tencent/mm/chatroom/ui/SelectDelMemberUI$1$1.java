package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SelectDelMemberUI$1$1
  implements DialogInterface.OnClickListener
{
  SelectDelMemberUI$1$1(SelectDelMemberUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104386);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Select_Contact", bo.c(SelectDelMemberUI.a(this.emu.emt), ","));
    this.emu.emt.setResult(-1, paramDialogInterface);
    this.emu.emt.finish();
    AppMethodBeat.o(104386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDelMemberUI.1.1
 * JD-Core Version:    0.6.2
 */