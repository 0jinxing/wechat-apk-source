package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class btf extends com.tencent.mm.bt.a
{
  public String mZj;
  public int nbk;
  public String wVl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124344);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wVl != null)
        paramArrayOfObject.e(1, this.wVl);
      paramArrayOfObject.iz(2, this.nbk);
      if (this.mZj != null)
        paramArrayOfObject.e(3, this.mZj);
      AppMethodBeat.o(124344);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wVl == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wVl) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nbk);
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZj);
      AppMethodBeat.o(124344);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124344);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        btf localbtf = (btf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124344);
          break;
        case 1:
          localbtf.wVl = locala.BTU.readString();
          AppMethodBeat.o(124344);
          paramInt = i;
          break;
        case 2:
          localbtf.nbk = locala.BTU.vd();
          AppMethodBeat.o(124344);
          paramInt = i;
          break;
        case 3:
          localbtf.mZj = locala.BTU.readString();
          AppMethodBeat.o(124344);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124344);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btf
 * JD-Core Version:    0.6.2
 */