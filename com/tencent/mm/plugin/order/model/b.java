package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public HashSet<String> pbV;

  public b()
  {
    AppMethodBeat.i(43750);
    this.pbV = new HashSet();
    Km();
    AppMethodBeat.o(43750);
  }

  private void Km()
  {
    AppMethodBeat.i(43751);
    this.pbV.clear();
    g.RQ();
    Iterator localIterator = bo.P(((String)g.RP().Ry().get(204803, "")).split(";")).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bo.isNullOrNil(str)) && (!this.pbV.contains(str)))
        this.pbV.add(str);
    }
    g.RQ();
    g.RP().Ry().set(204817, Integer.valueOf(this.pbV.size()));
    ab.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + this.pbV.size());
    AppMethodBeat.o(43751);
  }

  public final void bYV()
  {
    AppMethodBeat.i(43752);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.pbV.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bo.isNullOrNil(str))
        localStringBuffer.append(str + ";");
    }
    g.RQ();
    g.RP().Ry().set(204803, localStringBuffer.toString());
    AppMethodBeat.o(43752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.b
 * JD-Core Version:    0.6.2
 */