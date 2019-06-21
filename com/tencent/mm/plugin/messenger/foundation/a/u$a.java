package com.tencent.mm.plugin.messenger.foundation.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$a<T extends com.tencent.mm.bt.a> extends com.tencent.mm.ci.a<s<T>>
  implements s<T>
{
  public final void e(T paramT)
  {
    AppMethodBeat.i(60010);
    a(new u.a.2(this, paramT));
    AppMethodBeat.o(60010);
  }

  public final void f(T paramT)
  {
    AppMethodBeat.i(60009);
    a(new u.a.1(this, paramT));
    AppMethodBeat.o(60009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.u.a
 * JD-Core Version:    0.6.2
 */