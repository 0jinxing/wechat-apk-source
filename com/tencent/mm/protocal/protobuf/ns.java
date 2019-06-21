package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ns extends com.tencent.mm.bt.a
{
  public String vSR;
  public String vSS;
  public String vST;
  public String vSU;
  public LinkedList<nr> vSV;
  public int vSW;
  public String vSX;
  public ny vSY;
  public String vSZ;
  public LinkedList<nq> vTa;
  public String vTb;
  public String vTc;
  public ny vTd;
  public nr vTe;
  public int vTf;
  public int vTg;
  public int vTh;
  public long vTi;

  public ns()
  {
    AppMethodBeat.i(89025);
    this.vSV = new LinkedList();
    this.vTa = new LinkedList();
    AppMethodBeat.o(89025);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89026);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vSR != null)
        paramArrayOfObject.e(1, this.vSR);
      if (this.vSS != null)
        paramArrayOfObject.e(2, this.vSS);
      if (this.vST != null)
        paramArrayOfObject.e(3, this.vST);
      if (this.vSU != null)
        paramArrayOfObject.e(4, this.vSU);
      paramArrayOfObject.e(5, 8, this.vSV);
      paramArrayOfObject.iz(6, this.vSW);
      if (this.vSX != null)
        paramArrayOfObject.e(7, this.vSX);
      if (this.vSY != null)
      {
        paramArrayOfObject.iy(8, this.vSY.computeSize());
        this.vSY.writeFields(paramArrayOfObject);
      }
      if (this.vSZ != null)
        paramArrayOfObject.e(9, this.vSZ);
      paramArrayOfObject.e(10, 8, this.vTa);
      if (this.vTb != null)
        paramArrayOfObject.e(11, this.vTb);
      if (this.vTc != null)
        paramArrayOfObject.e(12, this.vTc);
      if (this.vTd != null)
      {
        paramArrayOfObject.iy(13, this.vTd.computeSize());
        this.vTd.writeFields(paramArrayOfObject);
      }
      if (this.vTe != null)
      {
        paramArrayOfObject.iy(14, this.vTe.computeSize());
        this.vTe.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(15, this.vTf);
      paramArrayOfObject.iz(16, this.vTg);
      paramArrayOfObject.iz(17, this.vTh);
      paramArrayOfObject.ai(18, this.vTi);
      AppMethodBeat.o(89026);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vSR == null)
        break label1683;
    label1683: for (paramInt = e.a.a.b.b.a.f(1, this.vSR) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vSS != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vSS);
      paramInt = i;
      if (this.vST != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vST);
      i = paramInt;
      if (this.vSU != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vSU);
      i = i + e.a.a.a.c(5, 8, this.vSV) + e.a.a.b.b.a.bs(6, this.vSW);
      paramInt = i;
      if (this.vSX != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vSX);
      i = paramInt;
      if (this.vSY != null)
        i = paramInt + e.a.a.a.ix(8, this.vSY.computeSize());
      paramInt = i;
      if (this.vSZ != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vSZ);
      i = paramInt + e.a.a.a.c(10, 8, this.vTa);
      paramInt = i;
      if (this.vTb != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vTb);
      i = paramInt;
      if (this.vTc != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.vTc);
      paramInt = i;
      if (this.vTd != null)
        paramInt = i + e.a.a.a.ix(13, this.vTd.computeSize());
      i = paramInt;
      if (this.vTe != null)
        i = paramInt + e.a.a.a.ix(14, this.vTe.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(15, this.vTf) + e.a.a.b.b.a.bs(16, this.vTg) + e.a.a.b.b.a.bs(17, this.vTh) + e.a.a.b.b.a.o(18, this.vTi);
      AppMethodBeat.o(89026);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vSV.clear();
        this.vTa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89026);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ns localns = (ns)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89026);
          break;
        case 1:
          localns.vSR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 2:
          localns.vSS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 3:
          localns.vST = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 4:
          localns.vSU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((nr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localns.vSV.add(localObject1);
          }
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 6:
          localns.vSW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 7:
          localns.vSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localns.vSY = paramArrayOfObject;
          }
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 9:
          localns.vSZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localns.vTa.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 11:
          localns.vTb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 12:
          localns.vTc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localns.vTd = paramArrayOfObject;
          }
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localns.vTe = paramArrayOfObject;
          }
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 15:
          localns.vTf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 16:
          localns.vTg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 17:
          localns.vTh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        case 18:
          localns.vTi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(89026);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89026);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ns
 * JD-Core Version:    0.6.2
 */