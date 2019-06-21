package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class yb extends btd
{
  public boolean wdL;
  public String wdM;
  public String wdN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62526);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62526);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.wdL);
      if (this.wdM != null)
        paramArrayOfObject.e(3, this.wdM);
      if (this.wdN != null)
        paramArrayOfObject.e(4, this.wdN);
      AppMethodBeat.o(62526);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label545;
    label545: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 1);
      paramInt = i;
      if (this.wdM != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wdM);
      i = paramInt;
      if (this.wdN != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wdN);
      AppMethodBeat.o(62526);
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
          AppMethodBeat.o(62526);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62526);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yb localyb = (yb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62526);
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
            localyb.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(62526);
          paramInt = i;
          break;
        case 2:
          localyb.wdL = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(62526);
          paramInt = i;
          break;
        case 3:
          localyb.wdM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62526);
          paramInt = i;
          break;
        case 4:
          localyb.wdN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62526);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62526);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yb
 * JD-Core Version:    0.6.2
 */