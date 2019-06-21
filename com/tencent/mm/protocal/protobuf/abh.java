package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abh extends com.tencent.mm.bt.a
{
  public int cOi;
  public String cvF;
  public int index;
  public int jSW;
  public String mfg;
  public String query;
  public int scene;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51406);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.scene);
      paramArrayOfObject.iz(2, this.jSW);
      paramArrayOfObject.iz(3, this.index);
      if (this.cvF != null)
        paramArrayOfObject.e(4, this.cvF);
      if (this.query != null)
        paramArrayOfObject.e(5, this.query);
      if (this.mfg != null)
        paramArrayOfObject.e(6, this.mfg);
      paramArrayOfObject.iz(7, this.cOi);
      AppMethodBeat.o(51406);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.scene) + 0 + e.a.a.b.b.a.bs(2, this.jSW) + e.a.a.b.b.a.bs(3, this.index);
        int i = paramInt;
        if (this.cvF != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.cvF);
        paramInt = i;
        if (this.query != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.query);
        i = paramInt;
        if (this.mfg != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.mfg);
        paramInt = i + e.a.a.b.b.a.bs(7, this.cOi);
        AppMethodBeat.o(51406);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51406);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abh localabh = (abh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51406);
          break;
        case 1:
          localabh.scene = locala.BTU.vd();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 2:
          localabh.jSW = locala.BTU.vd();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 3:
          localabh.index = locala.BTU.vd();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 4:
          localabh.cvF = locala.BTU.readString();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 5:
          localabh.query = locala.BTU.readString();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 6:
          localabh.mfg = locala.BTU.readString();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        case 7:
          localabh.cOi = locala.BTU.vd();
          AppMethodBeat.o(51406);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51406);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abh
 * JD-Core Version:    0.6.2
 */