package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bid extends com.tencent.mm.bt.a
{
  public String app_id;
  public String kmr;
  public String kmt;
  public String tyv;
  public String wLu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48915);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.app_id != null)
        paramArrayOfObject.e(1, this.app_id);
      if (this.tyv != null)
        paramArrayOfObject.e(2, this.tyv);
      if (this.kmt != null)
        paramArrayOfObject.e(3, this.kmt);
      if (this.kmr != null)
        paramArrayOfObject.e(4, this.kmr);
      if (this.wLu != null)
        paramArrayOfObject.e(5, this.wLu);
      AppMethodBeat.o(48915);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.app_id == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.app_id) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.tyv != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.tyv);
      i = paramInt;
      if (this.kmt != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kmt);
      paramInt = i;
      if (this.kmr != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kmr);
      i = paramInt;
      if (this.wLu != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wLu);
      AppMethodBeat.o(48915);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48915);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bid localbid = (bid)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48915);
          break;
        case 1:
          localbid.app_id = locala.BTU.readString();
          AppMethodBeat.o(48915);
          paramInt = i;
          break;
        case 2:
          localbid.tyv = locala.BTU.readString();
          AppMethodBeat.o(48915);
          paramInt = i;
          break;
        case 3:
          localbid.kmt = locala.BTU.readString();
          AppMethodBeat.o(48915);
          paramInt = i;
          break;
        case 4:
          localbid.kmr = locala.BTU.readString();
          AppMethodBeat.o(48915);
          paramInt = i;
          break;
        case 5:
          localbid.wLu = locala.BTU.readString();
          AppMethodBeat.o(48915);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48915);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bid
 * JD-Core Version:    0.6.2
 */