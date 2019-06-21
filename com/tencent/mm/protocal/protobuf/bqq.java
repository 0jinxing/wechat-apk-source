package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bqq extends btd
{
  public int kdT;
  public String kdU;
  public String nuL;
  public String pck;
  public int status;
  public String tgu;
  public int wOi;
  public boolean wSW;
  public boolean wSX;
  public String wSY;
  public String wSZ;
  public String wTa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56955);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56955);
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
      paramArrayOfObject.aO(4, this.wSW);
      paramArrayOfObject.aO(5, this.wSX);
      paramArrayOfObject.iz(6, this.status);
      if (this.wSY != null)
        paramArrayOfObject.e(7, this.wSY);
      if (this.wSZ != null)
        paramArrayOfObject.e(8, this.wSZ);
      paramArrayOfObject.iz(9, this.wOi);
      if (this.nuL != null)
        paramArrayOfObject.e(10, this.nuL);
      if (this.pck != null)
        paramArrayOfObject.e(11, this.pck);
      if (this.wTa != null)
        paramArrayOfObject.e(12, this.wTa);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56955);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1103;
    label1103: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1) + e.a.a.b.b.a.bs(6, this.status);
      paramInt = i;
      if (this.wSY != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wSY);
      i = paramInt;
      if (this.wSZ != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wSZ);
      paramInt = i + e.a.a.b.b.a.bs(9, this.wOi);
      i = paramInt;
      if (this.nuL != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.nuL);
      paramInt = i;
      if (this.pck != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.pck);
      i = paramInt;
      if (this.wTa != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wTa);
      paramInt = i;
      if (this.tgu != null)
        paramInt = i + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56955);
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
          AppMethodBeat.o(56955);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56955);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqq localbqq = (bqq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56955);
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
            localbqq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 2:
          localbqq.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 3:
          localbqq.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 4:
          localbqq.wSW = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 5:
          localbqq.wSX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 6:
          localbqq.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 7:
          localbqq.wSY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 8:
          localbqq.wSZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 9:
          localbqq.wOi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 10:
          localbqq.nuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 11:
          localbqq.pck = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 12:
          localbqq.wTa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        case 100:
          localbqq.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56955);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56955);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqq
 * JD-Core Version:    0.6.2
 */