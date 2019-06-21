package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.d.bo;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.f.d;
import java.util.Iterator;
import java.util.LinkedList;

public final class y extends x
{
  private int mType;
  public bo mXH;
  public LinkedList<c> mXI;
  private int mXJ;

  public y(a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111359);
    this.mType = 0;
    this.mXJ = 0;
    if (parama == null)
    {
      this.mXH = new bo();
      AppMethodBeat.o(111359);
    }
    while (true)
    {
      return;
      this.mXH = ((bo)parama);
      this.mType = paramInt1;
      this.mXJ = paramInt2;
      LinkedList localLinkedList = new LinkedList();
      if (this.mXH.ncx != null)
      {
        paramInt1 = this.mXJ;
        Iterator localIterator = this.mXH.ncx.iterator();
        paramInt1++;
        while (localIterator.hasNext())
        {
          parama = a((e)localIterator.next());
          if (parama != null)
          {
            switch (this.mType)
            {
            default:
            case 1:
            case 2:
            }
            while (true)
            {
              localLinkedList.add(parama);
              break;
              parama.scene = 16;
              parama.cKG = 1601;
              paramInt2 = paramInt1 + 1;
              parama.position = paramInt1;
              paramInt1 = paramInt2;
              continue;
              parama.scene = 15;
              parama.cKG = 1501;
              paramInt2 = paramInt1 + 1;
              parama.position = paramInt1;
              paramInt1 = paramInt2;
            }
          }
        }
      }
      this.mXI = localLinkedList;
      d.ac(this.mXI);
      AppMethodBeat.o(111359);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.y
 * JD-Core Version:    0.6.2
 */