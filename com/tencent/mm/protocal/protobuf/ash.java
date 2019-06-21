package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ash extends com.tencent.mm.bt.a
{
  public String nSa;
  public String nickname;
  public String username;
  public long wvQ;
  public long wvR;
  public int wvS;
  public String wvT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56842);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.wvQ);
      paramArrayOfObject.ai(2, this.wvR);
      if (this.nickname != null)
        paramArrayOfObject.e(3, this.nickname);
      if (this.nSa != null)
        paramArrayOfObject.e(4, this.nSa);
      paramArrayOfObject.iz(5, this.wvS);
      if (this.username != null)
        paramArrayOfObject.e(6, this.username);
      if (this.wvT != null)
        paramArrayOfObject.e(7, this.wvT);
      AppMethodBeat.o(56842);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.wvQ) + 0 + e.a.a.b.b.a.o(2, this.wvR);
        paramInt = i;
        if (this.nickname != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.nickname);
        i = paramInt;
        if (this.nSa != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.nSa);
        i += e.a.a.b.b.a.bs(5, this.wvS);
        paramInt = i;
        if (this.username != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.username);
        i = paramInt;
        if (this.wvT != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.wvT);
        AppMethodBeat.o(56842);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56842);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ash localash = (ash)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56842);
          break;
        case 1:
          localash.wvQ = locala.BTU.ve();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 2:
          localash.wvR = locala.BTU.ve();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 3:
          localash.nickname = locala.BTU.readString();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 4:
          localash.nSa = locala.BTU.readString();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 5:
          localash.wvS = locala.BTU.vd();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 6:
          localash.username = locala.BTU.readString();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        case 7:
          localash.wvT = locala.BTU.readString();
          AppMethodBeat.o(56842);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56842);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ash
 * JD-Core Version:    0.6.2
 */