package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aza extends com.tencent.mm.bt.a
{
  public String devicename;
  public String devicetype;
  public String eCq;
  public int wCN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73737);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.eCq != null)
        paramArrayOfObject.e(1, this.eCq);
      if (this.devicename != null)
        paramArrayOfObject.e(2, this.devicename);
      if (this.devicetype != null)
        paramArrayOfObject.e(3, this.devicetype);
      paramArrayOfObject.iz(4, this.wCN);
      AppMethodBeat.o(73737);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.eCq == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.eCq) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.devicename != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.devicename);
      i = paramInt;
      if (this.devicetype != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.devicetype);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wCN);
      AppMethodBeat.o(73737);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73737);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aza localaza = (aza)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73737);
          break;
        case 1:
          localaza.eCq = locala.BTU.readString();
          AppMethodBeat.o(73737);
          paramInt = i;
          break;
        case 2:
          localaza.devicename = locala.BTU.readString();
          AppMethodBeat.o(73737);
          paramInt = i;
          break;
        case 3:
          localaza.devicetype = locala.BTU.readString();
          AppMethodBeat.o(73737);
          paramInt = i;
          break;
        case 4:
          localaza.wCN = locala.BTU.vd();
          AppMethodBeat.o(73737);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73737);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aza
 * JD-Core Version:    0.6.2
 */