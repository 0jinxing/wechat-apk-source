package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class az
{
  private static final List<c> ziB;

  static
  {
    AppMethodBeat.i(33451);
    ArrayList localArrayList = new ArrayList();
    ziB = localArrayList;
    localArrayList.add(new al.b());
    ziB.add(new al.a());
    ziB.add(new d.e());
    ziB.add(new d.d());
    ziB.add(new l.c());
    ziB.add(new l.b());
    ziB.add(new p.c());
    ziB.add(new p.b());
    ziB.add(new k.d());
    ziB.add(new k.c());
    ziB.add(new ai());
    ziB.add(new ad.b());
    ziB.add(new y.b());
    ziB.add(new y.a());
    ziB.add(new an.a());
    ziB.add(new an.b());
    ziB.add(new af.a());
    ziB.add(new u.c());
    ziB.add(new u.b());
    ziB.add(new z.a());
    ziB.add(new am.b());
    ziB.add(new am.a());
    ziB.add(new ae.b());
    ziB.add(new ae.a());
    ziB.add(new ar.f());
    ziB.add(new ar.c());
    ziB.add(new ar.g());
    ziB.add(new t.j());
    ziB.add(new ar.d());
    ziB.add(new ar.e());
    ziB.add(new aq());
    ziB.add(new ao());
    ziB.add(new ap());
    ziB.add(new ah.a());
    ziB.add(new ah.b());
    ziB.add(new as.c());
    ziB.add(new as.b());
    ziB.add(new w());
    ziB.add(new n.b());
    ziB.add(new n.c());
    ziB.add(new aa());
    ziB.add(new ab());
    ziB.add(new ac());
    ziB.add(new o.c());
    ziB.add(new o.b());
    ziB.add(new e.c());
    ziB.add(new e.b());
    ziB.add(new i.c());
    ziB.add(new i.b());
    ziB.add(new g.c());
    ziB.add(new g.b());
    ziB.add(new h.c());
    ziB.add(new h.b());
    ziB.add(new r.b());
    ziB.add(new r.a());
    ziB.add(new s.b());
    ziB.add(new s.a());
    ziB.add(new q.b());
    ziB.add(new q.a());
    ziB.add(new m.c());
    ziB.add(new m.b());
    ziB.add(new ad.a());
    ziB.add(new f.c());
    ziB.add(new f.b());
    ziB.add(new j.c());
    ziB.add(new az.1());
    ziB.add(new az.2());
    AppMethodBeat.o(33451);
  }

  public static c bM(bi parambi)
  {
    AppMethodBeat.i(33448);
    Iterator localIterator = ziB.iterator();
    c localc;
    int i;
    boolean bool;
    do
    {
      if (!localIterator.hasNext())
        break label103;
      localc = (c)localIterator.next();
      i = parambi.getType();
      if (parambi.field_isSend != 1)
        break;
      bool = true;
    }
    while (!localc.aH(i, bool));
    while (true)
    {
      try
      {
        localc = (c)localc.getClass().newInstance();
        AppMethodBeat.o(33448);
        parambi = localc;
        return parambi;
        bool = false;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.Chatting.ItemFactory", localException, "", new Object[0]);
      }
      break;
      label103: parambi = new al.a();
      AppMethodBeat.o(33448);
    }
  }

  public static int bN(bi parambi)
  {
    AppMethodBeat.i(33450);
    if (parambi.getType() == 49)
    {
      i = l.d(j.b.me(parambi.field_content));
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Chatting.ItemFactory", "maybe honeypay need change type: %s", new Object[] { Integer.valueOf(i) });
      if (i != 49)
      {
        parambi.setType(i);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
      }
    }
    int i = 0;
    boolean bool;
    if (i < ziB.size())
    {
      c localc = (c)ziB.get(i);
      int j = parambi.getType();
      if (parambi.field_isSend == 1)
      {
        bool = true;
        label117: if (!localc.aH(j, bool))
          break label141;
        AppMethodBeat.o(33450);
      }
    }
    while (true)
    {
      return i;
      bool = false;
      break label117;
      label141: i++;
      break;
      AppMethodBeat.o(33450);
      i = 0;
    }
  }

  public static int dHt()
  {
    AppMethodBeat.i(33449);
    int i = ziB.size();
    AppMethodBeat.o(33449);
    return i + 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.az
 * JD-Core Version:    0.6.2
 */