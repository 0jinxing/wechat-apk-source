package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bam extends com.tencent.mm.bt.a
{
  public float bottom;
  public float left;
  public float right;
  public float top;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48885);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.top);
      paramArrayOfObject.r(2, this.bottom);
      paramArrayOfObject.r(3, this.left);
      paramArrayOfObject.r(4, this.right);
      AppMethodBeat.o(48885);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4);
        AppMethodBeat.o(48885);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48885);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bam localbam = (bam)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48885);
          break;
        case 1:
          localbam.top = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48885);
          paramInt = 0;
          break;
        case 2:
          localbam.bottom = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48885);
          paramInt = 0;
          break;
        case 3:
          localbam.left = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48885);
          paramInt = 0;
          break;
        case 4:
          localbam.right = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48885);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48885);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bam
 * JD-Core Version:    0.6.2
 */