package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bdi extends com.tencent.mm.bt.a
{
  public String vHl;
  public double wHm;
  public long wHn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124327);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Username");
        AppMethodBeat.o(124327);
        throw paramArrayOfObject;
      }
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      paramArrayOfObject.f(2, this.wHm);
      paramArrayOfObject.ai(3, this.wHn);
      AppMethodBeat.o(124327);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label372;
    label372: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 8) + e.a.a.b.b.a.o(3, this.wHn);
      AppMethodBeat.o(124327);
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
          AppMethodBeat.o(124327);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124327);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdi localbdi = (bdi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124327);
          break;
        case 1:
          localbdi.vHl = locala.BTU.readString();
          AppMethodBeat.o(124327);
          paramInt = i;
          break;
        case 2:
          localbdi.wHm = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(124327);
          paramInt = i;
          break;
        case 3:
          localbdi.wHn = locala.BTU.ve();
          AppMethodBeat.o(124327);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124327);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdi
 * JD-Core Version:    0.6.2
 */