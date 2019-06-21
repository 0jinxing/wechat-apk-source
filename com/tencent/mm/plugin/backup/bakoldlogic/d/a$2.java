package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17999);
    Iterator localIterator = this.jAN.jyk.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (a.a)localIterator.next();
      if ((((a.a)localObject).type == 2) && (((a.a)localObject).obj != null) && ((((a.a)localObject).obj instanceof String)))
      {
        localObject = (String)((a.a)localObject).obj;
        ab.d("MicroMsg.BakOldRecoverDelayData", "getContact:".concat(String.valueOf(localObject)));
        ao.a.flu.ai((String)localObject, "");
      }
      else if ((((a.a)localObject).type == 1) && (((a.a)localObject).obj != null) && ((((a.a)localObject).obj instanceof String)))
      {
        am.bYI().aiH((String)((a.a)localObject).obj);
      }
    }
    this.jAN.jyk.clear();
    AppMethodBeat.o(17999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.a.2
 * JD-Core Version:    0.6.2
 */