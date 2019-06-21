package com.tencent.mm.plugin.ext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.model.i;
import com.tencent.mm.pluginsdk.model.i.a;
import com.tencent.mm.pluginsdk.model.i.b;
import com.tencent.mm.pluginsdk.model.l;
import com.tencent.mm.protocal.protobuf.app;
import com.tencent.mm.protocal.protobuf.cmf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bz;
import com.tencent.mm.storage.ca;
import java.util.Iterator;
import java.util.LinkedList;

final class b$6
  implements i.a
{
  b$6(b paramb)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(20264);
    if (paraml == null)
      AppMethodBeat.o(20264);
    while (true)
    {
      return;
      Iterator localIterator = paraml.dhk().wtB.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject1 = (cmf)localIterator.next();
        ab.v("MicroMsg.SubCoreExt", "AppId[%s], UserName[%s], Xml[%s]", new Object[] { paraml.hzi, ((cmf)localObject1).jBB, ((cmf)localObject1).xkk });
        if ((!bo.isNullOrNil(((cmf)localObject1).jBB)) && (!bo.isNullOrNil(((cmf)localObject1).xkk)))
        {
          aw.ZK();
          Object localObject2 = c.XM().aoM(((cmf)localObject1).jBB);
          if ((localObject2 == null) || ((int)((a)localObject2).ewQ <= 0))
          {
            ab.e("MicroMsg.SubCoreExt", "contact is null");
          }
          else if (((ad)localObject2).dsf())
          {
            ab.w("MicroMsg.SubCoreExt", "isBizContact");
          }
          else
          {
            localObject2 = i.aiA(((cmf)localObject1).xkk);
            if ((localObject2 != null) && (!bo.isNullOrNil(((i.b)localObject2).vbf)))
            {
              ab.v("MicroMsg.SubCoreExt", "AppId[%s], openId[%s]", new Object[] { paraml.hzi, ((i.b)localObject2).vbf });
              localObject1 = new bz(paraml.hzi, ((cmf)localObject1).jBB, ((i.b)localObject2).vbf);
              b.brB().a((bz)localObject1);
              i = 1;
            }
          }
        }
      }
      if (i != 0)
        this.lPx.brF();
      AppMethodBeat.o(20264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.6
 * JD-Core Version:    0.6.2
 */