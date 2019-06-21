package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.p;

final class bc$9$1
  implements ao.b.a
{
  bc$9$1(bc.9 param9)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39870);
    if (this.rDH.rDG.tipDialog != null)
      this.rDH.rDG.tipDialog.dismiss();
    if (!paramBoolean)
    {
      Toast.makeText(this.rDH.rDG.context, this.rDH.rDG.context.getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
      AppMethodBeat.o(39870);
    }
    while (true)
    {
      return;
      b.U(paramString, 3);
      o.acv().pZ(paramString);
      Intent localIntent = new Intent();
      localIntent.addFlags(268435456);
      localIntent.putExtra("Contact_User", paramString);
      localIntent.putExtra("Contact_Scene", 37);
      g.RQ();
      ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
      if ((localad != null) && (localad.dsf()))
      {
        h.pYm.X(10298, paramString + ",37");
        localIntent.putExtra("Contact_Scene", 37);
      }
      a.gkE.c(localIntent, this.rDH.rDG.context);
      AppMethodBeat.o(39870);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.9.1
 * JD-Core Version:    0.6.2
 */