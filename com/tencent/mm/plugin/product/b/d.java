package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public List<String> phg;

  public d()
  {
    AppMethodBeat.i(43979);
    this.phg = new ArrayList();
    Kh();
    AppMethodBeat.o(43979);
  }

  private void Kh()
  {
    AppMethodBeat.i(43980);
    this.phg.clear();
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(270340, "");
    ab.d("MicroMsg.MallNewsManager", "data : ".concat(String.valueOf(localObject)));
    localObject = bo.P(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bo.isNullOrNil(str))
        this.phg.add(str);
    }
    AppMethodBeat.o(43980);
  }

  public final boolean bZX()
  {
    AppMethodBeat.i(43981);
    ab.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.phg.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.phg.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bo.isNullOrNil(str)) && (!str.contains(";")))
        localStringBuffer.append(str);
    }
    ab.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    g.RQ();
    g.RP().Ry().set(270340, localStringBuffer.toString());
    AppMethodBeat.o(43981);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.d
 * JD-Core Version:    0.6.2
 */