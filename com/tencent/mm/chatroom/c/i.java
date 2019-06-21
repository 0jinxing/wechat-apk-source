package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.n;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aha;
import com.tencent.mm.protocal.protobuf.ahb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String ehm;
  public int ehn;
  public String eho;
  public int ehp;
  private String ehq;

  public i(String paramString)
  {
    AppMethodBeat.i(103925);
    this.ehq = "";
    b.a locala = new b.a();
    this.ehq = paramString;
    aha localaha = new aha();
    localaha.vEf = paramString;
    locala.fsJ = localaha;
    locala.fsK = new ahb();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroominfodetail";
    locala.fsI = 223;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(103925);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103927);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103927);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103926);
    ab.w("MicroMsg.NetSceneGetChatRoomInfoDetail", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.d("MicroMsg.NetSceneGetChatRoomInfoDetail", "OK");
      this.ehm = ((ahb)this.ehh.fsH.fsP).wny;
      this.ehn = ((ahb)this.ehh.fsH.fsP).ehn;
      this.eho = ((ahb)this.ehh.fsH.fsP).eho;
      this.ehp = ((ahb)this.ehh.fsH.fsP).ehp;
      paramInt1 = ((ahb)this.ehh.fsH.fsP).wnz;
      paramq = this.ehm;
      int i = this.ehn;
      ab.i("MicroMsg.NetSceneGetChatRoomInfoDetail", "dz[onSceneEnd : get announcement successfully!] roomId:%s newVersion:%s AnnouncementPublishTime:%s chatRoomStatus:%s", new Object[] { this.ehq, Integer.valueOf(i), Integer.valueOf(this.ehp), Integer.valueOf(paramInt1) });
      n.a(this.ehq, bo.nullAsNil(paramq), this.eho, this.ehp, i, paramInt1);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103926);
  }

  public final int getType()
  {
    return 223;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.i
 * JD-Core Version:    0.6.2
 */