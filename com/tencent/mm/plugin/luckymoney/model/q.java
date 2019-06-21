package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class q extends com.tencent.mm.bt.a
{
  public int mLA;
  public int nXH;
  public long nXI;
  public int nXJ;
  public long nXK;
  public int nXa;
  public LinkedList<r> nXj;

  public q()
  {
    AppMethodBeat.i(56612);
    this.nXj = new LinkedList();
    AppMethodBeat.o(56612);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56613);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.nXH);
      paramArrayOfObject.ai(2, this.nXI);
      paramArrayOfObject.iz(3, this.nXJ);
      paramArrayOfObject.ai(4, this.nXK);
      paramArrayOfObject.iz(5, this.mLA);
      paramArrayOfObject.iz(6, this.nXa);
      paramArrayOfObject.e(7, 8, this.nXj);
      AppMethodBeat.o(56613);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.nXH) + 0 + e.a.a.b.b.a.o(2, this.nXI) + e.a.a.b.b.a.bs(3, this.nXJ) + e.a.a.b.b.a.o(4, this.nXK) + e.a.a.b.b.a.bs(5, this.mLA) + e.a.a.b.b.a.bs(6, this.nXa) + e.a.a.a.c(7, 8, this.nXj);
        AppMethodBeat.o(56613);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nXj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56613);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        q localq = (q)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56613);
          break;
        case 1:
          localq.nXH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 2:
          localq.nXI = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 3:
          localq.nXJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 4:
          localq.nXK = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 5:
          localq.mLA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 6:
          localq.nXa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new r();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localq.nXj.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56613);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56613);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.q
 * JD-Core Version:    0.6.2
 */