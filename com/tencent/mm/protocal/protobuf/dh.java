package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dh extends com.tencent.mm.bt.a
{
  public String mac;
  public String ssid;
  public int vFl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28310);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mac != null)
        paramArrayOfObject.e(1, this.mac);
      paramArrayOfObject.iz(2, this.vFl);
      if (this.ssid != null)
        paramArrayOfObject.e(3, this.ssid);
      AppMethodBeat.o(28310);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mac == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.mac) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vFl);
      paramInt = i;
      if (this.ssid != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ssid);
      AppMethodBeat.o(28310);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28310);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dh localdh = (dh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28310);
          break;
        case 1:
          localdh.mac = locala.BTU.readString();
          AppMethodBeat.o(28310);
          paramInt = i;
          break;
        case 2:
          localdh.vFl = locala.BTU.vd();
          AppMethodBeat.o(28310);
          paramInt = i;
          break;
        case 3:
          localdh.ssid = locala.BTU.readString();
          AppMethodBeat.o(28310);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28310);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dh
 * JD-Core Version:    0.6.2
 */