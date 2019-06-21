package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class c extends com.tencent.mm.bt.a
{
  public String detail;
  public String fjz;
  public String name;
  public String pcl;
  public LinkedList<d> phC;
  public int phD;
  public int phE;
  public int phF;
  public LinkedList<String> phG;
  public LinkedList<String> phH;
  public LinkedList<b> phI;
  public LinkedList<String> phJ;
  public int phK;
  public int phL;
  public LinkedList<m> phM;
  public LinkedList<a> phN;
  public k phO;
  public int version;

  public c()
  {
    AppMethodBeat.i(56624);
    this.phC = new LinkedList();
    this.phG = new LinkedList();
    this.phH = new LinkedList();
    this.phI = new LinkedList();
    this.phJ = new LinkedList();
    this.phM = new LinkedList();
    this.phN = new LinkedList();
    AppMethodBeat.o(56624);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56625);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      paramArrayOfObject.e(2, 8, this.phC);
      paramArrayOfObject.iz(3, this.phD);
      paramArrayOfObject.iz(4, this.phE);
      paramArrayOfObject.iz(5, this.phF);
      paramArrayOfObject.e(6, 1, this.phG);
      if (this.fjz != null)
        paramArrayOfObject.e(7, this.fjz);
      if (this.detail != null)
        paramArrayOfObject.e(8, this.detail);
      paramArrayOfObject.e(9, 1, this.phH);
      paramArrayOfObject.e(10, 8, this.phI);
      paramArrayOfObject.e(11, 1, this.phJ);
      paramArrayOfObject.iz(12, this.phK);
      paramArrayOfObject.iz(13, this.phL);
      paramArrayOfObject.e(14, 8, this.phM);
      paramArrayOfObject.iz(15, this.version);
      paramArrayOfObject.e(16, 8, this.phN);
      if (this.pcl != null)
        paramArrayOfObject.e(17, this.pcl);
      if (this.phO != null)
      {
        paramArrayOfObject.iy(18, this.phO.computeSize());
        this.phO.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56625);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label1617;
    label1617: for (paramInt = e.a.a.b.b.a.f(1, this.name) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.phC) + e.a.a.b.b.a.bs(3, this.phD) + e.a.a.b.b.a.bs(4, this.phE) + e.a.a.b.b.a.bs(5, this.phF) + e.a.a.a.c(6, 1, this.phG);
      paramInt = i;
      if (this.fjz != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.fjz);
      i = paramInt;
      if (this.detail != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.detail);
      i = i + e.a.a.a.c(9, 1, this.phH) + e.a.a.a.c(10, 8, this.phI) + e.a.a.a.c(11, 1, this.phJ) + e.a.a.b.b.a.bs(12, this.phK) + e.a.a.b.b.a.bs(13, this.phL) + e.a.a.a.c(14, 8, this.phM) + e.a.a.b.b.a.bs(15, this.version) + e.a.a.a.c(16, 8, this.phN);
      paramInt = i;
      if (this.pcl != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.pcl);
      i = paramInt;
      if (this.phO != null)
        i = paramInt + e.a.a.a.ix(18, this.phO.computeSize());
      AppMethodBeat.o(56625);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.phC.clear();
        this.phG.clear();
        this.phH.clear();
        this.phI.clear();
        this.phJ.clear();
        this.phM.clear();
        this.phN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56625);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56625);
          break;
        case 1:
          localc.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.phC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 3:
          localc.phD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 4:
          localc.phE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 5:
          localc.phF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 6:
          localc.phG.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 7:
          localc.fjz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 8:
          localc.detail = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 9:
          localc.phH.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((b)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.phI.add(localObject1);
          }
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 11:
          localc.phJ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 12:
          localc.phK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 13:
          localc.phL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.phM.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 15:
          localc.version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.phN.add(localObject1);
          }
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 17:
          localc.pcl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        case 18:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new k();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((k)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.phO = ((k)localObject1);
          }
          AppMethodBeat.o(56625);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56625);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.c
 * JD-Core Version:    0.6.2
 */