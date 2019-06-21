package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bq extends com.tencent.mm.bt.a
{
  public axb vDV;
  public LinkedList<axc> vDW;

  public bq()
  {
    AppMethodBeat.i(70471);
    this.vDW = new LinkedList();
    AppMethodBeat.o(70471);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(70472);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vDV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: LogHead");
        AppMethodBeat.o(70472);
        throw paramArrayOfObject;
      }
      if (this.vDV != null)
      {
        paramArrayOfObject.iy(1, this.vDV.computeSize());
        this.vDV.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vDW);
      AppMethodBeat.o(70472);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vDV == null)
        break label519;
    label519: for (paramInt = e.a.a.a.ix(1, this.vDV.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.vDW);
      AppMethodBeat.o(70472);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vDW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vDV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: LogHead");
          AppMethodBeat.o(70472);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(70472);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bq localbq = (bq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(70472);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbq.vDV = paramArrayOfObject;
          }
          AppMethodBeat.o(70472);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbq.vDW.add(localObject1);
          }
          AppMethodBeat.o(70472);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(70472);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bq
 * JD-Core Version:    0.6.2
 */