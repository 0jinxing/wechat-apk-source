package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bpe extends com.tencent.mm.bt.a
{
  public String mZr;
  public int mZx;
  public String nad;
  public String ncH;
  public String vDk;
  public String vDl;
  public String vDm;
  public String vDn;
  public String vDo;
  public String vDp;
  public cyf vDq;
  public String vME;
  public int wHF;
  public LinkedList<bts> wRA;
  public String wRB;
  public String wRC;
  public String wRD;
  public String wRE;
  public String wRF;
  public String wRG;
  public String wRH;
  public int wRI;
  public String wRx;
  public String wRy;
  public int wRz;

  public bpe()
  {
    AppMethodBeat.i(80158);
    this.wRA = new LinkedList();
    AppMethodBeat.o(80158);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80159);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.ncH != null)
        paramArrayOfObject.e(2, this.ncH);
      if (this.vDm != null)
        paramArrayOfObject.e(3, this.vDm);
      if (this.wRx != null)
        paramArrayOfObject.e(4, this.wRx);
      if (this.vDl != null)
        paramArrayOfObject.e(5, this.vDl);
      if (this.vDk != null)
        paramArrayOfObject.e(6, this.vDk);
      if (this.wRy != null)
        paramArrayOfObject.e(7, this.wRy);
      paramArrayOfObject.iz(8, this.wRz);
      paramArrayOfObject.e(9, 8, this.wRA);
      if (this.vDn != null)
        paramArrayOfObject.e(10, this.vDn);
      if (this.wRB != null)
        paramArrayOfObject.e(11, this.wRB);
      if (this.wRC != null)
        paramArrayOfObject.e(12, this.wRC);
      paramArrayOfObject.iz(13, this.wHF);
      if (this.vME != null)
        paramArrayOfObject.e(14, this.vME);
      if (this.nad != null)
        paramArrayOfObject.e(15, this.nad);
      if (this.vDo != null)
        paramArrayOfObject.e(16, this.vDo);
      if (this.wRD != null)
        paramArrayOfObject.e(17, this.wRD);
      if (this.wRE != null)
        paramArrayOfObject.e(18, this.wRE);
      if (this.vDp != null)
        paramArrayOfObject.e(19, this.vDp);
      if (this.wRF != null)
        paramArrayOfObject.e(20, this.wRF);
      if (this.wRG != null)
        paramArrayOfObject.e(21, this.wRG);
      if (this.vDq != null)
      {
        paramArrayOfObject.iy(22, this.vDq.computeSize());
        this.vDq.writeFields(paramArrayOfObject);
      }
      if (this.wRH != null)
        paramArrayOfObject.e(23, this.wRH);
      paramArrayOfObject.iz(24, this.wRI);
      paramArrayOfObject.iz(25, this.mZx);
      AppMethodBeat.o(80159);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label1891;
    label1891: for (i = e.a.a.b.b.a.f(1, this.mZr) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ncH);
      i = paramInt;
      if (this.vDm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vDm);
      paramInt = i;
      if (this.wRx != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wRx);
      i = paramInt;
      if (this.vDl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vDl);
      paramInt = i;
      if (this.vDk != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vDk);
      i = paramInt;
      if (this.wRy != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wRy);
      i = i + e.a.a.b.b.a.bs(8, this.wRz) + e.a.a.a.c(9, 8, this.wRA);
      paramInt = i;
      if (this.vDn != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vDn);
      i = paramInt;
      if (this.wRB != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wRB);
      paramInt = i;
      if (this.wRC != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wRC);
      i = paramInt + e.a.a.b.b.a.bs(13, this.wHF);
      paramInt = i;
      if (this.vME != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.vME);
      i = paramInt;
      if (this.nad != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.nad);
      paramInt = i;
      if (this.vDo != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vDo);
      i = paramInt;
      if (this.wRD != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.wRD);
      paramInt = i;
      if (this.wRE != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wRE);
      i = paramInt;
      if (this.vDp != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.vDp);
      paramInt = i;
      if (this.wRF != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.wRF);
      i = paramInt;
      if (this.wRG != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.wRG);
      paramInt = i;
      if (this.vDq != null)
        paramInt = i + e.a.a.a.ix(22, this.vDq.computeSize());
      i = paramInt;
      if (this.wRH != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.wRH);
      paramInt = i + e.a.a.b.b.a.bs(24, this.wRI) + e.a.a.b.b.a.bs(25, this.mZx);
      AppMethodBeat.o(80159);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wRA.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80159);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpe localbpe = (bpe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80159);
          break;
        case 1:
          localbpe.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 2:
          localbpe.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 3:
          localbpe.vDm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 4:
          localbpe.wRx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 5:
          localbpe.vDl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 6:
          localbpe.vDk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 7:
          localbpe.wRy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 8:
          localbpe.wRz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpe.wRA.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 10:
          localbpe.vDn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 11:
          localbpe.wRB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 12:
          localbpe.wRC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 13:
          localbpe.wHF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 14:
          localbpe.vME = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 15:
          localbpe.nad = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 16:
          localbpe.vDo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 17:
          localbpe.wRD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 18:
          localbpe.wRE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 19:
          localbpe.vDp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 20:
          localbpe.wRF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 21:
          localbpe.wRG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpe.vDq = paramArrayOfObject;
          }
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 23:
          localbpe.wRH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 24:
          localbpe.wRI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        case 25:
          localbpe.mZx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80159);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80159);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpe
 * JD-Core Version:    0.6.2
 */