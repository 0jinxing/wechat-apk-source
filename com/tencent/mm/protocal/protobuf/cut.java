package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cut extends com.tencent.mm.bt.a
{
  public int jBv;
  public int jCt;
  public String ndF;
  public int pcX;
  public String vEG;
  public int wFW;
  public int xqR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28761);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndF != null)
        paramArrayOfObject.e(1, this.ndF);
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.jBv);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(5, this.wFW);
      if (this.vEG != null)
        paramArrayOfObject.e(6, this.vEG);
      paramArrayOfObject.iz(7, this.xqR);
      AppMethodBeat.o(28761);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndF == null)
        break label538;
    label538: for (paramInt = e.a.a.b.b.a.f(1, this.ndF) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.jBv) + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(5, this.wFW);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vEG);
      paramInt += e.a.a.b.b.a.bs(7, this.xqR);
      AppMethodBeat.o(28761);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28761);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cut localcut = (cut)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28761);
          break;
        case 1:
          localcut.ndF = locala.BTU.readString();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 2:
          localcut.jCt = locala.BTU.vd();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 3:
          localcut.jBv = locala.BTU.vd();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 4:
          localcut.pcX = locala.BTU.vd();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 5:
          localcut.wFW = locala.BTU.vd();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 6:
          localcut.vEG = locala.BTU.readString();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        case 7:
          localcut.xqR = locala.BTU.vd();
          AppMethodBeat.o(28761);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28761);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cut
 * JD-Core Version:    0.6.2
 */