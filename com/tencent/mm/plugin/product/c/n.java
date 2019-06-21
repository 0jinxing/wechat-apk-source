package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends com.tencent.mm.bt.a
{
  public int bJt;
  public String csB;
  public String name;
  public String pia;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56639);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.pia != null)
        paramArrayOfObject.e(3, this.pia);
      if (this.username != null)
        paramArrayOfObject.e(4, this.username);
      paramArrayOfObject.iz(5, this.bJt);
      AppMethodBeat.o(56639);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label463;
    label463: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.name);
      paramInt = i;
      if (this.pia != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pia);
      i = paramInt;
      if (this.username != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.username);
      paramInt = i + e.a.a.b.b.a.bs(5, this.bJt);
      AppMethodBeat.o(56639);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56639);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56639);
          break;
        case 1:
          localn.csB = locala.BTU.readString();
          AppMethodBeat.o(56639);
          paramInt = i;
          break;
        case 2:
          localn.name = locala.BTU.readString();
          AppMethodBeat.o(56639);
          paramInt = i;
          break;
        case 3:
          localn.pia = locala.BTU.readString();
          AppMethodBeat.o(56639);
          paramInt = i;
          break;
        case 4:
          localn.username = locala.BTU.readString();
          AppMethodBeat.o(56639);
          paramInt = i;
          break;
        case 5:
          localn.bJt = locala.BTU.vd();
          AppMethodBeat.o(56639);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56639);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.n
 * JD-Core Version:    0.6.2
 */