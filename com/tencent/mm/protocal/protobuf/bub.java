package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bub extends btd
{
  public int kCl;
  public String kCm;
  public int kdC;
  public String wVU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56964);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56964);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      paramArrayOfObject.iz(4, this.kdC);
      if (this.wVU != null)
        paramArrayOfObject.e(5, this.wVU);
      AppMethodBeat.o(56964);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label592;
    label592: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.b.b.a.bs(4, this.kdC);
      paramInt = i;
      if (this.wVU != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wVU);
      AppMethodBeat.o(56964);
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
          AppMethodBeat.o(56964);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56964);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bub localbub = (bub)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56964);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbub.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56964);
          paramInt = i;
          break;
        case 2:
          localbub.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56964);
          paramInt = i;
          break;
        case 3:
          localbub.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56964);
          paramInt = i;
          break;
        case 4:
          localbub.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56964);
          paramInt = i;
          break;
        case 5:
          localbub.wVU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56964);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56964);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bub
 * JD-Core Version:    0.6.2
 */