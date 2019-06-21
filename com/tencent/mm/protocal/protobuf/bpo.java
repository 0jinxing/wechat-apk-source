package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpo extends btd
{
  public int id;
  public bpj wRK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28609);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wRK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
        AppMethodBeat.o(28609);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28609);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.id);
      if (this.wRK != null)
      {
        paramArrayOfObject.iy(2, this.wRK.computeSize());
        this.wRK.writeFields(paramArrayOfObject);
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(3, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28609);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.wRK != null)
          paramInt = i + e.a.a.a.ix(2, this.wRK.computeSize());
        i = paramInt;
        if (this.BaseResponse != null)
          i = paramInt + e.a.a.a.ix(3, this.BaseResponse.computeSize());
        AppMethodBeat.o(28609);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wRK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
          AppMethodBeat.o(28609);
          throw paramArrayOfObject;
        }
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28609);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28609);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpo localbpo = (bpo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28609);
          break;
        case 1:
          localbpo.id = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28609);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpo.wRK = paramArrayOfObject;
          }
          AppMethodBeat.o(28609);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28609);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28609);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpo
 * JD-Core Version:    0.6.2
 */