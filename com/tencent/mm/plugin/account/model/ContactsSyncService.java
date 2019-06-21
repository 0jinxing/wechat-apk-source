package com.tencent.mm.plugin.account.model;

import android.accounts.Account;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.h;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.storage.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class ContactsSyncService extends Service
  implements f
{
  private static Account ggY;
  private ContactsSyncService.a gyE;
  private Looper gyF;

  public ContactsSyncService()
  {
    AppMethodBeat.i(124664);
    this.gyE = null;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
    AppMethodBeat.o(124664);
  }

  private void aqB()
  {
    AppMethodBeat.i(124667);
    if (this.gyF != null)
      this.gyF.quit();
    AppMethodBeat.o(124667);
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(124665);
    paramIntent = null;
    if (b.o(this, "android.permission.READ_CONTACTS"))
    {
      if (this.gyE == null)
        this.gyE = new ContactsSyncService.a(this, getApplicationContext());
      paramIntent = this.gyE.getSyncAdapterBinder();
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", new Object[] { paramIntent });
      AppMethodBeat.o(124665);
      return paramIntent;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124668);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "contacts sync service destroy");
    super.onDestroy();
    AppMethodBeat.o(124668);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124666);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType());
    long l2;
    if (paramm.getType() == 133)
    {
      g.Rg().b(133, this);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      long l1 = ((Long)g.RP().Ry().get(327728, Long.valueOf(0L))).longValue();
      l2 = System.currentTimeMillis();
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ContactsSyncService", "getMFriend : curTime=" + l2 + ", lastTime=" + l1);
      if ((paramInt2 != 0) && (l2 - l1 < 86400000L))
      {
        aqB();
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
        AppMethodBeat.o(124666);
      }
    }
    while (true)
    {
      return;
      g.RP().Ry().set(327728, Long.valueOf(l2));
      g.Rg().a(32, this);
      paramString = (al)paramm;
      paramString = new com.tencent.mm.plugin.account.friend.a.ab(paramString.gwp, paramString.gwq);
      g.Rg().a(paramString, 0);
      if (paramm.getType() == 32)
      {
        g.Rg().b(32, this);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
        if ((paramInt1 == 0) && (paramInt2 == 0))
          d.h(new h(this, ggY), "MMAccountManager_updateLocalContacts").start();
        aqB();
      }
      AppMethodBeat.o(124666);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.ContactsSyncService
 * JD-Core Version:    0.6.2
 */