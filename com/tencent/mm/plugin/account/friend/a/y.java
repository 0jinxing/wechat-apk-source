package com.tencent.mm.plugin.account.friend.a;

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
import com.tencent.mm.protocal.protobuf.rz;
import com.tencent.mm.protocal.protobuf.sa;
import com.tencent.mm.sdk.platformtools.ab;

public final class y extends m
  implements k
{
  public static int gvV = 1;
  public static int gvW = 2;
  public static int gvX = 3;
  public static int gvY = 4;
  private b ehh;
  private f ehi;

  public y(int paramInt)
  {
    AppMethodBeat.i(108432);
    b.a locala = new b.a();
    locala.fsJ = new rz();
    locala.fsK = new sa();
    locala.uri = "/cgi-bin/micromsg-bin/checkunbind";
    locala.fsI = 254;
    locala.fsL = 131;
    locala.fsM = 1000000131;
    this.ehh = locala.acD();
    ((rz)this.ehh.fsG.fsP).vZq = paramInt;
    AppMethodBeat.o(108432);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108433);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108433);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108435);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108435);
  }

  public final String aqd()
  {
    AppMethodBeat.i(108434);
    try
    {
      String str = ((sa)this.ehh.fsH.fsP).vZr;
      ab.d("MicroMsg.NetSceneCheckUnBind", "getRandomPasswd() ".concat(String.valueOf(str)));
      AppMethodBeat.o(108434);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneCheckUnBind", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(108434);
      }
    }
  }

  public final sa aqe()
  {
    return (sa)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 254;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.y
 * JD-Core Version:    0.6.2
 */