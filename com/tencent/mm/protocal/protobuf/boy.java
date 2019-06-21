package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class boy extends com.tencent.mm.bt.a
{
  public String jBB;
  public String wfK;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102512);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.wlF != null)
        paramArrayOfObject.e(2, this.wlF);
      if (this.wfK != null)
        paramArrayOfObject.e(3, this.wfK);
      AppMethodBeat.o(102512);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wlF != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wlF);
      i = paramInt;
      if (this.wfK != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wfK);
      AppMethodBeat.o(102512);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102512);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        boy localboy = (boy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102512);
          break;
        case 1:
          localboy.jBB = locala.BTU.readString();
          AppMethodBeat.o(102512);
          paramInt = i;
          break;
        case 2:
          localboy.wlF = locala.BTU.readString();
          AppMethodBeat.o(102512);
          paramInt = i;
          break;
        case 3:
          localboy.wfK = locala.BTU.readString();
          AppMethodBeat.o(102512);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102512);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.boy
 * JD-Core Version:    0.6.2
 */