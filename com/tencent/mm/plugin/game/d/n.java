package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Name;
  public String mZW;
  public int mZX;
  public String mZj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111553);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZW != null)
        paramArrayOfObject.e(1, this.mZW);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      if (this.mZj != null)
        paramArrayOfObject.e(4, this.mZj);
      paramArrayOfObject.iz(5, this.mZX);
      AppMethodBeat.o(111553);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZW == null)
        break label463;
    label463: for (paramInt = e.a.a.b.b.a.f(1, this.mZW) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Name);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Desc);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZj);
      paramInt = i + e.a.a.b.b.a.bs(5, this.mZX);
      AppMethodBeat.o(111553);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111553);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111553);
          break;
        case 1:
          localn.mZW = locala.BTU.readString();
          AppMethodBeat.o(111553);
          paramInt = i;
          break;
        case 2:
          localn.Name = locala.BTU.readString();
          AppMethodBeat.o(111553);
          paramInt = i;
          break;
        case 3:
          localn.Desc = locala.BTU.readString();
          AppMethodBeat.o(111553);
          paramInt = i;
          break;
        case 4:
          localn.mZj = locala.BTU.readString();
          AppMethodBeat.o(111553);
          paramInt = i;
          break;
        case 5:
          localn.mZX = locala.BTU.vd();
          AppMethodBeat.o(111553);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111553);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.n
 * JD-Core Version:    0.6.2
 */