package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class to extends com.tencent.mm.bt.a
{
  public int count;
  public int scene;
  public int vGr;
  public String vGs;
  public int waF;
  public int waG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14723);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vGs != null)
        paramArrayOfObject.e(1, this.vGs);
      paramArrayOfObject.iz(2, this.vGr);
      paramArrayOfObject.iz(3, this.waF);
      paramArrayOfObject.iz(4, this.waG);
      paramArrayOfObject.iz(5, this.scene);
      paramArrayOfObject.iz(6, this.count);
      AppMethodBeat.o(14723);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vGs == null)
        break label470;
    label470: for (paramInt = e.a.a.b.b.a.f(1, this.vGs) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vGr) + e.a.a.b.b.a.bs(3, this.waF) + e.a.a.b.b.a.bs(4, this.waG) + e.a.a.b.b.a.bs(5, this.scene) + e.a.a.b.b.a.bs(6, this.count);
      AppMethodBeat.o(14723);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14723);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        to localto = (to)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14723);
          break;
        case 1:
          localto.vGs = locala.BTU.readString();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        case 2:
          localto.vGr = locala.BTU.vd();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        case 3:
          localto.waF = locala.BTU.vd();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        case 4:
          localto.waG = locala.BTU.vd();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        case 5:
          localto.scene = locala.BTU.vd();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        case 6:
          localto.count = locala.BTU.vd();
          AppMethodBeat.o(14723);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14723);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.to
 * JD-Core Version:    0.6.2
 */