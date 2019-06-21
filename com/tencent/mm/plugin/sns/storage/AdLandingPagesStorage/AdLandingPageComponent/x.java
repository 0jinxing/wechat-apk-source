package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class x extends r
{
  public boolean iXr;
  public LinkedList<l> qWB;
  public int qXu;

  public x()
  {
    AppMethodBeat.i(36945);
    this.qWB = new LinkedList();
    this.qXu = 0;
    this.iXr = true;
    AppMethodBeat.o(36945);
  }

  public final List<r> cpf()
  {
    AppMethodBeat.i(36946);
    ArrayList localArrayList = new ArrayList(super.cpf());
    if (this.qWB != null)
    {
      Iterator localIterator = this.qWB.iterator();
      while (localIterator.hasNext())
      {
        l locall = (l)localIterator.next();
        if (locall.qWB != null)
          localArrayList.addAll(locall.qWB);
      }
    }
    AppMethodBeat.o(36946);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x
 * JD-Core Version:    0.6.2
 */