package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class MMSuperAlert$1
  implements Runnable
{
  MMSuperAlert$1(MMSuperAlert paramMMSuperAlert, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4782);
    String str1;
    if (this.sVS == 0)
    {
      str1 = "";
      if (this.sVT != 0)
        break label78;
    }
    label78: for (String str2 = ""; ; str2 = this.sVV.getString(this.sVT))
    {
      h.a(this.sVV, str1, str2, this.sVU, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(4780);
          MMSuperAlert.1.this.sVV.finish();
          AppMethodBeat.o(4780);
        }
      }
      , new MMSuperAlert.1.2(this));
      AppMethodBeat.o(4782);
      return;
      str1 = this.sVV.getString(this.sVS);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.MMSuperAlert.1
 * JD-Core Version:    0.6.2
 */