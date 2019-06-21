package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class abf extends com.tencent.mm.bt.a
{
  public String desc;
  public String hHV;
  public long lgR;
  public String title;
  public int version;
  public aaz vzK;
  public boolean wfS;
  public boolean wfT;
  public abu whA;
  public boolean whB;
  public abe whC;
  public boolean whD;
  public abo whE;
  public boolean whF;
  public boolean whG;
  public long whH;
  public boolean whI;
  public int whJ;
  public boolean whK;
  public boolean whL;
  public boolean whM;
  public aap whN;
  public boolean whO;
  public aay why;
  public boolean whz;
  public abl wit;
  public boolean wiu;
  public LinkedList<aar> wiv;
  public boolean wiw;
  public boolean wix;

  public abf()
  {
    AppMethodBeat.i(51404);
    this.wiu = false;
    this.wiv = new LinkedList();
    this.wiw = false;
    this.whz = false;
    this.whB = false;
    this.whG = false;
    this.wfS = false;
    this.wfT = false;
    this.whI = false;
    this.whJ = -1;
    this.whK = false;
    this.whD = false;
    this.whL = false;
    this.whF = false;
    this.wix = false;
    this.whM = false;
    this.whO = false;
    AppMethodBeat.o(51404);
  }

  public final abf LL(int paramInt)
  {
    this.whJ = paramInt;
    this.whK = true;
    return this;
  }

  public final abf LM(int paramInt)
  {
    this.version = paramInt;
    this.wix = true;
    return this;
  }

  public final abf a(aaz paramaaz)
  {
    this.vzK = paramaaz;
    this.whM = true;
    return this;
  }

  public final abf a(abl paramabl)
  {
    this.wit = paramabl;
    this.wiu = true;
    return this;
  }

  public final abf aE(LinkedList<aar> paramLinkedList)
  {
    this.wiv = paramLinkedList;
    this.wiw = true;
    return this;
  }

  public final abf alA(String paramString)
  {
    this.hHV = paramString;
    this.whG = true;
    return this;
  }

  public final abf alB(String paramString)
  {
    this.title = paramString;
    this.wfS = true;
    return this;
  }

  public final abf alC(String paramString)
  {
    this.desc = paramString;
    this.wfT = true;
    return this;
  }

  public final abf b(aap paramaap)
  {
    this.whN = paramaap;
    this.whO = true;
    return this;
  }

  public final abf b(aay paramaay)
  {
    this.why = paramaay;
    this.whz = true;
    return this;
  }

  public final abf b(abe paramabe)
  {
    this.whC = paramabe;
    this.whD = true;
    return this;
  }

  public final abf b(abo paramabo)
  {
    this.whE = paramabo;
    this.whF = true;
    return this;
  }

  public final abf b(abu paramabu)
  {
    this.whA = paramabu;
    this.whB = true;
    return this;
  }

  public final abf mj(long paramLong)
  {
    this.whH = paramLong;
    this.whI = true;
    return this;
  }

  public final abf mk(long paramLong)
  {
    this.lgR = paramLong;
    this.whL = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51405);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wit != null)
      {
        paramArrayOfObject.iy(1, this.wit.computeSize());
        this.wit.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wiv);
      if (this.why != null)
      {
        paramArrayOfObject.iy(3, this.why.computeSize());
        this.why.writeFields(paramArrayOfObject);
      }
      if (this.whA != null)
      {
        paramArrayOfObject.iy(4, this.whA.computeSize());
        this.whA.writeFields(paramArrayOfObject);
      }
      if (this.hHV != null)
        paramArrayOfObject.e(5, this.hHV);
      if (this.title != null)
        paramArrayOfObject.e(6, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(7, this.desc);
      if (this.whI == true)
        paramArrayOfObject.ai(8, this.whH);
      if (this.whK == true)
        paramArrayOfObject.iz(91, this.whJ);
      if (this.whC != null)
      {
        paramArrayOfObject.iy(10, this.whC.computeSize());
        this.whC.writeFields(paramArrayOfObject);
      }
      if (this.whL == true)
        paramArrayOfObject.ai(11, this.lgR);
      if (this.whE != null)
      {
        paramArrayOfObject.iy(12, this.whE.computeSize());
        this.whE.writeFields(paramArrayOfObject);
      }
      if (this.wix == true)
        paramArrayOfObject.iz(13, this.version);
      if (this.vzK != null)
      {
        paramArrayOfObject.iy(14, this.vzK.computeSize());
        this.vzK.writeFields(paramArrayOfObject);
      }
      if (this.whN != null)
      {
        paramArrayOfObject.iy(15, this.whN.computeSize());
        this.whN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(51405);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wit == null)
        break label2046;
    label2046: for (paramInt = e.a.a.a.ix(1, this.wit.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wiv);
      paramInt = i;
      if (this.why != null)
        paramInt = i + e.a.a.a.ix(3, this.why.computeSize());
      int j = paramInt;
      if (this.whA != null)
        j = paramInt + e.a.a.a.ix(4, this.whA.computeSize());
      i = j;
      if (this.hHV != null)
        i = j + e.a.a.b.b.a.f(5, this.hHV);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.title);
      j = paramInt;
      if (this.desc != null)
        j = paramInt + e.a.a.b.b.a.f(7, this.desc);
      i = j;
      if (this.whI == true)
        i = j + e.a.a.b.b.a.o(8, this.whH);
      paramInt = i;
      if (this.whK == true)
        paramInt = i + e.a.a.b.b.a.bs(91, this.whJ);
      i = paramInt;
      if (this.whC != null)
        i = paramInt + e.a.a.a.ix(10, this.whC.computeSize());
      j = i;
      if (this.whL == true)
        j = i + e.a.a.b.b.a.o(11, this.lgR);
      paramInt = j;
      if (this.whE != null)
        paramInt = j + e.a.a.a.ix(12, this.whE.computeSize());
      i = paramInt;
      if (this.wix == true)
        i = paramInt + e.a.a.b.b.a.bs(13, this.version);
      paramInt = i;
      if (this.vzK != null)
        paramInt = i + e.a.a.a.ix(14, this.vzK.computeSize());
      i = paramInt;
      if (this.whN != null)
        i = paramInt + e.a.a.a.ix(15, this.whN.computeSize());
      AppMethodBeat.o(51405);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wiv.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51405);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        abf localabf = (abf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51405);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.wit = ((abl)localObject1);
          }
          localabf.wiu = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aar();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aar)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.wiv.add(localObject1);
          }
          localabf.wiw = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aay();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aay)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.why = ((aay)localObject1);
          }
          localabf.whz = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.whA = ((abu)localObject1);
          }
          localabf.whB = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 5:
          localabf.hHV = ((e.a.a.a.a)localObject1).BTU.readString();
          localabf.whG = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 6:
          localabf.title = ((e.a.a.a.a)localObject1).BTU.readString();
          localabf.wfS = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 7:
          localabf.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          localabf.wfT = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 8:
          localabf.whH = ((e.a.a.a.a)localObject1).BTU.ve();
          localabf.whI = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 91:
          localabf.whJ = ((e.a.a.a.a)localObject1).BTU.vd();
          localabf.whK = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abe)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.whC = ((abe)localObject1);
          }
          localabf.whD = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 11:
          localabf.lgR = ((e.a.a.a.a)localObject1).BTU.ve();
          localabf.whL = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.whE = ((abo)localObject1);
          }
          localabf.whF = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 13:
          localabf.version = ((e.a.a.a.a)localObject1).BTU.vd();
          localabf.wix = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aaz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.vzK = paramArrayOfObject;
          }
          localabf.whM = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aap)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabf.whN = ((aap)localObject1);
          }
          localabf.whO = true;
          AppMethodBeat.o(51405);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51405);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abf
 * JD-Core Version:    0.6.2
 */