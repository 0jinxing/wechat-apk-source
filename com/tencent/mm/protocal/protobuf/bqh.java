package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bqh extends com.tencent.mm.bt.a
{
  public bts wSA;
  public int wSB;
  public LinkedList<bvn> wSC;

  public bqh()
  {
    AppMethodBeat.i(14738);
    this.wSC = new LinkedList();
    AppMethodBeat.o(14738);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14739);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wSA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: GroupName");
        AppMethodBeat.o(14739);
        throw paramArrayOfObject;
      }
      if (this.wSA != null)
      {
        paramArrayOfObject.iy(1, this.wSA.computeSize());
        this.wSA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wSB);
      paramArrayOfObject.e(3, 8, this.wSC);
      AppMethodBeat.o(14739);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wSA == null)
        break label574;
    label574: for (paramInt = e.a.a.a.ix(1, this.wSA.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wSB) + e.a.a.a.c(3, 8, this.wSC);
      AppMethodBeat.o(14739);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wSC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wSA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: GroupName");
          AppMethodBeat.o(14739);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14739);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqh localbqh = (bqh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14739);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqh.wSA = paramArrayOfObject;
          }
          AppMethodBeat.o(14739);
          paramInt = i;
          break;
        case 2:
          localbqh.wSB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14739);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bvn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqh.wSC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(14739);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14739);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqh
 * JD-Core Version:    0.6.2
 */