package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chm extends com.tencent.mm.bt.a
{
  public String activityName = "";
  public String wkp = "";

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73661);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.activityName != null)
        paramArrayOfObject.e(1, this.activityName);
      if (this.wkp != null)
        paramArrayOfObject.e(2, this.wkp);
      AppMethodBeat.o(73661);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.activityName == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.activityName) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wkp != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wkp);
      AppMethodBeat.o(73661);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73661);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chm localchm = (chm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(73661);
          paramInt = -1;
          break;
        case 1:
          localchm.activityName = locala.BTU.readString();
          AppMethodBeat.o(73661);
          paramInt = i;
          break;
        case 2:
          localchm.wkp = locala.BTU.readString();
          AppMethodBeat.o(73661);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(73661);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chm
 * JD-Core Version:    0.6.2
 */