package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atu extends com.tencent.mm.bt.a
{
  public String Title;
  public String Url;
  public int jCt;
  public String ncH;
  public String vYK;
  public String wxR;
  public String wxS;
  public String wxT;
  public String wxU;
  public int wxV;
  public String wxW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28527);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.wxR != null)
        paramArrayOfObject.e(2, this.wxR);
      paramArrayOfObject.iz(3, this.jCt);
      if (this.Url != null)
        paramArrayOfObject.e(4, this.Url);
      if (this.wxS != null)
        paramArrayOfObject.e(5, this.wxS);
      if (this.vYK != null)
        paramArrayOfObject.e(6, this.vYK);
      if (this.wxT != null)
        paramArrayOfObject.e(7, this.wxT);
      if (this.ncH != null)
        paramArrayOfObject.e(8, this.ncH);
      if (this.wxU != null)
        paramArrayOfObject.e(9, this.wxU);
      paramArrayOfObject.iz(10, this.wxV);
      if (this.wxW != null)
        paramArrayOfObject.e(11, this.wxW);
      AppMethodBeat.o(28527);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label854;
    label854: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wxR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wxR);
      paramInt = i + e.a.a.b.b.a.bs(3, this.jCt);
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Url);
      paramInt = i;
      if (this.wxS != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wxS);
      i = paramInt;
      if (this.vYK != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vYK);
      paramInt = i;
      if (this.wxT != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wxT);
      i = paramInt;
      if (this.ncH != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.ncH);
      paramInt = i;
      if (this.wxU != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wxU);
      i = paramInt + e.a.a.b.b.a.bs(10, this.wxV);
      paramInt = i;
      if (this.wxW != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wxW);
      AppMethodBeat.o(28527);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28527);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atu localatu = (atu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28527);
          break;
        case 1:
          localatu.Title = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 2:
          localatu.wxR = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 3:
          localatu.jCt = locala.BTU.vd();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 4:
          localatu.Url = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 5:
          localatu.wxS = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 6:
          localatu.vYK = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 7:
          localatu.wxT = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 8:
          localatu.ncH = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 9:
          localatu.wxU = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 10:
          localatu.wxV = locala.BTU.vd();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        case 11:
          localatu.wxW = locala.BTU.readString();
          AppMethodBeat.o(28527);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28527);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atu
 * JD-Core Version:    0.6.2
 */