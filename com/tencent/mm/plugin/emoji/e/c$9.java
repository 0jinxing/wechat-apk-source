package com.tencent.mm.plugin.emoji.e;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.cv.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class c$9 extends com.tencent.mm.sdk.b.c<cv>
{
  c$9(c paramc)
  {
    AppMethodBeat.i(52843);
    this.xxI = cv.class.getName().hashCode();
    AppMethodBeat.o(52843);
  }

  private static boolean a(cv paramcv)
  {
    AppMethodBeat.i(52844);
    if ((paramcv != null) && ((paramcv instanceof cv)))
    {
      boolean bool = paramcv.cvX.enable;
      g.RP().Ry().set(ac.a.xJt, Boolean.valueOf(bool));
      j.bkm().kUC = bool;
      if (bool)
        break label95;
      h.pYm.e(12953, new Object[] { Integer.valueOf(2), "" });
      Toast.makeText(ah.getContext(), 2131299037, 0).show();
    }
    while (true)
    {
      AppMethodBeat.o(52844);
      return false;
      label95: Toast.makeText(ah.getContext(), 2131299039, 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.c.9
 * JD-Core Version:    0.6.2
 */