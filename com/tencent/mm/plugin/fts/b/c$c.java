package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class c$c extends a
{
  private List<bi> mGC;
  private StringBuffer mGD;

  public c$c(List<bi> paramList)
  {
    AppMethodBeat.i(136750);
    this.mGC = new ArrayList();
    Collection localCollection;
    this.mGC.addAll(localCollection);
    this.mGD = new StringBuffer();
    AppMethodBeat.o(136750);
  }

  public final String aAo()
  {
    AppMethodBeat.i(136752);
    String str = this.mGD.toString();
    AppMethodBeat.o(136752);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136751);
    Object localObject = new ArrayList();
    Iterator localIterator = this.mGC.iterator();
    c.d locald;
    while (localIterator.hasNext())
    {
      bi localbi = (bi)localIterator.next();
      locald = new c.d(this.mGx, (byte)0);
      locald.cvx = localbi.field_msgId;
      locald.talker = localbi.field_talker;
      locald.createTime = localbi.field_createTime;
      locald.content = localbi.field_content;
      locald.msgType = localbi.getType();
      locald.mGF = localbi.field_isSend;
      if (c.a(locald))
      {
        locald.bAD();
        if (locald.isAvailable())
          ((List)localObject).add(locald);
      }
    }
    this.mGD.append("{MsgId: ");
    localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      locald = (c.d)localIterator.next();
      this.mGD.append(locald.cvx);
      this.mGD.append(",");
      this.mGD.append(locald.talker);
      this.mGD.append(",");
      this.mGD.append(locald.createTime);
      this.mGD.append(" ");
    }
    this.mGD.append("count: ");
    this.mGD.append(((List)localObject).size());
    this.mGD.append("}");
    if (((List)localObject).size() > 0)
    {
      this.mGx.mGp.beginTransaction();
      localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (c.d)localIterator.next();
        this.mGx.mGp.a(((c.d)localObject).mGE, ((c.d)localObject).cvx, ((c.d)localObject).talker, ((c.d)localObject).createTime, ((c.d)localObject).mGG, ((c.d)localObject).mGH);
      }
      this.mGx.mGp.commit();
    }
    AppMethodBeat.o(136751);
    return true;
  }

  public final String getName()
  {
    return "InsertMessageTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.c
 * JD-Core Version:    0.6.2
 */