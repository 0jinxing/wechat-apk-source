package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.masssend.a.a;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.n.d;

final class MassSendHistoryUI$4
  implements n.d
{
  MassSendHistoryUI$4(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(22797);
    Object localObject1;
    Object localObject2;
    if (paramMenuItem.getItemId() == 1)
    {
      localObject1 = (a)MassSendHistoryUI.b(this.ooZ).getItem(paramMenuItem.getGroupId());
      if (localObject1 == null)
      {
        AppMethodBeat.o(22797);
        return;
      }
      if (((a)localObject1).bNv().equals(MassSendHistoryUI.b(this.ooZ).ooH))
        MassSendHistoryUI.h(this.ooZ);
      paramMenuItem = com.tencent.mm.plugin.masssend.a.h.bNE();
      localObject1 = ((a)localObject1).bNv();
      localObject2 = paramMenuItem.fni.a("select * from massendinfo ORDER BY createtime DESC  limit 2", null, 0);
      if (localObject2 != null)
      {
        if (((Cursor)localObject2).getCount() != 0)
          break label156;
        ((Cursor)localObject2).close();
      }
    }
    while (true)
    {
      if (paramMenuItem.fni.delete("massendinfo", "clientid= ?", new String[] { String.valueOf(localObject1) }) > 0)
        paramMenuItem.doNotify();
      AppMethodBeat.o(22797);
      break;
      label156: a locala;
      if (((Cursor)localObject2).getCount() == 1)
      {
        ((Cursor)localObject2).moveToFirst();
        locala = new a();
        locala.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        localObject2 = new ak();
        ((ak)localObject2).setUsername("masssendapp");
        ((ak)localObject2).setContent(ah.getContext().getResources().getString(2131298580));
        ((ak)localObject2).eD(locala.createTime);
        ((ak)localObject2).hO(0);
        ((ak)localObject2).hM(0);
        aw.ZK();
        com.tencent.mm.model.c.XR().a((ak)localObject2, "masssendapp");
      }
      else
      {
        ((Cursor)localObject2).moveToPosition(1);
        locala = new a();
        locala.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        localObject2 = new ak();
        ((ak)localObject2).setUsername("masssendapp");
        ((ak)localObject2).setContent(b.a(locala));
        ((ak)localObject2).eD(locala.createTime);
        ((ak)localObject2).hO(0);
        ((ak)localObject2).hM(0);
        aw.ZK();
        com.tencent.mm.model.c.XR().a((ak)localObject2, "masssendapp");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.4
 * JD-Core Version:    0.6.2
 */