package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class adk extends btd
{
  public int luT;
  public String luU;
  public String wlb;
  public String wlc;
  public csj wlh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56801);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56801);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wlb != null)
        paramArrayOfObject.e(2, this.wlb);
      if (this.wlc != null)
        paramArrayOfObject.e(3, this.wlc);
      paramArrayOfObject.iz(4, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(5, this.luU);
      if (this.wlh != null)
      {
        paramArrayOfObject.iy(6, this.wlh.computeSize());
        this.wlh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56801);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label771;
    label771: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wlb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wlb);
      i = paramInt;
      if (this.wlc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wlc);
      i += e.a.a.b.b.a.bs(4, this.luT);
      paramInt = i;
      if (this.luU != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.luU);
      i = paramInt;
      if (this.wlh != null)
        i = paramInt + e.a.a.a.ix(6, this.wlh.computeSize());
      AppMethodBeat.o(56801);
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
          AppMethodBeat.o(56801);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56801);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adk localadk = (adk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56801);
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
            localadk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        case 2:
          localadk.wlb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        case 3:
          localadk.wlc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        case 4:
          localadk.luT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        case 5:
          localadk.luU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new csj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadk.wlh = paramArrayOfObject;
          }
          AppMethodBeat.o(56801);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56801);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adk
 * JD-Core Version:    0.6.2
 */