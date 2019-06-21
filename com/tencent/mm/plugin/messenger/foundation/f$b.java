package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelmulti.p;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

final class f$b
  implements Runnable
{
  private String TAG;
  private final p fIx;
  private final LinkedList<tb> mgm;
  private int oqy;

  public f$b(String paramString, p paramp, LinkedList<tb> paramLinkedList)
  {
    this.TAG = paramString;
    this.fIx = paramp;
    this.mgm = paramLinkedList;
  }

  public final void run()
  {
    AppMethodBeat.i(1060);
    int i;
    if (this.fIx != null)
    {
      i = this.fIx.fJD;
      if ((i == 3) || ((!this.fIx.caA) && ((i == 1) || (i == 2) || (i == 8))))
      {
        this.oqy = 0;
        Iterator localIterator = this.mgm.iterator();
        while (localIterator.hasNext())
        {
          Object localObject1 = (tb)localIterator.next();
          Object localObject2 = aa.a(((tb)localObject1).wau);
          if (((tb)localObject1).wat == 5)
            try
            {
              localObject1 = new com/tencent/mm/protocal/protobuf/cm;
              ((cm)localObject1).<init>();
              localObject2 = ((cm)((cm)localObject1).parseFrom((byte[])localObject2)).vEB.toString();
              localObject1 = ((j)g.K(j.class)).XM().aoO((String)localObject2);
              if ((((String)localObject2).endsWith("@chatroom")) && (((ap)localObject1).dua == 0))
                this.oqy += 1;
            }
            catch (IOException localIOException)
            {
              ab.e(this.TAG, "muteroom idkeyStat: docmd: parse from protobuf to addmsg error, " + localIOException.getMessage());
            }
        }
        if (this.oqy > 0)
        {
          if (this.oqy > 5)
            break label335;
          e.pXa.a(202L, this.oqy, 1L, false);
          ab.i(this.TAG, "muteroom idkeyStat:muteroomNotNotifyNum = " + this.oqy);
          switch (i)
          {
          case 4:
          case 5:
          case 6:
          case 7:
          default:
          case 3:
          case 1:
          case 2:
          case 8:
          }
        }
      }
    }
    while (true)
    {
      ab.i(this.TAG, "muteroom idkeyStat:aiScene = ".concat(String.valueOf(i)));
      AppMethodBeat.o(1060);
      return;
      label335: if (this.oqy <= 10)
      {
        e.pXa.a(202L, 6L, 1L, false);
        break;
      }
      if (this.oqy <= 15)
      {
        e.pXa.a(202L, 7L, 1L, false);
        break;
      }
      if (this.oqy <= 20)
      {
        e.pXa.a(202L, 8L, 1L, false);
        break;
      }
      e.pXa.a(202L, 9L, 1L, false);
      break;
      e.pXa.a(202L, 10L, 1L, false);
      continue;
      e.pXa.a(202L, 11L, 1L, false);
      continue;
      e.pXa.a(202L, 12L, 1L, false);
      continue;
      e.pXa.a(202L, 13L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.f.b
 * JD-Core Version:    0.6.2
 */