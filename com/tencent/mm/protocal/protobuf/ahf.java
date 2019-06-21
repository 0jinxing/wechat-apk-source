package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ahf extends btd
{
  public int jBT;
  public int wnG;
  public int wnH;
  public int wnI;
  public int wnJ;
  public String wnK;
  public int wnL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5584);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5584);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBT);
      paramArrayOfObject.iz(3, this.wnG);
      paramArrayOfObject.iz(4, this.wnH);
      paramArrayOfObject.iz(5, this.wnI);
      paramArrayOfObject.iz(6, this.wnJ);
      if (this.wnK != null)
        paramArrayOfObject.e(7, this.wnK);
      paramArrayOfObject.iz(8, this.wnL);
      AppMethodBeat.o(5584);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label731;
    label731: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBT) + e.a.a.b.b.a.bs(3, this.wnG) + e.a.a.b.b.a.bs(4, this.wnH) + e.a.a.b.b.a.bs(5, this.wnI) + e.a.a.b.b.a.bs(6, this.wnJ);
      paramInt = i;
      if (this.wnK != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wnK);
      paramInt += e.a.a.b.b.a.bs(8, this.wnL);
      AppMethodBeat.o(5584);
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
          AppMethodBeat.o(5584);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5584);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahf localahf = (ahf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5584);
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
            localahf.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 2:
          localahf.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 3:
          localahf.wnG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 4:
          localahf.wnH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 5:
          localahf.wnI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 6:
          localahf.wnJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 7:
          localahf.wnK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        case 8:
          localahf.wnL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5584);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5584);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahf
 * JD-Core Version:    0.6.2
 */