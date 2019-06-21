package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class anh extends btd
{
  public int kCl;
  public String kCm;
  public boolean ttQ;
  public String wrM;
  public String wrN;
  public String wrO;
  public String wrP;
  public String wrQ;
  public boolean wrR;
  public String wrS;
  public long wrT;
  public boolean wrU;
  public boolean wrV;
  public boolean wrW;
  public String wrX;
  public String wrY;
  public String wrZ;
  public String wsa;
  public boolean wsb;
  public LinkedList<String> wsc;
  public awr wsd;
  public boolean wse;

  public anh()
  {
    AppMethodBeat.i(56834);
    this.wsc = new LinkedList();
    AppMethodBeat.o(56834);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56835);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56835);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      if (this.wrM != null)
        paramArrayOfObject.e(4, this.wrM);
      if (this.wrN != null)
        paramArrayOfObject.e(5, this.wrN);
      if (this.wrO != null)
        paramArrayOfObject.e(6, this.wrO);
      if (this.wrP != null)
        paramArrayOfObject.e(7, this.wrP);
      if (this.wrQ != null)
        paramArrayOfObject.e(8, this.wrQ);
      paramArrayOfObject.aO(9, this.wrR);
      if (this.wrS != null)
        paramArrayOfObject.e(10, this.wrS);
      paramArrayOfObject.ai(11, this.wrT);
      paramArrayOfObject.aO(12, this.wrU);
      paramArrayOfObject.aO(13, this.wrV);
      paramArrayOfObject.aO(14, this.wrW);
      if (this.wrX != null)
        paramArrayOfObject.e(15, this.wrX);
      if (this.wrY != null)
        paramArrayOfObject.e(16, this.wrY);
      if (this.wrZ != null)
        paramArrayOfObject.e(17, this.wrZ);
      if (this.wsa != null)
        paramArrayOfObject.e(18, this.wsa);
      paramArrayOfObject.aO(19, this.wsb);
      paramArrayOfObject.e(20, 1, this.wsc);
      paramArrayOfObject.aO(21, this.ttQ);
      if (this.wsd != null)
      {
        paramArrayOfObject.iy(22, this.wsd.computeSize());
        this.wsd.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(23, this.wse);
      AppMethodBeat.o(56835);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1726;
    label1726: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.wrM != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wrM);
      int j = i;
      if (this.wrN != null)
        j = i + e.a.a.b.b.a.f(5, this.wrN);
      paramInt = j;
      if (this.wrO != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.wrO);
      i = paramInt;
      if (this.wrP != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wrP);
      paramInt = i;
      if (this.wrQ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wrQ);
      i = paramInt + (e.a.a.b.b.a.fv(9) + 1);
      paramInt = i;
      if (this.wrS != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wrS);
      i = paramInt + e.a.a.b.b.a.o(11, this.wrT) + (e.a.a.b.b.a.fv(12) + 1) + (e.a.a.b.b.a.fv(13) + 1) + (e.a.a.b.b.a.fv(14) + 1);
      paramInt = i;
      if (this.wrX != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wrX);
      i = paramInt;
      if (this.wrY != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.wrY);
      paramInt = i;
      if (this.wrZ != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wrZ);
      i = paramInt;
      if (this.wsa != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.wsa);
      i = i + (e.a.a.b.b.a.fv(19) + 1) + e.a.a.a.c(20, 1, this.wsc) + (e.a.a.b.b.a.fv(21) + 1);
      paramInt = i;
      if (this.wsd != null)
        paramInt = i + e.a.a.a.ix(22, this.wsd.computeSize());
      paramInt += e.a.a.b.b.a.fv(23) + 1;
      AppMethodBeat.o(56835);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wsc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56835);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56835);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        anh localanh = (anh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56835);
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
            localanh.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 2:
          localanh.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 3:
          localanh.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 4:
          localanh.wrM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 5:
          localanh.wrN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 6:
          localanh.wrO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 7:
          localanh.wrP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 8:
          localanh.wrQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 9:
          localanh.wrR = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 10:
          localanh.wrS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 11:
          localanh.wrT = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 12:
          localanh.wrU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 13:
          localanh.wrV = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 14:
          localanh.wrW = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 15:
          localanh.wrX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 16:
          localanh.wrY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 17:
          localanh.wrZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 18:
          localanh.wsa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 19:
          localanh.wsb = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 20:
          localanh.wsc.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 21:
          localanh.ttQ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new awr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localanh.wsd = paramArrayOfObject;
          }
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        case 23:
          localanh.wse = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56835);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56835);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.anh
 * JD-Core Version:    0.6.2
 */