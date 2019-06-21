package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class btx extends com.tencent.mm.bt.a
{
  public int jBv;
  public String wOG;
  public String wOH;
  public String wrm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56962);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wrm != null)
        paramArrayOfObject.e(1, this.wrm);
      if (this.wOH != null)
        paramArrayOfObject.e(2, this.wOH);
      paramArrayOfObject.iz(3, this.jBv);
      if (this.wOG != null)
        paramArrayOfObject.e(4, this.wOG);
      AppMethodBeat.o(56962);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wrm == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.wrm) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wOH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wOH);
      i += e.a.a.b.b.a.bs(3, this.jBv);
      paramInt = i;
      if (this.wOG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wOG);
      AppMethodBeat.o(56962);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56962);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        btx localbtx = (btx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56962);
          break;
        case 1:
          localbtx.wrm = locala.BTU.readString();
          AppMethodBeat.o(56962);
          paramInt = i;
          break;
        case 2:
          localbtx.wOH = locala.BTU.readString();
          AppMethodBeat.o(56962);
          paramInt = i;
          break;
        case 3:
          localbtx.jBv = locala.BTU.vd();
          AppMethodBeat.o(56962);
          paramInt = i;
          break;
        case 4:
          localbtx.wOG = locala.BTU.readString();
          AppMethodBeat.o(56962);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56962);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btx
 * JD-Core Version:    0.6.2
 */