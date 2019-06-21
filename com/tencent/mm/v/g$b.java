package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.u.b.a;
import com.tencent.mm.u.d;
import com.tencent.mm.u.e;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/executor/OpUpdateExecutor$onTaskExpired$1", "Lcom/tencent/mm/engine/FunctionMsgFetcher$IFunctionMsgFetcherCallback;", "onFailFetch", "", "item", "Lcom/tencent/mm/api/FunctionMsgItem;", "onSuccessFetch", "plugin-functionmsg_release"})
public final class g$b
  implements b.a
{
  g$b(e parame, d paramd, f paramf, com.tencent.mm.api.l paraml)
  {
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(35493);
    j.p(paramf, "item");
    ab.i("FunctionMsg.OpUpdateExecutor", "[onSuccessFetch] item:".concat(String.valueOf(paramf)));
    if (paramf.An() > cb.aaD() / 1000L)
    {
      this.eAO.a(0, paramf, this.eAP.eAI);
      AppMethodBeat.o(35493);
    }
    while (true)
    {
      return;
      ab.i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] to show! id:" + this.eAQ.Ai());
      this.eAR.a(paramf.Ai(), paramf, paramf.Al());
      AppMethodBeat.o(35493);
    }
  }

  public final void b(f paramf)
  {
    AppMethodBeat.i(35492);
    j.p(paramf, "item");
    ab.w("FunctionMsg.OpUpdateExecutor", "[onFailFetch] item:".concat(String.valueOf(paramf)));
    if (paramf.getStatus() == -1)
      this.eAO.a(-1, paramf, this.eAP.eAI);
    AppMethodBeat.o(35492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.g.b
 * JD-Core Version:    0.6.2
 */