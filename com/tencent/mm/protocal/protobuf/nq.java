package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nq extends com.tencent.mm.bt.a
{
  public String vCb;
  public String vSA;
  public String vSB;
  public String vSC;
  public LinkedList<np> vSD;
  public int vSE;
  public String vSF;
  public String vSG;
  public String vSH;
  public int vSI;
  public String vSJ;
  public int vSK;
  public String vSy;
  public String vSz;

  public nq()
  {
    AppMethodBeat.i(89022);
    this.vSD = new LinkedList();
    AppMethodBeat.o(89022);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89023);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCb != null)
        paramArrayOfObject.e(1, this.vCb);
      if (this.vSy != null)
        paramArrayOfObject.e(2, this.vSy);
      if (this.vSz != null)
        paramArrayOfObject.e(3, this.vSz);
      if (this.vSA != null)
        paramArrayOfObject.e(4, this.vSA);
      if (this.vSB != null)
        paramArrayOfObject.e(5, this.vSB);
      if (this.vSC != null)
        paramArrayOfObject.e(6, this.vSC);
      paramArrayOfObject.e(7, 8, this.vSD);
      paramArrayOfObject.iz(8, this.vSE);
      if (this.vSF != null)
        paramArrayOfObject.e(9, this.vSF);
      if (this.vSG != null)
        paramArrayOfObject.e(10, this.vSG);
      if (this.vSH != null)
        paramArrayOfObject.e(11, this.vSH);
      paramArrayOfObject.iz(12, this.vSI);
      if (this.vSJ != null)
        paramArrayOfObject.e(13, this.vSJ);
      paramArrayOfObject.iz(14, this.vSK);
      AppMethodBeat.o(89023);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCb == null)
        break label1098;
    label1098: for (paramInt = e.a.a.b.b.a.f(1, this.vCb) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vSy != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vSy);
      paramInt = i;
      if (this.vSz != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vSz);
      i = paramInt;
      if (this.vSA != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vSA);
      paramInt = i;
      if (this.vSB != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vSB);
      i = paramInt;
      if (this.vSC != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vSC);
      paramInt = i + e.a.a.a.c(7, 8, this.vSD) + e.a.a.b.b.a.bs(8, this.vSE);
      i = paramInt;
      if (this.vSF != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vSF);
      paramInt = i;
      if (this.vSG != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vSG);
      i = paramInt;
      if (this.vSH != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vSH);
      i += e.a.a.b.b.a.bs(12, this.vSI);
      paramInt = i;
      if (this.vSJ != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vSJ);
      paramInt += e.a.a.b.b.a.bs(14, this.vSK);
      AppMethodBeat.o(89023);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vSD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89023);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nq localnq = (nq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89023);
          break;
        case 1:
          localnq.vCb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 2:
          localnq.vSy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 3:
          localnq.vSz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 4:
          localnq.vSA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 5:
          localnq.vSB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 6:
          localnq.vSC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new np();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localnq.vSD.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 8:
          localnq.vSE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 9:
          localnq.vSF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 10:
          localnq.vSG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 11:
          localnq.vSH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 12:
          localnq.vSI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 13:
          localnq.vSJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        case 14:
          localnq.vSK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89023);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89023);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nq
 * JD-Core Version:    0.6.2
 */