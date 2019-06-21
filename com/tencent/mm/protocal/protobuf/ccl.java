package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ccl extends com.tencent.mm.bt.a
{
  public int guY;
  public String guZ;
  public long gva;
  public int xbQ;
  public int xbR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60070);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.guY);
      if (this.guZ != null)
        paramArrayOfObject.e(2, this.guZ);
      paramArrayOfObject.ai(3, this.gva);
      paramArrayOfObject.iz(4, this.xbQ);
      paramArrayOfObject.iz(5, this.xbR);
      AppMethodBeat.o(60070);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.guY) + 0;
        paramInt = i;
        if (this.guZ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.guZ);
        paramInt = paramInt + e.a.a.b.b.a.o(3, this.gva) + e.a.a.b.b.a.bs(4, this.xbQ) + e.a.a.b.b.a.bs(5, this.xbR);
        AppMethodBeat.o(60070);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60070);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ccl localccl = (ccl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60070);
          break;
        case 1:
          localccl.guY = locala.BTU.vd();
          AppMethodBeat.o(60070);
          paramInt = 0;
          break;
        case 2:
          localccl.guZ = locala.BTU.readString();
          AppMethodBeat.o(60070);
          paramInt = 0;
          break;
        case 3:
          localccl.gva = locala.BTU.ve();
          AppMethodBeat.o(60070);
          paramInt = 0;
          break;
        case 4:
          localccl.xbQ = locala.BTU.vd();
          AppMethodBeat.o(60070);
          paramInt = 0;
          break;
        case 5:
          localccl.xbR = locala.BTU.vd();
          AppMethodBeat.o(60070);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60070);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccl
 * JD-Core Version:    0.6.2
 */