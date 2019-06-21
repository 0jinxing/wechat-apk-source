package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class adr extends btd
{
  public int Timestamp;
  public LinkedList<com.tencent.mm.bt.b> wlP;
  public int wlQ;
  public LinkedList<Integer> wlR;

  public adr()
  {
    AppMethodBeat.i(118198);
    this.wlP = new LinkedList();
    this.wlR = new LinkedList();
    AppMethodBeat.o(118198);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118199);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(118199);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 6, this.wlP);
      paramArrayOfObject.iz(3, this.wlQ);
      paramArrayOfObject.iz(4, this.Timestamp);
      paramArrayOfObject.e(5, 2, this.wlR);
      AppMethodBeat.o(118199);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label587;
    label587: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 6, this.wlP) + e.a.a.b.b.a.bs(3, this.wlQ) + e.a.a.b.b.a.bs(4, this.Timestamp) + e.a.a.a.c(5, 2, this.wlR);
      AppMethodBeat.o(118199);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wlP.clear();
        this.wlR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(118199);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(118199);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adr localadr = (adr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118199);
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
            localadr.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(118199);
          paramInt = i;
          break;
        case 2:
          localadr.wlP.add(((e.a.a.a.a)localObject1).BTU.emu());
          AppMethodBeat.o(118199);
          paramInt = i;
          break;
        case 3:
          localadr.wlQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(118199);
          paramInt = i;
          break;
        case 4:
          localadr.Timestamp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(118199);
          paramInt = i;
          break;
        case 5:
          localadr.wlR.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(118199);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118199);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adr
 * JD-Core Version:    0.6.2
 */