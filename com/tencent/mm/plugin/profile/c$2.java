package com.tencent.mm.plugin.profile;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.profile.b.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class c$2
  implements o
{
  c$2(c paramc)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(23243);
    if (bo.nullAsNil(paramString).equals("NewXmlOpenIMFriReqAcceptedInWxWork"))
      new e(paramMap).aip();
    AppMethodBeat.o(23243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.c.2
 * JD-Core Version:    0.6.2
 */