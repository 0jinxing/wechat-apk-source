package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends com.tencent.mm.bt.a
{
  public boolean kLB;
  public String kLC;
  public String kLD;
  public String kLE;
  public int kLF;
  public boolean kLG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35537);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.kLB);
      if (this.kLC != null)
        paramArrayOfObject.e(2, this.kLC);
      if (this.kLD != null)
        paramArrayOfObject.e(3, this.kLD);
      if (this.kLE != null)
        paramArrayOfObject.e(4, this.kLE);
      paramArrayOfObject.iz(5, this.kLF);
      paramArrayOfObject.aO(6, this.kLG);
      AppMethodBeat.o(35537);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0;
        paramInt = i;
        if (this.kLC != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.kLC);
        i = paramInt;
        if (this.kLD != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.kLD);
        paramInt = i;
        if (this.kLE != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.kLE);
        paramInt = paramInt + e.a.a.b.b.a.bs(5, this.kLF) + (e.a.a.b.b.a.fv(6) + 1);
        AppMethodBeat.o(35537);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35537);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35537);
          break;
        case 1:
          localk.kLB = locala.BTU.ehX();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        case 2:
          localk.kLC = locala.BTU.readString();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        case 3:
          localk.kLD = locala.BTU.readString();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        case 4:
          localk.kLE = locala.BTU.readString();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        case 5:
          localk.kLF = locala.BTU.vd();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        case 6:
          localk.kLG = locala.BTU.ehX();
          AppMethodBeat.o(35537);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(35537);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.k
 * JD-Core Version:    0.6.2
 */