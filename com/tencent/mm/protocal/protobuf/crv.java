package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crv extends com.tencent.mm.bt.a
{
  public String mZW;
  public String ndG;
  public String wOs;
  public String xpu;
  public String xpv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28707);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wOs != null)
        paramArrayOfObject.e(1, this.wOs);
      if (this.xpu != null)
        paramArrayOfObject.e(2, this.xpu);
      if (this.ndG != null)
        paramArrayOfObject.e(3, this.ndG);
      if (this.mZW != null)
        paramArrayOfObject.e(4, this.mZW);
      if (this.xpv != null)
        paramArrayOfObject.e(5, this.xpv);
      AppMethodBeat.o(28707);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wOs == null)
        break label494;
    label494: for (i = e.a.a.b.b.a.f(1, this.wOs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xpu != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xpu);
      i = paramInt;
      if (this.ndG != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndG);
      paramInt = i;
      if (this.mZW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mZW);
      i = paramInt;
      if (this.xpv != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.xpv);
      AppMethodBeat.o(28707);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28707);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crv localcrv = (crv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28707);
          break;
        case 1:
          localcrv.wOs = locala.BTU.readString();
          AppMethodBeat.o(28707);
          paramInt = i;
          break;
        case 2:
          localcrv.xpu = locala.BTU.readString();
          AppMethodBeat.o(28707);
          paramInt = i;
          break;
        case 3:
          localcrv.ndG = locala.BTU.readString();
          AppMethodBeat.o(28707);
          paramInt = i;
          break;
        case 4:
          localcrv.mZW = locala.BTU.readString();
          AppMethodBeat.o(28707);
          paramInt = i;
          break;
        case 5:
          localcrv.xpv = locala.BTU.readString();
          AppMethodBeat.o(28707);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28707);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crv
 * JD-Core Version:    0.6.2
 */