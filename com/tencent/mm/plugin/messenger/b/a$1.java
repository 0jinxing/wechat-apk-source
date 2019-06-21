package com.tencent.mm.plugin.messenger.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class a$1
  implements o
{
  a$1(a parama)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(136919);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: on new xml received: %s", new Object[] { paramMap.toString() });
    a.a(this.ora, paramString, paramMap, parama);
    AppMethodBeat.o(136919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.b.a.1
 * JD-Core Version:    0.6.2
 */