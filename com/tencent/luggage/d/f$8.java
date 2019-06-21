package com.tencent.luggage.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class f$8 extends g
{
  f$8(f paramf)
  {
  }

  final Context getContext()
  {
    return this.bPt.mContext;
  }

  public final k xd()
  {
    AppMethodBeat.i(90783);
    k localk = f.a(this.bPt);
    AppMethodBeat.o(90783);
    return localk;
  }

  final Class<? extends com.tencent.luggage.webview.a> xe()
  {
    AppMethodBeat.i(90781);
    Class localClass = this.bPt.xe();
    AppMethodBeat.o(90781);
    return localClass;
  }

  public final LinkedList<e> xh()
  {
    return this.bPt.bPk;
  }

  public final h xi()
  {
    return this.bPt;
  }

  public final LinkedList<Class<? extends a>> xj()
  {
    AppMethodBeat.i(90782);
    LinkedList localLinkedList = (LinkedList)this.bPt.bPl.bPc.clone();
    AppMethodBeat.o(90782);
    return localLinkedList;
  }

  public final com.tencent.luggage.g.e xk()
  {
    return this.bPt.bPm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.f.8
 * JD-Core Version:    0.6.2
 */