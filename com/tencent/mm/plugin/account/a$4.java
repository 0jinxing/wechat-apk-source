package com.tencent.mm.plugin.account;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.d;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.w.b;

final class a$4 extends com.tencent.mm.plugin.fts.a.a.a
{
  a$4(a parama)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(124625);
    Object localObject = new com.tencent.mm.w.a();
    ((n)g.M(n.class)).registerIndexStorage((i)localObject);
    ((i)localObject).create();
    localObject = new b();
    ((n)g.M(n.class)).registerNativeLogic(9, (k)localObject);
    ((k)localObject).create();
    localObject = new com.tencent.mm.w.a.a();
    ((n)g.M(n.class)).registerFTSUILogic((d)localObject);
    AppMethodBeat.o(124625);
    return true;
  }

  public final String getName()
  {
    return "InitFTSFriendPluginTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.a.4
 * JD-Core Version:    0.6.2
 */