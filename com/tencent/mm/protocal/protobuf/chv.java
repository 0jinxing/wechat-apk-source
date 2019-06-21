package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class chv extends com.tencent.mm.bt.a
{
  public String ctj;
  public boolean eif;
  public String hlm;
  public int offset;
  public int scene;
  public LinkedList<tn> tZG;
  public String xgC;
  public String xgD;
  public String xgE;
  public String xgF;
  public long xgG;
  public chw xgH;
  public bzs xgI;
  public boolean xgJ;
  public LinkedList<chw> xgK;
  public int xgL;
  public int xgM;
  public String xgN;
  public int xgO;
  public boolean xgP;
  public String xgj;

  public chv()
  {
    AppMethodBeat.i(55708);
    this.tZG = new LinkedList();
    this.xgK = new LinkedList();
    AppMethodBeat.o(55708);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55709);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xgC != null)
        paramArrayOfObject.e(1, this.xgC);
      if (this.xgD != null)
        paramArrayOfObject.e(2, this.xgD);
      if (this.xgE != null)
        paramArrayOfObject.e(3, this.xgE);
      if (this.xgF != null)
        paramArrayOfObject.e(4, this.xgF);
      paramArrayOfObject.ai(5, this.xgG);
      paramArrayOfObject.iz(6, this.scene);
      if (this.hlm != null)
        paramArrayOfObject.e(7, this.hlm);
      if (this.ctj != null)
        paramArrayOfObject.e(8, this.ctj);
      if (this.xgH != null)
      {
        paramArrayOfObject.iy(9, this.xgH.computeSize());
        this.xgH.writeFields(paramArrayOfObject);
      }
      if (this.xgI != null)
      {
        paramArrayOfObject.iy(10, this.xgI.computeSize());
        this.xgI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(11, 8, this.tZG);
      if (this.xgj != null)
        paramArrayOfObject.e(12, this.xgj);
      paramArrayOfObject.iz(13, this.offset);
      paramArrayOfObject.aO(14, this.xgJ);
      paramArrayOfObject.e(15, 8, this.xgK);
      paramArrayOfObject.iz(16, this.xgL);
      paramArrayOfObject.iz(17, this.xgM);
      paramArrayOfObject.aO(18, this.eif);
      if (this.xgN != null)
        paramArrayOfObject.e(19, this.xgN);
      paramArrayOfObject.iz(20, this.xgO);
      paramArrayOfObject.aO(21, this.xgP);
      AppMethodBeat.o(55709);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xgC == null)
        break label1710;
    label1710: for (i = e.a.a.b.b.a.f(1, this.xgC) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xgD != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xgD);
      i = paramInt;
      if (this.xgE != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xgE);
      paramInt = i;
      if (this.xgF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xgF);
      i = paramInt + e.a.a.b.b.a.o(5, this.xgG) + e.a.a.b.b.a.bs(6, this.scene);
      paramInt = i;
      if (this.hlm != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.hlm);
      i = paramInt;
      if (this.ctj != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.ctj);
      paramInt = i;
      if (this.xgH != null)
        paramInt = i + e.a.a.a.ix(9, this.xgH.computeSize());
      i = paramInt;
      if (this.xgI != null)
        i = paramInt + e.a.a.a.ix(10, this.xgI.computeSize());
      i += e.a.a.a.c(11, 8, this.tZG);
      paramInt = i;
      if (this.xgj != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.xgj);
      i = paramInt + e.a.a.b.b.a.bs(13, this.offset) + (e.a.a.b.b.a.fv(14) + 1) + e.a.a.a.c(15, 8, this.xgK) + e.a.a.b.b.a.bs(16, this.xgL) + e.a.a.b.b.a.bs(17, this.xgM) + (e.a.a.b.b.a.fv(18) + 1);
      paramInt = i;
      if (this.xgN != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.xgN);
      paramInt = paramInt + e.a.a.b.b.a.bs(20, this.xgO) + (e.a.a.b.b.a.fv(21) + 1);
      AppMethodBeat.o(55709);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tZG.clear();
        this.xgK.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55709);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        chv localchv = (chv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55709);
          break;
        case 1:
          localchv.xgC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 2:
          localchv.xgD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 3:
          localchv.xgE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 4:
          localchv.xgF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 5:
          localchv.xgG = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 6:
          localchv.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 7:
          localchv.hlm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 8:
          localchv.ctj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchv.xgH = ((chw)localObject1);
          }
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzs)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchv.xgI = ((bzs)localObject1);
          }
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchv.tZG.add(localObject1);
          }
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 12:
          localchv.xgj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 13:
          localchv.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 14:
          localchv.xgJ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new chw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchv.xgK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 16:
          localchv.xgL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 17:
          localchv.xgM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 18:
          localchv.eif = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 19:
          localchv.xgN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 20:
          localchv.xgO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        case 21:
          localchv.xgP = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(55709);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chv
 * JD-Core Version:    0.6.2
 */