package com.tencent.mm.plugin.qmessage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ajt;
import com.tencent.mm.protocal.protobuf.aju;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  public final b fSY;
  private f psJ;

  public c()
  {
    AppMethodBeat.i(24076);
    b.a locala = new b.a();
    locala.fsJ = new ajt();
    locala.fsK = new aju();
    locala.uri = "/cgi-bin/micromsg-bin/getimunreadmsgcount";
    locala.fsI = 630;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fSY = locala.acD();
    AppMethodBeat.o(24076);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24078);
    ab.d("MicroMsg.NetSceneGetImUnreadMsgCount", "get im unread msg count");
    this.psJ = paramf;
    int i = a(parame, this.fSY, this);
    AppMethodBeat.o(24078);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24077);
    ab.d("MicroMsg.NetSceneGetImUnreadMsgCount", "end get im unread msg count, errType: %d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.psJ.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24077);
  }

  public final int getType()
  {
    return 630;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.c
 * JD-Core Version:    0.6.2
 */