package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class abn extends com.tencent.mm.bt.a
  implements bzw
{
  public int Ret;
  public int vQe;
  public SKBuiltinBuffer_t vTO;
  public tc vTR;

  public final int getRet()
  {
    return this.Ret;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51414);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdList");
        AppMethodBeat.o(51414);
        throw paramArrayOfObject;
      }
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(51414);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vTR != null)
      {
        paramArrayOfObject.iy(2, this.vTR.computeSize());
        this.vTR.writeFields(paramArrayOfObject);
      }
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(3, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vQe);
      AppMethodBeat.o(51414);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.vTR != null)
          paramInt = i + e.a.a.a.ix(2, this.vTR.computeSize());
        i = paramInt;
        if (this.vTO != null)
          i = paramInt + e.a.a.a.ix(3, this.vTO.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(4, this.vQe);
        AppMethodBeat.o(51414);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vTR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CmdList");
          AppMethodBeat.o(51414);
          throw paramArrayOfObject;
        }
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(51414);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51414);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        abn localabn = (abn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51414);
          break;
        case 1:
          localabn.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51414);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabn.vTR = paramArrayOfObject;
          }
          AppMethodBeat.o(51414);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabn.vTO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(51414);
          paramInt = 0;
          break;
        case 4:
          localabn.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51414);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51414);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abn
 * JD-Core Version:    0.6.2
 */