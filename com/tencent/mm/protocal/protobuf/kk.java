package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class kk extends com.tencent.mm.bt.a
{
  public String kfT;
  public String vMW;
  public int vMX;
  public String vNa;
  public String vNc;
  public String vNk;
  public int ver;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11709);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNc != null)
        paramArrayOfObject.e(1, this.vNc);
      if (this.kfT != null)
        paramArrayOfObject.e(2, this.kfT);
      paramArrayOfObject.iz(3, this.ver);
      if (this.vMW != null)
        paramArrayOfObject.e(4, this.vMW);
      if (this.vNk != null)
        paramArrayOfObject.e(5, this.vNk);
      paramArrayOfObject.iz(6, this.vMX);
      if (this.vNa != null)
        paramArrayOfObject.e(7, this.vNa);
      AppMethodBeat.o(11709);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNc == null)
        break label590;
    label590: for (paramInt = e.a.a.b.b.a.f(1, this.vNc) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kfT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kfT);
      i += e.a.a.b.b.a.bs(3, this.ver);
      paramInt = i;
      if (this.vMW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vMW);
      i = paramInt;
      if (this.vNk != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vNk);
      i += e.a.a.b.b.a.bs(6, this.vMX);
      paramInt = i;
      if (this.vNa != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vNa);
      AppMethodBeat.o(11709);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11709);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        kk localkk = (kk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11709);
          break;
        case 1:
          localkk.vNc = locala.BTU.readString();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 2:
          localkk.kfT = locala.BTU.readString();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 3:
          localkk.ver = locala.BTU.vd();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 4:
          localkk.vMW = locala.BTU.readString();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 5:
          localkk.vNk = locala.BTU.readString();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 6:
          localkk.vMX = locala.BTU.vd();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        case 7:
          localkk.vNa = locala.BTU.readString();
          AppMethodBeat.o(11709);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kk
 * JD-Core Version:    0.6.2
 */