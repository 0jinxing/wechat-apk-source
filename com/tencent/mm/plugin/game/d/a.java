package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class a extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String mZi;
  public String mZj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111542);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111542);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.mZi != null)
        paramArrayOfObject.e(3, this.mZi);
      if (this.mZj != null)
        paramArrayOfObject.e(4, this.mZj);
      AppMethodBeat.o(111542);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label468;
    label468: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Desc);
      paramInt = i;
      if (this.mZi != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZi);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZj);
      AppMethodBeat.o(111542);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111542);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111542);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        a locala1 = (a)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111542);
          break;
        case 1:
          locala1.Title = locala.BTU.readString();
          AppMethodBeat.o(111542);
          paramInt = i;
          break;
        case 2:
          locala1.Desc = locala.BTU.readString();
          AppMethodBeat.o(111542);
          paramInt = i;
          break;
        case 3:
          locala1.mZi = locala.BTU.readString();
          AppMethodBeat.o(111542);
          paramInt = i;
          break;
        case 4:
          locala1.mZj = locala.BTU.readString();
          AppMethodBeat.o(111542);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111542);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.a
 * JD-Core Version:    0.6.2
 */