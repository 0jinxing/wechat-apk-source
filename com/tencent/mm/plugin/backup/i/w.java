package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w extends com.tencent.mm.bt.a
{
  public String ID;
  public int Version;
  public int jBT;
  public com.tencent.mm.bt.b jBi;
  public int jCs;
  public int jCt;
  public int jCu;
  public com.tencent.mm.bt.b jCw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18071);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: ID");
        AppMethodBeat.o(18071);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.jCs);
      paramArrayOfObject.iz(2, this.jBT);
      if (this.ID != null)
        paramArrayOfObject.e(3, this.ID);
      if (this.jBi != null)
        paramArrayOfObject.c(4, this.jBi);
      paramArrayOfObject.iz(5, this.Version);
      paramArrayOfObject.iz(6, this.jCt);
      paramArrayOfObject.iz(7, this.jCu);
      if (this.jCw != null)
        paramArrayOfObject.c(8, this.jCw);
      AppMethodBeat.o(18071);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jCs) + 0 + e.a.a.b.b.a.bs(2, this.jBT);
        paramInt = i;
        if (this.ID != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.ID);
        i = paramInt;
        if (this.jBi != null)
          i = paramInt + e.a.a.b.b.a.b(4, this.jBi);
        i = i + e.a.a.b.b.a.bs(5, this.Version) + e.a.a.b.b.a.bs(6, this.jCt) + e.a.a.b.b.a.bs(7, this.jCu);
        paramInt = i;
        if (this.jCw != null)
          paramInt = i + e.a.a.b.b.a.b(8, this.jCw);
        AppMethodBeat.o(18071);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ID == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: ID");
          AppMethodBeat.o(18071);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18071);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        w localw = (w)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18071);
          break;
        case 1:
          localw.jCs = locala.BTU.vd();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 2:
          localw.jBT = locala.BTU.vd();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 3:
          localw.ID = locala.BTU.readString();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 4:
          localw.jBi = locala.BTU.emu();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 5:
          localw.Version = locala.BTU.vd();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 6:
          localw.jCt = locala.BTU.vd();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 7:
          localw.jCu = locala.BTU.vd();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        case 8:
          localw.jCw = locala.BTU.emu();
          AppMethodBeat.o(18071);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18071);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.w
 * JD-Core Version:    0.6.2
 */