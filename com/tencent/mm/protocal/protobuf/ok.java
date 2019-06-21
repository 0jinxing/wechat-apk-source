package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ok extends com.tencent.mm.bt.a
{
  public int jBT;
  public int vEr;
  public String vUK;
  public long vUL;
  public int vUM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114434);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vUK != null)
        paramArrayOfObject.e(1, this.vUK);
      paramArrayOfObject.ai(2, this.vUL);
      paramArrayOfObject.iz(3, this.vUM);
      paramArrayOfObject.iz(4, this.vEr);
      paramArrayOfObject.iz(5, this.jBT);
      AppMethodBeat.o(114434);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vUK == null)
        break label411;
    label411: for (paramInt = e.a.a.b.b.a.f(1, this.vUK) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.vUL) + e.a.a.b.b.a.bs(3, this.vUM) + e.a.a.b.b.a.bs(4, this.vEr) + e.a.a.b.b.a.bs(5, this.jBT);
      AppMethodBeat.o(114434);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114434);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ok localok = (ok)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114434);
          break;
        case 1:
          localok.vUK = locala.BTU.readString();
          AppMethodBeat.o(114434);
          paramInt = i;
          break;
        case 2:
          localok.vUL = locala.BTU.ve();
          AppMethodBeat.o(114434);
          paramInt = i;
          break;
        case 3:
          localok.vUM = locala.BTU.vd();
          AppMethodBeat.o(114434);
          paramInt = i;
          break;
        case 4:
          localok.vEr = locala.BTU.vd();
          AppMethodBeat.o(114434);
          paramInt = i;
          break;
        case 5:
          localok.jBT = locala.BTU.vd();
          AppMethodBeat.o(114434);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114434);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ok
 * JD-Core Version:    0.6.2
 */