package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class kz extends btd
{
  public int fJT;
  public int jCt;
  public int vOn;
  public int vOr;
  public String vOt;
  public float vOu;
  public float vOv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11724);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(11724);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vOn);
      paramArrayOfObject.iz(3, this.jCt);
      if (this.vOt != null)
        paramArrayOfObject.e(4, this.vOt);
      paramArrayOfObject.iz(5, this.fJT);
      paramArrayOfObject.iz(6, this.vOr);
      paramArrayOfObject.r(7, this.vOu);
      paramArrayOfObject.r(8, this.vOv);
      AppMethodBeat.o(11724);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label733;
    label733: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOn) + e.a.a.b.b.a.bs(3, this.jCt);
      paramInt = i;
      if (this.vOt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vOt);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.fJT) + e.a.a.b.b.a.bs(6, this.vOr) + (e.a.a.b.b.a.fv(7) + 4) + (e.a.a.b.b.a.fv(8) + 4);
      AppMethodBeat.o(11724);
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
          AppMethodBeat.o(11724);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11724);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kz localkz = (kz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11724);
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
            localkz.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 2:
          localkz.vOn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 3:
          localkz.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 4:
          localkz.vOt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 5:
          localkz.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 6:
          localkz.vOr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 7:
          localkz.vOu = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        case 8:
          localkz.vOv = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(11724);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11724);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kz
 * JD-Core Version:    0.6.2
 */