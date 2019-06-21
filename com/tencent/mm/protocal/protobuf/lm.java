package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class lm extends com.tencent.mm.bt.a
{
  public int vOZ;
  public int vPa;
  public int vPb;
  public LinkedList<ll> vPc;
  public LinkedList<ll> vPd;

  public lm()
  {
    AppMethodBeat.i(58895);
    this.vPc = new LinkedList();
    this.vPd = new LinkedList();
    AppMethodBeat.o(58895);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58896);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vOZ);
      paramArrayOfObject.iz(2, this.vPa);
      paramArrayOfObject.iz(5, this.vPb);
      paramArrayOfObject.e(3, 8, this.vPc);
      paramArrayOfObject.e(4, 8, this.vPd);
      AppMethodBeat.o(58896);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vOZ) + 0 + e.a.a.b.b.a.bs(2, this.vPa) + e.a.a.b.b.a.bs(5, this.vPb) + e.a.a.a.c(3, 8, this.vPc) + e.a.a.a.c(4, 8, this.vPd);
        AppMethodBeat.o(58896);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vPc.clear();
        this.vPd.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58896);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lm locallm = (lm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int i;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58896);
          break;
        case 1:
          locallm.vOZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58896);
          paramInt = 0;
          break;
        case 2:
          locallm.vPa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58896);
          paramInt = 0;
          break;
        case 5:
          locallm.vPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58896);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ll();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ll)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallm.vPc.add(localObject1);
          }
          AppMethodBeat.o(58896);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ll();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ll)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallm.vPd.add(localObject1);
          }
          AppMethodBeat.o(58896);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58896);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lm
 * JD-Core Version:    0.6.2
 */