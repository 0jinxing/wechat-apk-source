package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class acc extends com.tencent.mm.bt.a
{
  public int jCo;
  public String wjQ;
  public long wjR;
  public String wjS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63689);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wjQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Rid");
        AppMethodBeat.o(63689);
        throw paramArrayOfObject;
      }
      if (this.wjS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MimeType");
        AppMethodBeat.o(63689);
        throw paramArrayOfObject;
      }
      if (this.wjQ != null)
        paramArrayOfObject.e(1, this.wjQ);
      paramArrayOfObject.ai(2, this.wjR);
      paramArrayOfObject.iz(3, this.jCo);
      if (this.wjS != null)
        paramArrayOfObject.e(4, this.wjS);
      AppMethodBeat.o(63689);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wjQ == null)
        break label480;
    label480: for (paramInt = e.a.a.b.b.a.f(1, this.wjQ) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.wjR) + e.a.a.b.b.a.bs(3, this.jCo);
      paramInt = i;
      if (this.wjS != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wjS);
      AppMethodBeat.o(63689);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wjQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Rid");
          AppMethodBeat.o(63689);
          throw paramArrayOfObject;
        }
        if (this.wjS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MimeType");
          AppMethodBeat.o(63689);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63689);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acc localacc = (acc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63689);
          break;
        case 1:
          localacc.wjQ = locala.BTU.readString();
          AppMethodBeat.o(63689);
          paramInt = i;
          break;
        case 2:
          localacc.wjR = locala.BTU.ve();
          AppMethodBeat.o(63689);
          paramInt = i;
          break;
        case 3:
          localacc.jCo = locala.BTU.vd();
          AppMethodBeat.o(63689);
          paramInt = i;
          break;
        case 4:
          localacc.wjS = locala.BTU.readString();
          AppMethodBeat.o(63689);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63689);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acc
 * JD-Core Version:    0.6.2
 */