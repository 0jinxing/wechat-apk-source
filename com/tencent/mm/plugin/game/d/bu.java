package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bu extends com.tencent.mm.bt.a
{
  public String desc;
  public String ffv;
  public String kLe;
  public String ncD;
  public String title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111627);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.ffv != null)
        paramArrayOfObject.e(2, this.ffv);
      if (this.kLe != null)
        paramArrayOfObject.e(3, this.kLe);
      if (this.desc != null)
        paramArrayOfObject.e(4, this.desc);
      if (this.ncD != null)
        paramArrayOfObject.e(5, this.ncD);
      AppMethodBeat.o(111627);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label479;
    label479: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ffv != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ffv);
      paramInt = i;
      if (this.kLe != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kLe);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.desc);
      paramInt = i;
      if (this.ncD != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ncD);
      AppMethodBeat.o(111627);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111627);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bu localbu = (bu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111627);
          break;
        case 1:
          localbu.title = locala.BTU.readString();
          AppMethodBeat.o(111627);
          paramInt = i;
          break;
        case 2:
          localbu.ffv = locala.BTU.readString();
          AppMethodBeat.o(111627);
          paramInt = i;
          break;
        case 3:
          localbu.kLe = locala.BTU.readString();
          AppMethodBeat.o(111627);
          paramInt = i;
          break;
        case 4:
          localbu.desc = locala.BTU.readString();
          AppMethodBeat.o(111627);
          paramInt = i;
          break;
        case 5:
          localbu.ncD = locala.BTU.readString();
          AppMethodBeat.o(111627);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111627);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bu
 * JD-Core Version:    0.6.2
 */