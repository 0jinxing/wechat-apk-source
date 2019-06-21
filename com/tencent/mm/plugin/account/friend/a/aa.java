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
import com.tencent.mm.protocal.protobuf.bdz;
import com.tencent.mm.protocal.protobuf.bea;
import com.tencent.mm.protocal.protobuf.bed;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class aa extends m
  implements k
{
  public final b ehh;
  private f ehi;

  public aa(int paramInt)
  {
    AppMethodBeat.i(108441);
    b.a locala = new b.a();
    locala.fsJ = new bdz();
    locala.fsK = new bea();
    locala.uri = "/cgi-bin/micromsg-bin/newgetinvitefriend";
    locala.fsI = 135;
    locala.fsL = 23;
    locala.fsM = 1000000023;
    this.ehh = locala.acD();
    ((bdz)this.ehh.fsG.fsP).wyY = paramInt;
    AppMethodBeat.o(108441);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108442);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108442);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108443);
    paramArrayOfByte = (bea)this.ehh.fsH.fsP;
    ab.d("MicroMsg.NetSceneGetInviteFriend", "friend:" + paramArrayOfByte.ndm.size() + " group:" + paramArrayOfByte.vFk.size());
    HashSet localHashSet = new HashSet();
    paramq = new LinkedList();
    for (paramInt1 = 0; paramInt1 < paramArrayOfByte.wHF; paramInt1++)
      if (!localHashSet.contains(((bed)paramArrayOfByte.ndm.get(paramInt1)).jBB))
      {
        paramq.add(paramArrayOfByte.ndm.get(paramInt1));
        localHashSet.add(((bed)paramArrayOfByte.ndm.get(paramInt1)).jBB);
      }
    paramArrayOfByte.ndm = paramq;
    paramArrayOfByte.wHF = paramq.size();
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108443);
  }

  public final int getType()
  {
    return 135;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.aa
 * JD-Core Version:    0.6.2
 */