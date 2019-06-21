package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class da extends com.tencent.mm.bt.a
{
  public String mZm;
  public String mZs;
  public boolean ndA;
  public boolean ndB;
  public String ndx;
  public String ndy;
  public String ndz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111668);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZs != null)
        paramArrayOfObject.e(1, this.mZs);
      if (this.ndx != null)
        paramArrayOfObject.e(2, this.ndx);
      if (this.ndy != null)
        paramArrayOfObject.e(3, this.ndy);
      if (this.ndz != null)
        paramArrayOfObject.e(4, this.ndz);
      if (this.mZm != null)
        paramArrayOfObject.e(5, this.mZm);
      paramArrayOfObject.aO(6, this.ndA);
      paramArrayOfObject.aO(7, this.ndB);
      AppMethodBeat.o(111668);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZs == null)
        break label573;
    label573: for (i = e.a.a.b.b.a.f(1, this.mZs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndx != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndx);
      i = paramInt;
      if (this.ndy != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndy);
      paramInt = i;
      if (this.ndz != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndz);
      i = paramInt;
      if (this.mZm != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.mZm);
      paramInt = i + (e.a.a.b.b.a.fv(6) + 1) + (e.a.a.b.b.a.fv(7) + 1);
      AppMethodBeat.o(111668);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111668);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        da localda = (da)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111668);
          break;
        case 1:
          localda.mZs = locala.BTU.readString();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 2:
          localda.ndx = locala.BTU.readString();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 3:
          localda.ndy = locala.BTU.readString();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 4:
          localda.ndz = locala.BTU.readString();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 5:
          localda.mZm = locala.BTU.readString();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 6:
          localda.ndA = locala.BTU.ehX();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        case 7:
          localda.ndB = locala.BTU.ehX();
          AppMethodBeat.o(111668);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111668);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.da
 * JD-Core Version:    0.6.2
 */