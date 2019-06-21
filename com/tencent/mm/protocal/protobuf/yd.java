package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class yd extends com.tencent.mm.bt.a
{
  public int Ret;
  public long ptF;
  public int ptw;
  public int ptx;
  public String wdO;
  public int wdU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53872);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.wdO != null)
        paramArrayOfObject.e(4, this.wdO);
      paramArrayOfObject.iz(5, this.wdU);
      paramArrayOfObject.ai(6, this.ptF);
      AppMethodBeat.o(53872);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Ret) + 0 + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
        paramInt = i;
        if (this.wdO != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wdO);
        paramInt = paramInt + e.a.a.b.b.a.bs(5, this.wdU) + e.a.a.b.b.a.o(6, this.ptF);
        AppMethodBeat.o(53872);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(53872);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        yd localyd = (yd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(53872);
          break;
        case 1:
          localyd.Ret = locala.BTU.vd();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        case 2:
          localyd.ptx = locala.BTU.vd();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        case 3:
          localyd.ptw = locala.BTU.vd();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        case 4:
          localyd.wdO = locala.BTU.readString();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        case 5:
          localyd.wdU = locala.BTU.vd();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        case 6:
          localyd.ptF = locala.BTU.ve();
          AppMethodBeat.o(53872);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(53872);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yd
 * JD-Core Version:    0.6.2
 */