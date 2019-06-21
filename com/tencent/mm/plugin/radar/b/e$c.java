package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bpb;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarManager$LatestChangeStat;", "", "member", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "state", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "(Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "getMember", "()Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "getState", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-radar_release"})
public final class e$c
{
  public final bpb pBK;
  public final c.e pBL;

  public e$c(bpb parambpb, c.e parame)
  {
    AppMethodBeat.i(102907);
    this.pBK = parambpb;
    this.pBL = parame;
    AppMethodBeat.o(102907);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(102910);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((!j.j(this.pBK, paramObject.pBK)) || (!j.j(this.pBL, paramObject.pBL)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(102910);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102910);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(102909);
    Object localObject = this.pBK;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.pBL;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(102909);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(102908);
    String str = "LatestChangeStat(member=" + this.pBK + ", state=" + this.pBL + ")";
    AppMethodBeat.o(102908);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e.c
 * JD-Core Version:    0.6.2
 */