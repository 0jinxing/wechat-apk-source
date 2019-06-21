package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cuz extends com.tencent.mm.bt.a
{
  public String jCH;
  public String wyw;
  public com.tencent.mm.bt.b xqr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28767);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
        AppMethodBeat.o(28767);
        throw paramArrayOfObject;
      }
      if (this.jCH == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
        AppMethodBeat.o(28767);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.xqr != null)
        paramArrayOfObject.c(3, this.xqr);
      AppMethodBeat.o(28767);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label466;
    label466: for (i = e.a.a.b.b.a.f(1, this.wyw) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.xqr != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.xqr);
      AppMethodBeat.o(28767);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
          AppMethodBeat.o(28767);
          throw paramArrayOfObject;
        }
        if (this.jCH == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
          AppMethodBeat.o(28767);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28767);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuz localcuz = (cuz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28767);
          break;
        case 1:
          localcuz.wyw = locala.BTU.readString();
          AppMethodBeat.o(28767);
          paramInt = i;
          break;
        case 2:
          localcuz.jCH = locala.BTU.readString();
          AppMethodBeat.o(28767);
          paramInt = i;
          break;
        case 3:
          localcuz.xqr = locala.BTU.emu();
          AppMethodBeat.o(28767);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28767);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuz
 * JD-Core Version:    0.6.2
 */