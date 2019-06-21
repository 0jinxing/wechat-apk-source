package com.tencent.mm.plugin.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.List;

public final class d extends a
{
  protected final List<com.tencent.mm.plugin.f.b.a> Q(bi parambi)
  {
    AppMethodBeat.i(18621);
    if (parambi == null)
    {
      parambi = null;
      AppMethodBeat.o(18621);
    }
    while (true)
    {
      return parambi;
      com.tencent.mm.at.e locale = o.ahl().w(parambi);
      if ((locale == null) || (locale.fDy == 0L))
      {
        ab.w("MicroMsg.ImageMsgHandler", "%s can not get imgInfo", new Object[] { aZm() });
        parambi = null;
        AppMethodBeat.o(18621);
      }
      else
      {
        String str1 = o.ahl().q(locale.fDz, "", "");
        long l1 = com.tencent.mm.vfs.e.asZ(str1);
        String str2 = o.ahl().q(locale.fDB, "", "");
        long l2 = com.tencent.mm.vfs.e.asZ(str2);
        Object localObject1 = o.ahl().q(locale.fDB, "", "") + "hd";
        long l3 = com.tencent.mm.vfs.e.asZ((String)localObject1);
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        long l4 = 0L;
        long l5 = 0L;
        long l6 = 0L;
        long l7 = l4;
        long l8 = l5;
        long l9 = l6;
        Object localObject5 = localObject4;
        Object localObject6 = localObject3;
        Object localObject7 = localObject2;
        if (locale.agQ())
        {
          locale = o.ahl().ly(locale.fDJ);
          l7 = l4;
          l8 = l5;
          l9 = l6;
          localObject5 = localObject4;
          localObject6 = localObject3;
          localObject7 = localObject2;
          if (locale != null)
          {
            localObject3 = o.ahl().q(locale.fDz, "", "");
            if (!bo.isEqual((String)localObject3, str1))
              l4 = com.tencent.mm.vfs.e.asZ((String)localObject3);
            localObject2 = o.ahl().q(locale.fDB, "", "");
            if (!bo.isEqual((String)localObject2, str2))
              l5 = com.tencent.mm.vfs.e.asZ((String)localObject2);
            localObject4 = o.ahl().q(locale.fDB, "", "") + "hd";
            l7 = l4;
            l8 = l5;
            l9 = l6;
            localObject5 = localObject4;
            localObject6 = localObject2;
            localObject7 = localObject3;
            if (!bo.isEqual((String)localObject4, (String)localObject1))
            {
              l9 = com.tencent.mm.vfs.e.asZ((String)localObject4);
              localObject7 = localObject3;
              localObject6 = localObject2;
              localObject5 = localObject4;
              l8 = l5;
              l7 = l4;
            }
          }
        }
        localObject2 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject2).field_msgSubType = 20;
        ((com.tencent.mm.plugin.f.b.a)localObject2).field_path = Gh(str1);
        ((com.tencent.mm.plugin.f.b.a)localObject2).field_size = l1;
        localObject3 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject3).field_msgSubType = 21;
        ((com.tencent.mm.plugin.f.b.a)localObject3).field_path = Gh(str2);
        ((com.tencent.mm.plugin.f.b.a)localObject3).field_size = l2;
        localObject4 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject4).field_msgSubType = 22;
        ((com.tencent.mm.plugin.f.b.a)localObject4).field_path = Gh((String)localObject1);
        ((com.tencent.mm.plugin.f.b.a)localObject4).field_size = l3;
        localObject1 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject1).field_msgSubType = 23;
        ((com.tencent.mm.plugin.f.b.a)localObject1).field_path = Gh((String)localObject7);
        ((com.tencent.mm.plugin.f.b.a)localObject1).field_size = l7;
        localObject7 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject7).field_msgSubType = 24;
        ((com.tencent.mm.plugin.f.b.a)localObject7).field_path = Gh((String)localObject6);
        ((com.tencent.mm.plugin.f.b.a)localObject7).field_size = l8;
        localObject6 = R(parambi);
        ((com.tencent.mm.plugin.f.b.a)localObject6).field_msgSubType = 25;
        ((com.tencent.mm.plugin.f.b.a)localObject6).field_path = Gh(localObject5);
        ((com.tencent.mm.plugin.f.b.a)localObject6).field_size = l9;
        ab.i("MicroMsg.ImageMsgHandler", "%s create image wx file index bigItem[%s] thumb[%s][%s] hd[%s %s %s]", new Object[] { aZm(), localObject2, localObject3, localObject4, localObject1, localObject7, localObject6 });
        parambi = new ArrayList();
        parambi.add(localObject2);
        parambi.add(localObject3);
        parambi.add(localObject4);
        parambi.add(localObject1);
        parambi.add(localObject7);
        parambi.add(localObject6);
        AppMethodBeat.o(18621);
      }
    }
  }

  protected final String aZm()
  {
    AppMethodBeat.i(18622);
    String str = "image_" + hashCode();
    AppMethodBeat.o(18622);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.d
 * JD-Core Version:    0.6.2
 */