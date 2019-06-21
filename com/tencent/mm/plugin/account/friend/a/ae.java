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
import com.tencent.mm.protocal.protobuf.aux;
import com.tencent.mm.protocal.protobuf.auy;
import com.tencent.mm.protocal.protobuf.auz;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;

public final class ae extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private LinkedList<aux> gwg;
  public String gwh;

  public ae(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(108462);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new auy();
    ((b.a)localObject).fsK = new auz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitegooglecontact";
    ((b.a)localObject).fsI = 489;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.gwg = new LinkedList();
    if (paramArrayList.size() > 0)
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        localObject = new aux();
        ((aux)localObject).vLf = ((String)paramArrayList.get(i));
        this.gwg.add(localObject);
      }
    AppMethodBeat.o(108462);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108463);
    ab.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
    this.ehi = paramf;
    paramf = (auy)this.ehh.fsG.fsP;
    paramf.jBv = this.gwg.size();
    paramf.jBw = this.gwg;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108463);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108464);
    ab.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108464);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108464);
    }
  }

  public final auz aqh()
  {
    return (auz)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 489;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ae
 * JD-Core Version:    0.6.2
 */