package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class att extends com.tencent.mm.bt.a
{
  public String Label;
  public float vOu;
  public float vOv;
  public float wxP;
  public String wxQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28526);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.vOu);
      paramArrayOfObject.r(2, this.vOv);
      paramArrayOfObject.r(3, this.wxP);
      if (this.Label != null)
        paramArrayOfObject.e(4, this.Label);
      if (this.wxQ != null)
        paramArrayOfObject.e(5, this.wxQ);
      AppMethodBeat.o(28526);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4);
        paramInt = i;
        if (this.Label != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.Label);
        i = paramInt;
        if (this.wxQ != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wxQ);
        AppMethodBeat.o(28526);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28526);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        att localatt = (att)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28526);
          break;
        case 1:
          localatt.vOu = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(28526);
          paramInt = 0;
          break;
        case 2:
          localatt.vOv = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(28526);
          paramInt = 0;
          break;
        case 3:
          localatt.wxP = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(28526);
          paramInt = 0;
          break;
        case 4:
          localatt.Label = locala.BTU.readString();
          AppMethodBeat.o(28526);
          paramInt = 0;
          break;
        case 5:
          localatt.wxQ = locala.BTU.readString();
          AppMethodBeat.o(28526);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.att
 * JD-Core Version:    0.6.2
 */