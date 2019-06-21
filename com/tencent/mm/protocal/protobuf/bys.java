package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bys extends btd
{
  public int Ret;
  public SKBuiltinBuffer_t vJd;
  public int wYa;
  public int wYc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28649);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28649);
        throw paramArrayOfObject;
      }
      if (this.vJd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buffer");
        AppMethodBeat.o(28649);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(2, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.Ret);
      paramArrayOfObject.iz(4, this.wYa);
      paramArrayOfObject.iz(5, this.wYc);
      AppMethodBeat.o(28649);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label732;
    label732: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vJd != null)
        i = paramInt + e.a.a.a.ix(2, this.vJd.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.Ret) + e.a.a.b.b.a.bs(4, this.wYa) + e.a.a.b.b.a.bs(5, this.wYc);
      AppMethodBeat.o(28649);
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
          AppMethodBeat.o(28649);
          throw paramArrayOfObject;
        }
        if (this.vJd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buffer");
          AppMethodBeat.o(28649);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28649);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bys localbys = (bys)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28649);
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
            localbys.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28649);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbys.vJd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28649);
          paramInt = i;
          break;
        case 3:
          localbys.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28649);
          paramInt = i;
          break;
        case 4:
          localbys.wYa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28649);
          paramInt = i;
          break;
        case 5:
          localbys.wYc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28649);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28649);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bys
 * JD-Core Version:    0.6.2
 */