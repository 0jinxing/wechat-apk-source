package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class f$1
  implements g.a
{
  f$1(f paramf)
  {
  }

  public final void a(List<bau> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, int paramInt1, int paramInt2, fq paramfq)
  {
    AppMethodBeat.i(38081);
    ab.d("MicroMsg.ArtistAdapter", "onFinishFixPos");
    f localf = this.rgn;
    if ((paramList == null) || (paramList.size() <= 0))
      AppMethodBeat.o(38081);
    while (true)
    {
      return;
      try
      {
        fq localfq = new com/tencent/mm/protocal/protobuf/fq;
        localfq.<init>();
        localf.rgm = ((fq)localfq.parseFrom(paramfq.toByteArray()));
        localf.rgl.a(localf.rgm);
        ab.d("MicroMsg.ArtistAdapter", "copy list info");
        i = paramList.size();
        localf.list.clear();
        localf.rgf.clear();
        localf.rgg.clear();
        for (j = 0; j < i; j++)
        {
          paramfq = (bau)paramList.get(j);
          paramfq = e.a(paramfq.Id, paramfq.jCt, paramfq.Url, paramfq.wEH, paramfq.wEG, paramfq.wEI, paramfq.Desc);
          localf.list.add(paramfq);
        }
      }
      catch (Exception paramfq)
      {
        int i;
        int j;
        while (true)
          ab.printErrStackTrace("MicroMsg.ArtistAdapter", paramfq, "", new Object[0]);
        paramfq = paramMap1.keySet().iterator();
        while (paramfq.hasNext())
        {
          i = ((Integer)paramfq.next()).intValue();
          j = ((Integer)paramMap1.get(Integer.valueOf(i))).intValue();
          localf.rgf.put(Integer.valueOf(i), Integer.valueOf(j));
        }
        paramfq = paramMap2.keySet().iterator();
        while (paramfq.hasNext())
        {
          i = ((Integer)paramfq.next()).intValue();
          j = ((Integer)paramMap2.get(Integer.valueOf(i))).intValue();
          localf.rgg.put(Integer.valueOf(i), Integer.valueOf(j));
        }
        paramList.clear();
        paramMap1.clear();
        paramMap2.clear();
        localf.rgi = paramInt1;
        localf.rgh = paramInt2;
        ab.d("MicroMsg.ArtistAdapter", "reallyCount " + paramInt1 + " icount " + paramInt2);
        localf.notifyDataSetChanged();
        AppMethodBeat.o(38081);
      }
    }
  }

  public final void crw()
  {
    AppMethodBeat.i(38082);
    f localf = this.rgn;
    if (localf.rgl != null)
      localf.rgl.crx();
    AppMethodBeat.o(38082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.f.1
 * JD-Core Version:    0.6.2
 */