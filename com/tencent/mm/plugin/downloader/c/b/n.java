package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends com.tencent.mm.bt.a
{
  public String egm;
  public int kLK;
  public String kLL;
  public String kLM;
  public String kLN;
  public String kLO;
  public int kLP;
  public String kLQ;
  public String kLR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35540);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.kLK);
      if (this.egm != null)
        paramArrayOfObject.e(2, this.egm);
      if (this.kLL != null)
        paramArrayOfObject.e(3, this.kLL);
      if (this.kLM != null)
        paramArrayOfObject.e(4, this.kLM);
      if (this.kLN != null)
        paramArrayOfObject.e(5, this.kLN);
      if (this.kLO != null)
        paramArrayOfObject.e(6, this.kLO);
      paramArrayOfObject.iz(7, this.kLP);
      if (this.kLQ != null)
        paramArrayOfObject.e(8, this.kLQ);
      if (this.kLR != null)
        paramArrayOfObject.e(9, this.kLR);
      AppMethodBeat.o(35540);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.kLK) + 0;
        int i = paramInt;
        if (this.egm != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.egm);
        paramInt = i;
        if (this.kLL != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.kLL);
        i = paramInt;
        if (this.kLM != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.kLM);
        paramInt = i;
        if (this.kLN != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.kLN);
        i = paramInt;
        if (this.kLO != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.kLO);
        i += e.a.a.b.b.a.bs(7, this.kLP);
        paramInt = i;
        if (this.kLQ != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.kLQ);
        i = paramInt;
        if (this.kLR != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.kLR);
        AppMethodBeat.o(35540);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35540);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35540);
          break;
        case 1:
          localn.kLK = locala.BTU.vd();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 2:
          localn.egm = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 3:
          localn.kLL = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 4:
          localn.kLM = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 5:
          localn.kLN = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 6:
          localn.kLO = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 7:
          localn.kLP = locala.BTU.vd();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 8:
          localn.kLQ = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        case 9:
          localn.kLR = locala.BTU.readString();
          AppMethodBeat.o(35540);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(35540);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.n
 * JD-Core Version:    0.6.2
 */