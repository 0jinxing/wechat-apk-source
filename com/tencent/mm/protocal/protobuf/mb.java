package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mb extends btd
{
  public int kdT;
  public String kdU;
  public int vPW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56732);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      paramArrayOfObject.iz(4, this.vPW);
      AppMethodBeat.o(56732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label528;
    label528: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      paramInt += e.a.a.b.b.a.bs(4, this.vPW);
      AppMethodBeat.o(56732);
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
          AppMethodBeat.o(56732);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mb localmb = (mb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56732);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56732);
          paramInt = i;
          break;
        case 2:
          localmb.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56732);
          paramInt = i;
          break;
        case 3:
          localmb.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56732);
          paramInt = i;
          break;
        case 4:
          localmb.vPW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mb
 * JD-Core Version:    0.6.2
 */