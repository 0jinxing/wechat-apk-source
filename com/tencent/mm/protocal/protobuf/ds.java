package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ds extends com.tencent.mm.bt.a
{
  public String Id;
  public String jCh;
  public String ncH;
  public String vFw;
  public String vFx;
  public int vFy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94507);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Id != null)
        paramArrayOfObject.e(1, this.Id);
      if (this.jCh != null)
        paramArrayOfObject.e(2, this.jCh);
      if (this.ncH != null)
        paramArrayOfObject.e(3, this.ncH);
      if (this.vFw != null)
        paramArrayOfObject.e(4, this.vFw);
      if (this.vFx != null)
        paramArrayOfObject.e(5, this.vFx);
      paramArrayOfObject.iz(6, this.vFy);
      AppMethodBeat.o(94507);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Id == null)
        break label530;
    label530: for (paramInt = e.a.a.b.b.a.f(1, this.Id) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCh);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ncH);
      i = paramInt;
      if (this.vFw != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vFw);
      paramInt = i;
      if (this.vFx != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vFx);
      paramInt += e.a.a.b.b.a.bs(6, this.vFy);
      AppMethodBeat.o(94507);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94507);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ds localds = (ds)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94507);
          break;
        case 1:
          localds.Id = locala.BTU.readString();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        case 2:
          localds.jCh = locala.BTU.readString();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        case 3:
          localds.ncH = locala.BTU.readString();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        case 4:
          localds.vFw = locala.BTU.readString();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        case 5:
          localds.vFx = locala.BTU.readString();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        case 6:
          localds.vFy = locala.BTU.vd();
          AppMethodBeat.o(94507);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94507);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ds
 * JD-Core Version:    0.6.2
 */