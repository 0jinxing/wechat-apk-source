package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aji extends com.tencent.mm.bt.a
{
  public String iqz;
  public String kKZ;
  public String path;
  public String title;
  public int type;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96227);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kKZ != null)
        paramArrayOfObject.e(1, this.kKZ);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      paramArrayOfObject.iz(3, this.type);
      if (this.iqz != null)
        paramArrayOfObject.e(4, this.iqz);
      if (this.username != null)
        paramArrayOfObject.e(5, this.username);
      if (this.path != null)
        paramArrayOfObject.e(6, this.path);
      AppMethodBeat.o(96227);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kKZ == null)
        break label530;
    label530: for (paramInt = e.a.a.b.b.a.f(1, this.kKZ) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.title);
      paramInt = i + e.a.a.b.b.a.bs(3, this.type);
      i = paramInt;
      if (this.iqz != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.iqz);
      paramInt = i;
      if (this.username != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.username);
      i = paramInt;
      if (this.path != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.path);
      AppMethodBeat.o(96227);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96227);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aji localaji = (aji)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96227);
          break;
        case 1:
          localaji.kKZ = locala.BTU.readString();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        case 2:
          localaji.title = locala.BTU.readString();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        case 3:
          localaji.type = locala.BTU.vd();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        case 4:
          localaji.iqz = locala.BTU.readString();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        case 5:
          localaji.username = locala.BTU.readString();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        case 6:
          localaji.path = locala.BTU.readString();
          AppMethodBeat.o(96227);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96227);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aji
 * JD-Core Version:    0.6.2
 */