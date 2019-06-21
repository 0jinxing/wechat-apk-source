package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;

final class ComposeUI$8$1
  implements h.c
{
  ComposeUI$8$1(ComposeUI.8 param8)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(68175);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(68175);
      while (true)
      {
        return;
        boolean bool = b.a(this.pxb.pwY.mController.ylL, "android.permission.CAMERA", 16, "", "");
        ab.i("MicroMsg.ComposeUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.pxb.pwY.mController.ylL });
        if (!bool)
        {
          AppMethodBeat.o(68175);
        }
        else
        {
          ComposeUI.C(this.pxb.pwY);
          AppMethodBeat.o(68175);
          continue;
          n.a(this.pxb.pwY, 4, null);
          AppMethodBeat.o(68175);
        }
      }
      Intent localIntent = new Intent(this.pxb.pwY, FileExplorerUI.class);
      this.pxb.pwY.startActivityForResult(localIntent, 5);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.8.1
 * JD-Core Version:    0.6.2
 */