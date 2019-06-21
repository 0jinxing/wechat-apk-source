package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.l.a;
import com.tencent.mm.l.a.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.g.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class n
{
  private static n fFN;
  ConcurrentHashMap<Long, d> fFL;
  public c fFM;
  public ConcurrentHashMap<Long, e> fFO;
  private ArrayList<Long> fFP;
  ArrayList<e> fFQ;

  public n()
  {
    AppMethodBeat.i(78370);
    this.fFL = new ConcurrentHashMap();
    this.fFO = new ConcurrentHashMap();
    this.fFP = new ArrayList();
    this.fFQ = new ArrayList();
    this.fFM = new c();
    AppMethodBeat.o(78370);
  }

  public static n ahb()
  {
    AppMethodBeat.i(78371);
    if (fFN == null);
    try
    {
      if (fFN == null)
      {
        localn = new com/tencent/mm/at/n;
        localn.<init>();
        fFN = localn;
      }
      n localn = fFN;
      AppMethodBeat.o(78371);
      return localn;
    }
    finally
    {
      AppMethodBeat.o(78371);
    }
  }

  private static int h(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(78380);
    int i;
    if (com.tencent.mm.model.r.g(paramString1, paramString2, paramBoolean))
    {
      i = 1;
      AppMethodBeat.o(78380);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(78380);
    }
  }

  private boolean ss(String paramString)
  {
    AppMethodBeat.i(78377);
    Iterator localIterator = this.fFQ.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((e)localIterator.next()).fGc.equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(78377);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78377);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(78379);
    if (ss(paramString1))
      AppMethodBeat.o(78379);
    while (true)
    {
      return;
      int i = h(paramString1, paramString2, paramBoolean);
      PString localPString = new PString();
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      b localb1 = null;
      b localb2 = null;
      Object localObject1 = null;
      Object localObject2 = null;
      if (ahc())
      {
        localObject2 = this.fFM.lF(1);
        localObject1 = this.fFM.lF(2);
        localb1 = ((b)localObject2).fFY;
        localb2 = ((b)localObject1).fFY;
        localObject1 = ((b)localObject1).fFZ;
        localObject2 = ((b)localObject2).fFZ;
      }
      o.ahl().a(paramString1, i, localPString, localPInt1, localPInt2, paramInt2, (String)localObject1);
      localObject1 = e.a(paramString1, i, paramInt1, paramInt2, (String)localObject1, (String)localObject2, localPString, localPInt1, localPInt2, localb1, localb2);
      ((e)localObject1).toUserName = paramString2;
      this.fFQ.add(localObject1);
      ab.i("MicroMsg.SendImgSpeeder", "summersafecdn img path %s has prebuild, user:%s", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(78379);
    }
  }

  public final void a(ArrayList<String> paramArrayList, boolean paramBoolean, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(78376);
    ab.i("MicroMsg.SendImgSpeeder", "summersafecdn sendThumbImg fileSize:%d, compressImg[%b], source[%d], user:%s", new Object[] { Integer.valueOf(paramArrayList.size()), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), paramString });
    Object localObject1 = this.fFQ.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (e)((Iterator)localObject1).next();
      if ((!paramArrayList.contains(((e)localObject2).fGc)) || ((!bo.isNullOrNil(((e)localObject2).toUserName)) && (!((e)localObject2).toUserName.equalsIgnoreCase(paramString))) || ((!bo.isNullOrNil(paramString)) && (!paramString.equalsIgnoreCase(((e)localObject2).toUserName))))
        ((Iterator)localObject1).remove();
      else
        ((e)localObject2).fDC = h(((e)localObject2).fGc, paramString, paramBoolean);
    }
    Object localObject2 = new ArrayList();
    Object localObject3 = paramArrayList.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      String str = (String)((Iterator)localObject3).next();
      localObject1 = this.fFQ.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        e locale = (e)((Iterator)localObject1).next();
        if (locale.fGc.equals(str))
          ((ArrayList)localObject2).add(locale);
      }
    }
    this.fFQ.clear();
    this.fFQ.addAll((Collection)localObject2);
    localObject1 = new ArrayList();
    if (paramArrayList.size() == 9)
    {
      com.tencent.mm.plugin.report.service.g.BN(18);
      localObject2 = paramArrayList.iterator();
    }
    while (true)
    {
      if (!((Iterator)localObject2).hasNext())
        break label471;
      paramArrayList = (String)((Iterator)localObject2).next();
      if ((paramArrayList == null) || (paramArrayList.equals("")) || (!com.tencent.mm.vfs.e.ct(paramArrayList)))
      {
        ab.d("MicroMsg.SendImgSpeeder", " doSendImage : filePath is null or empty");
        continue;
        if (paramArrayList.size() == 1)
        {
          boolean bool = at.isWifi(ah.getContext());
          com.tencent.mm.plugin.report.service.g.BN(25);
          if (!bool)
            break;
          if (com.tencent.mm.model.r.g((String)paramArrayList.get(0), paramString, paramBoolean))
          {
            com.tencent.mm.plugin.report.service.g.BN(23);
            break;
          }
          com.tencent.mm.plugin.report.service.g.BN(21);
          break;
        }
        com.tencent.mm.plugin.report.service.g.BN(24);
        break;
      }
      if (com.tencent.mm.sdk.platformtools.r.amo(paramArrayList))
        ab.i("MicroMsg.SendImgSpeeder", "[cpan] is gif coutinue. did not add filePath:%s filesize:%d", new Object[] { paramArrayList, Long.valueOf(com.tencent.mm.vfs.e.asZ(paramArrayList)) });
      else if (!ss(paramArrayList))
        ((ArrayList)localObject1).add(paramArrayList);
    }
    label471: paramArrayList = ((ArrayList)localObject1).iterator();
    while (paramArrayList.hasNext())
      a(paramInt1, paramInt2, (String)paramArrayList.next(), paramString, paramBoolean);
    localObject2 = new ArrayList();
    long l1 = com.tencent.mm.kernel.g.RP().eJN.iV(Thread.currentThread().getId());
    ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().QW("SendImgSpeeder");
    paramInt1 = 1;
    paramInt2 = 0;
    if (paramInt2 < this.fFQ.size())
    {
      localObject1 = (e)this.fFQ.get(paramInt2);
      if (com.tencent.mm.sdk.platformtools.r.amo(((e)localObject1).fGc))
        ab.i("MicroMsg.SendImgSpeeder", "[cpan] is gif coutinue. did not add to msg table");
      while (true)
      {
        paramInt2++;
        break;
        paramArrayList = new bi();
        paramArrayList.setType(t.nL(paramString));
        paramArrayList.ju(paramString);
        paramArrayList.hO(1);
        paramArrayList.setStatus(1);
        paramArrayList.jv(((e)localObject1).fGg.value);
        paramArrayList.hZ(((e)localObject1).fGh.value);
        paramArrayList.ia(((e)localObject1).fGi.value);
        localObject3 = bh.aae();
        if (((localObject3 != null) && (!((String)localObject3).equals(paramArrayList.dqJ))) || ((localObject3 == null) && (paramArrayList.dqJ != null)))
          paramArrayList.ix((String)localObject3);
        a.a.KG().g(paramArrayList);
        paramArrayList.eJ(bf.oC(paramArrayList.field_talker));
        ((ArrayList)localObject2).add(paramArrayList);
        long l2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(paramArrayList);
        if (l2 <= 0L)
        {
          ab.e("MicroMsg.SendImgSpeeder", "insert error! %s", new Object[] { paramString });
          paramInt1 = 0;
        }
        else
        {
          ((e)localObject1).cvx = l2;
          this.fFO.put(Long.valueOf(((e)localObject1).cvx), localObject1);
          this.fFP.add(Long.valueOf(((e)localObject1).cvx));
          paramInt1 = 0;
        }
      }
    }
    this.fFQ.clear();
    if (l1 > 0L)
      com.tencent.mm.kernel.g.RP().eJN.mB(l1);
    if (paramInt1 != 0)
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().QX("SendImgSpeeder");
    AppMethodBeat.o(78376);
  }

  public final boolean ahc()
  {
    AppMethodBeat.i(78378);
    boolean bool;
    if ((this.fFQ.size() > 0) && (g.a.cgs().pYi <= 2))
    {
      ab.i("MicroMsg.SendImgSpeeder", "cpu core is low ,do not use multi mode");
      bool = false;
      AppMethodBeat.o(78378);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(78378);
    }
  }

  public final boolean fL(long paramLong)
  {
    AppMethodBeat.i(78374);
    boolean bool = this.fFL.containsKey(Long.valueOf(paramLong));
    AppMethodBeat.o(78374);
    return bool;
  }

  public final d fM(long paramLong)
  {
    AppMethodBeat.i(78375);
    d locald = (d)this.fFL.get(Long.valueOf(paramLong));
    AppMethodBeat.o(78375);
    return locald;
  }

  public final ArrayList<String> sq(String paramString)
  {
    AppMethodBeat.i(78372);
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(paramString))
    {
      Iterator localIterator = this.fFO.values().iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        if (paramString.equals(locale.toUserName))
          localArrayList.add(locale.fGc);
      }
    }
    AppMethodBeat.o(78372);
    return localArrayList;
  }

  public final ArrayList<Integer> sr(String paramString)
  {
    AppMethodBeat.i(78373);
    Object localObject1 = this.fFO.values();
    Iterator localIterator = ((Collection)localObject1).iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      PString localPString = new PString();
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      locale.fGf = o.ahl().a(locale.fGc, locale.fDC, locale.cvd, locale.cDW, localPString, localPInt1, localPInt2, locale.fGd, locale.fGe, locale.cvx, locale.fGj, locale.fGk, locale.fGl);
      localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(locale.cvx);
      if (bo.isNullOrNil(((cy)localObject2).field_imgPath))
      {
        ((bi)localObject2).jv(localPString.value);
        ((bi)localObject2).hZ(localPInt1.value);
        ((bi)localObject2).ia(localPInt2.value);
        ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(locale.cvx, (bi)localObject2);
      }
    }
    if (!bo.isNullOrNil(paramString))
    {
      localObject1 = ((Collection)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (e)((Iterator)localObject1).next();
        if (!paramString.equals(((e)localObject2).toUserName))
        {
          this.fFO.remove(Long.valueOf(((e)localObject2).cvx));
          this.fFP.remove(Long.valueOf(((e)localObject2).cvx));
          ab.e("MicroMsg.SendImgSpeeder", "fatal!! Send user mis-match, want:%s, fact:%s", new Object[] { paramString, ((e)localObject2).toUserName });
        }
      }
    }
    paramString = new ArrayList();
    for (int i = 0; i < this.fFP.size(); i++)
      paramString.add(Integer.valueOf((int)((e)this.fFO.get(this.fFP.get(i))).fGf));
    this.fFO.clear();
    this.fFP.clear();
    ab.i("MicroMsg.SendImgSpeeder", "syncImgData, id size %d", new Object[] { Integer.valueOf(paramString.size()) });
    AppMethodBeat.o(78373);
    return paramString;
  }

  static final class b
  {
    b fFY;
    String fFZ;
  }

  public static final class c
  {
    public LinkedList<n.b> fGa;
    public LinkedList<n.b> fGb;

    public c()
    {
      AppMethodBeat.i(78361);
      this.fGa = new LinkedList();
      this.fGb = new LinkedList();
      AppMethodBeat.o(78361);
    }

    private void ahg()
    {
      try
      {
        AppMethodBeat.i(78367);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        for (int i = 0; i < this.fGa.size(); i++)
        {
          localStringBuilder.append(((n.b)this.fGa.get(i)).fFZ);
          if (i != this.fGa.size() - 1)
            localStringBuilder.append("-");
        }
        ab.d("MicroMsg.SendImgSpeeder", "sync big des to file %s ", new Object[] { localStringBuilder.toString() });
        com.tencent.mm.kernel.g.RP().Ry().set(348176, localStringBuilder.toString());
        AppMethodBeat.o(78367);
        return;
      }
      finally
      {
      }
    }

    private void ahh()
    {
      try
      {
        AppMethodBeat.i(78368);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        for (int i = 0; i < this.fGb.size(); i++)
        {
          localStringBuilder.append(((n.b)this.fGb.get(i)).fFZ);
          if (i != this.fGb.size() - 1)
            localStringBuilder.append("-");
        }
        ab.d("MicroMsg.SendImgSpeeder", "sync thumb des to file %s ", new Object[] { localStringBuilder.toString() });
        com.tencent.mm.kernel.g.RP().Ry().set(348177, localStringBuilder.toString());
        AppMethodBeat.o(78368);
        return;
      }
      finally
      {
      }
    }

    public static n.b st(String paramString)
    {
      AppMethodBeat.i(78363);
      n.b localb = new n.b((byte)0);
      if (bo.isNullOrNil(paramString))
      {
        localb.fFZ = g.agW();
        paramString = o.ahl().sm(localb.fFZ);
        if (sv(paramString))
          break label63;
        paramString = null;
        AppMethodBeat.o(78363);
      }
      while (true)
      {
        return paramString;
        localb.fFZ = paramString;
        break;
        label63: localb.fFY = new b(paramString);
        AppMethodBeat.o(78363);
        paramString = localb;
      }
    }

    public static n.b su(String paramString)
    {
      AppMethodBeat.i(78364);
      n.b localb = new n.b((byte)0);
      if (bo.isNullOrNil(paramString))
      {
        localb.fFZ = g.agW();
        paramString = o.ahl().sl(localb.fFZ);
        if (sv(paramString))
          break label63;
        paramString = null;
        AppMethodBeat.o(78364);
      }
      while (true)
      {
        return paramString;
        localb.fFZ = paramString;
        break;
        label63: localb.fFY = new b(paramString);
        AppMethodBeat.o(78364);
        paramString = localb;
      }
    }

    private static boolean sv(String paramString)
    {
      boolean bool = false;
      AppMethodBeat.i(78365);
      if (com.tencent.mm.vfs.e.asZ(paramString) > 0L)
      {
        ab.e("MicroMsg.SendImgSpeeder", "file has exist %s", new Object[] { paramString });
        AppMethodBeat.o(78365);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(78365);
        bool = true;
      }
    }

    public final void ahf()
    {
      int i = 0;
      try
      {
        AppMethodBeat.i(78362);
        int j = this.fGa.size();
        int k;
        n.b localb;
        if (j <= 0)
        {
          k = 5 - j;
          for (j = 0; j < k; j++)
          {
            localb = st(null);
            this.fGa.add(localb);
          }
          ab.i("MicroMsg.SendImgSpeeder", "add big File pool added size %d , all size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(this.fGa.size()) });
          ahg();
        }
        j = this.fGb.size();
        if (j <= 0)
        {
          k = 5 - j;
          for (j = i; j < k; j++)
          {
            localb = su(null);
            this.fGb.add(localb);
          }
          ahh();
          ab.i("MicroMsg.SendImgSpeeder", "add big thumb pool added size %d , all size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(this.fGb.size()) });
        }
        AppMethodBeat.o(78362);
        return;
      }
      finally
      {
      }
    }

    public final n.b lF(int paramInt)
    {
      n.b localb1 = null;
      while (true)
      {
        try
        {
          AppMethodBeat.i(78366);
          if (paramInt == 1)
          {
            if (this.fGa.size() > 0)
            {
              localb1 = (n.b)this.fGa.remove();
              ahg();
              ahf();
              AppMethodBeat.o(78366);
              return localb1;
            }
            localb1 = st(null);
            continue;
          }
          if (paramInt != 2)
            continue;
          if (this.fGb.size() > 0)
          {
            localb1 = (n.b)this.fGb.remove();
            ahh();
            continue;
          }
        }
        finally
        {
        }
        n.b localb2 = su(null);
      }
    }
  }

  public static final class d
  {
    public long cET;
    public long xb;
  }

  public static final class e
  {
    int cDW;
    int cvd;
    long cvx;
    int fDC;
    String fGc;
    String fGd;
    String fGe;
    long fGf;
    PString fGg;
    PInt fGh;
    PInt fGi;
    b fGj;
    b fGk;
    n.a fGl;
    String toUserName;

    public static e a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, PString paramPString, PInt paramPInt1, PInt paramPInt2, b paramb1, b paramb2)
    {
      AppMethodBeat.i(78369);
      e locale = new e();
      locale.fGc = paramString1;
      locale.fDC = paramInt1;
      locale.cvd = paramInt2;
      locale.cDW = paramInt3;
      locale.fGd = paramString2;
      locale.fGg = paramPString;
      locale.fGi = paramPInt2;
      locale.fGh = paramPInt1;
      locale.fGe = paramString3;
      locale.fGk = paramb2;
      locale.fGj = paramb1;
      if (n.ahd().ahc())
        n.a.a(locale);
      AppMethodBeat.o(78369);
      return locale;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.n
 * JD-Core Version:    0.6.2
 */