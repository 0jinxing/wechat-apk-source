package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ciw extends com.tencent.mm.bt.a
{
  public int uin;
  public b xhL;
  public String xhM;
  public b xhN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10244);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xhL != null)
        paramArrayOfObject.c(1, this.xhL);
      if (this.xhM != null)
        paramArrayOfObject.e(2, this.xhM);
      if (this.xhN != null)
        paramArrayOfObject.c(3, this.xhN);
      paramArrayOfObject.iz(4, this.uin);
      AppMethodBeat.o(10244);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xhL == null)
        break label410;
    label410: for (i = e.a.a.b.b.a.b(1, this.xhL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xhM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xhM);
      i = paramInt;
      if (this.xhN != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.xhN);
      paramInt = i + e.a.a.b.b.a.bs(4, this.uin);
      AppMethodBeat.o(10244);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10244);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ciw localciw = (ciw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10244);
          break;
        case 1:
          localciw.xhL = locala.BTU.emu();
          AppMethodBeat.o(10244);
          paramInt = i;
          break;
        case 2:
          localciw.xhM = locala.BTU.readString();
          AppMethodBeat.o(10244);
          paramInt = i;
          break;
        case 3:
          localciw.xhN = locala.BTU.emu();
          AppMethodBeat.o(10244);
          paramInt = i;
          break;
        case 4:
          localciw.uin = locala.BTU.vd();
          AppMethodBeat.o(10244);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10244);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ciw
 * JD-Core Version:    0.6.2
 */