package com.tencent.mm.u;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.v.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/engine/FunctionMsgTask;", "", "op", "", "item", "Lcom/tencent/mm/api/FunctionMsgItem;", "executor", "Lcom/tencent/mm/executor/IOpExecutor;", "(ILcom/tencent/mm/api/FunctionMsgItem;Lcom/tencent/mm/executor/IOpExecutor;)V", "mExecutor", "getMExecutor", "()Lcom/tencent/mm/executor/IOpExecutor;", "mItem", "getMItem", "()Lcom/tencent/mm/api/FunctionMsgItem;", "mOpCode", "getMOpCode", "()I", "equals", "", "other", "toString", "", "plugin-functionmsg_release"})
public final class d
{
  final int czW;
  public final f eAH;
  public final b eAI;

  public d(int paramInt, f paramf, b paramb)
  {
    AppMethodBeat.i(35470);
    this.czW = paramInt;
    this.eAH = paramf;
    this.eAI = paramb;
    AppMethodBeat.o(35470);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(35469);
    boolean bool;
    if ((paramObject instanceof d))
    {
      bool = j.j(((d)paramObject).eAH.Ai(), this.eAH.Ai());
      AppMethodBeat.o(35469);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35469);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(35468);
    String str = "FunctionMsgTask(mOpCode=" + this.czW + ", mItem=" + this.eAH + ')';
    AppMethodBeat.o(35468);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.d
 * JD-Core Version:    0.6.2
 */