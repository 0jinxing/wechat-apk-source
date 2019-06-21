package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azv extends com.tencent.mm.bt.a
{
  public int jCt;
  public int scene;
  public String vOy;
  public String vQg;
  public long wDD;
  public long wDE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124323);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.scene);
      if (this.vOy != null)
        paramArrayOfObject.e(2, this.vOy);
      paramArrayOfObject.ai(3, this.wDD);
      paramArrayOfObject.ai(4, this.wDE);
      if (this.vQg != null)
        paramArrayOfObject.e(5, this.vQg);
      paramArrayOfObject.iz(6, this.jCt);
      AppMethodBeat.o(124323);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.scene) + 0;
        paramInt = i;
        if (this.vOy != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vOy);
        i = paramInt + e.a.a.b.b.a.o(3, this.wDD) + e.a.a.b.b.a.o(4, this.wDE);
        paramInt = i;
        if (this.vQg != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.vQg);
        paramInt += e.a.a.b.b.a.bs(6, this.jCt);
        AppMethodBeat.o(124323);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124323);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azv localazv = (azv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124323);
          break;
        case 1:
          localazv.scene = locala.BTU.vd();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        case 2:
          localazv.vOy = locala.BTU.readString();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        case 3:
          localazv.wDD = locala.BTU.ve();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        case 4:
          localazv.wDE = locala.BTU.ve();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        case 5:
          localazv.vQg = locala.BTU.readString();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        case 6:
          localazv.jCt = locala.BTU.vd();
          AppMethodBeat.o(124323);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124323);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azv
 * JD-Core Version:    0.6.2
 */