package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class agi extends btd
{
  public int kdT;
  public String kdU;
  public boolean wne;
  public int wnf;
  public int wng;
  public ny wnh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89074);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89074);
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
      paramArrayOfObject.aO(4, this.wne);
      paramArrayOfObject.iz(5, this.wnf);
      paramArrayOfObject.iz(6, this.wng);
      if (this.wnh != null)
      {
        paramArrayOfObject.iy(7, this.wnh.computeSize());
        this.wnh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89074);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label779;
    label779: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.b.b.a.bs(5, this.wnf) + e.a.a.b.b.a.bs(6, this.wng);
      paramInt = i;
      if (this.wnh != null)
        paramInt = i + e.a.a.a.ix(7, this.wnh.computeSize());
      AppMethodBeat.o(89074);
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
          AppMethodBeat.o(89074);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89074);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agi localagi = (agi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89074);
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
            localagi.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 2:
          localagi.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 3:
          localagi.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 4:
          localagi.wne = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 5:
          localagi.wnf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 6:
          localagi.wng = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ny)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagi.wnh = ((ny)localObject1);
          }
          AppMethodBeat.o(89074);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89074);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agi
 * JD-Core Version:    0.6.2
 */