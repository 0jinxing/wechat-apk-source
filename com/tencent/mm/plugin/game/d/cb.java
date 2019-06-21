package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cb extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String Title;
  public String mZj;
  public String ncO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111636);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      if (this.mZj != null)
        paramArrayOfObject.e(3, this.mZj);
      if (this.ncO != null)
        paramArrayOfObject.e(4, this.ncO);
      AppMethodBeat.o(111636);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.IconUrl);
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZj);
      i = paramInt;
      if (this.ncO != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ncO);
      AppMethodBeat.o(111636);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111636);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cb localcb = (cb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111636);
          break;
        case 1:
          localcb.Title = locala.BTU.readString();
          AppMethodBeat.o(111636);
          paramInt = i;
          break;
        case 2:
          localcb.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(111636);
          paramInt = i;
          break;
        case 3:
          localcb.mZj = locala.BTU.readString();
          AppMethodBeat.o(111636);
          paramInt = i;
          break;
        case 4:
          localcb.ncO = locala.BTU.readString();
          AppMethodBeat.o(111636);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111636);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cb
 * JD-Core Version:    0.6.2
 */