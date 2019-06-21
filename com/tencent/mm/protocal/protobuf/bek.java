package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bek extends com.tencent.mm.bt.a
{
  public int Ret;
  public int jBT;
  public int vQe;
  public SKBuiltinBuffer_t vTO;
  public tc vTR;
  public int wIy;
  public int wIz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58923);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdList");
        AppMethodBeat.o(58923);
        throw paramArrayOfObject;
      }
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(58923);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vTR != null)
      {
        paramArrayOfObject.iy(2, this.vTR.computeSize());
        this.vTR.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vQe);
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(4, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.jBT);
      paramArrayOfObject.iz(6, this.wIy);
      paramArrayOfObject.iz(7, this.wIz);
      AppMethodBeat.o(58923);
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
        i = paramInt + e.a.a.b.b.a.bs(3, this.vQe);
        paramInt = i;
        if (this.vTO != null)
          paramInt = i + e.a.a.a.ix(4, this.vTO.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(5, this.jBT) + e.a.a.b.b.a.bs(6, this.wIy) + e.a.a.b.b.a.bs(7, this.wIz);
        AppMethodBeat.o(58923);
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
          AppMethodBeat.o(58923);
          throw paramArrayOfObject;
        }
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(58923);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58923);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bek localbek = (bek)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58923);
          break;
        case 1:
          localbek.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58923);
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
            localbek.vTR = paramArrayOfObject;
          }
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        case 3:
          localbek.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbek.vTO = paramArrayOfObject;
          }
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        case 5:
          localbek.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        case 6:
          localbek.wIy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        case 7:
          localbek.wIz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58923);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58923);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bek
 * JD-Core Version:    0.6.2
 */