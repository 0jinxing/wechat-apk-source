package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bqb extends btd
{
  public String kfM;
  public int nSb;
  public int nSc;
  public String nSd;
  public String wKE;
  public String wKF;
  public String wKG;
  public int wKH;
  public String wKJ;
  public com.tencent.mm.bt.b wKx;
  public int wKy;
  public int wKz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56953);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56953);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wKy);
      if (this.nSd != null)
        paramArrayOfObject.e(3, this.nSd);
      if (this.wKF != null)
        paramArrayOfObject.e(4, this.wKF);
      if (this.wKG != null)
        paramArrayOfObject.e(5, this.wKG);
      if (this.wKx != null)
        paramArrayOfObject.c(6, this.wKx);
      paramArrayOfObject.iz(7, this.wKz);
      paramArrayOfObject.iz(8, this.nSb);
      paramArrayOfObject.iz(9, this.wKH);
      paramArrayOfObject.iz(10, this.nSc);
      if (this.kfM != null)
        paramArrayOfObject.e(11, this.kfM);
      if (this.wKJ != null)
        paramArrayOfObject.e(12, this.wKJ);
      if (this.wKE != null)
        paramArrayOfObject.e(13, this.wKE);
      AppMethodBeat.o(56953);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1059;
    label1059: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wKy);
      i = paramInt;
      if (this.nSd != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nSd);
      paramInt = i;
      if (this.wKF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wKF);
      i = paramInt;
      if (this.wKG != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wKG);
      paramInt = i;
      if (this.wKx != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.wKx);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.wKz) + e.a.a.b.b.a.bs(8, this.nSb) + e.a.a.b.b.a.bs(9, this.wKH) + e.a.a.b.b.a.bs(10, this.nSc);
      i = paramInt;
      if (this.kfM != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.kfM);
      paramInt = i;
      if (this.wKJ != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wKJ);
      i = paramInt;
      if (this.wKE != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wKE);
      AppMethodBeat.o(56953);
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
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56953);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56953);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqb localbqb = (bqb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56953);
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
            localbqb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 2:
          localbqb.wKy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 3:
          localbqb.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 4:
          localbqb.wKF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 5:
          localbqb.wKG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 6:
          localbqb.wKx = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 7:
          localbqb.wKz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 8:
          localbqb.nSb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 9:
          localbqb.wKH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 10:
          localbqb.nSc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 11:
          localbqb.kfM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 12:
          localbqb.wKJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        case 13:
          localbqb.wKE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56953);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56953);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqb
 * JD-Core Version:    0.6.2
 */