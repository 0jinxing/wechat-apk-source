package com.tencent.mm.plugin.wear.model.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.protobuf.cty;
import com.tencent.mm.protocal.protobuf.ctz;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h extends b
{
  private long cSh;
  private String cSi;
  private List<String> cSj;
  private long cvx;

  public h(long paramLong1, long paramLong2, String paramString, List<String> paramList)
  {
    this.cvx = paramLong1;
    this.cSh = paramLong2;
    this.cSi = paramString;
    this.cSj = paramList;
  }

  public final String getName()
  {
    return "WearLuckyReceiveTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26446);
    cty localcty = new cty();
    localcty.xqz = this.cSh;
    localcty.vIs = this.cvx;
    localcty.xqA = this.cSi;
    try
    {
      if (this.cSj == null)
        break label180;
      Iterator localIterator = this.cSj.iterator();
      while (localIterator.hasNext())
      {
        String[] arrayOfString = ((String)localIterator.next()).split("=");
        ctz localctz = new com/tencent/mm/protocal/protobuf/ctz;
        localctz.<init>();
        localctz.wyw = arrayOfString[0];
        localctz.jCH = arrayOfString[1];
        if (localctz.jCH.startsWith("wxid"))
          localctz.jCH = s.mJ(localctz.jCH);
        localctz.xqz = Long.valueOf(arrayOfString[2]).longValue();
        localcty.xqB.add(localctz);
      }
    }
    catch (Exception localException)
    {
    }
    if (this.cSh > 0L)
    {
      com.tencent.mm.plugin.wear.model.c.a.nD(true);
      AppMethodBeat.o(26446);
    }
    while (true)
    {
      return;
      label180: com.tencent.mm.plugin.wear.model.a.cUn();
      r.b(20015, localcty.toByteArray(), true);
      break;
      com.tencent.mm.plugin.wear.model.c.a.nD(false);
      AppMethodBeat.o(26446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.h
 * JD-Core Version:    0.6.2
 */