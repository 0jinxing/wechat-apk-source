package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class arn extends com.tencent.mm.bt.a
{
  public String CellTitle;
  public String wvA;
  public String wvz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80104);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.CellTitle != null)
        paramArrayOfObject.e(1, this.CellTitle);
      if (this.wvz != null)
        paramArrayOfObject.e(2, this.wvz);
      if (this.wvA != null)
        paramArrayOfObject.e(3, this.wvA);
      AppMethodBeat.o(80104);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.CellTitle == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.CellTitle) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wvz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wvz);
      i = paramInt;
      if (this.wvA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wvA);
      AppMethodBeat.o(80104);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80104);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        arn localarn = (arn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80104);
          break;
        case 1:
          localarn.CellTitle = locala.BTU.readString();
          AppMethodBeat.o(80104);
          paramInt = i;
          break;
        case 2:
          localarn.wvz = locala.BTU.readString();
          AppMethodBeat.o(80104);
          paramInt = i;
          break;
        case 3:
          localarn.wvA = locala.BTU.readString();
          AppMethodBeat.o(80104);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80104);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arn
 * JD-Core Version:    0.6.2
 */