package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bak extends com.tencent.mm.bt.a
{
  public String bssid;
  public int cyC;
  public String ssid;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28546);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ssid != null)
        paramArrayOfObject.e(1, this.ssid);
      if (this.bssid != null)
        paramArrayOfObject.e(2, this.bssid);
      paramArrayOfObject.iz(3, this.cyC);
      AppMethodBeat.o(28546);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ssid == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.ssid) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.bssid != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.bssid);
      paramInt = i + e.a.a.b.b.a.bs(3, this.cyC);
      AppMethodBeat.o(28546);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28546);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bak localbak = (bak)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28546);
          break;
        case 1:
          localbak.ssid = locala.BTU.readString();
          AppMethodBeat.o(28546);
          paramInt = i;
          break;
        case 2:
          localbak.bssid = locala.BTU.readString();
          AppMethodBeat.o(28546);
          paramInt = i;
          break;
        case 3:
          localbak.cyC = locala.BTU.vd();
          AppMethodBeat.o(28546);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28546);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bak
 * JD-Core Version:    0.6.2
 */