package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.c;
import com.tencent.mm.plugin.ipcall.e;
import com.tencent.mm.plugin.voip.b;
import com.tencent.mm.plugin.voip.ui.d;
import com.tencent.mm.sdk.platformtools.ah;

final class j$8
  implements View.OnClickListener
{
  j$8(j paramj)
  {
  }

  public final void onClick(View arg1)
  {
    AppMethodBeat.i(22406);
    c localc = i.bHv();
    synchronized (localc.meM)
    {
      if (i.bHu().bHk())
      {
        if (localc.nvf)
        {
          localc.bGS();
          AppMethodBeat.o(22406);
          return;
        }
        localc.nvf = true;
        Toast.makeText(ah.getContext(), 2131301555, 0).show();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setFlags(268435456);
        localIntent.setClass(ah.getContext(), IPCallTalkUI.class);
        localIntent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
        b.cIk().a(localIntent, localc.nvg);
        localc.bGS();
        if (localc.nuX != null)
          localc.nuX.bGZ();
      }
      AppMethodBeat.o(22406);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.j.8
 * JD-Core Version:    0.6.2
 */