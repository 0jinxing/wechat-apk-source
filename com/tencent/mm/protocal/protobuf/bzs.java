package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzs extends com.tencent.mm.bt.a
{
  public int actionType;
  public String cEh;
  public String cIY;
  public String id;
  public String jcF;
  public String title;
  public String url;
  public long wYN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55701);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.id != null)
        paramArrayOfObject.e(1, this.id);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      paramArrayOfObject.ai(3, this.wYN);
      paramArrayOfObject.iz(4, this.actionType);
      if (this.url != null)
        paramArrayOfObject.e(5, this.url);
      if (this.title != null)
        paramArrayOfObject.e(6, this.title);
      if (this.jcF != null)
        paramArrayOfObject.e(7, this.jcF);
      if (this.cIY != null)
        paramArrayOfObject.e(8, this.cIY);
      AppMethodBeat.o(55701);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.id == null)
        break label644;
    label644: for (paramInt = e.a.a.b.b.a.f(1, this.id) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cEh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cEh);
      i = i + e.a.a.b.b.a.o(3, this.wYN) + e.a.a.b.b.a.bs(4, this.actionType);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.url);
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.title);
      paramInt = i;
      if (this.jcF != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.jcF);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.cIY);
      AppMethodBeat.o(55701);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55701);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzs localbzs = (bzs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55701);
          break;
        case 1:
          localbzs.id = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 2:
          localbzs.cEh = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 3:
          localbzs.wYN = locala.BTU.ve();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 4:
          localbzs.actionType = locala.BTU.vd();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 5:
          localbzs.url = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 6:
          localbzs.title = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 7:
          localbzs.jcF = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        case 8:
          localbzs.cIY = locala.BTU.readString();
          AppMethodBeat.o(55701);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55701);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzs
 * JD-Core Version:    0.6.2
 */