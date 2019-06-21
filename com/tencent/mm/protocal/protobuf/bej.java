package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bej extends com.tencent.mm.bt.a
{
  public int Scene;
  public String vIk;
  public int vTN;
  public SKBuiltinBuffer_t vTO;
  public tc wIw;
  public int wIx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58922);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wIw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Oplog");
        AppMethodBeat.o(58922);
        throw paramArrayOfObject;
      }
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(58922);
        throw paramArrayOfObject;
      }
      if (this.wIw != null)
      {
        paramArrayOfObject.iy(1, this.wIw.computeSize());
        this.wIw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vTN);
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(3, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.Scene);
      if (this.vIk != null)
        paramArrayOfObject.e(5, this.vIk);
      paramArrayOfObject.iz(6, this.wIx);
      AppMethodBeat.o(58922);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wIw == null)
        break label783;
    label783: for (paramInt = e.a.a.a.ix(1, this.wIw.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vTN);
      paramInt = i;
      if (this.vTO != null)
        paramInt = i + e.a.a.a.ix(3, this.vTO.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(4, this.Scene);
      paramInt = i;
      if (this.vIk != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vIk);
      paramInt += e.a.a.b.b.a.bs(6, this.wIx);
      AppMethodBeat.o(58922);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wIw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Oplog");
          AppMethodBeat.o(58922);
          throw paramArrayOfObject;
        }
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(58922);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58922);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bej localbej = (bej)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58922);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbej.wIw = paramArrayOfObject;
          }
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        case 2:
          localbej.vTN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbej.vTO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        case 4:
          localbej.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        case 5:
          localbej.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        case 6:
          localbej.wIx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58922);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58922);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bej
 * JD-Core Version:    0.6.2
 */