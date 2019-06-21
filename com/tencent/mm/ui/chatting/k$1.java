package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.List;

final class k$1
  implements DialogInterface.OnClickListener
{
  k$1(List paramList, ah paramah, Context paramContext, boolean paramBoolean, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30574);
    paramDialogInterface = this.yII;
    if ((paramDialogInterface == null) || (paramDialogInterface.isEmpty()))
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to friend msg error, select item empty");
      break label77;
      label31: paramInt = 1;
      label33: if (paramInt == 0)
        break label189;
      ab.w("MicroMsg.ChattingEditModeRetransmitMsg", "only contain invalid msg, exit long click mode");
      if (this.yIJ != null)
        this.yIJ.b(ah.a.yLP);
      AppMethodBeat.o(30574);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramDialogInterface.iterator();
      label77: if (!localIterator.hasNext())
        break label31;
      paramDialogInterface = (bi)localIterator.next();
      if (j.aA(paramDialogInterface))
        break label31;
      if ((paramDialogInterface.drD()) || (j.av(paramDialogInterface)) || (j.ax(paramDialogInterface)) || (j.aG(paramDialogInterface)) || (j.ay(paramDialogInterface)) || (paramDialogInterface.getType() == -1879048186) || (j.aF(paramDialogInterface)) || (j.az(paramDialogInterface)) || (j.aE(paramDialogInterface)) || (j.aA(paramDialogInterface)) || (paramDialogInterface.getType() == 318767153))
        break;
      paramInt = 0;
      break label33;
      label189: k.c(this.val$context, this.yII, this.yIK, this.yIL, this.yIJ);
      AppMethodBeat.o(30574);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.1
 * JD-Core Version:    0.6.2
 */