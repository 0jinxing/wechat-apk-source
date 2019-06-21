package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cbp extends com.tencent.mm.bt.a
{
  public int rnf;
  public int rng;
  public String vFJ;
  public String vFK;
  public String vFL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94594);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFJ != null)
        paramArrayOfObject.e(1, this.vFJ);
      if (this.vFK != null)
        paramArrayOfObject.e(2, this.vFK);
      if (this.vFL != null)
        paramArrayOfObject.e(3, this.vFL);
      paramArrayOfObject.iz(4, this.rnf);
      paramArrayOfObject.iz(5, this.rng);
      AppMethodBeat.o(94594);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFJ == null)
        break label447;
    label447: for (i = e.a.a.b.b.a.f(1, this.vFJ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vFK != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vFK);
      i = paramInt;
      if (this.vFL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vFL);
      paramInt = i + e.a.a.b.b.a.bs(4, this.rnf) + e.a.a.b.b.a.bs(5, this.rng);
      AppMethodBeat.o(94594);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94594);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cbp localcbp = (cbp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94594);
          break;
        case 1:
          localcbp.vFJ = locala.BTU.readString();
          AppMethodBeat.o(94594);
          paramInt = i;
          break;
        case 2:
          localcbp.vFK = locala.BTU.readString();
          AppMethodBeat.o(94594);
          paramInt = i;
          break;
        case 3:
          localcbp.vFL = locala.BTU.readString();
          AppMethodBeat.o(94594);
          paramInt = i;
          break;
        case 4:
          localcbp.rnf = locala.BTU.vd();
          AppMethodBeat.o(94594);
          paramInt = i;
          break;
        case 5:
          localcbp.rng = locala.BTU.vd();
          AppMethodBeat.o(94594);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94594);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbp
 * JD-Core Version:    0.6.2
 */