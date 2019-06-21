package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bed extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public int luF;
  public String vLe;
  public String wHM;
  public String wbw;
  public int weB;
  public int wyY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73744);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.luF);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.vLe != null)
        paramArrayOfObject.e(3, this.vLe);
      if (this.wbw != null)
        paramArrayOfObject.e(4, this.wbw);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      paramArrayOfObject.iz(6, this.wyY);
      paramArrayOfObject.iz(7, this.weB);
      if (this.wHM != null)
        paramArrayOfObject.e(8, this.wHM);
      AppMethodBeat.o(73744);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.luF) + 0;
        int i = paramInt;
        if (this.jCH != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
        paramInt = i;
        if (this.vLe != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vLe);
        i = paramInt;
        if (this.wbw != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.wbw);
        paramInt = i;
        if (this.jBB != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.jBB);
        i = paramInt + e.a.a.b.b.a.bs(6, this.wyY) + e.a.a.b.b.a.bs(7, this.weB);
        paramInt = i;
        if (this.wHM != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.wHM);
        AppMethodBeat.o(73744);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73744);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bed localbed = (bed)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73744);
          break;
        case 1:
          localbed.luF = locala.BTU.vd();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 2:
          localbed.jCH = locala.BTU.readString();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 3:
          localbed.vLe = locala.BTU.readString();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 4:
          localbed.wbw = locala.BTU.readString();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 5:
          localbed.jBB = locala.BTU.readString();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 6:
          localbed.wyY = locala.BTU.vd();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 7:
          localbed.weB = locala.BTU.vd();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        case 8:
          localbed.wHM = locala.BTU.readString();
          AppMethodBeat.o(73744);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73744);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bed
 * JD-Core Version:    0.6.2
 */