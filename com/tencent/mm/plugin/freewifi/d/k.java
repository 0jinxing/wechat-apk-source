package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.buc;
import com.tencent.mm.protocal.protobuf.di;
import com.tencent.mm.protocal.protobuf.lf;
import com.tencent.mm.protocal.protobuf.lg;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class k extends c
{
  public k(String paramString1, buc parambuc, int paramInt, String paramString2)
  {
    AppMethodBeat.i(20796);
    bzd();
    if ((8 != paramInt) || (9 != paramInt))
      ab.e("MicroMsg.FreeWifi.NetSceneScanAndReportNearFieldFreeWifi", "invalid channel, channel is :%d", new Object[] { Integer.valueOf(paramInt) });
    lf locallf = (lf)this.ehh.fsG.fsP;
    locallf.vMR = paramString1;
    locallf.vOL = parambuc;
    locallf.vAM = paramInt;
    locallf.vAN = paramString2;
    AppMethodBeat.o(20796);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20795);
    b.a locala = new b.a();
    locala.fsJ = new lf();
    locala.fsK = new lg();
    locala.uri = "/cgi-bin/mmo2o-bin/bizwificonnect";
    locala.fsI = 1705;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20795);
  }

  public final String bzq()
  {
    AppMethodBeat.i(20797);
    Object localObject = ((lg)this.ehh.fsH.fsP).vOM;
    if ((localObject != null) && (((LinkedList)localObject).size() == 1))
    {
      localObject = ((di)((LinkedList)localObject).get(0)).vFm;
      AppMethodBeat.o(20797);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(20797);
    }
  }

  public final int getType()
  {
    return 1705;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.k
 * JD-Core Version:    0.6.2
 */