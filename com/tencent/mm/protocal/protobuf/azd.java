package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class azd extends com.tencent.mm.bt.a
{
  public String guM;
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
  public String vHl;
  public String vXm;
  public String vXn;
  public ccl wBZ;
  public String wCW;
  public zs wCX;
  public uy wCa;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73739);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      if (this.wCW != null)
        paramArrayOfObject.e(2, this.wCW);
      if (this.guM != null)
        paramArrayOfObject.e(3, this.guM);
      paramArrayOfObject.iz(4, this.guN);
      if (this.guO != null)
        paramArrayOfObject.e(5, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(6, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(7, this.guQ);
      paramArrayOfObject.iz(8, this.guR);
      if (this.guS != null)
        paramArrayOfObject.e(9, this.guS);
      if (this.wCX != null)
      {
        paramArrayOfObject.iy(10, this.wCX.computeSize());
        this.wCX.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.guT);
      paramArrayOfObject.iz(12, this.guU);
      if (this.guV != null)
        paramArrayOfObject.e(13, this.guV);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(14, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(15, this.guW);
      if (this.guX != null)
        paramArrayOfObject.e(16, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(17, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(20, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(21, this.vXn);
      if (this.wlF != null)
        paramArrayOfObject.e(22, this.wlF);
      AppMethodBeat.o(73739);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label1689;
    label1689: for (i = e.a.a.b.b.a.f(1, this.vHl) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wCW != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wCW);
      i = paramInt;
      if (this.guM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.guM);
      i += e.a.a.b.b.a.bs(4, this.guN);
      paramInt = i;
      if (this.guO != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.guO);
      i = paramInt;
      if (this.guP != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.guP);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.guQ);
      i = paramInt + e.a.a.b.b.a.bs(8, this.guR);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.guS);
      i = paramInt;
      if (this.wCX != null)
        i = paramInt + e.a.a.a.ix(10, this.wCX.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(11, this.guT) + e.a.a.b.b.a.bs(12, this.guU);
      i = paramInt;
      if (this.guV != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.guV);
      paramInt = i;
      if (this.wBZ != null)
        paramInt = i + e.a.a.a.ix(14, this.wBZ.computeSize());
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.guW);
      paramInt = i;
      if (this.guX != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.guX);
      int j = paramInt;
      if (this.wCa != null)
        j = paramInt + e.a.a.a.ix(17, this.wCa.computeSize());
      i = j;
      if (this.vXm != null)
        i = j + e.a.a.b.b.a.f(20, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.vXn);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.wlF);
      AppMethodBeat.o(73739);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73739);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        azd localazd = (azd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 18:
        case 19:
        default:
          paramInt = -1;
          AppMethodBeat.o(73739);
          break;
        case 1:
          localazd.vHl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 2:
          localazd.wCW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 3:
          localazd.guM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 4:
          localazd.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 5:
          localazd.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 6:
          localazd.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 7:
          localazd.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 8:
          localazd.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 9:
          localazd.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new zs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazd.wCX = paramArrayOfObject;
          }
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 11:
          localazd.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 12:
          localazd.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 13:
          localazd.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazd.wBZ = paramArrayOfObject;
          }
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 15:
          localazd.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 16:
          localazd.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazd.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 20:
          localazd.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 21:
          localazd.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        case 22:
          localazd.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73739);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73739);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azd
 * JD-Core Version:    0.6.2
 */