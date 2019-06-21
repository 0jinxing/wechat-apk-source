package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ayt extends com.tencent.mm.bt.a
{
  public float bEJ;
  public String country;
  public String eUu;
  public String guP;
  public String rkg;
  public int rki;
  public int rkk;
  public int score;
  public float vRp;
  public float vRq;
  public String wCC;
  public String wCD;
  public int wCE;
  public int wCF;
  public b wCG;
  public String wCH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94535);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.vRp);
      paramArrayOfObject.r(2, this.vRq);
      if (this.guP != null)
        paramArrayOfObject.e(3, this.guP);
      if (this.eUu != null)
        paramArrayOfObject.e(4, this.eUu);
      if (this.rkg != null)
        paramArrayOfObject.e(5, this.rkg);
      if (this.wCC != null)
        paramArrayOfObject.e(6, this.wCC);
      paramArrayOfObject.iz(7, this.rki);
      if (this.wCD != null)
        paramArrayOfObject.e(8, this.wCD);
      paramArrayOfObject.iz(9, this.wCE);
      paramArrayOfObject.iz(10, this.wCF);
      paramArrayOfObject.iz(11, this.rkk);
      paramArrayOfObject.r(12, this.bEJ);
      if (this.wCG != null)
        paramArrayOfObject.c(13, this.wCG);
      paramArrayOfObject.iz(14, this.score);
      if (this.wCH != null)
        paramArrayOfObject.e(15, this.wCH);
      if (this.country != null)
        paramArrayOfObject.e(16, this.country);
      AppMethodBeat.o(94535);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4);
        paramInt = i;
        if (this.guP != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.guP);
        i = paramInt;
        if (this.eUu != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.eUu);
        paramInt = i;
        if (this.rkg != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.rkg);
        i = paramInt;
        if (this.wCC != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.wCC);
        i += e.a.a.b.b.a.bs(7, this.rki);
        paramInt = i;
        if (this.wCD != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.wCD);
        i = paramInt + e.a.a.b.b.a.bs(9, this.wCE) + e.a.a.b.b.a.bs(10, this.wCF) + e.a.a.b.b.a.bs(11, this.rkk) + (e.a.a.b.b.a.fv(12) + 4);
        paramInt = i;
        if (this.wCG != null)
          paramInt = i + e.a.a.b.b.a.b(13, this.wCG);
        i = paramInt + e.a.a.b.b.a.bs(14, this.score);
        paramInt = i;
        if (this.wCH != null)
          paramInt = i + e.a.a.b.b.a.f(15, this.wCH);
        i = paramInt;
        if (this.country != null)
          i = paramInt + e.a.a.b.b.a.f(16, this.country);
        AppMethodBeat.o(94535);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94535);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ayt localayt = (ayt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94535);
          break;
        case 1:
          localayt.vRp = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 2:
          localayt.vRq = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 3:
          localayt.guP = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 4:
          localayt.eUu = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 5:
          localayt.rkg = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 6:
          localayt.wCC = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 7:
          localayt.rki = locala.BTU.vd();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 8:
          localayt.wCD = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 9:
          localayt.wCE = locala.BTU.vd();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 10:
          localayt.wCF = locala.BTU.vd();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 11:
          localayt.rkk = locala.BTU.vd();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 12:
          localayt.bEJ = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 13:
          localayt.wCG = locala.BTU.emu();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 14:
          localayt.score = locala.BTU.vd();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 15:
          localayt.wCH = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        case 16:
          localayt.country = locala.BTU.readString();
          AppMethodBeat.o(94535);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94535);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayt
 * JD-Core Version:    0.6.2
 */