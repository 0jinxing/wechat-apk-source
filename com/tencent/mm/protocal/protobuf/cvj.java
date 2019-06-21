package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cvj extends com.tencent.mm.bt.a
{
  public int Scene;
  public String luQ;
  public cgg tZF;
  public int vOq;
  public long vQd;
  public String vQg;
  public com.tencent.mm.bt.b wCA;
  public int wCu;
  public int wCv;
  public String wCy;
  public com.tencent.mm.bt.b wCz;
  public axy wDI;
  public int wUr;
  public LinkedList<cmg> wWp;
  public String wkD;
  public LinkedList<tn> xqa;
  public int xrc;
  public String xro;
  public String xrp;
  public int xrq;
  public LinkedList<String> xrr;
  public LinkedList<bem> xrs;
  public caw xrt;
  public vb xru;
  public bkr xrv;

  public cvj()
  {
    AppMethodBeat.i(124386);
    this.wWp = new LinkedList();
    this.xrr = new LinkedList();
    this.wCv = 2;
    this.xqa = new LinkedList();
    this.xrs = new LinkedList();
    AppMethodBeat.o(124386);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124387);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wkD == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Keyword");
        AppMethodBeat.o(124387);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wUr);
      if (this.wkD != null)
        paramArrayOfObject.e(2, this.wkD);
      paramArrayOfObject.iz(3, this.vOq);
      paramArrayOfObject.ai(4, this.vQd);
      paramArrayOfObject.iz(5, this.wCu);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(6, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(7, 8, this.wWp);
      paramArrayOfObject.iz(8, this.Scene);
      if (this.vQg != null)
        paramArrayOfObject.e(9, this.vQg);
      paramArrayOfObject.iz(10, this.xrc);
      if (this.xro != null)
        paramArrayOfObject.e(11, this.xro);
      if (this.xrp != null)
        paramArrayOfObject.e(12, this.xrp);
      paramArrayOfObject.iz(13, this.xrq);
      paramArrayOfObject.e(14, 1, this.xrr);
      paramArrayOfObject.iz(15, this.wCv);
      if (this.tZF != null)
      {
        paramArrayOfObject.iy(16, this.tZF.computeSize());
        this.tZF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(17, 8, this.xqa);
      paramArrayOfObject.e(18, 8, this.xrs);
      if (this.luQ != null)
        paramArrayOfObject.e(19, this.luQ);
      if (this.wCA != null)
        paramArrayOfObject.c(20, this.wCA);
      if (this.wCy != null)
        paramArrayOfObject.e(21, this.wCy);
      if (this.wCz != null)
        paramArrayOfObject.c(22, this.wCz);
      if (this.xrt != null)
      {
        paramArrayOfObject.iy(23, this.xrt.computeSize());
        this.xrt.writeFields(paramArrayOfObject);
      }
      if (this.xru != null)
      {
        paramArrayOfObject.iy(24, this.xru.computeSize());
        this.xru.writeFields(paramArrayOfObject);
      }
      if (this.xrv != null)
      {
        paramArrayOfObject.iy(25, this.xrv.computeSize());
        this.xrv.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124387);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wUr) + 0;
        paramInt = i;
        if (this.wkD != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wkD);
        i = paramInt + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.o(4, this.vQd) + e.a.a.b.b.a.bs(5, this.wCu);
        paramInt = i;
        if (this.wDI != null)
          paramInt = i + e.a.a.a.ix(6, this.wDI.computeSize());
        i = paramInt + e.a.a.a.c(7, 8, this.wWp) + e.a.a.b.b.a.bs(8, this.Scene);
        paramInt = i;
        if (this.vQg != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.vQg);
        i = paramInt + e.a.a.b.b.a.bs(10, this.xrc);
        paramInt = i;
        if (this.xro != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.xro);
        i = paramInt;
        if (this.xrp != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.xrp);
        i = i + e.a.a.b.b.a.bs(13, this.xrq) + e.a.a.a.c(14, 1, this.xrr) + e.a.a.b.b.a.bs(15, this.wCv);
        paramInt = i;
        if (this.tZF != null)
          paramInt = i + e.a.a.a.ix(16, this.tZF.computeSize());
        paramInt = paramInt + e.a.a.a.c(17, 8, this.xqa) + e.a.a.a.c(18, 8, this.xrs);
        i = paramInt;
        if (this.luQ != null)
          i = paramInt + e.a.a.b.b.a.f(19, this.luQ);
        paramInt = i;
        if (this.wCA != null)
          paramInt = i + e.a.a.b.b.a.b(20, this.wCA);
        i = paramInt;
        if (this.wCy != null)
          i = paramInt + e.a.a.b.b.a.f(21, this.wCy);
        paramInt = i;
        if (this.wCz != null)
          paramInt = i + e.a.a.b.b.a.b(22, this.wCz);
        i = paramInt;
        if (this.xrt != null)
          i = paramInt + e.a.a.a.ix(23, this.xrt.computeSize());
        paramInt = i;
        if (this.xru != null)
          paramInt = i + e.a.a.a.ix(24, this.xru.computeSize());
        i = paramInt;
        if (this.xrv != null)
          i = paramInt + e.a.a.a.ix(25, this.xrv.computeSize());
        AppMethodBeat.o(124387);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wWp.clear();
        this.xrr.clear();
        this.xqa.clear();
        this.xrs.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wkD == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Keyword");
          AppMethodBeat.o(124387);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124387);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvj localcvj = (cvj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124387);
          break;
        case 1:
          localcvj.wUr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 2:
          localcvj.wkD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 3:
          localcvj.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 4:
          localcvj.vQd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 5:
          localcvj.wCu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.wDI = ((axy)localObject1);
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cmg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.wWp.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 8:
          localcvj.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 9:
          localcvj.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 10:
          localcvj.xrc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 11:
          localcvj.xro = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 12:
          localcvj.xrp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 13:
          localcvj.xrq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 14:
          localcvj.xrr.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 15:
          localcvj.wCv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.tZF = ((cgg)localObject1);
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.xqa.add(localObject1);
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 18:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bem();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.xrs.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 19:
          localcvj.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 20:
          localcvj.wCA = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 21:
          localcvj.wCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 22:
          localcvj.wCz = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new caw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.xrt = paramArrayOfObject;
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 24:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new vb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.xru = paramArrayOfObject;
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        case 25:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvj.xrv = paramArrayOfObject;
          }
          AppMethodBeat.o(124387);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124387);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvj
 * JD-Core Version:    0.6.2
 */