package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class axv extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public String guS;
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
  public String wlF;
  public String wsM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55526);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
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
      paramArrayOfObject.iz(9, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(10, this.wBU);
      if (this.wsM != null)
        paramArrayOfObject.e(11, this.wsM);
      if (this.guS != null)
        paramArrayOfObject.e(12, this.guS);
      if (this.wBV != null)
        paramArrayOfObject.e(13, this.wBV);
      if (this.wBW != null)
        paramArrayOfObject.e(14, this.wBW);
      paramArrayOfObject.iz(15, this.wBX);
      paramArrayOfObject.iz(19, this.wBY);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(20, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(21, this.guW);
      if (this.vXm != null)
        paramArrayOfObject.e(22, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(23, this.vXn);
      if (this.guX != null)
        paramArrayOfObject.e(24, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(25, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.wlF != null)
        paramArrayOfObject.e(26, this.wlF);
      AppMethodBeat.o(55526);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label1765;
    label1765: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
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
      i = paramInt + e.a.a.b.b.a.bs(7, this.guN) + e.a.a.b.b.a.bs(8, this.vEE) + e.a.a.b.b.a.bs(9, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wBU);
      i = paramInt;
      if (this.wsM != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wsM);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.guS);
      i = paramInt;
      if (this.wBV != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wBV);
      paramInt = i;
      if (this.wBW != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.wBW);
      i = paramInt + e.a.a.b.b.a.bs(15, this.wBX) + e.a.a.b.b.a.bs(19, this.wBY);
      paramInt = i;
      if (this.wBZ != null)
        paramInt = i + e.a.a.a.ix(20, this.wBZ.computeSize());
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.guW);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.vXn);
      paramInt = i;
      if (this.guX != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.guX);
      i = paramInt;
      if (this.wCa != null)
        i = paramInt + e.a.a.a.ix(25, this.wCa.computeSize());
      paramInt = i;
      if (this.wlF != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.wlF);
      AppMethodBeat.o(55526);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55526);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        axv localaxv = (axv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 16:
        case 17:
        case 18:
        default:
          paramInt = -1;
          AppMethodBeat.o(55526);
          break;
        case 1:
          localaxv.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 2:
          localaxv.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 3:
          localaxv.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 4:
          localaxv.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 5:
          localaxv.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 6:
          localaxv.wBS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 7:
          localaxv.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 8:
          localaxv.vEE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 9:
          localaxv.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 10:
          localaxv.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 11:
          localaxv.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 12:
          localaxv.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 13:
          localaxv.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 14:
          localaxv.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 15:
          localaxv.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 19:
          localaxv.wBY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 20:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxv.wBZ = paramArrayOfObject;
          }
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 21:
          localaxv.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 22:
          localaxv.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 23:
          localaxv.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 24:
          localaxv.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 25:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxv.wCa = paramArrayOfObject;
          }
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        case 26:
          localaxv.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55526);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55526);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axv
 * JD-Core Version:    0.6.2
 */