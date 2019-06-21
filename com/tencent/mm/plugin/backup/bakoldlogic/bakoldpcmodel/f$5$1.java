package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.bakoldlogic.d.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

final class f$5$1
  implements Runnable
{
  f$5$1(f.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17866);
    ab.i("MicroMsg.RecoverPCServer", "readFromSdcard end");
    ab.dot();
    a.aUB().aUC().jzL = 7;
    this.jAc.jzZ.jzU = 0;
    Object localObject1;
    Object localObject2;
    if (this.jAc.jzZ.jzs != null)
    {
      this.jAc.jzZ.jzs.aSt();
      e.aUN();
      new com.tencent.mm.plugin.backup.bakoldlogic.c.b(8).aUc();
      ab.i("MicroMsg.RecoverPCServer", "recover ok");
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xPH, Boolean.TRUE);
      localObject1 = a.aUB().aUD();
      ((c)localObject1).jzo += 1;
      a.aUB().aUC().jzK = 7;
      this.jAc.jzZ.cancel();
      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aVa();
      localObject1 = new StringBuffer();
      localObject2 = ((com.tencent.mm.plugin.backup.bakoldlogic.d.a)localObject2).jyk.iterator();
    }
    while (true)
    {
      if (!((Iterator)localObject2).hasNext())
        break label343;
      a.a locala = (a.a)((Iterator)localObject2).next();
      String str;
      if ((locala.type == 2) && (locala.obj != null) && ((locala.obj instanceof String)))
      {
        str = (String)locala.obj;
        ((StringBuffer)localObject1).append(locala.type + " : " + str + " ,");
        continue;
        ab.i("MicroMsg.RecoverPCServer", "operatorCallback is null");
        break;
      }
      if ((locala.type == 1) && (locala.obj != null) && ((locala.obj instanceof String)))
      {
        str = (String)locala.obj;
        ((StringBuffer)localObject1).append(locala.type + " : " + str + " ,");
      }
    }
    label343: ab.d("MicroMsg.BakOldRecoverDelayData", "dump delay " + ((StringBuffer)localObject1).toString());
    AppMethodBeat.o(17866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f.5.1
 * JD-Core Version:    0.6.2
 */