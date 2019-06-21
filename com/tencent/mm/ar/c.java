package com.tencent.mm.ar;

import android.database.Cursor;
import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.aht;
import com.tencent.mm.protocal.protobuf.ahu;
import com.tencent.mm.protocal.protobuf.alk;
import com.tencent.mm.protocal.protobuf.all;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

final class c
  implements ao.b
{
  Queue<aht> fCA;
  Queue<a> fCB;
  long fCC;
  final int fCD;
  final int fCE;
  ap fCF;
  final ap fCG;
  f<String, Integer> fCy;
  Map<String, ao.b.a> fCz;
  boolean frc;
  private long frn;

  c()
  {
    AppMethodBeat.i(16478);
    this.frc = false;
    this.fCy = new com.tencent.mm.memory.a.c(200);
    this.fCz = new HashMap();
    this.fCA = new LinkedList();
    this.fCB = new LinkedList();
    this.fCC = 0L;
    this.fCD = 500;
    this.fCE = 10000;
    this.frn = 0L;
    this.fCF = new ap(aw.RS().oAl.getLooper(), new c.2(this), false);
    this.fCG = new ap(aw.RS().oAl.getLooper(), new c.7(this), true);
    AppMethodBeat.o(16478);
  }

  private static boolean aK(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(16484);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(16484);
    while (true)
    {
      return bool;
      String str = r.Yz();
      Object localObject = r.YA();
      if ((paramString1.equals(str)) || (paramString1.equals(localObject)))
      {
        ab.i("MicroMsg.GetContactService", "addToStg username: " + paramString1 + " equal to user: " + str + " alias: " + (String)localObject + " ret");
        AppMethodBeat.o(16484);
      }
      else
      {
        localObject = new a();
        ((a)localObject).username = paramString1;
        ((a)localObject).fng = bo.nullAsNil(paramString2);
        ((a)localObject).fCv = bo.anU();
        bool = d.agM().a((a)localObject);
        AppMethodBeat.o(16484);
      }
    }
  }

  private void agJ()
  {
    AppMethodBeat.i(16485);
    Object localObject1 = d.agM();
    long l = this.fCC;
    Cursor localCursor = ((b)localObject1).fni.a("select getcontactinfov2.username,getcontactinfov2.inserttime,getcontactinfov2.type,getcontactinfov2.lastgettime,getcontactinfov2.reserved1,getcontactinfov2.reserved2,getcontactinfov2.reserved3,getcontactinfov2.reserved4 from getcontactinfov2 where inserttime> ?  order by inserttime asc limit ?", new String[] { String.valueOf(l), "80" }, 0);
    if (localCursor == null)
      AppMethodBeat.o(16485);
    while (true)
    {
      return;
      int i = localCursor.getCount();
      ab.i("MicroMsg.GetContactService", "getFromDb count:%d", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
      {
        localCursor.close();
        AppMethodBeat.o(16485);
      }
      else
      {
        Object localObject2 = new LinkedList();
        localObject1 = new LinkedList();
        LinkedList localLinkedList1 = new LinkedList();
        LinkedList localLinkedList2 = new LinkedList();
        Object localObject4;
        if (localCursor.moveToNext())
        {
          Object localObject3 = new a();
          ((a)localObject3).username = localCursor.getString(0);
          ((a)localObject3).fCv = localCursor.getLong(1);
          ((a)localObject3).type = localCursor.getInt(2);
          ((a)localObject3).fCw = localCursor.getInt(3);
          ((a)localObject3).fne = localCursor.getInt(4);
          ((a)localObject3).fCx = localCursor.getInt(5);
          ((a)localObject3).fng = localCursor.getString(6);
          ((a)localObject3).fnh = localCursor.getString(7);
          localObject4 = ((a)localObject3).getUsername();
          localObject5 = bo.nullAsNil(((a)localObject3).agH());
          int j = bo.h(Integer.valueOf(((a)localObject3).fCx));
          Object localObject6 = bo.nullAsNil(((a)localObject3).agI());
          this.fCC = ((a)localObject3).fCv;
          localObject3 = (String)localObject4 + "#" + (String)localObject5;
          i = bo.a((Integer)this.fCy.ai(localObject3), 0);
          if (i < 3)
          {
            this.fCy.k(localObject3, Integer.valueOf(i + 1));
            if (t.mP((String)localObject4))
            {
              localObject6 = new aht();
              ((LinkedList)localObject2).add(new bts().alV((String)localObject4));
              ((LinkedList)localObject1).add(new bts().alV((String)localObject5));
              ((aht)localObject6).vEg = ((LinkedList)localObject2);
              ((aht)localObject6).woa = ((LinkedList)localObject1);
              this.fCA.add(localObject6);
              localObject2 = new LinkedList();
              localObject1 = new LinkedList();
              ab.i("MicroMsg.GetContactService", "getFromDb this is openRoom now reqlist size:%d , this req usr count:%d usr %s", new Object[] { Integer.valueOf(this.fCA.size()), Integer.valueOf(((aht)localObject6).vEg.size()), localObject4 });
            }
          }
          while (true)
          {
            if (((LinkedList)localObject2).size() < 20)
            {
              localObject5 = localObject1;
              localObject4 = localObject2;
              if (!localCursor.isLast());
            }
            else
            {
              localObject6 = new aht();
              ((aht)localObject6).vEg = ((LinkedList)localObject2);
              ((aht)localObject6).wnW = ((LinkedList)localObject2).size();
              ((aht)localObject6).woa = ((LinkedList)localObject1);
              ((aht)localObject6).wnZ = ((LinkedList)localObject1).size();
              this.fCA.add(localObject6);
              localObject4 = new LinkedList();
              localObject5 = new LinkedList();
              ab.i("MicroMsg.GetContactService", "getFromDb now reqlist size:%d , this req usr count:%d", new Object[] { Integer.valueOf(this.fCA.size()), Integer.valueOf(((aht)localObject6).vEg.size()) });
            }
            localObject1 = localObject5;
            localObject2 = localObject4;
            break;
            if (ad.aox((String)localObject4))
            {
              localObject6 = new aht();
              ((LinkedList)localObject2).add(new bts().alV((String)localObject4));
              ((LinkedList)localObject1).add(new bts().alV((String)localObject5));
              ((aht)localObject6).vEg = ((LinkedList)localObject2);
              ((aht)localObject6).woa = ((LinkedList)localObject1);
              this.fCA.add(localObject6);
              localObject2 = new LinkedList();
              localObject1 = new LinkedList();
              ab.i("MicroMsg.GetContactService", "getFromDb this is isOpenIM now reqlist size:%d , this req usr count:%d usr %s", new Object[] { Integer.valueOf(this.fCA.size()), Integer.valueOf(((aht)localObject6).vEg.size()), localObject4 });
            }
            else if (j == 1)
            {
              localLinkedList1.add(new Pair(new bts().alV((String)localObject4), new bts().alV((String)localObject6)));
              ab.i("MicroMsg.GetContactService", "getFromDb add user:%s scene:%s ticket:%s", new Object[] { localObject4, Integer.valueOf(j), localObject6 });
            }
            else
            {
              ((LinkedList)localObject2).add(new bts().alV((String)localObject4));
              ((LinkedList)localObject1).add(new bts().alV((String)localObject5));
              ab.i("MicroMsg.GetContactService", "getFromDb add user:%s room:%s", new Object[] { localObject4, localObject5 });
              continue;
              localLinkedList2.add(localObject4);
              H((String)localObject4, false);
            }
          }
        }
        localCursor.close();
        Object localObject5 = localLinkedList1.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject2 = (Pair)((Iterator)localObject5).next();
          localObject1 = new aht();
          localObject4 = new LinkedList();
          ((LinkedList)localObject4).add(((Pair)localObject2).first);
          ((aht)localObject1).vEg = ((LinkedList)localObject4);
          ((aht)localObject1).wnW = ((LinkedList)localObject4).size();
          ((aht)localObject1).wob = 1;
          ((aht)localObject1).woc = ((bts)((Pair)localObject2).second);
          this.fCA.add(localObject1);
        }
        localLinkedList1.clear();
        for (i = 0; i < localLinkedList2.size(); i++)
        {
          localObject1 = (String)localLinkedList2.get(i);
          boolean bool1 = t.kH((String)localObject1);
          ab.w("MicroMsg.GetContactService", "getFromDb try getContact Too much room usr:%s; remove from table:%s ", new Object[] { localObject1, Boolean.valueOf(bool1) });
          if (bool1)
            d.agM().rY((String)localObject1);
          boolean bool2 = t.mQ((String)localObject1);
          ab.w("MicroMsg.GetContactService", "getFromDb try getContact Too much biz usr:%s; remove from table:%s ", new Object[] { localObject1, Boolean.valueOf(bool1) });
          if (bool2)
          {
            d.agM().rY((String)localObject1);
            e.pXa.a(832L, 3L, 1L, false);
          }
        }
        AppMethodBeat.o(16485);
      }
    }
  }

  final void H(final String paramString, final boolean paramBoolean)
  {
    AppMethodBeat.i(16486);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(16472);
        if (c.this.fCz.containsKey(paramString))
        {
          ao.b.a locala = (ao.b.a)c.this.fCz.get(paramString);
          if (locala != null)
            locala.o(paramString, paramBoolean);
          c.this.fCz.remove(paramString);
        }
        AppMethodBeat.o(16472);
      }
    });
    AppMethodBeat.o(16486);
  }

  public final void a(String paramString1, String paramString2, ao.b.a parama)
  {
    AppMethodBeat.i(16482);
    ab.i("MicroMsg.GetContactService", "dkverify getNow :" + paramString1 + " chatroom: " + paramString2 + " stack:" + bo.dpG());
    if (aK(paramString1, paramString2))
    {
      this.fCz.put(paramString1, parama);
      this.fCF.ae(0L, 0L);
    }
    AppMethodBeat.o(16482);
  }

  final void agK()
  {
    while (true)
    {
      long l;
      try
      {
        AppMethodBeat.i(16487);
        if (com.tencent.mm.plugin.subapp.b.gkF.BZ())
        {
          ab.w("MicroMsg.GetContactService", "tryStartNetscene need init , never get contact");
          AppMethodBeat.o(16487);
          return;
        }
        l = bo.anU();
        if ((this.frc) && (l - this.frn > 600000L))
        {
          ab.w("MicroMsg.GetContactService", "tryStartNetscene Not Callback too long:%d . Force Run Now", new Object[] { Long.valueOf(l - this.frn) });
          this.frc = false;
        }
        if (this.frc)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("tryStartNetscene netSceneRunning: ");
          ab.i("MicroMsg.GetContactService", this.frc + " ret");
          AppMethodBeat.o(16487);
          continue;
        }
      }
      finally
      {
      }
      Object localObject3 = (aht)this.fCA.poll();
      Object localObject2 = localObject3;
      if (localObject3 == null)
      {
        agJ();
        localObject3 = (aht)this.fCA.poll();
        if ((localObject3 != null) && (((aht)localObject3).vEg != null))
        {
          localObject2 = localObject3;
          if (((aht)localObject3).vEg.size() != 0);
        }
        else
        {
          ab.i("MicroMsg.GetContactService", "tryStartNetscene Not any more contact.");
          AppMethodBeat.o(16487);
        }
      }
      else
      {
        this.frn = l;
        this.frc = true;
        Object localObject4 = new java/util/LinkedList;
        ((LinkedList)localObject4).<init>();
        Object localObject5 = new java/util/LinkedList;
        ((LinkedList)localObject5).<init>();
        localObject3 = ((aht)localObject2).vEg.iterator();
        Object localObject6;
        while (((Iterator)localObject3).hasNext())
        {
          localObject6 = aa.a((bts)((Iterator)localObject3).next());
          if (t.mP((String)localObject6))
            ((LinkedList)localObject4).add(localObject6);
          if (ad.aox((String)localObject6))
            ((LinkedList)localObject5).add(localObject6);
        }
        if (((LinkedList)localObject4).size() > 0)
        {
          localObject4 = (String)((LinkedList)localObject4).get(0);
          if (t.mP((String)localObject4))
          {
            localObject2 = com.tencent.mm.roomsdk.a.b.alY((String)localObject4).kd((String)localObject4);
            localObject3 = new com/tencent/mm/ar/c$4;
            ((c.4)localObject3).<init>(this, (String)localObject4);
            ((com.tencent.mm.roomsdk.a.c.a)localObject2).d((com.tencent.mm.roomsdk.a.b.a)localObject3).dmX();
          }
          AppMethodBeat.o(16487);
        }
        else if (((LinkedList)localObject5).size() > 0)
        {
          localObject5 = (String)((LinkedList)localObject5).get(0);
          localObject6 = new com/tencent/mm/protocal/protobuf/alk;
          ((alk)localObject6).<init>();
          ((alk)localObject6).geZ = ((String)localObject5);
          localObject4 = "";
          localObject3 = localObject4;
          if (((aht)localObject2).woa != null)
          {
            localObject3 = localObject4;
            if (((aht)localObject2).woa.size() > 0)
              localObject3 = aa.a((bts)((aht)localObject2).woa.get(0));
          }
          ((alk)localObject6).geY = ((String)localObject3);
          localObject2 = new com/tencent/mm/ai/b$a;
          ((b.a)localObject2).<init>();
          ((b.a)localObject2).fsJ = ((com.tencent.mm.bt.a)localObject6);
          localObject4 = new com/tencent/mm/protocal/protobuf/all;
          ((all)localObject4).<init>();
          ((b.a)localObject2).fsK = ((com.tencent.mm.bt.a)localObject4);
          ((b.a)localObject2).uri = "/cgi-bin/micromsg-bin/getopenimcontact";
          ((b.a)localObject2).fsI = 881;
          ab.i("MicroMsg.GetContactService", "request roomName %s userOpenImname %s", new Object[] { localObject3, localObject5 });
          localObject3 = ((b.a)localObject2).acD();
          localObject2 = new com/tencent/mm/ar/c$5;
          ((c.5)localObject2).<init>(this, (String)localObject5);
          w.a((com.tencent.mm.ai.b)localObject3, (w.a)localObject2, true);
          AppMethodBeat.o(16487);
        }
        else
        {
          localObject3 = new com/tencent/mm/ai/b$a;
          ((b.a)localObject3).<init>();
          ((b.a)localObject3).fsJ = ((com.tencent.mm.bt.a)localObject2);
          localObject2 = new com/tencent/mm/protocal/protobuf/ahu;
          ((ahu)localObject2).<init>();
          ((b.a)localObject3).fsK = ((com.tencent.mm.bt.a)localObject2);
          ((b.a)localObject3).uri = "/cgi-bin/micromsg-bin/getcontact";
          ((b.a)localObject3).fsI = 182;
          localObject2 = ((b.a)localObject3).acD();
          localObject3 = new com/tencent/mm/ar/c$6;
          ((c.6)localObject3).<init>(this);
          w.a((com.tencent.mm.ai.b)localObject2, (w.a)localObject3, true);
          AppMethodBeat.o(16487);
        }
      }
    }
  }

  public final void ai(String paramString1, String paramString2)
  {
    AppMethodBeat.i(16480);
    ab.i("MicroMsg.GetContactService", "dkverify add Contact :" + paramString1 + " chatroom: " + paramString2 + " stack:" + bo.dpG());
    if (aK(paramString1, paramString2))
      this.fCF.ae(500L, 500L);
    AppMethodBeat.o(16480);
  }

  public final void aj(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(16481);
    if (bo.isNullOrNil(paramString1));
    while (true)
    {
      if (bool)
        this.fCF.ae(500L, 500L);
      AppMethodBeat.o(16481);
      return;
      String str = r.Yz();
      Object localObject = r.YA();
      if ((paramString1.equals(str)) || (paramString1.equals(localObject)))
      {
        ab.i("MicroMsg.GetContactService", "addToStg username: " + paramString1 + " equal to user: " + str + " alias: " + (String)localObject + " ret");
      }
      else
      {
        localObject = new a();
        ((a)localObject).username = paramString1;
        ((a)localObject).fnh = bo.nullAsNil(paramString2);
        ((a)localObject).fCx = bo.h(Integer.valueOf(1));
        ((a)localObject).fCv = bo.anU();
        bool = d.agM().a((a)localObject);
      }
    }
  }

  public final void or(String paramString)
  {
    AppMethodBeat.i(16479);
    this.fCz.remove(paramString);
    AppMethodBeat.o(16479);
  }

  public final void os(String paramString)
  {
    AppMethodBeat.i(16483);
    aw.RS().aa(new c.1(this, paramString));
    AppMethodBeat.o(16483);
  }

  final class a
  {
    String aIm;
    int errCode;
    int errType;
    ahu fCO;
    int fCP = 0;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c
 * JD-Core Version:    0.6.2
 */