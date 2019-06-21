package com.tencent.mm.model.d;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class a$2
  implements ao.b
{
  public a$2(a parama)
  {
  }

  public final String abq()
  {
    AppMethodBeat.i(16373);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("worker thread id = " + aw.RS().oAl.getLooper().getThread().getId() + "[" + aw.RS().doL() + "]\n");
    ((StringBuilder)localObject1).append("#cpu freq(KHz)[max=" + m.Lx() + ", min=" + m.Ly() + ", cur=" + m.Lz() + "]\n");
    Object localObject2 = new LinkedList(a.e(this.fph));
    Iterator localIterator = ((LinkedList)localObject2).iterator();
    ((StringBuilder)localObject1).append("#done tasks size = " + ((LinkedList)localObject2).size() + '\n');
    if (localIterator != null)
      for (int i = 0; (localIterator.hasNext()) && (i < a.k(this.fph)); i++)
      {
        localObject2 = (a.a)localIterator.next();
        ((StringBuilder)localObject1).append("[index = " + i + " | taskinfo:" + ((a.a)localObject2).info + "]\n");
      }
    ((StringBuilder)localObject1).append("\n#waiting" + aw.RS().doN().dump(false));
    localObject1 = ((StringBuilder)localObject1).toString();
    AppMethodBeat.o(16373);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.a.2
 * JD-Core Version:    0.6.2
 */