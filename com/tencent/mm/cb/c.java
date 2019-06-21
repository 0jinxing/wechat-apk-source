package com.tencent.mm.cb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends com.tencent.mm.bt.a
{
  public int coc;
  public int jik;
  public int jil;
  public int jim;
  public int size;
  public int xFV = -1;
  public int xFW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62664);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jik);
      paramArrayOfObject.iz(2, this.jil);
      paramArrayOfObject.iz(3, this.jim);
      paramArrayOfObject.iz(41, this.xFV);
      paramArrayOfObject.iz(5, this.xFW);
      paramArrayOfObject.iz(6, this.coc);
      paramArrayOfObject.iz(7, this.size);
      AppMethodBeat.o(62664);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.jik) + 0 + e.a.a.b.b.a.bs(2, this.jil) + e.a.a.b.b.a.bs(3, this.jim) + e.a.a.b.b.a.bs(41, this.xFV) + e.a.a.b.b.a.bs(5, this.xFW) + e.a.a.b.b.a.bs(6, this.coc) + e.a.a.b.b.a.bs(7, this.size);
        AppMethodBeat.o(62664);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62664);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62664);
          break;
        case 1:
          localc.jik = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 2:
          localc.jil = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 3:
          localc.jim = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 41:
          localc.xFV = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 5:
          localc.xFW = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 6:
          localc.coc = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        case 7:
          localc.size = locala.BTU.vd();
          AppMethodBeat.o(62664);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62664);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.c
 * JD-Core Version:    0.6.2
 */