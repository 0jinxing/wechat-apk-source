package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cay extends btd
{
  public int jCt;
  public int ptw;
  public int ptx;
  public SKBuiltinBuffer_t vJd;
  public String xac;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94574);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94574);
        throw paramArrayOfObject;
      }
      if (this.vJd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buffer");
        AppMethodBeat.o(94574);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(4, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      if (this.xac != null)
        paramArrayOfObject.e(5, this.xac);
      paramArrayOfObject.iz(6, this.jCt);
      AppMethodBeat.o(94574);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label783;
    label783: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
      paramInt = i;
      if (this.vJd != null)
        paramInt = i + e.a.a.a.ix(4, this.vJd.computeSize());
      i = paramInt;
      if (this.xac != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.xac);
      paramInt = i + e.a.a.b.b.a.bs(6, this.jCt);
      AppMethodBeat.o(94574);
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
          AppMethodBeat.o(94574);
          throw paramArrayOfObject;
        }
        if (this.vJd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buffer");
          AppMethodBeat.o(94574);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94574);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cay localcay = (cay)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94574);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcay.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(94574);
          paramInt = i;
          break;
        case 2:
          localcay.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94574);
          paramInt = i;
          break;
        case 3:
          localcay.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94574);
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
            localcay.vJd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94574);
          paramInt = i;
          break;
        case 5:
          localcay.xac = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94574);
          paramInt = i;
          break;
        case 6:
          localcay.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94574);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94574);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cay
 * JD-Core Version:    0.6.2
 */