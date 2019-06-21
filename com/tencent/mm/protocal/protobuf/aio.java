package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aio extends btd
{
  public com.tencent.mm.bt.b woA;
  public com.tencent.mm.bt.b woy;
  public int woz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80072);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80072);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.woz);
      if (this.woA != null)
        paramArrayOfObject.c(4, this.woA);
      if (this.woy != null)
        paramArrayOfObject.c(5, this.woy);
      AppMethodBeat.o(80072);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label552;
    label552: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(3, this.woz);
      paramInt = i;
      if (this.woA != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.woA);
      i = paramInt;
      if (this.woy != null)
        i = paramInt + e.a.a.b.b.a.b(5, this.woy);
      AppMethodBeat.o(80072);
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
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(80072);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80072);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aio localaio = (aio)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 2:
        default:
          AppMethodBeat.o(80072);
          paramInt = -1;
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
            localaio.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80072);
          paramInt = i;
          break;
        case 3:
          localaio.woz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80072);
          paramInt = i;
          break;
        case 4:
          localaio.woA = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(80072);
          paramInt = i;
          break;
        case 5:
          localaio.woy = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(80072);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80072);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aio
 * JD-Core Version:    0.6.2
 */