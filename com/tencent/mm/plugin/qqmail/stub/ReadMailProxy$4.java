package com.tencent.mm.plugin.qqmail.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v.a;
import java.util.Map;

final class ReadMailProxy$4 extends v.a
{
  ReadMailProxy$4(ReadMailProxy paramReadMailProxy)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68093);
    this.pvP.CLIENT_CALL("onComplete", new Object[0]);
    AppMethodBeat.o(68093);
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68092);
    this.pvP.CLIENT_CALL("onError", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(68092);
  }

  public final boolean onReady()
  {
    AppMethodBeat.i(68090);
    boolean bool = ((Boolean)this.pvP.CLIENT_CALL("onReady", new Object[0])).booleanValue();
    AppMethodBeat.o(68090);
    return bool;
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68091);
    this.pvP.CLIENT_CALL("onSuccess", new Object[] { paramString, paramMap });
    AppMethodBeat.o(68091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy.4
 * JD-Core Version:    0.6.2
 */