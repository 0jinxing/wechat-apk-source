package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.ui.base.b;

final class u$10
  implements DialogInterface.OnCancelListener
{
  u$10(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29604);
    if (this.ymY != null)
    {
      if (!(this.ghG instanceof LauncherUI))
        this.ghG.finish();
      this.ghG.startActivity(this.ymY);
      b.K(this.ghG, this.ymY);
      w.cn(this.ghG);
    }
    AppMethodBeat.o(29604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.10
 * JD-Core Version:    0.6.2
 */