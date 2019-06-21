package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bhs extends com.tencent.mm.bt.a
{
  public int jBv;
  public LinkedList<bhp> wKT;
  public LinkedList<Integer> wof;

  public bhs()
  {
    AppMethodBeat.i(60059);
    this.wof = new LinkedList();
    this.wKT = new LinkedList();
    AppMethodBeat.o(60059);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60060);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jBv);
      paramArrayOfObject.f(2, 2, this.wof);
      paramArrayOfObject.e(3, 8, this.wKT);
      AppMethodBeat.o(60060);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.jBv) + 0 + e.a.a.a.d(2, 2, this.wof) + e.a.a.a.c(3, 8, this.wKT);
        AppMethodBeat.o(60060);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wof.clear();
        this.wKT.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60060);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhs localbhs = (bhs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60060);
          break;
        case 1:
          localbhs.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60060);
          paramInt = 0;
          break;
        case 2:
          localbhs.wof = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(60060);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhs.wKT.add(localObject1);
          }
          AppMethodBeat.o(60060);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60060);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhs
 * JD-Core Version:    0.6.2
 */