package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ck extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String mZi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111648);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.mZi != null)
        paramArrayOfObject.e(2, this.mZi);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      AppMethodBeat.o(111648);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZi != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZi);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Desc);
      AppMethodBeat.o(111648);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111648);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ck localck = (ck)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111648);
          break;
        case 1:
          localck.Title = locala.BTU.readString();
          AppMethodBeat.o(111648);
          paramInt = i;
          break;
        case 2:
          localck.mZi = locala.BTU.readString();
          AppMethodBeat.o(111648);
          paramInt = i;
          break;
        case 3:
          localck.Desc = locala.BTU.readString();
          AppMethodBeat.o(111648);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111648);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ck
 * JD-Core Version:    0.6.2
 */