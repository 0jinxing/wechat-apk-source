package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;
import com.tencent.mm.ui.af;
import com.tencent.mm.ui.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  Activity activity;
  ListView zqz;
  HashMap<String, Integer> zra;
  int zrb;
  int zrc;
  h zrd;
  com.tencent.mm.sdk.b.c zre;
  com.tencent.mm.sdk.b.c zrf;
  com.tencent.mm.sdk.b.c zrg;

  public d()
  {
    AppMethodBeat.i(34181);
    this.zra = new HashMap();
    this.zrb = -1;
    this.zrc = -1;
    this.zre = new d.1(this);
    this.zrf = new d.2(this);
    this.zrg = new com.tencent.mm.sdk.b.c()
    {
      private final long INTERVAL;
      long zrj;
      int zrk;
    };
    AppMethodBeat.o(34181);
  }

  final ak arU(String paramString)
  {
    AppMethodBeat.i(34184);
    if (this.zrd != null)
    {
      paramString = (ak)this.zrd.cL(paramString);
      AppMethodBeat.o(34184);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(34184);
    }
  }

  public final void ax(Activity paramActivity)
  {
    AppMethodBeat.i(34182);
    this.zrc = ((LauncherUI)paramActivity).yjJ.getMainTabUI().dyF();
    AppMethodBeat.o(34182);
  }

  public final void dIp()
  {
    AppMethodBeat.i(34183);
    if (this.activity == null)
      AppMethodBeat.o(34183);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      LauncherUI localLauncherUI = (LauncherUI)this.activity;
      ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  resetStatus %d", new Object[] { Integer.valueOf(this.zrb) });
      switch (this.zrb)
      {
      default:
        this.zrc = localLauncherUI.yjJ.getMainTabUI().dyF();
        ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_ALL totalUnReadCount %d, usetime %d,", new Object[] { Integer.valueOf(this.zrc), Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(34183);
        break;
      case 2:
        Object localObject1 = this.zra.entrySet().iterator();
        int i = 0;
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
          String str = (String)((Map.Entry)localObject2).getKey();
          j = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
          ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s, preunread %d", new Object[] { str, Integer.valueOf(j) });
          localObject2 = arU(str);
          if ((localObject2 == null) || (af.dzi().contains(str)))
          {
            j = 0 - j;
            ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov == null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
            if ((j != 0) && (this.zrd.arV(str)))
            {
              ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s isWithoutItemCache", new Object[] { str });
              aw.ZK();
              localObject2 = com.tencent.mm.model.c.XM().aoO(str);
              if (localObject2 == null)
                continue;
              if (!t.kH(str))
                break label427;
              if (((ap)localObject2).dua == 0)
                continue;
            }
          }
          else
          {
            while (true)
            {
              i += j;
              ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  real change usename %s, change %d, totalchange %d", new Object[] { str, Integer.valueOf(j), Integer.valueOf(i) });
              break;
              j = ((at)localObject2).field_unReadCount - j + 0;
              ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov != null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
              break label276;
              if (((ad)localObject2).DX())
                break;
            }
          }
        }
        this.zrc += i;
        localObject1 = localLauncherUI.yjJ.getMainTabUI();
        int j = this.zrc;
        ((MainTabUI)localObject1).ynE.No(j);
        ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_PART totalUnReadCount %d, change %d, usetime %d,", new Object[] { Integer.valueOf(this.zrc), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(34183);
        break;
      case 1:
        label276: label427: AppMethodBeat.o(34183);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.d
 * JD-Core Version:    0.6.2
 */