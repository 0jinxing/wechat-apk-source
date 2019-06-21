package com.tencent.mm.modelstat;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class c$c
{
  int eBH;
  long fRS;
  float fRT;
  String fRU;
  ArrayList<Pair<String, Boolean>> fRV;
  ArrayList<Pair<String, String>> fRW;
  int id;
  String name;

  private c$c()
  {
    AppMethodBeat.i(78667);
    this.fRV = new ArrayList();
    this.fRW = new ArrayList();
    AppMethodBeat.o(78667);
  }

  public final String toString()
  {
    AppMethodBeat.i(78668);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("ReportConfigEvent{");
    ((StringBuilder)localObject1).append("id=" + this.id);
    ((StringBuilder)localObject1).append(", name='" + this.name + "'");
    ((StringBuilder)localObject1).append(", expireTime=" + this.fRS);
    ((StringBuilder)localObject1).append(", rate=" + this.fRT);
    ((StringBuilder)localObject1).append(", logId=" + this.eBH);
    ((StringBuilder)localObject1).append(", pagesType='" + this.fRU + "'");
    ((StringBuilder)localObject1).append(", pageList=[");
    Object localObject2 = this.fRV.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Pair)((Iterator)localObject2).next();
      ((StringBuilder)localObject1).append("{" + (String)((Pair)localObject3).first + "," + ((Pair)localObject3).second + "}");
      ((StringBuilder)localObject1).append(",");
    }
    ((StringBuilder)localObject1).append("]");
    ((StringBuilder)localObject1).append(", specialPVPages=[");
    Object localObject3 = this.fRW.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Pair)((Iterator)localObject3).next();
      ((StringBuilder)localObject1).append("{" + (String)((Pair)localObject2).first + "," + (String)((Pair)localObject2).second + "}");
      ((StringBuilder)localObject1).append(",");
    }
    ((StringBuilder)localObject1).append("]}");
    localObject1 = ((StringBuilder)localObject1).toString();
    AppMethodBeat.o(78668);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.c
 * JD-Core Version:    0.6.2
 */