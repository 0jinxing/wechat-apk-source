package com.tencent.mm.plugin.appbrand.widget.recentview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
{
  long jmK;
  public int jmL;
  int jmM;
  int jmN;
  public int jmO;
  public int jmP;
  int jmQ;
  int jmR;
  StringBuilder jmS;
  StringBuilder jmT;
  StringBuilder jmU;
  StringBuilder jmV;
  int jmW;
  public int jmX;
  public int jmY;
  int jmZ;
  public int jna;
  public int jnb;
  public int jnc;
  StringBuilder jnd;
  StringBuilder jne;
  public StringBuilder jnf;
  StringBuilder jng;
  public StringBuilder jnh;
  public StringBuilder jnj;
  public int jnk;
  public int jnl;
  public int jnm;
  public boolean jnn;

  public b()
  {
    AppMethodBeat.i(114935);
    this.jmK = 0L;
    this.jmS = new StringBuilder();
    this.jmT = new StringBuilder();
    this.jmU = new StringBuilder();
    this.jmV = new StringBuilder();
    this.jnd = new StringBuilder();
    this.jne = new StringBuilder();
    this.jnf = new StringBuilder();
    this.jng = new StringBuilder();
    this.jnh = new StringBuilder();
    this.jnj = new StringBuilder();
    AppMethodBeat.o(114935);
  }

  private static void a(b.a parama)
  {
    AppMethodBeat.i(114944);
    ab.i("MicroMsg.AppBrandRecentViewReporter", "alvinluo reportDuplicatedName: %s", new Object[] { parama });
    h.pYm.e(15796, new Object[] { parama.jnp, parama.jnq, parama.jnr.toString(), parama.jns.toString(), parama.jnt.toString(), parama.jnu.toString(), parama.jnv.toString() });
    AppMethodBeat.o(114944);
  }

  public static void f(List<a> paramList1, List<a> paramList2)
  {
    AppMethodBeat.i(114943);
    Object localObject1 = new ArrayList();
    ((List)localObject1).addAll(paramList1);
    ((List)localObject1).addAll(paramList2);
    paramList2 = new HashMap();
    int i = 0;
    Object localObject2;
    label115: Object localObject3;
    label130: Object localObject4;
    if (i < ((List)localObject1).size())
    {
      localObject2 = (a)((List)localObject1).get(i);
      int j;
      int k;
      if ((localObject2 != null) && (((a)localObject2).iXW != null) && (!bo.isNullOrNil(((a)localObject2).iXW.appId)) && (!bo.isNullOrNil(((a)localObject2).iXW.nickname)))
      {
        if (i >= paramList1.size())
          break label336;
        j = 2;
        if (i >= paramList1.size())
          break label342;
        k = i - 1;
        ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo nickName: %s, type: %d, pos: %d", new Object[] { ((a)localObject2).iXW.nickname, Integer.valueOf(j), Integer.valueOf(k) });
        localObject3 = ((a)localObject2).iXW.appId + "," + ((a)localObject2).iXW.har + "," + j + "," + k;
        if (!paramList2.containsKey(((a)localObject2).iXW.nickname))
          break label357;
        ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo contains nickName: %s", new Object[] { ((a)localObject2).iXW.nickname });
        localObject4 = (Map)paramList2.get(((a)localObject2).iXW.nickname);
        if (!((Map)localObject4).containsKey(localObject3))
          ((Map)localObject4).put(localObject3, localObject2);
        label309: if (!bo.isNullOrNil(((a)localObject2).iXW.bQo))
          break label421;
        ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo not shortNickName");
      }
      while (true)
      {
        i++;
        break;
        label336: j = 1;
        break label115;
        label342: k = i - 1 - paramList1.size();
        break label130;
        label357: ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo not contains nickName: %s", new Object[] { ((a)localObject2).iXW.nickname });
        localObject4 = new HashMap();
        ((Map)localObject4).put(localObject3, localObject2);
        paramList2.put(((a)localObject2).iXW.nickname, localObject4);
        break label309;
        label421: if (((a)localObject2).iXW.nickname.equals(((a)localObject2).iXW.bQo))
        {
          ab.e("MicroMsg.AppBrandRecentViewReporter", "alvinluo nickname equals shortNickName %s, %s", new Object[] { ((a)localObject2).iXW.nickname, ((a)localObject2).iXW.bQo });
        }
        else if (paramList2.containsKey(((a)localObject2).iXW.bQo))
        {
          ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo contains shortNickname: %s", new Object[] { ((a)localObject2).iXW.bQo });
          localObject4 = (Map)paramList2.get(((a)localObject2).iXW.bQo);
          if (!((Map)localObject4).containsKey(localObject3))
            ((Map)localObject4).put(localObject3, localObject2);
        }
        else
        {
          ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo not contains shortNickname: %s", new Object[] { ((a)localObject2).iXW.bQo });
          localObject4 = new HashMap();
          ((Map)localObject4).put(localObject3, localObject2);
          paramList2.put(((a)localObject2).iXW.bQo, localObject4);
        }
      }
    }
    localObject1 = paramList2.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      paramList1 = (Map)paramList2.get(localObject2);
      if ((paramList1 == null) || (paramList1.size() <= 1))
      {
        ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo name %s not duplicated", new Object[] { localObject2 });
      }
      else
      {
        localObject4 = paramList1.keySet();
        localObject3 = new HashMap();
        Object localObject5 = ((Set)localObject4).iterator();
        Object localObject6;
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (a)paramList1.get((String)((Iterator)localObject5).next());
          if ((localObject6 != null) && (((a)localObject6).iXW != null) && (!bo.isNullOrNil(((a)localObject6).iXW.appId)) && (!((Map)localObject3).containsKey(((a)localObject6).iXW.appId)))
            ((Map)localObject3).put(((a)localObject6).iXW.appId, localObject6);
        }
        if (((Map)localObject3).size() <= 1)
        {
          ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo name %s not duplicated2", new Object[] { localObject2 });
        }
        else
        {
          localObject3 = new b.a((String)localObject2);
          localObject6 = ((Set)localObject4).iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject5 = (String)((Iterator)localObject6).next();
            String[] arrayOfString = ((String)localObject5).split(",");
            localObject4 = arrayOfString[2];
            i = Integer.valueOf(arrayOfString[3]).intValue();
            localObject5 = (a)paramList1.get(localObject5);
            if ((localObject5 != null) && (((a)localObject5).iXW != null))
            {
              ab.d("MicroMsg.AppBrandRecentViewReporter", "alvinluo duplicated appId: %s, name: %s, shortName: %s, type: %s, pos: %d", new Object[] { ((a)localObject5).iXW.appId, ((a)localObject5).iXW.nickname, ((a)localObject5).iXW.bQo, localObject4, Integer.valueOf(i) });
              if (((String)localObject2).equals(((a)localObject5).iXW.bQo))
              {
                ((b.a)localObject3).jnq.append(((a)localObject5).iXW.appId).append("#");
                ((b.a)localObject3).jnr.append("1#");
                ((b.a)localObject3).jns.append((String)localObject4).append("#");
                ((b.a)localObject3).jnt.append(i).append("#");
                ((b.a)localObject3).jnu.append(((a)localObject5).iXW.axy).append("#");
                ((b.a)localObject3).jnv.append(((a)localObject5).iXW.har + 1).append("#");
              }
              if (((String)localObject2).equals(((a)localObject5).iXW.nickname))
              {
                ((b.a)localObject3).jnq.append(((a)localObject5).iXW.appId).append("#");
                ((b.a)localObject3).jnr.append("2#");
                ((b.a)localObject3).jns.append((String)localObject4).append("#");
                ((b.a)localObject3).jnt.append(i).append("#");
                ((b.a)localObject3).jnu.append(((a)localObject5).iXW.axy).append("#");
                ((b.a)localObject3).jnv.append(((a)localObject5).iXW.har + 1).append("#");
              }
            }
          }
          a((b.a)localObject3);
        }
      }
    }
    AppMethodBeat.o(114943);
  }

  public final void ER(String paramString)
  {
    AppMethodBeat.i(114940);
    ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo deleteRecentAppBrand id: %s", new Object[] { paramString });
    this.jmQ += 1;
    this.jmT.append(paramString + ":");
    AppMethodBeat.o(114940);
  }

  public final void ES(String paramString)
  {
    AppMethodBeat.i(114941);
    ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo deleteStarAppBrand id: %s", new Object[] { paramString });
    this.jmZ += 1;
    this.jne.append(paramString + ":");
    AppMethodBeat.o(114941);
  }

  public final void ET(String paramString)
  {
    AppMethodBeat.i(114942);
    ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo addRecentAppBrandToCollection id: %s", new Object[] { paramString });
    this.jmR += 1;
    this.jmV.append(paramString + ":");
    AppMethodBeat.o(114942);
  }

  public final void N(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(114937);
    this.jmO = paramInt1;
    this.jmX = paramInt2;
    this.jmL = paramInt3;
    d.xDG.execute(new b.1(this));
    AppMethodBeat.o(114937);
  }

  public final void aRY()
  {
    this.jmM += 1;
  }

  public final void bA(String paramString, int paramInt)
  {
    AppMethodBeat.i(114938);
    ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo openRecentAppBrand id: %s, pos: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.jmS.append(paramString + ":");
    this.jmU.append(paramInt + ":");
    AppMethodBeat.o(114938);
  }

  public final void bB(String paramString, int paramInt)
  {
    AppMethodBeat.i(114939);
    ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo openStarAppBrand id: %s, pos: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.jnd.append(paramString + ":");
    this.jng.append(paramInt + ":");
    AppMethodBeat.o(114939);
  }

  public final void dw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114936);
    this.jmK = (System.currentTimeMillis() / 1000L);
    this.jmN = paramInt1;
    this.jmW = paramInt2;
    AppMethodBeat.o(114936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.b
 * JD-Core Version:    0.6.2
 */