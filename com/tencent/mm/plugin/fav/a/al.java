package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aav;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.protocal.protobuf.bcb;
import com.tencent.mm.protocal.protobuf.bcc;
import com.tencent.mm.protocal.protobuf.bcd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class al extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  public int mgq;
  public f mgr;
  private LinkedList<bcd> mgs;
  private LinkedList<bca> mgt;
  public String mgu;
  private int scene;
  public int type;

  public al(int paramInt, f paramf)
  {
    this(paramInt, paramf.field_modItem.mgt, paramf.field_modItem.wie, 1);
    this.mgr = paramf;
  }

  public al(int paramInt, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
  }

  private al(int paramInt1, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1, int paramInt2)
  {
    AppMethodBeat.i(102743);
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new bcb();
    locala.fsK = new bcc();
    locala.uri = "/cgi-bin/micromsg-bin/modfavitem";
    locala.fsI = 426;
    locala.fsL = 216;
    locala.fsM = 1000000216;
    this.ehh = locala.acD();
    this.mgs = paramLinkedList1;
    this.mgt = paramLinkedList;
    this.mgq = paramInt1;
    this.type = paramInt2;
    AppMethodBeat.o(102743);
  }

  public al(int paramInt, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1, String paramString)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    this.mgu = paramString;
  }

  public al(int paramInt, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1, String paramString, byte paramByte)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    this.mgu = paramString;
    this.scene = 1;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(102744);
    int i;
    if ((this.scene == 0) && ((this.mgt == null) || (this.mgt.size() == 0)))
    {
      i = -1;
      AppMethodBeat.o(102744);
      return i;
    }
    bcb localbcb = (bcb)this.ehh.fsG.fsP;
    localbcb.wGE = this.mgt.size();
    if (this.mgs != null)
      localbcb.wGG = this.mgs.size();
    for (localbcb.vKB = this.mgs; ; localbcb.vKB = new LinkedList())
    {
      if (!bo.isNullOrNil(this.mgu))
        localbcb.wGH = this.mgu;
      localbcb.wGE = this.mgt.size();
      localbcb.wGF = this.mgt;
      localbcb.vEp = this.mgq;
      localbcb.Scene = this.scene;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(102744);
      break;
      localbcb.wGG = 0;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102745);
    ab.d("MicroMsg.Fav.NetSceneModFavItem", "favId: " + this.mgq + ", netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    b.d(((ae)g.M(ae.class)).getFavItemInfoStorage().iF(this.mgq));
    AppMethodBeat.o(102745);
  }

  public final long bvg()
  {
    if (this.mgr == null);
    for (long l = -1L; ; l = this.mgr.field_localId)
      return l;
  }

  public final int bvh()
  {
    if (this.mgr == null);
    for (int i = -1; ; i = this.mgr.field_type)
      return i;
  }

  public final int getType()
  {
    return 426;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.al
 * JD-Core Version:    0.6.2
 */