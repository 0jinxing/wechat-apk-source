package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.Queue;

final class f$a
{
  Queue<j> bTe;

  f$a()
  {
    AppMethodBeat.i(115918);
    this.bTe = new LinkedList();
    AppMethodBeat.o(115918);
  }

  final j yH()
  {
    AppMethodBeat.i(115919);
    j localj = (j)this.bTe.poll();
    if (localj == null)
    {
      localj = new j();
      AppMethodBeat.o(115919);
    }
    while (true)
    {
      return localj;
      AppMethodBeat.o(115919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.f.a
 * JD-Core Version:    0.6.2
 */