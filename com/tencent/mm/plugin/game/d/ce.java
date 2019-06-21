package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ce extends com.tencent.mm.bt.a
{
  public String Title;
  public String mZm;
  public String mZs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111640);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconURL");
        AppMethodBeat.o(111640);
        throw paramArrayOfObject;
      }
      if (this.mZs != null)
        paramArrayOfObject.e(1, this.mZs);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.mZm != null)
        paramArrayOfObject.e(3, this.mZm);
      AppMethodBeat.o(111640);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZs == null)
        break label405;
    label405: for (i = e.a.a.b.b.a.f(1, this.mZs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.mZm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZm);
      AppMethodBeat.o(111640);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconURL");
          AppMethodBeat.o(111640);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111640);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ce localce = (ce)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111640);
          break;
        case 1:
          localce.mZs = locala.BTU.readString();
          AppMethodBeat.o(111640);
          paramInt = i;
          break;
        case 2:
          localce.Title = locala.BTU.readString();
          AppMethodBeat.o(111640);
          paramInt = i;
          break;
        case 3:
          localce.mZm = locala.BTU.readString();
          AppMethodBeat.o(111640);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111640);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ce
 * JD-Core Version:    0.6.2
 */