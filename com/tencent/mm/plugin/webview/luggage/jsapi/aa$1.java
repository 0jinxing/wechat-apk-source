package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.ipcinvoker.l;

final class aa$1
  implements w.a
{
  aa$1(aa paramaa, bc.a parama, String paramString1, Context paramContext, Bundle paramBundle, String paramString2, String paramString3, String paramString4)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(6328);
    l.post(new aa.1.1(this, paramInt1, paramInt2, paramString, paramb));
    AppMethodBeat.o(6328);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aa.1
 * JD-Core Version:    0.6.2
 */