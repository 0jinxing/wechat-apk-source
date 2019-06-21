package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ji;
import com.tencent.mm.protocal.protobuf.jj;
import com.tencent.mm.sdk.platformtools.ab;

public final class w extends m
  implements k
{
  public static int gvL = 0;
  public static int gvM = 1;
  public static int gvN = -85;
  private final b ehh;
  private f ehi;
  private int gvO;
  private String gvP;
  private int gvQ;

  public w(w.a parama, String paramString, int paramInt)
  {
    AppMethodBeat.i(108425);
    this.gvO = -1;
    this.gvQ = 0;
    switch (w.1.gvR[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      this.gvP = paramString;
      this.gvQ = paramInt;
      parama = new b.a();
      parama.fsJ = new ji();
      parama.fsK = new jj();
      parama.uri = "/cgi-bin/micromsg-bin/bindgooglecontact";
      parama.fsI = 487;
      parama.fsL = 0;
      parama.fsM = 0;
      this.ehh = parama.acD();
      AppMethodBeat.o(108425);
      return;
      this.gvO = 1;
      continue;
      this.gvO = 2;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108426);
    ab.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
    this.ehi = paramf;
    paramf = (ji)this.ehh.fsG.fsP;
    paramf.vIJ = this.gvO;
    paramf.vLf = this.gvP;
    paramf.vLg = this.gvQ;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108426);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108427);
    ab.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108427);
  }

  public final int getType()
  {
    return 487;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.w
 * JD-Core Version:    0.6.2
 */