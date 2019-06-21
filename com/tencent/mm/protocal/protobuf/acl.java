package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class acl extends com.tencent.mm.bt.a
{
  public int cyE;
  public String id;
  public int mwG;
  public String wkh;
  public long wki;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28409);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.id != null)
        paramArrayOfObject.e(1, this.id);
      paramArrayOfObject.iz(2, this.mwG);
      if (this.wkh != null)
        paramArrayOfObject.e(3, this.wkh);
      paramArrayOfObject.ai(4, this.wki);
      paramArrayOfObject.iz(5, this.cyE);
      AppMethodBeat.o(28409);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.id == null)
        break label442;
    label442: for (paramInt = e.a.a.b.b.a.f(1, this.id) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.mwG);
      paramInt = i;
      if (this.wkh != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wkh);
      paramInt = paramInt + e.a.a.b.b.a.o(4, this.wki) + e.a.a.b.b.a.bs(5, this.cyE);
      AppMethodBeat.o(28409);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28409);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acl localacl = (acl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28409);
          break;
        case 1:
          localacl.id = locala.BTU.readString();
          AppMethodBeat.o(28409);
          paramInt = i;
          break;
        case 2:
          localacl.mwG = locala.BTU.vd();
          AppMethodBeat.o(28409);
          paramInt = i;
          break;
        case 3:
          localacl.wkh = locala.BTU.readString();
          AppMethodBeat.o(28409);
          paramInt = i;
          break;
        case 4:
          localacl.wki = locala.BTU.ve();
          AppMethodBeat.o(28409);
          paramInt = i;
          break;
        case 5:
          localacl.cyE = locala.BTU.vd();
          AppMethodBeat.o(28409);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28409);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acl
 * JD-Core Version:    0.6.2
 */