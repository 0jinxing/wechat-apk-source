package com.tencent.mm.plugin.j.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends com.tencent.mm.bt.a
{
  public String dtV;
  public int nuH;
  public String nuI;
  public String nuJ;
  public String nuK;
  public String nuL;
  public String nuM;
  public String nuN;
  public String nuO;
  public String nuP;
  public String nuQ;
  public String title;
  public String type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(21657);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.nuH);
      if (this.type != null)
        paramArrayOfObject.e(2, this.type);
      if (this.title != null)
        paramArrayOfObject.e(3, this.title);
      if (this.nuI != null)
        paramArrayOfObject.e(4, this.nuI);
      if (this.nuJ != null)
        paramArrayOfObject.e(5, this.nuJ);
      if (this.nuK != null)
        paramArrayOfObject.e(6, this.nuK);
      if (this.nuL != null)
        paramArrayOfObject.e(7, this.nuL);
      if (this.nuM != null)
        paramArrayOfObject.e(8, this.nuM);
      if (this.nuN != null)
        paramArrayOfObject.e(9, this.nuN);
      if (this.nuO != null)
        paramArrayOfObject.e(10, this.nuO);
      if (this.dtV != null)
        paramArrayOfObject.e(11, this.dtV);
      if (this.nuP != null)
        paramArrayOfObject.e(12, this.nuP);
      if (this.nuQ != null)
        paramArrayOfObject.e(13, this.nuQ);
      AppMethodBeat.o(21657);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.nuH) + 0;
        paramInt = i;
        if (this.type != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.type);
        i = paramInt;
        if (this.title != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.title);
        paramInt = i;
        if (this.nuI != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.nuI);
        i = paramInt;
        if (this.nuJ != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.nuJ);
        int j = i;
        if (this.nuK != null)
          j = i + e.a.a.b.b.a.f(6, this.nuK);
        paramInt = j;
        if (this.nuL != null)
          paramInt = j + e.a.a.b.b.a.f(7, this.nuL);
        i = paramInt;
        if (this.nuM != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.nuM);
        paramInt = i;
        if (this.nuN != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.nuN);
        i = paramInt;
        if (this.nuO != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.nuO);
        j = i;
        if (this.dtV != null)
          j = i + e.a.a.b.b.a.f(11, this.dtV);
        paramInt = j;
        if (this.nuP != null)
          paramInt = j + e.a.a.b.b.a.f(12, this.nuP);
        i = paramInt;
        if (this.nuQ != null)
          i = paramInt + e.a.a.b.b.a.f(13, this.nuQ);
        AppMethodBeat.o(21657);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(21657);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(21657);
          break;
        case 1:
          localb.nuH = locala.BTU.vd();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 2:
          localb.type = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 3:
          localb.title = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 4:
          localb.nuI = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 5:
          localb.nuJ = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 6:
          localb.nuK = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 7:
          localb.nuL = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 8:
          localb.nuM = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 9:
          localb.nuN = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 10:
          localb.nuO = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 11:
          localb.dtV = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 12:
          localb.nuP = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        case 13:
          localb.nuQ = locala.BTU.readString();
          AppMethodBeat.o(21657);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(21657);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.j.a.b
 * JD-Core Version:    0.6.2
 */