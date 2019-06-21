package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bif extends com.tencent.mm.bt.a
{
  public float bottom;
  public float left;
  public float right;
  public float top;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48916);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.top);
      paramArrayOfObject.r(2, this.bottom);
      paramArrayOfObject.r(3, this.left);
      paramArrayOfObject.r(4, this.right);
      AppMethodBeat.o(48916);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4);
        AppMethodBeat.o(48916);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48916);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bif localbif = (bif)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48916);
          break;
        case 1:
          localbif.top = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48916);
          paramInt = 0;
          break;
        case 2:
          localbif.bottom = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48916);
          paramInt = 0;
          break;
        case 3:
          localbif.left = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48916);
          paramInt = 0;
          break;
        case 4:
          localbif.right = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48916);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48916);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bif
 * JD-Core Version:    0.6.2
 */