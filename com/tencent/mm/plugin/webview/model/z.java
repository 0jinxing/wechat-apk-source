package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bmy;
import com.tencent.mm.protocal.protobuf.bmz;
import java.util.LinkedList;

public final class z extends m
  implements k
{
  private f eIc;
  private final b ehh;

  public z(int paramInt1, String paramString, LinkedList<String> paramLinkedList, int paramInt2)
  {
    AppMethodBeat.i(6640);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bmy();
    ((b.a)localObject).fsK = new bmz();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/qrconnect_authorize_confirm";
    ((b.a)localObject).fsI = 1137;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bmy)this.ehh.fsG.fsP;
    ((bmy)localObject).wII = paramInt1;
    ((bmy)localObject).wIH = paramString;
    ((bmy)localObject).wIJ = paramLinkedList;
    ((bmy)localObject).wcA = paramInt2;
    AppMethodBeat.o(6640);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6642);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6642);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6641);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6641);
  }

  public final int getType()
  {
    return 1137;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.z
 * JD-Core Version:    0.6.2
 */