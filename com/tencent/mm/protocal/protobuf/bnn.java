package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnn extends btd
{
  public int kdT;
  public String kdU;
  public String wNr;
  public String wNs;
  public mu wpq;
  public atk wps;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48938);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48938);
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
      if (this.wps != null)
      {
        paramArrayOfObject.iy(4, this.wps.computeSize());
        this.wps.writeFields(paramArrayOfObject);
      }
      if (this.wNr != null)
        paramArrayOfObject.e(5, this.wNr);
      if (this.wNs != null)
        paramArrayOfObject.e(6, this.wNs);
      if (this.wpq != null)
      {
        paramArrayOfObject.iy(7, this.wpq.computeSize());
        this.wpq.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48938);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label925;
    label925: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wps != null)
        i = paramInt + e.a.a.a.ix(4, this.wps.computeSize());
      paramInt = i;
      if (this.wNr != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wNr);
      i = paramInt;
      if (this.wNs != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wNs);
      paramInt = i;
      if (this.wpq != null)
        paramInt = i + e.a.a.a.ix(7, this.wpq.computeSize());
      AppMethodBeat.o(48938);
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
          AppMethodBeat.o(48938);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48938);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnn localbnn = (bnn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48938);
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
            localbnn.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 2:
          localbnn.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 3:
          localbnn.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnn.wps = paramArrayOfObject;
          }
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 5:
          localbnn.wNr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 6:
          localbnn.wNs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnn.wpq = paramArrayOfObject;
          }
          AppMethodBeat.o(48938);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48938);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnn
 * JD-Core Version:    0.6.2
 */