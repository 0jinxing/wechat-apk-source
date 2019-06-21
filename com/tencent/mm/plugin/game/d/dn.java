package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dn extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String mZi;
  public String ndH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111680);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.ndH != null)
        paramArrayOfObject.e(3, this.ndH);
      if (this.mZi != null)
        paramArrayOfObject.e(4, this.mZi);
      AppMethodBeat.o(111680);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Desc);
      paramInt = i;
      if (this.ndH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ndH);
      i = paramInt;
      if (this.mZi != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZi);
      AppMethodBeat.o(111680);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111680);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dn localdn = (dn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111680);
          break;
        case 1:
          localdn.Title = locala.BTU.readString();
          AppMethodBeat.o(111680);
          paramInt = i;
          break;
        case 2:
          localdn.Desc = locala.BTU.readString();
          AppMethodBeat.o(111680);
          paramInt = i;
          break;
        case 3:
          localdn.ndH = locala.BTU.readString();
          AppMethodBeat.o(111680);
          paramInt = i;
          break;
        case 4:
          localdn.mZi = locala.BTU.readString();
          AppMethodBeat.o(111680);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111680);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dn
 * JD-Core Version:    0.6.2
 */