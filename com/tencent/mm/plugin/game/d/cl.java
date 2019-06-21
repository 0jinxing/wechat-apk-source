package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cl extends com.tencent.mm.bt.a
{
  public int nda;
  public String ndb;
  public String ndc;
  public boolean ndd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111649);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MediaURL");
        AppMethodBeat.o(111649);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.nda);
      if (this.ndb != null)
        paramArrayOfObject.e(2, this.ndb);
      if (this.ndc != null)
        paramArrayOfObject.e(3, this.ndc);
      paramArrayOfObject.aO(4, this.ndd);
      AppMethodBeat.o(111649);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.nda) + 0;
        paramInt = i;
        if (this.ndb != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ndb);
        i = paramInt;
        if (this.ndc != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ndc);
        paramInt = i + (e.a.a.b.b.a.fv(4) + 1);
        AppMethodBeat.o(111649);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ndc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MediaURL");
          AppMethodBeat.o(111649);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111649);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cl localcl = (cl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111649);
          break;
        case 1:
          localcl.nda = locala.BTU.vd();
          AppMethodBeat.o(111649);
          paramInt = 0;
          break;
        case 2:
          localcl.ndb = locala.BTU.readString();
          AppMethodBeat.o(111649);
          paramInt = 0;
          break;
        case 3:
          localcl.ndc = locala.BTU.readString();
          AppMethodBeat.o(111649);
          paramInt = 0;
          break;
        case 4:
          localcl.ndd = locala.BTU.ehX();
          AppMethodBeat.o(111649);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111649);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cl
 * JD-Core Version:    0.6.2
 */