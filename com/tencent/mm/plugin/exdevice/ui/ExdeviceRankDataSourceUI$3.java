package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cmk;
import java.util.Iterator;
import java.util.List;

final class ExdeviceRankDataSourceUI$3
  implements Runnable
{
  ExdeviceRankDataSourceUI$3(ExdeviceRankDataSourceUI paramExdeviceRankDataSourceUI, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20116);
    ExdeviceRankDataSourceUI.b localb = ExdeviceRankDataSourceUI.b(this.lDa);
    Object localObject = this.lDb;
    localb.lDe.clear();
    if ((localObject == null) || (((List)localObject).size() == 0));
    while (true)
    {
      ExdeviceRankDataSourceUI.b(this.lDa).notifyDataSetChanged();
      AppMethodBeat.o(20116);
      return;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (cmk)localIterator.next();
        if (localObject != null)
          localb.lDe.add(ExdeviceRankDataSourceUI.a((cmk)localObject));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI.3
 * JD-Core Version:    0.6.2
 */