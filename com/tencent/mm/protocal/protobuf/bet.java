package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bet extends com.tencent.mm.bt.a
{
  public String desc;
  public int id;
  public String nickname;
  public String wrK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10226);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.nickname != null)
        paramArrayOfObject.e(2, this.nickname);
      if (this.wrK != null)
        paramArrayOfObject.e(3, this.wrK);
      if (this.desc != null)
        paramArrayOfObject.e(4, this.desc);
      AppMethodBeat.o(10226);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.nickname != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.nickname);
        i = paramInt;
        if (this.wrK != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wrK);
        paramInt = i;
        if (this.desc != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.desc);
        AppMethodBeat.o(10226);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10226);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bet localbet = (bet)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10226);
          break;
        case 1:
          localbet.id = locala.BTU.vd();
          AppMethodBeat.o(10226);
          paramInt = 0;
          break;
        case 2:
          localbet.nickname = locala.BTU.readString();
          AppMethodBeat.o(10226);
          paramInt = 0;
          break;
        case 3:
          localbet.wrK = locala.BTU.readString();
          AppMethodBeat.o(10226);
          paramInt = 0;
          break;
        case 4:
          localbet.desc = locala.BTU.readString();
          AppMethodBeat.o(10226);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(10226);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bet
 * JD-Core Version:    0.6.2
 */