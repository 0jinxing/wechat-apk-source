package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends com.tencent.mm.bt.a
{
  public String fjD;
  public String name;
  public String tmN;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56646);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.tmN != null)
        paramArrayOfObject.e(3, this.tmN);
      if (this.fjD != null)
        paramArrayOfObject.e(4, this.fjD);
      AppMethodBeat.o(56646);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label416;
    label416: for (i = e.a.a.b.b.a.f(1, this.url) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.name != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.name);
      i = paramInt;
      if (this.tmN != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.tmN);
      paramInt = i;
      if (this.fjD != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fjD);
      AppMethodBeat.o(56646);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56646);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56646);
          break;
        case 1:
          locale.url = locala.BTU.readString();
          AppMethodBeat.o(56646);
          paramInt = i;
          break;
        case 2:
          locale.name = locala.BTU.readString();
          AppMethodBeat.o(56646);
          paramInt = i;
          break;
        case 3:
          locale.tmN = locala.BTU.readString();
          AppMethodBeat.o(56646);
          paramInt = i;
          break;
        case 4:
          locale.fjD = locala.BTU.readString();
          AppMethodBeat.o(56646);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56646);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.e
 * JD-Core Version:    0.6.2
 */