package com.tencent.mm.plugin.qqmail.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v.a;
import java.util.Map;

final class ReadMailProxy$3 extends v.a
{
  ReadMailProxy$3(ReadMailProxy paramReadMailProxy)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68089);
    this.pvP.CLIENT_CALL("onComplete", new Object[0]);
    AppMethodBeat.o(68089);
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68088);
    this.pvP.CLIENT_CALL("onError", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(68088);
  }

  public final boolean onReady()
  {
    AppMethodBeat.i(68086);
    boolean bool = ((Boolean)this.pvP.CLIENT_CALL("onReady", new Object[0])).booleanValue();
    AppMethodBeat.o(68086);
    return bool;
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68087);
    this.pvP.CLIENT_CALL("onSuccess", new Object[] { paramString, paramMap });
    AppMethodBeat.o(68087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy.3
 * JD-Core Version:    0.6.2
 */