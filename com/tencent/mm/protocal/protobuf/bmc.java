package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmc extends com.tencent.mm.bt.a
{
  public int nwP;
  public LinkedList<bml> wPh;
  public int wem;
  public long wen;

  public bmc()
  {
    AppMethodBeat.i(28584);
    this.wPh = new LinkedList();
    AppMethodBeat.o(28584);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28585);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wem);
      paramArrayOfObject.ai(2, this.wen);
      paramArrayOfObject.e(3, 8, this.wPh);
      paramArrayOfObject.iz(4, this.nwP);
      AppMethodBeat.o(28585);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wem) + 0 + e.a.a.b.b.a.o(2, this.wen) + e.a.a.a.c(3, 8, this.wPh) + e.a.a.b.b.a.bs(4, this.nwP);
        AppMethodBeat.o(28585);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wPh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28585);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmc localbmc = (bmc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28585);
          break;
        case 1:
          localbmc.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28585);
          paramInt = 0;
          break;
        case 2:
          localbmc.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28585);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bml();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bml)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmc.wPh.add(localObject1);
          }
          AppMethodBeat.o(28585);
          paramInt = 0;
          break;
        case 4:
          localbmc.nwP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28585);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28585);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmc
 * JD-Core Version:    0.6.2
 */