package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctz extends com.tencent.mm.bt.a
{
  public String jCH;
  public String wyw;
  public long xqz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28737);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Talker");
        AppMethodBeat.o(28737);
        throw paramArrayOfObject;
      }
      if (this.jCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(28737);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      paramArrayOfObject.ai(3, this.xqz);
      AppMethodBeat.o(28737);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.wyw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
      paramInt = i + e.a.a.b.b.a.o(3, this.xqz);
      AppMethodBeat.o(28737);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Talker");
          AppMethodBeat.o(28737);
          throw paramArrayOfObject;
        }
        if (this.jCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(28737);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28737);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctz localctz = (ctz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28737);
          break;
        case 1:
          localctz.wyw = locala.BTU.readString();
          AppMethodBeat.o(28737);
          paramInt = i;
          break;
        case 2:
          localctz.jCH = locala.BTU.readString();
          AppMethodBeat.o(28737);
          paramInt = i;
          break;
        case 3:
          localctz.xqz = locala.BTU.ve();
          AppMethodBeat.o(28737);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28737);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctz
 * JD-Core Version:    0.6.2
 */