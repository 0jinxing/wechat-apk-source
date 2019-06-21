package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gl extends com.tencent.mm.bt.a
{
  public int cyE;
  public String data;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114950);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.data != null)
        paramArrayOfObject.e(2, this.data);
      paramArrayOfObject.iz(3, this.cyE);
      AppMethodBeat.o(114950);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.data != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.data);
      paramInt = i + e.a.a.b.b.a.bs(3, this.cyE);
      AppMethodBeat.o(114950);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114950);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gl localgl = (gl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114950);
          break;
        case 1:
          localgl.username = locala.BTU.readString();
          AppMethodBeat.o(114950);
          paramInt = i;
          break;
        case 2:
          localgl.data = locala.BTU.readString();
          AppMethodBeat.o(114950);
          paramInt = i;
          break;
        case 3:
          localgl.cyE = locala.BTU.vd();
          AppMethodBeat.o(114950);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114950);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gl
 * JD-Core Version:    0.6.2
 */