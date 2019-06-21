package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.backup.i.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class i extends b
{
  private com.tencent.mm.plugin.backup.i.i jxT;
  public j jxU;

  public i(LinkedList<String> paramLinkedList, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(17674);
    this.jxT = new com.tencent.mm.plugin.backup.i.i();
    this.jxU = new j();
    ab.i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.jxT.jBx = paramLinkedList;
    this.jxT.jBy = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      paramLinkedList.next();
      this.jxT.jBy.add(Long.valueOf(paramLong1));
      this.jxT.jBy.add(Long.valueOf(paramLong2));
    }
    AppMethodBeat.o(17674);
  }

  public final a aTS()
  {
    return this.jxU;
  }

  public final a aTT()
  {
    return this.jxT;
  }

  public final int getType()
  {
    return 11;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17675);
    if ((this.jxU.jBx == null) || (this.jxU.jBy == null) || (this.jxU.jBx.isEmpty()) || (this.jxU.jBx.size() * 2 != this.jxU.jBy.size()))
    {
      if ((this.jxU.jBx != null) && (this.jxU.jBy != null))
        ab.e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", new Object[] { Integer.valueOf(this.jxU.jBx.size()), Integer.valueOf(this.jxU.jBy.size()) });
      l(4, -1, "BackupRequestSession failed");
      AppMethodBeat.o(17675);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", new Object[] { Integer.valueOf(this.jxU.jBx.size()), this.jxU.jBx.toString() });
      ab.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", new Object[] { this.jxU.jBy.toString() });
      l(0, 0, "BackupRequestSession success");
      AppMethodBeat.o(17675);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.i
 * JD-Core Version:    0.6.2
 */