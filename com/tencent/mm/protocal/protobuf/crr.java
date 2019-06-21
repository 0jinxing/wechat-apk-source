package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crr extends com.tencent.mm.bt.a
{
  public LinkedList<cqt> xoJ;
  public cqm xoW;
  public int xpj;

  public crr()
  {
    AppMethodBeat.i(102429);
    this.xoJ = new LinkedList();
    AppMethodBeat.o(102429);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102430);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_response");
        AppMethodBeat.o(102430);
        throw paramArrayOfObject;
      }
      if (this.xoW != null)
      {
        paramArrayOfObject.iy(1, this.xoW.computeSize());
        this.xoW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.xoJ);
      paramArrayOfObject.iz(3, this.xpj);
      AppMethodBeat.o(102430);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoW == null)
        break label561;
    label561: for (paramInt = e.a.a.a.ix(1, this.xoW.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.xoJ) + e.a.a.b.b.a.bs(3, this.xpj);
      AppMethodBeat.o(102430);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xoJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_response");
          AppMethodBeat.o(102430);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102430);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crr localcrr = (crr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102430);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrr.xoW = paramArrayOfObject;
          }
          AppMethodBeat.o(102430);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrr.xoJ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(102430);
          paramInt = i;
          break;
        case 3:
          localcrr.xpj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102430);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102430);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crr
 * JD-Core Version:    0.6.2
 */