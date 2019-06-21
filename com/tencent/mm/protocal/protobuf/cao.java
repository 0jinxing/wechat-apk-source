package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cao extends com.tencent.mm.bt.a
{
  public String ptv;
  public long vQE;
  public long wZM;
  public can wZN;
  public can wZO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94564);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CurrentAction");
        AppMethodBeat.o(94564);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQE);
      paramArrayOfObject.ai(2, this.wZM);
      if (this.wZN != null)
      {
        paramArrayOfObject.iy(3, this.wZN.computeSize());
        this.wZN.writeFields(paramArrayOfObject);
      }
      if (this.wZO != null)
      {
        paramArrayOfObject.iy(4, this.wZO.computeSize());
        this.wZO.writeFields(paramArrayOfObject);
      }
      if (this.ptv != null)
        paramArrayOfObject.e(5, this.ptv);
      AppMethodBeat.o(94564);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.vQE) + 0 + e.a.a.b.b.a.o(2, this.wZM);
        i = paramInt;
        if (this.wZN != null)
          i = paramInt + e.a.a.a.ix(3, this.wZN.computeSize());
        paramInt = i;
        if (this.wZO != null)
          paramInt = i + e.a.a.a.ix(4, this.wZO.computeSize());
        i = paramInt;
        if (this.ptv != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.ptv);
        AppMethodBeat.o(94564);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wZN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CurrentAction");
          AppMethodBeat.o(94564);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94564);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cao localcao = (cao)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94564);
          break;
        case 1:
          localcao.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94564);
          paramInt = 0;
          break;
        case 2:
          localcao.wZM = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94564);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new can();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((can)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcao.wZN = ((can)localObject1);
          }
          AppMethodBeat.o(94564);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new can();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcao.wZO = paramArrayOfObject;
          }
          AppMethodBeat.o(94564);
          paramInt = 0;
          break;
        case 5:
          localcao.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94564);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94564);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cao
 * JD-Core Version:    0.6.2
 */