package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.subapp.c.e;
import com.tencent.mm.protocal.protobuf.coc;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.LinkedList;

final class ao$4$1
  implements DialogInterface.OnClickListener
{
  ao$4$1(ao.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33388);
    aw.Rg().a(331, ao.a(this.zhP.zhM, new ao.4.1.1(this)));
    Object localObject = new LinkedList();
    paramDialogInterface = new coc();
    paramDialogInterface.vFI = this.zhP.zhO.ssZ;
    ((LinkedList)localObject).add(paramDialogInterface);
    localObject = new com.tencent.mm.plugin.subapp.c.a((LinkedList)localObject, ((LinkedList)localObject).size());
    aw.Rg().a((m)localObject, 0);
    paramDialogInterface = this.zhP.zhM;
    Activity localActivity = ao.a(this.zhP.zhM).yTx.getContext();
    ao.a(this.zhP.zhM).yTx.getMMResources().getString(2131297061);
    ao.a(paramDialogInterface, h.b(localActivity, ao.a(this.zhP.zhM).yTx.getMMResources().getString(2131298143), true, new ao.4.1.2(this, (com.tencent.mm.plugin.subapp.c.a)localObject)));
    AppMethodBeat.o(33388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao.4.1
 * JD-Core Version:    0.6.2
 */