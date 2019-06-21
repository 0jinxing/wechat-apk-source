package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.LinkedList;

final class q$c
  implements Runnable
{
  private j pJu;

  public q$c(q paramq, j paramj)
  {
    this.pJu = paramj;
  }

  public final void run()
  {
    AppMethodBeat.i(135735);
    ab.i("MicroMsg.RecordMsgSendService", "dojob FavDataCopyRunnable, info id:%s", new Object[] { Long.valueOf(this.pJu.field_msgId) });
    Iterator localIterator = this.pJu.field_dataProto.wiv.iterator();
    label45: Object localObject;
    for (int i = 0; localIterator.hasNext(); i = 1)
    {
      aar localaar = (aar)localIterator.next();
      localObject = new gh();
      ((gh)localObject).cAH.type = 2;
      ((gh)localObject).cAH.cAJ = localaar;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      ab.d("MicroMsg.RecordMsgSendService", "check dataid[%s] type[%d]", new Object[] { localaar.mnd, Integer.valueOf(localaar.dataType) });
      String str;
      if (!bo.isNullOrNil(((gh)localObject).cAI.path))
      {
        str = n.c(localaar, this.pJu.field_msgId);
        ab.d("MicroMsg.RecordMsgSendService", "check data ok, try copy[%s] to[%s]", new Object[] { ((gh)localObject).cAI.path, str });
        if (!((gh)localObject).cAI.path.equals(str))
          e.y(((gh)localObject).cAI.path, str);
      }
      if (!bo.isNullOrNil(((gh)localObject).cAI.thumbPath))
      {
        str = n.f(localaar, this.pJu.field_msgId);
        ab.d("MicroMsg.RecordMsgSendService", "check thumb ok, try copy[%s] to[%s]", new Object[] { ((gh)localObject).cAI.thumbPath, str });
        if (!((gh)localObject).cAI.thumbPath.equals(str))
          e.y(((gh)localObject).cAI.thumbPath, str);
      }
      if (localaar.dataType == 3)
      {
        ab.w("MicroMsg.RecordMsgSendService", "match voice type, clear cdn info");
        localaar.akM("");
        localaar.akL("");
        localaar.akK("");
        localaar.akJ("");
      }
      if ((bo.isNullOrNil(localaar.wfZ)) && (bo.isNullOrNil(localaar.fgE)))
        break label45;
    }
    if (i != 0)
    {
      g.RO().eJo.a(new f(this.pJu), 0);
      AppMethodBeat.o(135735);
    }
    while (true)
    {
      return;
      localObject = j.b.a(n.a(this.pJu.field_title, this.pJu.field_desc, this.pJu.field_dataProto), null, null);
      this.pJT.d(this.pJu.field_msgId, this.pJu.field_localId, (String)localObject);
      this.pJT.pJx = false;
      this.pJT.a(null);
      AppMethodBeat.o(135735);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q.c
 * JD-Core Version:    0.6.2
 */