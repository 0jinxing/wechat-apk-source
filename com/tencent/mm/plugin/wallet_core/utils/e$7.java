package com.tencent.mm.plugin.wallet_core.utils;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bdr;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.cgt;
import com.tencent.mm.protocal.protobuf.cgv;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e$7
  implements MenuItem.OnMenuItemClickListener
{
  public e$7(bdr parambdr, e.a parama, MMActivity paramMMActivity)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48022);
    Object localObject = this.tPr.wbo;
    paramMenuItem = new ArrayList();
    if ((localObject != null) && (((cgv)localObject).xfD != null) && (!((cgv)localObject).xfD.isEmpty()))
    {
      localObject = ((cgv)localObject).xfD.iterator();
      while (((Iterator)localObject).hasNext())
        paramMenuItem.add(((cgt)((Iterator)localObject).next()).vCP);
    }
    localObject = paramMenuItem.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramMenuItem = (btr)((Iterator)localObject).next();
      if (this.tPm != null)
      {
        e.a(this.icV, paramMenuItem);
        this.tPm.a(paramMenuItem);
      }
      else
      {
        e.a(this.icV, paramMenuItem);
      }
    }
    AppMethodBeat.o(48022);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.e.7
 * JD-Core Version:    0.6.2
 */