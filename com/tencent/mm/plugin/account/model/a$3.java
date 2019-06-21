package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class a$3
  implements com.tencent.mm.plugin.account.a.a.b
{
  a$3(a parama)
  {
  }

  public final void cN(boolean paramBoolean)
  {
    AppMethodBeat.i(124656);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "performSync end, succ:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      AppMethodBeat.o(124656);
    while (true)
    {
      return;
      Object localObject;
      if (l.aqb().size() > 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "start to upload mobile list");
        g.Rg().a(133, this.gyC);
        System.currentTimeMillis();
        l.apX();
        localObject = new al(l.aqb(), l.aqa());
        g.Rg().a((m)localObject, 0);
        AppMethodBeat.o(124656);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "update mobile friend list");
        String[] arrayOfString = (String[])this.gyC.gyz.toArray(new String[0]);
        this.gyC.gyz.clear();
        ArrayList localArrayList = new ArrayList();
        int i = arrayOfString.length;
        int j = 0;
        if (j < i)
        {
          String str = arrayOfString[j];
          localObject = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(str);
          if ((localObject != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject).apG())))
          {
            localArrayList.add(((com.tencent.mm.plugin.account.friend.a.a)localObject).apG());
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "find mobile %s username %s", new Object[] { ((com.tencent.mm.plugin.account.friend.a.a)localObject).apG(), str });
          }
          while (true)
          {
            j++;
            break;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "not find mobile username %s", new Object[] { str });
          }
        }
        g.Rg().a(32, this.gyC);
        if (localArrayList.size() == 0)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "sync mobile list is zero");
          localObject = new com.tencent.mm.plugin.account.friend.a.ab();
          g.Rg().a((m)localObject, 0);
          AppMethodBeat.o(124656);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "sync mobile list is %d", new Object[] { Integer.valueOf(localArrayList.size()) });
          localObject = new com.tencent.mm.plugin.account.friend.a.ab(localArrayList, null);
          g.Rg().a((m)localObject, 0);
          AppMethodBeat.o(124656);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.a.3
 * JD-Core Version:    0.6.2
 */