package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class csf extends com.tencent.mm.bt.a
{
  public String title;
  public String xhW;
  public String xpB;
  public String xpC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56994);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.xpB != null)
        paramArrayOfObject.e(2, this.xpB);
      if (this.xhW != null)
        paramArrayOfObject.e(3, this.xhW);
      if (this.xpC != null)
        paramArrayOfObject.e(4, this.xpC);
      AppMethodBeat.o(56994);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xpB);
      paramInt = i;
      if (this.xhW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xhW);
      i = paramInt;
      if (this.xpC != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xpC);
      AppMethodBeat.o(56994);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56994);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csf localcsf = (csf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56994);
          break;
        case 1:
          localcsf.title = locala.BTU.readString();
          AppMethodBeat.o(56994);
          paramInt = i;
          break;
        case 2:
          localcsf.xpB = locala.BTU.readString();
          AppMethodBeat.o(56994);
          paramInt = i;
          break;
        case 3:
          localcsf.xhW = locala.BTU.readString();
          AppMethodBeat.o(56994);
          paramInt = i;
          break;
        case 4:
          localcsf.xpC = locala.BTU.readString();
          AppMethodBeat.o(56994);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56994);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csf
 * JD-Core Version:    0.6.2
 */