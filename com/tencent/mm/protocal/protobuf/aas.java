package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aas extends com.tencent.mm.bt.a
{
  public String desc;
  public String hHV;
  public long lgR;
  public String title;
  public aaz vzK;
  public boolean wfS = false;
  public boolean wfT = false;
  public abu whA;
  public boolean whB = false;
  public abe whC;
  public boolean whD = false;
  public abo whE;
  public boolean whF = false;
  public boolean whG = false;
  public long whH;
  public boolean whI = false;
  public int whJ = -1;
  public boolean whK = false;
  public boolean whL = false;
  public boolean whM = false;
  public aap whN;
  public boolean whO = false;
  public aat whw;
  public boolean whx = false;
  public aay why;
  public boolean whz = false;

  public final aas a(aap paramaap)
  {
    this.whN = paramaap;
    this.whO = true;
    return this;
  }

  public final aas a(aay paramaay)
  {
    this.why = paramaay;
    this.whz = true;
    return this;
  }

  public final aas a(abe paramabe)
  {
    this.whC = paramabe;
    this.whD = true;
    return this;
  }

  public final aas a(abo paramabo)
  {
    this.whE = paramabo;
    this.whF = true;
    return this;
  }

  public final aas a(abu paramabu)
  {
    this.whA = paramabu;
    this.whB = true;
    return this;
  }

  public final aas c(aat paramaat)
  {
    this.whw = paramaat;
    this.whx = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51391);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.whw != null)
      {
        paramArrayOfObject.iy(1, this.whw.computeSize());
        this.whw.writeFields(paramArrayOfObject);
      }
      if (this.why != null)
      {
        paramArrayOfObject.iy(2, this.why.computeSize());
        this.why.writeFields(paramArrayOfObject);
      }
      if (this.whA != null)
      {
        paramArrayOfObject.iy(3, this.whA.computeSize());
        this.whA.writeFields(paramArrayOfObject);
      }
      if (this.whC != null)
      {
        paramArrayOfObject.iy(4, this.whC.computeSize());
        this.whC.writeFields(paramArrayOfObject);
      }
      if (this.whE != null)
      {
        paramArrayOfObject.iy(5, this.whE.computeSize());
        this.whE.writeFields(paramArrayOfObject);
      }
      if (this.hHV != null)
        paramArrayOfObject.e(6, this.hHV);
      if (this.title != null)
        paramArrayOfObject.e(7, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(8, this.desc);
      if (this.whI == true)
        paramArrayOfObject.ai(9, this.whH);
      if (this.whK == true)
        paramArrayOfObject.iz(101, this.whJ);
      if (this.whL == true)
        paramArrayOfObject.ai(11, this.lgR);
      if (this.vzK != null)
      {
        paramArrayOfObject.iy(12, this.vzK.computeSize());
        this.vzK.writeFields(paramArrayOfObject);
      }
      if (this.whN != null)
      {
        paramArrayOfObject.iy(13, this.whN.computeSize());
        this.whN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(51391);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.whw == null)
        break label1798;
    label1798: for (i = e.a.a.a.ix(1, this.whw.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.why != null)
        paramInt = i + e.a.a.a.ix(2, this.why.computeSize());
      i = paramInt;
      if (this.whA != null)
        i = paramInt + e.a.a.a.ix(3, this.whA.computeSize());
      paramInt = i;
      if (this.whC != null)
        paramInt = i + e.a.a.a.ix(4, this.whC.computeSize());
      i = paramInt;
      if (this.whE != null)
        i = paramInt + e.a.a.a.ix(5, this.whE.computeSize());
      paramInt = i;
      if (this.hHV != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.hHV);
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.title);
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.desc);
      i = paramInt;
      if (this.whI == true)
        i = paramInt + e.a.a.b.b.a.o(9, this.whH);
      paramInt = i;
      if (this.whK == true)
        paramInt = i + e.a.a.b.b.a.bs(101, this.whJ);
      i = paramInt;
      if (this.whL == true)
        i = paramInt + e.a.a.b.b.a.o(11, this.lgR);
      paramInt = i;
      if (this.vzK != null)
        paramInt = i + e.a.a.a.ix(12, this.vzK.computeSize());
      i = paramInt;
      if (this.whN != null)
        i = paramInt + e.a.a.a.ix(13, this.whN.computeSize());
      AppMethodBeat.o(51391);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51391);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aas localaas = (aas)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51391);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aat();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aat)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.whw = ((aat)localObject1);
          }
          localaas.whx = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aay();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aay)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.why = ((aay)localObject1);
          }
          localaas.whz = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.whA = paramArrayOfObject;
          }
          localaas.whB = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abe)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.whC = ((abe)localObject1);
          }
          localaas.whD = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.whE = ((abo)localObject1);
          }
          localaas.whF = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 6:
          localaas.hHV = ((e.a.a.a.a)localObject1).BTU.readString();
          localaas.whG = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 7:
          localaas.title = ((e.a.a.a.a)localObject1).BTU.readString();
          localaas.wfS = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 8:
          localaas.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          localaas.wfT = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 9:
          localaas.whH = ((e.a.a.a.a)localObject1).BTU.ve();
          localaas.whI = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 101:
          localaas.whJ = ((e.a.a.a.a)localObject1).BTU.vd();
          localaas.whK = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 11:
          localaas.lgR = ((e.a.a.a.a)localObject1).BTU.ve();
          localaas.whL = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aaz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.vzK = paramArrayOfObject;
          }
          localaas.whM = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aap)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaas.whN = ((aap)localObject1);
          }
          localaas.whO = true;
          AppMethodBeat.o(51391);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51391);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aas
 * JD-Core Version:    0.6.2
 */