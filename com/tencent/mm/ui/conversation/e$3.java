package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class e$3
  implements Runnable
{
  e$3(e parame, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34187);
    Object localObject = ((a)g.K(a.class)).b(0L, this.fOH);
    if ((localObject == null) || (((o)localObject).fjr.size() == 0))
      AppMethodBeat.o(34187);
    while (true)
    {
      return;
      localObject = (p)((o)localObject).fjr.getFirst();
      ((b)g.K(b.class)).a(((p)localObject).url, ((p)localObject).type, 92, new Object[0]);
      ab.v("MicroMsg.ConversationAdapter", "terry trace preload:%s", new Object[] { ((p)localObject).title });
      AppMethodBeat.o(34187);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.e.3
 * JD-Core Version:    0.6.2
 */