package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class er extends com.tencent.mm.bt.a
{
  public int Scene;
  public String Url;
  public String vGA;
  public int vGB;
  public long vGy;
  public int vGz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Url != null)
        paramArrayOfObject.e(1, this.Url);
      paramArrayOfObject.ai(2, this.vGy);
      paramArrayOfObject.iz(3, this.vGz);
      if (this.vGA != null)
        paramArrayOfObject.e(4, this.vGA);
      paramArrayOfObject.iz(5, this.Scene);
      paramArrayOfObject.iz(6, this.vGB);
      AppMethodBeat.o(14702);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Url == null)
        break label490;
    label490: for (paramInt = e.a.a.b.b.a.f(1, this.Url) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.vGy) + e.a.a.b.b.a.bs(3, this.vGz);
      paramInt = i;
      if (this.vGA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vGA);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.Scene) + e.a.a.b.b.a.bs(6, this.vGB);
      AppMethodBeat.o(14702);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14702);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        er localer = (er)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14702);
          break;
        case 1:
          localer.Url = locala.BTU.readString();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        case 2:
          localer.vGy = locala.BTU.ve();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        case 3:
          localer.vGz = locala.BTU.vd();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        case 4:
          localer.vGA = locala.BTU.readString();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        case 5:
          localer.Scene = locala.BTU.vd();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        case 6:
          localer.vGB = locala.BTU.vd();
          AppMethodBeat.o(14702);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14702);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.er
 * JD-Core Version:    0.6.2
 */