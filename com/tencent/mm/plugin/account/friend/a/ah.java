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
import com.tencent.mm.protocal.protobuf.bwj;
import com.tencent.mm.protocal.protobuf.bwk;
import java.util.LinkedList;

public final class ah extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ah(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108475);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwj();
    ((b.a)localObject).fsK = new bwk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendinviteemail";
    ((b.a)localObject).fsI = 116;
    ((b.a)localObject).fsL = 41;
    ((b.a)localObject).fsM = 1000000041;
    this.ehh = ((b.a)localObject).acD();
    localObject = new LinkedList();
    for (int i = 0; i < paramArrayOfInt.length; i++)
      ((LinkedList)localObject).add(Integer.valueOf(paramArrayOfInt[i]));
    ((bwj)this.ehh.fsG.fsP).wWY = ((LinkedList)localObject);
    ((bwj)this.ehh.fsG.fsP).wWX = ((LinkedList)localObject).size();
    AppMethodBeat.o(108475);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108476);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108476);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108477);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108477);
  }

  public final int getType()
  {
    return 116;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ah
 * JD-Core Version:    0.6.2
 */