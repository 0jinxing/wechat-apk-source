package com.tencent.mm.plugin.wear.model.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.a.vk;
import com.tencent.mm.g.a.vk.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedHashMap;

public final class b
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(26456);
    ??? = parama.eAB;
    aw.ZK();
    if (bo.isNullOrNil((String)c.Ry().get(2, "")))
      AppMethodBeat.o(26456);
    while (true)
    {
      return null;
      parama = aa.a(((cm)???).vEB);
      Object localObject2 = aa.a(((cm)???).vEC);
      if ((bo.isNullOrNil(parama)) || (bo.isNullOrNil((String)localObject2)))
      {
        ab.e("MicroMsg.YoExtension", "neither from-user nor to-user can be empty");
        AppMethodBeat.o(26456);
        continue;
      }
      localObject2 = aa.a(((cm)???).vED);
      ab.i("MicroMsg.YoExtension", "from  " + parama + "content " + (String)localObject2);
      a locala = com.tencent.mm.plugin.wear.model.a.cUn().tXA;
      synchronized (locala.tYO)
      {
        Object localObject3 = a.ady(parama);
        if ((!locala.tYO.containsKey(parama)) && (((vk)localObject3).cSt.cSu != 1))
        {
          ab.i("MicroMsg.wear.WearYoLogic", "Can add Yo Message %s", new Object[] { parama });
          localObject3 = new com/tencent/mm/plugin/wear/model/g/a$a;
          ((a.a)localObject3).<init>(locala, parama, (String)localObject2);
          locala.tYO.put(parama, localObject3);
          com.tencent.mm.plugin.wear.model.a.cUn().tXA.cUD();
          AppMethodBeat.o(26456);
          continue;
        }
        ab.i("MicroMsg.wear.WearYoLogic", "Can not add Yo Message %s", new Object[] { parama });
        localObject2 = new com/tencent/mm/g/a/vk;
        ((vk)localObject2).<init>();
        ((vk)localObject2).cSs.cuy = 2;
        ((vk)localObject2).cSs.username = parama;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.g.b
 * JD-Core Version:    0.6.2
 */