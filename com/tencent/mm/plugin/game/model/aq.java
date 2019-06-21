package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.bl;
import com.tencent.mm.plugin.game.d.bm;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class aq extends m
  implements k
{
  private f ehi;
  public final b lty;

  public aq(int paramInt1, LinkedList<String> paramLinkedList, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(111445);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bl();
    ((b.a)localObject).fsK = new bm();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetlibgamelist";
    ((b.a)localObject).fsI = 1218;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bl)this.lty.fsG.fsP;
    ((bl)localObject).ncn = paramInt1;
    ((bl)localObject).nco = 15;
    ((bl)localObject).nbs = aa.dor();
    ((bl)localObject).guW = bo.gQ(ah.getContext());
    ((bl)localObject).ncp = paramInt2;
    ((bl)localObject).nbX = paramLinkedList;
    ((bl)localObject).ncq = paramBoolean;
    AppMethodBeat.o(111445);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111446);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111446);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111447);
    ab.i("MicroMsg.NetSceneGetLibGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111447);
  }

  public final int getType()
  {
    return 1218;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aq
 * JD-Core Version:    0.6.2
 */