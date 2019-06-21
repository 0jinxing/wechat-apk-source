package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxy extends com.tencent.mm.bt.a
{
  public String csB;
  public int iCZ;
  public int iDa;
  public int type;
  public String xts;
  public String xtt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96346);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.xts != null)
        paramArrayOfObject.e(3, this.xts);
      if (this.xtt != null)
        paramArrayOfObject.e(4, this.xtt);
      paramArrayOfObject.iz(5, this.iCZ);
      paramArrayOfObject.iz(6, this.iDa);
      AppMethodBeat.o(96346);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.type) + 0;
        int i = paramInt;
        if (this.csB != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.csB);
        paramInt = i;
        if (this.xts != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.xts);
        i = paramInt;
        if (this.xtt != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.xtt);
        paramInt = i + e.a.a.b.b.a.bs(5, this.iCZ) + e.a.a.b.b.a.bs(6, this.iDa);
        AppMethodBeat.o(96346);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96346);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxy localcxy = (cxy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96346);
          break;
        case 1:
          localcxy.type = locala.BTU.vd();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        case 2:
          localcxy.csB = locala.BTU.readString();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        case 3:
          localcxy.xts = locala.BTU.readString();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        case 4:
          localcxy.xtt = locala.BTU.readString();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        case 5:
          localcxy.iCZ = locala.BTU.vd();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        case 6:
          localcxy.iDa = locala.BTU.vd();
          AppMethodBeat.o(96346);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96346);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxy
 * JD-Core Version:    0.6.2
 */