package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class hj extends com.tencent.mm.bt.a
{
  public String imei;
  public String vJX;
  public String vJY;
  public String vJZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2536);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.imei != null)
        paramArrayOfObject.e(1, this.imei);
      if (this.vJX != null)
        paramArrayOfObject.e(2, this.vJX);
      if (this.vJY != null)
        paramArrayOfObject.e(3, this.vJY);
      if (this.vJZ != null)
        paramArrayOfObject.e(4, this.vJZ);
      AppMethodBeat.o(2536);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.imei == null)
        break label426;
    label426: for (i = e.a.a.b.b.a.f(1, this.imei) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vJX != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vJX);
      i = paramInt;
      if (this.vJY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vJY);
      paramInt = i;
      if (this.vJZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vJZ);
      AppMethodBeat.o(2536);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2536);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hj localhj = (hj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2536);
          break;
        case 1:
          localhj.imei = locala.BTU.readString();
          AppMethodBeat.o(2536);
          paramInt = i;
          break;
        case 2:
          localhj.vJX = locala.BTU.readString();
          AppMethodBeat.o(2536);
          paramInt = i;
          break;
        case 3:
          localhj.vJY = locala.BTU.readString();
          AppMethodBeat.o(2536);
          paramInt = i;
          break;
        case 4:
          localhj.vJZ = locala.BTU.readString();
          AppMethodBeat.o(2536);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2536);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hj
 * JD-Core Version:    0.6.2
 */