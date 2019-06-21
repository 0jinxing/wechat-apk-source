package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.ui.base.b;

final class u$6
  implements DialogInterface.OnClickListener
{
  u$6(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29600);
    if (this.ymY != null)
    {
      this.ghG.finish();
      this.ghG.startActivity(this.ymY);
      b.K(this.ghG, this.ymY);
      w.cn(this.ghG);
    }
    AppMethodBeat.o(29600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.6
 * JD-Core Version:    0.6.2
 */