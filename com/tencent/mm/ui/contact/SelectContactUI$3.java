package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.l;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

final class SelectContactUI$3
  implements Runnable
{
  SelectContactUI$3(SelectContactUI paramSelectContactUI, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33852);
    String str = r.Yz();
    Iterator localIterator = this.zoR.iterator();
    int i = 0;
    Object localObject1 = null;
    if (localIterator.hasNext())
    {
      Object localObject2 = (String)localIterator.next();
      ab.d("MicroMsg.SelectContactUI", "toSend, %s", new Object[] { localObject2 });
      if (t.kH((String)localObject2));
      for (int j = 1; ; j = 0)
      {
        localObject2 = new l(4, str, (String)localObject2, this.zoP.getIntent().getStringExtra("shareImagePath"), 0, null, 0, "", (String)localObject1, true, 2130838182);
        aw.Rg().a((m)localObject2, 0);
        if (((l)localObject2).csG != null)
          localObject1 = ((l)localObject2).csG.field_imgPath;
        i += j;
        break;
      }
    }
    SelectContactUI.f(this.zoP).dismiss();
    localObject1 = new Intent();
    ((Intent)localObject1).putStringArrayListExtra("Select_Contact", this.zoR);
    this.zoP.setResult(-1, (Intent)localObject1);
    h.pYm.e(11048, new Object[] { Integer.valueOf(1), Integer.valueOf(this.zoR.size() - i), Integer.valueOf(i) });
    this.zoP.finish();
    AppMethodBeat.o(33852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.3
 * JD-Core Version:    0.6.2
 */