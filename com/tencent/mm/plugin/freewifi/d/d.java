package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.re;
import com.tencent.mm.protocal.protobuf.rf;

public final class d extends c
{
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    AppMethodBeat.i(20780);
    bzd();
    re localre = (re)this.ehh.fsG.fsP;
    localre.vYm = paramString1;
    localre.vYn = paramString2;
    localre.vYo = paramString3;
    localre.vYp = paramString4;
    localre.vYq = paramString5;
    localre.vYr = paramLong;
    localre.vYs = paramString6;
    localre.vYt = paramString7;
    AppMethodBeat.o(20780);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20779);
    b.a locala = new b.a();
    locala.fsJ = new re();
    locala.fsK = new rf();
    locala.uri = "/cgi-bin/mmo2o-bin/checkifcallup";
    locala.fsI = 1155;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20779);
  }

  public final rf bzk()
  {
    return (rf)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1155;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.d
 * JD-Core Version:    0.6.2
 */