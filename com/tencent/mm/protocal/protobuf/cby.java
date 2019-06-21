package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cby extends btd
{
  public int vQe;
  public SKBuiltinBuffer_t vTO;
  public tc vTR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94605);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94605);
        throw paramArrayOfObject;
      }
      if (this.vTR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdList");
        AppMethodBeat.o(94605);
        throw paramArrayOfObject;
      }
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(94605);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
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
      AppMethodBeat.o(94605);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label830;
    label830: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vTR != null)
        i = paramInt + e.a.a.a.ix(2, this.vTR.computeSize());
      i += e.a.a.b.b.a.bs(3, this.vQe);
      paramInt = i;
      if (this.vTO != null)
        paramInt = i + e.a.a.a.ix(4, this.vTO.computeSize());
      AppMethodBeat.o(94605);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(94605);
          throw paramArrayOfObject;
        }
        if (this.vTR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CmdList");
          AppMethodBeat.o(94605);
          throw paramArrayOfObject;
        }
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(94605);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94605);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cby localcby = (cby)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94605);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcby.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(94605);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcby.vTR = paramArrayOfObject;
          }
          AppMethodBeat.o(94605);
          paramInt = i;
          break;
        case 3:
          localcby.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94605);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcby.vTO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94605);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94605);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cby
 * JD-Core Version:    0.6.2
 */