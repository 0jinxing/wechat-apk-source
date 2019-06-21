package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class auj extends com.tencent.mm.bt.a
{
  public float height;
  public String url;
  public String vJS;
  public float width;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48875);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      if (this.vJS != null)
        paramArrayOfObject.e(2, this.vJS);
      paramArrayOfObject.r(3, this.width);
      paramArrayOfObject.r(4, this.height);
      AppMethodBeat.o(48875);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label386;
    label386: for (paramInt = e.a.a.b.b.a.f(1, this.url) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vJS != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vJS);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4);
      AppMethodBeat.o(48875);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48875);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        auj localauj = (auj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48875);
          break;
        case 1:
          localauj.url = locala.BTU.readString();
          AppMethodBeat.o(48875);
          paramInt = i;
          break;
        case 2:
          localauj.vJS = locala.BTU.readString();
          AppMethodBeat.o(48875);
          paramInt = i;
          break;
        case 3:
          localauj.width = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48875);
          paramInt = i;
          break;
        case 4:
          localauj.height = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(48875);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48875);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.auj
 * JD-Core Version:    0.6.2
 */