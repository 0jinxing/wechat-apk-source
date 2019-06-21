package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class clz extends com.tencent.mm.bt.a
{
  public int Height;
  public int Width;
  public b xjH;
  public int xjI;
  public long xjJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124371);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xjH != null)
        paramArrayOfObject.c(1, this.xjH);
      paramArrayOfObject.iz(2, this.xjI);
      paramArrayOfObject.ai(3, this.xjJ);
      paramArrayOfObject.iz(4, this.Width);
      paramArrayOfObject.iz(5, this.Height);
      AppMethodBeat.o(124371);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xjH == null)
        break label411;
    label411: for (paramInt = e.a.a.b.b.a.b(1, this.xjH) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.xjI) + e.a.a.b.b.a.o(3, this.xjJ) + e.a.a.b.b.a.bs(4, this.Width) + e.a.a.b.b.a.bs(5, this.Height);
      AppMethodBeat.o(124371);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124371);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        clz localclz = (clz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124371);
          break;
        case 1:
          localclz.xjH = locala.BTU.emu();
          AppMethodBeat.o(124371);
          paramInt = i;
          break;
        case 2:
          localclz.xjI = locala.BTU.vd();
          AppMethodBeat.o(124371);
          paramInt = i;
          break;
        case 3:
          localclz.xjJ = locala.BTU.ve();
          AppMethodBeat.o(124371);
          paramInt = i;
          break;
        case 4:
          localclz.Width = locala.BTU.vd();
          AppMethodBeat.o(124371);
          paramInt = i;
          break;
        case 5:
          localclz.Height = locala.BTU.vd();
          AppMethodBeat.o(124371);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124371);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clz
 * JD-Core Version:    0.6.2
 */