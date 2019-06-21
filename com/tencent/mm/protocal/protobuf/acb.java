package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class acb extends com.tencent.mm.bt.a
{
  public int jBT;
  public String vXB;
  public int vXH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51425);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vXB != null)
        paramArrayOfObject.e(1, this.vXB);
      paramArrayOfObject.iz(2, this.vXH);
      paramArrayOfObject.iz(3, this.jBT);
      AppMethodBeat.o(51425);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vXB == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.vXB) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vXH) + e.a.a.b.b.a.bs(3, this.jBT);
      AppMethodBeat.o(51425);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51425);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acb localacb = (acb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51425);
          break;
        case 1:
          localacb.vXB = locala.BTU.readString();
          AppMethodBeat.o(51425);
          paramInt = i;
          break;
        case 2:
          localacb.vXH = locala.BTU.vd();
          AppMethodBeat.o(51425);
          paramInt = i;
          break;
        case 3:
          localacb.jBT = locala.BTU.vd();
          AppMethodBeat.o(51425);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51425);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acb
 * JD-Core Version:    0.6.2
 */