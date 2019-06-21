package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzj extends com.tencent.mm.bt.a
{
  public String content;
  public int state;
  public String wYm;
  public String wYn;
  public String wYo;
  public String wYp;
  public int wYq;
  public String wYr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114986);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.content != null)
        paramArrayOfObject.e(1, this.content);
      if (this.wYm != null)
        paramArrayOfObject.e(2, this.wYm);
      if (this.wYn != null)
        paramArrayOfObject.e(3, this.wYn);
      if (this.wYo != null)
        paramArrayOfObject.e(4, this.wYo);
      if (this.wYp != null)
        paramArrayOfObject.e(5, this.wYp);
      paramArrayOfObject.iz(6, this.wYq);
      paramArrayOfObject.iz(7, this.state);
      if (this.wYr != null)
        paramArrayOfObject.e(8, this.wYr);
      AppMethodBeat.o(114986);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.content == null)
        break label640;
    label640: for (i = e.a.a.b.b.a.f(1, this.content) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wYm != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wYm);
      i = paramInt;
      if (this.wYn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wYn);
      paramInt = i;
      if (this.wYo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wYo);
      i = paramInt;
      if (this.wYp != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wYp);
      i = i + e.a.a.b.b.a.bs(6, this.wYq) + e.a.a.b.b.a.bs(7, this.state);
      paramInt = i;
      if (this.wYr != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wYr);
      AppMethodBeat.o(114986);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114986);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzj localbzj = (bzj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114986);
          break;
        case 1:
          localbzj.content = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 2:
          localbzj.wYm = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 3:
          localbzj.wYn = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 4:
          localbzj.wYo = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 5:
          localbzj.wYp = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 6:
          localbzj.wYq = locala.BTU.vd();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 7:
          localbzj.state = locala.BTU.vd();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        case 8:
          localbzj.wYr = locala.BTU.readString();
          AppMethodBeat.o(114986);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114986);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzj
 * JD-Core Version:    0.6.2
 */