package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aeq extends btd
{
  public int kdT;
  public String kdU;
  public int wms;
  public String wmt;
  public String wmu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56803);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      paramArrayOfObject.iz(4, this.wms);
      if (this.wmt != null)
        paramArrayOfObject.e(5, this.wmt);
      if (this.wmu != null)
        paramArrayOfObject.e(6, this.wmu);
      AppMethodBeat.o(56803);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label611;
    label611: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wms);
      paramInt = i;
      if (this.wmt != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wmt);
      i = paramInt;
      if (this.wmu != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wmu);
      AppMethodBeat.o(56803);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56803);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aeq localaeq = (aeq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56803);
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
            localaeq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        case 2:
          localaeq.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        case 3:
          localaeq.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        case 4:
          localaeq.wms = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        case 5:
          localaeq.wmt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        case 6:
          localaeq.wmu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56803);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56803);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aeq
 * JD-Core Version:    0.6.2
 */