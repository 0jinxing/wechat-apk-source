package com.tencent.mm.plugin.messenger.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Map;

final class a$2
  implements Runnable
{
  a$2(a parama, String paramString, e.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136920);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: adding Received listener: %s", new Object[] { this.orb });
    HashSet localHashSet1 = (HashSet)a.a(this.ora).get(this.orb);
    HashSet localHashSet2 = localHashSet1;
    if (localHashSet1 == null)
      localHashSet2 = new HashSet();
    if (!localHashSet2.contains(this.orc))
      localHashSet2.add(this.orc);
    a.a(this.ora).put(this.orb, localHashSet2);
    AppMethodBeat.o(136920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.b.a.2
 * JD-Core Version:    0.6.2
 */