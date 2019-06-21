package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t extends com.tencent.mm.bt.a
{
  public String fKh;
  public String mZo;
  public int nam;
  public int nan;
  public int nao;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111557);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.nam);
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.nan);
      if (this.mZo != null)
        paramArrayOfObject.e(4, this.mZo);
      paramArrayOfObject.iz(5, this.nao);
      AppMethodBeat.o(111557);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.nam) + 0;
        paramInt = i;
        if (this.fKh != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
        i = paramInt + e.a.a.b.b.a.bs(3, this.nan);
        paramInt = i;
        if (this.mZo != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.mZo);
        paramInt += e.a.a.b.b.a.bs(5, this.nao);
        AppMethodBeat.o(111557);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111557);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        t localt = (t)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111557);
          break;
        case 1:
          localt.nam = locala.BTU.vd();
          AppMethodBeat.o(111557);
          paramInt = 0;
          break;
        case 2:
          localt.fKh = locala.BTU.readString();
          AppMethodBeat.o(111557);
          paramInt = 0;
          break;
        case 3:
          localt.nan = locala.BTU.vd();
          AppMethodBeat.o(111557);
          paramInt = 0;
          break;
        case 4:
          localt.mZo = locala.BTU.readString();
          AppMethodBeat.o(111557);
          paramInt = 0;
          break;
        case 5:
          localt.nao = locala.BTU.vd();
          AppMethodBeat.o(111557);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111557);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.t
 * JD-Core Version:    0.6.2
 */