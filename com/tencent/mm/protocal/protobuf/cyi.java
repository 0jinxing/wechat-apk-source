package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cyi extends com.tencent.mm.bt.a
{
  public int score;
  public String username;
  public int xtG;
  public int xtH;
  public int xtI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28771);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(28771);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.score);
      paramArrayOfObject.iz(3, this.xtG);
      paramArrayOfObject.iz(4, this.xtH);
      paramArrayOfObject.iz(5, this.xtI);
      AppMethodBeat.o(28771);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label470;
    label470: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.score) + e.a.a.b.b.a.bs(3, this.xtG) + e.a.a.b.b.a.bs(4, this.xtH) + e.a.a.b.b.a.bs(5, this.xtI);
      AppMethodBeat.o(28771);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(28771);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28771);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cyi localcyi = (cyi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28771);
          break;
        case 1:
          localcyi.username = locala.BTU.readString();
          AppMethodBeat.o(28771);
          paramInt = i;
          break;
        case 2:
          localcyi.score = locala.BTU.vd();
          AppMethodBeat.o(28771);
          paramInt = i;
          break;
        case 3:
          localcyi.xtG = locala.BTU.vd();
          AppMethodBeat.o(28771);
          paramInt = i;
          break;
        case 4:
          localcyi.xtH = locala.BTU.vd();
          AppMethodBeat.o(28771);
          paramInt = i;
          break;
        case 5:
          localcyi.xtI = locala.BTU.vd();
          AppMethodBeat.o(28771);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28771);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cyi
 * JD-Core Version:    0.6.2
 */