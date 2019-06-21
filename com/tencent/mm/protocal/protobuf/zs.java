package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zs extends com.tencent.mm.bt.a
{
  public String Name;
  public long lhy;
  public int wfb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73703);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.lhy);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      paramArrayOfObject.iz(3, this.wfb);
      AppMethodBeat.o(73703);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.lhy) + 0;
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Name);
        paramInt += e.a.a.b.b.a.bs(3, this.wfb);
        AppMethodBeat.o(73703);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73703);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zs localzs = (zs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73703);
          break;
        case 1:
          localzs.lhy = locala.BTU.ve();
          AppMethodBeat.o(73703);
          paramInt = 0;
          break;
        case 2:
          localzs.Name = locala.BTU.readString();
          AppMethodBeat.o(73703);
          paramInt = 0;
          break;
        case 3:
          localzs.wfb = locala.BTU.vd();
          AppMethodBeat.o(73703);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73703);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zs
 * JD-Core Version:    0.6.2
 */