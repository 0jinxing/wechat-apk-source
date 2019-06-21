package com.tencent.mm.ipcinvoker.wx_extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  public static void a(com.tencent.mm.ai.b paramb, b.a parama)
  {
    AppMethodBeat.i(126200);
    if (ah.bqo())
    {
      w.a(paramb, new w.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, m paramAnonymousm)
        {
          AppMethodBeat.i(126196);
          if (this.eGI != null)
            this.eGI.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb);
          AppMethodBeat.o(126196);
          return 0;
        }
      }
      , true);
      AppMethodBeat.o(126200);
    }
    while (true)
    {
      return;
      XIPCInvoker.a("com.tencent.mm", paramb, b.b.class, new c()
      {
      });
      AppMethodBeat.o(126200);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.b
 * JD-Core Version:    0.6.2
 */