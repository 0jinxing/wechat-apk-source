package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class sq extends com.tencent.mm.bt.a
{
  public double latitude;
  public double longitude;
  public String waf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134426);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.waf != null)
        paramArrayOfObject.e(1, this.waf);
      paramArrayOfObject.f(2, this.longitude);
      paramArrayOfObject.f(3, this.latitude);
      AppMethodBeat.o(134426);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.waf == null)
        break label323;
    label323: for (paramInt = e.a.a.b.b.a.f(1, this.waf) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
      AppMethodBeat.o(134426);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134426);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        sq localsq = (sq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134426);
          break;
        case 1:
          localsq.waf = locala.BTU.readString();
          AppMethodBeat.o(134426);
          paramInt = i;
          break;
        case 2:
          localsq.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(134426);
          paramInt = i;
          break;
        case 3:
          localsq.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(134426);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134426);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sq
 * JD-Core Version:    0.6.2
 */