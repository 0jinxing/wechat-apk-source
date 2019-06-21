package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atz extends com.tencent.mm.bt.a
{
  public String eCq;
  public double fNN;
  public int major;
  public int minor;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10191);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.eCq != null)
        paramArrayOfObject.e(1, this.eCq);
      paramArrayOfObject.iz(2, this.major);
      paramArrayOfObject.iz(3, this.minor);
      paramArrayOfObject.f(4, this.fNN);
      AppMethodBeat.o(10191);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.eCq == null)
        break label377;
    label377: for (paramInt = e.a.a.b.b.a.f(1, this.eCq) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.major) + e.a.a.b.b.a.bs(3, this.minor) + (e.a.a.b.b.a.fv(4) + 8);
      AppMethodBeat.o(10191);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10191);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atz localatz = (atz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10191);
          break;
        case 1:
          localatz.eCq = locala.BTU.readString();
          AppMethodBeat.o(10191);
          paramInt = i;
          break;
        case 2:
          localatz.major = locala.BTU.vd();
          AppMethodBeat.o(10191);
          paramInt = i;
          break;
        case 3:
          localatz.minor = locala.BTU.vd();
          AppMethodBeat.o(10191);
          paramInt = i;
          break;
        case 4:
          localatz.fNN = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(10191);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10191);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atz
 * JD-Core Version:    0.6.2
 */