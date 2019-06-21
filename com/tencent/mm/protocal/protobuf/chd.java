package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class chd extends com.tencent.mm.bt.a
{
  public String kbV;
  public String vGE;
  public int weight;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11819);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vGE != null)
        paramArrayOfObject.e(1, this.vGE);
      if (this.kbV != null)
        paramArrayOfObject.e(2, this.kbV);
      paramArrayOfObject.iz(3, this.weight);
      AppMethodBeat.o(11819);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vGE == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.vGE) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbV);
      paramInt = i + e.a.a.b.b.a.bs(3, this.weight);
      AppMethodBeat.o(11819);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11819);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chd localchd = (chd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11819);
          break;
        case 1:
          localchd.vGE = locala.BTU.readString();
          AppMethodBeat.o(11819);
          paramInt = i;
          break;
        case 2:
          localchd.kbV = locala.BTU.readString();
          AppMethodBeat.o(11819);
          paramInt = i;
          break;
        case 3:
          localchd.weight = locala.BTU.vd();
          AppMethodBeat.o(11819);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11819);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chd
 * JD-Core Version:    0.6.2
 */