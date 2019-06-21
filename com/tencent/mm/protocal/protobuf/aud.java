package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aud extends com.tencent.mm.bt.a
{
  public String mZR;
  public String phA;
  public int vYu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28532);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vYu);
      if (this.phA != null)
        paramArrayOfObject.e(2, this.phA);
      if (this.mZR != null)
        paramArrayOfObject.e(3, this.mZR);
      AppMethodBeat.o(28532);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vYu) + 0;
        paramInt = i;
        if (this.phA != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.phA);
        i = paramInt;
        if (this.mZR != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.mZR);
        AppMethodBeat.o(28532);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28532);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aud localaud = (aud)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28532);
          break;
        case 1:
          localaud.vYu = locala.BTU.vd();
          AppMethodBeat.o(28532);
          paramInt = 0;
          break;
        case 2:
          localaud.phA = locala.BTU.readString();
          AppMethodBeat.o(28532);
          paramInt = 0;
          break;
        case 3:
          localaud.mZR = locala.BTU.readString();
          AppMethodBeat.o(28532);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28532);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aud
 * JD-Core Version:    0.6.2
 */