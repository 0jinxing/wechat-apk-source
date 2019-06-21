package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bgd extends com.tencent.mm.bt.a
{
  public String bCu;
  public int status;
  public String userName;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80130);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.userName != null)
        paramArrayOfObject.e(1, this.userName);
      paramArrayOfObject.iz(2, this.status);
      if (this.bCu != null)
        paramArrayOfObject.e(3, this.bCu);
      AppMethodBeat.o(80130);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.userName == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.userName) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.status);
      paramInt = i;
      if (this.bCu != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.bCu);
      AppMethodBeat.o(80130);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80130);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bgd localbgd = (bgd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80130);
          break;
        case 1:
          localbgd.userName = locala.BTU.readString();
          AppMethodBeat.o(80130);
          paramInt = i;
          break;
        case 2:
          localbgd.status = locala.BTU.vd();
          AppMethodBeat.o(80130);
          paramInt = i;
          break;
        case 3:
          localbgd.bCu = locala.BTU.readString();
          AppMethodBeat.o(80130);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80130);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgd
 * JD-Core Version:    0.6.2
 */