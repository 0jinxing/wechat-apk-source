package com.tencent.mm.plugin.address.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends com.tencent.mm.bt.a
{
  public String gIZ;
  public String gJa;
  public String gJb;
  public String gJc;
  public String gJd;
  public String gJe;
  public String gJf;
  public String gJg;
  public String gJh;
  public int id;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(16786);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.gIZ != null)
        paramArrayOfObject.e(2, this.gIZ);
      if (this.gJa != null)
        paramArrayOfObject.e(3, this.gJa);
      if (this.gJb != null)
        paramArrayOfObject.e(4, this.gJb);
      if (this.gJc != null)
        paramArrayOfObject.e(5, this.gJc);
      if (this.gJd != null)
        paramArrayOfObject.e(6, this.gJd);
      if (this.gJe != null)
        paramArrayOfObject.e(7, this.gJe);
      if (this.gJf != null)
        paramArrayOfObject.e(8, this.gJf);
      if (this.gJg != null)
        paramArrayOfObject.e(9, this.gJg);
      if (this.gJh != null)
        paramArrayOfObject.e(10, this.gJh);
      AppMethodBeat.o(16786);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.id) + 0;
        int i = paramInt;
        if (this.gIZ != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.gIZ);
        paramInt = i;
        if (this.gJa != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.gJa);
        i = paramInt;
        if (this.gJb != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.gJb);
        paramInt = i;
        if (this.gJc != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.gJc);
        i = paramInt;
        if (this.gJd != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.gJd);
        paramInt = i;
        if (this.gJe != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.gJe);
        i = paramInt;
        if (this.gJf != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.gJf);
        paramInt = i;
        if (this.gJg != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.gJg);
        i = paramInt;
        if (this.gJh != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.gJh);
        AppMethodBeat.o(16786);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(16786);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(16786);
          break;
        case 1:
          localb.id = locala.BTU.vd();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 2:
          localb.gIZ = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 3:
          localb.gJa = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 4:
          localb.gJb = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 5:
          localb.gJc = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 6:
          localb.gJd = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 7:
          localb.gJe = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 8:
          localb.gJf = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 9:
          localb.gJg = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        case 10:
          localb.gJh = locala.BTU.readString();
          AppMethodBeat.o(16786);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(16786);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.d.b
 * JD-Core Version:    0.6.2
 */