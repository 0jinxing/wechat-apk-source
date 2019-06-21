package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class SnsGalleryUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SnsGalleryUI$3(SnsGalleryUI paramSnsGalleryUI, boolean paramBoolean)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38937);
    Object localObject = this.rrS.rpp.getSelectId();
    String str = this.rrS.rpp.getSelectedMediaId();
    paramMenuItem = this.rrS.rpp.getSelectItem();
    ab.d("MicroMsg.SnsGalleryUI", "click selectLocalId ".concat(String.valueOf(localObject)));
    ab.d("MicroMsg.SnsGalleryUI", "click position ".concat(String.valueOf(str)));
    localObject = af.cnF().YT((String)localObject);
    try
    {
      int i = this.rrS.rpp.getPosition();
      int j = ((n)localObject).cqu().xfI.wbK.size();
      if ((j > 1) && (i > 1) && (i <= j))
        i--;
      while (true)
      {
        this.rrS.rpl.a(this.rrT, (n)localObject, paramMenuItem.cNr, true, i);
        AppMethodBeat.o(38937);
        return true;
        i = 0;
      }
    }
    catch (Exception paramMenuItem)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SnsGalleryUI", paramMenuItem, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsGalleryUI.3
 * JD-Core Version:    0.6.2
 */