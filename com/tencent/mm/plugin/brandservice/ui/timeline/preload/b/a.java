package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.rw;
import com.tencent.mm.protocal.protobuf.rx;
import com.tencent.mm.protocal.protobuf.ry;
import java.util.LinkedList;

public final class a extends com.tencent.mm.ai.a<ry>
{
  public a(LinkedList<rw> paramLinkedList, int paramInt, String paramString)
  {
    AppMethodBeat.i(14407);
    b.a locala = new b.a();
    locala.fsI = 2731;
    locala.uri = "/cgi-bin/mmbiz-bin/checktmplver";
    locala.fsL = 0;
    locala.fsM = 0;
    rx localrx = new rx();
    localrx.Scene = paramInt;
    localrx.vKt = paramString;
    localrx.vZl = paramLinkedList;
    locala.fsJ = localrx;
    locala.fsK = new ry();
    this.ehh = locala.acD();
    AppMethodBeat.o(14407);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.a
 * JD-Core Version:    0.6.2
 */