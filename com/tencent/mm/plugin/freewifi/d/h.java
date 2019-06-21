package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.acq;
import com.tencent.mm.protocal.protobuf.ami;
import com.tencent.mm.protocal.protobuf.amj;

public final class h extends c
{
  public h(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(20790);
    bzd();
    ami localami = (ami)this.ehh.fsG.fsP;
    localami.appId = paramString1;
    localami.mzT = paramInt;
    localami.cxb = paramString2;
    AppMethodBeat.o(20790);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20789);
    b.a locala = new b.a();
    locala.fsJ = new ami();
    locala.fsK = new amj();
    locala.uri = "/cgi-bin/mmo2o-bin/getpcfrontpage";
    locala.fsI = 1760;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20789);
  }

  public final acq bzh()
  {
    Object localObject = (amj)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((amj)localObject).vAY; ; localObject = null)
      return localObject;
  }

  public final int getType()
  {
    return 1760;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.h
 * JD-Core Version:    0.6.2
 */