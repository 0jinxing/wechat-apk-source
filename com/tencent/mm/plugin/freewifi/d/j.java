package com.tencent.mm.plugin.freewifi.d;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.bai;
import com.tencent.mm.protocal.protobuf.baj;
import com.tencent.mm.protocal.protobuf.bak;
import java.util.LinkedList;

public final class j extends c
{
  public j(LinkedList<bak> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(20794);
    bzd();
    bai localbai = (bai)this.ehh.fsG.fsP;
    localbai.wEf = Build.BRAND;
    localbai.wEe = paramInt;
    localbai.wEd = paramLinkedList;
    AppMethodBeat.o(20794);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20793);
    b.a locala = new b.a();
    locala.fsJ = new bai();
    locala.fsK = new baj();
    locala.uri = "/cgi-bin/mmo2o-bin/manufacturerapinfo";
    locala.fsI = 1707;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20793);
  }

  public final baj bzp()
  {
    return (baj)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1707;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.j
 * JD-Core Version:    0.6.2
 */