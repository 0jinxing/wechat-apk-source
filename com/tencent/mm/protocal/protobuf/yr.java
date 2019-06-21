package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class yr extends com.tencent.mm.bt.a
{
  public int score;
  public String vGv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(114959);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.score);
      if (this.vGv != null)
        paramArrayOfObject.e(2, this.vGv);
      AppMethodBeat.o(114959);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.score) + 0;
        paramInt = i;
        if (this.vGv != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vGv);
        AppMethodBeat.o(114959);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114959);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        yr localyr = (yr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(114959);
          paramInt = -1;
          break;
        case 1:
          localyr.score = locala.BTU.vd();
          AppMethodBeat.o(114959);
          paramInt = 0;
          break;
        case 2:
          localyr.vGv = locala.BTU.readString();
          AppMethodBeat.o(114959);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(114959);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yr
 * JD-Core Version:    0.6.2
 */