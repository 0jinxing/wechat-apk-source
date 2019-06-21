package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bvo extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public int guR;
  public String guS;
  public String guW;
  public String vXm;
  public String vXn;
  public int wBT;
  public String wBU;
  public String wBV;
  public String wBW;
  public int wBX;
  public uz wWC;
  public bts wcB;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124359);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(124359);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(124359);
        throw paramArrayOfObject;
      }
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(1, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      if (this.wyX != null)
      {
        paramArrayOfObject.iy(2, this.wyX.computeSize());
        this.wyX.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.guN);
      if (this.guO != null)
        paramArrayOfObject.e(4, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(5, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(6, this.guQ);
      paramArrayOfObject.iz(7, this.guR);
      paramArrayOfObject.iz(8, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(9, this.wBU);
      if (this.wBV != null)
        paramArrayOfObject.e(10, this.wBV);
      if (this.guS != null)
        paramArrayOfObject.e(11, this.guS);
      if (this.wBW != null)
        paramArrayOfObject.e(12, this.wBW);
      paramArrayOfObject.iz(13, this.wBX);
      if (this.guW != null)
        paramArrayOfObject.e(14, this.guW);
      if (this.wWC != null)
      {
        paramArrayOfObject.iy(15, this.wWC.computeSize());
        this.wWC.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(16, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(17, this.vXn);
      AppMethodBeat.o(124359);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label1577;
    label1577: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wyX != null)
        i = paramInt + e.a.a.a.ix(2, this.wyX.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.guN);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.guO);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.guP);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.guQ);
      i = i + e.a.a.b.b.a.bs(7, this.guR) + e.a.a.b.b.a.bs(8, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wBU);
      i = paramInt;
      if (this.wBV != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wBV);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.guS);
      i = paramInt;
      if (this.wBW != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wBW);
      paramInt = i + e.a.a.b.b.a.bs(13, this.wBX);
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.guW);
      paramInt = i;
      if (this.wWC != null)
        paramInt = i + e.a.a.a.ix(15, this.wWC.computeSize());
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.vXn);
      AppMethodBeat.o(124359);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(124359);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(124359);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124359);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvo localbvo = (bvo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124359);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvo.wcB = paramArrayOfObject;
          }
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvo.wyX = ((bts)localObject1);
          }
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 3:
          localbvo.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 4:
          localbvo.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 5:
          localbvo.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 6:
          localbvo.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 7:
          localbvo.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 8:
          localbvo.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 9:
          localbvo.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 10:
          localbvo.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 11:
          localbvo.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 12:
          localbvo.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 13:
          localbvo.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 14:
          localbvo.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvo.wWC = ((uz)localObject1);
          }
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 16:
          localbvo.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        case 17:
          localbvo.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124359);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124359);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvo
 * JD-Core Version:    0.6.2
 */