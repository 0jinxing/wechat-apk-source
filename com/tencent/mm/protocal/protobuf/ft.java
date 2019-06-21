package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ft extends btd
{
  public String mZr;
  public String vHD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62510);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62510);
        throw paramArrayOfObject;
      }
      if (this.vHD == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqKey");
        AppMethodBeat.o(62510);
        throw paramArrayOfObject;
      }
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(62510);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vHD != null)
        paramArrayOfObject.e(2, this.vHD);
      if (this.mZr != null)
        paramArrayOfObject.e(3, this.mZr);
      AppMethodBeat.o(62510);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label598;
    label598: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHD != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vHD);
      i = paramInt;
      if (this.mZr != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZr);
      AppMethodBeat.o(62510);
      paramInt = i;
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
          AppMethodBeat.o(62510);
          throw paramArrayOfObject;
        }
        if (this.vHD == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqKey");
          AppMethodBeat.o(62510);
          throw paramArrayOfObject;
        }
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(62510);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62510);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ft localft = (ft)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62510);
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
            localft.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(62510);
          paramInt = i;
          break;
        case 2:
          localft.vHD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62510);
          paramInt = i;
          break;
        case 3:
          localft.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62510);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62510);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ft
 * JD-Core Version:    0.6.2
 */