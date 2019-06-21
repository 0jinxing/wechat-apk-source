package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v extends com.tencent.mm.bt.a
{
  public String ID;
  public int Version;
  public com.tencent.mm.bt.b jBi;
  public int jCs;
  public int jCt;
  public int jCu;
  public int jCv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18070);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: ID");
        AppMethodBeat.o(18070);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.jCs);
      if (this.ID != null)
        paramArrayOfObject.e(2, this.ID);
      if (this.jBi != null)
        paramArrayOfObject.c(3, this.jBi);
      paramArrayOfObject.iz(4, this.Version);
      paramArrayOfObject.iz(5, this.jCt);
      paramArrayOfObject.iz(6, this.jCu);
      paramArrayOfObject.iz(7, this.jCv);
      AppMethodBeat.o(18070);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jCs) + 0;
        paramInt = i;
        if (this.ID != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ID);
        i = paramInt;
        if (this.jBi != null)
          i = paramInt + e.a.a.b.b.a.b(3, this.jBi);
        paramInt = i + e.a.a.b.b.a.bs(4, this.Version) + e.a.a.b.b.a.bs(5, this.jCt) + e.a.a.b.b.a.bs(6, this.jCu) + e.a.a.b.b.a.bs(7, this.jCv);
        AppMethodBeat.o(18070);
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
          AppMethodBeat.o(18070);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18070);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        v localv = (v)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18070);
          break;
        case 1:
          localv.jCs = locala.BTU.vd();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 2:
          localv.ID = locala.BTU.readString();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 3:
          localv.jBi = locala.BTU.emu();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 4:
          localv.Version = locala.BTU.vd();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 5:
          localv.jCt = locala.BTU.vd();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 6:
          localv.jCu = locala.BTU.vd();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        case 7:
          localv.jCv = locala.BTU.vd();
          AppMethodBeat.o(18070);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18070);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.v
 * JD-Core Version:    0.6.2
 */