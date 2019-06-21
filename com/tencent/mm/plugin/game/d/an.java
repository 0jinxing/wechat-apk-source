package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class an extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String fKh;
  public String mZj;
  public String nbe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111580);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbe != null)
        paramArrayOfObject.e(1, this.nbe);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      if (this.mZj != null)
        paramArrayOfObject.e(4, this.mZj);
      if (this.fKh != null)
        paramArrayOfObject.e(5, this.fKh);
      AppMethodBeat.o(111580);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nbe == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.nbe) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Desc);
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mZj);
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.fKh);
      AppMethodBeat.o(111580);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111580);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        an localan = (an)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111580);
          break;
        case 1:
          localan.nbe = locala.BTU.readString();
          AppMethodBeat.o(111580);
          paramInt = i;
          break;
        case 2:
          localan.Title = locala.BTU.readString();
          AppMethodBeat.o(111580);
          paramInt = i;
          break;
        case 3:
          localan.Desc = locala.BTU.readString();
          AppMethodBeat.o(111580);
          paramInt = i;
          break;
        case 4:
          localan.mZj = locala.BTU.readString();
          AppMethodBeat.o(111580);
          paramInt = i;
          break;
        case 5:
          localan.fKh = locala.BTU.readString();
          AppMethodBeat.o(111580);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111580);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.an
 * JD-Core Version:    0.6.2
 */