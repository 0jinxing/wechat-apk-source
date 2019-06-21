package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bxi extends com.tencent.mm.bt.a
{
  public String nickname;
  public String username;
  public boolean wXq;
  public String wrK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114983);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.aO(2, this.wXq);
      if (this.nickname != null)
        paramArrayOfObject.e(3, this.nickname);
      if (this.wrK != null)
        paramArrayOfObject.e(4, this.wrK);
      AppMethodBeat.o(114983);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 1);
      paramInt = i;
      if (this.nickname != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nickname);
      i = paramInt;
      if (this.wrK != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wrK);
      AppMethodBeat.o(114983);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114983);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bxi localbxi = (bxi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114983);
          break;
        case 1:
          localbxi.username = locala.BTU.readString();
          AppMethodBeat.o(114983);
          paramInt = i;
          break;
        case 2:
          localbxi.wXq = locala.BTU.ehX();
          AppMethodBeat.o(114983);
          paramInt = i;
          break;
        case 3:
          localbxi.nickname = locala.BTU.readString();
          AppMethodBeat.o(114983);
          paramInt = i;
          break;
        case 4:
          localbxi.wrK = locala.BTU.readString();
          AppMethodBeat.o(114983);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114983);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxi
 * JD-Core Version:    0.6.2
 */