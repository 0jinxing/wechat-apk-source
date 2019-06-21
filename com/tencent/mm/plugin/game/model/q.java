package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class q
{
  private static boolean b(n paramn)
  {
    AppMethodBeat.i(111325);
    long l = System.currentTimeMillis() / 1000L;
    boolean bool;
    if (paramn.field_expireTime < l)
    {
      bool = true;
      AppMethodBeat.o(111325);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(111325);
    }
  }

  public static n bEm()
  {
    AppMethodBeat.i(111317);
    long l = ((Long)g.RP().Ry().get(ac.a.xLV, Long.valueOf(0L))).longValue();
    if (l != 0L);
    for (n localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l); ; localn = null)
    {
      if ((localn == null) || (localn.field_isHidden) || (b(localn)))
      {
        a.Oh("");
        AppMethodBeat.o(111317);
        localn = null;
      }
      while (true)
      {
        return localn;
        AppMethodBeat.o(111317);
      }
    }
  }

  public static void bEn()
  {
    AppMethodBeat.i(111318);
    long l = ((Long)g.RP().Ry().get(ac.a.xLV, Long.valueOf(0L))).longValue();
    n localn = null;
    if (l != 0L)
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
    if ((localn == null) || (localn.field_isHidden))
      AppMethodBeat.o(111318);
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xLV, Long.valueOf(0L));
      AppMethodBeat.o(111318);
    }
  }

  public static n bEo()
  {
    AppMethodBeat.i(111319);
    long l = ((Long)g.RP().Ry().get(ac.a.xLZ, Long.valueOf(0L))).longValue();
    n localn;
    if (l == 0L)
    {
      AppMethodBeat.o(111319);
      localn = null;
    }
    while (true)
    {
      return localn;
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
      if ((localn == null) || (localn.field_isHidden) || (b(localn)))
      {
        AppMethodBeat.o(111319);
        localn = null;
      }
      else
      {
        AppMethodBeat.o(111319);
      }
    }
  }

  public static void bEp()
  {
    AppMethodBeat.i(111320);
    long l = ((Long)g.RP().Ry().get(ac.a.xLZ, Long.valueOf(0L))).longValue();
    n localn = null;
    if (l != 0L)
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
    if ((localn == null) || (localn.field_isHidden))
      AppMethodBeat.o(111320);
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xLZ, Long.valueOf(0L));
      AppMethodBeat.o(111320);
    }
  }

  public static n bEq()
  {
    AppMethodBeat.i(111321);
    long l = ((Long)g.RP().Ry().get(ac.a.xLW, Long.valueOf(0L))).longValue();
    n localn;
    if (l == 0L)
    {
      AppMethodBeat.o(111321);
      localn = null;
    }
    while (true)
    {
      return localn;
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
      if ((localn == null) || (localn.field_isHidden) || (b(localn)))
      {
        AppMethodBeat.o(111321);
        localn = null;
      }
      else
      {
        AppMethodBeat.o(111321);
      }
    }
  }

  public static void bEr()
  {
    AppMethodBeat.i(111322);
    long l = ((Long)g.RP().Ry().get(ac.a.xLW, Long.valueOf(0L))).longValue();
    n localn = null;
    if (l != 0L)
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
    if ((localn == null) || (localn.field_isHidden))
      AppMethodBeat.o(111322);
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xLW, Long.valueOf(0L));
      AppMethodBeat.o(111322);
    }
  }

  public static n bEs()
  {
    AppMethodBeat.i(111323);
    long l = ((Long)g.RP().Ry().get(ac.a.xMa, Long.valueOf(0L))).longValue();
    n localn;
    if (l == 0L)
    {
      AppMethodBeat.o(111323);
      localn = null;
    }
    while (true)
    {
      return localn;
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
      if ((localn == null) || (localn.field_isHidden) || (b(localn)))
      {
        AppMethodBeat.o(111323);
        localn = null;
      }
      else
      {
        AppMethodBeat.o(111323);
      }
    }
  }

  public static void bEt()
  {
    AppMethodBeat.i(111324);
    long l = ((Long)g.RP().Ry().get(ac.a.xMa, Long.valueOf(0L))).longValue();
    n localn = null;
    if (l != 0L)
      localn = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().iP(l);
    if ((localn == null) || (localn.field_isHidden))
      AppMethodBeat.o(111324);
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xMa, Long.valueOf(0L));
      AppMethodBeat.o(111324);
    }
  }

  public static void c(n paramn)
  {
    AppMethodBeat.i(111326);
    if (bo.isNullOrNil(paramn.field_mergerId))
    {
      AppMethodBeat.o(111326);
      return;
    }
    Object localObject1 = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
    Object localObject2 = paramn.field_mergerId;
    int i = paramn.field_msgType;
    Object localObject3 = "select * from GameRawMessage where msgType=" + i + " and mergerId= \"" + (String)localObject2 + "\" order by createTime desc limit 1";
    localObject2 = new n();
    localObject1 = ((r)localObject1).rawQuery((String)localObject3, new String[0]);
    if (localObject1 == null)
      localObject2 = null;
    while (true)
    {
      if (localObject2 != null)
      {
        ((n)localObject2).bEl();
        if (!bo.ek(((n)localObject2).mWp))
        {
          paramn.bEl();
          LinkedList localLinkedList = new LinkedList(((n)localObject2).mWp);
          if (!bo.ek(paramn.mWp))
          {
            localObject1 = ((n.i)paramn.mWp.get(0)).userName;
            if (!bo.isNullOrNil((String)localObject1))
            {
              Iterator localIterator = ((n)localObject2).mWp.iterator();
              while (localIterator.hasNext())
              {
                localObject3 = (n.i)localIterator.next();
                if (((n.i)localObject3).userName.equals(localObject1))
                  localLinkedList.remove(localObject3);
              }
            }
          }
          if (!bo.ek(localLinkedList))
            paramn.field_rawXML = ah.a(paramn.field_rawXML, localLinkedList, ((n)localObject2).mWu);
          ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().a((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
        }
      }
      AppMethodBeat.o(111326);
      break;
      if (((Cursor)localObject1).moveToFirst())
        ((n)localObject2).d((Cursor)localObject1);
      ((Cursor)localObject1).close();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.q
 * JD-Core Version:    0.6.2
 */