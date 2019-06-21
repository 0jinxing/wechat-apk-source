package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bze extends com.tencent.mm.bt.a
{
  public String Title;
  public String URL;
  public String wdO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28655);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.URL != null)
        paramArrayOfObject.e(1, this.URL);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      AppMethodBeat.o(28655);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.URL == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.URL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.wdO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wdO);
      AppMethodBeat.o(28655);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28655);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bze localbze = (bze)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28655);
          break;
        case 1:
          localbze.URL = locala.BTU.readString();
          AppMethodBeat.o(28655);
          paramInt = i;
          break;
        case 2:
          localbze.Title = locala.BTU.readString();
          AppMethodBeat.o(28655);
          paramInt = i;
          break;
        case 3:
          localbze.wdO = locala.BTU.readString();
          AppMethodBeat.o(28655);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28655);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bze
 * JD-Core Version:    0.6.2
 */