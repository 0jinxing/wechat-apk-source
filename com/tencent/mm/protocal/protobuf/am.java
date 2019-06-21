package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class am extends com.tencent.mm.bt.a
{
  public String content;
  public String cxb;
  public String pkI;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28297);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.cxb != null)
        paramArrayOfObject.e(2, this.cxb);
      if (this.pkI != null)
        paramArrayOfObject.e(3, this.pkI);
      if (this.content != null)
        paramArrayOfObject.e(4, this.content);
      AppMethodBeat.o(28297);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label426;
    label426: for (i = e.a.a.b.b.a.f(1, this.username) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cxb);
      i = paramInt;
      if (this.pkI != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pkI);
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.content);
      AppMethodBeat.o(28297);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28297);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        am localam = (am)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28297);
          break;
        case 1:
          localam.username = locala.BTU.readString();
          AppMethodBeat.o(28297);
          paramInt = i;
          break;
        case 2:
          localam.cxb = locala.BTU.readString();
          AppMethodBeat.o(28297);
          paramInt = i;
          break;
        case 3:
          localam.pkI = locala.BTU.readString();
          AppMethodBeat.o(28297);
          paramInt = i;
          break;
        case 4:
          localam.content = locala.BTU.readString();
          AppMethodBeat.o(28297);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28297);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.am
 * JD-Core Version:    0.6.2
 */