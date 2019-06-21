package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bdx extends com.tencent.mm.bt.a
{
  public int nao;
  public String ndF;
  public String ndG;
  public int ptD;
  public long ptF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60052);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndG != null)
        paramArrayOfObject.e(1, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(2, this.ndF);
      paramArrayOfObject.iz(3, this.ptD);
      paramArrayOfObject.iz(4, this.nao);
      paramArrayOfObject.ai(5, this.ptF);
      AppMethodBeat.o(60052);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndG == null)
        break label427;
    label427: for (paramInt = e.a.a.b.b.a.f(1, this.ndG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ndF);
      paramInt = i + e.a.a.b.b.a.bs(3, this.ptD) + e.a.a.b.b.a.bs(4, this.nao) + e.a.a.b.b.a.o(5, this.ptF);
      AppMethodBeat.o(60052);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60052);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdx localbdx = (bdx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60052);
          break;
        case 1:
          localbdx.ndG = locala.BTU.readString();
          AppMethodBeat.o(60052);
          paramInt = i;
          break;
        case 2:
          localbdx.ndF = locala.BTU.readString();
          AppMethodBeat.o(60052);
          paramInt = i;
          break;
        case 3:
          localbdx.ptD = locala.BTU.vd();
          AppMethodBeat.o(60052);
          paramInt = i;
          break;
        case 4:
          localbdx.nao = locala.BTU.vd();
          AppMethodBeat.o(60052);
          paramInt = i;
          break;
        case 5:
          localbdx.ptF = locala.BTU.ve();
          AppMethodBeat.o(60052);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60052);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdx
 * JD-Core Version:    0.6.2
 */