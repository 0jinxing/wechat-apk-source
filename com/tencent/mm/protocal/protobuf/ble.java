package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ble extends com.tencent.mm.bt.a
{
  public String path;
  public String query;
  public int scene;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114981);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.path != null)
        paramArrayOfObject.e(1, this.path);
      if (this.query != null)
        paramArrayOfObject.e(2, this.query);
      paramArrayOfObject.iz(3, this.scene);
      AppMethodBeat.o(114981);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.path == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.path) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.query != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.query);
      paramInt = i + e.a.a.b.b.a.bs(3, this.scene);
      AppMethodBeat.o(114981);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114981);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ble localble = (ble)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114981);
          break;
        case 1:
          localble.path = locala.BTU.readString();
          AppMethodBeat.o(114981);
          paramInt = i;
          break;
        case 2:
          localble.query = locala.BTU.readString();
          AppMethodBeat.o(114981);
          paramInt = i;
          break;
        case 3:
          localble.scene = locala.BTU.vd();
          AppMethodBeat.o(114981);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114981);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ble
 * JD-Core Version:    0.6.2
 */