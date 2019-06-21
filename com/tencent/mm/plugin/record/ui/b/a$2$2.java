package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.n.d;
import java.util.Map;

final class a$2$2
  implements n.d
{
  a$2$2(a.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24338);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(24338);
      Object localObject;
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Ksnsupload_type", 0);
        paramMenuItem.putExtra("sns_kemdia_path", a.2.d(this.pKX));
        localObject = v.nW("fav_");
        v.Zp().y((String)localObject, true).j("prePublishId", "fav_");
        paramMenuItem.putExtra("reportSessionId", (String)localObject);
        d.b(a.2.c(this.pKX), "sns", ".ui.SnsUploadUI", paramMenuItem);
        AppMethodBeat.o(24338);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Retr_File_Name", a.2.d(this.pKX));
        paramMenuItem.putExtra("Retr_Compress_Type", 0);
        paramMenuItem.putExtra("Retr_Msg_Type", 0);
        d.f(a.2.c(this.pKX), ".ui.transmit.MsgRetransmitUI", paramMenuItem);
        AppMethodBeat.o(24338);
        continue;
        if (q.a(a.2.d(this.pKX), a.2.c(this.pKX), 2131298807))
          break;
        Toast.makeText(a.2.c(this.pKX), a.2.c(this.pKX).getString(2131299726), 1).show();
        AppMethodBeat.o(24338);
      }
      paramMenuItem = (nr)this.pKX.pKU.mim.get(a.2.d(this.pKX));
      if (paramMenuItem != null)
      {
        localObject = new cf();
        ((cf)localObject).cvm.activity = ((Activity)a.2.c(this.pKX));
        ((cf)localObject).cvm.ctB = paramMenuItem.cJX.result;
        ((cf)localObject).cvm.cvn = paramMenuItem.cJX.cvn;
        ((cf)localObject).cvm.cvo = paramMenuItem.cJX.cvo;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a.2.2
 * JD-Core Version:    0.6.2
 */