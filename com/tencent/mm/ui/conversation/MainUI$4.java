package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.f.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class MainUI$4
  implements f.a
{
  MainUI$4(MainUI paramMainUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(34497);
    MainUI.b(this.zvg).dIp();
    h localh;
    if (MainUI.a(this.zvg) != null)
    {
      localh = MainUI.a(this.zvg);
      if ((localh.yDY != null) && (localh.ztF != null) && (!localh.ztF.isEmpty()));
    }
    else
    {
      MainUI.c(this.zvg).post(new MainUI.4.1(this));
      AppMethodBeat.o(34497);
      return;
    }
    if (localh.ztG)
    {
      localh.yDY.clear();
      localh.ztG = false;
    }
    while (true)
    {
      localh.ztF.clear();
      break;
      ab.d("MicroMsg.ConversationWithCacheAdapter", "dealWithConversationEvents size %d", new Object[] { Integer.valueOf(localh.ztF.size()) });
      Iterator localIterator = localh.ztF.iterator();
      while (localIterator.hasNext())
        localh.yDY.remove(localIterator.next());
    }
  }

  public final void dwH()
  {
    AppMethodBeat.i(34496);
    g.BN(12);
    d locald = MainUI.b(this.zvg);
    locald.zrb = -1;
    locald.zra.clear();
    if ((locald.zrd == null) || (locald.zrc < 0) || (!locald.zrd.dvr()))
    {
      locald.zrb = 0;
      AppMethodBeat.o(34496);
    }
    while (true)
    {
      return;
      if (locald.zrd.ztG)
      {
        locald.zrb = 0;
        AppMethodBeat.o(34496);
      }
      else if (locald.zrd.ztE)
      {
        ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount has contact change");
        locald.zrb = 0;
        locald.zrd.ztE = false;
        AppMethodBeat.o(34496);
      }
      else
      {
        Object localObject1 = (HashSet)locald.zrd.ztF.clone();
        ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  events size %d", new Object[] { Integer.valueOf(((HashSet)localObject1).size()) });
        if (((HashSet)localObject1).contains("floatbottle"))
        {
          locald.zrb = 0;
          AppMethodBeat.o(34496);
        }
        else
        {
          ((HashSet)localObject1).remove("officialaccounts");
          if (((HashSet)localObject1).isEmpty())
          {
            locald.zrb = 1;
            AppMethodBeat.o(34496);
          }
          else
          {
            Iterator localIterator = ((HashSet)localObject1).iterator();
            while (localIterator.hasNext())
            {
              localObject1 = (String)localIterator.next();
              Object localObject2 = locald.zrd;
              boolean bool;
              if (((h)localObject2).arV((String)localObject1))
                bool = false;
              while (true)
              {
                if (bool)
                  break label357;
                localObject2 = locald.arU((String)localObject1);
                if (localObject2 != null)
                  break label359;
                locald.zra.put(localObject1, Integer.valueOf(0));
                ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  cov == null username %s, unreadcount %d", new Object[] { localObject1, Integer.valueOf(0) });
                break;
                localObject2 = (h.d)((h)localObject2).yDY.get(localObject1);
                if (localObject2 == null)
                  bool = false;
                else if (t.kH((String)localObject1))
                  bool = ((h.d)localObject2).zrR;
                else
                  bool = ((h.d)localObject2).zrN;
              }
              label357: continue;
              label359: locald.zra.put(localObject1, Integer.valueOf(((at)localObject2).field_unReadCount));
              ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  cov != null username %s, unreadcount %d", new Object[] { localObject1, Integer.valueOf(((at)localObject2).field_unReadCount) });
            }
            ab.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  preUnReadCount size %d", new Object[] { Integer.valueOf(locald.zra.size()) });
            if (locald.zra.isEmpty())
            {
              locald.zrb = 1;
              AppMethodBeat.o(34496);
            }
            else if (locald.zra.size() > 20)
            {
              locald.zrb = 0;
              AppMethodBeat.o(34496);
            }
            else
            {
              locald.zrb = 2;
              AppMethodBeat.o(34496);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.4
 * JD-Core Version:    0.6.2
 */