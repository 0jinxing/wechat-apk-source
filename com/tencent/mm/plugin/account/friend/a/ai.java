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
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bwv;
import com.tencent.mm.protocal.protobuf.bww;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ai extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ai(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(108478);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwv();
    ((b.a)localObject).fsK = new bww();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendsmstomfriend";
    ((b.a)localObject).fsI = 432;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bwv)this.ehh.fsG.fsP;
    ((bwv)localObject).wdB = paramString;
    ((bwv)localObject).wCo = new LinkedList();
    ((bwv)localObject).wCn = paramList.size();
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = (String)paramString.next();
      if (!bo.isNullOrNil(paramList))
        ((bwv)localObject).wCo.add(new bts().alV(paramList));
    }
    AppMethodBeat.o(108478);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108479);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108479);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108480);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108480);
  }

  public final int getType()
  {
    return 432;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ai
 * JD-Core Version:    0.6.2
 */