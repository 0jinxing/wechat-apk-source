package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends com.tencent.mm.bt.a
{
  public String fMh;
  public String lang;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(78442);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fMh != null)
        paramArrayOfObject.e(1, this.fMh);
      if (this.lang != null)
        paramArrayOfObject.e(2, this.lang);
      AppMethodBeat.o(78442);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fMh == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.fMh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.lang != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.lang);
      AppMethodBeat.o(78442);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(78442);
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
          AppMethodBeat.o(78442);
          paramInt = -1;
          break;
        case 1:
          locale.fMh = locala.BTU.readString();
          AppMethodBeat.o(78442);
          paramInt = i;
          break;
        case 2:
          locale.lang = locala.BTU.readString();
          AppMethodBeat.o(78442);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(78442);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.e
 * JD-Core Version:    0.6.2
 */