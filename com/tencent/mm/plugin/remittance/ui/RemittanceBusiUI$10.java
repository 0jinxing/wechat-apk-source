package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.model.i;
import com.tencent.mm.protocal.protobuf.lv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class RemittanceBusiUI$10
  implements DialogInterface.OnClickListener
{
  RemittanceBusiUI$10(RemittanceBusiUI paramRemittanceBusiUI, m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44902);
    if (bo.gW(((i)this.crb).pOT.vPP, 1))
    {
      paramDialogInterface = e.cfP();
      ab.i("MicroMsg.RemittanceBusiDialogMgr", "finishRemittanceF2fDynamicCodeUI()");
      paramDialogInterface = (Context)paramDialogInterface.bSI.get();
      if (paramDialogInterface != null)
        break label84;
      ab.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
    }
    for (paramInt = 0; ; paramInt = 1)
    {
      if (paramInt != 0)
        ab.w("MicroMsg.RemittanceBusiUI", "finish RemittanceF2fDynamicCodeUI");
      this.pUd.finish();
      AppMethodBeat.o(44902);
      return;
      label84: if (!(paramDialogInterface instanceof RemittanceF2fDynamicCodeUI))
        break;
      ab.w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fDynamicCodeUI");
      ((Activity)paramDialogInterface).finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.10
 * JD-Core Version:    0.6.2
 */