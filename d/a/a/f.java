package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends com.tencent.mm.bt.a
{
  public String wMk;
  public String wMl;
  public int wMm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57011);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wMk != null)
        paramArrayOfObject.e(1, this.wMk);
      if (this.wMl != null)
        paramArrayOfObject.e(2, this.wMl);
      paramArrayOfObject.iz(3, this.wMm);
      AppMethodBeat.o(57011);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wMk == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wMk) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wMl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wMl);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wMm);
      AppMethodBeat.o(57011);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57011);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57011);
          break;
        case 1:
          localf.wMk = locala.BTU.readString();
          AppMethodBeat.o(57011);
          paramInt = i;
          break;
        case 2:
          localf.wMl = locala.BTU.readString();
          AppMethodBeat.o(57011);
          paramInt = i;
          break;
        case 3:
          localf.wMm = locala.BTU.vd();
          AppMethodBeat.o(57011);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57011);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     d.a.a.f
 * JD-Core Version:    0.6.2
 */