package com.tencent.mm.plugin.mall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class MallIndexBaseUI$2$1
  implements DialogInterface.OnClickListener
{
  MallIndexBaseUI$2$1(MallIndexBaseUI.2 param2, MallFunction paramMallFunction, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(43166);
    String str1 = this.omH.pFP;
    String str2;
    if (!bo.isNullOrNil(str1))
    {
      g.RQ();
      str2 = (String)g.RP().Ry().get(ac.a.xMB, null);
      if (!bo.isNullOrNil(str2))
        break label98;
    }
    for (paramDialogInterface = str1; ; paramDialogInterface = str1)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xMB, paramDialogInterface);
      this.omJ.omG.a(this.omH, this.omI);
      AppMethodBeat.o(43166);
      return;
      label98: paramDialogInterface = str2.split(",");
      if ((paramDialogInterface != null) && (paramDialogInterface.length != 0))
        break;
    }
    for (int j = 0; ; j++)
    {
      paramInt = i;
      if (j < paramDialogInterface.length)
      {
        if (paramDialogInterface[j].equals(str1))
          paramInt = 1;
      }
      else
      {
        paramDialogInterface = str2;
        if (paramInt != 0)
          break;
        paramDialogInterface = str2 + "," + str1;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexBaseUI.2.1
 * JD-Core Version:    0.6.2
 */