package com.tencent.mm.plugin.ipcall.ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class e$6
  implements Runnable
{
  e$6(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22038);
    aw.ZK();
    String str2;
    if (((Boolean)c.Ry().get(ac.a.xLr, Boolean.FALSE)).booleanValue())
    {
      this.nBc.nBb.setVisibility(0);
      aw.ZK();
      String str1 = (String)c.Ry().get(ac.a.xLt, "");
      aw.ZK();
      str2 = (String)c.Ry().get(ac.a.xLu, "");
      if (bo.isNullOrNil(str1))
        break label131;
      this.nBc.nBa.setText(str1);
      this.nBc.nAZ.setVisibility(0);
      AppMethodBeat.o(22038);
    }
    while (true)
    {
      return;
      this.nBc.nBb.setVisibility(8);
      break;
      label131: if (!bo.isNullOrNil(str2))
      {
        this.nBc.nBa.setText(str2);
        this.nBc.nAZ.setVisibility(0);
        AppMethodBeat.o(22038);
      }
      else
      {
        this.nBc.nBa.setText("");
        this.nBc.nAZ.setVisibility(8);
        AppMethodBeat.o(22038);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.6
 * JD-Core Version:    0.6.2
 */