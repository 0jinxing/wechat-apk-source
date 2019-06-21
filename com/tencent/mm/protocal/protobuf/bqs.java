package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bqs extends com.tencent.mm.bt.a
{
  public String csB;
  public String path;
  public String tff;
  public int type;
  public String wTe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56957);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.wTe != null)
        paramArrayOfObject.e(3, this.wTe);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      if (this.tff != null)
        paramArrayOfObject.e(5, this.tff);
      AppMethodBeat.o(56957);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.csB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.csB);
        i = paramInt;
        if (this.wTe != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wTe);
        paramInt = i;
        if (this.path != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.path);
        i = paramInt;
        if (this.tff != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.tff);
        AppMethodBeat.o(56957);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56957);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bqs localbqs = (bqs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56957);
          break;
        case 1:
          localbqs.type = locala.BTU.vd();
          AppMethodBeat.o(56957);
          paramInt = 0;
          break;
        case 2:
          localbqs.csB = locala.BTU.readString();
          AppMethodBeat.o(56957);
          paramInt = 0;
          break;
        case 3:
          localbqs.wTe = locala.BTU.readString();
          AppMethodBeat.o(56957);
          paramInt = 0;
          break;
        case 4:
          localbqs.path = locala.BTU.readString();
          AppMethodBeat.o(56957);
          paramInt = 0;
          break;
        case 5:
          localbqs.tff = locala.BTU.readString();
          AppMethodBeat.o(56957);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56957);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqs
 * JD-Core Version:    0.6.2
 */