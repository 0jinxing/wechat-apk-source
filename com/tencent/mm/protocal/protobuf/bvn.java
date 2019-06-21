package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bvn extends com.tencent.mm.bt.a
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
  public uy wCa;
  public bts wcB;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14749);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(14749);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(14749);
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
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(15, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(16, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(17, this.vXn);
      AppMethodBeat.o(14749);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label1604;
    label1604: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
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
      paramInt = i + e.a.a.b.b.a.bs(7, this.guR) + e.a.a.b.b.a.bs(8, this.wBT);
      i = paramInt;
      if (this.wBU != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wBU);
      paramInt = i;
      if (this.wBV != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wBV);
      i = paramInt;
      if (this.guS != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.guS);
      paramInt = i;
      if (this.wBW != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wBW);
      paramInt += e.a.a.b.b.a.bs(13, this.wBX);
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.guW);
      paramInt = i;
      if (this.wCa != null)
        paramInt = i + e.a.a.a.ix(15, this.wCa.computeSize());
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.vXn);
      AppMethodBeat.o(14749);
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
          AppMethodBeat.o(14749);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(14749);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14749);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvn localbvn = (bvn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14749);
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
            localbvn.wcB = paramArrayOfObject;
          }
          AppMethodBeat.o(14749);
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
            localbvn.wyX = ((bts)localObject1);
          }
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 3:
          localbvn.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 4:
          localbvn.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 5:
          localbvn.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 6:
          localbvn.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 7:
          localbvn.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 8:
          localbvn.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 9:
          localbvn.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 10:
          localbvn.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 11:
          localbvn.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 12:
          localbvn.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 13:
          localbvn.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 14:
          localbvn.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvn.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 16:
          localbvn.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        case 17:
          localbvn.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14749);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14749);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvn
 * JD-Core Version:    0.6.2
 */