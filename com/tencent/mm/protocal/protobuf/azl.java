package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class azl extends btd
{
  public String kKw;
  public String kKx;
  public String sign;
  public String ulZ;
  public int uma;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10217);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10217);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.ulZ != null)
        paramArrayOfObject.e(2, this.ulZ);
      if (this.kKw != null)
        paramArrayOfObject.e(3, this.kKw);
      if (this.kKx != null)
        paramArrayOfObject.e(4, this.kKx);
      if (this.sign != null)
        paramArrayOfObject.e(5, this.sign);
      paramArrayOfObject.iz(6, this.uma);
      AppMethodBeat.o(10217);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label687;
    label687: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ulZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ulZ);
      i = paramInt;
      if (this.kKw != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kKw);
      paramInt = i;
      if (this.kKx != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kKx);
      i = paramInt;
      if (this.sign != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.sign);
      paramInt = i + e.a.a.b.b.a.bs(6, this.uma);
      AppMethodBeat.o(10217);
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
          AppMethodBeat.o(10217);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10217);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        azl localazl = (azl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10217);
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
            localazl.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        case 2:
          localazl.ulZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        case 3:
          localazl.kKw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        case 4:
          localazl.kKx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        case 5:
          localazl.sign = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        case 6:
          localazl.uma = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10217);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10217);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azl
 * JD-Core Version:    0.6.2
 */