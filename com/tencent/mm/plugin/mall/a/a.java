package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.biu;
import com.tencent.mm.protocal.protobuf.hw;
import com.tencent.mm.protocal.protobuf.hx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class a extends com.tencent.mm.ai.a<hx>
{
  public List<biu> okJ;

  public a(LinkedList<biu> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(43092);
    hw localhw = new hw();
    localhw.vKm = paramLinkedList;
    localhw.vKn = paramInt;
    localhw.vKo = 0;
    b.a locala = new b.a();
    locala.fsJ = localhw;
    locala.fsK = new hx();
    locala.fsI = 2938;
    locala.uri = "/cgi-bin/micromsg-bin/batchfunctionoperate";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.okJ = paramLinkedList;
    ab.i("MicroMsg.CgiBatchFunctionOperate", "TpaCountry: %s", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(43092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.a
 * JD-Core Version:    0.6.2
 */