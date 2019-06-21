package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cit extends com.tencent.mm.bt.a
{
  public int Height;
  public int Width;
  public int X;
  public int Y;
  public String wIG;
  public int weB;
  public String xhG;
  public int xhH;
  public int xhI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(81507);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.X);
      paramArrayOfObject.iz(2, this.Y);
      paramArrayOfObject.iz(3, this.Width);
      paramArrayOfObject.iz(4, this.Height);
      if (this.xhG != null)
        paramArrayOfObject.e(5, this.xhG);
      if (this.wIG != null)
        paramArrayOfObject.e(6, this.wIG);
      paramArrayOfObject.iz(7, this.xhH);
      paramArrayOfObject.iz(8, this.weB);
      paramArrayOfObject.iz(9, this.xhI);
      AppMethodBeat.o(81507);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.X) + 0 + e.a.a.b.b.a.bs(2, this.Y) + e.a.a.b.b.a.bs(3, this.Width) + e.a.a.b.b.a.bs(4, this.Height);
        paramInt = i;
        if (this.xhG != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.xhG);
        i = paramInt;
        if (this.wIG != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.wIG);
        paramInt = i + e.a.a.b.b.a.bs(7, this.xhH) + e.a.a.b.b.a.bs(8, this.weB) + e.a.a.b.b.a.bs(9, this.xhI);
        AppMethodBeat.o(81507);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(81507);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cit localcit = (cit)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(81507);
          break;
        case 1:
          localcit.X = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 2:
          localcit.Y = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 3:
          localcit.Width = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 4:
          localcit.Height = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 5:
          localcit.xhG = locala.BTU.readString();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 6:
          localcit.wIG = locala.BTU.readString();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 7:
          localcit.xhH = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 8:
          localcit.weB = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        case 9:
          localcit.xhI = locala.BTU.vd();
          AppMethodBeat.o(81507);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(81507);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cit
 * JD-Core Version:    0.6.2
 */