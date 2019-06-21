package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class hb extends com.tencent.mm.bt.a
{
  public String kmu;
  public String nuL;
  public String pbn;
  public String tuk;
  public String vJG;
  public String vJH;
  public String vJI;
  public boolean vJJ;
  public String vJK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48775);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nuL != null)
        paramArrayOfObject.e(1, this.nuL);
      if (this.pbn != null)
        paramArrayOfObject.e(2, this.pbn);
      if (this.kmu != null)
        paramArrayOfObject.e(3, this.kmu);
      if (this.tuk != null)
        paramArrayOfObject.e(4, this.tuk);
      if (this.vJG != null)
        paramArrayOfObject.e(5, this.vJG);
      if (this.vJH != null)
        paramArrayOfObject.e(6, this.vJH);
      if (this.vJI != null)
        paramArrayOfObject.e(8, this.vJI);
      paramArrayOfObject.aO(9, this.vJJ);
      if (this.vJK != null)
        paramArrayOfObject.e(10, this.vJK);
      AppMethodBeat.o(48775);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nuL == null)
        break label727;
    label727: for (i = e.a.a.b.b.a.f(1, this.nuL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pbn);
      i = paramInt;
      if (this.kmu != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kmu);
      paramInt = i;
      if (this.tuk != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tuk);
      i = paramInt;
      if (this.vJG != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vJG);
      paramInt = i;
      if (this.vJH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vJH);
      i = paramInt;
      if (this.vJI != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vJI);
      i += e.a.a.b.b.a.fv(9) + 1;
      paramInt = i;
      if (this.vJK != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vJK);
      AppMethodBeat.o(48775);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48775);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hb localhb = (hb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 7:
        default:
          paramInt = -1;
          AppMethodBeat.o(48775);
          break;
        case 1:
          localhb.nuL = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 2:
          localhb.pbn = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 3:
          localhb.kmu = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 4:
          localhb.tuk = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 5:
          localhb.vJG = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 6:
          localhb.vJH = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 8:
          localhb.vJI = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 9:
          localhb.vJJ = locala.BTU.ehX();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        case 10:
          localhb.vJK = locala.BTU.readString();
          AppMethodBeat.o(48775);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48775);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hb
 * JD-Core Version:    0.6.2
 */