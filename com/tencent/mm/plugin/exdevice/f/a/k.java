package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.a;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.protobuf.acj;
import com.tencent.mm.protocal.protobuf.aqr;
import com.tencent.mm.protocal.protobuf.aqs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k extends a<aqr, aqs>
{
  private final WeakReference<b<k>> lqU;
  public List<String> lvZ;
  public List<String> lwa;
  public List<String> lwb;

  public k(b<k> paramb)
  {
    AppMethodBeat.i(19462);
    this.lqU = new WeakReference(paramb);
    AppMethodBeat.o(19462);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19463);
    ab.d("MicroMsg.NetSceneGetWeRunFollowerList", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject1 = (aqs)aTS();
      this.lwb = new ArrayList();
      Iterator localIterator = ((aqs)localObject1).wuF.iterator();
      Object localObject2;
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        aw.ZK();
        if (c.XM().aoJ((String)localObject2))
          this.lwb.add(localObject2);
      }
      this.lvZ = new ArrayList();
      this.lwa = new ArrayList();
      if (((aqs)localObject1).wuG != null)
      {
        localObject1 = ((aqs)localObject1).wuG.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (acj)((Iterator)localObject1).next();
          if (((acj)localObject2).wke)
            this.lwa.add(((acj)localObject2).username);
          aw.ZK();
          if (c.XM().aoJ(((acj)localObject2).username))
            this.lvZ.add(((acj)localObject2).username);
        }
      }
      ab.d("MicroMsg.NetSceneGetWeRunFollowerList", "follow:%s %s", new Object[] { Integer.valueOf(this.lwa.size()), this.lwa.toString() });
      ab.d("MicroMsg.NetSceneGetWeRunFollowerList", "all follow:%s %s", new Object[] { Integer.valueOf(this.lvZ.size()), this.lvZ });
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.lqU.get();
    if (paramq != null)
    {
      ab.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is not null");
      paramq.a(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(19463);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is null");
      AppMethodBeat.o(19463);
    }
  }

  public final int getType()
  {
    return 1758;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.k
 * JD-Core Version:    0.6.2
 */