package com.tencent.mm.modelstat;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class c$a
{
  Map<String, Boolean> fRF;
  long fRG;
  long fRH;
  List<c.c> fRP;

  private c$a()
  {
    AppMethodBeat.i(78663);
    this.fRP = new ArrayList();
    this.fRF = new HashMap();
    AppMethodBeat.o(78663);
  }

  static a tH(String paramString)
  {
    AppMethodBeat.i(78665);
    a locala = new a();
    Map localMap;
    try
    {
      localMap = br.z(paramString, "eventSampleConf");
      if (localMap == null)
      {
        ab.e("MicroMsg.ClickFlowStatReceiver", "Config.parseString unable parse XML: %s", new Object[] { paramString });
        paramString = new com/tencent/mm/modelstat/c$a$a;
        paramString.<init>("reportConfigMap is null");
        AppMethodBeat.o(78665);
        throw paramString;
      }
    }
    catch (Exception paramString)
    {
      paramString = new a(paramString);
      AppMethodBeat.o(78665);
      throw paramString;
    }
    locala.fRG = bo.getLong((String)localMap.get(".eventSampleConf.nextUpdateInterval"), 0L);
    if ((locala.fRG <= 0L) || (locala.fRG > 432000L))
      locala.fRG = 432000L;
    locala.fRH = bo.getLong((String)localMap.get(".eventSampleConf.samplePeriod"), 0L);
    for (int i = 0; ; i++)
    {
      c.c localc = new com/tencent/mm/modelstat/c$c;
      localc.<init>((byte)0);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(".eventSampleConf.events.event");
      if (i > 0)
      {
        paramString = Integer.valueOf(i);
        localObject1 = paramString + ".";
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.id = bo.getInt((String)localMap.get((String)localObject1 + "id"), 0);
        if (localc.id <= 0)
          break;
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.fRS = bo.getLong((String)localMap.get((String)localObject1 + "expireTime"), 0L);
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.name = ((String)localMap.get((String)localObject1 + "name"));
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.fRT = bo.getFloat((String)localMap.get((String)localObject1 + "rate"), 0.0F);
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.eBH = bo.getInt((String)localMap.get((String)localObject1 + "logId"), 0);
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localc.fRU = ((String)localMap.get((String)localObject1 + "pages.$type"));
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        j = 0;
        label441: paramString = new java/lang/StringBuilder;
        paramString.<init>();
        localObject2 = paramString.append((String)localObject1).append("pages.page");
        if (j <= 0)
          break label619;
      }
      Object localObject3;
      label619: for (paramString = Integer.valueOf(j); ; paramString = "")
      {
        paramString = paramString + ".";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (String)localMap.get(paramString + "$id");
        if (localObject2 == null)
          break label625;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        boolean bool = ((String)localMap.get(paramString + "$action")).equals("true");
        paramString = new android/util/Pair;
        paramString.<init>(localObject2, Boolean.valueOf(bool));
        localArrayList.add(paramString);
        locala.fRF.put(localObject2, Boolean.valueOf(bool));
        j++;
        break label441;
        paramString = "";
        break;
      }
      label625: localc.fRV = localArrayList;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = 0;
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      Object localObject2 = paramString.append((String)localObject1).append("specialPVPages.pageItem");
      if (j > 0);
      for (paramString = Integer.valueOf(j); ; paramString = "")
      {
        localObject2 = paramString + ".";
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString = (String)localMap.get((String)localObject2 + "$prePage");
        if (paramString == null)
          break label798;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = (String)localMap.get((String)localObject2 + "$page");
        localObject2 = new android/util/Pair;
        ((Pair)localObject2).<init>(paramString, localObject3);
        localArrayList.add(localObject2);
        j++;
        break;
      }
      label798: localc.fRW = localArrayList;
      locala.fRP.add(localc);
      ab.i("MicroMsg.ClickFlowStatReceiver", "Config.parseString Event: %s", new Object[] { localc });
    }
    ab.v("MicroMsg.ClickFlowStatReceiver", "Config.parseString %s", new Object[] { locala });
    AppMethodBeat.o(78665);
    return locala;
  }

  public final String toString()
  {
    AppMethodBeat.i(78664);
    String str = "Config{nextUpdateInterval=" + this.fRG + ", samplePeriod=" + this.fRH + ", eventList=" + this.fRP + '}';
    AppMethodBeat.o(78664);
    return str;
  }

  static final class a extends Exception
  {
    a(String paramString)
    {
      super();
    }

    a(Throwable paramThrowable)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.a
 * JD-Core Version:    0.6.2
 */