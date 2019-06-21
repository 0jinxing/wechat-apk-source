package com.tencent.mm.az;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bhp;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.LinkedList;
import java.util.List;

final class n$a extends ap
{
  public n$a(n paramn, List<j.b> paramList, LinkedList<Integer> paramLinkedList, LinkedList<bhp> paramLinkedList1)
  {
    super(g.RS().oAl.getLooper(), new n.a.1(paramn, paramLinkedList, paramLinkedList1, localLinkedList, paramList), true);
    AppMethodBeat.i(996);
    AppMethodBeat.o(996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.n.a
 * JD-Core Version:    0.6.2
 */