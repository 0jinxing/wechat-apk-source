package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdh extends com.tencent.mm.bt.a
{
  public int cvd;
  public int qUe;
  public String reJ;
  public String xcV;
  public String xcW;
  public int xcX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94632);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.qUe);
      if (this.xcV != null)
        paramArrayOfObject.e(2, this.xcV);
      if (this.xcW != null)
        paramArrayOfObject.e(3, this.xcW);
      paramArrayOfObject.iz(4, this.cvd);
      if (this.reJ != null)
        paramArrayOfObject.e(5, this.reJ);
      paramArrayOfObject.iz(6, this.xcX);
      AppMethodBeat.o(94632);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.qUe) + 0;
        paramInt = i;
        if (this.xcV != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xcV);
        i = paramInt;
        if (this.xcW != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xcW);
        i += e.a.a.b.b.a.bs(4, this.cvd);
        paramInt = i;
        if (this.reJ != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.reJ);
        paramInt += e.a.a.b.b.a.bs(6, this.xcX);
        AppMethodBeat.o(94632);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94632);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdh localcdh = (cdh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94632);
          break;
        case 1:
          localcdh.qUe = locala.BTU.vd();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        case 2:
          localcdh.xcV = locala.BTU.readString();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        case 3:
          localcdh.xcW = locala.BTU.readString();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        case 4:
          localcdh.cvd = locala.BTU.vd();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        case 5:
          localcdh.reJ = locala.BTU.readString();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        case 6:
          localcdh.xcX = locala.BTU.vd();
          AppMethodBeat.o(94632);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94632);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdh
 * JD-Core Version:    0.6.2
 */