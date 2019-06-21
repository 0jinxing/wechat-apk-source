package com.tencent.mm.plugin.account.friend.ui;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.p;

public abstract class d extends p<ao>
  implements com.tencent.mm.ah.d.a
{
  public d(Context paramContext, ao paramao)
  {
    super(paramContext, paramao);
  }

  public static void wl(String paramString)
  {
    if (bo.isNullOrNil(paramString))
      ab.w("MicroMsg.QQFriendAdapterBase", "deal add friend failed. username is null.");
    Object localObject;
    do
    {
      while (true)
      {
        return;
        localObject = ((com.tencent.mm.plugin.account.friend.a.ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).wj(paramString);
        if (localObject != null)
        {
          ((ao)localObject).gwD = 2;
          ((com.tencent.mm.plugin.account.friend.a.ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(((ao)localObject).gwC, (ao)localObject);
        }
        localObject = ((j)g.K(j.class)).XM().aoO(paramString);
        if (localObject != null)
          break;
        ab.w("MicroMsg.QQFriendAdapterBase", "[cpan] dealAddFriend failed. contact is null.");
      }
      if (bo.isNullOrNil(((com.tencent.mm.g.c.ap)localObject).field_username))
        ((ad)localObject).setUsername(paramString);
      if ((int)((com.tencent.mm.n.a)localObject).ewQ != 0)
        break;
      ((j)g.K(j.class)).XM().aa((ad)localObject);
    }
    while (bo.isNullOrNil(((com.tencent.mm.g.c.ap)localObject).field_username));
    for (paramString = ((j)g.K(j.class)).XM().aoO(((com.tencent.mm.g.c.ap)localObject).field_username); ; paramString = (String)localObject)
    {
      if ((int)paramString.ewQ <= 0)
      {
        ab.e("MicroMsg.QQFriendAdapterBase", "addContact : insert contact failed");
        break;
      }
      t.q(paramString);
      bv.aaq().c(26, new Object[0]);
      break;
    }
  }

  public void a(d.a parama)
  {
  }

  public void vM(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.d
 * JD-Core Version:    0.6.2
 */