package com.tencent.mm.model.gdpr;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static void a(Context paramContext, a parama, String paramString, b paramb)
  {
    AppMethodBeat.i(1494);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    if (aaZ())
      if (bo.isNullOrNil(paramString))
      {
        paramb.kL(1);
        AppMethodBeat.o(1494);
      }
    while (true)
    {
      return;
      g.dOW().h(new c.2(parama, paramString, paramb)).g(new c.1(paramb, localContext, parama, paramString));
      AppMethodBeat.o(1494);
      continue;
      paramb.kL(0);
      AppMethodBeat.o(1494);
    }
  }

  public static boolean aaZ()
  {
    AppMethodBeat.i(1493);
    IPCBoolean localIPCBoolean = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, c.a.class);
    boolean bool;
    if ((localIPCBoolean != null) && (localIPCBoolean.value))
    {
      bool = true;
      AppMethodBeat.o(1493);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1493);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.c
 * JD-Core Version:    0.6.2
 */