package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cmc extends com.tencent.mm.bt.a
{
  public String qkh;
  public int qki;
  public String scope;
  public int state;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127737);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.scope != null)
        paramArrayOfObject.e(1, this.scope);
      if (this.qkh != null)
        paramArrayOfObject.e(2, this.qkh);
      paramArrayOfObject.iz(3, this.state);
      paramArrayOfObject.iz(4, this.qki);
      AppMethodBeat.o(127737);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.scope == null)
        break label384;
    label384: for (paramInt = e.a.a.b.b.a.f(1, this.scope) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.qkh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.qkh);
      paramInt = i + e.a.a.b.b.a.bs(3, this.state) + e.a.a.b.b.a.bs(4, this.qki);
      AppMethodBeat.o(127737);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(127737);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmc localcmc = (cmc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127737);
          break;
        case 1:
          localcmc.scope = locala.BTU.readString();
          AppMethodBeat.o(127737);
          paramInt = i;
          break;
        case 2:
          localcmc.qkh = locala.BTU.readString();
          AppMethodBeat.o(127737);
          paramInt = i;
          break;
        case 3:
          localcmc.state = locala.BTU.vd();
          AppMethodBeat.o(127737);
          paramInt = i;
          break;
        case 4:
          localcmc.qki = locala.BTU.vd();
          AppMethodBeat.o(127737);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127737);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmc
 * JD-Core Version:    0.6.2
 */