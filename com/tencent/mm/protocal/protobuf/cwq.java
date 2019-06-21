package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class cwq extends com.tencent.mm.bt.a
{
  public String username;
  public int vOO;
  public int vWx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96329);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.vWx);
      paramArrayOfObject.iz(3, this.vOO);
      AppMethodBeat.o(96329);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vWx) + e.a.a.b.b.a.bs(3, this.vOO);
      AppMethodBeat.o(96329);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96329);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwq localcwq = (cwq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96329);
          break;
        case 1:
          localcwq.username = locala.BTU.readString();
          AppMethodBeat.o(96329);
          paramInt = i;
          break;
        case 2:
          localcwq.vWx = locala.BTU.vd();
          AppMethodBeat.o(96329);
          paramInt = i;
          break;
        case 3:
          localcwq.vOO = locala.BTU.vd();
          AppMethodBeat.o(96329);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96329);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwq
 * JD-Core Version:    0.6.2
 */