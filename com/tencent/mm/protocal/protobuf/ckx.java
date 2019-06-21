package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ckx extends com.tencent.mm.bt.a
{
  public int Ret;
  public int ptw;
  public int ptx;
  public String wdO;
  public String wot;
  public boolean xiH;
  public boolean xiI = false;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62586);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.wdO != null)
        paramArrayOfObject.e(4, this.wdO);
      paramArrayOfObject.aO(5, this.xiH);
      if (this.wot != null)
        paramArrayOfObject.e(6, this.wot);
      paramArrayOfObject.aO(7, this.xiI);
      AppMethodBeat.o(62586);
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
        i = paramInt + (e.a.a.b.b.a.fv(5) + 1);
        paramInt = i;
        if (this.wot != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wot);
        paramInt += e.a.a.b.b.a.fv(7) + 1;
        AppMethodBeat.o(62586);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62586);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ckx localckx = (ckx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62586);
          break;
        case 1:
          localckx.Ret = locala.BTU.vd();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 2:
          localckx.ptx = locala.BTU.vd();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 3:
          localckx.ptw = locala.BTU.vd();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 4:
          localckx.wdO = locala.BTU.readString();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 5:
          localckx.xiH = locala.BTU.ehX();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 6:
          localckx.wot = locala.BTU.readString();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        case 7:
          localckx.xiI = locala.BTU.ehX();
          AppMethodBeat.o(62586);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62586);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckx
 * JD-Core Version:    0.6.2
 */