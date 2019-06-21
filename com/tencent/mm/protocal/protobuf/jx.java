package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class jx extends com.tencent.mm.bt.a
{
  public String Name;
  public String fKh;
  public int mZx;
  public String vDo;
  public String vDp;
  public String vEA;
  public String vMA;
  public String vMB;
  public String vMC;
  public String vMD;
  public String vME;
  public String vMF;
  public int vMG;
  public int vMH;
  public String vMI;
  public String vMJ;
  public String vMK;
  public long vML;
  public String vMv;
  public String vMw;
  public String vMx;
  public String vMy;
  public String vMz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80028);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.vEA != null)
        paramArrayOfObject.e(3, this.vEA);
      if (this.vMv != null)
        paramArrayOfObject.e(4, this.vMv);
      if (this.vMw != null)
        paramArrayOfObject.e(5, this.vMw);
      if (this.vMx != null)
        paramArrayOfObject.e(6, this.vMx);
      if (this.vMy != null)
        paramArrayOfObject.e(7, this.vMy);
      if (this.vMz != null)
        paramArrayOfObject.e(8, this.vMz);
      if (this.vMA != null)
        paramArrayOfObject.e(9, this.vMA);
      if (this.vMB != null)
        paramArrayOfObject.e(10, this.vMB);
      if (this.vMC != null)
        paramArrayOfObject.e(11, this.vMC);
      if (this.vDo != null)
        paramArrayOfObject.e(12, this.vDo);
      if (this.vMD != null)
        paramArrayOfObject.e(13, this.vMD);
      if (this.vME != null)
        paramArrayOfObject.e(14, this.vME);
      if (this.vMF != null)
        paramArrayOfObject.e(15, this.vMF);
      paramArrayOfObject.iz(16, this.mZx);
      paramArrayOfObject.iz(17, this.vMG);
      paramArrayOfObject.iz(18, this.vMH);
      if (this.vMI != null)
        paramArrayOfObject.e(19, this.vMI);
      if (this.vMJ != null)
        paramArrayOfObject.e(20, this.vMJ);
      if (this.vMK != null)
        paramArrayOfObject.e(21, this.vMK);
      if (this.vDp != null)
        paramArrayOfObject.e(22, this.vDp);
      paramArrayOfObject.ai(23, this.vML);
      AppMethodBeat.o(80028);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label1589;
    label1589: for (i = e.a.a.b.b.a.f(1, this.fKh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Name != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Name);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vEA);
      paramInt = i;
      if (this.vMv != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vMv);
      int j = paramInt;
      if (this.vMw != null)
        j = paramInt + e.a.a.b.b.a.f(5, this.vMw);
      i = j;
      if (this.vMx != null)
        i = j + e.a.a.b.b.a.f(6, this.vMx);
      paramInt = i;
      if (this.vMy != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vMy);
      i = paramInt;
      if (this.vMz != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vMz);
      paramInt = i;
      if (this.vMA != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vMA);
      i = paramInt;
      if (this.vMB != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vMB);
      j = i;
      if (this.vMC != null)
        j = i + e.a.a.b.b.a.f(11, this.vMC);
      paramInt = j;
      if (this.vDo != null)
        paramInt = j + e.a.a.b.b.a.f(12, this.vDo);
      i = paramInt;
      if (this.vMD != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.vMD);
      paramInt = i;
      if (this.vME != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.vME);
      i = paramInt;
      if (this.vMF != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.vMF);
      i = i + e.a.a.b.b.a.bs(16, this.mZx) + e.a.a.b.b.a.bs(17, this.vMG) + e.a.a.b.b.a.bs(18, this.vMH);
      paramInt = i;
      if (this.vMI != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.vMI);
      i = paramInt;
      if (this.vMJ != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.vMJ);
      paramInt = i;
      if (this.vMK != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.vMK);
      i = paramInt;
      if (this.vDp != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.vDp);
      paramInt = i + e.a.a.b.b.a.o(23, this.vML);
      AppMethodBeat.o(80028);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80028);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        jx localjx = (jx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80028);
          break;
        case 1:
          localjx.fKh = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 2:
          localjx.Name = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 3:
          localjx.vEA = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 4:
          localjx.vMv = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 5:
          localjx.vMw = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 6:
          localjx.vMx = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 7:
          localjx.vMy = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 8:
          localjx.vMz = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 9:
          localjx.vMA = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 10:
          localjx.vMB = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 11:
          localjx.vMC = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 12:
          localjx.vDo = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 13:
          localjx.vMD = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 14:
          localjx.vME = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 15:
          localjx.vMF = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 16:
          localjx.mZx = locala.BTU.vd();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 17:
          localjx.vMG = locala.BTU.vd();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 18:
          localjx.vMH = locala.BTU.vd();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 19:
          localjx.vMI = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 20:
          localjx.vMJ = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 21:
          localjx.vMK = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 22:
          localjx.vDp = locala.BTU.readString();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        case 23:
          localjx.vML = locala.BTU.ve();
          AppMethodBeat.o(80028);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80028);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jx
 * JD-Core Version:    0.6.2
 */