package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aww;
import com.tencent.mm.protocal.protobuf.awx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class w extends m
  implements k
{
  public b ehh;
  private f ehi;
  public String fwO;
  public int fwP;
  public String tag;

  public w(String paramString, LinkedList<String> paramLinkedList)
  {
    this(paramString, paramLinkedList, (byte)0);
  }

  private w(String paramString, LinkedList<String> paramLinkedList, byte paramByte)
  {
    AppMethodBeat.i(11455);
    this.fwP = 1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aww();
    ((b.a)localObject).fsK = new awx();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetinfolist";
    ((b.a)localObject).fsI = 675;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aww)this.ehh.fsG.fsP;
    ((aww)localObject).wAZ = paramString;
    ((aww)localObject).wBc = paramLinkedList;
    this.fwO = paramString;
    this.fwP = 1;
    AppMethodBeat.o(11455);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11457);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneKFGetInfoList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11457);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11456);
    ab.i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11456);
  }

  public final awx aeO()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (awx localawx = (awx)this.ehh.fsH.fsP; ; localawx = null)
      return localawx;
  }

  public final int getType()
  {
    return 675;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.w
 * JD-Core Version:    0.6.2
 */