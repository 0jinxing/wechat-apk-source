package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bon extends btd
{
  public long cSh;
  public int nSb;
  public int nSc;
  public String nSd;
  public String nSe;
  public String nSf;
  public int vzO;
  public int wKA;
  public long wKB;
  public long wKC;
  public LinkedList<ash> wKD;
  public String wKE;
  public String wKF;
  public String wKG;
  public int wKH;
  public int wKI;
  public String wKJ;
  public int wKy;
  public int wKz;

  public bon()
  {
    AppMethodBeat.i(56948);
    this.wKD = new LinkedList();
    AppMethodBeat.o(56948);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56949);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56949);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.cSh);
      paramArrayOfObject.iz(3, this.wKA);
      paramArrayOfObject.ai(4, this.wKB);
      paramArrayOfObject.iz(5, this.vzO);
      paramArrayOfObject.ai(6, this.wKC);
      paramArrayOfObject.iz(9, this.nSc);
      paramArrayOfObject.e(10, 8, this.wKD);
      if (this.nSd != null)
        paramArrayOfObject.e(11, this.nSd);
      if (this.wKE != null)
        paramArrayOfObject.e(12, this.wKE);
      if (this.wKF != null)
        paramArrayOfObject.e(13, this.wKF);
      if (this.wKG != null)
        paramArrayOfObject.e(14, this.wKG);
      paramArrayOfObject.iz(15, this.wKH);
      if (this.nSf != null)
        paramArrayOfObject.e(16, this.nSf);
      paramArrayOfObject.iz(17, this.wKI);
      if (this.nSe != null)
        paramArrayOfObject.e(18, this.nSe);
      paramArrayOfObject.iz(19, this.wKz);
      paramArrayOfObject.iz(20, this.nSb);
      paramArrayOfObject.iz(21, this.wKy);
      if (this.wKJ != null)
        paramArrayOfObject.e(22, this.wKJ);
      AppMethodBeat.o(56949);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1497;
    label1497: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.cSh) + e.a.a.b.b.a.bs(3, this.wKA) + e.a.a.b.b.a.o(4, this.wKB) + e.a.a.b.b.a.bs(5, this.vzO) + e.a.a.b.b.a.o(6, this.wKC) + e.a.a.b.b.a.bs(9, this.nSc) + e.a.a.a.c(10, 8, this.wKD);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.nSd);
      i = paramInt;
      if (this.wKE != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wKE);
      paramInt = i;
      if (this.wKF != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wKF);
      i = paramInt;
      if (this.wKG != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wKG);
      i += e.a.a.b.b.a.bs(15, this.wKH);
      paramInt = i;
      if (this.nSf != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.nSf);
      i = paramInt + e.a.a.b.b.a.bs(17, this.wKI);
      paramInt = i;
      if (this.nSe != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.nSe);
      i = paramInt + e.a.a.b.b.a.bs(19, this.wKz) + e.a.a.b.b.a.bs(20, this.nSb) + e.a.a.b.b.a.bs(21, this.wKy);
      paramInt = i;
      if (this.wKJ != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.wKJ);
      AppMethodBeat.o(56949);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wKD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56949);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56949);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bon localbon = (bon)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 7:
        case 8:
        default:
          paramInt = -1;
          AppMethodBeat.o(56949);
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
            localbon.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 2:
          localbon.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 3:
          localbon.wKA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 4:
          localbon.wKB = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 5:
          localbon.vzO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 6:
          localbon.wKC = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 9:
          localbon.nSc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ash();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ash)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbon.wKD.add(localObject1);
          }
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 11:
          localbon.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 12:
          localbon.wKE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 13:
          localbon.wKF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 14:
          localbon.wKG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 15:
          localbon.wKH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 16:
          localbon.nSf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 17:
          localbon.wKI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 18:
          localbon.nSe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 19:
          localbon.wKz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 20:
          localbon.nSb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 21:
          localbon.wKy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        case 22:
          localbon.wKJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56949);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56949);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bon
 * JD-Core Version:    0.6.2
 */