package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bfu extends com.tencent.mm.bt.a
{
  public String mZJ;
  public String mZr;
  public int mZx;
  public String ncH;
  public String vDm;
  public String vDo;
  public String vMD;
  public int vMG;
  public String wJA;
  public String wJB;
  public String wJC;
  public String wJD;
  public String wJE;
  public String wJF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80124);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.ncH != null)
        paramArrayOfObject.e(2, this.ncH);
      if (this.wJA != null)
        paramArrayOfObject.e(3, this.wJA);
      if (this.vDm != null)
        paramArrayOfObject.e(4, this.vDm);
      if (this.mZJ != null)
        paramArrayOfObject.e(5, this.mZJ);
      paramArrayOfObject.iz(6, this.vMG);
      if (this.wJB != null)
        paramArrayOfObject.e(7, this.wJB);
      if (this.vDo != null)
        paramArrayOfObject.e(8, this.vDo);
      if (this.vMD != null)
        paramArrayOfObject.e(9, this.vMD);
      if (this.wJC != null)
        paramArrayOfObject.e(10, this.wJC);
      if (this.wJD != null)
        paramArrayOfObject.e(11, this.wJD);
      if (this.wJE != null)
        paramArrayOfObject.e(12, this.wJE);
      if (this.wJF != null)
        paramArrayOfObject.e(13, this.wJF);
      paramArrayOfObject.iz(14, this.mZx);
      AppMethodBeat.o(80124);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label1034;
    label1034: for (i = e.a.a.b.b.a.f(1, this.mZr) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ncH);
      i = paramInt;
      if (this.wJA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wJA);
      paramInt = i;
      if (this.vDm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vDm);
      i = paramInt;
      if (this.mZJ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.mZJ);
      paramInt = i + e.a.a.b.b.a.bs(6, this.vMG);
      i = paramInt;
      if (this.wJB != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wJB);
      paramInt = i;
      if (this.vDo != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vDo);
      i = paramInt;
      if (this.vMD != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vMD);
      paramInt = i;
      if (this.wJC != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wJC);
      i = paramInt;
      if (this.wJD != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wJD);
      paramInt = i;
      if (this.wJE != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wJE);
      i = paramInt;
      if (this.wJF != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wJF);
      paramInt = i + e.a.a.b.b.a.bs(14, this.mZx);
      AppMethodBeat.o(80124);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80124);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bfu localbfu = (bfu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80124);
          break;
        case 1:
          localbfu.mZr = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 2:
          localbfu.ncH = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 3:
          localbfu.wJA = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 4:
          localbfu.vDm = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 5:
          localbfu.mZJ = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 6:
          localbfu.vMG = locala.BTU.vd();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 7:
          localbfu.wJB = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 8:
          localbfu.vDo = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 9:
          localbfu.vMD = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 10:
          localbfu.wJC = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 11:
          localbfu.wJD = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 12:
          localbfu.wJE = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 13:
          localbfu.wJF = locala.BTU.readString();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        case 14:
          localbfu.mZx = locala.BTU.vd();
          AppMethodBeat.o(80124);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80124);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfu
 * JD-Core Version:    0.6.2
 */