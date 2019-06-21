package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.protobuf.ach;
import com.tencent.mm.protocal.protobuf.cj;
import com.tencent.mm.protocal.protobuf.ck;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g extends com.tencent.mm.plugin.exdevice.a.a<cj, ck>
{
  List<String> jzq;
  private final WeakReference<b<g>> lqU;
  public ArrayList<ach> lvv;

  public g(List<String> paramList, b<g> paramb)
  {
    AppMethodBeat.i(19445);
    this.jzq = paramList;
    this.lqU = new WeakReference(paramb);
    AppMethodBeat.o(19445);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19446);
    ab.d("MicroMsg.NetSceneAddFollow", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ck localck = (ck)aTS();
      this.lvv = new ArrayList();
      if (localck.vEx != null)
      {
        Iterator localIterator = localck.vEx.iterator();
        while (localIterator.hasNext())
        {
          ach localach = (ach)localIterator.next();
          ab.d("MicroMsg.NetSceneAddFollow", "follow: index:%s step: %s username: %s", new Object[] { Integer.valueOf(localach.index), Integer.valueOf(localach.hzv), localach.username });
          this.lvv.add(localach);
        }
        ab.d("MicroMsg.NetSceneAddFollow", "follows: %s, %d", new Object[] { this.lvv.toString(), Integer.valueOf(localck.vEx.size()) });
      }
      ad.boY().a(this.lvv, "hardcode_rank_id", "hardcode_app_name");
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.lqU.get();
    if (paramq != null)
      paramq.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19446);
  }

  public final int getType()
  {
    return 1777;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/addfollow";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.g
 * JD-Core Version:    0.6.2
 */