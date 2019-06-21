package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class fu extends com.tencent.mm.bt.a
{
  public String scope;
  public int state;
  public String vHE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102369);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.scope != null)
        paramArrayOfObject.e(1, this.scope);
      if (this.vHE != null)
        paramArrayOfObject.e(2, this.vHE);
      paramArrayOfObject.iz(3, this.state);
      AppMethodBeat.o(102369);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.scope == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.scope) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vHE != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vHE);
      paramInt = i + e.a.a.b.b.a.bs(3, this.state);
      AppMethodBeat.o(102369);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102369);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        fu localfu = (fu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102369);
          break;
        case 1:
          localfu.scope = locala.BTU.readString();
          AppMethodBeat.o(102369);
          paramInt = i;
          break;
        case 2:
          localfu.vHE = locala.BTU.readString();
          AppMethodBeat.o(102369);
          paramInt = i;
          break;
        case 3:
          localfu.state = locala.BTU.vd();
          AppMethodBeat.o(102369);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102369);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fu
 * JD-Core Version:    0.6.2
 */