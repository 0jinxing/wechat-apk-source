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
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.protocal.protobuf.aym;
import com.tencent.mm.protocal.protobuf.ayn;
import com.tencent.mm.protocal.protobuf.ayo;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ag extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ag(String paramString, List<String[]> paramList)
  {
    AppMethodBeat.i(108471);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ayn();
    ((b.a)localObject).fsK = new ayo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/listmfriend";
    ((b.a)localObject).fsI = 431;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ayn)this.ehh.fsG.fsP;
    ((ayn)localObject).wdB = paramString;
    ((ayn)localObject).wCp = 0;
    if (paramList == null);
    while (true)
    {
      ((ayn)localObject).wCn = i;
      ((ayn)localObject).wCq = new LinkedList();
      ((ayn)localObject).wCo = new LinkedList();
      if (paramList == null)
        break;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        paramString = (String[])paramList.next();
        if (!bo.isNullOrNil(paramString[2]))
          ((ayn)localObject).wCo.add(new bts().alV(paramString[2]));
      }
      i = paramList.size();
    }
    AppMethodBeat.o(108471);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108472);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108472);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108474);
    paramq = (ayo)this.ehh.fsH.fsP;
    com.tencent.mm.kernel.g.RS().a(new ag.1(this, paramq));
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108474);
  }

  public final LinkedList<aym> aqj()
  {
    AppMethodBeat.i(108473);
    Object localObject = ((ayo)this.ehh.fsH.fsP).wCr;
    if (localObject != null)
    {
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        aym localaym = (aym)((Iterator)localObject).next();
        a.ask().Yn().ia(localaym.jBB, localaym.wlF);
      }
    }
    localObject = ((ayo)this.ehh.fsH.fsP).wCr;
    AppMethodBeat.o(108473);
    return localObject;
  }

  public final int getType()
  {
    return 431;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ag
 * JD-Core Version:    0.6.2
 */