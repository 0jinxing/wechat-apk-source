package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.protobuf.ajv;
import com.tencent.mm.protocal.protobuf.ajw;

public final class g extends c
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(20788);
    bzd();
    ajv localajv = (ajv)this.ehh.fsG.fsP;
    localajv.mvO = paramString1;
    localajv.mvP = paramString2;
    localajv.mvQ = paramString3;
    localajv.vBe = m.byv();
    AppMethodBeat.o(20788);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20787);
    b.a locala = new b.a();
    locala.fsJ = new ajv();
    locala.fsK = new ajw();
    locala.uri = "/cgi-bin/mmo2o-bin/getprotocol31schemaurl";
    locala.fsI = 1746;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20787);
  }

  public final String bzm()
  {
    return ((ajw)this.ehh.fsH.fsP).wpv;
  }

  public final int getType()
  {
    return 1746;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.g
 * JD-Core Version:    0.6.2
 */