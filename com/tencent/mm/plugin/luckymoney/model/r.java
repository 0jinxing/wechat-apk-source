package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r extends com.tencent.mm.bt.a
{
  public int cRT;
  public String nSX;
  public String nWR;
  public long nWU;
  public long nWW;
  public String nWX;
  public String nXL;
  public long nXM;
  public String nXN;
  public String nXO;
  public String nXP;
  public long nXQ;
  public int nXR;
  public int nXi;
  public int status;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56614);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nXL != null)
        paramArrayOfObject.e(1, this.nXL);
      if (this.nWR != null)
        paramArrayOfObject.e(2, this.nWR);
      paramArrayOfObject.ai(3, this.nXM);
      if (this.nXN != null)
        paramArrayOfObject.e(4, this.nXN);
      paramArrayOfObject.iz(5, this.cRT);
      if (this.nXO != null)
        paramArrayOfObject.e(6, this.nXO);
      if (this.nXP != null)
        paramArrayOfObject.e(7, this.nXP);
      paramArrayOfObject.ai(8, this.nWW);
      paramArrayOfObject.ai(9, this.nXQ);
      paramArrayOfObject.ai(10, this.nWU);
      paramArrayOfObject.iz(11, this.status);
      paramArrayOfObject.iz(12, this.nXR);
      if (this.nWX != null)
        paramArrayOfObject.e(13, this.nWX);
      if (this.nSX != null)
        paramArrayOfObject.e(14, this.nSX);
      paramArrayOfObject.iz(15, this.nXi);
      AppMethodBeat.o(56614);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nXL == null)
        break label993;
    label993: for (paramInt = e.a.a.b.b.a.f(1, this.nXL) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nWR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nWR);
      i += e.a.a.b.b.a.o(3, this.nXM);
      paramInt = i;
      if (this.nXN != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nXN);
      i = paramInt + e.a.a.b.b.a.bs(5, this.cRT);
      paramInt = i;
      if (this.nXO != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.nXO);
      i = paramInt;
      if (this.nXP != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.nXP);
      i = i + e.a.a.b.b.a.o(8, this.nWW) + e.a.a.b.b.a.o(9, this.nXQ) + e.a.a.b.b.a.o(10, this.nWU) + e.a.a.b.b.a.bs(11, this.status) + e.a.a.b.b.a.bs(12, this.nXR);
      paramInt = i;
      if (this.nWX != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.nWX);
      i = paramInt;
      if (this.nSX != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.nSX);
      paramInt = i + e.a.a.b.b.a.bs(15, this.nXi);
      AppMethodBeat.o(56614);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56614);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        r localr = (r)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56614);
          break;
        case 1:
          localr.nXL = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 2:
          localr.nWR = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 3:
          localr.nXM = locala.BTU.ve();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 4:
          localr.nXN = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 5:
          localr.cRT = locala.BTU.vd();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 6:
          localr.nXO = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 7:
          localr.nXP = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 8:
          localr.nWW = locala.BTU.ve();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 9:
          localr.nXQ = locala.BTU.ve();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 10:
          localr.nWU = locala.BTU.ve();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 11:
          localr.status = locala.BTU.vd();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 12:
          localr.nXR = locala.BTU.vd();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 13:
          localr.nWX = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 14:
          localr.nSX = locala.BTU.readString();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        case 15:
          localr.nXi = locala.BTU.vd();
          AppMethodBeat.o(56614);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56614);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.r
 * JD-Core Version:    0.6.2
 */