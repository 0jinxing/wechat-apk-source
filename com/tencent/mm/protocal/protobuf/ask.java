package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ask extends com.tencent.mm.bt.a
{
  public String nZa;
  public String nZb;
  public String nZc;
  public String nZd;
  public int vAF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48865);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vAF);
      if (this.nZa != null)
        paramArrayOfObject.e(2, this.nZa);
      if (this.nZb != null)
        paramArrayOfObject.e(3, this.nZb);
      if (this.nZc != null)
        paramArrayOfObject.e(4, this.nZc);
      if (this.nZd != null)
        paramArrayOfObject.e(5, this.nZd);
      AppMethodBeat.o(48865);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vAF) + 0;
        paramInt = i;
        if (this.nZa != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.nZa);
        i = paramInt;
        if (this.nZb != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.nZb);
        paramInt = i;
        if (this.nZc != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.nZc);
        i = paramInt;
        if (this.nZd != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.nZd);
        AppMethodBeat.o(48865);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48865);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ask localask = (ask)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48865);
          break;
        case 1:
          localask.vAF = locala.BTU.vd();
          AppMethodBeat.o(48865);
          paramInt = 0;
          break;
        case 2:
          localask.nZa = locala.BTU.readString();
          AppMethodBeat.o(48865);
          paramInt = 0;
          break;
        case 3:
          localask.nZb = locala.BTU.readString();
          AppMethodBeat.o(48865);
          paramInt = 0;
          break;
        case 4:
          localask.nZc = locala.BTU.readString();
          AppMethodBeat.o(48865);
          paramInt = 0;
          break;
        case 5:
          localask.nZd = locala.BTU.readString();
          AppMethodBeat.o(48865);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48865);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ask
 * JD-Core Version:    0.6.2
 */