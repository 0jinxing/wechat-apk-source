package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctw extends com.tencent.mm.bt.a
{
  public String luQ;
  public String vHl;
  public boolean xqy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28733);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Username");
        AppMethodBeat.o(28733);
        throw paramArrayOfObject;
      }
      if (this.luQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Language");
        AppMethodBeat.o(28733);
        throw paramArrayOfObject;
      }
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      if (this.luQ != null)
        paramArrayOfObject.e(2, this.luQ);
      paramArrayOfObject.aO(3, this.xqy);
      AppMethodBeat.o(28733);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.luQ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.luQ);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1);
      AppMethodBeat.o(28733);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Username");
          AppMethodBeat.o(28733);
          throw paramArrayOfObject;
        }
        if (this.luQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Language");
          AppMethodBeat.o(28733);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28733);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctw localctw = (ctw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28733);
          break;
        case 1:
          localctw.vHl = locala.BTU.readString();
          AppMethodBeat.o(28733);
          paramInt = i;
          break;
        case 2:
          localctw.luQ = locala.BTU.readString();
          AppMethodBeat.o(28733);
          paramInt = i;
          break;
        case 3:
          localctw.xqy = locala.BTU.ehX();
          AppMethodBeat.o(28733);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28733);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctw
 * JD-Core Version:    0.6.2
 */