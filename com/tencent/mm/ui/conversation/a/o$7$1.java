package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import java.lang.ref.WeakReference;

final class o$7$1
  implements DialogInterface.OnClickListener
{
  o$7$1(o.7 param7)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34716);
    try
    {
      this.zxi.zxg.jAp.setVisibility(8);
      this.zxi.zxg.zxf = true;
      at.startSettingItent((Context)this.zxi.zxg.vlu.get(), this.zxi.bVv);
      AppMethodBeat.o(34716);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetWarnView", paramDialogInterface, "", new Object[0]);
        AppMethodBeat.o(34716);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o.7.1
 * JD-Core Version:    0.6.2
 */