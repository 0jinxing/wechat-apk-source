package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.acl;
import com.tencent.mm.protocal.protobuf.acm;
import com.tencent.mm.protocal.protobuf.acn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

public final class e extends c
{
  public e(LinkedList<acl> paramLinkedList)
  {
    AppMethodBeat.i(20782);
    bzd();
    if (paramLinkedList.size() > 0)
      ((acm)this.ehh.fsG.fsP).wkj = paramLinkedList;
    AppMethodBeat.o(20782);
  }

  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(20783);
    ab.i("MicroMsg.FreeWifi.NetSceneFreeWifiReport", "doBeforeCallback. netId=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (m.eg(paramInt2, paramInt3))
      j.bza().byI().post(new e.1(this));
    AppMethodBeat.o(20783);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20781);
    b.a locala = new b.a();
    locala.fsJ = new acm();
    locala.fsK = new acn();
    locala.uri = "/cgi-bin/mmo2o-bin/freewifireport";
    locala.fsI = 1781;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20781);
  }

  public final LinkedList<acl> bzl()
  {
    Object localObject = (acn)this.ehh.fsH.fsP;
    if (localObject == null);
    for (localObject = null; ; localObject = ((acn)localObject).wkj)
      return localObject;
  }

  public final int getType()
  {
    return 1781;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.e
 * JD-Core Version:    0.6.2
 */