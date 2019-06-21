package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chx extends com.tencent.mm.bt.a
{
  public String cHr;
  public long xha;
  public long xhj;
  public long xhk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55712);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cHr != null)
        paramArrayOfObject.e(1, this.cHr);
      paramArrayOfObject.ai(2, this.xhj);
      paramArrayOfObject.ai(3, this.xhk);
      paramArrayOfObject.ai(4, this.xha);
      AppMethodBeat.o(55712);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cHr == null)
        break label364;
    label364: for (paramInt = e.a.a.b.b.a.f(1, this.cHr) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.xhj) + e.a.a.b.b.a.o(3, this.xhk) + e.a.a.b.b.a.o(4, this.xha);
      AppMethodBeat.o(55712);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55712);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chx localchx = (chx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55712);
          break;
        case 1:
          localchx.cHr = locala.BTU.readString();
          AppMethodBeat.o(55712);
          paramInt = i;
          break;
        case 2:
          localchx.xhj = locala.BTU.ve();
          AppMethodBeat.o(55712);
          paramInt = i;
          break;
        case 3:
          localchx.xhk = locala.BTU.ve();
          AppMethodBeat.o(55712);
          paramInt = i;
          break;
        case 4:
          localchx.xha = locala.BTU.ve();
          AppMethodBeat.o(55712);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55712);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chx
 * JD-Core Version:    0.6.2
 */