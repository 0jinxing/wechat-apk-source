package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.b;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.LinkedList;

final class e$12
  implements DialogInterface.OnClickListener
{
  e$12(e parame, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31256);
    paramDialogInterface = b.alY(this.yOy.cgL.getTalkerUserName()).a(this.yOy.cgL.getTalkerUserName(), this.yOk, this.fwD);
    paramDialogInterface.b(new e.12.1(this));
    paramDialogInterface.c(new e.12.2(this));
    Activity localActivity = this.yOy.cgL.yTx.getContext();
    this.yOy.cgL.yTx.getMMResources().getString(2131297061);
    paramDialogInterface.a(localActivity, this.yOy.cgL.yTx.getMMResources().getString(2131302524), true, new e.12.3(this, paramDialogInterface));
    AppMethodBeat.o(31256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.e.12
 * JD-Core Version:    0.6.2
 */