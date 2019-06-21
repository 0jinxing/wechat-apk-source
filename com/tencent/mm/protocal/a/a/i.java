package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class i extends com.tencent.mm.bt.a
{
  public int vyT;
  public int vzh;
  public int vzj;
  public LinkedList<e> vzk;
  public b vzl;

  public i()
  {
    AppMethodBeat.i(72826);
    this.vzk = new LinkedList();
    AppMethodBeat.o(72826);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72827);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vyT);
      paramArrayOfObject.iz(2, this.vzj);
      paramArrayOfObject.iz(3, this.vzh);
      paramArrayOfObject.e(4, 8, this.vzk);
      if (this.vzl != null)
        paramArrayOfObject.c(5, this.vzl);
      AppMethodBeat.o(72827);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vyT) + 0 + e.a.a.b.b.a.bs(2, this.vzj) + e.a.a.b.b.a.bs(3, this.vzh) + e.a.a.a.c(4, 8, this.vzk);
        paramInt = i;
        if (this.vzl != null)
          paramInt = i + e.a.a.b.b.a.b(5, this.vzl);
        AppMethodBeat.o(72827);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72827);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72827);
          break;
        case 1:
          locali.vyT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72827);
          paramInt = 0;
          break;
        case 2:
          locali.vzj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72827);
          paramInt = 0;
          break;
        case 3:
          locali.vzh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72827);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.vzk.add(localObject1);
          }
          AppMethodBeat.o(72827);
          paramInt = 0;
          break;
        case 5:
          locali.vzl = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(72827);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.i
 * JD-Core Version:    0.6.2
 */