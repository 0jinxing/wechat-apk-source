package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bal extends com.tencent.mm.bt.a
{
  public String bssid;
  public String cuH;
  public int cyC;
  public int mue;
  public String ssid;
  public int wEh;
  public String wEi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28547);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ssid != null)
        paramArrayOfObject.e(1, this.ssid);
      if (this.bssid != null)
        paramArrayOfObject.e(2, this.bssid);
      paramArrayOfObject.iz(3, this.cyC);
      paramArrayOfObject.iz(4, this.wEh);
      if (this.wEi != null)
        paramArrayOfObject.e(5, this.wEi);
      if (this.cuH != null)
        paramArrayOfObject.e(6, this.cuH);
      paramArrayOfObject.iz(7, this.mue);
      AppMethodBeat.o(28547);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ssid == null)
        break label574;
    label574: for (paramInt = e.a.a.b.b.a.f(1, this.ssid) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.bssid != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.bssid);
      i = i + e.a.a.b.b.a.bs(3, this.cyC) + e.a.a.b.b.a.bs(4, this.wEh);
      paramInt = i;
      if (this.wEi != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wEi);
      i = paramInt;
      if (this.cuH != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.cuH);
      paramInt = i + e.a.a.b.b.a.bs(7, this.mue);
      AppMethodBeat.o(28547);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28547);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bal localbal = (bal)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28547);
          break;
        case 1:
          localbal.ssid = locala.BTU.readString();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 2:
          localbal.bssid = locala.BTU.readString();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 3:
          localbal.cyC = locala.BTU.vd();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 4:
          localbal.wEh = locala.BTU.vd();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 5:
          localbal.wEi = locala.BTU.readString();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 6:
          localbal.cuH = locala.BTU.readString();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        case 7:
          localbal.mue = locala.BTU.vd();
          AppMethodBeat.o(28547);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28547);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bal
 * JD-Core Version:    0.6.2
 */