package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.ai;
import com.tencent.mm.plugin.qqmail.b.u;
import com.tencent.mm.plugin.qqmail.b.v;
import java.util.Map;

final class b$3$1
  implements DialogInterface.OnClickListener
{
  b$3$1(b.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(68284);
    b localb;
    if ((this.pyb.pxZ.state == 0) || (this.pyb.pxZ.state == 1))
    {
      localb = this.pyb.pxY;
      paramDialogInterface = this.pyb.pxZ;
      if (localb.mode != 5)
        break label206;
      ac.ccC().cancel(paramDialogInterface.pvG);
    }
    while (true)
    {
      this.pyb.pxY.pxR.remove(this.pyb.pxZ.path);
      this.pyb.pxY.pxS.remove(this.pyb.pxZ.path);
      this.pyb.pxY.pxT.remove(this.pyb.pxZ.path);
      this.pyb.pxY.pxU.remove(this.pyb.pxZ.path);
      this.pyb.pxY.pxQ.removeView(this.pyb.pya);
      this.pyb.pxY.cdd();
      AppMethodBeat.o(68284);
      return;
      label206: if (localb.mode == 6)
      {
        u localu = (u)localb.pxS.get(paramDialogInterface.path);
        if (localu != null)
          g.RO().eJo.c(localu);
        localb.pxT.remove(paramDialogInterface.path);
        localb.pxU.remove(paramDialogInterface.path);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.b.3.1
 * JD-Core Version:    0.6.2
 */