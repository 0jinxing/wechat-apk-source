package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cjk extends com.tencent.mm.bt.a
{
  public String content;
  public int kCl;
  public int state;
  public String wYm;
  public int wYq;
  public String wYs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114992);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wYs != null)
        paramArrayOfObject.e(1, this.wYs);
      paramArrayOfObject.iz(2, this.kCl);
      if (this.content != null)
        paramArrayOfObject.e(3, this.content);
      if (this.wYm != null)
        paramArrayOfObject.e(4, this.wYm);
      paramArrayOfObject.iz(5, this.wYq);
      paramArrayOfObject.iz(6, this.state);
      AppMethodBeat.o(114992);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wYs == null)
        break label494;
    label494: for (paramInt = e.a.a.b.b.a.f(1, this.wYs) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.content);
      i = paramInt;
      if (this.wYm != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wYm);
      paramInt = i + e.a.a.b.b.a.bs(5, this.wYq) + e.a.a.b.b.a.bs(6, this.state);
      AppMethodBeat.o(114992);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114992);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cjk localcjk = (cjk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114992);
          break;
        case 1:
          localcjk.wYs = locala.BTU.readString();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        case 2:
          localcjk.kCl = locala.BTU.vd();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        case 3:
          localcjk.content = locala.BTU.readString();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        case 4:
          localcjk.wYm = locala.BTU.readString();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        case 5:
          localcjk.wYq = locala.BTU.vd();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        case 6:
          localcjk.state = locala.BTU.vd();
          AppMethodBeat.o(114992);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114992);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjk
 * JD-Core Version:    0.6.2
 */