package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e
{
  private static final Integer qTc;
  public static e qTd;
  public int eFs;
  public y ecO;
  public HashMap<String, Integer> qTe;
  public HashMap<String, String> qTf;
  public HashSet<String> qTg;
  private LinkedHashMap<Long, Object> qTh;
  private int qTi;
  public int qTj;
  public int qTk;
  private com.tencent.mm.sdk.b.c<fa> qTl;

  static
  {
    AppMethodBeat.i(36891);
    qTc = Integer.valueOf(1);
    qTd = new e();
    AppMethodBeat.o(36891);
  }

  private e()
  {
    AppMethodBeat.i(36883);
    this.qTi = 0;
    this.qTj = 200;
    this.qTk = 86400;
    this.eFs = 0;
    this.qTl = new e.2(this);
    Object localObject1 = com.tencent.mm.model.c.c.abi().ll("100077");
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject1 = ((com.tencent.mm.storage.c)localObject1).dru();
      this.qTj = bo.getInt((String)((Map)localObject1).get("maxCacheFeedCount"), 200);
      this.qTk = bo.getInt((String)((Map)localObject1).get("maxCacheSeconds"), 86400);
      this.eFs = bo.getInt((String)((Map)localObject1).get("needUploadData"), 0);
    }
    ab.i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", new Object[] { Integer.valueOf(this.qTj), Integer.valueOf(this.qTk), Integer.valueOf(this.eFs) });
    coF();
    this.ecO = new y(ac.eSj + "snsreport.cfg");
    localObject1 = this.ecO.get(3, new HashMap());
    Object localObject2 = this.ecO.get(4, new HashMap());
    Object localObject3 = this.ecO.get(5, new HashSet());
    Object localObject4 = this.ecO.get(6, new LinkedHashMap());
    if ((!(localObject1 instanceof HashMap)) || (!(localObject2 instanceof HashMap)) || (!(localObject3 instanceof HashSet)) || (!(localObject4 instanceof LinkedHashMap)))
    {
      com.tencent.mm.vfs.e.deleteFile(ac.eSj + "snsreport.cfg");
      this.qTe = new HashMap();
      this.qTf = new HashMap();
      this.qTg = new HashSet();
    }
    for (this.qTh = new LinkedHashMap(); ; this.qTh = ((LinkedHashMap)localObject4))
    {
      ab.d("MicroMsg.SnsReportHelper", "obj[%d] objForAppId[%d] objForFold[%d] objForAppIdCgi[%d] ", new Object[] { Integer.valueOf(this.qTe.size()), Integer.valueOf(this.qTf.size()), Integer.valueOf(this.qTg.size()), Integer.valueOf(this.qTh.size()) });
      com.tencent.mm.sdk.b.a.xxA.b(this.qTl);
      AppMethodBeat.o(36883);
      return;
      this.qTe = ((HashMap)localObject1);
      this.qTf = ((HashMap)localObject2);
      this.qTg = ((HashSet)localObject3);
    }
  }

  private void coF()
  {
    AppMethodBeat.i(36886);
    this.qTi = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFO, 0);
    ab.i("MicroMsg.SnsReportHelper", "resetXExptControl maxFeedIdForCgiRecord[%d]", new Object[] { Integer.valueOf(this.qTi) });
    AppMethodBeat.o(36886);
  }

  public final void bl(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(36884);
    if (this.eFs == 0)
    {
      AppMethodBeat.o(36884);
      return;
    }
    HashMap localHashMap = this.qTe;
    if (this.qTe.containsKey(paramString));
    for (int i = ((Integer)this.qTe.get(paramString)).intValue() + 1; ; i = 1)
    {
      localHashMap.put(paramString, Integer.valueOf(i));
      if (paramBoolean)
        this.qTg.add(paramString);
      AppMethodBeat.o(36884);
      break;
    }
  }

  public final void coG()
  {
    try
    {
      AppMethodBeat.i(138380);
      if (this.qTi <= 0)
        AppMethodBeat.o(138380);
      while (true)
      {
        return;
        LinkedHashMap localLinkedHashMap = (LinkedHashMap)this.qTh.clone();
        e.1 local1 = new com/tencent/mm/plugin/sns/i/e$1;
        local1.<init>(this, localLinkedHashMap);
        com.tencent.mm.sdk.g.d.post(local1, "save_exposure_feed");
        AppMethodBeat.o(138380);
      }
    }
    finally
    {
    }
  }

  public final LinkedList<Long> coH()
  {
    try
    {
      AppMethodBeat.i(138381);
      Object localObject1 = (LinkedHashMap)this.qTh.clone();
      Object localObject2;
      if ((((LinkedHashMap)localObject1).size() <= 0) || (this.qTi <= 0))
      {
        localObject2 = null;
        AppMethodBeat.o(138381);
      }
      while (true)
      {
        return localObject2;
        localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        int i = 0;
        localObject1 = ((LinkedHashMap)localObject1).keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          ((LinkedList)localObject2).addFirst((Long)((Iterator)localObject1).next());
          i++;
          if (i > this.qTi)
            ((LinkedList)localObject2).removeLast();
        }
        AppMethodBeat.o(138381);
      }
    }
    finally
    {
    }
  }

  public final void gh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36885);
    if ((this.eFs == 0) || (bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(36885);
    while (true)
    {
      return;
      this.qTf.put(paramString1, paramString2);
      AppMethodBeat.o(36885);
    }
  }

  public final void kr(long paramLong)
  {
    try
    {
      AppMethodBeat.i(36887);
      if (this.qTi > 0)
        this.qTh.put(Long.valueOf(paramLong), qTc);
      AppMethodBeat.o(36887);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.e
 * JD-Core Version:    0.6.2
 */