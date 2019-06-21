package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.bt.a
{
  public int count;
  public int qsz;
  public int vyQ;
  public com.tencent.mm.bt.b vyZ;
  public int vza;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72819);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vyZ == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: value");
        AppMethodBeat.o(72819);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.vyQ);
      if (this.vyZ != null)
        paramArrayOfObject.c(2, this.vyZ);
      paramArrayOfObject.iz(3, this.vza);
      paramArrayOfObject.iz(4, this.qsz);
      paramArrayOfObject.iz(5, this.count);
      AppMethodBeat.o(72819);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vyQ) + 0;
        paramInt = i;
        if (this.vyZ != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.vyZ);
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.vza) + e.a.a.b.b.a.bs(4, this.qsz) + e.a.a.b.b.a.bs(5, this.count);
        AppMethodBeat.o(72819);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vyZ == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: value");
          AppMethodBeat.o(72819);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(72819);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72819);
          break;
        case 1:
          locald.vyQ = locala.BTU.vd();
          AppMethodBeat.o(72819);
          paramInt = 0;
          break;
        case 2:
          locald.vyZ = locala.BTU.emu();
          AppMethodBeat.o(72819);
          paramInt = 0;
          break;
        case 3:
          locald.vza = locala.BTU.vd();
          AppMethodBeat.o(72819);
          paramInt = 0;
          break;
        case 4:
          locald.qsz = locala.BTU.vd();
          AppMethodBeat.o(72819);
          paramInt = 0;
          break;
        case 5:
          locald.count = locala.BTU.vd();
          AppMethodBeat.o(72819);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72819);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.d
 * JD-Core Version:    0.6.2
 */