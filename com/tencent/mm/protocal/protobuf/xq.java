package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import d.a.a.c;
import java.util.LinkedList;

public final class xq extends btd
{
  public int kdT;
  public String kdU;
  public c tBw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56772);
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
      if (this.tBw != null)
      {
        paramArrayOfObject.iy(4, this.tBw.computeSize());
        this.tBw.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56772);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label592;
    label592: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.tBw != null)
        i = paramInt + e.a.a.a.ix(4, this.tBw.computeSize());
      AppMethodBeat.o(56772);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56772);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xq localxq = (xq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56772);
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
            localxq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56772);
          paramInt = i;
          break;
        case 2:
          localxq.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56772);
          paramInt = i;
          break;
        case 3:
          localxq.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56772);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new c();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxq.tBw = paramArrayOfObject;
          }
          AppMethodBeat.o(56772);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56772);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xq
 * JD-Core Version:    0.6.2
 */