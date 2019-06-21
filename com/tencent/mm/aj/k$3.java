package com.tencent.mm.aj;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.protocal.protobuf.sm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;

final class k$3
  implements Runnable
{
  k$3(k paramk, bxk parambxk, String paramString, bi parambi, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11403);
    k.a(this.fwB, this.fwC);
    if ((this.fku == null) || (!this.fku.drC()))
    {
      k.a(this.fwC, 10, null, this.fwD, this.fwB);
      AppMethodBeat.o(11403);
    }
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      Object localObject1 = ((a)g.K(a.class)).b(this.fku.field_msgId, this.fku.field_content);
      if ((localObject1 == null) || (bo.ek(((o)localObject1).fjr)))
      {
        k.a(this.fwC, 10, null, this.fwD, this.fwB);
        AppMethodBeat.o(11403);
      }
      else
      {
        localObject1 = ((o)localObject1).fjr.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          p localp = (p)((Iterator)localObject1).next();
          String str = localp.url;
          if (!bo.isNullOrNil(str))
          {
            Object localObject2 = Uri.parse(str);
            try
            {
              str = ((Uri)localObject2).getQueryParameter("mid");
              localObject2 = ((Uri)localObject2).getQueryParameter("idx");
              sm localsm = new com/tencent/mm/protocal/protobuf/sm;
              localsm.<init>();
              localsm.jVD = bo.getLong(str, 0L);
              localsm.jVE = bo.getInt((String)localObject2, 0);
              localsm.csB = localp.fjG;
              localsm.path = localp.fjD;
              localLinkedList.add(localsm);
            }
            catch (UnsupportedOperationException localUnsupportedOperationException)
            {
              ab.w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", new Object[] { localUnsupportedOperationException.getMessage() });
            }
          }
        }
        k.a(this.fwC, 10, localLinkedList, this.fwD, this.fwB);
        AppMethodBeat.o(11403);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.k.3
 * JD-Core Version:    0.6.2
 */