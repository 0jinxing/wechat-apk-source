package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cme extends com.tencent.mm.bt.a
{
  public String duq;
  public String guX;
  public int vCl;
  public ayj vEU;
  public btv vLP;
  public String vLf;
  public String vXm;
  public String vXn;
  public ccl wBZ;
  public String wGm;
  public String wGn;
  public int wPr;
  public int wlv;
  public String xjQ;
  public String xjR;
  public int xjS;
  public int xjT;
  public int xjU;
  public String xjV;
  public int xjW;
  public bts xjX;
  public int xjY;
  public String xjZ;
  public String xka;
  public String xkb;
  public String xkc;
  public String xkd;
  public bim xke;
  public String xkf;
  public int xkg;
  public long xkh;
  public String xki;
  public cfc xkj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123521);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wBZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SnsUserInfo");
        AppMethodBeat.o(123521);
        throw paramArrayOfObject;
      }
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(1, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guX != null)
        paramArrayOfObject.e(2, this.guX);
      if (this.xjQ != null)
        paramArrayOfObject.e(3, this.xjQ);
      if (this.xjR != null)
        paramArrayOfObject.e(4, this.xjR);
      paramArrayOfObject.iz(5, this.xjS);
      paramArrayOfObject.iz(6, this.xjT);
      paramArrayOfObject.iz(7, this.xjU);
      if (this.xjV != null)
        paramArrayOfObject.e(8, this.xjV);
      if (this.vXm != null)
        paramArrayOfObject.e(9, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(10, this.vXn);
      paramArrayOfObject.iz(11, this.xjW);
      if (this.xjX != null)
      {
        paramArrayOfObject.iy(12, this.xjX.computeSize());
        this.xjX.writeFields(paramArrayOfObject);
      }
      if (this.vLP != null)
      {
        paramArrayOfObject.iy(13, this.vLP.computeSize());
        this.vLP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(14, this.vCl);
      paramArrayOfObject.iz(15, this.xjY);
      if (this.vLf != null)
        paramArrayOfObject.e(16, this.vLf);
      if (this.wGm != null)
        paramArrayOfObject.e(17, this.wGm);
      if (this.wGn != null)
        paramArrayOfObject.e(18, this.wGn);
      if (this.xjZ != null)
        paramArrayOfObject.e(19, this.xjZ);
      if (this.xka != null)
        paramArrayOfObject.e(20, this.xka);
      if (this.xkb != null)
        paramArrayOfObject.e(21, this.xkb);
      if (this.xkc != null)
        paramArrayOfObject.e(22, this.xkc);
      if (this.vEU != null)
      {
        paramArrayOfObject.iy(23, this.vEU.computeSize());
        this.vEU.writeFields(paramArrayOfObject);
      }
      if (this.xkd != null)
        paramArrayOfObject.e(24, this.xkd);
      if (this.xke != null)
      {
        paramArrayOfObject.iy(25, this.xke.computeSize());
        this.xke.writeFields(paramArrayOfObject);
      }
      if (this.xkf != null)
        paramArrayOfObject.e(26, this.xkf);
      paramArrayOfObject.iz(27, this.xkg);
      if (this.duq != null)
        paramArrayOfObject.e(28, this.duq);
      paramArrayOfObject.iz(29, this.wlv);
      paramArrayOfObject.ai(30, this.xkh);
      if (this.xki != null)
        paramArrayOfObject.e(31, this.xki);
      paramArrayOfObject.iz(32, this.wPr);
      if (this.xkj != null)
      {
        paramArrayOfObject.iy(33, this.xkj.computeSize());
        this.xkj.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(123521);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wBZ == null)
        break label2748;
    label2748: for (paramInt = e.a.a.a.ix(1, this.wBZ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.guX != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.guX);
      paramInt = i;
      if (this.xjQ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xjQ);
      i = paramInt;
      if (this.xjR != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xjR);
      paramInt = i + e.a.a.b.b.a.bs(5, this.xjS) + e.a.a.b.b.a.bs(6, this.xjT) + e.a.a.b.b.a.bs(7, this.xjU);
      i = paramInt;
      if (this.xjV != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.xjV);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vXn);
      i += e.a.a.b.b.a.bs(11, this.xjW);
      paramInt = i;
      if (this.xjX != null)
        paramInt = i + e.a.a.a.ix(12, this.xjX.computeSize());
      i = paramInt;
      if (this.vLP != null)
        i = paramInt + e.a.a.a.ix(13, this.vLP.computeSize());
      i = i + e.a.a.b.b.a.bs(14, this.vCl) + e.a.a.b.b.a.bs(15, this.xjY);
      paramInt = i;
      if (this.vLf != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vLf);
      i = paramInt;
      if (this.wGm != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.wGm);
      paramInt = i;
      if (this.wGn != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wGn);
      i = paramInt;
      if (this.xjZ != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.xjZ);
      paramInt = i;
      if (this.xka != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.xka);
      i = paramInt;
      if (this.xkb != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.xkb);
      paramInt = i;
      if (this.xkc != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.xkc);
      i = paramInt;
      if (this.vEU != null)
        i = paramInt + e.a.a.a.ix(23, this.vEU.computeSize());
      paramInt = i;
      if (this.xkd != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.xkd);
      i = paramInt;
      if (this.xke != null)
        i = paramInt + e.a.a.a.ix(25, this.xke.computeSize());
      paramInt = i;
      if (this.xkf != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.xkf);
      i = paramInt + e.a.a.b.b.a.bs(27, this.xkg);
      paramInt = i;
      if (this.duq != null)
        paramInt = i + e.a.a.b.b.a.f(28, this.duq);
      i = paramInt + e.a.a.b.b.a.bs(29, this.wlv) + e.a.a.b.b.a.o(30, this.xkh);
      paramInt = i;
      if (this.xki != null)
        paramInt = i + e.a.a.b.b.a.f(31, this.xki);
      i = paramInt + e.a.a.b.b.a.bs(32, this.wPr);
      paramInt = i;
      if (this.xkj != null)
        paramInt = i + e.a.a.a.ix(33, this.xkj.computeSize());
      AppMethodBeat.o(123521);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wBZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SnsUserInfo");
          AppMethodBeat.o(123521);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(123521);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cme localcme = (cme)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123521);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.wBZ = paramArrayOfObject;
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 2:
          localcme.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 3:
          localcme.xjQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 4:
          localcme.xjR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 5:
          localcme.xjS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 6:
          localcme.xjT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 7:
          localcme.xjU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 8:
          localcme.xjV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 9:
          localcme.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 10:
          localcme.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 11:
          localcme.xjW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.xjX = ((bts)localObject1);
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.vLP = paramArrayOfObject;
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 14:
          localcme.vCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 15:
          localcme.xjY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 16:
          localcme.vLf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 17:
          localcme.wGm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 18:
          localcme.wGn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 19:
          localcme.xjZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 20:
          localcme.xka = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 21:
          localcme.xkb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 22:
          localcme.xkc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ayj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.vEU = paramArrayOfObject;
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 24:
          localcme.xkd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 25:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bim();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.xke = paramArrayOfObject;
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 26:
          localcme.xkf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 27:
          localcme.xkg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 28:
          localcme.duq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 29:
          localcme.wlv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 30:
          localcme.xkh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 31:
          localcme.xki = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 32:
          localcme.wPr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        case 33:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cfc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcme.xkj = paramArrayOfObject;
          }
          AppMethodBeat.o(123521);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123521);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cme
 * JD-Core Version:    0.6.2
 */