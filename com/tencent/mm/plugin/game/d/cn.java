package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cn extends com.tencent.mm.bt.a
{
  public String Desc;
  public String mZj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111651);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Desc != null)
        paramArrayOfObject.e(1, this.Desc);
      if (this.mZj != null)
        paramArrayOfObject.e(2, this.mZj);
      AppMethodBeat.o(111651);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Desc == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.Desc) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZj);
      AppMethodBeat.o(111651);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111651);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cn localcn = (cn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111651);
          paramInt = -1;
          break;
        case 1:
          localcn.Desc = locala.BTU.readString();
          AppMethodBeat.o(111651);
          paramInt = i;
          break;
        case 2:
          localcn.mZj = locala.BTU.readString();
          AppMethodBeat.o(111651);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111651);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cn
 * JD-Core Version:    0.6.2
 */