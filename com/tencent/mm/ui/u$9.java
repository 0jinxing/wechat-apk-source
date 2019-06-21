package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.z;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.base.b;

final class u$9
  implements DialogInterface.OnClickListener
{
  u$9(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29603);
    if (this.ymY != null)
    {
      if (!(this.ghG instanceof LauncherUI))
        this.ghG.finish();
      this.ghG.startActivity(this.ymY);
      b.K(this.ghG, this.ymY);
      w.cn(this.ghG);
      paramDialogInterface = new z();
      paramDialogInterface.csU.csV = true;
      a.xxA.m(paramDialogInterface);
    }
    AppMethodBeat.o(29603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.9
 * JD-Core Version:    0.6.2
 */