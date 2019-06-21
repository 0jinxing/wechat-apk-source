package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class no extends com.tencent.mm.bt.a
{
  public String code;
  public int status;
  public int vRU;
  public int vRV;
  public LinkedList<op> vRW;
  public LinkedList<op> vRX;
  public LinkedList<op> vRY;
  public LinkedList<String> vRZ;
  public int vSa;
  public int vSb;
  public LinkedList<tm> vSc;
  public long vSd;
  public int vSe;
  public String vSf;
  public tm vSg;
  public LinkedList<ax> vSh;
  public tm vSi;
  public tm vSj;
  public tm vSk;
  public wz vSl;
  public String vSm;
  public tm vSn;
  public String vSo;
  public tm vSp;
  public boolean vSq;
  public boolean vSr;

  public no()
  {
    AppMethodBeat.i(89019);
    this.vRW = new LinkedList();
    this.vRX = new LinkedList();
    this.vRY = new LinkedList();
    this.vRZ = new LinkedList();
    this.vSc = new LinkedList();
    this.vSh = new LinkedList();
    AppMethodBeat.o(89019);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89020);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.status);
      paramArrayOfObject.iz(2, this.vRU);
      paramArrayOfObject.iz(3, this.vRV);
      paramArrayOfObject.e(4, 8, this.vRW);
      paramArrayOfObject.e(5, 8, this.vRX);
      paramArrayOfObject.e(6, 8, this.vRY);
      paramArrayOfObject.e(7, 1, this.vRZ);
      paramArrayOfObject.iz(8, this.vSa);
      if (this.code != null)
        paramArrayOfObject.e(9, this.code);
      paramArrayOfObject.iz(10, this.vSb);
      paramArrayOfObject.e(11, 8, this.vSc);
      paramArrayOfObject.ai(12, this.vSd);
      paramArrayOfObject.iz(13, this.vSe);
      if (this.vSf != null)
        paramArrayOfObject.e(14, this.vSf);
      if (this.vSg != null)
      {
        paramArrayOfObject.iy(15, this.vSg.computeSize());
        this.vSg.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(16, 8, this.vSh);
      if (this.vSi != null)
      {
        paramArrayOfObject.iy(17, this.vSi.computeSize());
        this.vSi.writeFields(paramArrayOfObject);
      }
      if (this.vSj != null)
      {
        paramArrayOfObject.iy(18, this.vSj.computeSize());
        this.vSj.writeFields(paramArrayOfObject);
      }
      if (this.vSk != null)
      {
        paramArrayOfObject.iy(19, this.vSk.computeSize());
        this.vSk.writeFields(paramArrayOfObject);
      }
      if (this.vSl != null)
      {
        paramArrayOfObject.iy(20, this.vSl.computeSize());
        this.vSl.writeFields(paramArrayOfObject);
      }
      if (this.vSm != null)
        paramArrayOfObject.e(21, this.vSm);
      if (this.vSn != null)
      {
        paramArrayOfObject.iy(22, this.vSn.computeSize());
        this.vSn.writeFields(paramArrayOfObject);
      }
      if (this.vSo != null)
        paramArrayOfObject.e(23, this.vSo);
      if (this.vSp != null)
      {
        paramArrayOfObject.iy(24, this.vSp.computeSize());
        this.vSp.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(25, this.vSq);
      paramArrayOfObject.aO(26, this.vSr);
      AppMethodBeat.o(89020);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.status) + 0 + e.a.a.b.b.a.bs(2, this.vRU) + e.a.a.b.b.a.bs(3, this.vRV) + e.a.a.a.c(4, 8, this.vRW) + e.a.a.a.c(5, 8, this.vRX) + e.a.a.a.c(6, 8, this.vRY) + e.a.a.a.c(7, 1, this.vRZ) + e.a.a.b.b.a.bs(8, this.vSa);
        paramInt = i;
        if (this.code != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.code);
        i = paramInt + e.a.a.b.b.a.bs(10, this.vSb) + e.a.a.a.c(11, 8, this.vSc) + e.a.a.b.b.a.o(12, this.vSd) + e.a.a.b.b.a.bs(13, this.vSe);
        paramInt = i;
        if (this.vSf != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.vSf);
        i = paramInt;
        if (this.vSg != null)
          i = paramInt + e.a.a.a.ix(15, this.vSg.computeSize());
        i += e.a.a.a.c(16, 8, this.vSh);
        paramInt = i;
        if (this.vSi != null)
          paramInt = i + e.a.a.a.ix(17, this.vSi.computeSize());
        i = paramInt;
        if (this.vSj != null)
          i = paramInt + e.a.a.a.ix(18, this.vSj.computeSize());
        paramInt = i;
        if (this.vSk != null)
          paramInt = i + e.a.a.a.ix(19, this.vSk.computeSize());
        i = paramInt;
        if (this.vSl != null)
          i = paramInt + e.a.a.a.ix(20, this.vSl.computeSize());
        int j = i;
        if (this.vSm != null)
          j = i + e.a.a.b.b.a.f(21, this.vSm);
        paramInt = j;
        if (this.vSn != null)
          paramInt = j + e.a.a.a.ix(22, this.vSn.computeSize());
        i = paramInt;
        if (this.vSo != null)
          i = paramInt + e.a.a.b.b.a.f(23, this.vSo);
        paramInt = i;
        if (this.vSp != null)
          paramInt = i + e.a.a.a.ix(24, this.vSp.computeSize());
        paramInt = paramInt + (e.a.a.b.b.a.fv(25) + 1) + (e.a.a.b.b.a.fv(26) + 1);
        AppMethodBeat.o(89020);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vRW.clear();
        this.vRX.clear();
        this.vRY.clear();
        this.vRZ.clear();
        this.vSc.clear();
        this.vSh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89020);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        no localno = (no)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89020);
          break;
        case 1:
          localno.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 2:
          localno.vRU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 3:
          localno.vRV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new op();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((op)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vRW.add(localObject1);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new op();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((op)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vRX.add(localObject1);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new op();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((op)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vRY.add(localObject1);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 7:
          localno.vRZ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 8:
          localno.vSa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 9:
          localno.code = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 10:
          localno.vSb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSc.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 12:
          localno.vSd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 13:
          localno.vSe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 14:
          localno.vSf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSg = paramArrayOfObject;
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ax();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSi = paramArrayOfObject;
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 18:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSj = ((tm)localObject1);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 19:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSk = paramArrayOfObject;
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 20:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new wz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSl = paramArrayOfObject;
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 21:
          localno.vSm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSn = paramArrayOfObject;
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 23:
          localno.vSo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 24:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localno.vSp = ((tm)localObject1);
          }
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 25:
          localno.vSq = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        case 26:
          localno.vSr = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89020);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89020);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.no
 * JD-Core Version:    0.6.2
 */