package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bdt extends com.tencent.mm.bt.a
{
  public String path;
  public int type;
  public String username;
  public int vOP;
  public String wHu;
  public String wHv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96278);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.wHu != null)
        paramArrayOfObject.e(2, this.wHu);
      if (this.wHv != null)
        paramArrayOfObject.e(3, this.wHv);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      paramArrayOfObject.iz(5, this.vOP);
      paramArrayOfObject.iz(6, this.type);
      AppMethodBeat.o(96278);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label510;
    label510: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wHu != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wHu);
      paramInt = i;
      if (this.wHv != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wHv);
      i = paramInt;
      if (this.path != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.path);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vOP) + e.a.a.b.b.a.bs(6, this.type);
      AppMethodBeat.o(96278);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96278);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdt localbdt = (bdt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96278);
          break;
        case 1:
          localbdt.username = locala.BTU.readString();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        case 2:
          localbdt.wHu = locala.BTU.readString();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        case 3:
          localbdt.wHv = locala.BTU.readString();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        case 4:
          localbdt.path = locala.BTU.readString();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        case 5:
          localbdt.vOP = locala.BTU.vd();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        case 6:
          localbdt.type = locala.BTU.vd();
          AppMethodBeat.o(96278);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96278);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdt
 * JD-Core Version:    0.6.2
 */