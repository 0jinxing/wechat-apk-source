package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmu extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public int guR;
  public String guS;
  public int guT;
  public int guU;
  public String guV;
  public String guW;
  public String guX;
  public String jBB;
  public String jCH;
  public String vXm;
  public String vXn;
  public ccl wBZ;
  public uy wCa;
  public int wPI;
  public String wPJ;
  public int wPK;
  public String wPL;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73747);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wPI);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      if (this.wPJ != null)
        paramArrayOfObject.e(4, this.wPJ);
      paramArrayOfObject.iz(5, this.wPK);
      if (this.wPL != null)
        paramArrayOfObject.e(6, this.wPL);
      paramArrayOfObject.iz(7, this.guN);
      if (this.guO != null)
        paramArrayOfObject.e(8, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(9, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(10, this.guQ);
      paramArrayOfObject.iz(11, this.guR);
      if (this.guS != null)
        paramArrayOfObject.e(12, this.guS);
      paramArrayOfObject.iz(13, this.guT);
      paramArrayOfObject.iz(14, this.guU);
      if (this.guV != null)
        paramArrayOfObject.e(15, this.guV);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(16, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(17, this.guW);
      if (this.guX != null)
        paramArrayOfObject.e(18, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(19, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(20, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(21, this.vXn);
      if (this.wlF != null)
        paramArrayOfObject.e(22, this.wlF);
      AppMethodBeat.o(73747);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wPI) + 0;
        i = paramInt;
        if (this.jBB != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
        paramInt = i;
        if (this.jCH != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.jCH);
        i = paramInt;
        if (this.wPJ != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.wPJ);
        i += e.a.a.b.b.a.bs(5, this.wPK);
        paramInt = i;
        if (this.wPL != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wPL);
        i = paramInt + e.a.a.b.b.a.bs(7, this.guN);
        paramInt = i;
        if (this.guO != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.guO);
        i = paramInt;
        if (this.guP != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.guP);
        paramInt = i;
        if (this.guQ != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.guQ);
        i = paramInt + e.a.a.b.b.a.bs(11, this.guR);
        paramInt = i;
        if (this.guS != null)
          paramInt = i + e.a.a.b.b.a.f(12, this.guS);
        paramInt = paramInt + e.a.a.b.b.a.bs(13, this.guT) + e.a.a.b.b.a.bs(14, this.guU);
        i = paramInt;
        if (this.guV != null)
          i = paramInt + e.a.a.b.b.a.f(15, this.guV);
        paramInt = i;
        if (this.wBZ != null)
          paramInt = i + e.a.a.a.ix(16, this.wBZ.computeSize());
        i = paramInt;
        if (this.guW != null)
          i = paramInt + e.a.a.b.b.a.f(17, this.guW);
        paramInt = i;
        if (this.guX != null)
          paramInt = i + e.a.a.b.b.a.f(18, this.guX);
        int j = paramInt;
        if (this.wCa != null)
          j = paramInt + e.a.a.a.ix(19, this.wCa.computeSize());
        i = j;
        if (this.vXm != null)
          i = j + e.a.a.b.b.a.f(20, this.vXm);
        paramInt = i;
        if (this.vXn != null)
          paramInt = i + e.a.a.b.b.a.f(21, this.vXn);
        i = paramInt;
        if (this.wlF != null)
          i = paramInt + e.a.a.b.b.a.f(22, this.wlF);
        AppMethodBeat.o(73747);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73747);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmu localbmu = (bmu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73747);
          break;
        case 1:
          localbmu.wPI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 2:
          localbmu.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 3:
          localbmu.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 4:
          localbmu.wPJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 5:
          localbmu.wPK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 6:
          localbmu.wPL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 7:
          localbmu.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 8:
          localbmu.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 9:
          localbmu.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 10:
          localbmu.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 11:
          localbmu.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 12:
          localbmu.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 13:
          localbmu.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 14:
          localbmu.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 15:
          localbmu.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmu.wBZ = ((ccl)localObject1);
          }
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 17:
          localbmu.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 18:
          localbmu.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmu.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 20:
          localbmu.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 21:
          localbmu.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        case 22:
          localbmu.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73747);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73747);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmu
 * JD-Core Version:    0.6.2
 */