package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bym extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public String guW;
  public String guX;
  public String jBB;
  public String jCH;
  public int vEE;
  public String vXm;
  public String vXn;
  public String wBS;
  public int wBT;
  public String wBU;
  public String wBV;
  public String wBW;
  public int wBX;
  public int wBY;
  public ccl wBZ;
  public uy wCa;
  public int wXI;
  public SKBuiltinBuffer_t wXJ;
  public int wXK;
  public String wlF;
  public String wsM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28642);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wXJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuffer");
        AppMethodBeat.o(28642);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.guO != null)
        paramArrayOfObject.e(3, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(4, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(5, this.guQ);
      if (this.wBS != null)
        paramArrayOfObject.e(6, this.wBS);
      paramArrayOfObject.iz(7, this.guN);
      paramArrayOfObject.iz(8, this.vEE);
      paramArrayOfObject.iz(9, this.wXI);
      if (this.wXJ != null)
      {
        paramArrayOfObject.iy(10, this.wXJ.computeSize());
        this.wXJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.wXK);
      if (this.wBV != null)
        paramArrayOfObject.e(12, this.wBV);
      if (this.wBW != null)
        paramArrayOfObject.e(13, this.wBW);
      paramArrayOfObject.iz(14, this.wBX);
      paramArrayOfObject.iz(15, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(16, this.wBU);
      if (this.wsM != null)
        paramArrayOfObject.e(17, this.wsM);
      paramArrayOfObject.iz(21, this.wBY);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(22, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(23, this.guW);
      if (this.vXm != null)
        paramArrayOfObject.e(24, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(25, this.vXn);
      if (this.guX != null)
        paramArrayOfObject.e(26, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(27, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.wlF != null)
        paramArrayOfObject.e(28, this.wlF);
      AppMethodBeat.o(28642);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label2041;
    label2041: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.guO);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.guP);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.guQ);
      paramInt = i;
      if (this.wBS != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wBS);
      i = paramInt + e.a.a.b.b.a.bs(7, this.guN) + e.a.a.b.b.a.bs(8, this.vEE) + e.a.a.b.b.a.bs(9, this.wXI);
      paramInt = i;
      if (this.wXJ != null)
        paramInt = i + e.a.a.a.ix(10, this.wXJ.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(11, this.wXK);
      paramInt = i;
      if (this.wBV != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wBV);
      i = paramInt;
      if (this.wBW != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wBW);
      i = i + e.a.a.b.b.a.bs(14, this.wBX) + e.a.a.b.b.a.bs(15, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wBU);
      i = paramInt;
      if (this.wsM != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.wsM);
      i += e.a.a.b.b.a.bs(21, this.wBY);
      paramInt = i;
      if (this.wBZ != null)
        paramInt = i + e.a.a.a.ix(22, this.wBZ.computeSize());
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.guW);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(25, this.vXn);
      paramInt = i;
      if (this.guX != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.guX);
      i = paramInt;
      if (this.wCa != null)
        i = paramInt + e.a.a.a.ix(27, this.wCa.computeSize());
      paramInt = i;
      if (this.wlF != null)
        paramInt = i + e.a.a.b.b.a.f(28, this.wlF);
      AppMethodBeat.o(28642);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wXJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuffer");
          AppMethodBeat.o(28642);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28642);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bym localbym = (bym)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 18:
        case 19:
        case 20:
        default:
          paramInt = -1;
          AppMethodBeat.o(28642);
          break;
        case 1:
          localbym.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 2:
          localbym.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 3:
          localbym.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 4:
          localbym.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 5:
          localbym.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 6:
          localbym.wBS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 7:
          localbym.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 8:
          localbym.vEE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 9:
          localbym.wXI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbym.wXJ = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 11:
          localbym.wXK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 12:
          localbym.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 13:
          localbym.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 14:
          localbym.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 15:
          localbym.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 16:
          localbym.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 17:
          localbym.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 21:
          localbym.wBY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 22:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbym.wBZ = ((ccl)localObject1);
          }
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 23:
          localbym.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 24:
          localbym.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 25:
          localbym.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 26:
          localbym.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 27:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbym.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        case 28:
          localbym.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28642);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28642);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bym
 * JD-Core Version:    0.6.2
 */