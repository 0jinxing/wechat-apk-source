package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class al<K, O>
{
  private int maxSize;
  Map<K, al<K, O>.b<O>> qMs;
  private al.a qMt;

  public al(int paramInt, al.a parama)
  {
    AppMethodBeat.i(36569);
    this.qMs = null;
    this.qMt = null;
    this.maxSize = paramInt;
    this.qMs = new HashMap();
    this.qMt = parama;
    AppMethodBeat.o(36569);
  }

  public final void coa()
  {
    AppMethodBeat.i(36570);
    int i;
    if (this.qMs.size() > this.maxSize)
    {
      Object localObject1 = new ArrayList(this.qMs.entrySet());
      Collections.sort((List)localObject1, new al.1(this));
      i = this.qMs.size() - this.maxSize;
      if (i <= 0)
      {
        AppMethodBeat.o(36570);
        return;
      }
      localObject1 = ((ArrayList)localObject1).iterator();
      label80: if (((Iterator)localObject1).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        Object localObject2 = localEntry.getKey();
        if (!this.qMt.cn(localObject2))
          break label165;
        ab.d("MicroMsg.SnsLRUMap", " remove targetKey: " + localEntry.getKey());
        i--;
      }
    }
    label165: 
    while (true)
    {
      if (i <= 0)
      {
        AppMethodBeat.o(36570);
        break;
      }
      break label80;
    }
  }

  public final class b<OO>
  {
    public OO obj;
    public Long qMv;

    public b()
    {
      AppMethodBeat.i(36567);
      Object localObject;
      this.obj = localObject;
      cob();
      AppMethodBeat.o(36567);
    }

    public final void cob()
    {
      AppMethodBeat.i(36568);
      this.qMv = Long.valueOf(System.currentTimeMillis());
      AppMethodBeat.o(36568);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.al
 * JD-Core Version:    0.6.2
 */