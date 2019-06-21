package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ciq extends btd
{
  public int cyE;
  public String cyF;
  public int version;
  public String xhx;
  public String xhy;
  public bzl xhz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80200);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80200);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.cyE);
      if (this.cyF != null)
        paramArrayOfObject.e(3, this.cyF);
      if (this.xhx != null)
        paramArrayOfObject.e(4, this.xhx);
      if (this.xhy != null)
        paramArrayOfObject.e(5, this.xhy);
      if (this.xhz != null)
      {
        paramArrayOfObject.iy(6, this.xhz.computeSize());
        this.xhz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.version);
      AppMethodBeat.o(80200);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label818;
    label818: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.cyE);
      paramInt = i;
      if (this.cyF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.cyF);
      i = paramInt;
      if (this.xhx != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xhx);
      paramInt = i;
      if (this.xhy != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xhy);
      i = paramInt;
      if (this.xhz != null)
        i = paramInt + e.a.a.a.ix(6, this.xhz.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(7, this.version);
      AppMethodBeat.o(80200);
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
          AppMethodBeat.o(80200);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80200);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ciq localciq = (ciq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80200);
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
            localciq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 2:
          localciq.cyE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 3:
          localciq.cyF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 4:
          localciq.xhx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 5:
          localciq.xhy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localciq.xhz = paramArrayOfObject;
          }
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        case 7:
          localciq.version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80200);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80200);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ciq
 * JD-Core Version:    0.6.2
 */