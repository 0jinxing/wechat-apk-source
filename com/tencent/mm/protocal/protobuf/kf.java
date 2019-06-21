package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class kf extends com.tencent.mm.bt.a
{
  public String kfT;
  public String vNc;
  public int ver;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNc != null)
        paramArrayOfObject.e(1, this.vNc);
      if (this.kfT != null)
        paramArrayOfObject.e(2, this.kfT);
      paramArrayOfObject.iz(3, this.ver);
      AppMethodBeat.o(11702);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNc == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.vNc) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kfT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kfT);
      paramInt = i + e.a.a.b.b.a.bs(3, this.ver);
      AppMethodBeat.o(11702);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11702);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        kf localkf = (kf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11702);
          break;
        case 1:
          localkf.vNc = locala.BTU.readString();
          AppMethodBeat.o(11702);
          paramInt = i;
          break;
        case 2:
          localkf.kfT = locala.BTU.readString();
          AppMethodBeat.o(11702);
          paramInt = i;
          break;
        case 3:
          localkf.ver = locala.BTU.vd();
          AppMethodBeat.o(11702);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11702);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kf
 * JD-Core Version:    0.6.2
 */