package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cz extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String mZj;
  public String ndw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111667);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndw != null)
        paramArrayOfObject.e(1, this.ndw);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      if (this.mZj != null)
        paramArrayOfObject.e(3, this.mZj);
      AppMethodBeat.o(111667);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndw == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.ndw) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.IconUrl);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZj);
      AppMethodBeat.o(111667);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111667);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cz localcz = (cz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111667);
          break;
        case 1:
          localcz.ndw = locala.BTU.readString();
          AppMethodBeat.o(111667);
          paramInt = i;
          break;
        case 2:
          localcz.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(111667);
          paramInt = i;
          break;
        case 3:
          localcz.mZj = locala.BTU.readString();
          AppMethodBeat.o(111667);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111667);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cz
 * JD-Core Version:    0.6.2
 */