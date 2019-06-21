package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjn extends com.tencent.mm.bt.a
{
  public String ncH;
  public String pcU;
  public String pcW;
  public int pcX;
  public String pcY;
  public int pcZ;
  public String pda;
  public int pdb;
  public int pdc;
  public String pdd;
  public String pde;
  public String pdf;
  public String pdg;
  public String pdh;
  public int pdi;
  public LinkedList<bzv> pdj;
  public int wMU;

  public bjn()
  {
    AppMethodBeat.i(56901);
    this.pdj = new LinkedList();
    AppMethodBeat.o(56901);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56902);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pcU != null)
        paramArrayOfObject.e(1, this.pcU);
      paramArrayOfObject.iz(2, this.wMU);
      if (this.pcW != null)
        paramArrayOfObject.e(3, this.pcW);
      paramArrayOfObject.iz(4, this.pcX);
      if (this.pcY != null)
        paramArrayOfObject.e(5, this.pcY);
      paramArrayOfObject.iz(6, this.pcZ);
      if (this.pda != null)
        paramArrayOfObject.e(7, this.pda);
      paramArrayOfObject.iz(8, this.pdb);
      paramArrayOfObject.iz(9, this.pdc);
      if (this.pdd != null)
        paramArrayOfObject.e(10, this.pdd);
      if (this.ncH != null)
        paramArrayOfObject.e(11, this.ncH);
      if (this.pde != null)
        paramArrayOfObject.e(12, this.pde);
      if (this.pdf != null)
        paramArrayOfObject.e(13, this.pdf);
      if (this.pdg != null)
        paramArrayOfObject.e(14, this.pdg);
      if (this.pdh != null)
        paramArrayOfObject.e(15, this.pdh);
      paramArrayOfObject.iz(16, this.pdi);
      paramArrayOfObject.e(17, 8, this.pdj);
      AppMethodBeat.o(56902);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pcU == null)
        break label1247;
    label1247: for (paramInt = e.a.a.b.b.a.f(1, this.pcU) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wMU);
      paramInt = i;
      if (this.pcW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pcW);
      i = paramInt + e.a.a.b.b.a.bs(4, this.pcX);
      paramInt = i;
      if (this.pcY != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pcY);
      i = paramInt + e.a.a.b.b.a.bs(6, this.pcZ);
      paramInt = i;
      if (this.pda != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pda);
      i = paramInt + e.a.a.b.b.a.bs(8, this.pdb) + e.a.a.b.b.a.bs(9, this.pdc);
      paramInt = i;
      if (this.pdd != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.pdd);
      i = paramInt;
      if (this.ncH != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.ncH);
      int j = i;
      if (this.pde != null)
        j = i + e.a.a.b.b.a.f(12, this.pde);
      paramInt = j;
      if (this.pdf != null)
        paramInt = j + e.a.a.b.b.a.f(13, this.pdf);
      i = paramInt;
      if (this.pdg != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.pdg);
      paramInt = i;
      if (this.pdh != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.pdh);
      paramInt = paramInt + e.a.a.b.b.a.bs(16, this.pdi) + e.a.a.a.c(17, 8, this.pdj);
      AppMethodBeat.o(56902);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.pdj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56902);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjn localbjn = (bjn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56902);
          break;
        case 1:
          localbjn.pcU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 2:
          localbjn.wMU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 3:
          localbjn.pcW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 4:
          localbjn.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 5:
          localbjn.pcY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 6:
          localbjn.pcZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 7:
          localbjn.pda = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 8:
          localbjn.pdb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 9:
          localbjn.pdc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 10:
          localbjn.pdd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 11:
          localbjn.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 12:
          localbjn.pde = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 13:
          localbjn.pdf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 14:
          localbjn.pdg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 15:
          localbjn.pdh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 16:
          localbjn.pdi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjn.pdj.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56902);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56902);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjn
 * JD-Core Version:    0.6.2
 */