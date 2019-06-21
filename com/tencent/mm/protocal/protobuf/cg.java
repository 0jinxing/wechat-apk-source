package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cg extends com.tencent.mm.bt.a
{
  public int jCt;
  public int vEp;
  public int vEq;
  public int vEr;
  public int vEs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51362);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vEp);
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.vEq);
      paramArrayOfObject.iz(4, this.vEr);
      paramArrayOfObject.iz(5, this.vEs);
      AppMethodBeat.o(51362);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vEp) + 0 + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.vEq) + e.a.a.b.b.a.bs(4, this.vEr) + e.a.a.b.b.a.bs(5, this.vEs);
        AppMethodBeat.o(51362);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51362);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cg localcg = (cg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51362);
          break;
        case 1:
          localcg.vEp = locala.BTU.vd();
          AppMethodBeat.o(51362);
          paramInt = 0;
          break;
        case 2:
          localcg.jCt = locala.BTU.vd();
          AppMethodBeat.o(51362);
          paramInt = 0;
          break;
        case 3:
          localcg.vEq = locala.BTU.vd();
          AppMethodBeat.o(51362);
          paramInt = 0;
          break;
        case 4:
          localcg.vEr = locala.BTU.vd();
          AppMethodBeat.o(51362);
          paramInt = 0;
          break;
        case 5:
          localcg.vEs = locala.BTU.vd();
          AppMethodBeat.o(51362);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51362);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cg
 * JD-Core Version:    0.6.2
 */