package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cgc extends com.tencent.mm.bt.a
{
  public String jBB;
  public String vXl;
  public int wPH;
  public int wbH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28662);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.vXl != null)
        paramArrayOfObject.e(2, this.vXl);
      paramArrayOfObject.iz(3, this.wPH);
      paramArrayOfObject.iz(4, this.wbH);
      AppMethodBeat.o(28662);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label394;
    label394: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vXl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vXl);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wPH) + e.a.a.b.b.a.bs(4, this.wbH);
      AppMethodBeat.o(28662);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28662);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cgc localcgc = (cgc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28662);
          break;
        case 1:
          localcgc.jBB = locala.BTU.readString();
          AppMethodBeat.o(28662);
          paramInt = i;
          break;
        case 2:
          localcgc.vXl = locala.BTU.readString();
          AppMethodBeat.o(28662);
          paramInt = i;
          break;
        case 3:
          localcgc.wPH = locala.BTU.vd();
          AppMethodBeat.o(28662);
          paramInt = i;
          break;
        case 4:
          localcgc.wbH = locala.BTU.vd();
          AppMethodBeat.o(28662);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28662);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgc
 * JD-Core Version:    0.6.2
 */