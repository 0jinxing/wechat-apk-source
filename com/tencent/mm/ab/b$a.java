package com.tencent.mm.ab;

import a.f.a.a;
import a.f.b.k;
import a.f.b.u.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<no name provided>", "T", "invoke", "()Ljava/lang/Object;"})
public final class b$a extends k
  implements a<T>
{
  public b$a(u.b paramb, List paramList)
  {
    super(0);
  }

  public final T invoke()
  {
    AppMethodBeat.i(114169);
    Object localObject;
    if ((this.eOo.AVD < 0) || (this.eOo.AVD >= this.eOp.size()))
    {
      localObject = null;
      AppMethodBeat.o(114169);
    }
    while (true)
    {
      return localObject;
      List localList = this.eOp;
      localObject = this.eOo;
      int i = ((u.b)localObject).AVD;
      ((u.b)localObject).AVD = (i + 1);
      localObject = localList.get(i);
      AppMethodBeat.o(114169);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.b.a
 * JD-Core Version:    0.6.2
 */