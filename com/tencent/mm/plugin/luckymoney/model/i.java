package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i extends com.tencent.mm.bt.a
{
  public int kCv;
  public int nRO;
  public double nRP;
  public double nRQ;
  public double nRR;
  public double nRS;
  public String nRT;
  public String nRU;
  public String nWH;
  public String nWI;
  public int nWJ;
  public String nWK;
  public String nWL;
  public String nWM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56609);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.nRO);
      paramArrayOfObject.f(2, this.nRR);
      if (this.nWH != null)
        paramArrayOfObject.e(3, this.nWH);
      if (this.nWI != null)
        paramArrayOfObject.e(4, this.nWI);
      paramArrayOfObject.f(5, this.nRP);
      paramArrayOfObject.f(6, this.nRS);
      paramArrayOfObject.f(7, this.nRQ);
      paramArrayOfObject.iz(8, this.nWJ);
      paramArrayOfObject.iz(9, this.kCv);
      if (this.nRT != null)
        paramArrayOfObject.e(10, this.nRT);
      if (this.nRU != null)
        paramArrayOfObject.e(11, this.nRU);
      if (this.nWK != null)
        paramArrayOfObject.e(12, this.nWK);
      if (this.nWL != null)
        paramArrayOfObject.e(13, this.nWL);
      if (this.nWM != null)
        paramArrayOfObject.e(14, this.nWM);
      AppMethodBeat.o(56609);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.nRO) + 0 + (e.a.a.b.b.a.fv(2) + 8);
        paramInt = i;
        if (this.nWH != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.nWH);
        i = paramInt;
        if (this.nWI != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.nWI);
        paramInt = i + (e.a.a.b.b.a.fv(5) + 8) + (e.a.a.b.b.a.fv(6) + 8) + (e.a.a.b.b.a.fv(7) + 8) + e.a.a.b.b.a.bs(8, this.nWJ) + e.a.a.b.b.a.bs(9, this.kCv);
        i = paramInt;
        if (this.nRT != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.nRT);
        paramInt = i;
        if (this.nRU != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.nRU);
        i = paramInt;
        if (this.nWK != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.nWK);
        paramInt = i;
        if (this.nWL != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.nWL);
        i = paramInt;
        if (this.nWM != null)
          i = paramInt + e.a.a.b.b.a.f(14, this.nWM);
        AppMethodBeat.o(56609);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56609);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56609);
          break;
        case 1:
          locali.nRO = locala.BTU.vd();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 2:
          locali.nRR = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 3:
          locali.nWH = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 4:
          locali.nWI = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 5:
          locali.nRP = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 6:
          locali.nRS = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 7:
          locali.nRQ = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 8:
          locali.nWJ = locala.BTU.vd();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 9:
          locali.kCv = locala.BTU.vd();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 10:
          locali.nRT = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 11:
          locali.nRU = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 12:
          locali.nWK = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 13:
          locali.nWL = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        case 14:
          locali.nWM = locala.BTU.readString();
          AppMethodBeat.o(56609);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56609);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.i
 * JD-Core Version:    0.6.2
 */