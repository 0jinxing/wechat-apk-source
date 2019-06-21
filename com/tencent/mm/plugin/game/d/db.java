package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class db extends com.tencent.mm.bt.a
{
  public String Title;
  public String mZi;
  public String mZj;
  public int ndC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111669);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.mZj != null)
        paramArrayOfObject.e(2, this.mZj);
      if (this.mZi != null)
        paramArrayOfObject.e(3, this.mZi);
      paramArrayOfObject.iz(4, this.ndC);
      AppMethodBeat.o(111669);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZj);
      i = paramInt;
      if (this.mZi != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZi);
      paramInt = i + e.a.a.b.b.a.bs(4, this.ndC);
      AppMethodBeat.o(111669);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111669);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        db localdb = (db)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111669);
          break;
        case 1:
          localdb.Title = locala.BTU.readString();
          AppMethodBeat.o(111669);
          paramInt = i;
          break;
        case 2:
          localdb.mZj = locala.BTU.readString();
          AppMethodBeat.o(111669);
          paramInt = i;
          break;
        case 3:
          localdb.mZi = locala.BTU.readString();
          AppMethodBeat.o(111669);
          paramInt = i;
          break;
        case 4:
          localdb.ndC = locala.BTU.vd();
          AppMethodBeat.o(111669);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111669);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.db
 * JD-Core Version:    0.6.2
 */