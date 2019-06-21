package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  private LinkedList<d> oof;

  private static String bNB()
  {
    AppMethodBeat.i(22732);
    String str;
    if (aw.RK())
    {
      aw.ZK();
      str = String.format("%s/masssend_%s.ini", new Object[] { com.tencent.mm.model.c.Rt(), aa.dor() });
      ab.d("MicroMsg.MassSendService", "config file path is %s", new Object[] { str });
      AppMethodBeat.o(22732);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(22732);
    }
  }

  private boolean bNC()
  {
    AppMethodBeat.i(22733);
    Object localObject;
    byte[] arrayOfByte;
    boolean bool;
    if (this.oof == null)
    {
      localObject = bNB();
      arrayOfByte = com.tencent.mm.vfs.e.e((String)localObject, 0, -1);
      if (arrayOfByte == null)
      {
        AppMethodBeat.o(22733);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      try
      {
        e locale = new com/tencent/mm/plugin/masssend/a/e;
        locale.<init>();
        this.oof = ((e)locale.parseFrom(arrayOfByte)).oog;
        if (this.oof != null)
          break label106;
        ab.w("MicroMsg.MassSendService", "info list is empty");
        AppMethodBeat.o(22733);
        bool = false;
      }
      catch (Exception localException)
      {
        com.tencent.mm.vfs.e.deleteFile((String)localObject);
        AppMethodBeat.o(22733);
        bool = false;
      }
      continue;
      label106: ab.i("MicroMsg.MassSendService", "info list[%s]", new Object[] { this.oof.toString() });
      long l = bo.anT();
      Iterator localIterator = this.oof.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject = (d)localIterator.next();
          if ((((d)localObject).ccb <= l) && (l <= ((d)localObject).end))
          {
            AppMethodBeat.o(22733);
            bool = true;
            break;
          }
        }
      AppMethodBeat.o(22733);
      bool = false;
    }
  }

  public static void je(long paramLong)
  {
    AppMethodBeat.i(22731);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(102409, Long.valueOf(paramLong));
    AppMethodBeat.o(22731);
  }

  public final void Qt(String paramString)
  {
    AppMethodBeat.i(22734);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(22734);
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = br.z(paramString, "Festivals");
      if (localObject1 != null)
        break;
      AppMethodBeat.o(22734);
    }
    e locale = new e();
    int i = 0;
    Object localObject2 = new StringBuilder(".Festivals.Festival");
    if (i == 0);
    for (paramString = ""; ; paramString = String.valueOf(i))
    {
      localObject2 = paramString;
      if (!((Map)localObject1).containsKey(localObject2))
        break label199;
      paramString = new d();
      paramString.ccb = bo.anb((String)((Map)localObject1).get((String)localObject2 + ".StartTime"));
      paramString.end = (bo.anb((String)((Map)localObject1).get((String)localObject2 + ".EndTime")) + 86400000);
      locale.oog.add(paramString);
      i++;
      break;
    }
    label199: locale.count = locale.oog.size();
    this.oof = locale.oog;
    while (true)
    {
      try
      {
        paramString = locale.toByteArray();
        localObject1 = bNB();
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.w("MicroMsg.MassSendService", "mass send config file path is null, return");
          AppMethodBeat.o(22734);
          break;
        }
        localObject2 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject2).<init>((String)localObject1);
        if (!((com.tencent.mm.vfs.b)localObject2).exists())
        {
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(102408, Boolean.FALSE);
          ab.d("MicroMsg.MassSendService", "save to config file : %s", new Object[] { locale.toString() });
          com.tencent.mm.vfs.e.b((String)localObject1, paramString, paramString.length);
          AppMethodBeat.o(22734);
          break;
        }
        if (com.tencent.mm.vfs.e.atg(j.w(((com.tencent.mm.vfs.b)localObject2).mUri)).equals(g.x(paramString)))
          break label388;
        i = 1;
        if (i == 0)
          continue;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(102408, Boolean.FALSE);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.MassSendService", paramString, "", new Object[0]);
        AppMethodBeat.o(22734);
      }
      break;
      label388: i = 0;
    }
  }

  public final void bNA()
  {
    Object localObject1 = null;
    AppMethodBeat.i(22730);
    boolean bool1 = bNC();
    aw.ZK();
    boolean bool2 = ((Boolean)com.tencent.mm.model.c.Ry().get(102408, Boolean.FALSE)).booleanValue();
    int i;
    if ((r.YK() & 0x10000) == 0)
    {
      i = 1;
      ab.d("MicroMsg.MassSendService", "hadSetTop is %B", new Object[] { Boolean.valueOf(bool2) });
      if ((i == 0) || (bool2) || (!bool1))
        break label399;
      ab.d("MicroMsg.MassSendService", "set top conversation");
      aw.ZK();
      if (com.tencent.mm.model.c.XR().aoZ("masssendapp") != null)
        break label247;
      aw.ZK();
      if (com.tencent.mm.model.c.XR().aoZ("masssendapp") == null)
      {
        localObject1 = new ak();
        ((ak)localObject1).setUsername("masssendapp");
        ((ak)localObject1).setContent(ah.getContext().getResources().getString(2131298580));
        ((ak)localObject1).eD(bo.anU() + 2000L);
        ((ak)localObject1).hO(0);
        ((ak)localObject1).hM(0);
        aw.ZK();
        com.tencent.mm.model.c.XR().d((ak)localObject1);
      }
    }
    label247: Object localObject2;
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.X(10425, "");
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(102409, Long.valueOf(bo.anU()));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(102408, Boolean.TRUE);
      AppMethodBeat.o(22730);
      return;
      i = 0;
      break;
      localObject2 = h.bNE().fni.a("select * from massendinfo ORDER BY createtime DESC  limit 1", null, 2);
      if (localObject2 != null)
        break label353;
      label268: if (localObject1 != null)
        break label387;
      localObject1 = ah.getContext().getResources().getString(2131298580);
      label285: localObject2 = new ak();
      ((ak)localObject2).setUsername("masssendapp");
      ((ak)localObject2).setContent((String)localObject1);
      ((ak)localObject2).eD(bo.anU() + 2000L);
      ((ak)localObject2).hO(0);
      ((ak)localObject2).hM(0);
      aw.ZK();
      com.tencent.mm.model.c.XR().a((ak)localObject2, "masssendapp");
    }
    label353: if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new a();
      ((a)localObject1).d((Cursor)localObject2);
    }
    while (true)
    {
      ((Cursor)localObject2).close();
      break label268;
      label387: h.bNE();
      localObject1 = b.a((a)localObject1);
      break label285;
      label399: if (!bool1)
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(102408, Boolean.FALSE);
      }
      AppMethodBeat.o(22730);
      break;
      localObject1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.c
 * JD-Core Version:    0.6.2
 */