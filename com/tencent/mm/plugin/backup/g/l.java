package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.backup.f.h.a;
import com.tencent.mm.plugin.backup.i.af;
import com.tencent.mm.plugin.backup.i.ag;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class l extends b
{
  private af jyh;
  private ag jyi;
  private l.a jyj;

  public l(String paramString, HashMap<Long, h.a> paramHashMap, l.a parama)
  {
    AppMethodBeat.i(17681);
    this.jyh = new af();
    this.jyi = new ag();
    this.jyj = parama;
    this.jyh.jBt = paramString;
    ab.i("MicroMsg.BackupSvrIdScene", "init sessionName:%s", new Object[] { paramString });
    this.jyh.jCP = new LinkedList();
    this.jyh.jCQ = new LinkedList();
    this.jyh.jCR = new LinkedList();
    paramString = paramHashMap.keySet().iterator();
    while (paramString.hasNext())
    {
      parama = (h.a)paramHashMap.get((Long)paramString.next());
      this.jyh.jCP.add(Long.valueOf(parama.jvz));
      this.jyh.jCQ.add(parama.jvA);
      this.jyh.jCR.add(parama.cvZ);
    }
    AppMethodBeat.o(17681);
  }

  public final a aTS()
  {
    return this.jyi;
  }

  public final a aTT()
  {
    return this.jyh;
  }

  public final int getType()
  {
    return 13;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17682);
    ab.i("MicroMsg.BackupSvrIdScene", "onSceneEnd");
    l(0, 0, "success");
    this.jyj.D(this.jyi.jCP);
    AppMethodBeat.o(17682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.l
 * JD-Core Version:    0.6.2
 */