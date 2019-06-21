package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import java.util.HashMap;
import java.util.LinkedList;

final class f$1
  implements Runnable
{
  f$1(f paramf, q paramq, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14170);
    f localf = this.jOh;
    q localq = this.jEl;
    int i = this.gvp;
    int j = this.fTG;
    int k = this.jOg;
    Object localObject1;
    if (localq != null)
      if (localq.drC())
        if (localq.drC())
        {
          localObject1 = ((a)g.K(a.class)).b(localq.field_msgId, localq.field_content);
          if ((localObject1 == null) || (bo.ek(((o)localObject1).fjr)))
          {
            AppMethodBeat.o(14170);
            return;
          }
        }
    label721: label1237: label1243: 
    while (true)
    {
      int n;
      Object localObject4;
      try
      {
        int m = ((o)localObject1).fjr.size();
        if ((m <= 2) || (localq.field_isExpand))
          break label1243;
        m = 2;
        n = 0;
        if (n >= m)
          break label815;
        Object localObject2 = (p)((o)localObject1).fjr.get(n);
        if (localObject2 != null)
        {
          Object localObject3 = localf.jOf;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = (f.a)((HashMap)localObject3).get(localq.field_msgId + "_" + n);
          if (localObject4 != null)
            break label721;
          localObject4 = new com/tencent/mm/plugin/brandservice/ui/timeline/f$a;
          ((f.a)localObject4).<init>((byte)0);
          HashMap localHashMap = localf.jOf;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localHashMap.put(localq.field_msgId + "_" + n, localObject4);
          ((f.a)localObject4).vNN = localq.field_talker;
          ((f.a)localObject4).vNP = 1;
          ((f.a)localObject4).vNX = ((int)(System.currentTimeMillis() / 1000L));
          ((f.a)localObject4).pos = i;
          ((f.a)localObject4).vNR = 0;
          ((f.a)localObject4).vNT = 0;
          ((f.a)localObject4).vNU = 0;
          ((f.a)localObject4).vNW = 0;
          ((f.a)localObject4).vNr = 0;
          ((f.a)localObject4).vNW = 0;
          ((f.a)localObject4).vNY = ((int)(localq.field_createTime / 1000L));
          if (j != 4)
          {
            i1 = 0;
            ((f.a)localObject4).vOa = i1;
            ((f.a)localObject4).vOb = ((p)localObject2).type;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("1_");
            ((f.a)localObject4).vOc = (f.a(localq, ((p)localObject2).url) + ";");
            ((f.a)localObject4).vOe = n;
            if (!localq.field_isExpand)
              continue;
            i1 = 1;
            ((f.a)localObject4).vOf = i1;
            ((f.a)localObject4).vOh = k;
            if ((n != 0) || (!localq.xHT))
              continue;
            i1 = 1;
            ((f.a)localObject4).vOj = i1;
            if (!localq.xHU)
              continue;
            i1 = 1;
            ((f.a)localObject4).vOk = i1;
            f.a((f.a)localObject4, localq.field_talker);
            if (!bo.isNullOrNil(((p)localObject2).url))
            {
              localObject2 = Uri.parse(((p)localObject2).url);
              i1 = bo.getInt(((Uri)localObject2).getQueryParameter("idx"), 0);
              long l = bo.getLong(((Uri)localObject2).getQueryParameter("mid"), 0L);
              ((f.a)localObject4).vNO.add(Integer.valueOf(i1));
              ((f.a)localObject4).cuQ = l;
              ((f.a)localObject4).vOd = l;
            }
            if (!localq.field_isExpand)
              continue;
            ((f.a)localObject4).vNQ = 2;
          }
        }
        else
        {
          n++;
          continue;
        }
        if (System.currentTimeMillis() - localq.field_createTime <= 86400000L)
        {
          i1 = 1;
          continue;
        }
        i1 = 2;
        continue;
        i1 = 0;
        continue;
        i1 = 0;
        continue;
        i1 = 0;
        continue;
        if (((o)localObject1).fjr.size() > 2)
        {
          ((f.a)localObject4).vNQ = 1;
          continue;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        ab.w("MicroMsg.BizTimeLineReport", "exposeLog exp %s", new Object[] { localUnsupportedOperationException.getMessage() });
        AppMethodBeat.o(14170);
        break;
        ((f.a)localObject4).vNQ = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.BizTimeLineReport", "exposeLog exp %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(14170);
      break;
      if ((n == 0) && (localq.xHT))
      {
        i1 = 1;
        label736: ((f.a)localObject4).vOj = i1;
        if (!localq.xHU)
          break label809;
      }
      for (int i1 = 1; ; i1 = 0)
      {
        ((f.a)localObject4).vOk = i1;
        ((f.a)localObject4).vNP += 1;
        ((f.a)localObject4).pos = i;
        ((f.a)localObject4).vNX = ((int)(System.currentTimeMillis() / 1000L));
        f.a((f.a)localObject4, localq.field_talker);
        break;
        i1 = 0;
        break label736;
      }
      AppMethodBeat.o(14170);
      break;
      localObject1 = (f.a)localException.jOf.get(localq.field_msgId);
      if (localObject1 == null)
      {
        localObject1 = new f.a((byte)0);
        localException.jOf.put(localq.field_msgId, localObject1);
        ((f.a)localObject1).vNN = localq.field_talker;
        ((f.a)localObject1).cuQ = 0L;
        ((f.a)localObject1).vNP = 1;
        ((f.a)localObject1).vNX = ((int)(System.currentTimeMillis() / 1000L));
        ((f.a)localObject1).pos = i;
        ((f.a)localObject1).vNR = 0;
        ((f.a)localObject1).vNT = 0;
        ((f.a)localObject1).vNU = 0;
        ((f.a)localObject1).vNW = 0;
        ((f.a)localObject1).vNr = 0;
        ((f.a)localObject1).vNW = 0;
        ((f.a)localObject1).vNY = ((int)(localq.field_createTime / 1000L));
        if (j != 4)
        {
          i1 = 0;
          label994: ((f.a)localObject1).vOa = i1;
          if (!localq.isText())
            break label1104;
          i1 = 1;
          label1011: ((f.a)localObject1).vOb = i1;
          f.a((f.a)localObject1, localq.field_talker);
          ((f.a)localObject1).vOh = k;
          if (!localq.xHT)
            break label1136;
          i1 = 1;
          ((f.a)localObject1).vOj = i1;
          if (!localq.xHU)
            break label1142;
        }
        label1136: label1142: for (i1 = 1; ; i1 = 0)
        {
          ((f.a)localObject1).vOk = i1;
          AppMethodBeat.o(14170);
          break;
          if (System.currentTimeMillis() - localq.field_createTime <= 86400000L)
          {
            i1 = 1;
            break label994;
          }
          i1 = 2;
          break label994;
          if (localq.drE())
          {
            i1 = 2;
            break label1011;
          }
          if (localq.drD())
          {
            i1 = 3;
            break label1011;
          }
          i1 = -1;
          break label1011;
          i1 = 0;
          break label1044;
        }
      }
      ((f.a)localObject1).vNP += 1;
      ((f.a)localObject1).pos = i;
      ((f.a)localObject1).vNX = ((int)(System.currentTimeMillis() / 1000L));
      f.a((f.a)localObject1, localq.field_talker);
      if (localq.xHT)
      {
        i1 = 1;
        ((f.a)localObject1).vOj = i1;
        if (!localq.xHU)
          break label1237;
      }
      for (i1 = 1; ; i1 = 0)
      {
        ((f.a)localObject1).vOk = i1;
        AppMethodBeat.o(14170);
        break;
        i1 = 0;
        break label1198;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.f.1
 * JD-Core Version:    0.6.2
 */