package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mz extends btd
{
  public String ndF;
  public String ndG;
  public int pcX;
  public long ptF;
  public String vRA;
  public String vRl;
  public String vRw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80032);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80032);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vRl != null)
        paramArrayOfObject.e(3, this.vRl);
      if (this.ndG != null)
        paramArrayOfObject.e(4, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(5, this.ndF);
      paramArrayOfObject.iz(9, this.pcX);
      paramArrayOfObject.ai(10, this.ptF);
      if (this.vRw != null)
        paramArrayOfObject.e(11, this.vRw);
      if (this.vRA != null)
        paramArrayOfObject.e(12, this.vRA);
      AppMethodBeat.o(80032);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label804;
    label804: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vRl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vRl);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ndF);
      i = i + e.a.a.b.b.a.bs(9, this.pcX) + e.a.a.b.b.a.o(10, this.ptF);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vRw);
      i = paramInt;
      if (this.vRA != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.vRA);
      AppMethodBeat.o(80032);
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
          AppMethodBeat.o(80032);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80032);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mz localmz = (mz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 2:
        case 6:
        case 7:
        case 8:
        default:
          AppMethodBeat.o(80032);
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
            localmz.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 3:
          localmz.vRl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 4:
          localmz.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 5:
          localmz.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 9:
          localmz.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 10:
          localmz.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 11:
          localmz.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        case 12:
          localmz.vRA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80032);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80032);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mz
 * JD-Core Version:    0.6.2
 */