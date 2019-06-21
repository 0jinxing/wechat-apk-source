package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abd extends com.tencent.mm.bt.a
{
  public String AesKey;
  public String Md5;
  public String wip;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51402);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Md5 != null)
        paramArrayOfObject.e(1, this.Md5);
      if (this.AesKey != null)
        paramArrayOfObject.e(2, this.AesKey);
      if (this.wip != null)
        paramArrayOfObject.e(3, this.wip);
      AppMethodBeat.o(51402);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Md5 == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.Md5) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.AesKey != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.AesKey);
      i = paramInt;
      if (this.wip != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wip);
      AppMethodBeat.o(51402);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51402);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abd localabd = (abd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51402);
          break;
        case 1:
          localabd.Md5 = locala.BTU.readString();
          AppMethodBeat.o(51402);
          paramInt = i;
          break;
        case 2:
          localabd.AesKey = locala.BTU.readString();
          AppMethodBeat.o(51402);
          paramInt = i;
          break;
        case 3:
          localabd.wip = locala.BTU.readString();
          AppMethodBeat.o(51402);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51402);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abd
 * JD-Core Version:    0.6.2
 */