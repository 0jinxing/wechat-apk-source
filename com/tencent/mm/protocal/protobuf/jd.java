package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class jd extends com.tencent.mm.bt.a
{
  public String kKZ;
  public String nickname;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96209);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.kKZ != null)
        paramArrayOfObject.e(2, this.kKZ);
      if (this.nickname != null)
        paramArrayOfObject.e(3, this.nickname);
      AppMethodBeat.o(96209);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.username) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kKZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kKZ);
      i = paramInt;
      if (this.nickname != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nickname);
      AppMethodBeat.o(96209);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96209);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        jd localjd = (jd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96209);
          break;
        case 1:
          localjd.username = locala.BTU.readString();
          AppMethodBeat.o(96209);
          paramInt = i;
          break;
        case 2:
          localjd.kKZ = locala.BTU.readString();
          AppMethodBeat.o(96209);
          paramInt = i;
          break;
        case 3:
          localjd.nickname = locala.BTU.readString();
          AppMethodBeat.o(96209);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96209);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jd
 * JD-Core Version:    0.6.2
 */