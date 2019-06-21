package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class te extends com.tencent.mm.bt.a
{
  public String appId;
  public String appName;
  public String version;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124304);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.appId != null)
        paramArrayOfObject.e(1, this.appId);
      if (this.appName != null)
        paramArrayOfObject.e(2, this.appName);
      if (this.version != null)
        paramArrayOfObject.e(3, this.version);
      AppMethodBeat.o(124304);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.appId == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.appId) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.appName != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.appName);
      i = paramInt;
      if (this.version != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.version);
      AppMethodBeat.o(124304);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124304);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        te localte = (te)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124304);
          break;
        case 1:
          localte.appId = locala.BTU.readString();
          AppMethodBeat.o(124304);
          paramInt = i;
          break;
        case 2:
          localte.appName = locala.BTU.readString();
          AppMethodBeat.o(124304);
          paramInt = i;
          break;
        case 3:
          localte.version = locala.BTU.readString();
          AppMethodBeat.o(124304);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124304);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.te
 * JD-Core Version:    0.6.2
 */