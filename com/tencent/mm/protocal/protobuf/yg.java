package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class yg extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String Name;
  public String wdY;
  public int wdZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62531);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      if (this.wdY != null)
        paramArrayOfObject.e(3, this.wdY);
      paramArrayOfObject.iz(4, this.wdZ);
      AppMethodBeat.o(62531);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.Name) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.IconUrl);
      i = paramInt;
      if (this.wdY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wdY);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wdZ);
      AppMethodBeat.o(62531);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62531);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        yg localyg = (yg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62531);
          break;
        case 1:
          localyg.Name = locala.BTU.readString();
          AppMethodBeat.o(62531);
          paramInt = i;
          break;
        case 2:
          localyg.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(62531);
          paramInt = i;
          break;
        case 3:
          localyg.wdY = locala.BTU.readString();
          AppMethodBeat.o(62531);
          paramInt = i;
          break;
        case 4:
          localyg.wdZ = locala.BTU.vd();
          AppMethodBeat.o(62531);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62531);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yg
 * JD-Core Version:    0.6.2
 */