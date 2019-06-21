package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ew extends com.tencent.mm.bt.a
{
  public int height;
  public String url;
  public int vGK;
  public int vGL;
  public long vGM;
  public int vGN;
  public int width;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14706);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      paramArrayOfObject.iz(2, this.vGK);
      paramArrayOfObject.iz(3, this.vGL);
      paramArrayOfObject.ai(4, this.vGM);
      paramArrayOfObject.iz(5, this.width);
      paramArrayOfObject.iz(6, this.height);
      paramArrayOfObject.iz(10, this.vGN);
      AppMethodBeat.o(14706);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label530;
    label530: for (paramInt = e.a.a.b.b.a.f(1, this.url) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vGK) + e.a.a.b.b.a.bs(3, this.vGL) + e.a.a.b.b.a.o(4, this.vGM) + e.a.a.b.b.a.bs(5, this.width) + e.a.a.b.b.a.bs(6, this.height) + e.a.a.b.b.a.bs(10, this.vGN);
      AppMethodBeat.o(14706);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14706);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ew localew = (ew)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 7:
        case 8:
        case 9:
        default:
          paramInt = -1;
          AppMethodBeat.o(14706);
          break;
        case 1:
          localew.url = locala.BTU.readString();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 2:
          localew.vGK = locala.BTU.vd();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 3:
          localew.vGL = locala.BTU.vd();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 4:
          localew.vGM = locala.BTU.ve();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 5:
          localew.width = locala.BTU.vd();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 6:
          localew.height = locala.BTU.vd();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        case 10:
          localew.vGN = locala.BTU.vd();
          AppMethodBeat.o(14706);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14706);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ew
 * JD-Core Version:    0.6.2
 */