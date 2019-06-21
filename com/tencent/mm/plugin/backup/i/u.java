package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u extends com.tencent.mm.bt.a
{
  public String cHr;
  public String dJC;
  public int jCp;
  public int jCq;
  public long jCr;
  public String path;
  public int type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18069);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCp);
      if (this.dJC != null)
        paramArrayOfObject.e(2, this.dJC);
      if (this.cHr != null)
        paramArrayOfObject.e(3, this.cHr);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      paramArrayOfObject.iz(5, this.type);
      paramArrayOfObject.iz(6, this.jCq);
      paramArrayOfObject.ai(7, this.jCr);
      AppMethodBeat.o(18069);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.jCp) + 0;
        int i = paramInt;
        if (this.dJC != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.dJC);
        paramInt = i;
        if (this.cHr != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.cHr);
        i = paramInt;
        if (this.path != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.path);
        paramInt = i + e.a.a.b.b.a.bs(5, this.type) + e.a.a.b.b.a.bs(6, this.jCq) + e.a.a.b.b.a.o(7, this.jCr);
        AppMethodBeat.o(18069);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18069);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        u localu = (u)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18069);
          break;
        case 1:
          localu.jCp = locala.BTU.vd();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 2:
          localu.dJC = locala.BTU.readString();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 3:
          localu.cHr = locala.BTU.readString();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 4:
          localu.path = locala.BTU.readString();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 5:
          localu.type = locala.BTU.vd();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 6:
          localu.jCq = locala.BTU.vd();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        case 7:
          localu.jCr = locala.BTU.ve();
          AppMethodBeat.o(18069);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18069);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.u
 * JD-Core Version:    0.6.2
 */