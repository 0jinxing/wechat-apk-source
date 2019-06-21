package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gz extends com.tencent.mm.bt.a
{
  public String nuL;
  public String pbn;
  public String pbo;
  public String tuk;
  public String vJB;
  public String vJC;
  public String vJD;
  public String vJE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56708);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJB != null)
        paramArrayOfObject.e(1, this.vJB);
      if (this.tuk != null)
        paramArrayOfObject.e(2, this.tuk);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.pbo != null)
        paramArrayOfObject.e(4, this.pbo);
      if (this.nuL != null)
        paramArrayOfObject.e(5, this.nuL);
      if (this.vJC != null)
        paramArrayOfObject.e(6, this.vJC);
      if (this.vJD != null)
        paramArrayOfObject.e(7, this.vJD);
      if (this.vJE != null)
        paramArrayOfObject.e(8, this.vJE);
      AppMethodBeat.o(56708);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJB == null)
        break label676;
    label676: for (i = e.a.a.b.b.a.f(1, this.vJB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.tuk != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.tuk);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pbn);
      paramInt = i;
      if (this.pbo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pbo);
      i = paramInt;
      if (this.nuL != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.nuL);
      paramInt = i;
      if (this.vJC != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vJC);
      i = paramInt;
      if (this.vJD != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vJD);
      paramInt = i;
      if (this.vJE != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vJE);
      AppMethodBeat.o(56708);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56708);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gz localgz = (gz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56708);
          break;
        case 1:
          localgz.vJB = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 2:
          localgz.tuk = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 3:
          localgz.pbn = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 4:
          localgz.pbo = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 5:
          localgz.nuL = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 6:
          localgz.vJC = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 7:
          localgz.vJD = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        case 8:
          localgz.vJE = locala.BTU.readString();
          AppMethodBeat.o(56708);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56708);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gz
 * JD-Core Version:    0.6.2
 */