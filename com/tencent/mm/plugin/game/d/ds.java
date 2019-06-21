package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ds extends com.tencent.mm.bt.a
{
  public String nac;
  public String ndR;
  public String ndS;
  public String ndT;
  public String ndU;
  public int ndV;
  public String ndW;
  public String ndX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111683);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nac != null)
        paramArrayOfObject.e(1, this.nac);
      if (this.ndR != null)
        paramArrayOfObject.e(2, this.ndR);
      if (this.ndS != null)
        paramArrayOfObject.e(3, this.ndS);
      if (this.ndT != null)
        paramArrayOfObject.e(4, this.ndT);
      if (this.ndU != null)
        paramArrayOfObject.e(5, this.ndU);
      paramArrayOfObject.iz(6, this.ndV);
      if (this.ndW != null)
        paramArrayOfObject.e(7, this.ndW);
      if (this.ndX != null)
        paramArrayOfObject.e(8, this.ndX);
      AppMethodBeat.o(111683);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nac == null)
        break label660;
    label660: for (i = e.a.a.b.b.a.f(1, this.nac) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndR != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndR);
      i = paramInt;
      if (this.ndS != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndS);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndT);
      i = paramInt;
      if (this.ndU != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ndU);
      i += e.a.a.b.b.a.bs(6, this.ndV);
      paramInt = i;
      if (this.ndW != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ndW);
      i = paramInt;
      if (this.ndX != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.ndX);
      AppMethodBeat.o(111683);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111683);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ds localds = (ds)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111683);
          break;
        case 1:
          localds.nac = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 2:
          localds.ndR = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 3:
          localds.ndS = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 4:
          localds.ndT = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 5:
          localds.ndU = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 6:
          localds.ndV = locala.BTU.vd();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 7:
          localds.ndW = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        case 8:
          localds.ndX = locala.BTU.readString();
          AppMethodBeat.o(111683);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111683);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ds
 * JD-Core Version:    0.6.2
 */